package xsna;

import com.vk.dto.donut.DonutLevel;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PrivacyEditDonutLevelsBottomSheetState.kt */
/* loaded from: classes18.dex */
public final class edd0 implements km50 {
    public final List<DonutLevel> b;
    public final DonutLevel c;

    public edd0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edd0)) {
            return false;
        }
        edd0 edd0Var = (edd0) obj;
        return epx.f(this.b, edd0Var.b) && epx.f(this.c, edd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "PrivacyEditDonutLevelsBottomSheetState(levels=" + this.b + ", selectedLevel=" + this.c + ')';
    }

    public edd0(DonutLevel donutLevel, List list) {
        this.b = list;
        this.c = donutLevel;
    }

    public edd0(int i) {
        this(DonutLevel.f, EmptyList.b);
    }
}
