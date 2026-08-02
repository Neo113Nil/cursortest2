package com.yandex.plus.pay.api.feature.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vfc;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002+,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\rJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0019¨\u0006-"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest;", "request", "", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption;", "options", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PromoCodeStatus;", "promoCodeStatus", "<init>", "(Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest;Ljava/util/List;Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PromoCodeStatus;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest;", "component2", "()Ljava/util/List;", "component3", "()Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PromoCodeStatus;", "copy", "(Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest;Ljava/util/List;Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PromoCodeStatus;)Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOfferRequest;", "getRequest", "Ljava/util/List;", "getOptions", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PromoCodeStatus;", "getPromoCodeStatus", "PurchaseOption", "PromoCodeStatus", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusTransactionOffer implements Parcelable {
    public static final Parcelable.Creator<PlusTransactionOffer> CREATOR = new Creator();
    private final List<PurchaseOption> options;
    private final PromoCodeStatus promoCodeStatus;
    private final PlusTransactionOfferRequest request;

    /* JADX WARN: Multi-variable type inference failed */
    public PlusTransactionOffer(PlusTransactionOfferRequest plusTransactionOfferRequest, List<? extends PurchaseOption> list, PromoCodeStatus promoCodeStatus) {
        this.request = plusTransactionOfferRequest;
        this.options = list;
        this.promoCodeStatus = promoCodeStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlusTransactionOffer copy$default(PlusTransactionOffer plusTransactionOffer, PlusTransactionOfferRequest plusTransactionOfferRequest, List list, PromoCodeStatus promoCodeStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            plusTransactionOfferRequest = plusTransactionOffer.request;
        }
        if ((i & 2) != 0) {
            list = plusTransactionOffer.options;
        }
        if ((i & 4) != 0) {
            promoCodeStatus = plusTransactionOffer.promoCodeStatus;
        }
        return plusTransactionOffer.copy(plusTransactionOfferRequest, list, promoCodeStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final PlusTransactionOfferRequest getRequest() {
        return this.request;
    }

    public final List<PurchaseOption> component2() {
        return this.options;
    }

    /* renamed from: component3, reason: from getter */
    public final PromoCodeStatus getPromoCodeStatus() {
        return this.promoCodeStatus;
    }

    public final PlusTransactionOffer copy(PlusTransactionOfferRequest request, List<? extends PurchaseOption> options, PromoCodeStatus promoCodeStatus) {
        return new PlusTransactionOffer(request, options, promoCodeStatus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusTransactionOffer)) {
            return false;
        }
        PlusTransactionOffer plusTransactionOffer = (PlusTransactionOffer) other;
        return jl40.l(this.request, plusTransactionOffer.request) && jl40.l(this.options, plusTransactionOffer.options) && this.promoCodeStatus == plusTransactionOffer.promoCodeStatus;
    }

    public final List<PurchaseOption> getOptions() {
        return this.options;
    }

    public final PromoCodeStatus getPromoCodeStatus() {
        return this.promoCodeStatus;
    }

    public final PlusTransactionOfferRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        int c = unr0.c(this.request.hashCode() * 31, 31, this.options);
        PromoCodeStatus promoCodeStatus = this.promoCodeStatus;
        return c + (promoCodeStatus == null ? 0 : promoCodeStatus.hashCode());
    }

    public String toString() {
        return "PlusTransactionOffer(request=" + this.request + ", options=" + this.options + ", promoCodeStatus=" + this.promoCodeStatus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.request.writeToParcel(dest, flags);
        Iterator t = vfc.t(dest, this.options);
        while (t.hasNext()) {
            dest.writeParcelable((Parcelable) t.next(), flags);
        }
        PromoCodeStatus promoCodeStatus = this.promoCodeStatus;
        if (promoCodeStatus == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            promoCodeStatus.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u001a\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption;", "Landroid/os/Parcelable;", "type", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;", "getType", "()Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;", "price", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "downloadAvailable", "", "getDownloadAvailable", "()Z", "productId", "", "getProductId", "()I", "cashback", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;", "getCashback", "()Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;", "Native", "InApp", "Type", "Cashback", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$InApp;", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native;", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PurchaseOption extends Parcelable {

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u00019B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0011J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"JP\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010\u0011J\u001a\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\"¨\u0006:"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native;", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption;", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;", "type", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "", "downloadAvailable", "", "productId", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;", "cashback", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment;", "alternativePayment", "<init>", "(Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;Lcom/yandex/plus/pay/api/model/PlusPayPrice;ZILcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component3", "()Z", "component4", "component5", "()Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;", "component6", "()Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment;", "copy", "(Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;Lcom/yandex/plus/pay/api/model/PlusPayPrice;ZILcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment;)Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;", "getType", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "Z", "getDownloadAvailable", CA20Status.STATUS_USER_I, "getProductId", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;", "getCashback", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment;", "getAlternativePayment", "AlternativePayment", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Native implements PurchaseOption {
            public static final Parcelable.Creator<Native> CREATOR = new Creator();
            private final AlternativePayment alternativePayment;
            private final Cashback cashback;
            private final boolean downloadAvailable;
            private final PlusPayPrice price;
            private final int productId;
            private final Type type;

            public Native(Type type, PlusPayPrice plusPayPrice, boolean z, int i, Cashback cashback, AlternativePayment alternativePayment) {
                this.type = type;
                this.price = plusPayPrice;
                this.downloadAvailable = z;
                this.productId = i;
                this.cashback = cashback;
                this.alternativePayment = alternativePayment;
            }

            public static /* synthetic */ Native copy$default(Native r0, Type type, PlusPayPrice plusPayPrice, boolean z, int i, Cashback cashback, AlternativePayment alternativePayment, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    type = r0.type;
                }
                if ((i2 & 2) != 0) {
                    plusPayPrice = r0.price;
                }
                if ((i2 & 4) != 0) {
                    z = r0.downloadAvailable;
                }
                if ((i2 & 8) != 0) {
                    i = r0.productId;
                }
                if ((i2 & 16) != 0) {
                    cashback = r0.cashback;
                }
                if ((i2 & 32) != 0) {
                    alternativePayment = r0.alternativePayment;
                }
                Cashback cashback2 = cashback;
                AlternativePayment alternativePayment2 = alternativePayment;
                return r0.copy(type, plusPayPrice, z, i, cashback2, alternativePayment2);
            }

            /* renamed from: component1, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final PlusPayPrice getPrice() {
                return this.price;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getDownloadAvailable() {
                return this.downloadAvailable;
            }

            /* renamed from: component4, reason: from getter */
            public final int getProductId() {
                return this.productId;
            }

            /* renamed from: component5, reason: from getter */
            public final Cashback getCashback() {
                return this.cashback;
            }

            /* renamed from: component6, reason: from getter */
            public final AlternativePayment getAlternativePayment() {
                return this.alternativePayment;
            }

            public final Native copy(Type type, PlusPayPrice price, boolean downloadAvailable, int productId, Cashback cashback, AlternativePayment alternativePayment) {
                return new Native(type, price, downloadAvailable, productId, cashback, alternativePayment);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Native)) {
                    return false;
                }
                Native r5 = (Native) other;
                return this.type == r5.type && jl40.l(this.price, r5.price) && this.downloadAvailable == r5.downloadAvailable && this.productId == r5.productId && jl40.l(this.cashback, r5.cashback) && jl40.l(this.alternativePayment, r5.alternativePayment);
            }

            public final AlternativePayment getAlternativePayment() {
                return this.alternativePayment;
            }

            @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption
            public Cashback getCashback() {
                return this.cashback;
            }

            @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption
            public boolean getDownloadAvailable() {
                return this.downloadAvailable;
            }

            @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption
            public PlusPayPrice getPrice() {
                return this.price;
            }

            @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption
            public int getProductId() {
                return this.productId;
            }

            @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption
            public Type getType() {
                return this.type;
            }

            public int hashCode() {
                int b = oyr.b(this.productId, unr0.e((this.price.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.downloadAvailable), 31);
                Cashback cashback = this.cashback;
                int hashCode = (b + (cashback == null ? 0 : cashback.hashCode())) * 31;
                AlternativePayment alternativePayment = this.alternativePayment;
                return hashCode + (alternativePayment != null ? alternativePayment.hashCode() : 0);
            }

            public String toString() {
                return "Native(type=" + this.type + ", price=" + this.price + ", downloadAvailable=" + this.downloadAvailable + ", productId=" + this.productId + ", cashback=" + this.cashback + ", alternativePayment=" + this.alternativePayment + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                this.type.writeToParcel(dest, flags);
                dest.writeParcelable(this.price, flags);
                dest.writeInt(this.downloadAvailable ? 1 : 0);
                dest.writeInt(this.productId);
                Cashback cashback = this.cashback;
                if (cashback == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cashback.writeToParcel(dest, flags);
                }
                dest.writeParcelable(this.alternativePayment, flags);
            }

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment;", "Landroid/os/Parcelable;", "price", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "PromoCode", "PlusPoints", "Discount", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment$Discount;", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment$PlusPoints;", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment$PromoCode;", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface AlternativePayment extends Parcelable {
                PlusPayPrice getPrice();

                @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J2\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment$Discount;", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment;", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "", "iconUrl", "text", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment$Discount;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "Ljava/lang/String;", "getIconUrl", "getText", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Discount implements AlternativePayment {
                    public static final Parcelable.Creator<Discount> CREATOR = new Creator();
                    private final String iconUrl;
                    private final PlusPayPrice price;
                    private final String text;

                    public Discount(PlusPayPrice plusPayPrice, String str, String str2) {
                        this.price = plusPayPrice;
                        this.iconUrl = str;
                        this.text = str2;
                    }

                    public static /* synthetic */ Discount copy$default(Discount discount, PlusPayPrice plusPayPrice, String str, String str2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            plusPayPrice = discount.price;
                        }
                        if ((i & 2) != 0) {
                            str = discount.iconUrl;
                        }
                        if ((i & 4) != 0) {
                            str2 = discount.text;
                        }
                        return discount.copy(plusPayPrice, str, str2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final PlusPayPrice getPrice() {
                        return this.price;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final String getIconUrl() {
                        return this.iconUrl;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final String getText() {
                        return this.text;
                    }

                    public final Discount copy(PlusPayPrice price, String iconUrl, String text) {
                        return new Discount(price, iconUrl, text);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Discount)) {
                            return false;
                        }
                        Discount discount = (Discount) other;
                        return jl40.l(this.price, discount.price) && jl40.l(this.iconUrl, discount.iconUrl) && jl40.l(this.text, discount.text);
                    }

                    public final String getIconUrl() {
                        return this.iconUrl;
                    }

                    @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption.Native.AlternativePayment
                    public PlusPayPrice getPrice() {
                        return this.price;
                    }

                    public final String getText() {
                        return this.text;
                    }

                    public int hashCode() {
                        int hashCode = this.price.hashCode() * 31;
                        String str = this.iconUrl;
                        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.text;
                        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder("Discount(price=");
                        sb.append(this.price);
                        sb.append(", iconUrl=");
                        sb.append(this.iconUrl);
                        sb.append(", text=");
                        return b64.p(sb, this.text, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        dest.writeParcelable(this.price, flags);
                        dest.writeString(this.iconUrl);
                        dest.writeString(this.text);
                    }

                    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Discount> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final Discount createFromParcel(Parcel parcel) {
                            return new Discount((PlusPayPrice) parcel.readParcelable(Discount.class.getClassLoader()), parcel.readString(), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final Discount[] newArray(int i) {
                            return new Discount[i];
                        }
                    }
                }

                @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\fJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0018¨\u0006)"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment$PlusPoints;", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment;", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "", "applied", "Ljava/math/BigDecimal;", "plusPointsSale", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;ZLjava/math/BigDecimal;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component2", "()Z", "component3", "()Ljava/math/BigDecimal;", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;ZLjava/math/BigDecimal;)Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment$PlusPoints;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "Z", "getApplied", "Ljava/math/BigDecimal;", "getPlusPointsSale", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class PlusPoints implements AlternativePayment {
                    public static final Parcelable.Creator<PlusPoints> CREATOR = new Creator();
                    private final boolean applied;
                    private final BigDecimal plusPointsSale;
                    private final PlusPayPrice price;

                    public PlusPoints(PlusPayPrice plusPayPrice, boolean z, BigDecimal bigDecimal) {
                        this.price = plusPayPrice;
                        this.applied = z;
                        this.plusPointsSale = bigDecimal;
                    }

                    public static /* synthetic */ PlusPoints copy$default(PlusPoints plusPoints, PlusPayPrice plusPayPrice, boolean z, BigDecimal bigDecimal, int i, Object obj) {
                        if ((i & 1) != 0) {
                            plusPayPrice = plusPoints.price;
                        }
                        if ((i & 2) != 0) {
                            z = plusPoints.applied;
                        }
                        if ((i & 4) != 0) {
                            bigDecimal = plusPoints.plusPointsSale;
                        }
                        return plusPoints.copy(plusPayPrice, z, bigDecimal);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final PlusPayPrice getPrice() {
                        return this.price;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final boolean getApplied() {
                        return this.applied;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final BigDecimal getPlusPointsSale() {
                        return this.plusPointsSale;
                    }

                    public final PlusPoints copy(PlusPayPrice price, boolean applied, BigDecimal plusPointsSale) {
                        return new PlusPoints(price, applied, plusPointsSale);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof PlusPoints)) {
                            return false;
                        }
                        PlusPoints plusPoints = (PlusPoints) other;
                        return jl40.l(this.price, plusPoints.price) && this.applied == plusPoints.applied && jl40.l(this.plusPointsSale, plusPoints.plusPointsSale);
                    }

                    public final boolean getApplied() {
                        return this.applied;
                    }

                    public final BigDecimal getPlusPointsSale() {
                        return this.plusPointsSale;
                    }

                    @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption.Native.AlternativePayment
                    public PlusPayPrice getPrice() {
                        return this.price;
                    }

                    public int hashCode() {
                        return this.plusPointsSale.hashCode() + unr0.e(this.price.hashCode() * 31, 31, this.applied);
                    }

                    public String toString() {
                        return "PlusPoints(price=" + this.price + ", applied=" + this.applied + ", plusPointsSale=" + this.plusPointsSale + ')';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        dest.writeParcelable(this.price, flags);
                        dest.writeInt(this.applied ? 1 : 0);
                        dest.writeSerializable(this.plusPointsSale);
                    }

                    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<PlusPoints> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final PlusPoints createFromParcel(Parcel parcel) {
                            return new PlusPoints((PlusPayPrice) parcel.readParcelable(PlusPoints.class.getClassLoader()), parcel.readInt() != 0, (BigDecimal) parcel.readSerializable());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final PlusPoints[] newArray(int i) {
                            return new PlusPoints[i];
                        }
                    }
                }

                @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment$PromoCode;", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment;", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "", "value", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;)Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Native$AlternativePayment$PromoCode;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "Ljava/lang/String;", "getValue", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class PromoCode implements AlternativePayment {
                    public static final Parcelable.Creator<PromoCode> CREATOR = new Creator();
                    private final PlusPayPrice price;
                    private final String value;

                    public PromoCode(PlusPayPrice plusPayPrice, String str) {
                        this.price = plusPayPrice;
                        this.value = str;
                    }

                    public static /* synthetic */ PromoCode copy$default(PromoCode promoCode, PlusPayPrice plusPayPrice, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            plusPayPrice = promoCode.price;
                        }
                        if ((i & 2) != 0) {
                            str = promoCode.value;
                        }
                        return promoCode.copy(plusPayPrice, str);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final PlusPayPrice getPrice() {
                        return this.price;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final String getValue() {
                        return this.value;
                    }

                    public final PromoCode copy(PlusPayPrice price, String value) {
                        return new PromoCode(price, value);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof PromoCode)) {
                            return false;
                        }
                        PromoCode promoCode = (PromoCode) other;
                        return jl40.l(this.price, promoCode.price) && jl40.l(this.value, promoCode.value);
                    }

                    @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption.Native.AlternativePayment
                    public PlusPayPrice getPrice() {
                        return this.price;
                    }

                    public final String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode() + (this.price.hashCode() * 31);
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder("PromoCode(price=");
                        sb.append(this.price);
                        sb.append(", value=");
                        return b64.p(sb, this.value, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        dest.writeParcelable(this.price, flags);
                        dest.writeString(this.value);
                    }

                    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<PromoCode> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final PromoCode createFromParcel(Parcel parcel) {
                            return new PromoCode((PlusPayPrice) parcel.readParcelable(PromoCode.class.getClassLoader()), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final PromoCode[] newArray(int i) {
                            return new PromoCode[i];
                        }
                    }
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Native> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Native createFromParcel(Parcel parcel) {
                    return new Native(Type.CREATOR.createFromParcel(parcel), (PlusPayPrice) parcel.readParcelable(Native.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() == 0 ? null : Cashback.CREATOR.createFromParcel(parcel), (AlternativePayment) parcel.readParcelable(Native.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Native[] newArray(int i) {
                    return new Native[i];
                }
            }
        }

        Cashback getCashback();

        boolean getDownloadAvailable();

        PlusPayPrice getPrice();

        int getProductId();

        Type getType();

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J2\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "", "iconUrl", "text", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "Ljava/lang/String;", "getIconUrl", "getText", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cashback implements Parcelable {
            public static final Parcelable.Creator<Cashback> CREATOR = new Creator();
            private final String iconUrl;
            private final PlusPayPrice price;
            private final String text;

            public Cashback(PlusPayPrice plusPayPrice, String str, String str2) {
                this.price = plusPayPrice;
                this.iconUrl = str;
                this.text = str2;
            }

            public static /* synthetic */ Cashback copy$default(Cashback cashback, PlusPayPrice plusPayPrice, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    plusPayPrice = cashback.price;
                }
                if ((i & 2) != 0) {
                    str = cashback.iconUrl;
                }
                if ((i & 4) != 0) {
                    str2 = cashback.text;
                }
                return cashback.copy(plusPayPrice, str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final PlusPayPrice getPrice() {
                return this.price;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIconUrl() {
                return this.iconUrl;
            }

            /* renamed from: component3, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Cashback copy(PlusPayPrice price, String iconUrl, String text) {
                return new Cashback(price, iconUrl, text);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Cashback)) {
                    return false;
                }
                Cashback cashback = (Cashback) other;
                return jl40.l(this.price, cashback.price) && jl40.l(this.iconUrl, cashback.iconUrl) && jl40.l(this.text, cashback.text);
            }

            public final String getIconUrl() {
                return this.iconUrl;
            }

            public final PlusPayPrice getPrice() {
                return this.price;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.price.hashCode() * 31;
                String str = this.iconUrl;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.text;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Cashback(price=");
                sb.append(this.price);
                sb.append(", iconUrl=");
                sb.append(this.iconUrl);
                sb.append(", text=");
                return b64.p(sb, this.text, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeParcelable(this.price, flags);
                dest.writeString(this.iconUrl);
                dest.writeString(this.text);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Cashback> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cashback createFromParcel(Parcel parcel) {
                    return new Cashback((PlusPayPrice) parcel.readParcelable(Cashback.class.getClassLoader()), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cashback[] newArray(int i) {
                    return new Cashback[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0011J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"JN\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0011J\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010\"¨\u00067"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$InApp;", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption;", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;", "type", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "", "downloadAvailable", "", "productId", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;", "cashback", "", "inAppProduct", "<init>", "(Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;Lcom/yandex/plus/pay/api/model/PlusPayPrice;ZILcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component3", "()Z", "component4", "component5", "()Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;", "component6", "()Ljava/lang/String;", "copy", "(Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;Lcom/yandex/plus/pay/api/model/PlusPayPrice;ZILcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;Ljava/lang/String;)Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$InApp;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;", "getType", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "Z", "getDownloadAvailable", CA20Status.STATUS_USER_I, "getProductId", "Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Cashback;", "getCashback", "Ljava/lang/String;", "getInAppProduct", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InApp implements PurchaseOption {
            public static final Parcelable.Creator<InApp> CREATOR = new Creator();
            private final Cashback cashback;
            private final boolean downloadAvailable;
            private final String inAppProduct;
            private final PlusPayPrice price;
            private final int productId;
            private final Type type;

            public InApp(Type type, PlusPayPrice plusPayPrice, boolean z, int i, Cashback cashback, String str) {
                this.type = type;
                this.price = plusPayPrice;
                this.downloadAvailable = z;
                this.productId = i;
                this.cashback = cashback;
                this.inAppProduct = str;
            }

            public static /* synthetic */ InApp copy$default(InApp inApp, Type type, PlusPayPrice plusPayPrice, boolean z, int i, Cashback cashback, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    type = inApp.type;
                }
                if ((i2 & 2) != 0) {
                    plusPayPrice = inApp.price;
                }
                if ((i2 & 4) != 0) {
                    z = inApp.downloadAvailable;
                }
                if ((i2 & 8) != 0) {
                    i = inApp.productId;
                }
                if ((i2 & 16) != 0) {
                    cashback = inApp.cashback;
                }
                if ((i2 & 32) != 0) {
                    str = inApp.inAppProduct;
                }
                Cashback cashback2 = cashback;
                String str2 = str;
                return inApp.copy(type, plusPayPrice, z, i, cashback2, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final PlusPayPrice getPrice() {
                return this.price;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getDownloadAvailable() {
                return this.downloadAvailable;
            }

            /* renamed from: component4, reason: from getter */
            public final int getProductId() {
                return this.productId;
            }

            /* renamed from: component5, reason: from getter */
            public final Cashback getCashback() {
                return this.cashback;
            }

            /* renamed from: component6, reason: from getter */
            public final String getInAppProduct() {
                return this.inAppProduct;
            }

            public final InApp copy(Type type, PlusPayPrice price, boolean downloadAvailable, int productId, Cashback cashback, String inAppProduct) {
                return new InApp(type, price, downloadAvailable, productId, cashback, inAppProduct);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InApp)) {
                    return false;
                }
                InApp inApp = (InApp) other;
                return this.type == inApp.type && jl40.l(this.price, inApp.price) && this.downloadAvailable == inApp.downloadAvailable && this.productId == inApp.productId && jl40.l(this.cashback, inApp.cashback) && jl40.l(this.inAppProduct, inApp.inAppProduct);
            }

            @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption
            public Cashback getCashback() {
                return this.cashback;
            }

            @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption
            public boolean getDownloadAvailable() {
                return this.downloadAvailable;
            }

            public final String getInAppProduct() {
                return this.inAppProduct;
            }

            @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption
            public PlusPayPrice getPrice() {
                return this.price;
            }

            @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption
            public int getProductId() {
                return this.productId;
            }

            @Override // com.yandex.plus.pay.api.feature.transactions.PlusTransactionOffer.PurchaseOption
            public Type getType() {
                return this.type;
            }

            public int hashCode() {
                int b = oyr.b(this.productId, unr0.e((this.price.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.downloadAvailable), 31);
                Cashback cashback = this.cashback;
                return this.inAppProduct.hashCode() + ((b + (cashback == null ? 0 : cashback.hashCode())) * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("InApp(type=");
                sb.append(this.type);
                sb.append(", price=");
                sb.append(this.price);
                sb.append(", downloadAvailable=");
                sb.append(this.downloadAvailable);
                sb.append(", productId=");
                sb.append(this.productId);
                sb.append(", cashback=");
                sb.append(this.cashback);
                sb.append(", inAppProduct=");
                return b64.p(sb, this.inAppProduct, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                this.type.writeToParcel(dest, flags);
                dest.writeParcelable(this.price, flags);
                dest.writeInt(this.downloadAvailable ? 1 : 0);
                dest.writeInt(this.productId);
                Cashback cashback = this.cashback;
                if (cashback == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cashback.writeToParcel(dest, flags);
                }
                dest.writeString(this.inAppProduct);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<InApp> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InApp createFromParcel(Parcel parcel) {
                    return new InApp(Type.CREATOR.createFromParcel(parcel), (PlusPayPrice) parcel.readParcelable(InApp.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() == 0 ? null : Cashback.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InApp[] newArray(int i) {
                    return new InApp[i];
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PurchaseOption$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "PURCHASE", "RENT", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Type implements Parcelable {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Parcelable.Creator<Type> CREATOR;
            public static final Type PURCHASE = new Type("PURCHASE", 0);
            public static final Type RENT = new Type("RENT", 1);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{PURCHASE, RENT};
            }

            static {
                Type[] $values = $values();
                $VALUES = $values;
                $ENTRIES = a.a($values);
                CREATOR = new Creator();
            }

            private Type(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(name());
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Type> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Type createFromParcel(Parcel parcel) {
                    return Type.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Type[] newArray(int i) {
                    return new Type[i];
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionOffer$PromoCodeStatus;", "Landroid/os/Parcelable;", "", "", "text", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "ALREADY_CONSUMED", Card.EXPIRED, "FAILED", "NOT_EXIST", "NOT_STARTED", "ONLY_FOR_FIRST_PURCHASES", "SUCCESS", "TEMPORARY_BANNED", "UNKNOWN", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PromoCodeStatus implements Parcelable {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PromoCodeStatus[] $VALUES;
        public static final Parcelable.Creator<PromoCodeStatus> CREATOR;
        private final String text;
        public static final PromoCodeStatus ALREADY_CONSUMED = new PromoCodeStatus("ALREADY_CONSUMED", 0, "ALREADY_CONSUMED");
        public static final PromoCodeStatus EXPIRED = new PromoCodeStatus(Card.EXPIRED, 1, Card.EXPIRED);
        public static final PromoCodeStatus FAILED = new PromoCodeStatus("FAILED", 2, "FAILED");
        public static final PromoCodeStatus NOT_EXIST = new PromoCodeStatus("NOT_EXIST", 3, "NOT_EXIST");
        public static final PromoCodeStatus NOT_STARTED = new PromoCodeStatus("NOT_STARTED", 4, "NOT_STARTED");
        public static final PromoCodeStatus ONLY_FOR_FIRST_PURCHASES = new PromoCodeStatus("ONLY_FOR_FIRST_PURCHASES", 5, "ONLY_FOR_FIRST_PURCHASES");
        public static final PromoCodeStatus SUCCESS = new PromoCodeStatus("SUCCESS", 6, "SUCCESS");
        public static final PromoCodeStatus TEMPORARY_BANNED = new PromoCodeStatus("TEMPORARY_BANNED", 7, "TEMPORARY_BANNED");
        public static final PromoCodeStatus UNKNOWN = new PromoCodeStatus("UNKNOWN", 8, "UNKNOWN");

        private static final /* synthetic */ PromoCodeStatus[] $values() {
            return new PromoCodeStatus[]{ALREADY_CONSUMED, EXPIRED, FAILED, NOT_EXIST, NOT_STARTED, ONLY_FOR_FIRST_PURCHASES, SUCCESS, TEMPORARY_BANNED, UNKNOWN};
        }

        static {
            PromoCodeStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
            CREATOR = new Creator();
        }

        private PromoCodeStatus(String str, int i, String str2) {
            this.text = str2;
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PromoCodeStatus valueOf(String str) {
            return (PromoCodeStatus) Enum.valueOf(PromoCodeStatus.class, str);
        }

        public static PromoCodeStatus[] values() {
            return (PromoCodeStatus[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name());
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PromoCodeStatus> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PromoCodeStatus createFromParcel(Parcel parcel) {
                return PromoCodeStatus.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PromoCodeStatus[] newArray(int i) {
                return new PromoCodeStatus[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusTransactionOffer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTransactionOffer createFromParcel(Parcel parcel) {
            PlusTransactionOfferRequest createFromParcel = PlusTransactionOfferRequest.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = vfc.e(PlusTransactionOffer.class, parcel, arrayList, i, 1);
            }
            return new PlusTransactionOffer(createFromParcel, arrayList, parcel.readInt() == 0 ? null : PromoCodeStatus.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTransactionOffer[] newArray(int i) {
            return new PlusTransactionOffer[i];
        }
    }
}
