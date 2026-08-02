package com.yandex.payment.common.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001f\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0002\u0082\u0001\u001f()*+,-./0123456789:;<=>?@ABCDEF¨\u0006G"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "Landroid/os/Parcelable;", "<init>", "()V", "getDescription", "", "error", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "param", "CardInputScreenLoading", "ChallengerScreenLoading", "SbpChooserScreenLoading", "SelectMethodScreenLoading", "SbpPaymentLoading", "SbpBankOpeningLoading", "SbpFailure", "SbpNoAppsResult", "SbpBankOpenFailed", "StartPayment", "PrepareForPayment", "PaymentSuccess", "PaymentFailure", "PaymentMethodNotFound", "CardBindingSuccess", "CardBindingFailure", "CardBindingLoading", "VerificationLoading", "VerificationSuccess", "VerificationFailure", "PreselectLoading", "PreselectFailure", "NewCardPaymentLoading", "SbpBindingFailure", "SbpBindingLoading", "SbpWaitingForBankResponse", "SbpBindingSuccess", "CvvScreenLoading", "PspChallengeFailure", "IPaymentLoading", "IPaymentPolling", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$CardBindingFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$CardBindingLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$CardBindingSuccess;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$CardInputScreenLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$ChallengerScreenLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$CvvScreenLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$IPaymentLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$IPaymentPolling;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$NewCardPaymentLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$PaymentFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$PaymentMethodNotFound;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$PaymentSuccess;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$PrepareForPayment;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$PreselectFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$PreselectLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$PspChallengeFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpBankOpenFailed;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpBankOpeningLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpBindingFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpBindingLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpBindingSuccess;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpChooserScreenLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpNoAppsResult;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpPaymentLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpWaitingForBankResponse;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$SelectMethodScreenLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$StartPayment;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$VerificationFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$VerificationLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier$VerificationSuccess;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ResultScreenIdentifier implements Parcelable {
    public /* synthetic */ ResultScreenIdentifier(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String getDescription() {
        if (equals(CardInputScreenLoading.INSTANCE)) {
            return "cardInputScreenLoading";
        }
        if (equals(ChallengerScreenLoading.INSTANCE)) {
            return "challengerScreenLoading";
        }
        if (equals(SbpChooserScreenLoading.INSTANCE)) {
            return "sbpChooserScreenLoading";
        }
        if (equals(SelectMethodScreenLoading.INSTANCE)) {
            return "selectMethodScreenLoading";
        }
        if (equals(SbpPaymentLoading.INSTANCE)) {
            return "sbpPaymentLoading";
        }
        if (equals(SbpBankOpeningLoading.INSTANCE)) {
            return "sbpBankOpeningLoading";
        }
        if (this instanceof SbpFailure) {
            return getDescription("sbpFailure", ((SbpFailure) this).getError());
        }
        if (equals(SbpNoAppsResult.INSTANCE)) {
            return "sbpNoAppsResult";
        }
        if (equals(SbpBankOpenFailed.INSTANCE)) {
            return "sbpBankOpenFailed";
        }
        if (equals(StartPayment.INSTANCE)) {
            return "startPayment";
        }
        if (equals(PrepareForPayment.INSTANCE)) {
            return "prepareForPayment";
        }
        if (equals(PaymentSuccess.INSTANCE)) {
            return "paymentSuccess";
        }
        if (this instanceof PaymentFailure) {
            return getDescription("paymentFailure", ((PaymentFailure) this).getError());
        }
        if (this instanceof PaymentMethodNotFound) {
            return getDescription("paymentMethodNotFound", ((PaymentMethodNotFound) this).getId());
        }
        if (equals(CardBindingSuccess.INSTANCE)) {
            return "cardBindingSuccess";
        }
        if (this instanceof CardBindingFailure) {
            return getDescription("cardBindingFailure", ((CardBindingFailure) this).getError());
        }
        if (equals(CardBindingLoading.INSTANCE)) {
            return "cardBindingLoading";
        }
        if (equals(VerificationLoading.INSTANCE)) {
            return "verificationLoading";
        }
        if (equals(VerificationSuccess.INSTANCE)) {
            return "verificationSuccess";
        }
        if (this instanceof VerificationFailure) {
            return getDescription("verificationFailure", ((VerificationFailure) this).getError());
        }
        if (equals(PreselectLoading.INSTANCE)) {
            return "preselectLoading";
        }
        if (this instanceof PreselectFailure) {
            return getDescription("preselectFailure", ((PreselectFailure) this).getError());
        }
        if (equals(NewCardPaymentLoading.INSTANCE)) {
            return "newCardPaymentLoading";
        }
        if (this instanceof SbpBindingFailure) {
            return getDescription("sbpBindingFailure", ((SbpBindingFailure) this).getError());
        }
        if (equals(SbpBindingLoading.INSTANCE)) {
            return "sbpBindingLoading";
        }
        if (equals(SbpWaitingForBankResponse.INSTANCE)) {
            return "sbpWaitingForBankResponse";
        }
        if (equals(SbpBindingSuccess.INSTANCE)) {
            return "sbpBindingSuccess";
        }
        if (equals(CvvScreenLoading.INSTANCE)) {
            return "cvvScreenLoading";
        }
        if (this instanceof PspChallengeFailure) {
            return getDescription("pspChallengeFailure", ((PspChallengeFailure) this).getError());
        }
        if (equals(IPaymentLoading.INSTANCE)) {
            return "iPaymentLoading";
        }
        if (equals(IPaymentPolling.INSTANCE)) {
            return "iPaymentPolling";
        }
        w511.b();
        return null;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$CardBindingFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "<init>", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "copy", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)Lcom/yandex/payment/common/result/ResultScreenIdentifier$CardBindingFailure;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardBindingFailure extends ResultScreenIdentifier {
        public static final Parcelable.Creator<CardBindingFailure> CREATOR = new Creator();
        private final PaymentKitError error;

        public CardBindingFailure(PaymentKitError paymentKitError) {
            super(null);
            this.error = paymentKitError;
        }

        public static /* synthetic */ CardBindingFailure copy$default(CardBindingFailure cardBindingFailure, PaymentKitError paymentKitError, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentKitError = cardBindingFailure.error;
            }
            return cardBindingFailure.copy(paymentKitError);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentKitError getError() {
            return this.error;
        }

        public final CardBindingFailure copy(PaymentKitError error) {
            return new CardBindingFailure(error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CardBindingFailure) && jl40.l(this.error, ((CardBindingFailure) other).error);
        }

        public final PaymentKitError getError() {
            return this.error;
        }

        public int hashCode() {
            PaymentKitError paymentKitError = this.error;
            if (paymentKitError == null) {
                return 0;
            }
            return paymentKitError.hashCode();
        }

        public String toString() {
            return "CardBindingFailure(error=" + this.error + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.error, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CardBindingFailure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBindingFailure createFromParcel(Parcel parcel) {
                return new CardBindingFailure((PaymentKitError) parcel.readParcelable(CardBindingFailure.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBindingFailure[] newArray(int i) {
                return new CardBindingFailure[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$CardBindingLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardBindingLoading extends ResultScreenIdentifier {
        public static final CardBindingLoading INSTANCE = new CardBindingLoading();
        public static final Parcelable.Creator<CardBindingLoading> CREATOR = new Creator();

        private CardBindingLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CardBindingLoading);
        }

        public int hashCode() {
            return -1713994403;
        }

        public String toString() {
            return "CardBindingLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CardBindingLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBindingLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CardBindingLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBindingLoading[] newArray(int i) {
                return new CardBindingLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$CardBindingSuccess;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardBindingSuccess extends ResultScreenIdentifier {
        public static final CardBindingSuccess INSTANCE = new CardBindingSuccess();
        public static final Parcelable.Creator<CardBindingSuccess> CREATOR = new Creator();

        private CardBindingSuccess() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CardBindingSuccess);
        }

        public int hashCode() {
            return 377152548;
        }

        public String toString() {
            return "CardBindingSuccess";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CardBindingSuccess> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBindingSuccess createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CardBindingSuccess.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBindingSuccess[] newArray(int i) {
                return new CardBindingSuccess[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$CardInputScreenLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardInputScreenLoading extends ResultScreenIdentifier {
        public static final CardInputScreenLoading INSTANCE = new CardInputScreenLoading();
        public static final Parcelable.Creator<CardInputScreenLoading> CREATOR = new Creator();

        private CardInputScreenLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CardInputScreenLoading);
        }

        public int hashCode() {
            return 613056236;
        }

        public String toString() {
            return "CardInputScreenLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CardInputScreenLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardInputScreenLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CardInputScreenLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardInputScreenLoading[] newArray(int i) {
                return new CardInputScreenLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$ChallengerScreenLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChallengerScreenLoading extends ResultScreenIdentifier {
        public static final ChallengerScreenLoading INSTANCE = new ChallengerScreenLoading();
        public static final Parcelable.Creator<ChallengerScreenLoading> CREATOR = new Creator();

        private ChallengerScreenLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ChallengerScreenLoading);
        }

        public int hashCode() {
            return 2062665099;
        }

        public String toString() {
            return "ChallengerScreenLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChallengerScreenLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChallengerScreenLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ChallengerScreenLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChallengerScreenLoading[] newArray(int i) {
                return new ChallengerScreenLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$CvvScreenLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CvvScreenLoading extends ResultScreenIdentifier {
        public static final CvvScreenLoading INSTANCE = new CvvScreenLoading();
        public static final Parcelable.Creator<CvvScreenLoading> CREATOR = new Creator();

        private CvvScreenLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CvvScreenLoading);
        }

        public int hashCode() {
            return 1989632579;
        }

        public String toString() {
            return "CvvScreenLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CvvScreenLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CvvScreenLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CvvScreenLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CvvScreenLoading[] newArray(int i) {
                return new CvvScreenLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$IPaymentLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IPaymentLoading extends ResultScreenIdentifier {
        public static final IPaymentLoading INSTANCE = new IPaymentLoading();
        public static final Parcelable.Creator<IPaymentLoading> CREATOR = new Creator();

        private IPaymentLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof IPaymentLoading);
        }

        public int hashCode() {
            return -464637527;
        }

        public String toString() {
            return "IPaymentLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IPaymentLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IPaymentLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return IPaymentLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IPaymentLoading[] newArray(int i) {
                return new IPaymentLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$IPaymentPolling;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IPaymentPolling extends ResultScreenIdentifier {
        public static final IPaymentPolling INSTANCE = new IPaymentPolling();
        public static final Parcelable.Creator<IPaymentPolling> CREATOR = new Creator();

        private IPaymentPolling() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof IPaymentPolling);
        }

        public int hashCode() {
            return -1199193040;
        }

        public String toString() {
            return "IPaymentPolling";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IPaymentPolling> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IPaymentPolling createFromParcel(Parcel parcel) {
                parcel.readInt();
                return IPaymentPolling.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IPaymentPolling[] newArray(int i) {
                return new IPaymentPolling[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$NewCardPaymentLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewCardPaymentLoading extends ResultScreenIdentifier {
        public static final NewCardPaymentLoading INSTANCE = new NewCardPaymentLoading();
        public static final Parcelable.Creator<NewCardPaymentLoading> CREATOR = new Creator();

        private NewCardPaymentLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NewCardPaymentLoading);
        }

        public int hashCode() {
            return 451586640;
        }

        public String toString() {
            return "NewCardPaymentLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NewCardPaymentLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewCardPaymentLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NewCardPaymentLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewCardPaymentLoading[] newArray(int i) {
                return new NewCardPaymentLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$PaymentFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "<init>", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "copy", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)Lcom/yandex/payment/common/result/ResultScreenIdentifier$PaymentFailure;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentFailure extends ResultScreenIdentifier {
        public static final Parcelable.Creator<PaymentFailure> CREATOR = new Creator();
        private final PaymentKitError error;

        public PaymentFailure(PaymentKitError paymentKitError) {
            super(null);
            this.error = paymentKitError;
        }

        public static /* synthetic */ PaymentFailure copy$default(PaymentFailure paymentFailure, PaymentKitError paymentKitError, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentKitError = paymentFailure.error;
            }
            return paymentFailure.copy(paymentKitError);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentKitError getError() {
            return this.error;
        }

        public final PaymentFailure copy(PaymentKitError error) {
            return new PaymentFailure(error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentFailure) && jl40.l(this.error, ((PaymentFailure) other).error);
        }

        public final PaymentKitError getError() {
            return this.error;
        }

        public int hashCode() {
            PaymentKitError paymentKitError = this.error;
            if (paymentKitError == null) {
                return 0;
            }
            return paymentKitError.hashCode();
        }

        public String toString() {
            return "PaymentFailure(error=" + this.error + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.error, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentFailure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentFailure createFromParcel(Parcel parcel) {
                return new PaymentFailure((PaymentKitError) parcel.readParcelable(PaymentFailure.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentFailure[] newArray(int i) {
                return new PaymentFailure[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$PaymentMethodNotFound;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "", "id", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/payment/common/result/ResultScreenIdentifier$PaymentMethodNotFound;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentMethodNotFound extends ResultScreenIdentifier {
        public static final Parcelable.Creator<PaymentMethodNotFound> CREATOR = new Creator();
        private final String id;

        public PaymentMethodNotFound(String str) {
            super(null);
            this.id = str;
        }

        public static /* synthetic */ PaymentMethodNotFound copy$default(PaymentMethodNotFound paymentMethodNotFound, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentMethodNotFound.id;
            }
            return paymentMethodNotFound.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final PaymentMethodNotFound copy(String id) {
            return new PaymentMethodNotFound(id);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentMethodNotFound) && jl40.l(this.id, ((PaymentMethodNotFound) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return oyr.p("PaymentMethodNotFound(id=", this.id, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentMethodNotFound> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodNotFound createFromParcel(Parcel parcel) {
                return new PaymentMethodNotFound(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodNotFound[] newArray(int i) {
                return new PaymentMethodNotFound[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$PaymentSuccess;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentSuccess extends ResultScreenIdentifier {
        public static final PaymentSuccess INSTANCE = new PaymentSuccess();
        public static final Parcelable.Creator<PaymentSuccess> CREATOR = new Creator();

        private PaymentSuccess() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PaymentSuccess);
        }

        public int hashCode() {
            return 1629289811;
        }

        public String toString() {
            return "PaymentSuccess";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentSuccess> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentSuccess createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PaymentSuccess.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentSuccess[] newArray(int i) {
                return new PaymentSuccess[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$PrepareForPayment;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrepareForPayment extends ResultScreenIdentifier {
        public static final PrepareForPayment INSTANCE = new PrepareForPayment();
        public static final Parcelable.Creator<PrepareForPayment> CREATOR = new Creator();

        private PrepareForPayment() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PrepareForPayment);
        }

        public int hashCode() {
            return -1270200466;
        }

        public String toString() {
            return "PrepareForPayment";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrepareForPayment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrepareForPayment createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PrepareForPayment.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrepareForPayment[] newArray(int i) {
                return new PrepareForPayment[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$PreselectFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "<init>", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "copy", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)Lcom/yandex/payment/common/result/ResultScreenIdentifier$PreselectFailure;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreselectFailure extends ResultScreenIdentifier {
        public static final Parcelable.Creator<PreselectFailure> CREATOR = new Creator();
        private final PaymentKitError error;

        public PreselectFailure(PaymentKitError paymentKitError) {
            super(null);
            this.error = paymentKitError;
        }

        public static /* synthetic */ PreselectFailure copy$default(PreselectFailure preselectFailure, PaymentKitError paymentKitError, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentKitError = preselectFailure.error;
            }
            return preselectFailure.copy(paymentKitError);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentKitError getError() {
            return this.error;
        }

        public final PreselectFailure copy(PaymentKitError error) {
            return new PreselectFailure(error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreselectFailure) && jl40.l(this.error, ((PreselectFailure) other).error);
        }

        public final PaymentKitError getError() {
            return this.error;
        }

        public int hashCode() {
            PaymentKitError paymentKitError = this.error;
            if (paymentKitError == null) {
                return 0;
            }
            return paymentKitError.hashCode();
        }

        public String toString() {
            return "PreselectFailure(error=" + this.error + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.error, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PreselectFailure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreselectFailure createFromParcel(Parcel parcel) {
                return new PreselectFailure((PaymentKitError) parcel.readParcelable(PreselectFailure.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreselectFailure[] newArray(int i) {
                return new PreselectFailure[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$PreselectLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreselectLoading extends ResultScreenIdentifier {
        public static final PreselectLoading INSTANCE = new PreselectLoading();
        public static final Parcelable.Creator<PreselectLoading> CREATOR = new Creator();

        private PreselectLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PreselectLoading);
        }

        public int hashCode() {
            return 754824083;
        }

        public String toString() {
            return "PreselectLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PreselectLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreselectLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PreselectLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreselectLoading[] newArray(int i) {
                return new PreselectLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$PspChallengeFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "<init>", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "copy", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)Lcom/yandex/payment/common/result/ResultScreenIdentifier$PspChallengeFailure;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PspChallengeFailure extends ResultScreenIdentifier {
        public static final Parcelable.Creator<PspChallengeFailure> CREATOR = new Creator();
        private final PaymentKitError error;

        public PspChallengeFailure(PaymentKitError paymentKitError) {
            super(null);
            this.error = paymentKitError;
        }

        public static /* synthetic */ PspChallengeFailure copy$default(PspChallengeFailure pspChallengeFailure, PaymentKitError paymentKitError, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentKitError = pspChallengeFailure.error;
            }
            return pspChallengeFailure.copy(paymentKitError);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentKitError getError() {
            return this.error;
        }

        public final PspChallengeFailure copy(PaymentKitError error) {
            return new PspChallengeFailure(error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PspChallengeFailure) && jl40.l(this.error, ((PspChallengeFailure) other).error);
        }

        public final PaymentKitError getError() {
            return this.error;
        }

        public int hashCode() {
            PaymentKitError paymentKitError = this.error;
            if (paymentKitError == null) {
                return 0;
            }
            return paymentKitError.hashCode();
        }

        public String toString() {
            return "PspChallengeFailure(error=" + this.error + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.error, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PspChallengeFailure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PspChallengeFailure createFromParcel(Parcel parcel) {
                return new PspChallengeFailure((PaymentKitError) parcel.readParcelable(PspChallengeFailure.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PspChallengeFailure[] newArray(int i) {
                return new PspChallengeFailure[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpBankOpenFailed;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SbpBankOpenFailed extends ResultScreenIdentifier {
        public static final SbpBankOpenFailed INSTANCE = new SbpBankOpenFailed();
        public static final Parcelable.Creator<SbpBankOpenFailed> CREATOR = new Creator();

        private SbpBankOpenFailed() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SbpBankOpenFailed);
        }

        public int hashCode() {
            return 441533166;
        }

        public String toString() {
            return "SbpBankOpenFailed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpBankOpenFailed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpBankOpenFailed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SbpBankOpenFailed.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpBankOpenFailed[] newArray(int i) {
                return new SbpBankOpenFailed[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpBankOpeningLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SbpBankOpeningLoading extends ResultScreenIdentifier {
        public static final SbpBankOpeningLoading INSTANCE = new SbpBankOpeningLoading();
        public static final Parcelable.Creator<SbpBankOpeningLoading> CREATOR = new Creator();

        private SbpBankOpeningLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SbpBankOpeningLoading);
        }

        public int hashCode() {
            return -888557301;
        }

        public String toString() {
            return "SbpBankOpeningLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpBankOpeningLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpBankOpeningLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SbpBankOpeningLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpBankOpeningLoading[] newArray(int i) {
                return new SbpBankOpeningLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpBindingFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "<init>", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "copy", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpBindingFailure;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SbpBindingFailure extends ResultScreenIdentifier {
        public static final Parcelable.Creator<SbpBindingFailure> CREATOR = new Creator();
        private final PaymentKitError error;

        public SbpBindingFailure(PaymentKitError paymentKitError) {
            super(null);
            this.error = paymentKitError;
        }

        public static /* synthetic */ SbpBindingFailure copy$default(SbpBindingFailure sbpBindingFailure, PaymentKitError paymentKitError, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentKitError = sbpBindingFailure.error;
            }
            return sbpBindingFailure.copy(paymentKitError);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentKitError getError() {
            return this.error;
        }

        public final SbpBindingFailure copy(PaymentKitError error) {
            return new SbpBindingFailure(error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SbpBindingFailure) && jl40.l(this.error, ((SbpBindingFailure) other).error);
        }

        public final PaymentKitError getError() {
            return this.error;
        }

        public int hashCode() {
            PaymentKitError paymentKitError = this.error;
            if (paymentKitError == null) {
                return 0;
            }
            return paymentKitError.hashCode();
        }

        public String toString() {
            return "SbpBindingFailure(error=" + this.error + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.error, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpBindingFailure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpBindingFailure createFromParcel(Parcel parcel) {
                return new SbpBindingFailure((PaymentKitError) parcel.readParcelable(SbpBindingFailure.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpBindingFailure[] newArray(int i) {
                return new SbpBindingFailure[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpBindingLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SbpBindingLoading extends ResultScreenIdentifier {
        public static final SbpBindingLoading INSTANCE = new SbpBindingLoading();
        public static final Parcelable.Creator<SbpBindingLoading> CREATOR = new Creator();

        private SbpBindingLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SbpBindingLoading);
        }

        public int hashCode() {
            return 842534754;
        }

        public String toString() {
            return "SbpBindingLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpBindingLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpBindingLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SbpBindingLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpBindingLoading[] newArray(int i) {
                return new SbpBindingLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpBindingSuccess;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SbpBindingSuccess extends ResultScreenIdentifier {
        public static final SbpBindingSuccess INSTANCE = new SbpBindingSuccess();
        public static final Parcelable.Creator<SbpBindingSuccess> CREATOR = new Creator();

        private SbpBindingSuccess() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SbpBindingSuccess);
        }

        public int hashCode() {
            return -1361285591;
        }

        public String toString() {
            return "SbpBindingSuccess";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpBindingSuccess> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpBindingSuccess createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SbpBindingSuccess.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpBindingSuccess[] newArray(int i) {
                return new SbpBindingSuccess[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpChooserScreenLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SbpChooserScreenLoading extends ResultScreenIdentifier {
        public static final SbpChooserScreenLoading INSTANCE = new SbpChooserScreenLoading();
        public static final Parcelable.Creator<SbpChooserScreenLoading> CREATOR = new Creator();

        private SbpChooserScreenLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SbpChooserScreenLoading);
        }

        public int hashCode() {
            return -176317984;
        }

        public String toString() {
            return "SbpChooserScreenLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpChooserScreenLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpChooserScreenLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SbpChooserScreenLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpChooserScreenLoading[] newArray(int i) {
                return new SbpChooserScreenLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "<init>", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "copy", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpFailure;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SbpFailure extends ResultScreenIdentifier {
        public static final Parcelable.Creator<SbpFailure> CREATOR = new Creator();
        private final PaymentKitError error;

        public SbpFailure(PaymentKitError paymentKitError) {
            super(null);
            this.error = paymentKitError;
        }

        public static /* synthetic */ SbpFailure copy$default(SbpFailure sbpFailure, PaymentKitError paymentKitError, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentKitError = sbpFailure.error;
            }
            return sbpFailure.copy(paymentKitError);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentKitError getError() {
            return this.error;
        }

        public final SbpFailure copy(PaymentKitError error) {
            return new SbpFailure(error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SbpFailure) && jl40.l(this.error, ((SbpFailure) other).error);
        }

        public final PaymentKitError getError() {
            return this.error;
        }

        public int hashCode() {
            PaymentKitError paymentKitError = this.error;
            if (paymentKitError == null) {
                return 0;
            }
            return paymentKitError.hashCode();
        }

        public String toString() {
            return "SbpFailure(error=" + this.error + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.error, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpFailure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpFailure createFromParcel(Parcel parcel) {
                return new SbpFailure((PaymentKitError) parcel.readParcelable(SbpFailure.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpFailure[] newArray(int i) {
                return new SbpFailure[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpNoAppsResult;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SbpNoAppsResult extends ResultScreenIdentifier {
        public static final SbpNoAppsResult INSTANCE = new SbpNoAppsResult();
        public static final Parcelable.Creator<SbpNoAppsResult> CREATOR = new Creator();

        private SbpNoAppsResult() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SbpNoAppsResult);
        }

        public int hashCode() {
            return 765370619;
        }

        public String toString() {
            return "SbpNoAppsResult";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpNoAppsResult> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpNoAppsResult createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SbpNoAppsResult.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpNoAppsResult[] newArray(int i) {
                return new SbpNoAppsResult[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpPaymentLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SbpPaymentLoading extends ResultScreenIdentifier {
        public static final SbpPaymentLoading INSTANCE = new SbpPaymentLoading();
        public static final Parcelable.Creator<SbpPaymentLoading> CREATOR = new Creator();

        private SbpPaymentLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SbpPaymentLoading);
        }

        public int hashCode() {
            return 506906817;
        }

        public String toString() {
            return "SbpPaymentLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpPaymentLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpPaymentLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SbpPaymentLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpPaymentLoading[] newArray(int i) {
                return new SbpPaymentLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$SbpWaitingForBankResponse;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SbpWaitingForBankResponse extends ResultScreenIdentifier {
        public static final SbpWaitingForBankResponse INSTANCE = new SbpWaitingForBankResponse();
        public static final Parcelable.Creator<SbpWaitingForBankResponse> CREATOR = new Creator();

        private SbpWaitingForBankResponse() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SbpWaitingForBankResponse);
        }

        public int hashCode() {
            return -2029144732;
        }

        public String toString() {
            return "SbpWaitingForBankResponse";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpWaitingForBankResponse> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpWaitingForBankResponse createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SbpWaitingForBankResponse.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpWaitingForBankResponse[] newArray(int i) {
                return new SbpWaitingForBankResponse[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$SelectMethodScreenLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectMethodScreenLoading extends ResultScreenIdentifier {
        public static final SelectMethodScreenLoading INSTANCE = new SelectMethodScreenLoading();
        public static final Parcelable.Creator<SelectMethodScreenLoading> CREATOR = new Creator();

        private SelectMethodScreenLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SelectMethodScreenLoading);
        }

        public int hashCode() {
            return -500077251;
        }

        public String toString() {
            return "SelectMethodScreenLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectMethodScreenLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectMethodScreenLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SelectMethodScreenLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectMethodScreenLoading[] newArray(int i) {
                return new SelectMethodScreenLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$StartPayment;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartPayment extends ResultScreenIdentifier {
        public static final StartPayment INSTANCE = new StartPayment();
        public static final Parcelable.Creator<StartPayment> CREATOR = new Creator();

        private StartPayment() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof StartPayment);
        }

        public int hashCode() {
            return 415388410;
        }

        public String toString() {
            return "StartPayment";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StartPayment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartPayment createFromParcel(Parcel parcel) {
                parcel.readInt();
                return StartPayment.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartPayment[] newArray(int i) {
                return new StartPayment[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$VerificationFailure;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "<init>", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "copy", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError;)Lcom/yandex/payment/common/result/ResultScreenIdentifier$VerificationFailure;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VerificationFailure extends ResultScreenIdentifier {
        public static final Parcelable.Creator<VerificationFailure> CREATOR = new Creator();
        private final PaymentKitError error;

        public VerificationFailure(PaymentKitError paymentKitError) {
            super(null);
            this.error = paymentKitError;
        }

        public static /* synthetic */ VerificationFailure copy$default(VerificationFailure verificationFailure, PaymentKitError paymentKitError, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentKitError = verificationFailure.error;
            }
            return verificationFailure.copy(paymentKitError);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentKitError getError() {
            return this.error;
        }

        public final VerificationFailure copy(PaymentKitError error) {
            return new VerificationFailure(error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerificationFailure) && jl40.l(this.error, ((VerificationFailure) other).error);
        }

        public final PaymentKitError getError() {
            return this.error;
        }

        public int hashCode() {
            PaymentKitError paymentKitError = this.error;
            if (paymentKitError == null) {
                return 0;
            }
            return paymentKitError.hashCode();
        }

        public String toString() {
            return "VerificationFailure(error=" + this.error + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.error, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerificationFailure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationFailure createFromParcel(Parcel parcel) {
                return new VerificationFailure((PaymentKitError) parcel.readParcelable(VerificationFailure.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationFailure[] newArray(int i) {
                return new VerificationFailure[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$VerificationLoading;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VerificationLoading extends ResultScreenIdentifier {
        public static final VerificationLoading INSTANCE = new VerificationLoading();
        public static final Parcelable.Creator<VerificationLoading> CREATOR = new Creator();

        private VerificationLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof VerificationLoading);
        }

        public int hashCode() {
            return -1785592277;
        }

        public String toString() {
            return "VerificationLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerificationLoading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VerificationLoading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationLoading[] newArray(int i) {
                return new VerificationLoading[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/common/result/ResultScreenIdentifier$VerificationSuccess;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VerificationSuccess extends ResultScreenIdentifier {
        public static final VerificationSuccess INSTANCE = new VerificationSuccess();
        public static final Parcelable.Creator<VerificationSuccess> CREATOR = new Creator();

        private VerificationSuccess() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof VerificationSuccess);
        }

        public int hashCode() {
            return 305554674;
        }

        public String toString() {
            return "VerificationSuccess";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerificationSuccess> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationSuccess createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VerificationSuccess.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationSuccess[] newArray(int i) {
                return new VerificationSuccess[i];
            }
        }
    }

    private ResultScreenIdentifier() {
    }

    private final String getDescription(String str, PaymentKitError paymentKitError) {
        return getDescription(str, paymentKitError != null ? paymentKitError.toString() : null);
    }

    private final String getDescription(String str, String str2) {
        return str2 != null ? g8e.p(str, Extension.COLON_SPACE, str2) : str;
    }
}
