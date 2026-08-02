package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTopupRequest;", "", "sourceId", "", "targetId", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "autoFundPayload", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AutoFundPayload;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AutoFundPayload;)V", "getSourceId", "()Ljava/lang/String;", "getTargetId", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getAutoFundPayload", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AutoFundPayload;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelfTopupRequest {
    private final AutoFundPayload autoFundPayload;
    private final Money money;
    private final String sourceId;
    private final String targetId;

    public SelfTopupRequest(@Json(name = "source_agreement_id") String str, @Json(name = "target_agreement_id") String str2, @Json(name = "money") Money money, @Json(name = "autofund_payload") AutoFundPayload autoFundPayload) {
        this.sourceId = str;
        this.targetId = str2;
        this.money = money;
        this.autoFundPayload = autoFundPayload;
    }

    public static /* synthetic */ SelfTopupRequest copy$default(SelfTopupRequest selfTopupRequest, String str, String str2, Money money, AutoFundPayload autoFundPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selfTopupRequest.sourceId;
        }
        if ((i & 2) != 0) {
            str2 = selfTopupRequest.targetId;
        }
        if ((i & 4) != 0) {
            money = selfTopupRequest.money;
        }
        if ((i & 8) != 0) {
            autoFundPayload = selfTopupRequest.autoFundPayload;
        }
        return selfTopupRequest.copy(str, str2, money, autoFundPayload);
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

    /* renamed from: component4, reason: from getter */
    public final AutoFundPayload getAutoFundPayload() {
        return this.autoFundPayload;
    }

    public final SelfTopupRequest copy(@Json(name = "source_agreement_id") String sourceId, @Json(name = "target_agreement_id") String targetId, @Json(name = "money") Money money, @Json(name = "autofund_payload") AutoFundPayload autoFundPayload) {
        return new SelfTopupRequest(sourceId, targetId, money, autoFundPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfTopupRequest)) {
            return false;
        }
        SelfTopupRequest selfTopupRequest = (SelfTopupRequest) other;
        return jl40.l(this.sourceId, selfTopupRequest.sourceId) && jl40.l(this.targetId, selfTopupRequest.targetId) && jl40.l(this.money, selfTopupRequest.money) && jl40.l(this.autoFundPayload, selfTopupRequest.autoFundPayload);
    }

    public final AutoFundPayload getAutoFundPayload() {
        return this.autoFundPayload;
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
        int c = tse0.c(this.money, unr0.b(this.sourceId.hashCode() * 31, 31, this.targetId), 31);
        AutoFundPayload autoFundPayload = this.autoFundPayload;
        return c + (autoFundPayload == null ? 0 : autoFundPayload.hashCode());
    }

    public String toString() {
        String str = this.sourceId;
        String str2 = this.targetId;
        Money money = this.money;
        AutoFundPayload autoFundPayload = this.autoFundPayload;
        StringBuilder v = b64.v("SelfTopupRequest(sourceId=", str, ", targetId=", str2, ", money=");
        v.append(money);
        v.append(", autoFundPayload=");
        v.append(autoFundPayload);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
