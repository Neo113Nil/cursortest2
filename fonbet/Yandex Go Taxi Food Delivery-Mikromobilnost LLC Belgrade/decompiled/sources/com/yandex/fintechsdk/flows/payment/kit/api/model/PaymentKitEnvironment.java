package com.yandex.fintechsdk.flows.payment.kit.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/PaymentKitEnvironment;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "PRODUCTION", "TESTING", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaymentKitEnvironment implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentKitEnvironment[] $VALUES;
    public static final Parcelable.Creator<PaymentKitEnvironment> CREATOR;
    public static final PaymentKitEnvironment PRODUCTION = new PaymentKitEnvironment("PRODUCTION", 0);
    public static final PaymentKitEnvironment TESTING = new PaymentKitEnvironment("TESTING", 1);

    private static final /* synthetic */ PaymentKitEnvironment[] $values() {
        return new PaymentKitEnvironment[]{PRODUCTION, TESTING};
    }

    static {
        PaymentKitEnvironment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        CREATOR = new Parcelable.Creator<PaymentKitEnvironment>() { // from class: com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitEnvironment.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentKitEnvironment createFromParcel(Parcel parcel) {
                return PaymentKitEnvironment.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentKitEnvironment[] newArray(int i) {
                return new PaymentKitEnvironment[i];
            }
        };
    }

    private PaymentKitEnvironment(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PaymentKitEnvironment valueOf(String str) {
        return (PaymentKitEnvironment) Enum.valueOf(PaymentKitEnvironment.class, str);
    }

    public static PaymentKitEnvironment[] values() {
        return (PaymentKitEnvironment[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
