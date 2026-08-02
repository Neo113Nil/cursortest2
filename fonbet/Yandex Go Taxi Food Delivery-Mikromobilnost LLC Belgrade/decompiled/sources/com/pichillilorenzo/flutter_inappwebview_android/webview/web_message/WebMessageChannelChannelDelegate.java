package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import defpackage.da20;
import defpackage.ea20;
import defpackage.x920;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class WebMessageChannelChannelDelegate extends ChannelDelegateImpl {
    private WebMessageChannel webMessageChannel;

    public WebMessageChannelChannelDelegate(WebMessageChannel webMessageChannel, ea20 ea20Var) {
        super(ea20Var);
        this.webMessageChannel = webMessageChannel;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.webMessageChannel = null;
    }

    public void onMessage(int i, WebMessageCompatExt webMessageCompatExt) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put(Constants.KEY_MESSAGE, webMessageCompatExt != null ? webMessageCompatExt.toMap() : null);
        channel.a("onMessage", hashMap, null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        str.getClass();
        switch (str) {
            case "close":
                WebMessageChannel webMessageChannel = this.webMessageChannel;
                if (webMessageChannel != null && (webMessageChannel.webView instanceof InAppWebView)) {
                    this.webMessageChannel.closeForInAppWebView((Integer) x920Var.a("index"), da20Var);
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
                break;
            case "setWebMessageCallback":
                WebMessageChannel webMessageChannel2 = this.webMessageChannel;
                if (webMessageChannel2 != null && (webMessageChannel2.webView instanceof InAppWebView)) {
                    this.webMessageChannel.setWebMessageCallbackForInAppWebView(((Integer) x920Var.a("index")).intValue(), da20Var);
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
                break;
            case "postMessage":
                WebMessageChannel webMessageChannel3 = this.webMessageChannel;
                if (webMessageChannel3 != null && (webMessageChannel3.webView instanceof InAppWebView)) {
                    this.webMessageChannel.postMessageForInAppWebView((Integer) x920Var.a("index"), WebMessageCompatExt.fromMap((Map) x920Var.a(Constants.KEY_MESSAGE)), da20Var);
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
}
