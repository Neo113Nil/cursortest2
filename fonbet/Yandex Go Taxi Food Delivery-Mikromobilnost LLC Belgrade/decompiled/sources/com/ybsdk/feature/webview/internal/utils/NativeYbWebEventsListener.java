package com.ybsdk.feature.webview.internal.utils;

import android.webkit.JavascriptInterface;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.gv41;
import defpackage.gw00;
import defpackage.i5z0;
import defpackage.x4c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/webview/internal/utils/NativeYbWebEventsListener;", "", "Lzy11;", "hideLoader", "()V", "", "value", "postMessage", "(Ljava/lang/String;)V", "url", "executeDeeplink", "invalidateSession", "sendAdjustEvent", "eventName", "paramsJson", "sendMetricaEventV2", "(Ljava/lang/String;Ljava/lang/String;)V", "sendNativeEvent", "", "isNfcAvailable", "()Z", "r450", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NativeYbWebEventsListener {
    public final AppAnalyticsReporter a;
    public final gv41 b;
    public final JsonAdapter c;

    public NativeYbWebEventsListener(Moshi moshi, AppAnalyticsReporter appAnalyticsReporter, gv41 gv41Var) {
        this.a = appAnalyticsReporter;
        this.b = gv41Var;
        this.c = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class));
    }

    @JavascriptInterface
    public final void executeDeeplink(String url) {
        i5z0.a.a("execute Deeplink: ".concat(url), new Object[0]);
        this.a.m0.f("executeDeeplink", gw00.e(new Pair("url", url)));
        this.b.d0(url);
    }

    @JavascriptInterface
    public final void hideLoader() {
        i5z0.a.a("Function nativeYB.hideLoader was called from the web page", new Object[0]);
        this.a.m0.f("hideLoader", kotlin.collections.b.f());
        this.b.f0();
    }

    @JavascriptInterface
    public final void invalidateSession() {
        i5z0.a.a("invalidateSession", new Object[0]);
        this.a.m0.f("invalidateSession", kotlin.collections.b.f());
        this.b.g0();
    }

    @JavascriptInterface
    public final boolean isNfcAvailable() {
        i5z0.a.a("isNfcAvailable function called", new Object[0]);
        this.b.h0();
        return false;
    }

    @JavascriptInterface
    public final void postMessage(String value) {
        i5z0.a.a("message received: ".concat(value), new Object[0]);
        this.a.m0.f("postMessage", gw00.e(new Pair("value", value)));
        this.b.e0(value);
    }

    @JavascriptInterface
    public final void sendAdjustEvent(String value) {
        i5z0.a.a("sendAdjustEvent received: ".concat(value), new Object[0]);
        this.a.m0.f("sendAdjustEvent", gw00.e(new Pair("value", value)));
        this.b.t0(value);
    }

    @JavascriptInterface
    public final void sendMetricaEventV2(String eventName, String paramsJson) {
        Map f;
        String concat = "webview.".concat(eventName);
        try {
            f = (Map) this.c.fromJson(paramsJson);
            if (f == null) {
                f = kotlin.collections.b.f();
            }
        } catch (Exception e) {
            x4c.g("Error parsing params JSON in sendMetricaEventV2", e, null, null, 12);
            f = kotlin.collections.b.f();
        }
        i5z0.a.a("sendMetricaEventV2: " + concat + ", params: " + f, new Object[0]);
        this.b.u0(concat, f);
    }

    @JavascriptInterface
    public final void sendNativeEvent(String eventName) {
        i5z0.a.a("sendNativeEvent: ".concat(eventName), new Object[0]);
        this.b.v0(eventName);
    }
}
