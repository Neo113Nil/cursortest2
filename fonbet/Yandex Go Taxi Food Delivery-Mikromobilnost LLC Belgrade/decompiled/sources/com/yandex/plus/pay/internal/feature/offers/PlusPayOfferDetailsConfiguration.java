package com.yandex.plus.pay.internal.feature.offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.internal.model.PlusPayUpsaleStep;
import defpackage.bbd0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qje;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.yjd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00043456B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J0\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u001a\u0010+\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\"¨\u00067"}, d2 = {"Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration;", "Landroid/os/Parcelable;", "", "requestSilentInvoiceAvailability", "requestPaymentMethodsGroups", "Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers;", "additionalOffers", "<init>", "(ZZLcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(IZZLcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "component2", "component3", "()Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers;", "copy", "(ZZLcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers;)Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getRequestSilentInvoiceAvailability", "getRequestPaymentMethodsGroups", "Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers;", "getAdditionalOffers", "Companion", "a", "AdditionalOffers", "com/yandex/plus/pay/internal/feature/offers/h", "com/yandex/plus/pay/internal/feature/offers/c", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayOfferDetailsConfiguration implements Parcelable {
    private final AdditionalOffers additionalOffers;
    private final boolean requestPaymentMethodsGroups;
    private final boolean requestSilentInvoiceAvailability;
    public static final h Companion = new h();
    public static final Parcelable.Creator<PlusPayOfferDetailsConfiguration> CREATOR = new Creator();

    public static final class a {
        public boolean a;
        public boolean b;
        public AdditionalOffers c;
    }

    public /* synthetic */ PlusPayOfferDetailsConfiguration(int i, boolean z, boolean z2, AdditionalOffers additionalOffers, psq0 psq0Var) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, c.a.getDescriptor());
            throw null;
        }
        this.requestSilentInvoiceAvailability = z;
        this.requestPaymentMethodsGroups = z2;
        this.additionalOffers = additionalOffers;
    }

    public static /* synthetic */ PlusPayOfferDetailsConfiguration copy$default(PlusPayOfferDetailsConfiguration plusPayOfferDetailsConfiguration, boolean z, boolean z2, AdditionalOffers additionalOffers, int i, Object obj) {
        if ((i & 1) != 0) {
            z = plusPayOfferDetailsConfiguration.requestSilentInvoiceAvailability;
        }
        if ((i & 2) != 0) {
            z2 = plusPayOfferDetailsConfiguration.requestPaymentMethodsGroups;
        }
        if ((i & 4) != 0) {
            additionalOffers = plusPayOfferDetailsConfiguration.additionalOffers;
        }
        return plusPayOfferDetailsConfiguration.copy(z, z2, additionalOffers);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayOfferDetailsConfiguration self, yjd output, SerialDescriptor serialDesc) {
        output.n(serialDesc, 0, self.requestSilentInvoiceAvailability);
        output.n(serialDesc, 1, self.requestPaymentMethodsGroups);
        output.g(serialDesc, 2, d.a, self.additionalOffers);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRequestSilentInvoiceAvailability() {
        return this.requestSilentInvoiceAvailability;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRequestPaymentMethodsGroups() {
        return this.requestPaymentMethodsGroups;
    }

    /* renamed from: component3, reason: from getter */
    public final AdditionalOffers getAdditionalOffers() {
        return this.additionalOffers;
    }

    public final PlusPayOfferDetailsConfiguration copy(boolean requestSilentInvoiceAvailability, boolean requestPaymentMethodsGroups, AdditionalOffers additionalOffers) {
        return new PlusPayOfferDetailsConfiguration(requestSilentInvoiceAvailability, requestPaymentMethodsGroups, additionalOffers);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayOfferDetailsConfiguration)) {
            return false;
        }
        PlusPayOfferDetailsConfiguration plusPayOfferDetailsConfiguration = (PlusPayOfferDetailsConfiguration) other;
        return this.requestSilentInvoiceAvailability == plusPayOfferDetailsConfiguration.requestSilentInvoiceAvailability && this.requestPaymentMethodsGroups == plusPayOfferDetailsConfiguration.requestPaymentMethodsGroups && jl40.l(this.additionalOffers, plusPayOfferDetailsConfiguration.additionalOffers);
    }

    public final AdditionalOffers getAdditionalOffers() {
        return this.additionalOffers;
    }

    public final boolean getRequestPaymentMethodsGroups() {
        return this.requestPaymentMethodsGroups;
    }

    public final boolean getRequestSilentInvoiceAvailability() {
        return this.requestSilentInvoiceAvailability;
    }

    public int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.requestSilentInvoiceAvailability) * 31, 31, this.requestPaymentMethodsGroups);
        AdditionalOffers additionalOffers = this.additionalOffers;
        return e + (additionalOffers == null ? 0 : additionalOffers.hashCode());
    }

    public String toString() {
        return "PlusPayOfferDetailsConfiguration(requestSilentInvoiceAvailability=" + this.requestSilentInvoiceAvailability + ", requestPaymentMethodsGroups=" + this.requestPaymentMethodsGroups + ", additionalOffers=" + this.additionalOffers + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.requestSilentInvoiceAvailability ? 1 : 0);
        dest.writeInt(this.requestPaymentMethodsGroups ? 1 : 0);
        AdditionalOffers additionalOffers = this.additionalOffers;
        if (additionalOffers == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalOffers.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0003012B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ0\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001f¨\u00063"}, d2 = {"Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers;", "Landroid/os/Parcelable;", "", "Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;", "passedUpsaleSteps", "Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers$Offer;", "offers", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPassedUpsaleSteps", "getOffers", "Companion", "Offer", "com/yandex/plus/pay/internal/feature/offers/d", "com/yandex/plus/pay/internal/feature/offers/e", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AdditionalOffers implements Parcelable {
        private static final i3y[] $childSerializers;
        private final List<Offer> offers;
        private final List<PlusPayUpsaleStep> passedUpsaleSteps;
        public static final e Companion = new e();
        public static final Parcelable.Creator<AdditionalOffers> CREATOR = new Creator();

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new bbd0(8)), kotlin.a.b(lazyThreadSafetyMode, new bbd0(9))};
        }

        public /* synthetic */ AdditionalOffers(int i, List list, List list2, psq0 psq0Var) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, d.a.getDescriptor());
                throw null;
            }
            this.passedUpsaleSteps = list;
            this.offers = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new p53(PlusPayUpsaleStep.INSTANCE.serializer(), 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new p53(f.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AdditionalOffers copy$default(AdditionalOffers additionalOffers, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = additionalOffers.passedUpsaleSteps;
            }
            if ((i & 2) != 0) {
                list2 = additionalOffers.offers;
            }
            return additionalOffers.copy(list, list2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(AdditionalOffers self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.e(serialDesc, 0, (KSerializer) i3yVarArr[0].getValue(), self.passedUpsaleSteps);
            output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.offers);
        }

        public final List<PlusPayUpsaleStep> component1() {
            return this.passedUpsaleSteps;
        }

        public final List<Offer> component2() {
            return this.offers;
        }

        public final AdditionalOffers copy(List<? extends PlusPayUpsaleStep> passedUpsaleSteps, List<Offer> offers) {
            return new AdditionalOffers(passedUpsaleSteps, offers);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalOffers)) {
                return false;
            }
            AdditionalOffers additionalOffers = (AdditionalOffers) other;
            return jl40.l(this.passedUpsaleSteps, additionalOffers.passedUpsaleSteps) && jl40.l(this.offers, additionalOffers.offers);
        }

        public final List<Offer> getOffers() {
            return this.offers;
        }

        public final List<PlusPayUpsaleStep> getPassedUpsaleSteps() {
            return this.passedUpsaleSteps;
        }

        public int hashCode() {
            return this.offers.hashCode() + (this.passedUpsaleSteps.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AdditionalOffers(passedUpsaleSteps=");
            sb.append(this.passedUpsaleSteps);
            sb.append(", offers=");
            return unr0.t(sb, this.offers, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator t = vfc.t(dest, this.passedUpsaleSteps);
            while (t.hasNext()) {
                ((PlusPayUpsaleStep) t.next()).writeToParcel(dest, flags);
            }
            Iterator t2 = vfc.t(dest, this.offers);
            while (t2.hasNext()) {
                ((Offer) t2.next()).writeToParcel(dest, flags);
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(JB\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u001a\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b\t\u0010(¨\u0006;"}, d2 = {"Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers$Offer;", "Landroid/os/Parcelable;", "", "offerName", "offersBatchId", "positionId", "Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;", "upsaleStep", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;Z)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;ZLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers$Offer;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;Z)Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers$Offer;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOfferName", "getOffersBatchId", "getPositionId", "Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;", "getUpsaleStep", "Z", "Companion", "com/yandex/plus/pay/internal/feature/offers/f", "com/yandex/plus/pay/internal/feature/offers/g", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Offer implements Parcelable {
            private final boolean isSelected;
            private final String offerName;
            private final String offersBatchId;
            private final String positionId;
            private final PlusPayUpsaleStep upsaleStep;
            public static final g Companion = new g();
            public static final Parcelable.Creator<Offer> CREATOR = new Creator();
            private static final i3y[] $childSerializers = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(10)), null};

            public /* synthetic */ Offer(int i, String str, String str2, String str3, PlusPayUpsaleStep plusPayUpsaleStep, boolean z, psq0 psq0Var) {
                if (31 != (i & 31)) {
                    qje.Z(i, 31, f.a.getDescriptor());
                    throw null;
                }
                this.offerName = str;
                this.offersBatchId = str2;
                this.positionId = str3;
                this.upsaleStep = plusPayUpsaleStep;
                this.isSelected = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return PlusPayUpsaleStep.INSTANCE.serializer();
            }

            public static /* synthetic */ Offer copy$default(Offer offer, String str, String str2, String str3, PlusPayUpsaleStep plusPayUpsaleStep, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = offer.offerName;
                }
                if ((i & 2) != 0) {
                    str2 = offer.offersBatchId;
                }
                if ((i & 4) != 0) {
                    str3 = offer.positionId;
                }
                if ((i & 8) != 0) {
                    plusPayUpsaleStep = offer.upsaleStep;
                }
                if ((i & 16) != 0) {
                    z = offer.isSelected;
                }
                boolean z2 = z;
                String str4 = str3;
                return offer.copy(str, str2, str4, plusPayUpsaleStep, z2);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Offer self, yjd output, SerialDescriptor serialDesc) {
                i3y[] i3yVarArr = $childSerializers;
                output.o(serialDesc, 0, self.offerName);
                output.o(serialDesc, 1, self.offersBatchId);
                output.o(serialDesc, 2, self.positionId);
                output.e(serialDesc, 3, (KSerializer) i3yVarArr[3].getValue(), self.upsaleStep);
                output.n(serialDesc, 4, self.isSelected);
            }

            /* renamed from: component1, reason: from getter */
            public final String getOfferName() {
                return this.offerName;
            }

            /* renamed from: component2, reason: from getter */
            public final String getOffersBatchId() {
                return this.offersBatchId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPositionId() {
                return this.positionId;
            }

            /* renamed from: component4, reason: from getter */
            public final PlusPayUpsaleStep getUpsaleStep() {
                return this.upsaleStep;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            public final Offer copy(String offerName, String offersBatchId, String positionId, PlusPayUpsaleStep upsaleStep, boolean isSelected) {
                return new Offer(offerName, offersBatchId, positionId, upsaleStep, isSelected);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Offer)) {
                    return false;
                }
                Offer offer = (Offer) other;
                return jl40.l(this.offerName, offer.offerName) && jl40.l(this.offersBatchId, offer.offersBatchId) && jl40.l(this.positionId, offer.positionId) && this.upsaleStep == offer.upsaleStep && this.isSelected == offer.isSelected;
            }

            public final String getOfferName() {
                return this.offerName;
            }

            public final String getOffersBatchId() {
                return this.offersBatchId;
            }

            public final String getPositionId() {
                return this.positionId;
            }

            public final PlusPayUpsaleStep getUpsaleStep() {
                return this.upsaleStep;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSelected) + ((this.upsaleStep.hashCode() + unr0.b(unr0.b(this.offerName.hashCode() * 31, 31, this.offersBatchId), 31, this.positionId)) * 31);
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Offer(offerName=");
                sb.append(this.offerName);
                sb.append(", offersBatchId=");
                sb.append(this.offersBatchId);
                sb.append(", positionId=");
                sb.append(this.positionId);
                sb.append(", upsaleStep=");
                sb.append(this.upsaleStep);
                sb.append(", isSelected=");
                return unr0.u(sb, this.isSelected, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.offerName);
                dest.writeString(this.offersBatchId);
                dest.writeString(this.positionId);
                this.upsaleStep.writeToParcel(dest, flags);
                dest.writeInt(this.isSelected ? 1 : 0);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Offer> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Offer createFromParcel(Parcel parcel) {
                    return new Offer(parcel.readString(), parcel.readString(), parcel.readString(), PlusPayUpsaleStep.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Offer[] newArray(int i) {
                    return new Offer[i];
                }
            }

            public Offer(String str, String str2, String str3, PlusPayUpsaleStep plusPayUpsaleStep, boolean z) {
                this.offerName = str;
                this.offersBatchId = str2;
                this.positionId = str3;
                this.upsaleStep = plusPayUpsaleStep;
                this.isSelected = z;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AdditionalOffers> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalOffers createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = oo31.d(PlusPayUpsaleStep.CREATOR, parcel, arrayList, i2, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = oo31.d(Offer.CREATOR, parcel, arrayList2, i, 1);
                }
                return new AdditionalOffers(arrayList, arrayList2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalOffers[] newArray(int i) {
                return new AdditionalOffers[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdditionalOffers(List<? extends PlusPayUpsaleStep> list, List<Offer> list2) {
            this.passedUpsaleSteps = list;
            this.offers = list2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayOfferDetailsConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayOfferDetailsConfiguration createFromParcel(Parcel parcel) {
            return new PlusPayOfferDetailsConfiguration(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : AdditionalOffers.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayOfferDetailsConfiguration[] newArray(int i) {
            return new PlusPayOfferDetailsConfiguration[i];
        }
    }

    public PlusPayOfferDetailsConfiguration(boolean z, boolean z2, AdditionalOffers additionalOffers) {
        this.requestSilentInvoiceAvailability = z;
        this.requestPaymentMethodsGroups = z2;
        this.additionalOffers = additionalOffers;
    }
}
