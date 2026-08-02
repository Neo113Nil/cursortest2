package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: VkShimmerTheme.kt */
/* loaded from: classes17.dex */
public final class tjv0 {
    public final iq2<Float> a;
    public final int b;
    public final float c;
    public final List<l5g> d;
    public final List<Float> e;
    public final float f;

    public tjv0() {
        throw null;
    }

    public tjv0(iq2 iq2Var, int i, float f, List list, List list2, float f2) {
        this.a = iq2Var;
        this.b = i;
        this.c = f;
        this.d = list;
        this.e = list2;
        this.f = f2;
    }

    public static tjv0 a(tjv0 tjv0Var, iq2 iq2Var, int i, List list, List list2, float f, int i2) {
        if ((i2 & 1) != 0) {
            iq2Var = tjv0Var.a;
        }
        iq2 iq2Var2 = iq2Var;
        if ((i2 & 2) != 0) {
            i = tjv0Var.b;
        }
        int i3 = i;
        float f2 = (i2 & 4) != 0 ? tjv0Var.c : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if ((i2 & 8) != 0) {
            list = tjv0Var.d;
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            list2 = tjv0Var.e;
        }
        List list4 = list2;
        if ((i2 & 32) != 0) {
            f = tjv0Var.f;
        }
        tjv0Var.getClass();
        return new tjv0(iq2Var2, i3, f2, list3, list4, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjv0)) {
            return false;
        }
        tjv0 tjv0Var = (tjv0) obj;
        return epx.f(this.a, tjv0Var.a) && this.b == tjv0Var.b && Float.compare(this.c, tjv0Var.c) == 0 && epx.f(this.d, tjv0Var.d) && epx.f(this.e, tjv0Var.e) && pco.b(this.f, tjv0Var.f);
    }

    public final int hashCode() {
        int a = fw3.a(io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        List<Float> list = this.e;
        return Float.hashCode(this.f) + ((a + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkShimmerTheme(animationSpec=");
        sb.append(this.a);
        sb.append(", blendMode=");
        sb.append((Object) ne7.F(this.b));
        sb.append(", rotation=");
        sb.append(this.c);
        sb.append(", shaderColors=");
        sb.append(this.d);
        sb.append(", shaderColorStops=");
        sb.append(this.e);
        sb.append(", shimmerWidth=");
        return ir.f(')', this.f, sb);
    }
}
