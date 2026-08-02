package xsna;

import com.vk.ads.easypromote.impl.domain.model.DurationOption;

/* compiled from: EasyPromoteState.kt */
/* loaded from: classes14.dex */
public final class ioo {
    public final DurationOption a;
    public final String b;

    public ioo(DurationOption durationOption, String str) {
        this.a = durationOption;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioo)) {
            return false;
        }
        ioo iooVar = (ioo) obj;
        return this.a == iooVar.a && epx.f(this.b, iooVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DurationState(selectedDurationOption=");
        sb.append(this.a);
        sb.append(", formattedDueDate=");
        return ho8.a(sb, this.b, ')');
    }
}
