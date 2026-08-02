package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: SemanticsProperties.kt */
@vby
/* loaded from: classes11.dex */
public final class clz {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof clz) {
            return this.a == ((clz) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Polite" : i == 1 ? "Assertive" : DeviceInfo.STR_TYPE_UNKNOWN;
    }
}
