package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import defpackage.gsd;
import defpackage.gsq0;
import defpackage.hsd;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kpd;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.v5e0;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006-"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionProduct;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer;", "offer", "<init>", "(Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_feature_webviews_release", "(Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionProduct;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer;", "copy", "(Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer;)Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionProduct;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer;", "getOffer", "Companion", "gsd", "hsd", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompositeSubscriptionProduct implements Parcelable {
    private final PlusPaySdkAdapter$CompositeOffer offer;
    public static final hsd Companion = new hsd();
    public static final Parcelable.Creator<CompositeSubscriptionProduct> CREATOR = new Creator();
    private static final i3y[] $childSerializers = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kpd(9))};

    public /* synthetic */ CompositeSubscriptionProduct(int i, PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer, psq0 psq0Var) {
        if (1 == (i & 1)) {
            this.offer = plusPaySdkAdapter$CompositeOffer;
        } else {
            qje.Z(i, 1, gsd.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new v5e0(qoi0.a(PlusPaySdkAdapter$CompositeOffer.class), new Annotation[0]);
    }

    public static /* synthetic */ CompositeSubscriptionProduct copy$default(CompositeSubscriptionProduct compositeSubscriptionProduct, PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer, int i, Object obj) {
        if ((i & 1) != 0) {
            plusPaySdkAdapter$CompositeOffer = compositeSubscriptionProduct.offer;
        }
        return compositeSubscriptionProduct.copy(plusPaySdkAdapter$CompositeOffer);
    }

    /* renamed from: component1, reason: from getter */
    public final PlusPaySdkAdapter$CompositeOffer getOffer() {
        return this.offer;
    }

    public final CompositeSubscriptionProduct copy(PlusPaySdkAdapter$CompositeOffer offer) {
        return new CompositeSubscriptionProduct(offer);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CompositeSubscriptionProduct) && jl40.l(this.offer, ((CompositeSubscriptionProduct) other).offer);
    }

    public final PlusPaySdkAdapter$CompositeOffer getOffer() {
        return this.offer;
    }

    public int hashCode() {
        return this.offer.hashCode();
    }

    public String toString() {
        return "CompositeSubscriptionProduct(offer=" + this.offer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.offer, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CompositeSubscriptionProduct> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompositeSubscriptionProduct createFromParcel(Parcel parcel) {
            return new CompositeSubscriptionProduct((PlusPaySdkAdapter$CompositeOffer) parcel.readParcelable(CompositeSubscriptionProduct.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompositeSubscriptionProduct[] newArray(int i) {
            return new CompositeSubscriptionProduct[i];
        }
    }

    public CompositeSubscriptionProduct(PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer) {
        this.offer = plusPaySdkAdapter$CompositeOffer;
    }
}
