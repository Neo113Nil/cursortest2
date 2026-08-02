package com.ybsdk.feature.change.payment.method.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.jl40;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetInitResponse;", "", TarifficatorScenarioActivity.RESULT_KEY, "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatus;", "pollingPayload", "", "", "<init>", "(Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatus;Ljava/util/Map;)V", "getResult", "()Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatus;", "getPollingPayload", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DefaultPaymentMethodUnifiedSetInitResponse {
    private final Map<String, Object> pollingPayload;
    private final DefaultPaymentMethodUnifiedSetStatus result;

    public DefaultPaymentMethodUnifiedSetInitResponse(@Json(name = "result") DefaultPaymentMethodUnifiedSetStatus defaultPaymentMethodUnifiedSetStatus, @Json(name = "polling_payload") Map<String, ? extends Object> map) {
        this.result = defaultPaymentMethodUnifiedSetStatus;
        this.pollingPayload = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefaultPaymentMethodUnifiedSetInitResponse copy$default(DefaultPaymentMethodUnifiedSetInitResponse defaultPaymentMethodUnifiedSetInitResponse, DefaultPaymentMethodUnifiedSetStatus defaultPaymentMethodUnifiedSetStatus, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            defaultPaymentMethodUnifiedSetStatus = defaultPaymentMethodUnifiedSetInitResponse.result;
        }
        if ((i & 2) != 0) {
            map = defaultPaymentMethodUnifiedSetInitResponse.pollingPayload;
        }
        return defaultPaymentMethodUnifiedSetInitResponse.copy(defaultPaymentMethodUnifiedSetStatus, map);
    }

    /* renamed from: component1, reason: from getter */
    public final DefaultPaymentMethodUnifiedSetStatus getResult() {
        return this.result;
    }

    public final Map<String, Object> component2() {
        return this.pollingPayload;
    }

    public final DefaultPaymentMethodUnifiedSetInitResponse copy(@Json(name = "result") DefaultPaymentMethodUnifiedSetStatus result, @Json(name = "polling_payload") Map<String, ? extends Object> pollingPayload) {
        return new DefaultPaymentMethodUnifiedSetInitResponse(result, pollingPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultPaymentMethodUnifiedSetInitResponse)) {
            return false;
        }
        DefaultPaymentMethodUnifiedSetInitResponse defaultPaymentMethodUnifiedSetInitResponse = (DefaultPaymentMethodUnifiedSetInitResponse) other;
        return jl40.l(this.result, defaultPaymentMethodUnifiedSetInitResponse.result) && jl40.l(this.pollingPayload, defaultPaymentMethodUnifiedSetInitResponse.pollingPayload);
    }

    public final Map<String, Object> getPollingPayload() {
        return this.pollingPayload;
    }

    public final DefaultPaymentMethodUnifiedSetStatus getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.pollingPayload.hashCode() + (this.result.hashCode() * 31);
    }

    public String toString() {
        return "DefaultPaymentMethodUnifiedSetInitResponse(result=" + this.result + ", pollingPayload=" + this.pollingPayload + Extension.C_BRAKE;
    }
}
