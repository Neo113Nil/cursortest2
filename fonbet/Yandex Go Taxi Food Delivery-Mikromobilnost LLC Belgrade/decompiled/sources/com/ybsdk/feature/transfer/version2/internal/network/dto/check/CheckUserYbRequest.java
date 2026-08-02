package com.ybsdk.feature.transfer.version2.internal.network.dto.check;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/check/CheckUserYbRequest;", "", "agreementId", "", "receiverPhone", "ybId", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "comment", "transferId", "transferType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getReceiverPhone", "getYbId", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getComment", "getTransferId", "getTransferType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckUserYbRequest {
    private final String agreementId;
    private final String comment;
    private final Money money;
    private final String receiverPhone;
    private final String transferId;
    private final String transferType;
    private final String ybId;

    public CheckUserYbRequest(@Json(name = "agreement_id") String str, @Json(name = "receiver_phone") String str2, @Json(name = "JSON_FIELD_MEMBER_ID") String str3, @Json(name = "money") Money money, @Json(name = "comment") String str4, @Json(name = "transfer_id") String str5, @Json(name = "transfer_type") String str6) {
        this.agreementId = str;
        this.receiverPhone = str2;
        this.ybId = str3;
        this.money = money;
        this.comment = str4;
        this.transferId = str5;
        this.transferType = str6;
    }

    public static /* synthetic */ CheckUserYbRequest copy$default(CheckUserYbRequest checkUserYbRequest, String str, String str2, String str3, Money money, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkUserYbRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = checkUserYbRequest.receiverPhone;
        }
        if ((i & 4) != 0) {
            str3 = checkUserYbRequest.ybId;
        }
        if ((i & 8) != 0) {
            money = checkUserYbRequest.money;
        }
        if ((i & 16) != 0) {
            str4 = checkUserYbRequest.comment;
        }
        if ((i & 32) != 0) {
            str5 = checkUserYbRequest.transferId;
        }
        if ((i & 64) != 0) {
            str6 = checkUserYbRequest.transferType;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return checkUserYbRequest.copy(str, str2, str10, money, str9, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    /* renamed from: component3, reason: from getter */
    public final String getYbId() {
        return this.ybId;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component5, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTransferType() {
        return this.transferType;
    }

    public final CheckUserYbRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "receiver_phone") String receiverPhone, @Json(name = "JSON_FIELD_MEMBER_ID") String ybId, @Json(name = "money") Money money, @Json(name = "comment") String comment, @Json(name = "transfer_id") String transferId, @Json(name = "transfer_type") String transferType) {
        return new CheckUserYbRequest(agreementId, receiverPhone, ybId, money, comment, transferId, transferType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckUserYbRequest)) {
            return false;
        }
        CheckUserYbRequest checkUserYbRequest = (CheckUserYbRequest) other;
        return jl40.l(this.agreementId, checkUserYbRequest.agreementId) && jl40.l(this.receiverPhone, checkUserYbRequest.receiverPhone) && jl40.l(this.ybId, checkUserYbRequest.ybId) && jl40.l(this.money, checkUserYbRequest.money) && jl40.l(this.comment, checkUserYbRequest.comment) && jl40.l(this.transferId, checkUserYbRequest.transferId) && jl40.l(this.transferType, checkUserYbRequest.transferType);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getComment() {
        return this.comment;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public final String getTransferType() {
        return this.transferType;
    }

    public final String getYbId() {
        return this.ybId;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.agreementId.hashCode() * 31, 31, this.receiverPhone), 31, this.ybId);
        Money money = this.money;
        int hashCode = (b + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.comment;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transferId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transferType;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.receiverPhone;
        String str3 = this.ybId;
        Money money = this.money;
        String str4 = this.comment;
        String str5 = this.transferId;
        String str6 = this.transferType;
        StringBuilder v = b64.v("CheckUserYbRequest(agreementId=", str, ", receiverPhone=", str2, ", ybId=");
        v.append(str3);
        v.append(", money=");
        v.append(money);
        v.append(", comment=");
        g8e.D(v, str4, ", transferId=", str5, ", transferType=");
        return oyr.t(v, str6, Extension.C_BRAKE);
    }

    public /* synthetic */ CheckUserYbRequest(String str, String str2, String str3, Money money, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : money, (i & 16) != 0 ? null : str4, str5, str6);
    }
}
