package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00010B\u0083\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0085\u0001\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00061"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositTransactionStatusResponse;", "", "transactionId", "", "agreementId", ACSPConstants.STATUS, "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositTransactionStatusResponse$Status;", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "url3ds", "buttonText", "buttonAction", "secondaryButtonText", "secondaryButtonAction", "closeAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositTransactionStatusResponse$Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTransactionId", "()Ljava/lang/String;", "getAgreementId", "getStatus", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositTransactionStatusResponse$Status;", "getTitle", "getDescription", "getUrl3ds", "getButtonText", "getButtonAction", "getSecondaryButtonText", "getSecondaryButtonAction", "getCloseAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditDepositTransactionStatusResponse {
    private final String agreementId;
    private final String buttonAction;
    private final String buttonText;
    private final String closeAction;
    private final String description;
    private final String secondaryButtonAction;
    private final String secondaryButtonText;
    private final Status status;
    private final String title;
    private final String transactionId;
    private final String url3ds;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositTransactionStatusResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "REQUIRED_3DS", TlsConstants.TLS_FINISHED, "FAILED", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status PENDING = new Status("PENDING", 0);
        public static final Status REQUIRED_3DS = new Status("REQUIRED_3DS", 1);
        public static final Status FINISHED = new Status(TlsConstants.TLS_FINISHED, 2);
        public static final Status FAILED = new Status("FAILED", 3);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PENDING, REQUIRED_3DS, FINISHED, FAILED};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public CreditDepositTransactionStatusResponse(@Json(name = "transaction_id") String str, @Json(name = "agreement_id") String str2, @Json(name = "status") Status status, @Json(name = "title") String str3, @Json(name = "description") String str4, @Json(name = "url_3ds") String str5, @Json(name = "button_text") String str6, @Json(name = "button_action") String str7, @Json(name = "secondary_button_text") String str8, @Json(name = "secondary_button_action") String str9, @Json(name = "close_action") String str10) {
        this.transactionId = str;
        this.agreementId = str2;
        this.status = status;
        this.title = str3;
        this.description = str4;
        this.url3ds = str5;
        this.buttonText = str6;
        this.buttonAction = str7;
        this.secondaryButtonText = str8;
        this.secondaryButtonAction = str9;
        this.closeAction = str10;
    }

    public static /* synthetic */ CreditDepositTransactionStatusResponse copy$default(CreditDepositTransactionStatusResponse creditDepositTransactionStatusResponse, String str, String str2, Status status, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditDepositTransactionStatusResponse.transactionId;
        }
        if ((i & 2) != 0) {
            str2 = creditDepositTransactionStatusResponse.agreementId;
        }
        if ((i & 4) != 0) {
            status = creditDepositTransactionStatusResponse.status;
        }
        if ((i & 8) != 0) {
            str3 = creditDepositTransactionStatusResponse.title;
        }
        if ((i & 16) != 0) {
            str4 = creditDepositTransactionStatusResponse.description;
        }
        if ((i & 32) != 0) {
            str5 = creditDepositTransactionStatusResponse.url3ds;
        }
        if ((i & 64) != 0) {
            str6 = creditDepositTransactionStatusResponse.buttonText;
        }
        if ((i & 128) != 0) {
            str7 = creditDepositTransactionStatusResponse.buttonAction;
        }
        if ((i & 256) != 0) {
            str8 = creditDepositTransactionStatusResponse.secondaryButtonText;
        }
        if ((i & 512) != 0) {
            str9 = creditDepositTransactionStatusResponse.secondaryButtonAction;
        }
        if ((i & 1024) != 0) {
            str10 = creditDepositTransactionStatusResponse.closeAction;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        String str17 = str4;
        Status status2 = status;
        return creditDepositTransactionStatusResponse.copy(str, str2, status2, str3, str17, str15, str16, str13, str14, str11, str12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSecondaryButtonAction() {
        return this.secondaryButtonAction;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCloseAction() {
        return this.closeAction;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUrl3ds() {
        return this.url3ds;
    }

    /* renamed from: component7, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getButtonAction() {
        return this.buttonAction;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final CreditDepositTransactionStatusResponse copy(@Json(name = "transaction_id") String transactionId, @Json(name = "agreement_id") String agreementId, @Json(name = "status") Status status, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "url_3ds") String url3ds, @Json(name = "button_text") String buttonText, @Json(name = "button_action") String buttonAction, @Json(name = "secondary_button_text") String secondaryButtonText, @Json(name = "secondary_button_action") String secondaryButtonAction, @Json(name = "close_action") String closeAction) {
        return new CreditDepositTransactionStatusResponse(transactionId, agreementId, status, title, description, url3ds, buttonText, buttonAction, secondaryButtonText, secondaryButtonAction, closeAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditDepositTransactionStatusResponse)) {
            return false;
        }
        CreditDepositTransactionStatusResponse creditDepositTransactionStatusResponse = (CreditDepositTransactionStatusResponse) other;
        return jl40.l(this.transactionId, creditDepositTransactionStatusResponse.transactionId) && jl40.l(this.agreementId, creditDepositTransactionStatusResponse.agreementId) && this.status == creditDepositTransactionStatusResponse.status && jl40.l(this.title, creditDepositTransactionStatusResponse.title) && jl40.l(this.description, creditDepositTransactionStatusResponse.description) && jl40.l(this.url3ds, creditDepositTransactionStatusResponse.url3ds) && jl40.l(this.buttonText, creditDepositTransactionStatusResponse.buttonText) && jl40.l(this.buttonAction, creditDepositTransactionStatusResponse.buttonAction) && jl40.l(this.secondaryButtonText, creditDepositTransactionStatusResponse.secondaryButtonText) && jl40.l(this.secondaryButtonAction, creditDepositTransactionStatusResponse.secondaryButtonAction) && jl40.l(this.closeAction, creditDepositTransactionStatusResponse.closeAction);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getButtonAction() {
        return this.buttonAction;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getCloseAction() {
        return this.closeAction;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSecondaryButtonAction() {
        return this.secondaryButtonAction;
    }

    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getUrl3ds() {
        return this.url3ds;
    }

    public int hashCode() {
        int b = unr0.b((this.status.hashCode() + unr0.b(this.transactionId.hashCode() * 31, 31, this.agreementId)) * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url3ds;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonAction;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.secondaryButtonText;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.secondaryButtonAction;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.closeAction;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.transactionId;
        String str2 = this.agreementId;
        Status status = this.status;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.url3ds;
        String str6 = this.buttonText;
        String str7 = this.buttonAction;
        String str8 = this.secondaryButtonText;
        String str9 = this.secondaryButtonAction;
        String str10 = this.closeAction;
        StringBuilder v = b64.v("CreditDepositTransactionStatusResponse(transactionId=", str, ", agreementId=", str2, ", status=");
        v.append(status);
        v.append(", title=");
        v.append(str3);
        v.append(", description=");
        g8e.D(v, str4, ", url3ds=", str5, ", buttonText=");
        g8e.D(v, str6, ", buttonAction=", str7, ", secondaryButtonText=");
        g8e.D(v, str8, ", secondaryButtonAction=", str9, ", closeAction=");
        return oyr.t(v, str10, Extension.C_BRAKE);
    }
}
