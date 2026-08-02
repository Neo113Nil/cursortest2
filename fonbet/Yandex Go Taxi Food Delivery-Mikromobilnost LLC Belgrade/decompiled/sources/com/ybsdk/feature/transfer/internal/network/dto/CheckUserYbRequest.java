package com.ybsdk.feature.transfer.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserYbRequest;", "", "transferId", "", "ybId", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "comment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;)V", "getTransferId", "()Ljava/lang/String;", "getYbId", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getComment", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckUserYbRequest {
    private final String comment;
    private final Money money;
    private final String transferId;
    private final String ybId;

    public /* synthetic */ CheckUserYbRequest(String str, String str2, Money money, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ CheckUserYbRequest copy$default(CheckUserYbRequest checkUserYbRequest, String str, String str2, Money money, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkUserYbRequest.transferId;
        }
        if ((i & 2) != 0) {
            str2 = checkUserYbRequest.ybId;
        }
        if ((i & 4) != 0) {
            money = checkUserYbRequest.money;
        }
        if ((i & 8) != 0) {
            str3 = checkUserYbRequest.comment;
        }
        return checkUserYbRequest.copy(str, str2, money, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getYbId() {
        return this.ybId;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component4, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final CheckUserYbRequest copy(@Json(name = "transfer_id") String transferId, @Json(name = "JSON_FIELD_MEMBER_ID") String ybId, @Json(name = "money") Money money, @Json(name = "comment") String comment) {
        return new CheckUserYbRequest(transferId, ybId, money, comment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckUserYbRequest)) {
            return false;
        }
        CheckUserYbRequest checkUserYbRequest = (CheckUserYbRequest) other;
        return jl40.l(this.transferId, checkUserYbRequest.transferId) && jl40.l(this.ybId, checkUserYbRequest.ybId) && jl40.l(this.money, checkUserYbRequest.money) && jl40.l(this.comment, checkUserYbRequest.comment);
    }

    public final String getComment() {
        return this.comment;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public final String getYbId() {
        return this.ybId;
    }

    public int hashCode() {
        int b = unr0.b(this.transferId.hashCode() * 31, 31, this.ybId);
        Money money = this.money;
        int hashCode = (b + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.comment;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.transferId;
        String str2 = this.ybId;
        Money money = this.money;
        String str3 = this.comment;
        StringBuilder v = b64.v("CheckUserYbRequest(transferId=", str, ", ybId=", str2, ", money=");
        v.append(money);
        v.append(", comment=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CheckUserYbRequest(@Json(name = "transfer_id") String str, @Json(name = "JSON_FIELD_MEMBER_ID") String str2, @Json(name = "money") Money money, @Json(name = "comment") String str3) {
        this.transferId = str;
        this.ybId = str2;
        this.money = money;
        this.comment = str3;
    }
}
