package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: PointerEvent.kt */
@vby
/* loaded from: classes11.dex */
public final class kmb0 {
    public final int a;

    public static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? DeviceInfo.STR_TYPE_UNKNOWN : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kmb0) {
            return this.a == ((kmb0) obj).a;
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
