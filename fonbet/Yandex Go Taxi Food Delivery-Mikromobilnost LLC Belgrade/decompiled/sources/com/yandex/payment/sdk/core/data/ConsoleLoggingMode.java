package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.k4o;
import defpackage.l6e;
import defpackage.w511;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/sdk/core/data/ConsoleLoggingMode;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/yandex/payment/sdk/core/data/PaymentSdkEnvironment;", WebViewActivity.KEY_ENVIRONMENT, "", "isConsoleLoggingEnabled", "(Lcom/yandex/payment/sdk/core/data/PaymentSdkEnvironment;)Z", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "ENABLED", "DISABLED", "AUTOMATIC", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
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
        $ENTRIES = kotlin.enums.a.a($values);
        CREATOR = new Parcelable.Creator<ConsoleLoggingMode>() { // from class: com.yandex.payment.sdk.core.data.ConsoleLoggingMode.Creator
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

    public final boolean isConsoleLoggingEnabled(PaymentSdkEnvironment environment) {
        int i = l6e.a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                return environment.getIsDebug();
            }
            w511.b();
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
