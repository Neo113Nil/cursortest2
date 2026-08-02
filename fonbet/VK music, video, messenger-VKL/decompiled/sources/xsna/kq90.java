package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: PathFillType.kt */
@vby
/* loaded from: classes11.dex */
public final class kq90 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof kq90) {
            return this.a == ((kq90) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "NonZero" : i == 1 ? "EvenOdd" : DeviceInfo.STR_TYPE_UNKNOWN;
    }
}
