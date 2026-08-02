package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/YbCardDetailsResponse;", "", "number", "", "cvv", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "getCvv", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbCardDetailsResponse {
    private final String cvv;
    private final String number;

    public YbCardDetailsResponse(@Json(name = "number") String str, @Json(name = "cvv2") String str2) {
        this.number = str;
        this.cvv = str2;
    }

    public static /* synthetic */ YbCardDetailsResponse copy$default(YbCardDetailsResponse ybCardDetailsResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybCardDetailsResponse.number;
        }
        if ((i & 2) != 0) {
            str2 = ybCardDetailsResponse.cvv;
        }
        return ybCardDetailsResponse.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    public final YbCardDetailsResponse copy(@Json(name = "number") String number, @Json(name = "cvv2") String cvv) {
        return new YbCardDetailsResponse(number, cvv);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCardDetailsResponse)) {
            return false;
        }
        YbCardDetailsResponse ybCardDetailsResponse = (YbCardDetailsResponse) other;
        return jl40.l(this.number, ybCardDetailsResponse.number) && jl40.l(this.cvv, ybCardDetailsResponse.cvv);
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        return this.cvv.hashCode() + (this.number.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("YbCardDetailsResponse(number=", this.number, ", cvv=", this.cvv, Extension.C_BRAKE);
    }
}
