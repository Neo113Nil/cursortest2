package com.ybsdk.feature.savings.internal.screens.close;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010 ¨\u00063"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/close/SavingsAccountCloseParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "type", "title", "subtitle", "agreementId", "imageUrl", "actionButtonTitle", "secondaryButtonTitle", "", "showSecondary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ybsdk/feature/savings/internal/screens/close/SavingsAccountCloseParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getTitle", "getSubtitle", "getAgreementId", "getImageUrl", "getActionButtonTitle", "getSecondaryButtonTitle", "Ljava/lang/Boolean;", "getShowSecondary", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountCloseParams implements ScreenParams {
    public static final Parcelable.Creator<SavingsAccountCloseParams> CREATOR = new Creator();
    private final String actionButtonTitle;
    private final String agreementId;
    private final String imageUrl;
    private final String secondaryButtonTitle;
    private final Boolean showSecondary;
    private final String subtitle;
    private final String title;
    private final String type;

    public SavingsAccountCloseParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.type = str;
        this.title = str2;
        this.subtitle = str3;
        this.agreementId = str4;
        this.imageUrl = str5;
        this.actionButtonTitle = str6;
        this.secondaryButtonTitle = str7;
        this.showSecondary = bool;
    }

    public static /* synthetic */ SavingsAccountCloseParams copy$default(SavingsAccountCloseParams savingsAccountCloseParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountCloseParams.type;
        }
        if ((i & 2) != 0) {
            str2 = savingsAccountCloseParams.title;
        }
        if ((i & 4) != 0) {
            str3 = savingsAccountCloseParams.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = savingsAccountCloseParams.agreementId;
        }
        if ((i & 16) != 0) {
            str5 = savingsAccountCloseParams.imageUrl;
        }
        if ((i & 32) != 0) {
            str6 = savingsAccountCloseParams.actionButtonTitle;
        }
        if ((i & 64) != 0) {
            str7 = savingsAccountCloseParams.secondaryButtonTitle;
        }
        if ((i & 128) != 0) {
            bool = savingsAccountCloseParams.showSecondary;
        }
        String str8 = str7;
        Boolean bool2 = bool;
        String str9 = str5;
        String str10 = str6;
        return savingsAccountCloseParams.copy(str, str2, str3, str4, str9, str10, str8, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
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
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
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
    public final Boolean getShowSecondary() {
        return this.showSecondary;
    }

    public final SavingsAccountCloseParams copy(String type, String title, String subtitle, String agreementId, String imageUrl, String actionButtonTitle, String secondaryButtonTitle, Boolean showSecondary) {
        return new SavingsAccountCloseParams(type, title, subtitle, agreementId, imageUrl, actionButtonTitle, secondaryButtonTitle, showSecondary);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountCloseParams)) {
            return false;
        }
        SavingsAccountCloseParams savingsAccountCloseParams = (SavingsAccountCloseParams) other;
        return jl40.l(this.type, savingsAccountCloseParams.type) && jl40.l(this.title, savingsAccountCloseParams.title) && jl40.l(this.subtitle, savingsAccountCloseParams.subtitle) && jl40.l(this.agreementId, savingsAccountCloseParams.agreementId) && jl40.l(this.imageUrl, savingsAccountCloseParams.imageUrl) && jl40.l(this.actionButtonTitle, savingsAccountCloseParams.actionButtonTitle) && jl40.l(this.secondaryButtonTitle, savingsAccountCloseParams.secondaryButtonTitle) && jl40.l(this.showSecondary, savingsAccountCloseParams.showSecondary);
    }

    public final String getActionButtonTitle() {
        return this.actionButtonTitle;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final Boolean getShowSecondary() {
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
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int b = unr0.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.agreementId);
        String str4 = this.imageUrl;
        int hashCode3 = (b + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actionButtonTitle;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.secondaryButtonTitle;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.showSecondary;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.agreementId;
        String str5 = this.imageUrl;
        String str6 = this.actionButtonTitle;
        String str7 = this.secondaryButtonTitle;
        Boolean bool = this.showSecondary;
        StringBuilder v = b64.v("SavingsAccountCloseParams(type=", str, ", title=", str2, ", subtitle=");
        g8e.D(v, str3, ", agreementId=", str4, ", imageUrl=");
        g8e.D(v, str5, ", actionButtonTitle=", str6, ", secondaryButtonTitle=");
        v.append(str7);
        v.append(", showSecondary=");
        v.append(bool);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.type);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.agreementId);
        dest.writeString(this.imageUrl);
        dest.writeString(this.actionButtonTitle);
        dest.writeString(this.secondaryButtonTitle);
        Boolean bool = this.showSecondary;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavingsAccountCloseParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountCloseParams createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SavingsAccountCloseParams(readString, readString2, readString3, readString4, readString5, readString6, readString7, valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountCloseParams[] newArray(int i) {
            return new SavingsAccountCloseParams[i];
        }
    }
}
