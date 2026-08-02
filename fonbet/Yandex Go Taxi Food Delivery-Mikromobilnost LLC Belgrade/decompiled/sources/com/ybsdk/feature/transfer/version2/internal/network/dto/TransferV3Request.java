package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J_\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferV3Request;", "", "type", "", "version", "", "transferId", "userInfo", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/UserSessionInfoDto;", "paymentInfo", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentInfoDto;", "source", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SourcePaymentSideDto;", "target", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TargetPaymentSideDto;", "actions", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/ActionRequestDto;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/UserSessionInfoDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentInfoDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SourcePaymentSideDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TargetPaymentSideDto;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getVersion", "()I", "getTransferId", "getUserInfo", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/UserSessionInfoDto;", "getPaymentInfo", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentInfoDto;", "getSource", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SourcePaymentSideDto;", "getTarget", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TargetPaymentSideDto;", "getActions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferV3Request {
    private final List<ActionRequestDto> actions;
    private final PaymentInfoDto paymentInfo;
    private final SourcePaymentSideDto source;
    private final TargetPaymentSideDto target;
    private final String transferId;
    private final String type;
    private final UserSessionInfoDto userInfo;
    private final int version;

    public /* synthetic */ TransferV3Request(String str, int i, String str2, UserSessionInfoDto userSessionInfoDto, PaymentInfoDto paymentInfoDto, SourcePaymentSideDto sourcePaymentSideDto, TargetPaymentSideDto targetPaymentSideDto, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, userSessionInfoDto, paymentInfoDto, sourcePaymentSideDto, targetPaymentSideDto, (i2 & 128) != 0 ? EmptyList.a : list);
    }

    public static /* synthetic */ TransferV3Request copy$default(TransferV3Request transferV3Request, String str, int i, String str2, UserSessionInfoDto userSessionInfoDto, PaymentInfoDto paymentInfoDto, SourcePaymentSideDto sourcePaymentSideDto, TargetPaymentSideDto targetPaymentSideDto, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transferV3Request.type;
        }
        if ((i2 & 2) != 0) {
            i = transferV3Request.version;
        }
        if ((i2 & 4) != 0) {
            str2 = transferV3Request.transferId;
        }
        if ((i2 & 8) != 0) {
            userSessionInfoDto = transferV3Request.userInfo;
        }
        if ((i2 & 16) != 0) {
            paymentInfoDto = transferV3Request.paymentInfo;
        }
        if ((i2 & 32) != 0) {
            sourcePaymentSideDto = transferV3Request.source;
        }
        if ((i2 & 64) != 0) {
            targetPaymentSideDto = transferV3Request.target;
        }
        if ((i2 & 128) != 0) {
            list = transferV3Request.actions;
        }
        TargetPaymentSideDto targetPaymentSideDto2 = targetPaymentSideDto;
        List list2 = list;
        PaymentInfoDto paymentInfoDto2 = paymentInfoDto;
        SourcePaymentSideDto sourcePaymentSideDto2 = sourcePaymentSideDto;
        return transferV3Request.copy(str, i, str2, userSessionInfoDto, paymentInfoDto2, sourcePaymentSideDto2, targetPaymentSideDto2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component4, reason: from getter */
    public final UserSessionInfoDto getUserInfo() {
        return this.userInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final PaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final SourcePaymentSideDto getSource() {
        return this.source;
    }

    /* renamed from: component7, reason: from getter */
    public final TargetPaymentSideDto getTarget() {
        return this.target;
    }

    public final List<ActionRequestDto> component8() {
        return this.actions;
    }

    public final TransferV3Request copy(@Json(name = "type") String type, @Json(name = "version") int version, @Json(name = "transfer_id") String transferId, @Json(name = "user_info") UserSessionInfoDto userInfo, @Json(name = "payment_info") PaymentInfoDto paymentInfo, @Json(name = "source") SourcePaymentSideDto source, @Json(name = "target") TargetPaymentSideDto target, @Json(name = "actions") List<ActionRequestDto> actions) {
        return new TransferV3Request(type, version, transferId, userInfo, paymentInfo, source, target, actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferV3Request)) {
            return false;
        }
        TransferV3Request transferV3Request = (TransferV3Request) other;
        return jl40.l(this.type, transferV3Request.type) && this.version == transferV3Request.version && jl40.l(this.transferId, transferV3Request.transferId) && jl40.l(this.userInfo, transferV3Request.userInfo) && jl40.l(this.paymentInfo, transferV3Request.paymentInfo) && jl40.l(this.source, transferV3Request.source) && jl40.l(this.target, transferV3Request.target) && jl40.l(this.actions, transferV3Request.actions);
    }

    public final List<ActionRequestDto> getActions() {
        return this.actions;
    }

    public final PaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    public final SourcePaymentSideDto getSource() {
        return this.source;
    }

    public final TargetPaymentSideDto getTarget() {
        return this.target;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public final String getType() {
        return this.type;
    }

    public final UserSessionInfoDto getUserInfo() {
        return this.userInfo;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.actions.hashCode() + ((this.target.hashCode() + ((this.source.hashCode() + ((this.paymentInfo.hashCode() + ((this.userInfo.hashCode() + unr0.b(oyr.b(this.version, this.type.hashCode() * 31, 31), 31, this.transferId)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.type;
        int i = this.version;
        String str2 = this.transferId;
        UserSessionInfoDto userSessionInfoDto = this.userInfo;
        PaymentInfoDto paymentInfoDto = this.paymentInfo;
        SourcePaymentSideDto sourcePaymentSideDto = this.source;
        TargetPaymentSideDto targetPaymentSideDto = this.target;
        List<ActionRequestDto> list = this.actions;
        StringBuilder u = b64.u(i, "TransferV3Request(type=", str, ", version=", ", transferId=");
        u.append(str2);
        u.append(", userInfo=");
        u.append(userSessionInfoDto);
        u.append(", paymentInfo=");
        u.append(paymentInfoDto);
        u.append(", source=");
        u.append(sourcePaymentSideDto);
        u.append(", target=");
        u.append(targetPaymentSideDto);
        u.append(", actions=");
        u.append(list);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public TransferV3Request(@Json(name = "type") String str, @Json(name = "version") int i, @Json(name = "transfer_id") String str2, @Json(name = "user_info") UserSessionInfoDto userSessionInfoDto, @Json(name = "payment_info") PaymentInfoDto paymentInfoDto, @Json(name = "source") SourcePaymentSideDto sourcePaymentSideDto, @Json(name = "target") TargetPaymentSideDto targetPaymentSideDto, @Json(name = "actions") List<ActionRequestDto> list) {
        this.type = str;
        this.version = i;
        this.transferId = str2;
        this.userInfo = userSessionInfoDto;
        this.paymentInfo = paymentInfoDto;
        this.source = sourcePaymentSideDto;
        this.target = targetPaymentSideDto;
        this.actions = list;
    }
}
