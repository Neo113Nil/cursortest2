package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import defpackage.g8e;
import defpackage.oyr;
import defpackage.w511;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class WebMessagePort {
    public String name;
    public WebMessageChannel webMessageChannel;
    public boolean isClosed = false;
    public boolean isTransferred = false;
    public boolean isStarted = false;

    public WebMessagePort(String str, WebMessageChannel webMessageChannel) {
        this.name = str;
        this.webMessageChannel = webMessageChannel;
    }

    public void close(final ValueCallback<Void> valueCallback) {
        InAppWebViewInterface inAppWebViewInterface;
        if (this.isTransferred) {
            w511.s("Port is already transferred");
            return;
        }
        this.isClosed = true;
        WebMessageChannel webMessageChannel = this.webMessageChannel;
        if (webMessageChannel == null || (inAppWebViewInterface = webMessageChannel.webView) == null) {
            inAppWebViewInterface = null;
        }
        if (inAppWebViewInterface == null) {
            valueCallback.onReceiveValue(null);
            return;
        }
        StringBuilder sb = new StringBuilder("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
        sb.append(this.webMessageChannel.id);
        sb.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
        inAppWebViewInterface.evaluateJavascript(oyr.t(sb, this.name, ".close();  }})();"), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort.3
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue(null);
            }
        });
    }

    public void dispose() {
        this.isClosed = true;
        this.webMessageChannel = null;
    }

    public void postMessage(WebMessage webMessage, final ValueCallback<Void> valueCallback) {
        InAppWebViewInterface inAppWebViewInterface;
        String str;
        if (this.isClosed || this.isTransferred) {
            w511.s("Port is already closed or transferred");
            return;
        }
        WebMessageChannel webMessageChannel = this.webMessageChannel;
        if (webMessageChannel == null || (inAppWebViewInterface = webMessageChannel.webView) == null) {
            inAppWebViewInterface = null;
        }
        if (inAppWebViewInterface != null) {
            List<WebMessagePort> list = webMessage.ports;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (WebMessagePort webMessagePort : list) {
                    if (webMessagePort == this) {
                        w511.s("Source port cannot be transferred");
                        return;
                    }
                    if (webMessagePort.isStarted) {
                        w511.s("Port is already started");
                        return;
                    }
                    if (webMessagePort.isClosed || webMessagePort.isTransferred) {
                        w511.s("Port is already closed or transferred");
                        return;
                    }
                    webMessagePort.isTransferred = true;
                    arrayList.add("window.flutter_inappwebview._webMessageChannels['" + this.webMessageChannel.id + "']." + webMessagePort.name);
                }
                str = "[" + TextUtils.join(Extension.FIX_SPACE, arrayList) + "]";
            } else {
                str = "null";
            }
            String str2 = webMessage.data;
            String replaceAll = str2 != null ? Util.replaceAll(str2, "'", "\\'") : "null";
            StringBuilder sb = new StringBuilder("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
            sb.append(this.webMessageChannel.id);
            sb.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
            g8e.D(sb, this.name, ".postMessage('", replaceAll, "', ");
            inAppWebViewInterface.evaluateJavascript(oyr.t(sb, str, ");  }})();"), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort.2
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str3) {
                    valueCallback.onReceiveValue(null);
                }
            });
        } else {
            valueCallback.onReceiveValue(null);
        }
        webMessage.dispose();
    }

    public void setWebMessageCallback(final ValueCallback<Void> valueCallback) {
        InAppWebViewInterface inAppWebViewInterface;
        if (this.isClosed || this.isTransferred) {
            w511.s("Port is already closed or transferred");
            return;
        }
        this.isStarted = true;
        WebMessageChannel webMessageChannel = this.webMessageChannel;
        if (webMessageChannel == null || (inAppWebViewInterface = webMessageChannel.webView) == null) {
            inAppWebViewInterface = null;
        }
        if (inAppWebViewInterface == null) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        inAppWebViewInterface.evaluateJavascript("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['" + this.webMessageChannel.id + "'];  if (webMessageChannel != null) {      webMessageChannel." + this.name + ".onmessage = function (event) {          window.flutter_inappwebview.callHandler('onWebMessagePortMessageReceived', {              'webMessageChannelId': '" + this.webMessageChannel.id + "',              'index': " + (1 ^ (this.name.equals("port1") ? 1 : 0)) + ",              'message': event.data          });      }  }})();", null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                ValueCallback valueCallback2 = valueCallback;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
            }
        });
    }
}
