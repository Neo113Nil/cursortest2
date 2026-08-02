package com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.lka0;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/selectmethod/PaymentSystemName;", "Landroid/os/Parcelable;", "", "rawValue", "<init>", "(Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ljava/lang/String;", "getRawValue", "Companion", "lka0", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaymentSystemName implements Parcelable {
    private final String rawValue;
    public static final lka0 Companion = new lka0();
    public static final Parcelable.Creator<PaymentSystemName> CREATOR = new Creator();
    private static final PaymentSystemName unknown = new PaymentSystemName("unknown");
    private static final PaymentSystemName americanExpress = new PaymentSystemName("AmericanExpress");
    private static final PaymentSystemName discover = new PaymentSystemName("Discover");
    private static final PaymentSystemName jcb = new PaymentSystemName("JCB");
    private static final PaymentSystemName maestro = new PaymentSystemName("Maestro");
    private static final PaymentSystemName mastercard = new PaymentSystemName("MasterCard");
    private static final PaymentSystemName mir = new PaymentSystemName("MIR");
    private static final PaymentSystemName unionPay = new PaymentSystemName("UnionPay");
    private static final PaymentSystemName uzcard = new PaymentSystemName("Uzcard");
    private static final PaymentSystemName visa = new PaymentSystemName("VISA");
    private static final PaymentSystemName visaElectron = new PaymentSystemName("VISA_ELECTRON");
    private static final PaymentSystemName humo = new PaymentSystemName("HUMO");

    public PaymentSystemName(String str) {
        this.rawValue = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof PaymentSystemName) {
            return jl40.l(this.rawValue, ((PaymentSystemName) other).rawValue);
        }
        return false;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public int hashCode() {
        return this.rawValue.hashCode();
    }

    public String toString() {
        return oyr.p("PaymentSystemName(rawValue=", this.rawValue, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.rawValue);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentSystemName> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSystemName createFromParcel(Parcel parcel) {
            return new PaymentSystemName(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSystemName[] newArray(int i) {
            return new PaymentSystemName[i];
        }
    }
}
