package defpackage;

import com.yandex.plus.core.config.Environment;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class kmm0 implements jmm0 {
    public final pmm0 a;
    public final mj31 b;

    public kmm0(pmm0 pmm0Var, mj31 mj31Var) {
        this.a = pmm0Var;
        this.b = mj31Var;
    }

    public final ebd0 a() {
        Set set;
        pmm0 pmm0Var = this.a;
        Long id = ((lj) pmm0Var.k.h.getValue()).getId();
        String l = id != null ? id.toString() : null;
        String a = pmm0Var.n.a();
        String str = pmm0Var.d;
        String str2 = pmm0Var.c;
        Environment environment = pmm0Var.f;
        Object h = pmm0Var.y.h();
        if (h instanceof Result.Failure) {
            h = null;
        }
        k2d0 k2d0Var = (k2d0) h;
        List J0 = (k2d0Var == null || (set = k2d0Var.d) == null) ? null : a.J0(set);
        if (J0 == null) {
            J0 = EmptyList.a;
        }
        return new ebd0(l, a, str, str2, environment, J0);
    }

    public final ywv b() {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(ttz0.class, new fs31(this.b, 5))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }
}
