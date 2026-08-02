package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodAftInfoResponse;", "", "system", "", "number", "trustId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSystem", "()Ljava/lang/String;", "getNumber", "getTrustId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditPaymentMethodAftInfoResponse {
    private final String number;
    private final String system;
    private final String trustId;

    public CreditPaymentMethodAftInfoResponse(@Json(name = "system") String str, @Json(name = "number") String str2, @Json(name = "trust_id") String str3) {
        this.system = str;
        this.number = str2;
        this.trustId = str3;
    }

    public static /* synthetic */ CreditPaymentMethodAftInfoResponse copy$default(CreditPaymentMethodAftInfoResponse creditPaymentMethodAftInfoResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditPaymentMethodAftInfoResponse.system;
        }
        if ((i & 2) != 0) {
            str2 = creditPaymentMethodAftInfoResponse.number;
        }
        if ((i & 4) != 0) {
            str3 = creditPaymentMethodAftInfoResponse.trustId;
        }
        return creditPaymentMethodAftInfoResponse.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSystem() {
        return this.system;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTrustId() {
        return this.trustId;
    }

    public final CreditPaymentMethodAftInfoResponse copy(@Json(name = "system") String system, @Json(name = "number") String number, @Json(name = "trust_id") String trustId) {
        return new CreditPaymentMethodAftInfoResponse(system, number, trustId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditPaymentMethodAftInfoResponse)) {
            return false;
        }
        CreditPaymentMethodAftInfoResponse creditPaymentMethodAftInfoResponse = (CreditPaymentMethodAftInfoResponse) other;
        return jl40.l(this.system, creditPaymentMethodAftInfoResponse.system) && jl40.l(this.number, creditPaymentMethodAftInfoResponse.number) && jl40.l(this.trustId, creditPaymentMethodAftInfoResponse.trustId);
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getSystem() {
        return this.system;
    }

    public final String getTrustId() {
        return this.trustId;
    }

    public int hashCode() {
        int b = unr0.b(this.system.hashCode() * 31, 31, this.number);
        String str = this.trustId;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.system;
        String str2 = this.number;
        return oyr.t(b64.v("CreditPaymentMethodAftInfoResponse(system=", str, ", number=", str2, ", trustId="), this.trustId, Extension.C_BRAKE);
    }

    public /* synthetic */ CreditPaymentMethodAftInfoResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
