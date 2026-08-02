package com.ybsdk.feature.change.payment.method.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatusRequest;", "", "productId", "", "payload", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getProductId", "()Ljava/lang/String;", "getPayload", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DefaultPaymentMethodUnifiedSetStatusRequest {
    private final Map<String, Object> payload;
    private final String productId;

    public DefaultPaymentMethodUnifiedSetStatusRequest(@Json(name = "product_id") String str, @Json(name = "payload") Map<String, ? extends Object> map) {
        this.productId = str;
        this.payload = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefaultPaymentMethodUnifiedSetStatusRequest copy$default(DefaultPaymentMethodUnifiedSetStatusRequest defaultPaymentMethodUnifiedSetStatusRequest, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultPaymentMethodUnifiedSetStatusRequest.productId;
        }
        if ((i & 2) != 0) {
            map = defaultPaymentMethodUnifiedSetStatusRequest.payload;
        }
        return defaultPaymentMethodUnifiedSetStatusRequest.copy(str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final Map<String, Object> component2() {
        return this.payload;
    }

    public final DefaultPaymentMethodUnifiedSetStatusRequest copy(@Json(name = "product_id") String productId, @Json(name = "payload") Map<String, ? extends Object> payload) {
        return new DefaultPaymentMethodUnifiedSetStatusRequest(productId, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultPaymentMethodUnifiedSetStatusRequest)) {
            return false;
        }
        DefaultPaymentMethodUnifiedSetStatusRequest defaultPaymentMethodUnifiedSetStatusRequest = (DefaultPaymentMethodUnifiedSetStatusRequest) other;
        return jl40.l(this.productId, defaultPaymentMethodUnifiedSetStatusRequest.productId) && jl40.l(this.payload, defaultPaymentMethodUnifiedSetStatusRequest.payload);
    }

    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return this.payload.hashCode() + (this.productId.hashCode() * 31);
    }

    public String toString() {
        return xvz.j("DefaultPaymentMethodUnifiedSetStatusRequest(productId=", this.productId, ", payload=", Extension.C_BRAKE, this.payload);
    }
}
