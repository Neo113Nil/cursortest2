package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/AftInfo;", "", "trustId", "", "<init>", "(Ljava/lang/String;)V", "getTrustId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AftInfo {
    private final String trustId;

    public AftInfo(@Json(name = "trust_id") String str) {
        this.trustId = str;
    }

    public static /* synthetic */ AftInfo copy$default(AftInfo aftInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aftInfo.trustId;
        }
        return aftInfo.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTrustId() {
        return this.trustId;
    }

    public final AftInfo copy(@Json(name = "trust_id") String trustId) {
        return new AftInfo(trustId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AftInfo) && jl40.l(this.trustId, ((AftInfo) other).trustId);
    }

    public final String getTrustId() {
        return this.trustId;
    }

    public int hashCode() {
        return this.trustId.hashCode();
    }

    public String toString() {
        return oyr.p("AftInfo(trustId=", this.trustId, Extension.C_BRAKE);
    }
}
