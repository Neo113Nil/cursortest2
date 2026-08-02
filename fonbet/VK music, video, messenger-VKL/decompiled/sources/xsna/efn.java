package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: DatePicker.kt */
@vby
/* loaded from: classes11.dex */
public final class efn {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof efn) {
            return this.a == ((efn) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Picker" : i == 1 ? "Input" : DeviceInfo.STR_TYPE_UNKNOWN;
    }
}
