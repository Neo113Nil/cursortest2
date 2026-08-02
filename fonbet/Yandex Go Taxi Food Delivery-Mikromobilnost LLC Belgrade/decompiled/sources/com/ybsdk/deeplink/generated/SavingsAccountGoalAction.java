package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016JT\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\u0016R \u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/ybsdk/deeplink/generated/SavingsAccountGoalAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "agreementId", "currency", "title", "subtitle", "", "amount", MetaDataField.DATE_FIELD, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Double;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/SavingsAccountGoalAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "getCurrency", "getTitle", "getSubtitle", "Ljava/lang/Double;", "getAmount", "getDate", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountGoalAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<SavingsAccountGoalAction> CREATOR = new Creator();
    private final String agreementId;
    private final Double amount;
    private final String currency;
    private final String date;
    private final Uri deeplinkUri;
    private final String subtitle;
    private final String title;

    public SavingsAccountGoalAction(String str, String str2, String str3, String str4, Double d, String str5) {
        this.agreementId = str;
        this.currency = str2;
        this.title = str3;
        this.subtitle = str4;
        this.amount = d;
        this.date = str5;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/savings_account_goal", "agreement_id", str);
        j.appendQueryParameter("currency", str2);
        if (str3 != null) {
            j.appendQueryParameter("title", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("subtitle", str4);
        }
        if (d != null) {
            j.appendQueryParameter("amount", String.valueOf(d.doubleValue()));
        }
        if (str5 != null) {
            j.appendQueryParameter(MetaDataField.DATE_FIELD, str5);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ SavingsAccountGoalAction copy$default(SavingsAccountGoalAction savingsAccountGoalAction, String str, String str2, String str3, String str4, Double d, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountGoalAction.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = savingsAccountGoalAction.currency;
        }
        if ((i & 4) != 0) {
            str3 = savingsAccountGoalAction.title;
        }
        if ((i & 8) != 0) {
            str4 = savingsAccountGoalAction.subtitle;
        }
        if ((i & 16) != 0) {
            d = savingsAccountGoalAction.amount;
        }
        if ((i & 32) != 0) {
            str5 = savingsAccountGoalAction.date;
        }
        Double d2 = d;
        String str6 = str5;
        return savingsAccountGoalAction.copy(str, str2, str3, str4, d2, str6);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final SavingsAccountGoalAction copy(String agreementId, String currency, String title, String subtitle, Double amount, String date) {
        return new SavingsAccountGoalAction(agreementId, currency, title, subtitle, amount, date);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountGoalAction)) {
            return false;
        }
        SavingsAccountGoalAction savingsAccountGoalAction = (SavingsAccountGoalAction) other;
        return jl40.l(this.agreementId, savingsAccountGoalAction.agreementId) && jl40.l(this.currency, savingsAccountGoalAction.currency) && jl40.l(this.title, savingsAccountGoalAction.title) && jl40.l(this.subtitle, savingsAccountGoalAction.subtitle) && jl40.l(this.amount, savingsAccountGoalAction.amount) && jl40.l(this.date, savingsAccountGoalAction.date);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDate() {
        return this.date;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.agreementId.hashCode() * 31, 31, this.currency);
        String str = this.title;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.amount;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.date;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.currency;
        String str3 = this.title;
        String str4 = this.subtitle;
        Double d = this.amount;
        String str5 = this.date;
        StringBuilder v = b64.v("SavingsAccountGoalAction(agreementId=", str, ", currency=", str2, ", title=");
        g8e.D(v, str3, ", subtitle=", str4, ", amount=");
        v.append(d);
        v.append(", date=");
        v.append(str5);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.agreementId);
        dest.writeString(this.currency);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        Double d = this.amount;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
        dest.writeString(this.date);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavingsAccountGoalAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountGoalAction createFromParcel(Parcel parcel) {
            return new SavingsAccountGoalAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountGoalAction[] newArray(int i) {
            return new SavingsAccountGoalAction[i];
        }
    }

    public /* synthetic */ SavingsAccountGoalAction(String str, String str2, String str3, String str4, Double d, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "RUB" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : str5);
    }
}
