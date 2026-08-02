package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0001\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0003\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsListRequest;", "", "additionalData", "", "", "<init>", "(Ljava/util/Map;)V", "getAdditionalData", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsListRequest {
    private final Map<String, String> additionalData;

    public SavingsListRequest(@Json(name = "additional_data") Map<String, String> map) {
        this.additionalData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavingsListRequest copy$default(SavingsListRequest savingsListRequest, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = savingsListRequest.additionalData;
        }
        return savingsListRequest.copy(map);
    }

    public final Map<String, String> component1() {
        return this.additionalData;
    }

    public final SavingsListRequest copy(@Json(name = "additional_data") Map<String, String> additionalData) {
        return new SavingsListRequest(additionalData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SavingsListRequest) && jl40.l(this.additionalData, ((SavingsListRequest) other).additionalData);
    }

    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    public int hashCode() {
        Map<String, String> map = this.additionalData;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return nnm.j("SavingsListRequest(additionalData=", Extension.C_BRAKE, this.additionalData);
    }
}
