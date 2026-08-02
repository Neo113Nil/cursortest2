package com.yandex.plus.pay.api.feature.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0013¨\u0006&"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest;", "Landroid/os/Parcelable;", "", "contentId", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest$Vendor;", DRMInfoProvider.MediaDRMKeys.VENDOR, "promoCode", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest$Vendor;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest$Vendor;", "component3", "copy", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest$Vendor;Ljava/lang/String;)Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContentId", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest$Vendor;", "getVendor", "getPromoCode", "Vendor", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusTransactionOfferRequest implements Parcelable {
    public static final Parcelable.Creator<PlusTransactionOfferRequest> CREATOR = new Creator();
    private final String contentId;
    private final String promoCode;
    private final Vendor vendor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest$Vendor;", "", "NATIVE", "IN_APP", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Vendor {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Vendor[] $VALUES;
        public static final Vendor IN_APP;
        public static final Vendor NATIVE;

        static {
            Vendor vendor = new Vendor("NATIVE", 0);
            NATIVE = vendor;
            Vendor vendor2 = new Vendor("IN_APP", 1);
            IN_APP = vendor2;
            Vendor[] vendorArr = {vendor, vendor2};
            $VALUES = vendorArr;
            $ENTRIES = a.a(vendorArr);
        }

        public static Vendor valueOf(String str) {
            return (Vendor) Enum.valueOf(Vendor.class, str);
        }

        public static Vendor[] values() {
            return (Vendor[]) $VALUES.clone();
        }
    }

    public PlusTransactionOfferRequest(String str, Vendor vendor, String str2) {
        this.contentId = str;
        this.vendor = vendor;
        this.promoCode = str2;
    }

    public static /* synthetic */ PlusTransactionOfferRequest copy$default(PlusTransactionOfferRequest plusTransactionOfferRequest, String str, Vendor vendor, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusTransactionOfferRequest.contentId;
        }
        if ((i & 2) != 0) {
            vendor = plusTransactionOfferRequest.vendor;
        }
        if ((i & 4) != 0) {
            str2 = plusTransactionOfferRequest.promoCode;
        }
        return plusTransactionOfferRequest.copy(str, vendor, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* renamed from: component2, reason: from getter */
    public final Vendor getVendor() {
        return this.vendor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    public final PlusTransactionOfferRequest copy(String contentId, Vendor vendor, String promoCode) {
        return new PlusTransactionOfferRequest(contentId, vendor, promoCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusTransactionOfferRequest)) {
            return false;
        }
        PlusTransactionOfferRequest plusTransactionOfferRequest = (PlusTransactionOfferRequest) other;
        return jl40.l(this.contentId, plusTransactionOfferRequest.contentId) && this.vendor == plusTransactionOfferRequest.vendor && jl40.l(this.promoCode, plusTransactionOfferRequest.promoCode);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getPromoCode() {
        return this.promoCode;
    }

    public final Vendor getVendor() {
        return this.vendor;
    }

    public int hashCode() {
        int hashCode = (this.vendor.hashCode() + (this.contentId.hashCode() * 31)) * 31;
        String str = this.promoCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusTransactionOfferRequest(contentId=");
        sb.append(this.contentId);
        sb.append(", vendor=");
        sb.append(this.vendor);
        sb.append(", promoCode=");
        return b64.p(sb, this.promoCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.contentId);
        dest.writeString(this.vendor.name());
        dest.writeString(this.promoCode);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusTransactionOfferRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTransactionOfferRequest createFromParcel(Parcel parcel) {
            return new PlusTransactionOfferRequest(parcel.readString(), Vendor.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTransactionOfferRequest[] newArray(int i) {
            return new PlusTransactionOfferRequest[i];
        }
    }

    public /* synthetic */ PlusTransactionOfferRequest(String str, Vendor vendor, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, vendor, (i & 4) != 0 ? null : str2);
    }
}
