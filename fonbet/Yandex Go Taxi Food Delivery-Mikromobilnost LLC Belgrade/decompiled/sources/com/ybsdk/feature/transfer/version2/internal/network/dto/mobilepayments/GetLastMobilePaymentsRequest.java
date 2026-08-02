package com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetLastMobilePaymentsRequest;", "", "limit", "", "<init>", "(Ljava/lang/Integer;)V", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetLastMobilePaymentsRequest;", "equals", "", "other", "hashCode", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetLastMobilePaymentsRequest {
    private final Integer limit;

    public GetLastMobilePaymentsRequest(@Json(name = "limit") Integer num) {
        this.limit = num;
    }

    public static /* synthetic */ GetLastMobilePaymentsRequest copy$default(GetLastMobilePaymentsRequest getLastMobilePaymentsRequest, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = getLastMobilePaymentsRequest.limit;
        }
        return getLastMobilePaymentsRequest.copy(num);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    public final GetLastMobilePaymentsRequest copy(@Json(name = "limit") Integer limit) {
        return new GetLastMobilePaymentsRequest(limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetLastMobilePaymentsRequest) && jl40.l(this.limit, ((GetLastMobilePaymentsRequest) other).limit);
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public int hashCode() {
        Integer num = this.limit;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "GetLastMobilePaymentsRequest(limit=" + this.limit + Extension.C_BRAKE;
    }
}
