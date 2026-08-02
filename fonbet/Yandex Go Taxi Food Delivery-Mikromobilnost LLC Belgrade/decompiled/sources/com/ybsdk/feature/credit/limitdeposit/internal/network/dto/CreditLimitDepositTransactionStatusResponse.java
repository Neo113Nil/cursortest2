package com.ybsdk.feature.credit.limitdeposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ja\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositTransactionStatusResponse;", "", "transactionId", "", "agreementId", ACSPConstants.STATUS, "Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositTransactionStatusResponse$Status;", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "buttonText", "url3ds", "closeAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositTransactionStatusResponse$Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTransactionId", "()Ljava/lang/String;", "getAgreementId", "getStatus", "()Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositTransactionStatusResponse$Status;", "getTitle", "getDescription", "getButtonText", "getUrl3ds", "getCloseAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitDepositTransactionStatusResponse {
    private final String agreementId;
    private final String buttonText;
    private final String closeAction;
    private final String description;
    private final Status status;
    private final String title;
    private final String transactionId;
    private final String url3ds;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/credit/limitdeposit/internal/network/dto/CreditLimitDepositTransactionStatusResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "REQUIRED_3DS", TlsConstants.TLS_FINISHED, "FAILED", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public CreditLimitDepositTransactionStatusResponse(@Json(name = "transaction_id") String str, @Json(name = "agreement_id") String str2, @Json(name = "status") Status status, @Json(name = "title") String str3, @Json(name = "description") String str4, @Json(name = "button_text") String str5, @Json(name = "url_3ds") String str6, @Json(name = "close_action") String str7) {
        this.transactionId = str;
        this.agreementId = str2;
        this.status = status;
        this.title = str3;
        this.description = str4;
        this.buttonText = str5;
        this.url3ds = str6;
        this.closeAction = str7;
    }

    public static /* synthetic */ CreditLimitDepositTransactionStatusResponse copy$default(CreditLimitDepositTransactionStatusResponse creditLimitDepositTransactionStatusResponse, String str, String str2, Status status, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitDepositTransactionStatusResponse.transactionId;
        }
        if ((i & 2) != 0) {
            str2 = creditLimitDepositTransactionStatusResponse.agreementId;
        }
        if ((i & 4) != 0) {
            status = creditLimitDepositTransactionStatusResponse.status;
        }
        if ((i & 8) != 0) {
            str3 = creditLimitDepositTransactionStatusResponse.title;
        }
        if ((i & 16) != 0) {
            str4 = creditLimitDepositTransactionStatusResponse.description;
        }
        if ((i & 32) != 0) {
            str5 = creditLimitDepositTransactionStatusResponse.buttonText;
        }
        if ((i & 64) != 0) {
            str6 = creditLimitDepositTransactionStatusResponse.url3ds;
        }
        if ((i & 128) != 0) {
            str7 = creditLimitDepositTransactionStatusResponse.closeAction;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return creditLimitDepositTransactionStatusResponse.copy(str, str2, status, str3, str10, str11, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
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
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUrl3ds() {
        return this.url3ds;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCloseAction() {
        return this.closeAction;
    }

    public final CreditLimitDepositTransactionStatusResponse copy(@Json(name = "transaction_id") String transactionId, @Json(name = "agreement_id") String agreementId, @Json(name = "status") Status status, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "button_text") String buttonText, @Json(name = "url_3ds") String url3ds, @Json(name = "close_action") String closeAction) {
        return new CreditLimitDepositTransactionStatusResponse(transactionId, agreementId, status, title, description, buttonText, url3ds, closeAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitDepositTransactionStatusResponse)) {
            return false;
        }
        CreditLimitDepositTransactionStatusResponse creditLimitDepositTransactionStatusResponse = (CreditLimitDepositTransactionStatusResponse) other;
        return jl40.l(this.transactionId, creditLimitDepositTransactionStatusResponse.transactionId) && jl40.l(this.agreementId, creditLimitDepositTransactionStatusResponse.agreementId) && this.status == creditLimitDepositTransactionStatusResponse.status && jl40.l(this.title, creditLimitDepositTransactionStatusResponse.title) && jl40.l(this.description, creditLimitDepositTransactionStatusResponse.description) && jl40.l(this.buttonText, creditLimitDepositTransactionStatusResponse.buttonText) && jl40.l(this.url3ds, creditLimitDepositTransactionStatusResponse.url3ds) && jl40.l(this.closeAction, creditLimitDepositTransactionStatusResponse.closeAction);
    }

    public final String getAgreementId() {
        return this.agreementId;
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
        String str2 = this.buttonText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url3ds;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.closeAction;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.transactionId;
        String str2 = this.agreementId;
        Status status = this.status;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.buttonText;
        String str6 = this.url3ds;
        String str7 = this.closeAction;
        StringBuilder v = b64.v("CreditLimitDepositTransactionStatusResponse(transactionId=", str, ", agreementId=", str2, ", status=");
        v.append(status);
        v.append(", title=");
        v.append(str3);
        v.append(", description=");
        g8e.D(v, str4, ", buttonText=", str5, ", url3ds=");
        return g8e.r(v, str6, ", closeAction=", str7, Extension.C_BRAKE);
    }
}
