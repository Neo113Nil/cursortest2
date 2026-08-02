package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.webkit.internal.a;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import defpackage.da20;
import defpackage.ea20;
import defpackage.g8e;
import defpackage.hm91;
import defpackage.ih41;
import defpackage.kh41;
import defpackage.oyr;
import defpackage.qp41;
import defpackage.rm41;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class WebMessageChannel implements Disposable {
    protected static final String LOG_TAG = "WebMessageChannel";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_channel_";
    public WebMessageChannelChannelDelegate channelDelegate;
    public final List<kh41> compatPorts;
    public String id;
    public final List<WebMessagePort> ports;
    public InAppWebViewInterface webView;

    public WebMessageChannel(String str, InAppWebViewInterface inAppWebViewInterface) {
        this.id = str;
        this.channelDelegate = new WebMessageChannelChannelDelegate(this, new ea20(inAppWebViewInterface.getPlugin().messenger, g8e.o(METHOD_CHANNEL_NAME_PREFIX, str)));
        if (inAppWebViewInterface instanceof InAppWebView) {
            Uri uri = rm41.a;
            qp41.w.getClass();
            this.compatPorts = new ArrayList(Arrays.asList(a.i(((InAppWebView) inAppWebViewInterface).createWebMessageChannel())));
            this.ports = new ArrayList();
        } else {
            this.ports = Arrays.asList(new WebMessagePort("port1", this), new WebMessagePort("port2", this));
            this.compatPorts = new ArrayList();
        }
        this.webView = inAppWebViewInterface;
    }

    public void closeForInAppWebView(Integer num, da20 da20Var) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !hm91.d("WEB_MESSAGE_PORT_CLOSE")) {
            da20Var.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(num.intValue()).a();
            da20Var.success(Boolean.TRUE);
        } catch (Exception e) {
            da20Var.error(LOG_TAG, e.getMessage(), null);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        if (hm91.d("WEB_MESSAGE_PORT_CLOSE")) {
            Iterator<kh41> it = this.compatPorts.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (Exception unused) {
                }
            }
        }
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.compatPorts.clear();
        this.webView = null;
    }

    public void initJsInstance(InAppWebViewInterface inAppWebViewInterface, final ValueCallback<WebMessageChannel> valueCallback) {
        if (inAppWebViewInterface != null) {
            inAppWebViewInterface.evaluateJavascript(oyr.t(new StringBuilder("(function() {window.flutter_inappwebview._webMessageChannels['"), this.id, "'] = new MessageChannel();})();"), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    valueCallback.onReceiveValue(this);
                }
            });
        } else {
            valueCallback.onReceiveValue(this);
        }
    }

    public void onMessage(int i, WebMessageCompatExt webMessageCompatExt) {
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.onMessage(i, webMessageCompatExt);
        }
    }

    public void postMessageForInAppWebView(Integer num, WebMessageCompatExt webMessageCompatExt, da20 da20Var) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !hm91.d("WEB_MESSAGE_PORT_POST_MESSAGE")) {
            da20Var.success(Boolean.TRUE);
            return;
        }
        kh41 kh41Var = this.compatPorts.get(num.intValue());
        ArrayList arrayList = new ArrayList();
        List<WebMessagePortCompatExt> ports = webMessageCompatExt.getPorts();
        if (ports != null) {
            for (WebMessagePortCompatExt webMessagePortCompatExt : ports) {
                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(webMessagePortCompatExt.getWebMessageChannelId());
                if (webMessageChannel != null) {
                    arrayList.add(webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                }
            }
        }
        Object data = webMessageCompatExt.getData();
        try {
            if (hm91.d("WEB_MESSAGE_ARRAY_BUFFER") && data != null && webMessageCompatExt.getType() == 1) {
                kh41Var.d(new ih41((byte[]) data, (kh41[]) arrayList.toArray(new kh41[0])));
            } else {
                kh41Var.d(new ih41(data != null ? data.toString() : null, (kh41[]) arrayList.toArray(new kh41[0])));
            }
            da20Var.success(Boolean.TRUE);
        } catch (Exception e) {
            da20Var.error(LOG_TAG, e.getMessage(), null);
        }
    }

    public void setWebMessageCallbackForInAppWebView(final int i, da20 da20Var) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !hm91.d("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
            da20Var.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(i).e(new kh41.a() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.2
                @Override // kh41.a
                public void onMessage(kh41 kh41Var, ih41 ih41Var) {
                    this.onMessage(i, ih41Var != null ? WebMessageCompatExt.fromMapWebMessageCompat(ih41Var) : null);
                }
            });
            da20Var.success(Boolean.TRUE);
        } catch (Exception e) {
            da20Var.error(LOG_TAG, e.getMessage(), null);
        }
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.id);
        return hashMap;
    }
}
