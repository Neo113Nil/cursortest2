package com.yandex.payment.sdk.model.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000bJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0017¨\u0006("}, d2 = {"Lcom/yandex/payment/sdk/model/data/PreselectButtonState;", "Landroid/os/Parcelable;", "", ClidProvider.APP_ACTIVE, "", "total", "subTotal", "<init>", "(ZDLjava/lang/Double;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "component2", "()D", "component3", "()Ljava/lang/Double;", "copy", "(ZDLjava/lang/Double;)Lcom/yandex/payment/sdk/model/data/PreselectButtonState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getActive", CA20Status.STATUS_REQUEST_D, "getTotal", "Ljava/lang/Double;", "getSubTotal", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PreselectButtonState implements Parcelable {
    public static final Parcelable.Creator<PreselectButtonState> CREATOR = new Creator();
    private final boolean active;
    private final Double subTotal;
    private final double total;

    public PreselectButtonState(boolean z, double d, Double d2) {
        this.active = z;
        this.total = d;
        this.subTotal = d2;
    }

    public static /* synthetic */ PreselectButtonState copy$default(PreselectButtonState preselectButtonState, boolean z, double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = preselectButtonState.active;
        }
        if ((i & 2) != 0) {
            d = preselectButtonState.total;
        }
        if ((i & 4) != 0) {
            d2 = preselectButtonState.subTotal;
        }
        return preselectButtonState.copy(z, d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getSubTotal() {
        return this.subTotal;
    }

    public final PreselectButtonState copy(boolean active, double total, Double subTotal) {
        return new PreselectButtonState(active, total, subTotal);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreselectButtonState)) {
            return false;
        }
        PreselectButtonState preselectButtonState = (PreselectButtonState) other;
        return this.active == preselectButtonState.active && Double.compare(this.total, preselectButtonState.total) == 0 && jl40.l(this.subTotal, preselectButtonState.subTotal);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final Double getSubTotal() {
        return this.subTotal;
    }

    public final double getTotal() {
        return this.total;
    }

    public int hashCode() {
        int a = unr0.a(Boolean.hashCode(this.active) * 31, 31, this.total);
        Double d = this.subTotal;
        return a + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        return "PreselectButtonState(active=" + this.active + ", total=" + this.total + ", subTotal=" + this.subTotal + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.active ? 1 : 0);
        dest.writeDouble(this.total);
        Double d = this.subTotal;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PreselectButtonState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreselectButtonState createFromParcel(Parcel parcel) {
            return new PreselectButtonState(parcel.readInt() != 0, parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreselectButtonState[] newArray(int i) {
            return new PreselectButtonState[i];
        }
    }
}
