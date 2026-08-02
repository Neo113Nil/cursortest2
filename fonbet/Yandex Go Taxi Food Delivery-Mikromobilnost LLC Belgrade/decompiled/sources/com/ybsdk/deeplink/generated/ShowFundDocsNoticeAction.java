package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b*\u0010\u0017R \u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/ybsdk/deeplink/generated/ShowFundDocsNoticeAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "amount", "", "currency", "transferId", "targetAgreementId", "sourceAgreementId", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()D", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/ShowFundDocsNoticeAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_REQUEST_D, "getAmount", "Ljava/lang/String;", "getCurrency", "getTransferId", "getTargetAgreementId", "getSourceAgreementId", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShowFundDocsNoticeAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<ShowFundDocsNoticeAction> CREATOR = new Creator();
    private final double amount;
    private final String currency;
    private final Uri deeplinkUri;
    private final String sourceAgreementId;
    private final String targetAgreementId;
    private final String transferId;

    public ShowFundDocsNoticeAction(double d, String str, String str2, String str3, String str4) {
        this.amount = d;
        this.currency = str;
        this.transferId = str2;
        this.targetAgreementId = str3;
        this.sourceAgreementId = str4;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/show_fund_docs_notice");
        l.appendQueryParameter("amount", String.valueOf(d));
        l.appendQueryParameter("currency", str);
        l.appendQueryParameter("transfer_id", str2);
        l.appendQueryParameter("target_agreement_id", str3);
        l.appendQueryParameter("source_agreement_id", str4);
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ ShowFundDocsNoticeAction copy$default(ShowFundDocsNoticeAction showFundDocsNoticeAction, double d, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = showFundDocsNoticeAction.amount;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            str = showFundDocsNoticeAction.currency;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = showFundDocsNoticeAction.transferId;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = showFundDocsNoticeAction.targetAgreementId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = showFundDocsNoticeAction.sourceAgreementId;
        }
        return showFundDocsNoticeAction.copy(d2, str5, str6, str7, str4);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final ShowFundDocsNoticeAction copy(double amount, String currency, String transferId, String targetAgreementId, String sourceAgreementId) {
        return new ShowFundDocsNoticeAction(amount, currency, transferId, targetAgreementId, sourceAgreementId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowFundDocsNoticeAction)) {
            return false;
        }
        ShowFundDocsNoticeAction showFundDocsNoticeAction = (ShowFundDocsNoticeAction) other;
        return Double.compare(this.amount, showFundDocsNoticeAction.amount) == 0 && jl40.l(this.currency, showFundDocsNoticeAction.currency) && jl40.l(this.transferId, showFundDocsNoticeAction.transferId) && jl40.l(this.targetAgreementId, showFundDocsNoticeAction.targetAgreementId) && jl40.l(this.sourceAgreementId, showFundDocsNoticeAction.sourceAgreementId);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        return this.sourceAgreementId.hashCode() + unr0.b(unr0.b(unr0.b(Double.hashCode(this.amount) * 31, 31, this.currency), 31, this.transferId), 31, this.targetAgreementId);
    }

    public String toString() {
        double d = this.amount;
        String str = this.currency;
        String str2 = this.transferId;
        String str3 = this.targetAgreementId;
        String str4 = this.sourceAgreementId;
        StringBuilder sb = new StringBuilder("ShowFundDocsNoticeAction(amount=");
        sb.append(d);
        sb.append(", currency=");
        sb.append(str);
        g8e.D(sb, ", transferId=", str2, ", targetAgreementId=", str3);
        return unr0.r(sb, ", sourceAgreementId=", str4, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.amount);
        dest.writeString(this.currency);
        dest.writeString(this.transferId);
        dest.writeString(this.targetAgreementId);
        dest.writeString(this.sourceAgreementId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShowFundDocsNoticeAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShowFundDocsNoticeAction createFromParcel(Parcel parcel) {
            return new ShowFundDocsNoticeAction(parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShowFundDocsNoticeAction[] newArray(int i) {
            return new ShowFundDocsNoticeAction[i];
        }
    }
}
