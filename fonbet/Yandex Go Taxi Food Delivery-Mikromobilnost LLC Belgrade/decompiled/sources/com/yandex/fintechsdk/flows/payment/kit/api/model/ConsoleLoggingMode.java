package com.yandex.fintechsdk.flows.payment.kit.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/ConsoleLoggingMode;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "ENABLED", "DISABLED", "AUTOMATIC", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConsoleLoggingMode implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ConsoleLoggingMode[] $VALUES;
    public static final Parcelable.Creator<ConsoleLoggingMode> CREATOR;
    public static final ConsoleLoggingMode ENABLED = new ConsoleLoggingMode("ENABLED", 0);
    public static final ConsoleLoggingMode DISABLED = new ConsoleLoggingMode("DISABLED", 1);
    public static final ConsoleLoggingMode AUTOMATIC = new ConsoleLoggingMode("AUTOMATIC", 2);

    private static final /* synthetic */ ConsoleLoggingMode[] $values() {
        return new ConsoleLoggingMode[]{ENABLED, DISABLED, AUTOMATIC};
    }

    static {
        ConsoleLoggingMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        CREATOR = new Parcelable.Creator<ConsoleLoggingMode>() { // from class: com.yandex.fintechsdk.flows.payment.kit.api.model.ConsoleLoggingMode.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConsoleLoggingMode createFromParcel(Parcel parcel) {
                return ConsoleLoggingMode.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConsoleLoggingMode[] newArray(int i) {
                return new ConsoleLoggingMode[i];
            }
        };
    }

    private ConsoleLoggingMode(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ConsoleLoggingMode valueOf(String str) {
        return (ConsoleLoggingMode) Enum.valueOf(ConsoleLoggingMode.class, str);
    }

    public static ConsoleLoggingMode[] values() {
        return (ConsoleLoggingMode[]) $VALUES.clone();
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
