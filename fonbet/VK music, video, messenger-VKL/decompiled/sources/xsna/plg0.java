package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: SemanticsProperties.kt */
@vby
/* loaded from: classes11.dex */
public final class plg0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof plg0) {
            return this.a == ((plg0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : DeviceInfo.STR_TYPE_UNKNOWN;
    }
}
