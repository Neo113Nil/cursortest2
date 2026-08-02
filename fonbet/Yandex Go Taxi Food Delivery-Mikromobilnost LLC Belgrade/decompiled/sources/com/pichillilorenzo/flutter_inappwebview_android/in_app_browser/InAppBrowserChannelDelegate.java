package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
import defpackage.ea20;
import java.util.HashMap;

/* loaded from: classes11.dex */
public class InAppBrowserChannelDelegate extends ChannelDelegateImpl {
    public InAppBrowserChannelDelegate(ea20 ea20Var) {
        super(ea20Var);
    }

    public void onBrowserCreated() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onBrowserCreated", new HashMap(), null);
    }

    public void onExit() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onExit", new HashMap(), null);
    }

    public void onMenuItemClicked(InAppBrowserMenuItem inAppBrowserMenuItem) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(inAppBrowserMenuItem.getId()));
        channel.a("onMenuItemClicked", hashMap, null);
    }
}
