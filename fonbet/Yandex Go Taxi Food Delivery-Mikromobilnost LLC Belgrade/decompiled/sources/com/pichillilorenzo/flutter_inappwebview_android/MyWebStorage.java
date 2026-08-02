package com.pichillilorenzo.flutter_inappwebview_android;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import defpackage.da20;
import defpackage.ea20;
import defpackage.x920;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public class MyWebStorage extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyWebStorage";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webstoragemanager";
    public static WebStorage webStorageManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyWebStorage(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new ea20(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init() {
        if (webStorageManager == null) {
            webStorageManager = WebStorage.getInstance();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public void getOrigins(final da20 da20Var) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            da20Var.success(new ArrayList());
        } else {
            webStorage.getOrigins(new ValueCallback<Map>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Map map) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        WebStorage.Origin origin = (WebStorage.Origin) map.get(it.next());
                        HashMap hashMap = new HashMap();
                        hashMap.put("origin", origin.getOrigin());
                        hashMap.put("quota", Long.valueOf(origin.getQuota()));
                        hashMap.put("usage", Long.valueOf(origin.getUsage()));
                        arrayList.add(hashMap);
                    }
                    da20Var.success(arrayList);
                }
            });
        }
    }

    public void getQuotaForOrigin(String str, final da20 da20Var) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            da20Var.success(0);
        } else {
            webStorage.getQuotaForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.2
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Long l) {
                    da20Var.success(l);
                }
            });
        }
    }

    public void getUsageForOrigin(String str, final da20 da20Var) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            da20Var.success(0);
        } else {
            webStorage.getUsageForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.3
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Long l) {
                    da20Var.success(l);
                }
            });
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        init();
        String str = x920Var.a;
        str.getClass();
        switch (str) {
            case "getQuotaForOrigin":
                getQuotaForOrigin((String) x920Var.a("origin"), da20Var);
                break;
            case "deleteAllData":
                WebStorage webStorage = webStorageManager;
                if (webStorage == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    webStorage.deleteAllData();
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case "deleteOrigin":
                if (webStorageManager == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    webStorageManager.deleteOrigin((String) x920Var.a("origin"));
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case "getOrigins":
                getOrigins(da20Var);
                break;
            case "getUsageForOrigin":
                getUsageForOrigin((String) x920Var.a("origin"), da20Var);
                break;
            default:
                da20Var.notImplemented();
                break;
        }
    }
}
