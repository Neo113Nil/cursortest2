package com.yandex.plus.pay.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import defpackage.bbd0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.o4o;
import defpackage.psq0;
import defpackage.qje;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0005\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"com/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason", "Landroid/os/Parcelable;", "Companion", "Backend", "Unexpected", "Connection", "Unauthorized", "PaymentMethodSelection", "com/yandex/plus/pay/adapter/api/c", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$Backend;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$Connection;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$PaymentMethodSelection;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$Unauthorized;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$Unexpected;", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusPaySdkAdapter$PaymentFlowErrorReason extends Parcelable {
    public static final c Companion = c.a;

    @gsq0
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006-"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$Backend;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$TrustErrorKind;", "kind", "<init>", "(Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$TrustErrorKind;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$TrustErrorKind;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_pay_sdk_adapter_api_release", "(Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$Backend;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$TrustErrorKind;", "copy", "(Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$TrustErrorKind;)Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$Backend;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$TrustErrorKind;", "getKind", "Companion", "com/yandex/plus/pay/adapter/api/a", "com/yandex/plus/pay/adapter/api/b", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Backend implements PlusPaySdkAdapter$PaymentFlowErrorReason {
        private final PlusPaySdkAdapter$TrustErrorKind kind;
        public static final b Companion = new b();
        public static final Parcelable.Creator<Backend> CREATOR = new Creator();
        private static final i3y[] $childSerializers = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(14))};

        public /* synthetic */ Backend(int i, PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind, psq0 psq0Var) {
            if (1 == (i & 1)) {
                this.kind = plusPaySdkAdapter$TrustErrorKind;
            } else {
                qje.Z(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            return new o4o("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.TrustErrorKind", (Enum[]) PlusPaySdkAdapter$TrustErrorKind.values());
        }

        public static /* synthetic */ Backend copy$default(Backend backend, PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind, int i, Object obj) {
            if ((i & 1) != 0) {
                plusPaySdkAdapter$TrustErrorKind = backend.kind;
            }
            return backend.copy(plusPaySdkAdapter$TrustErrorKind);
        }

        /* renamed from: component1, reason: from getter */
        public final PlusPaySdkAdapter$TrustErrorKind getKind() {
            return this.kind;
        }

        public final Backend copy(PlusPaySdkAdapter$TrustErrorKind kind) {
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

        public final PlusPaySdkAdapter$TrustErrorKind getKind() {
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
                return new Backend(PlusPaySdkAdapter$TrustErrorKind.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Backend[] newArray(int i) {
                return new Backend[i];
            }
        }

        public Backend(PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind) {
            this.kind = plusPaySdkAdapter$TrustErrorKind;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$Connection;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Connection implements PlusPaySdkAdapter$PaymentFlowErrorReason {
        public static final Connection INSTANCE = new Connection();
        public static final Parcelable.Creator<Connection> CREATOR = new Creator();
        private static final /* synthetic */ i3y $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(15));

        private Connection() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new o4o("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.Connection", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
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

    @gsq0
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006-"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$PaymentMethodSelection;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;", "errorState", "<init>", "(Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_pay_sdk_adapter_api_release", "(Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$PaymentMethodSelection;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;", "copy", "(Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;)Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$PaymentMethodSelection;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;", "getErrorState", "Companion", "com/yandex/plus/pay/adapter/api/d", "com/yandex/plus/pay/adapter/api/e", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentMethodSelection implements PlusPaySdkAdapter$PaymentFlowErrorReason {
        private final PlusSelectPaymentMethodState.Error errorState;
        public static final e Companion = new e();
        public static final Parcelable.Creator<PaymentMethodSelection> CREATOR = new Creator();

        public /* synthetic */ PaymentMethodSelection(int i, PlusSelectPaymentMethodState.Error error, psq0 psq0Var) {
            if (1 == (i & 1)) {
                this.errorState = error;
            } else {
                qje.Z(i, 1, d.a.getDescriptor());
                throw null;
            }
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

        public PaymentMethodSelection(PlusSelectPaymentMethodState.Error error) {
            this.errorState = error;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$Unauthorized;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unauthorized implements PlusPaySdkAdapter$PaymentFlowErrorReason {
        public static final Unauthorized INSTANCE = new Unauthorized();
        public static final Parcelable.Creator<Unauthorized> CREATOR = new Creator();
        private static final /* synthetic */ i3y $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(16));

        private Unauthorized() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new o4o("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.Unauthorized", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
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

    @gsq0
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason$Unexpected;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$PaymentFlowErrorReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unexpected implements PlusPaySdkAdapter$PaymentFlowErrorReason {
        public static final Unexpected INSTANCE = new Unexpected();
        public static final Parcelable.Creator<Unexpected> CREATOR = new Creator();
        private static final /* synthetic */ i3y $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(17));

        private Unexpected() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new o4o("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.Unexpected", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
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
