package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016JV\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\u0016R \u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/ybsdk/deeplink/generated/FinalizePaymentChoiceAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "paymentMethodId", "paymentMethodType", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "imageUrlLight", "title", "amount", "trustId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/FinalizePaymentChoiceAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentMethodId", "getPaymentMethodType", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImageUrlLight", "getTitle", "getAmount", "getTrustId", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinalizePaymentChoiceAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<FinalizePaymentChoiceAction> CREATOR = new Creator();
    private final String amount;
    private final Uri deeplinkUri;
    private final ThemedImageUrlEntity imageUrlLight;
    private final String paymentMethodId;
    private final String paymentMethodType;
    private final String title;
    private final String trustId;

    public FinalizePaymentChoiceAction(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, String str3, String str4, String str5) {
        this.paymentMethodId = str;
        this.paymentMethodType = str2;
        this.imageUrlLight = themedImageUrlEntity;
        this.title = str3;
        this.amount = str4;
        this.trustId = str5;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/finalize_payment_choice", "payment_method_id", str);
        if (str2 != null) {
            j.appendQueryParameter("payment_method_type", str2);
        }
        if (themedImageUrlEntity != null) {
            String lightUrl = themedImageUrlEntity.getLightUrl();
            if (lightUrl != null) {
                j.appendQueryParameter("image_url_light", lightUrl);
            }
            String darkUrl = themedImageUrlEntity.getDarkUrl();
            if (darkUrl != null) {
                j.appendQueryParameter("image_url_light_dark", darkUrl);
            }
        }
        if (str3 != null) {
            j.appendQueryParameter("title", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("amount", str4);
        }
        if (str5 != null) {
            j.appendQueryParameter("trust_id", str5);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ FinalizePaymentChoiceAction copy$default(FinalizePaymentChoiceAction finalizePaymentChoiceAction, String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = finalizePaymentChoiceAction.paymentMethodId;
        }
        if ((i & 2) != 0) {
            str2 = finalizePaymentChoiceAction.paymentMethodType;
        }
        if ((i & 4) != 0) {
            themedImageUrlEntity = finalizePaymentChoiceAction.imageUrlLight;
        }
        if ((i & 8) != 0) {
            str3 = finalizePaymentChoiceAction.title;
        }
        if ((i & 16) != 0) {
            str4 = finalizePaymentChoiceAction.amount;
        }
        if ((i & 32) != 0) {
            str5 = finalizePaymentChoiceAction.trustId;
        }
        String str6 = str4;
        String str7 = str5;
        return finalizePaymentChoiceAction.copy(str, str2, themedImageUrlEntity, str3, str6, str7);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* renamed from: component3, reason: from getter */
    public final ThemedImageUrlEntity getImageUrlLight() {
        return this.imageUrlLight;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTrustId() {
        return this.trustId;
    }

    public final FinalizePaymentChoiceAction copy(String paymentMethodId, String paymentMethodType, ThemedImageUrlEntity imageUrlLight, String title, String amount, String trustId) {
        return new FinalizePaymentChoiceAction(paymentMethodId, paymentMethodType, imageUrlLight, title, amount, trustId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinalizePaymentChoiceAction)) {
            return false;
        }
        FinalizePaymentChoiceAction finalizePaymentChoiceAction = (FinalizePaymentChoiceAction) other;
        return jl40.l(this.paymentMethodId, finalizePaymentChoiceAction.paymentMethodId) && jl40.l(this.paymentMethodType, finalizePaymentChoiceAction.paymentMethodType) && jl40.l(this.imageUrlLight, finalizePaymentChoiceAction.imageUrlLight) && jl40.l(this.title, finalizePaymentChoiceAction.title) && jl40.l(this.amount, finalizePaymentChoiceAction.amount) && jl40.l(this.trustId, finalizePaymentChoiceAction.trustId);
    }

    public final String getAmount() {
        return this.amount;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final ThemedImageUrlEntity getImageUrlLight() {
        return this.imageUrlLight;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrustId() {
        return this.trustId;
    }

    public int hashCode() {
        int hashCode = this.paymentMethodId.hashCode() * 31;
        String str = this.paymentMethodType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.imageUrlLight;
        int hashCode3 = (hashCode2 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amount;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trustId;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.paymentMethodId;
        String str2 = this.paymentMethodType;
        ThemedImageUrlEntity themedImageUrlEntity = this.imageUrlLight;
        String str3 = this.title;
        String str4 = this.amount;
        String str5 = this.trustId;
        StringBuilder v = b64.v("FinalizePaymentChoiceAction(paymentMethodId=", str, ", paymentMethodType=", str2, ", imageUrlLight=");
        v.append(themedImageUrlEntity);
        v.append(", title=");
        v.append(str3);
        v.append(", amount=");
        return g8e.r(v, str4, ", trustId=", str5, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.paymentMethodId);
        dest.writeString(this.paymentMethodType);
        dest.writeParcelable(this.imageUrlLight, flags);
        dest.writeString(this.title);
        dest.writeString(this.amount);
        dest.writeString(this.trustId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FinalizePaymentChoiceAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinalizePaymentChoiceAction createFromParcel(Parcel parcel) {
            return new FinalizePaymentChoiceAction(parcel.readString(), parcel.readString(), (ThemedImageUrlEntity) parcel.readParcelable(FinalizePaymentChoiceAction.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinalizePaymentChoiceAction[] newArray(int i) {
            return new FinalizePaymentChoiceAction[i];
        }
    }

    public /* synthetic */ FinalizePaymentChoiceAction(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : themedImageUrlEntity, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
