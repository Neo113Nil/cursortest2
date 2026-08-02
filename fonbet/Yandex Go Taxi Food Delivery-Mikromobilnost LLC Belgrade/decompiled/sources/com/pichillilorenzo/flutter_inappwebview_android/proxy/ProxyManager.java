package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import defpackage.da20;
import defpackage.ea20;
import defpackage.hm91;
import defpackage.rwf0;
import defpackage.swf0;
import defpackage.twf0;
import defpackage.uwf0;
import defpackage.vwf0;
import defpackage.w511;
import defpackage.x920;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public class ProxyManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ProxyManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_proxycontroller";
    public static vwf0 proxyController;
    public InAppWebViewFlutterPlugin plugin;

    public ProxyManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new ea20(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    private void clearProxyOverride(final da20 da20Var) {
        vwf0 vwf0Var = proxyController;
        if (vwf0Var != null) {
            vwf0Var.a(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.4
                @Override // java.lang.Runnable
                public void run() {
                    da20Var.success(Boolean.TRUE);
                }
            }, new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.3
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            });
        }
    }

    public static void init() {
        if (proxyController == null && hm91.d("PROXY_OVERRIDE")) {
            if (hm91.d("PROXY_OVERRIDE")) {
                proxyController = uwf0.a;
            } else {
                w511.x("Proxy override not supported");
            }
        }
    }

    private void setProxyOverride(ProxySettings proxySettings, final da20 da20Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (proxyController != null) {
            rwf0 rwf0Var = new rwf0();
            Iterator<String> it = proxySettings.bypassRules.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = rwf0Var.b;
                if (!hasNext) {
                    break;
                } else {
                    arrayList.add(it.next());
                }
            }
            Iterator<String> it2 = proxySettings.directs.iterator();
            while (true) {
                boolean hasNext2 = it2.hasNext();
                arrayList2 = rwf0Var.a;
                if (!hasNext2) {
                    break;
                } else {
                    arrayList2.add(new swf0(it2.next(), "direct://"));
                }
            }
            for (ProxyRuleExt proxyRuleExt : proxySettings.proxyRules) {
                if (proxyRuleExt.getSchemeFilter() != null) {
                    arrayList2.add(new swf0(proxyRuleExt.getSchemeFilter(), proxyRuleExt.getUrl()));
                } else {
                    arrayList2.add(new swf0("*", proxyRuleExt.getUrl()));
                }
            }
            Boolean bool = proxySettings.bypassSimpleHostnames;
            if (bool != null && bool.booleanValue()) {
                arrayList.add("<local>");
            }
            Boolean bool2 = proxySettings.removeImplicitRules;
            if (bool2 != null && bool2.booleanValue()) {
                arrayList.add("<-loopback>");
            }
            if (proxySettings.reverseBypassEnabled != null && hm91.d("PROXY_OVERRIDE_REVERSE_BYPASS")) {
                rwf0Var.c = proxySettings.reverseBypassEnabled.booleanValue();
            }
            proxyController.b(new twf0(arrayList2, arrayList, rwf0Var.c), new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.1
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.2
                @Override // java.lang.Runnable
                public void run() {
                    da20Var.success(Boolean.TRUE);
                }
            });
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        init();
        String str = x920Var.a;
        str.getClass();
        if (str.equals("clearProxyOverride")) {
            if (proxyController != null) {
                clearProxyOverride(da20Var);
                return;
            } else {
                da20Var.success(Boolean.FALSE);
                return;
            }
        }
        if (!str.equals("setProxyOverride")) {
            da20Var.notImplemented();
            return;
        }
        if (proxyController == null) {
            da20Var.success(Boolean.FALSE);
            return;
        }
        HashMap hashMap = (HashMap) x920Var.a("settings");
        ProxySettings proxySettings = new ProxySettings();
        if (hashMap != null) {
            proxySettings.parse2((Map<String, Object>) hashMap);
        }
        setProxyOverride(proxySettings, da20Var);
    }
}
