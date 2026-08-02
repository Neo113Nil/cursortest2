package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.browser.customtabs.g;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import defpackage.da20;
import defpackage.ea20;
import defpackage.x920;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes11.dex */
public class ChromeSafariBrowserManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ChromeBrowserManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_chromesafaribrowser";
    public static final Map<String, ChromeSafariBrowserManager> shared = new HashMap();
    public final Map<String, ChromeCustomTabsActivity> browsers;
    public String id;
    public InAppWebViewFlutterPlugin plugin;

    public ChromeSafariBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new ea20(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.browsers = new HashMap();
        String uuid = UUID.randomUUID().toString();
        this.id = uuid;
        this.plugin = inAppWebViewFlutterPlugin;
        shared.put(uuid, this);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        for (ChromeCustomTabsActivity chromeCustomTabsActivity : this.browsers.values()) {
            if (chromeCustomTabsActivity != null) {
                chromeCustomTabsActivity.close();
                chromeCustomTabsActivity.dispose();
            }
        }
        this.browsers.clear();
        shared.remove(this.id);
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        String str;
        Activity activity;
        str = (String) x920Var.a("id");
        String str2 = x920Var.a;
        str2.getClass();
        switch (str2) {
            case "getMaxToolbarItems":
                da20Var.success(5);
                break;
            case "open":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null && inAppWebViewFlutterPlugin.activity != null) {
                    open(this.plugin.activity, str, (String) x920Var.a("url"), (HashMap) x920Var.a("headers"), (String) x920Var.a("referrer"), (ArrayList) x920Var.a("otherLikelyURLs"), (HashMap) x920Var.a("settings"), (HashMap) x920Var.a("actionButton"), (HashMap) x920Var.a("secondaryToolbar"), (List) x920Var.a("menuItemList"), da20Var);
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
                break;
            case "getPackageName":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null && inAppWebViewFlutterPlugin2.activity != null) {
                    da20Var.success(g.a(this.plugin.activity, (ArrayList) x920Var.a("packages"), ((Boolean) x920Var.a("ignoreDefault")).booleanValue()));
                    break;
                } else {
                    da20Var.success(null);
                    break;
                }
                break;
            case "isAvailable":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null && (activity = inAppWebViewFlutterPlugin3.activity) != null) {
                    da20Var.success(Boolean.valueOf(CustomTabActivityHelper.isAvailable(activity)));
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
                break;
            default:
                da20Var.notImplemented();
                break;
        }
    }

    public void open(Activity activity, String str, String str2, HashMap<String, Object> hashMap, String str3, ArrayList<String> arrayList, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, HashMap<String, Object> hashMap4, List<HashMap<String, Object>> list, da20 da20Var) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str2);
        bundle.putString("id", str);
        bundle.putString("managerId", this.id);
        bundle.putSerializable("headers", hashMap);
        bundle.putString("referrer", str3);
        bundle.putSerializable("otherLikelyURLs", arrayList);
        bundle.putSerializable("settings", hashMap2);
        bundle.putSerializable("actionButton", hashMap3);
        bundle.putSerializable("secondaryToolbar", hashMap4);
        bundle.putSerializable("menuItemList", (Serializable) list);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) Util.getOrDefault(hashMap2, "isSingleInstance", bool);
        Boolean bool3 = (Boolean) Util.getOrDefault(hashMap2, "isTrustedWebActivity", bool);
        if (!CustomTabActivityHelper.isAvailable(activity)) {
            da20Var.error(LOG_TAG, "ChromeCustomTabs is not available!", null);
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) (!bool2.booleanValue() ? !bool3.booleanValue() ? ChromeCustomTabsActivity.class : TrustedWebActivity.class : !bool3.booleanValue() ? ChromeCustomTabsActivitySingleInstance.class : TrustedWebActivitySingleInstance.class));
        intent.putExtras(bundle);
        if (((Boolean) Util.getOrDefault(hashMap2, "noHistory", bool)).booleanValue()) {
            intent.addFlags(1073741824);
        }
        activity.startActivity(intent);
        da20Var.success(Boolean.TRUE);
    }
}
