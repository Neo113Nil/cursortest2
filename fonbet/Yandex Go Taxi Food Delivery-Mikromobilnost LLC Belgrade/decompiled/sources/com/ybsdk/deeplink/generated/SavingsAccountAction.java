package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.jl40;
import defpackage.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014R \u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/ybsdk/deeplink/generated/SavingsAccountAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "agreementId", "Lcom/ybsdk/core/utils/ColorModel;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/utils/ColorModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/utils/ColorModel;", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/utils/ColorModel;)Lcom/ybsdk/deeplink/generated/SavingsAccountAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "Lcom/ybsdk/core/utils/ColorModel;", "getBackgroundColor", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<SavingsAccountAction> CREATOR = new Creator();
    private final String agreementId;
    private final ColorModel backgroundColor;
    private final Uri deeplinkUri;

    public SavingsAccountAction(String str, ColorModel colorModel) {
        this.agreementId = str;
        this.backgroundColor = colorModel;
        this.deeplinkUri = n.g("ybapp", "screen.open", "/savings_account", "agreement_id", str);
    }

    public static /* synthetic */ SavingsAccountAction copy$default(SavingsAccountAction savingsAccountAction, String str, ColorModel colorModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountAction.agreementId;
        }
        if ((i & 2) != 0) {
            colorModel = savingsAccountAction.backgroundColor;
        }
        return savingsAccountAction.copy(str, colorModel);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final ColorModel getBackgroundColor() {
        return this.backgroundColor;
    }

    public final SavingsAccountAction copy(String agreementId, ColorModel backgroundColor) {
        return new SavingsAccountAction(agreementId, backgroundColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountAction)) {
            return false;
        }
        SavingsAccountAction savingsAccountAction = (SavingsAccountAction) other;
        return jl40.l(this.agreementId, savingsAccountAction.agreementId) && jl40.l(this.backgroundColor, savingsAccountAction.backgroundColor);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final ColorModel getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        ColorModel colorModel = this.backgroundColor;
        return hashCode + (colorModel == null ? 0 : colorModel.hashCode());
    }

    public String toString() {
        return "SavingsAccountAction(agreementId=" + this.agreementId + ", backgroundColor=" + this.backgroundColor + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.agreementId);
        dest.writeParcelable(this.backgroundColor, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavingsAccountAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountAction createFromParcel(Parcel parcel) {
            return new SavingsAccountAction(parcel.readString(), (ColorModel) parcel.readParcelable(SavingsAccountAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountAction[] newArray(int i) {
            return new SavingsAccountAction[i];
        }
    }

    public /* synthetic */ SavingsAccountAction(String str, ColorModel colorModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : colorModel);
    }
}
