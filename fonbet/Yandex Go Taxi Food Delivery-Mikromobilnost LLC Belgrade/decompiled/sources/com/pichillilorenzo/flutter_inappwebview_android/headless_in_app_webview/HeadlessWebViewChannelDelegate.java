package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import defpackage.da20;
import defpackage.ea20;
import defpackage.x920;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class HeadlessWebViewChannelDelegate extends ChannelDelegateImpl {
    private HeadlessInAppWebView headlessWebView;

    public HeadlessWebViewChannelDelegate(HeadlessInAppWebView headlessInAppWebView, ea20 ea20Var) {
        super(ea20Var);
        this.headlessWebView = headlessInAppWebView;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.headlessWebView = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        str.getClass();
        switch (str) {
            case "getSize":
                HeadlessInAppWebView headlessInAppWebView = this.headlessWebView;
                if (headlessInAppWebView == null) {
                    da20Var.success(null);
                    break;
                } else {
                    Size2D size = headlessInAppWebView.getSize();
                    da20Var.success(size != null ? size.toMap() : null);
                    break;
                }
            case "dispose":
                HeadlessInAppWebView headlessInAppWebView2 = this.headlessWebView;
                if (headlessInAppWebView2 == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    headlessInAppWebView2.dispose();
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case "setSize":
                if (this.headlessWebView == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    Size2D fromMap = Size2D.fromMap((Map) x920Var.a("size"));
                    if (fromMap != null) {
                        this.headlessWebView.setSize(fromMap);
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            default:
                da20Var.notImplemented();
                break;
        }
    }

    public void onWebViewCreated() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onWebViewCreated", new HashMap(), null);
    }
}
