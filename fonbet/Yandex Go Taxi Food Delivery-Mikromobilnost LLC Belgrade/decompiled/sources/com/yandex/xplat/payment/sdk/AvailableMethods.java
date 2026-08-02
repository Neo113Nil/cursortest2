package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.qa4;
import defpackage.ra4;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 !2\u00060\u0001j\u0002`\u0002:\u0001\"BG\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\t\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\n\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b\u000b\u0010\u0010R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/yandex/xplat/payment/sdk/AvailableMethods;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "Lcom/yandex/xplat/payment/sdk/PaymentMethod;", "Lcom/yandex/xplat/common/YSArray;", "paymentMethods", "", "isApplePayAvailable", "isGooglePayAvailable", "isSpbQrAvailable", "isNewSbpTokenAvailable", "isCashAvailable", "<init>", "(Ljava/util/List;ZZZZZ)V", "isEmpty", "()Z", "Lra4;", "builder", "()Lra4;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPaymentMethods", "()Ljava/util/List;", "Z", "Companion", "qa4", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class AvailableMethods implements Parcelable {
    private final boolean isApplePayAvailable;
    private final boolean isCashAvailable;
    private final boolean isGooglePayAvailable;
    private final boolean isNewSbpTokenAvailable;
    private final boolean isSpbQrAvailable;
    private final List<PaymentMethod> paymentMethods;
    public static final qa4 Companion = new qa4();
    public static final Parcelable.Creator<AvailableMethods> CREATOR = new Creator();
    private static final AvailableMethods EMPTY = new AvailableMethods(new ArrayList(), false, false, false, false, false);

    public AvailableMethods(List<PaymentMethod> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.paymentMethods = list;
        this.isApplePayAvailable = z;
        this.isGooglePayAvailable = z2;
        this.isSpbQrAvailable = z3;
        this.isNewSbpTokenAvailable = z4;
        this.isCashAvailable = z5;
    }

    public static final AvailableMethods getEMPTY() {
        Companion.getClass();
        return EMPTY;
    }

    public ra4 builder() {
        ra4 ra4Var = new ra4();
        ra4Var.a = this.paymentMethods;
        ra4Var.b = this.isApplePayAvailable;
        ra4Var.c = this.isGooglePayAvailable;
        ra4Var.d = this.isSpbQrAvailable;
        ra4Var.e = this.isNewSbpTokenAvailable;
        ra4Var.f = this.isCashAvailable;
        return ra4Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    /* renamed from: isApplePayAvailable, reason: from getter */
    public final boolean getIsApplePayAvailable() {
        return this.isApplePayAvailable;
    }

    /* renamed from: isCashAvailable, reason: from getter */
    public final boolean getIsCashAvailable() {
        return this.isCashAvailable;
    }

    public boolean isEmpty() {
        return (this.paymentMethods.size() != 0 || this.isApplePayAvailable || this.isGooglePayAvailable || this.isSpbQrAvailable || this.isNewSbpTokenAvailable || this.isCashAvailable) ? false : true;
    }

    /* renamed from: isGooglePayAvailable, reason: from getter */
    public final boolean getIsGooglePayAvailable() {
        return this.isGooglePayAvailable;
    }

    /* renamed from: isNewSbpTokenAvailable, reason: from getter */
    public final boolean getIsNewSbpTokenAvailable() {
        return this.isNewSbpTokenAvailable;
    }

    /* renamed from: isSpbQrAvailable, reason: from getter */
    public final boolean getIsSpbQrAvailable() {
        return this.isSpbQrAvailable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Iterator t = vfc.t(dest, this.paymentMethods);
        while (t.hasNext()) {
            dest.writeParcelable((Parcelable) t.next(), flags);
        }
        dest.writeInt(this.isApplePayAvailable ? 1 : 0);
        dest.writeInt(this.isGooglePayAvailable ? 1 : 0);
        dest.writeInt(this.isSpbQrAvailable ? 1 : 0);
        dest.writeInt(this.isNewSbpTokenAvailable ? 1 : 0);
        dest.writeInt(this.isCashAvailable ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvailableMethods> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableMethods createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (true) {
                z = true;
                if (i == readInt) {
                    break;
                }
                i = vfc.e(AvailableMethods.class, parcel, arrayList, i, 1);
            }
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z = false;
            }
            return new AvailableMethods(arrayList, z3, z, parcel.readInt() != 0 ? z2 : false, parcel.readInt() != 0 ? z2 : false, parcel.readInt() != 0 ? z2 : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableMethods[] newArray(int i) {
            return new AvailableMethods[i];
        }
    }
}
