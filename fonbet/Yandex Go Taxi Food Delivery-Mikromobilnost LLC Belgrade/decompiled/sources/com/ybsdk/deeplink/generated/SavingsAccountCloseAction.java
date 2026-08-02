package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oo31;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018Jl\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b1\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b2\u0010\u0018R \u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/ybsdk/deeplink/generated/SavingsAccountCloseAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "agreementId", "", "showSecondary", "type", "title", "subtitle", "image", "actionButtonTitle", "secondaryButtonTitle", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/SavingsAccountCloseAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "Z", "getShowSecondary", "getType", "getTitle", "getSubtitle", "getImage", "getActionButtonTitle", "getSecondaryButtonTitle", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountCloseAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<SavingsAccountCloseAction> CREATOR = new Creator();
    private final String actionButtonTitle;
    private final String agreementId;
    private final Uri deeplinkUri;
    private final String image;
    private final String secondaryButtonTitle;
    private final boolean showSecondary;
    private final String subtitle;
    private final String title;
    private final String type;

    public SavingsAccountCloseAction(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.agreementId = str;
        this.showSecondary = z;
        this.type = str2;
        this.title = str3;
        this.subtitle = str4;
        this.image = str5;
        this.actionButtonTitle = str6;
        this.secondaryButtonTitle = str7;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/savings_account_close", "agreement_id", str);
        j.appendQueryParameter("show_secondary", String.valueOf(z));
        if (str2 != null) {
            j.appendQueryParameter("type", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("title", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("subtitle", str4);
        }
        if (str5 != null) {
            j.appendQueryParameter("image", str5);
        }
        if (str6 != null) {
            j.appendQueryParameter("action_button_title", str6);
        }
        if (str7 != null) {
            j.appendQueryParameter("secondary_button_title", str7);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ SavingsAccountCloseAction copy$default(SavingsAccountCloseAction savingsAccountCloseAction, String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountCloseAction.agreementId;
        }
        if ((i & 2) != 0) {
            z = savingsAccountCloseAction.showSecondary;
        }
        if ((i & 4) != 0) {
            str2 = savingsAccountCloseAction.type;
        }
        if ((i & 8) != 0) {
            str3 = savingsAccountCloseAction.title;
        }
        if ((i & 16) != 0) {
            str4 = savingsAccountCloseAction.subtitle;
        }
        if ((i & 32) != 0) {
            str5 = savingsAccountCloseAction.image;
        }
        if ((i & 64) != 0) {
            str6 = savingsAccountCloseAction.actionButtonTitle;
        }
        if ((i & 128) != 0) {
            str7 = savingsAccountCloseAction.secondaryButtonTitle;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return savingsAccountCloseAction.copy(str, z, str2, str3, str10, str11, str8, str9);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowSecondary() {
        return this.showSecondary;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component7, reason: from getter */
    public final String getActionButtonTitle() {
        return this.actionButtonTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final SavingsAccountCloseAction copy(String agreementId, boolean showSecondary, String type, String title, String subtitle, String image, String actionButtonTitle, String secondaryButtonTitle) {
        return new SavingsAccountCloseAction(agreementId, showSecondary, type, title, subtitle, image, actionButtonTitle, secondaryButtonTitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountCloseAction)) {
            return false;
        }
        SavingsAccountCloseAction savingsAccountCloseAction = (SavingsAccountCloseAction) other;
        return jl40.l(this.agreementId, savingsAccountCloseAction.agreementId) && this.showSecondary == savingsAccountCloseAction.showSecondary && jl40.l(this.type, savingsAccountCloseAction.type) && jl40.l(this.title, savingsAccountCloseAction.title) && jl40.l(this.subtitle, savingsAccountCloseAction.subtitle) && jl40.l(this.image, savingsAccountCloseAction.image) && jl40.l(this.actionButtonTitle, savingsAccountCloseAction.actionButtonTitle) && jl40.l(this.secondaryButtonTitle, savingsAccountCloseAction.secondaryButtonTitle);
    }

    public final String getActionButtonTitle() {
        return this.actionButtonTitle;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final boolean getShowSecondary() {
        return this.showSecondary;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int e = unr0.e(this.agreementId.hashCode() * 31, 31, this.showSecondary);
        String str = this.type;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.image;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actionButtonTitle;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.secondaryButtonTitle;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        boolean z = this.showSecondary;
        String str2 = this.type;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.image;
        String str6 = this.actionButtonTitle;
        String str7 = this.secondaryButtonTitle;
        StringBuilder l = oo31.l("SavingsAccountCloseAction(agreementId=", str, ", showSecondary=", ", type=", z);
        g8e.D(l, str2, ", title=", str3, ", subtitle=");
        g8e.D(l, str4, ", image=", str5, ", actionButtonTitle=");
        return g8e.r(l, str6, ", secondaryButtonTitle=", str7, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.agreementId);
        dest.writeInt(this.showSecondary ? 1 : 0);
        dest.writeString(this.type);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.image);
        dest.writeString(this.actionButtonTitle);
        dest.writeString(this.secondaryButtonTitle);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavingsAccountCloseAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountCloseAction createFromParcel(Parcel parcel) {
            return new SavingsAccountCloseAction(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountCloseAction[] newArray(int i) {
            return new SavingsAccountCloseAction[i];
        }
    }

    public /* synthetic */ SavingsAccountCloseAction(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }
}
