package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001DB\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u009e\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001bJ\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b7\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b8\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b9\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b:\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b;\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b<\u0010\u001bR \u0010>\u001a\u00020=8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/ybsdk/deeplink/generated/SavingsAccountCloseDepositAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "agreementId", "title", "subtitle", "image", "actionButtonTitle", "secondaryButtonTitle", MetaDataField.DATE_FIELD, "full", "total", "profit", "penalty", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/SavingsAccountCloseDepositAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "getTitle", "getSubtitle", "getImage", "getActionButtonTitle", "getSecondaryButtonTitle", "getDate", "getFull", "getTotal", "getProfit", "getPenalty", "getVersion", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "cya1", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountCloseDepositAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<SavingsAccountCloseDepositAction> CREATOR = new Creator();
    private final String actionButtonTitle;
    private final String agreementId;
    private final String date;
    private final Uri deeplinkUri;
    private final String full;
    private final String image;
    private final String penalty;
    private final String profit;
    private final String secondaryButtonTitle;
    private final String subtitle;
    private final String title;
    private final String total;
    private final String version;

    public SavingsAccountCloseDepositAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.agreementId = str;
        this.title = str2;
        this.subtitle = str3;
        this.image = str4;
        this.actionButtonTitle = str5;
        this.secondaryButtonTitle = str6;
        this.date = str7;
        this.full = str8;
        this.total = str9;
        this.profit = str10;
        this.penalty = str11;
        this.version = str12;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/savings_account_close_deposit", "agreement_id", str);
        if (str2 != null) {
            j.appendQueryParameter("title", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("subtitle", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("image", str4);
        }
        if (str5 != null) {
            j.appendQueryParameter("action_button_title", str5);
        }
        if (str6 != null) {
            j.appendQueryParameter("secondary_button_title", str6);
        }
        if (str7 != null) {
            j.appendQueryParameter(MetaDataField.DATE_FIELD, str7);
        }
        if (str8 != null) {
            j.appendQueryParameter("full", str8);
        }
        if (str9 != null) {
            j.appendQueryParameter("total", str9);
        }
        if (str10 != null) {
            j.appendQueryParameter("profit", str10);
        }
        if (str11 != null) {
            j.appendQueryParameter("penalty", str11);
        }
        if (str12 != null) {
            j.appendQueryParameter("version", str12);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ SavingsAccountCloseDepositAction copy$default(SavingsAccountCloseDepositAction savingsAccountCloseDepositAction, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountCloseDepositAction.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = savingsAccountCloseDepositAction.title;
        }
        if ((i & 4) != 0) {
            str3 = savingsAccountCloseDepositAction.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = savingsAccountCloseDepositAction.image;
        }
        if ((i & 16) != 0) {
            str5 = savingsAccountCloseDepositAction.actionButtonTitle;
        }
        if ((i & 32) != 0) {
            str6 = savingsAccountCloseDepositAction.secondaryButtonTitle;
        }
        if ((i & 64) != 0) {
            str7 = savingsAccountCloseDepositAction.date;
        }
        if ((i & 128) != 0) {
            str8 = savingsAccountCloseDepositAction.full;
        }
        if ((i & 256) != 0) {
            str9 = savingsAccountCloseDepositAction.total;
        }
        if ((i & 512) != 0) {
            str10 = savingsAccountCloseDepositAction.profit;
        }
        if ((i & 1024) != 0) {
            str11 = savingsAccountCloseDepositAction.penalty;
        }
        if ((i & 2048) != 0) {
            str12 = savingsAccountCloseDepositAction.version;
        }
        String str13 = str11;
        String str14 = str12;
        String str15 = str9;
        String str16 = str10;
        String str17 = str7;
        String str18 = str8;
        String str19 = str5;
        String str20 = str6;
        return savingsAccountCloseDepositAction.copy(str, str2, str3, str4, str19, str20, str17, str18, str15, str16, str13, str14);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getProfit() {
        return this.profit;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPenalty() {
        return this.penalty;
    }

    /* renamed from: component12, reason: from getter */
    public final String getVersion() {
        return this.version;
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
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final String getActionButtonTitle() {
        return this.actionButtonTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFull() {
        return this.full;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTotal() {
        return this.total;
    }

    public final SavingsAccountCloseDepositAction copy(String agreementId, String title, String subtitle, String image, String actionButtonTitle, String secondaryButtonTitle, String date, String full, String total, String profit, String penalty, String version) {
        return new SavingsAccountCloseDepositAction(agreementId, title, subtitle, image, actionButtonTitle, secondaryButtonTitle, date, full, total, profit, penalty, version);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountCloseDepositAction)) {
            return false;
        }
        SavingsAccountCloseDepositAction savingsAccountCloseDepositAction = (SavingsAccountCloseDepositAction) other;
        return jl40.l(this.agreementId, savingsAccountCloseDepositAction.agreementId) && jl40.l(this.title, savingsAccountCloseDepositAction.title) && jl40.l(this.subtitle, savingsAccountCloseDepositAction.subtitle) && jl40.l(this.image, savingsAccountCloseDepositAction.image) && jl40.l(this.actionButtonTitle, savingsAccountCloseDepositAction.actionButtonTitle) && jl40.l(this.secondaryButtonTitle, savingsAccountCloseDepositAction.secondaryButtonTitle) && jl40.l(this.date, savingsAccountCloseDepositAction.date) && jl40.l(this.full, savingsAccountCloseDepositAction.full) && jl40.l(this.total, savingsAccountCloseDepositAction.total) && jl40.l(this.profit, savingsAccountCloseDepositAction.profit) && jl40.l(this.penalty, savingsAccountCloseDepositAction.penalty) && jl40.l(this.version, savingsAccountCloseDepositAction.version);
    }

    public final String getActionButtonTitle() {
        return this.actionButtonTitle;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getDate() {
        return this.date;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getFull() {
        return this.full;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getPenalty() {
        return this.penalty;
    }

    public final String getProfit() {
        return this.profit;
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

    public final String getTotal() {
        return this.total;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionButtonTitle;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.secondaryButtonTitle;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.date;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.full;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.total;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.profit;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.penalty;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.version;
        return hashCode11 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.image;
        String str5 = this.actionButtonTitle;
        String str6 = this.secondaryButtonTitle;
        String str7 = this.date;
        String str8 = this.full;
        String str9 = this.total;
        String str10 = this.profit;
        String str11 = this.penalty;
        String str12 = this.version;
        StringBuilder v = b64.v("SavingsAccountCloseDepositAction(agreementId=", str, ", title=", str2, ", subtitle=");
        g8e.D(v, str3, ", image=", str4, ", actionButtonTitle=");
        g8e.D(v, str5, ", secondaryButtonTitle=", str6, ", date=");
        g8e.D(v, str7, ", full=", str8, ", total=");
        g8e.D(v, str9, ", profit=", str10, ", penalty=");
        return g8e.r(v, str11, ", version=", str12, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.agreementId);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.image);
        dest.writeString(this.actionButtonTitle);
        dest.writeString(this.secondaryButtonTitle);
        dest.writeString(this.date);
        dest.writeString(this.full);
        dest.writeString(this.total);
        dest.writeString(this.profit);
        dest.writeString(this.penalty);
        dest.writeString(this.version);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavingsAccountCloseDepositAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountCloseDepositAction createFromParcel(Parcel parcel) {
            return new SavingsAccountCloseDepositAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountCloseDepositAction[] newArray(int i) {
            return new SavingsAccountCloseDepositAction[i];
        }
    }

    public /* synthetic */ SavingsAccountCloseDepositAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12);
    }
}
