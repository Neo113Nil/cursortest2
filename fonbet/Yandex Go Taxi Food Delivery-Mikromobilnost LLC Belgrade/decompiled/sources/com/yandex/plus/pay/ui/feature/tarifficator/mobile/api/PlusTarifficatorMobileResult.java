package com.yandex.plus.pay.ui.feature.tarifficator.mobile.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult;", "Landroid/os/Parcelable;", "PaymentSuccess", "PaymentError", "PaymentCancel", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult$PaymentCancel;", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult$PaymentError;", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult$PaymentSuccess;", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusTarifficatorMobileResult extends Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult$PaymentCancel;", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentCancel implements PlusTarifficatorMobileResult {
        public static final PaymentCancel INSTANCE = new PaymentCancel();
        public static final Parcelable.Creator<PaymentCancel> CREATOR = new Creator();

        private PaymentCancel() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PaymentCancel);
        }

        public int hashCode() {
            return 590950253;
        }

        public String toString() {
            return "PaymentCancel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentCancel> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentCancel createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PaymentCancel.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentCancel[] newArray(int i) {
                return new PaymentCancel[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\nJ\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult$PaymentError;", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", CRLReasonCodeExtension.REASON, "", "errorScreenSkipped", "<init>", "(Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", "component2", "()Z", "copy", "(Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;Z)Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult$PaymentError;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", "getReason", "Z", "getErrorScreenSkipped", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentError implements PlusTarifficatorMobileResult {
        public static final Parcelable.Creator<PaymentError> CREATOR = new Creator();
        private final boolean errorScreenSkipped;
        private final PlusPaymentFlowErrorReason reason;

        public PaymentError(PlusPaymentFlowErrorReason plusPaymentFlowErrorReason, boolean z) {
            this.reason = plusPaymentFlowErrorReason;
            this.errorScreenSkipped = z;
        }

        public static /* synthetic */ PaymentError copy$default(PaymentError paymentError, PlusPaymentFlowErrorReason plusPaymentFlowErrorReason, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                plusPaymentFlowErrorReason = paymentError.reason;
            }
            if ((i & 2) != 0) {
                z = paymentError.errorScreenSkipped;
            }
            return paymentError.copy(plusPaymentFlowErrorReason, z);
        }

        /* renamed from: component1, reason: from getter */
        public final PlusPaymentFlowErrorReason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getErrorScreenSkipped() {
            return this.errorScreenSkipped;
        }

        public final PaymentError copy(PlusPaymentFlowErrorReason reason, boolean errorScreenSkipped) {
            return new PaymentError(reason, errorScreenSkipped);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentError)) {
                return false;
            }
            PaymentError paymentError = (PaymentError) other;
            return jl40.l(this.reason, paymentError.reason) && this.errorScreenSkipped == paymentError.errorScreenSkipped;
        }

        public final boolean getErrorScreenSkipped() {
            return this.errorScreenSkipped;
        }

        public final PlusPaymentFlowErrorReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return Boolean.hashCode(this.errorScreenSkipped) + (this.reason.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaymentError(reason=");
            sb.append(this.reason);
            sb.append(", errorScreenSkipped=");
            return unr0.u(sb, this.errorScreenSkipped, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.reason, flags);
            dest.writeInt(this.errorScreenSkipped ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentError createFromParcel(Parcel parcel) {
                return new PaymentError((PlusPaymentFlowErrorReason) parcel.readParcelable(PaymentError.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentError[] newArray(int i) {
                return new PaymentError[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\nJ\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult$PaymentSuccess;", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "originalOffer", "", "successScreenSkipped", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "component2", "()Z", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Z)Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileResult$PaymentSuccess;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "getOriginalOffer", "Z", "getSuccessScreenSkipped", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentSuccess implements PlusTarifficatorMobileResult {
        public static final Parcelable.Creator<PaymentSuccess> CREATOR = new Creator();
        private final PlusPayCompositeOffers.Offer originalOffer;
        private final boolean successScreenSkipped;

        public PaymentSuccess(PlusPayCompositeOffers.Offer offer, boolean z) {
            this.originalOffer = offer;
            this.successScreenSkipped = z;
        }

        public static /* synthetic */ PaymentSuccess copy$default(PaymentSuccess paymentSuccess, PlusPayCompositeOffers.Offer offer, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                offer = paymentSuccess.originalOffer;
            }
            if ((i & 2) != 0) {
                z = paymentSuccess.successScreenSkipped;
            }
            return paymentSuccess.copy(offer, z);
        }

        /* renamed from: component1, reason: from getter */
        public final PlusPayCompositeOffers.Offer getOriginalOffer() {
            return this.originalOffer;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccessScreenSkipped() {
            return this.successScreenSkipped;
        }

        public final PaymentSuccess copy(PlusPayCompositeOffers.Offer originalOffer, boolean successScreenSkipped) {
            return new PaymentSuccess(originalOffer, successScreenSkipped);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentSuccess)) {
                return false;
            }
            PaymentSuccess paymentSuccess = (PaymentSuccess) other;
            return jl40.l(this.originalOffer, paymentSuccess.originalOffer) && this.successScreenSkipped == paymentSuccess.successScreenSkipped;
        }

        public final PlusPayCompositeOffers.Offer getOriginalOffer() {
            return this.originalOffer;
        }

        public final boolean getSuccessScreenSkipped() {
            return this.successScreenSkipped;
        }

        public int hashCode() {
            return Boolean.hashCode(this.successScreenSkipped) + (this.originalOffer.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaymentSuccess(originalOffer=");
            sb.append(this.originalOffer);
            sb.append(", successScreenSkipped=");
            return unr0.u(sb, this.successScreenSkipped, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.originalOffer, flags);
            dest.writeInt(this.successScreenSkipped ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentSuccess> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentSuccess createFromParcel(Parcel parcel) {
                return new PaymentSuccess((PlusPayCompositeOffers.Offer) parcel.readParcelable(PaymentSuccess.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentSuccess[] newArray(int i) {
                return new PaymentSuccess[i];
            }
        }
    }
}
