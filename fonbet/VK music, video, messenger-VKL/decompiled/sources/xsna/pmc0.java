package xsna;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import xsna.fmc0;

/* compiled from: PostingSideEffect.kt */
/* loaded from: classes4.dex */
public final class pmc0 implements fmc0.v {
    public final MobileOfficialAppsFeedStat$PickerType a;

    public pmc0(MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType) {
        this.a = mobileOfficialAppsFeedStat$PickerType;
    }

    public final MobileOfficialAppsFeedStat$PickerType a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pmc0) && this.a == ((pmc0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MeasureColdStart(pickerType=" + this.a + ')';
    }
}
