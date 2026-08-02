package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0004\u0010\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentSdkEnvironment;", "Landroid/os/Parcelable;", "", "", "isDebug", "<init>", "(Ljava/lang/String;IZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "PRODUCTION", "TESTING", "CROWDTESTING", "MIMINOTESTING", "LOCALTESTING", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentSdkEnvironment implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentSdkEnvironment[] $VALUES;
    public static final Parcelable.Creator<PaymentSdkEnvironment> CREATOR;
    private final boolean isDebug;
    public static final PaymentSdkEnvironment PRODUCTION = new PaymentSdkEnvironment("PRODUCTION", 0, false);
    public static final PaymentSdkEnvironment TESTING = new PaymentSdkEnvironment("TESTING", 1, true);
    public static final PaymentSdkEnvironment CROWDTESTING = new PaymentSdkEnvironment("CROWDTESTING", 2, true);
    public static final PaymentSdkEnvironment MIMINOTESTING = new PaymentSdkEnvironment("MIMINOTESTING", 3, false);
    public static final PaymentSdkEnvironment LOCALTESTING = new PaymentSdkEnvironment("LOCALTESTING", 4, true);

    private static final /* synthetic */ PaymentSdkEnvironment[] $values() {
        return new PaymentSdkEnvironment[]{PRODUCTION, TESTING, CROWDTESTING, MIMINOTESTING, LOCALTESTING};
    }

    static {
        PaymentSdkEnvironment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        CREATOR = new Parcelable.Creator<PaymentSdkEnvironment>() { // from class: com.yandex.payment.sdk.core.data.PaymentSdkEnvironment.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentSdkEnvironment createFromParcel(Parcel parcel) {
                return PaymentSdkEnvironment.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentSdkEnvironment[] newArray(int i) {
                return new PaymentSdkEnvironment[i];
            }
        };
    }

    private PaymentSdkEnvironment(String str, int i, boolean z) {
        this.isDebug = z;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PaymentSdkEnvironment valueOf(String str) {
        return (PaymentSdkEnvironment) Enum.valueOf(PaymentSdkEnvironment.class, str);
    }

    public static PaymentSdkEnvironment[] values() {
        return (PaymentSdkEnvironment[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: isDebug, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
