package defpackage;

import com.yandex.plus.log.api.LogPriority;
import java.util.List;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class llz extends yr31 {
    public final List b;
    public final krl0 c;
    public final etb w;
    public final r0 x;
    public final gci0 y;

    public llz(List list, krl0 krl0Var, etb etbVar) {
        this.b = list;
        this.c = krl0Var;
        this.w = etbVar;
        r0 c = bvf0.c(LogPriority.VERBOSE);
        this.x = c;
        fzw fzwVar = new fzw(5, c, this);
        k5c a = ds31.a(this);
        xsr0.a.getClass();
        this.y = e.R(fzwVar, a, wsr0.c, new glz((LogPriority) c.getValue(), list));
    }
}
