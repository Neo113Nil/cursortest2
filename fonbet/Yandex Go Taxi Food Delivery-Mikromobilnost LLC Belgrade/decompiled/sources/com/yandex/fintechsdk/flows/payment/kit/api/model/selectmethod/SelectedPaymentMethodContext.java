package com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\n\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodContext;", "Landroid/os/Parcelable;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodPayload;", "payload", "resolvedValue", "<init>", "(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodPayload;Landroid/os/Parcelable;)V", "T", "value", "()Landroid/os/Parcelable;", "", "contains", "()Z", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodPayload;", "getPayload", "()Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/SelectedPaymentMethodPayload;", "Landroid/os/Parcelable;", "getResolvedValue", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectedPaymentMethodContext implements Parcelable {
    public static final Parcelable.Creator<SelectedPaymentMethodContext> CREATOR = new Creator();
    private final SelectedPaymentMethodPayload payload;
    private final Parcelable resolvedValue;

    public /* synthetic */ SelectedPaymentMethodContext(SelectedPaymentMethodPayload selectedPaymentMethodPayload, Parcelable parcelable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(selectedPaymentMethodPayload, (i & 2) != 0 ? null : parcelable);
    }

    public final <T extends Parcelable> boolean contains() {
        getResolvedValue();
        jl40.P();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SelectedPaymentMethodPayload getPayload() {
        return this.payload;
    }

    public final Parcelable getResolvedValue() {
        return this.resolvedValue;
    }

    public final <T extends Parcelable> T value() {
        getResolvedValue();
        jl40.P();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.payload.writeToParcel(dest, flags);
        dest.writeParcelable(this.resolvedValue, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectedPaymentMethodContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedPaymentMethodContext createFromParcel(Parcel parcel) {
            return new SelectedPaymentMethodContext(SelectedPaymentMethodPayload.CREATOR.createFromParcel(parcel), parcel.readParcelable(SelectedPaymentMethodContext.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedPaymentMethodContext[] newArray(int i) {
            return new SelectedPaymentMethodContext[i];
        }
    }

    public SelectedPaymentMethodContext(SelectedPaymentMethodPayload selectedPaymentMethodPayload, Parcelable parcelable) {
        this.payload = selectedPaymentMethodPayload;
        this.resolvedValue = parcelable;
    }
}
