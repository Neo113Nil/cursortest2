package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import androidx.browser.customtabs.k;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.da20;
import defpackage.ea20;
import defpackage.g8e;
import defpackage.x920;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public class ChromeCustomTabsChannelDelegate extends ChannelDelegateImpl {
    private ChromeCustomTabsActivity chromeCustomTabsActivity;

    public ChromeCustomTabsChannelDelegate(ChromeCustomTabsActivity chromeCustomTabsActivity, ea20 ea20Var) {
        super(ea20Var);
        this.chromeCustomTabsActivity = chromeCustomTabsActivity;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.chromeCustomTabsActivity = null;
    }

    public void onClosed() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onClosed", new HashMap(), null);
    }

    public void onCompletedInitialLoad() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onCompletedInitialLoad", new HashMap(), null);
    }

    public void onGreatestScrollPercentageIncreased(int i) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scrollPercentage", Integer.valueOf(i));
        channel.a("onGreatestScrollPercentageIncreased", hashMap, null);
    }

    public void onItemActionPerform(int i, String str, String str2) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i));
        hashMap.put("url", str);
        hashMap.put("title", str2);
        channel.a("onItemActionPerform", hashMap, null);
    }

    public void onMessageChannelReady() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onMessageChannelReady", new HashMap(), null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        k kVar;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        Activity activity;
        int i;
        String str = x920Var.a;
        str.getClass();
        boolean z = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1526944655:
                if (str.equals("isEngagementSignalsApiAvailable")) {
                    c = 0;
                    break;
                }
                break;
            case -675108676:
                if (str.equals("launchUrl")) {
                    c = 1;
                    break;
                }
                break;
            case -334843312:
                if (str.equals("updateSecondaryToolbar")) {
                    c = 2;
                    break;
                }
                break;
            case 50870385:
                if (str.equals("updateActionButton")) {
                    c = 3;
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c = 4;
                    break;
                }
                break;
            case 1256059502:
                if (str.equals("validateRelationship")) {
                    c = 5;
                    break;
                }
                break;
            case 1392239787:
                if (str.equals("requestPostMessageChannel")) {
                    c = 6;
                    break;
                }
                break;
            case 1490029383:
                if (str.equals("postMessage")) {
                    c = 7;
                    break;
                }
                break;
            case 2000053463:
                if (str.equals("mayLaunchUrl")) {
                    c = '\b';
                    break;
                }
                break;
        }
        Bundle bundle = null;
        switch (c) {
            case 0:
                ChromeCustomTabsActivity chromeCustomTabsActivity = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity == null || (kVar = chromeCustomTabsActivity.customTabsSession) == null) {
                    da20Var.success(Boolean.FALSE);
                    return;
                }
                try {
                    try {
                        da20Var.success(Boolean.valueOf(kVar.b.isEngagementSignalsApiAvailable(kVar.c, kVar.a(new Bundle()))));
                        return;
                    } catch (SecurityException e) {
                        throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
                    }
                } catch (Throwable unused) {
                    da20Var.success(Boolean.FALSE);
                    return;
                }
            case 1:
                if (this.chromeCustomTabsActivity == null) {
                    da20Var.success(Boolean.FALSE);
                    return;
                }
                String str2 = (String) x920Var.a("url");
                if (str2 == null) {
                    da20Var.success(Boolean.FALSE);
                    return;
                } else {
                    this.chromeCustomTabsActivity.launchUrl(str2, (Map) x920Var.a("headers"), (String) x920Var.a("referrer"), (List) x920Var.a("otherLikelyURLs"));
                    da20Var.success(Boolean.TRUE);
                    return;
                }
            case 2:
                if (this.chromeCustomTabsActivity == null) {
                    da20Var.success(Boolean.FALSE);
                    return;
                } else {
                    this.chromeCustomTabsActivity.updateSecondaryToolbar(CustomTabsSecondaryToolbar.fromMap((Map) x920Var.a("secondaryToolbar")));
                    da20Var.success(Boolean.TRUE);
                    return;
                }
            case 3:
                if (this.chromeCustomTabsActivity == null) {
                    da20Var.success(Boolean.FALSE);
                    return;
                } else {
                    this.chromeCustomTabsActivity.updateActionButton((byte[]) x920Var.a("icon"), (String) x920Var.a(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
                    da20Var.success(Boolean.TRUE);
                    return;
                }
            case 4:
                ChromeCustomTabsActivity chromeCustomTabsActivity2 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity2 == null) {
                    da20Var.success(Boolean.FALSE);
                    return;
                }
                chromeCustomTabsActivity2.onStop();
                this.chromeCustomTabsActivity.onDestroy();
                this.chromeCustomTabsActivity.close();
                ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeCustomTabsActivity.manager;
                if (chromeSafariBrowserManager != null && (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) != null && (activity = inAppWebViewFlutterPlugin.activity) != null) {
                    Intent intent = new Intent(activity, activity.getClass());
                    intent.addFlags(SelfTester_JCP.DECRYPT_CBC);
                    intent.addFlags(536870912);
                    activity.startActivity(intent);
                }
                this.chromeCustomTabsActivity.dispose();
                da20Var.success(Boolean.TRUE);
                return;
            case 5:
                ChromeCustomTabsActivity chromeCustomTabsActivity3 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity3 == null || chromeCustomTabsActivity3.customTabsSession == null) {
                    da20Var.success(Boolean.FALSE);
                    return;
                }
                Integer num = (Integer) x920Var.a("relation");
                String str3 = (String) x920Var.a("origin");
                k kVar2 = this.chromeCustomTabsActivity.customTabsSession;
                int intValue = num.intValue();
                Uri parse = Uri.parse(str3);
                kVar2.getClass();
                if (intValue >= 1 && intValue <= 2) {
                    try {
                        z = kVar2.b.validateRelationship(kVar2.c, intValue, parse, kVar2.a(null));
                    } catch (RemoteException unused2) {
                    }
                }
                da20Var.success(Boolean.valueOf(z));
                return;
            case 6:
                ChromeCustomTabsActivity chromeCustomTabsActivity4 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity4 == null || chromeCustomTabsActivity4.customTabsSession == null) {
                    da20Var.success(Boolean.FALSE);
                    return;
                }
                String str4 = (String) x920Var.a("sourceOrigin");
                String str5 = (String) x920Var.a("targetOrigin");
                k kVar3 = this.chromeCustomTabsActivity.customTabsSession;
                Uri parse2 = Uri.parse(str4);
                Uri parse3 = str5 != null ? Uri.parse(str5) : null;
                Bundle bundle2 = new Bundle();
                ICustomTabsCallback iCustomTabsCallback = kVar3.c;
                ICustomTabsService iCustomTabsService = kVar3.b;
                try {
                    Bundle bundle3 = new Bundle();
                    if (parse3 != null) {
                        bundle3.putParcelable("target_origin", parse3);
                    }
                    if (!bundle3.isEmpty()) {
                        bundle = bundle3;
                    }
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                        z = iCustomTabsService.requestPostMessageChannelWithExtras(iCustomTabsCallback, parse2, bundle2);
                    } else {
                        z = iCustomTabsService.requestPostMessageChannel(iCustomTabsCallback, parse2);
                    }
                } catch (RemoteException unused3) {
                }
                da20Var.success(Boolean.valueOf(z));
                return;
            case 7:
                ChromeCustomTabsActivity chromeCustomTabsActivity5 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity5 == null || chromeCustomTabsActivity5.customTabsSession == null) {
                    da20Var.success(-3);
                    return;
                }
                String str6 = (String) x920Var.a(Constants.KEY_MESSAGE);
                k kVar4 = this.chromeCustomTabsActivity.customTabsSession;
                Bundle a = kVar4.a(new Bundle());
                synchronized (kVar4.a) {
                    try {
                        try {
                            i = kVar4.b.postMessage(kVar4.c, str6, a);
                        } finally {
                        }
                    } catch (RemoteException unused4) {
                        i = -2;
                    }
                }
                da20Var.success(Integer.valueOf(i));
                return;
            case '\b':
                if (this.chromeCustomTabsActivity != null) {
                    da20Var.success(Boolean.valueOf(this.chromeCustomTabsActivity.mayLaunchUrl((String) x920Var.a("url"), (List) x920Var.a("otherLikelyURLs"))));
                    return;
                } else {
                    da20Var.success(Boolean.FALSE);
                    return;
                }
            default:
                da20Var.notImplemented();
                return;
        }
    }

    public void onNavigationEvent(int i) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("navigationEvent", Integer.valueOf(i));
        channel.a("onNavigationEvent", hashMap, null);
    }

    public void onOpened() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onOpened", new HashMap(), null);
    }

    public void onPostMessage(String str) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY_MESSAGE, str);
        channel.a("onPostMessage", hashMap, null);
    }

    public void onRelationshipValidationResult(int i, Uri uri, boolean z) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("relation", Integer.valueOf(i));
        hashMap.put("requestedOrigin", uri.toString());
        hashMap.put(TarifficatorScenarioActivity.RESULT_KEY, Boolean.valueOf(z));
        channel.a("onRelationshipValidationResult", hashMap, null);
    }

    public void onSecondaryItemActionPerform(String str, String str2) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onSecondaryItemActionPerform", g8e.u("name", str, "url", str2), null);
    }

    public void onServiceConnected() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onServiceConnected", new HashMap(), null);
    }

    public void onSessionEnded(boolean z) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("didUserInteract", Boolean.valueOf(z));
        channel.a("onSessionEnded", hashMap, null);
    }

    public void onVerticalScrollEvent(boolean z) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isDirectionUp", Boolean.valueOf(z));
        channel.a("onVerticalScrollEvent", hashMap, null);
    }
}
