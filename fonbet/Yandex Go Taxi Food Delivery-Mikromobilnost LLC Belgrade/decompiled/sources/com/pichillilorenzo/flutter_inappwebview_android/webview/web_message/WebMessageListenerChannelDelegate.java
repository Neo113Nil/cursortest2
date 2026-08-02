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
public class WebMessageListenerChannelDelegate extends ChannelDelegateImpl {
    private WebMessageListener webMessageListener;

    public WebMessageListenerChannelDelegate(WebMessageListener webMessageListener, ea20 ea20Var) {
        super(ea20Var);
        this.webMessageListener = webMessageListener;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.webMessageListener = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        str.getClass();
        if (!str.equals("postMessage")) {
            da20Var.notImplemented();
            return;
        }
        WebMessageListener webMessageListener = this.webMessageListener;
        if (webMessageListener == null || !(webMessageListener.webView instanceof InAppWebView)) {
            da20Var.success(Boolean.FALSE);
        } else {
            this.webMessageListener.postMessageForInAppWebView(WebMessageCompatExt.fromMap((Map) x920Var.a(Constants.KEY_MESSAGE)), da20Var);
        }
    }

    public void onPostMessage(WebMessageCompatExt webMessageCompatExt, String str, boolean z) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY_MESSAGE, webMessageCompatExt != null ? webMessageCompatExt.toMap() : null);
        hashMap.put("sourceOrigin", str);
        hashMap.put("isMainFrame", Boolean.valueOf(z));
        channel.a("onPostMessage", hashMap, null);
    }
}
