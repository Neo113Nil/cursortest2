package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: StrokeCap.kt */
@vby
/* loaded from: classes11.dex */
public final class hrm0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof hrm0) {
            return this.a == ((hrm0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : DeviceInfo.STR_TYPE_UNKNOWN;
    }
}
