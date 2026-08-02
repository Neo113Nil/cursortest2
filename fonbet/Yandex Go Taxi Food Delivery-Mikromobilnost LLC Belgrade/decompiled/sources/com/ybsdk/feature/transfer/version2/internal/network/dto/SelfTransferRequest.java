package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTransferRequest;", "", "sourceId", "", "targetId", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getSourceId", "()Ljava/lang/String;", "getTargetId", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelfTransferRequest {
    private final Money money;
    private final String sourceId;
    private final String targetId;

    public SelfTransferRequest(@Json(name = "source_agreement_id") String str, @Json(name = "target_agreement_id") String str2, @Json(name = "money") Money money) {
        this.sourceId = str;
        this.targetId = str2;
        this.money = money;
    }

    public static /* synthetic */ SelfTransferRequest copy$default(SelfTransferRequest selfTransferRequest, String str, String str2, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selfTransferRequest.sourceId;
        }
        if ((i & 2) != 0) {
            str2 = selfTransferRequest.targetId;
        }
        if ((i & 4) != 0) {
            money = selfTransferRequest.money;
        }
        return selfTransferRequest.copy(str, str2, money);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTargetId() {
        return this.targetId;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    public final SelfTransferRequest copy(@Json(name = "source_agreement_id") String sourceId, @Json(name = "target_agreement_id") String targetId, @Json(name = "money") Money money) {
        return new SelfTransferRequest(sourceId, targetId, money);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfTransferRequest)) {
            return false;
        }
        SelfTransferRequest selfTransferRequest = (SelfTransferRequest) other;
        return jl40.l(this.sourceId, selfTransferRequest.sourceId) && jl40.l(this.targetId, selfTransferRequest.targetId) && jl40.l(this.money, selfTransferRequest.money);
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getTargetId() {
        return this.targetId;
    }

    public int hashCode() {
        return this.money.hashCode() + unr0.b(this.sourceId.hashCode() * 31, 31, this.targetId);
    }

    public String toString() {
        String str = this.sourceId;
        String str2 = this.targetId;
        Money money = this.money;
        StringBuilder v = b64.v("SelfTransferRequest(sourceId=", str, ", targetId=", str2, ", money=");
        v.append(money);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
