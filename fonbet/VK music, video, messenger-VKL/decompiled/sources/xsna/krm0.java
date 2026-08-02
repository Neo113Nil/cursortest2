package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: StrokeJoin.kt */
@vby
/* loaded from: classes11.dex */
public final class krm0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof krm0) {
            return this.a == ((krm0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Miter" : i == 1 ? "Round" : i == 2 ? "Bevel" : DeviceInfo.STR_TYPE_UNKNOWN;
    }
}
