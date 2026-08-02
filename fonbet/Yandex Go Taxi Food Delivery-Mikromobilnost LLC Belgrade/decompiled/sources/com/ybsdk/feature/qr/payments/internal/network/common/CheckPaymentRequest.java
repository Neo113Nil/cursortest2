package com.ybsdk.feature.qr.payments.internal.network.common;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/common/CheckPaymentRequest;", "", "agreementId", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "qrcLink", "qrcScanId", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getQrcLink", "getQrcScanId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckPaymentRequest {
    private final String agreementId;
    private final Money money;
    private final String qrcLink;
    private final String qrcScanId;

    public CheckPaymentRequest(@Json(name = "agreement_id") String str, @Json(name = "money") Money money, @Json(name = "qrc_link") String str2, @Json(name = "qrc_scan_id") String str3) {
        this.agreementId = str;
        this.money = money;
        this.qrcLink = str2;
        this.qrcScanId = str3;
    }

    public static /* synthetic */ CheckPaymentRequest copy$default(CheckPaymentRequest checkPaymentRequest, String str, Money money, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkPaymentRequest.agreementId;
        }
        if ((i & 2) != 0) {
            money = checkPaymentRequest.money;
        }
        if ((i & 4) != 0) {
            str2 = checkPaymentRequest.qrcLink;
        }
        if ((i & 8) != 0) {
            str3 = checkPaymentRequest.qrcScanId;
        }
        return checkPaymentRequest.copy(str, money, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQrcLink() {
        return this.qrcLink;
    }

    /* renamed from: component4, reason: from getter */
    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public final CheckPaymentRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "money") Money money, @Json(name = "qrc_link") String qrcLink, @Json(name = "qrc_scan_id") String qrcScanId) {
        return new CheckPaymentRequest(agreementId, money, qrcLink, qrcScanId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPaymentRequest)) {
            return false;
        }
        CheckPaymentRequest checkPaymentRequest = (CheckPaymentRequest) other;
        return jl40.l(this.agreementId, checkPaymentRequest.agreementId) && jl40.l(this.money, checkPaymentRequest.money) && jl40.l(this.qrcLink, checkPaymentRequest.qrcLink) && jl40.l(this.qrcScanId, checkPaymentRequest.qrcScanId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getQrcLink() {
        return this.qrcLink;
    }

    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public int hashCode() {
        return this.qrcScanId.hashCode() + unr0.b(tse0.c(this.money, this.agreementId.hashCode() * 31, 31), 31, this.qrcLink);
    }

    public String toString() {
        String str = this.agreementId;
        Money money = this.money;
        String str2 = this.qrcLink;
        String str3 = this.qrcScanId;
        StringBuilder sb = new StringBuilder("CheckPaymentRequest(agreementId=");
        sb.append(str);
        sb.append(", money=");
        sb.append(money);
        sb.append(", qrcLink=");
        return g8e.r(sb, str2, ", qrcScanId=", str3, Extension.C_BRAKE);
    }
}
