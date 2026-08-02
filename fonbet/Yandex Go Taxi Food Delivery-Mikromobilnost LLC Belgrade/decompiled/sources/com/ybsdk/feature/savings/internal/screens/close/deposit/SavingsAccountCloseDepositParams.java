package com.ybsdk.feature.savings.internal.screens.close.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.savings.internal.entities.SavingsClosingVersion;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u008e\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b<\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b=\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b>\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b?\u0010\u001c¨\u0006@"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/close/deposit/SavingsAccountCloseDepositParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", MetaDataField.DATE_FIELD, "title", "subtitle", "imageUrl", "agreementId", "actionButtonTitle", "secondaryButtonTitle", "Lcom/ybsdk/feature/savings/internal/entities/SavingsClosingVersion;", "version", "amountFull", "amountTotal", "amountProfit", "amountPenalty", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/entities/SavingsClosingVersion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/ybsdk/feature/savings/internal/entities/SavingsClosingVersion;", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/entities/SavingsClosingVersion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/savings/internal/screens/close/deposit/SavingsAccountCloseDepositParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "getTitle", "getSubtitle", "getImageUrl", "getAgreementId", "getActionButtonTitle", "getSecondaryButtonTitle", "Lcom/ybsdk/feature/savings/internal/entities/SavingsClosingVersion;", "getVersion", "getAmountFull", "getAmountTotal", "getAmountProfit", "getAmountPenalty", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountCloseDepositParams implements ScreenParams {
    public static final Parcelable.Creator<SavingsAccountCloseDepositParams> CREATOR = new Creator();
    private final String actionButtonTitle;
    private final String agreementId;
    private final String amountFull;
    private final String amountPenalty;
    private final String amountProfit;
    private final String amountTotal;
    private final String date;
    private final String imageUrl;
    private final String secondaryButtonTitle;
    private final String subtitle;
    private final String title;
    private final SavingsClosingVersion version;

    public SavingsAccountCloseDepositParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, SavingsClosingVersion savingsClosingVersion, String str8, String str9, String str10, String str11) {
        this.date = str;
        this.title = str2;
        this.subtitle = str3;
        this.imageUrl = str4;
        this.agreementId = str5;
        this.actionButtonTitle = str6;
        this.secondaryButtonTitle = str7;
        this.version = savingsClosingVersion;
        this.amountFull = str8;
        this.amountTotal = str9;
        this.amountProfit = str10;
        this.amountPenalty = str11;
    }

    public static /* synthetic */ SavingsAccountCloseDepositParams copy$default(SavingsAccountCloseDepositParams savingsAccountCloseDepositParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, SavingsClosingVersion savingsClosingVersion, String str8, String str9, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountCloseDepositParams.date;
        }
        if ((i & 2) != 0) {
            str2 = savingsAccountCloseDepositParams.title;
        }
        if ((i & 4) != 0) {
            str3 = savingsAccountCloseDepositParams.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = savingsAccountCloseDepositParams.imageUrl;
        }
        if ((i & 16) != 0) {
            str5 = savingsAccountCloseDepositParams.agreementId;
        }
        if ((i & 32) != 0) {
            str6 = savingsAccountCloseDepositParams.actionButtonTitle;
        }
        if ((i & 64) != 0) {
            str7 = savingsAccountCloseDepositParams.secondaryButtonTitle;
        }
        if ((i & 128) != 0) {
            savingsClosingVersion = savingsAccountCloseDepositParams.version;
        }
        if ((i & 256) != 0) {
            str8 = savingsAccountCloseDepositParams.amountFull;
        }
        if ((i & 512) != 0) {
            str9 = savingsAccountCloseDepositParams.amountTotal;
        }
        if ((i & 1024) != 0) {
            str10 = savingsAccountCloseDepositParams.amountProfit;
        }
        if ((i & 2048) != 0) {
            str11 = savingsAccountCloseDepositParams.amountPenalty;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str7;
        SavingsClosingVersion savingsClosingVersion2 = savingsClosingVersion;
        String str17 = str5;
        String str18 = str6;
        return savingsAccountCloseDepositParams.copy(str, str2, str3, str4, str17, str18, str16, savingsClosingVersion2, str14, str15, str12, str13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAmountTotal() {
        return this.amountTotal;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAmountProfit() {
        return this.amountProfit;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAmountPenalty() {
        return this.amountPenalty;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getActionButtonTitle() {
        return this.actionButtonTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final SavingsClosingVersion getVersion() {
        return this.version;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAmountFull() {
        return this.amountFull;
    }

    public final SavingsAccountCloseDepositParams copy(String date, String title, String subtitle, String imageUrl, String agreementId, String actionButtonTitle, String secondaryButtonTitle, SavingsClosingVersion version, String amountFull, String amountTotal, String amountProfit, String amountPenalty) {
        return new SavingsAccountCloseDepositParams(date, title, subtitle, imageUrl, agreementId, actionButtonTitle, secondaryButtonTitle, version, amountFull, amountTotal, amountProfit, amountPenalty);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountCloseDepositParams)) {
            return false;
        }
        SavingsAccountCloseDepositParams savingsAccountCloseDepositParams = (SavingsAccountCloseDepositParams) other;
        return jl40.l(this.date, savingsAccountCloseDepositParams.date) && jl40.l(this.title, savingsAccountCloseDepositParams.title) && jl40.l(this.subtitle, savingsAccountCloseDepositParams.subtitle) && jl40.l(this.imageUrl, savingsAccountCloseDepositParams.imageUrl) && jl40.l(this.agreementId, savingsAccountCloseDepositParams.agreementId) && jl40.l(this.actionButtonTitle, savingsAccountCloseDepositParams.actionButtonTitle) && jl40.l(this.secondaryButtonTitle, savingsAccountCloseDepositParams.secondaryButtonTitle) && this.version == savingsAccountCloseDepositParams.version && jl40.l(this.amountFull, savingsAccountCloseDepositParams.amountFull) && jl40.l(this.amountTotal, savingsAccountCloseDepositParams.amountTotal) && jl40.l(this.amountProfit, savingsAccountCloseDepositParams.amountProfit) && jl40.l(this.amountPenalty, savingsAccountCloseDepositParams.amountPenalty);
    }

    public final String getActionButtonTitle() {
        return this.actionButtonTitle;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getAmountFull() {
        return this.amountFull;
    }

    public final String getAmountPenalty() {
        return this.amountPenalty;
    }

    public final String getAmountProfit() {
        return this.amountProfit;
    }

    public final String getAmountTotal() {
        return this.amountTotal;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final SavingsClosingVersion getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.date;
        int b = unr0.b(unr0.b(unr0.b(unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.subtitle), 31, this.imageUrl), 31, this.agreementId), 31, this.actionButtonTitle);
        String str2 = this.secondaryButtonTitle;
        int hashCode = (this.version.hashCode() + ((b + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.amountFull;
        return this.amountPenalty.hashCode() + unr0.b(unr0.b((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.amountTotal), 31, this.amountProfit);
    }

    public String toString() {
        String str = this.date;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.imageUrl;
        String str5 = this.agreementId;
        String str6 = this.actionButtonTitle;
        String str7 = this.secondaryButtonTitle;
        SavingsClosingVersion savingsClosingVersion = this.version;
        String str8 = this.amountFull;
        String str9 = this.amountTotal;
        String str10 = this.amountProfit;
        String str11 = this.amountPenalty;
        StringBuilder v = b64.v("SavingsAccountCloseDepositParams(date=", str, ", title=", str2, ", subtitle=");
        g8e.D(v, str3, ", imageUrl=", str4, ", agreementId=");
        g8e.D(v, str5, ", actionButtonTitle=", str6, ", secondaryButtonTitle=");
        v.append(str7);
        v.append(", version=");
        v.append(savingsClosingVersion);
        v.append(", amountFull=");
        g8e.D(v, str8, ", amountTotal=", str9, ", amountProfit=");
        return g8e.r(v, str10, ", amountPenalty=", str11, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.date);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.imageUrl);
        dest.writeString(this.agreementId);
        dest.writeString(this.actionButtonTitle);
        dest.writeString(this.secondaryButtonTitle);
        dest.writeString(this.version.name());
        dest.writeString(this.amountFull);
        dest.writeString(this.amountTotal);
        dest.writeString(this.amountProfit);
        dest.writeString(this.amountPenalty);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavingsAccountCloseDepositParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountCloseDepositParams createFromParcel(Parcel parcel) {
            return new SavingsAccountCloseDepositParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), SavingsClosingVersion.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountCloseDepositParams[] newArray(int i) {
            return new SavingsAccountCloseDepositParams[i];
        }
    }
}
