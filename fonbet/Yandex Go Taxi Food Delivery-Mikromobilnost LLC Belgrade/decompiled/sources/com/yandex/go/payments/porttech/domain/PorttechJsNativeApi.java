package com.yandex.go.payments.porttech.domain;

import com.yandex.go.payments.porttech.navigation.c;
import defpackage.j73;
import defpackage.jst;
import defpackage.k52;
import defpackage.rab1;
import defpackage.wnt;
import defpackage.xbe0;
import defpackage.ybe0;
import defpackage.zbe0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0002\u001bB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ+\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ+\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ+\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001d\u0010\u0016\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/payments/porttech/domain/PorttechJsNativeApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Lzbe0;", "callbacks", "Lwnt;", "goJson", "<init>", "(Lzbe0;Lwnt;)V", "", "promiseId", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "Lzy11;", "handleWebViewReady", "(Ljava/lang/String;[Ljava/lang/String;)V", "handleHideWebView", "handleSelectPaymentMethod", "handleGetSelectedPaymentMethod", "handleSendAnalyticsEvent", "Lcom/yandex/go/payments/porttech/domain/PaymentMethodResponse;", "paymentMethod", "resolveSelectPaymentMethod", "(Ljava/lang/String;Lcom/yandex/go/payments/porttech/domain/PaymentMethodResponse;)V", "resolveGetSelectedPaymentMethod", "Lzbe0;", "Companion", "ybe0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PorttechJsNativeApi extends JsNativeApi {
    public static final int $stable = 8;
    private static final ybe0 Companion = new ybe0();
    private static final String GET_SELECTED_PAYMENT_METHOD = "taxi.app.getSelectedPaymentMethod";
    private static final String ON_WEB_VIEW_READY = "taxi.app.onWebViewReady";
    private static final String REQUEST_HIDE_WEB_VIEW = "taxi.app.requestHideWebView";
    private static final String SELECT_PAYMENT_METHOD = "taxi.app.selectPaymentMethod";
    private static final String SEND_ANALYTICS_EVENT = "taxi.app.sendAnalyticsEvent";
    private final zbe0 callbacks;

    public PorttechJsNativeApi(zbe0 zbe0Var, wnt wntVar) {
        super(wntVar);
        this.callbacks = zbe0Var;
        rab1.d(getDocument(), "taxi.app.onWebViewReady", new xbe0(this, 0), new String[0]);
        rab1.d(getDocument(), "taxi.app.requestHideWebView", new xbe0(this, 1), new String[0]);
        rab1.d(getDocument(), SELECT_PAYMENT_METHOD, new xbe0(this, 2), new String[0]);
        rab1.d(getDocument(), GET_SELECTED_PAYMENT_METHOD, new xbe0(this, 3), new String[0]);
        rab1.d(getDocument(), "taxi.app.sendAnalyticsEvent", new xbe0(this, 4), "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleGetSelectedPaymentMethod(String promiseId, String[] params) {
        ((c) this.callbacks).a(promiseId, params.length == 0 ? new SelectPaymentMethodRequest(0) : (SelectPaymentMethodRequest) deserialize(params[0], SelectPaymentMethodRequest.Companion.serializer()), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleHideWebView(String promiseId, String[] params) {
        ((c) this.callbacks).b();
        callbackResult(promiseId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSelectPaymentMethod(String promiseId, String[] params) {
        ((c) this.callbacks).c(promiseId, params.length == 0 ? new SelectPaymentMethodRequest(0) : (SelectPaymentMethodRequest) deserialize(params[0], SelectPaymentMethodRequest.Companion.serializer()), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSendAnalyticsEvent(String promiseId, String[] params) {
        try {
            ((c) this.callbacks).d((k52) deserialize((String) j73.C(params), k52.Companion.serializer()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            jst.e.c("PorttechJsNativeApi.sendAnalyticsEvent cant parse param = " + j73.D(params));
        }
        callbackResult(promiseId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewReady(String promiseId, String[] params) {
        ((c) this.callbacks).e();
        callbackResult(promiseId);
    }

    public final void resolveGetSelectedPaymentMethod(String promiseId, PaymentMethodResponse paymentMethod) {
        callbackResult(promiseId, PaymentMethodResponse.Companion.serializer(), paymentMethod);
    }

    public final void resolveSelectPaymentMethod(String promiseId, PaymentMethodResponse paymentMethod) {
        callbackResult(promiseId, PaymentMethodResponse.Companion.serializer(), paymentMethod);
    }
}
