package com.yandex.plus.pay.ui.api.feature.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import com.yandex.plus.pay.api.exception.PlusPayGooglePlayErrorKind;
import com.yandex.plus.pay.api.exception.PlusPayPaymentGatewayErrorKind;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", "Landroid/os/Parcelable;", "Backend", "GooglePlay", "Unexpected", "Connection", "Unauthorized", "PaymentMethodSelection", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$Backend;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$Connection;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$GooglePlay;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$PaymentMethodSelection;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$Unauthorized;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$Unexpected;", "pay-sdk-ui-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusPaymentFlowErrorReason extends Parcelable {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$Backend;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", "Lcom/yandex/plus/pay/api/exception/PlusPayPaymentGatewayErrorKind;", "kind", "<init>", "(Lcom/yandex/plus/pay/api/exception/PlusPayPaymentGatewayErrorKind;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/exception/PlusPayPaymentGatewayErrorKind;", "copy", "(Lcom/yandex/plus/pay/api/exception/PlusPayPaymentGatewayErrorKind;)Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$Backend;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/exception/PlusPayPaymentGatewayErrorKind;", "getKind", "pay-sdk-ui-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Backend implements PlusPaymentFlowErrorReason {
        public static final Parcelable.Creator<Backend> CREATOR = new Creator();
        private final PlusPayPaymentGatewayErrorKind kind;

        public Backend(PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind) {
            this.kind = plusPayPaymentGatewayErrorKind;
        }

        public static /* synthetic */ Backend copy$default(Backend backend, PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind, int i, Object obj) {
            if ((i & 1) != 0) {
                plusPayPaymentGatewayErrorKind = backend.kind;
            }
            return backend.copy(plusPayPaymentGatewayErrorKind);
        }

        /* renamed from: component1, reason: from getter */
        public final PlusPayPaymentGatewayErrorKind getKind() {
            return this.kind;
        }

        public final Backend copy(PlusPayPaymentGatewayErrorKind kind) {
            return new Backend(kind);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Backend) && this.kind == ((Backend) other).kind;
        }

        public final PlusPayPaymentGatewayErrorKind getKind() {
            return this.kind;
        }

        public int hashCode() {
            return this.kind.hashCode();
        }

        public String toString() {
            return "Backend(kind=" + this.kind + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.kind.name());
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Backend> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Backend createFromParcel(Parcel parcel) {
                return new Backend(PlusPayPaymentGatewayErrorKind.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Backend[] newArray(int i) {
                return new Backend[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$Connection;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "pay-sdk-ui-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Connection implements PlusPaymentFlowErrorReason {
        public static final Connection INSTANCE = new Connection();
        public static final Parcelable.Creator<Connection> CREATOR = new Creator();

        private Connection() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Connection);
        }

        public int hashCode() {
            return 1885304950;
        }

        public String toString() {
            return "Connection";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Connection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Connection createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Connection.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Connection[] newArray(int i) {
                return new Connection[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$GooglePlay;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", "Lcom/yandex/plus/pay/api/exception/PlusPayGooglePlayErrorKind;", "kind", "<init>", "(Lcom/yandex/plus/pay/api/exception/PlusPayGooglePlayErrorKind;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/exception/PlusPayGooglePlayErrorKind;", "copy", "(Lcom/yandex/plus/pay/api/exception/PlusPayGooglePlayErrorKind;)Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$GooglePlay;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/exception/PlusPayGooglePlayErrorKind;", "getKind", "pay-sdk-ui-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GooglePlay implements PlusPaymentFlowErrorReason {
        public static final Parcelable.Creator<GooglePlay> CREATOR = new Creator();
        private final PlusPayGooglePlayErrorKind kind;

        public GooglePlay(PlusPayGooglePlayErrorKind plusPayGooglePlayErrorKind) {
            this.kind = plusPayGooglePlayErrorKind;
        }

        public static /* synthetic */ GooglePlay copy$default(GooglePlay googlePlay, PlusPayGooglePlayErrorKind plusPayGooglePlayErrorKind, int i, Object obj) {
            if ((i & 1) != 0) {
                plusPayGooglePlayErrorKind = googlePlay.kind;
            }
            return googlePlay.copy(plusPayGooglePlayErrorKind);
        }

        /* renamed from: component1, reason: from getter */
        public final PlusPayGooglePlayErrorKind getKind() {
            return this.kind;
        }

        public final GooglePlay copy(PlusPayGooglePlayErrorKind kind) {
            return new GooglePlay(kind);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GooglePlay) && this.kind == ((GooglePlay) other).kind;
        }

        public final PlusPayGooglePlayErrorKind getKind() {
            return this.kind;
        }

        public int hashCode() {
            return this.kind.hashCode();
        }

        public String toString() {
            return "GooglePlay(kind=" + this.kind + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.kind.name());
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GooglePlay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePlay createFromParcel(Parcel parcel) {
                return new GooglePlay(PlusPayGooglePlayErrorKind.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePlay[] newArray(int i) {
                return new GooglePlay[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$PaymentMethodSelection;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;", "errorState", "<init>", "(Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;", "copy", "(Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;)Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$PaymentMethodSelection;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;", "getErrorState", "pay-sdk-ui-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentMethodSelection implements PlusPaymentFlowErrorReason {
        public static final Parcelable.Creator<PaymentMethodSelection> CREATOR = new Creator();
        private final PlusSelectPaymentMethodState.Error errorState;

        public PaymentMethodSelection(PlusSelectPaymentMethodState.Error error) {
            this.errorState = error;
        }

        public static /* synthetic */ PaymentMethodSelection copy$default(PaymentMethodSelection paymentMethodSelection, PlusSelectPaymentMethodState.Error error, int i, Object obj) {
            if ((i & 1) != 0) {
                error = paymentMethodSelection.errorState;
            }
            return paymentMethodSelection.copy(error);
        }

        /* renamed from: component1, reason: from getter */
        public final PlusSelectPaymentMethodState.Error getErrorState() {
            return this.errorState;
        }

        public final PaymentMethodSelection copy(PlusSelectPaymentMethodState.Error errorState) {
            return new PaymentMethodSelection(errorState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentMethodSelection) && jl40.l(this.errorState, ((PaymentMethodSelection) other).errorState);
        }

        public final PlusSelectPaymentMethodState.Error getErrorState() {
            return this.errorState;
        }

        public int hashCode() {
            return this.errorState.hashCode();
        }

        public String toString() {
            return "PaymentMethodSelection(errorState=" + this.errorState + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.errorState, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentMethodSelection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodSelection createFromParcel(Parcel parcel) {
                return new PaymentMethodSelection((PlusSelectPaymentMethodState.Error) parcel.readParcelable(PaymentMethodSelection.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodSelection[] newArray(int i) {
                return new PaymentMethodSelection[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$Unauthorized;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "pay-sdk-ui-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unauthorized implements PlusPaymentFlowErrorReason {
        public static final Unauthorized INSTANCE = new Unauthorized();
        public static final Parcelable.Creator<Unauthorized> CREATOR = new Creator();

        private Unauthorized() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unauthorized);
        }

        public int hashCode() {
            return -2000335732;
        }

        public String toString() {
            return "Unauthorized";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unauthorized> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unauthorized createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Unauthorized.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unauthorized[] newArray(int i) {
                return new Unauthorized[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason$Unexpected;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "pay-sdk-ui-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unexpected implements PlusPaymentFlowErrorReason {
        public static final Unexpected INSTANCE = new Unexpected();
        public static final Parcelable.Creator<Unexpected> CREATOR = new Creator();

        private Unexpected() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unexpected);
        }

        public int hashCode() {
            return -2043501079;
        }

        public String toString() {
            return "Unexpected";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unexpected> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unexpected createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Unexpected.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unexpected[] newArray(int i) {
                return new Unexpected[i];
            }
        }
    }
}
