package com.yandex.plus.acquisition.sdk.api.offers;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionAssets;", "Landroid/os/Parcelable;", "", "purchaseButtonText", "purchaseButtonAdditionalText", "subscriptionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/acquisition/sdk/api/offers/PlusAcquisitionAssets;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPurchaseButtonText", "getPurchaseButtonAdditionalText", "getSubscriptionName", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusAcquisitionAssets implements Parcelable {
    public static final Parcelable.Creator<PlusAcquisitionAssets> CREATOR = new Creator();
    private final String purchaseButtonAdditionalText;
    private final String purchaseButtonText;
    private final String subscriptionName;

    public PlusAcquisitionAssets(String str, String str2, String str3) {
        this.purchaseButtonText = str;
        this.purchaseButtonAdditionalText = str2;
        this.subscriptionName = str3;
    }

    public static /* synthetic */ PlusAcquisitionAssets copy$default(PlusAcquisitionAssets plusAcquisitionAssets, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusAcquisitionAssets.purchaseButtonText;
        }
        if ((i & 2) != 0) {
            str2 = plusAcquisitionAssets.purchaseButtonAdditionalText;
        }
        if ((i & 4) != 0) {
            str3 = plusAcquisitionAssets.subscriptionName;
        }
        return plusAcquisitionAssets.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseButtonText() {
        return this.purchaseButtonText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPurchaseButtonAdditionalText() {
        return this.purchaseButtonAdditionalText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubscriptionName() {
        return this.subscriptionName;
    }

    public final PlusAcquisitionAssets copy(String purchaseButtonText, String purchaseButtonAdditionalText, String subscriptionName) {
        return new PlusAcquisitionAssets(purchaseButtonText, purchaseButtonAdditionalText, subscriptionName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusAcquisitionAssets)) {
            return false;
        }
        PlusAcquisitionAssets plusAcquisitionAssets = (PlusAcquisitionAssets) other;
        return jl40.l(this.purchaseButtonText, plusAcquisitionAssets.purchaseButtonText) && jl40.l(this.purchaseButtonAdditionalText, plusAcquisitionAssets.purchaseButtonAdditionalText) && jl40.l(this.subscriptionName, plusAcquisitionAssets.subscriptionName);
    }

    public final String getPurchaseButtonAdditionalText() {
        return this.purchaseButtonAdditionalText;
    }

    public final String getPurchaseButtonText() {
        return this.purchaseButtonText;
    }

    public final String getSubscriptionName() {
        return this.subscriptionName;
    }

    public int hashCode() {
        return this.subscriptionName.hashCode() + unr0.b(this.purchaseButtonText.hashCode() * 31, 31, this.purchaseButtonAdditionalText);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusAcquisitionAssets(purchaseButtonText=");
        sb.append(this.purchaseButtonText);
        sb.append(", purchaseButtonAdditionalText=");
        sb.append(this.purchaseButtonAdditionalText);
        sb.append(", subscriptionName=");
        return b64.p(sb, this.subscriptionName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.purchaseButtonText);
        dest.writeString(this.purchaseButtonAdditionalText);
        dest.writeString(this.subscriptionName);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusAcquisitionAssets> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionAssets createFromParcel(Parcel parcel) {
            return new PlusAcquisitionAssets(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionAssets[] newArray(int i) {
            return new PlusAcquisitionAssets[i];
        }
    }
}
