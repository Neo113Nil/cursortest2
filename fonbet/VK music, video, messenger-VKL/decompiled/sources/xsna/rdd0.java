package xsna;

import com.vk.dto.donut.DonutLevel;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PrivacyEditDonutLevelsState.kt */
/* loaded from: classes18.dex */
public final class rdd0 implements km50 {
    public final List<DonutLevel> b;
    public final DonutLevel c;

    public rdd0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdd0)) {
            return false;
        }
        rdd0 rdd0Var = (rdd0) obj;
        return epx.f(this.b, rdd0Var.b) && epx.f(this.c, rdd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "PrivacyEditDonutLevelsState(levels=" + this.b + ", selectedLevel=" + this.c + ')';
    }

    public rdd0(DonutLevel donutLevel, List list) {
        this.b = list;
        this.c = donutLevel;
    }

    public rdd0(int i) {
        this(DonutLevel.f, EmptyList.b);
    }
}
