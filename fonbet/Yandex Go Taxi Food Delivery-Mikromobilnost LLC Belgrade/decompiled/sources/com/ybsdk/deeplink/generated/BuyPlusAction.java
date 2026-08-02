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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0013R \u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/ybsdk/deeplink/generated/BuyPlusAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "offerId", "productTarget", "success", "fail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/BuyPlusAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOfferId", "getProductTarget", "getSuccess", "getFail", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BuyPlusAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<BuyPlusAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final String fail;
    private final String offerId;
    private final String productTarget;
    private final String success;

    public BuyPlusAction(String str, String str2, String str3, String str4) {
        this.offerId = str;
        this.productTarget = str2;
        this.success = str3;
        this.fail = str4;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/buy_plus", "offer_id", str);
        j.appendQueryParameter("product_target", str2);
        if (str3 != null) {
            j.appendQueryParameter("success", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("fail", str4);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ BuyPlusAction copy$default(BuyPlusAction buyPlusAction, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buyPlusAction.offerId;
        }
        if ((i & 2) != 0) {
            str2 = buyPlusAction.productTarget;
        }
        if ((i & 4) != 0) {
            str3 = buyPlusAction.success;
        }
        if ((i & 8) != 0) {
            str4 = buyPlusAction.fail;
        }
        return buyPlusAction.copy(str, str2, str3, str4);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductTarget() {
        return this.productTarget;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSuccess() {
        return this.success;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFail() {
        return this.fail;
    }

    public final BuyPlusAction copy(String offerId, String productTarget, String success, String fail) {
        return new BuyPlusAction(offerId, productTarget, success, fail);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyPlusAction)) {
            return false;
        }
        BuyPlusAction buyPlusAction = (BuyPlusAction) other;
        return jl40.l(this.offerId, buyPlusAction.offerId) && jl40.l(this.productTarget, buyPlusAction.productTarget) && jl40.l(this.success, buyPlusAction.success) && jl40.l(this.fail, buyPlusAction.fail);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getFail() {
        return this.fail;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getProductTarget() {
        return this.productTarget;
    }

    public final String getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int b = unr0.b(this.offerId.hashCode() * 31, 31, this.productTarget);
        String str = this.success;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fail;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.offerId;
        String str2 = this.productTarget;
        return g8e.r(b64.v("BuyPlusAction(offerId=", str, ", productTarget=", str2, ", success="), this.success, ", fail=", this.fail, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.offerId);
        dest.writeString(this.productTarget);
        dest.writeString(this.success);
        dest.writeString(this.fail);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuyPlusAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuyPlusAction createFromParcel(Parcel parcel) {
            return new BuyPlusAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuyPlusAction[] newArray(int i) {
            return new BuyPlusAction[i];
        }
    }

    public /* synthetic */ BuyPlusAction(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
