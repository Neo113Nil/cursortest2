package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/DivKitTransactionsLimitFeature;", "", "", "nextTransactionsLimit", "firstTransactionsLimit", "pendingTransactionsLimit", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/ybsdk/rconfig/configs/DivKitTransactionsLimitFeature;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getNextTransactionsLimit", "getFirstTransactionsLimit", "getPendingTransactionsLimit", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DivKitTransactionsLimitFeature {

    @Json(name = "limit_first_transactions")
    private final int firstTransactionsLimit;

    @Json(name = "limit_next_transactions")
    private final int nextTransactionsLimit;

    @Json(name = "limit_pending_transactions")
    private final int pendingTransactionsLimit;

    public DivKitTransactionsLimitFeature(int i, int i2, int i3) {
        this.nextTransactionsLimit = i;
        this.firstTransactionsLimit = i2;
        this.pendingTransactionsLimit = i3;
    }

    public static /* synthetic */ DivKitTransactionsLimitFeature copy$default(DivKitTransactionsLimitFeature divKitTransactionsLimitFeature, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = divKitTransactionsLimitFeature.nextTransactionsLimit;
        }
        if ((i4 & 2) != 0) {
            i2 = divKitTransactionsLimitFeature.firstTransactionsLimit;
        }
        if ((i4 & 4) != 0) {
            i3 = divKitTransactionsLimitFeature.pendingTransactionsLimit;
        }
        return divKitTransactionsLimitFeature.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getNextTransactionsLimit() {
        return this.nextTransactionsLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFirstTransactionsLimit() {
        return this.firstTransactionsLimit;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPendingTransactionsLimit() {
        return this.pendingTransactionsLimit;
    }

    public final DivKitTransactionsLimitFeature copy(int nextTransactionsLimit, int firstTransactionsLimit, int pendingTransactionsLimit) {
        return new DivKitTransactionsLimitFeature(nextTransactionsLimit, firstTransactionsLimit, pendingTransactionsLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivKitTransactionsLimitFeature)) {
            return false;
        }
        DivKitTransactionsLimitFeature divKitTransactionsLimitFeature = (DivKitTransactionsLimitFeature) other;
        return this.nextTransactionsLimit == divKitTransactionsLimitFeature.nextTransactionsLimit && this.firstTransactionsLimit == divKitTransactionsLimitFeature.firstTransactionsLimit && this.pendingTransactionsLimit == divKitTransactionsLimitFeature.pendingTransactionsLimit;
    }

    public final int getFirstTransactionsLimit() {
        return this.firstTransactionsLimit;
    }

    public final int getNextTransactionsLimit() {
        return this.nextTransactionsLimit;
    }

    public final int getPendingTransactionsLimit() {
        return this.pendingTransactionsLimit;
    }

    public int hashCode() {
        return Integer.hashCode(this.pendingTransactionsLimit) + oyr.b(this.firstTransactionsLimit, Integer.hashCode(this.nextTransactionsLimit) * 31, 31);
    }

    public String toString() {
        return oyr.m(this.pendingTransactionsLimit, Extension.C_BRAKE, b64.s(this.nextTransactionsLimit, this.firstTransactionsLimit, "DivKitTransactionsLimitFeature(nextTransactionsLimit=", ", firstTransactionsLimit=", ", pendingTransactionsLimit="));
    }
}
