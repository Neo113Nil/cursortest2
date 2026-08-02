package com.yandex.plus.pay.repository.api.model.mailingads;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.repository.api.model.offers.LegalInfo;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006,"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/repository/api/model/offers/LegalInfo;", "agreementText", "Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$Status;", "defaultAgreementStatus", "Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$TextLogic;", "textLogic", "<init>", "(Lcom/yandex/plus/pay/repository/api/model/offers/LegalInfo;Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$Status;Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$TextLogic;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/repository/api/model/offers/LegalInfo;", "component2", "()Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$Status;", "component3", "()Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$TextLogic;", "copy", "(Lcom/yandex/plus/pay/repository/api/model/offers/LegalInfo;Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$Status;Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$TextLogic;)Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/repository/api/model/offers/LegalInfo;", "getAgreementText", "Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$Status;", "getDefaultAgreementStatus", "Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$TextLogic;", "getTextLogic", "Status", "TextLogic", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MailingAdsAgreement implements Parcelable {
    public static final Parcelable.Creator<MailingAdsAgreement> CREATOR = new Creator();
    private final LegalInfo agreementText;
    private final Status defaultAgreementStatus;
    private final TextLogic textLogic;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$Status;", "", "ALLOW", "REFUSE", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status ALLOW;
        public static final Status REFUSE;

        static {
            Status status = new Status("ALLOW", 0);
            ALLOW = status;
            Status status2 = new Status("REFUSE", 1);
            REFUSE = status2;
            Status[] statusArr = {status, status2};
            $VALUES = statusArr;
            $ENTRIES = a.a(statusArr);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/mailingads/MailingAdsAgreement$TextLogic;", "", "DIRECT", "INVERTED", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TextLogic {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TextLogic[] $VALUES;
        public static final TextLogic DIRECT;
        public static final TextLogic INVERTED;

        static {
            TextLogic textLogic = new TextLogic("DIRECT", 0);
            DIRECT = textLogic;
            TextLogic textLogic2 = new TextLogic("INVERTED", 1);
            INVERTED = textLogic2;
            TextLogic[] textLogicArr = {textLogic, textLogic2};
            $VALUES = textLogicArr;
            $ENTRIES = a.a(textLogicArr);
        }

        public static TextLogic valueOf(String str) {
            return (TextLogic) Enum.valueOf(TextLogic.class, str);
        }

        public static TextLogic[] values() {
            return (TextLogic[]) $VALUES.clone();
        }
    }

    public MailingAdsAgreement(LegalInfo legalInfo, Status status, TextLogic textLogic) {
        this.agreementText = legalInfo;
        this.defaultAgreementStatus = status;
        this.textLogic = textLogic;
    }

    public static /* synthetic */ MailingAdsAgreement copy$default(MailingAdsAgreement mailingAdsAgreement, LegalInfo legalInfo, Status status, TextLogic textLogic, int i, Object obj) {
        if ((i & 1) != 0) {
            legalInfo = mailingAdsAgreement.agreementText;
        }
        if ((i & 2) != 0) {
            status = mailingAdsAgreement.defaultAgreementStatus;
        }
        if ((i & 4) != 0) {
            textLogic = mailingAdsAgreement.textLogic;
        }
        return mailingAdsAgreement.copy(legalInfo, status, textLogic);
    }

    /* renamed from: component1, reason: from getter */
    public final LegalInfo getAgreementText() {
        return this.agreementText;
    }

    /* renamed from: component2, reason: from getter */
    public final Status getDefaultAgreementStatus() {
        return this.defaultAgreementStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final TextLogic getTextLogic() {
        return this.textLogic;
    }

    public final MailingAdsAgreement copy(LegalInfo agreementText, Status defaultAgreementStatus, TextLogic textLogic) {
        return new MailingAdsAgreement(agreementText, defaultAgreementStatus, textLogic);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MailingAdsAgreement)) {
            return false;
        }
        MailingAdsAgreement mailingAdsAgreement = (MailingAdsAgreement) other;
        return jl40.l(this.agreementText, mailingAdsAgreement.agreementText) && this.defaultAgreementStatus == mailingAdsAgreement.defaultAgreementStatus && this.textLogic == mailingAdsAgreement.textLogic;
    }

    public final LegalInfo getAgreementText() {
        return this.agreementText;
    }

    public final Status getDefaultAgreementStatus() {
        return this.defaultAgreementStatus;
    }

    public final TextLogic getTextLogic() {
        return this.textLogic;
    }

    public int hashCode() {
        return this.textLogic.hashCode() + ((this.defaultAgreementStatus.hashCode() + (this.agreementText.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "MailingAdsAgreement(agreementText=" + this.agreementText + ", defaultAgreementStatus=" + this.defaultAgreementStatus + ", textLogic=" + this.textLogic + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.agreementText.writeToParcel(dest, flags);
        dest.writeString(this.defaultAgreementStatus.name());
        dest.writeString(this.textLogic.name());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MailingAdsAgreement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MailingAdsAgreement createFromParcel(Parcel parcel) {
            return new MailingAdsAgreement(LegalInfo.CREATOR.createFromParcel(parcel), Status.valueOf(parcel.readString()), TextLogic.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MailingAdsAgreement[] newArray(int i) {
            return new MailingAdsAgreement[i];
        }
    }
}
