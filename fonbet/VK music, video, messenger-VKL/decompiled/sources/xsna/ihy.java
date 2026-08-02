package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: KeyboardType.kt */
@vby
/* loaded from: classes11.dex */
public final class ihy {
    public final int a;

    public static String a(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? DeviceInfo.STR_TYPE_PHONE : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ihy) {
            return this.a == ((ihy) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
