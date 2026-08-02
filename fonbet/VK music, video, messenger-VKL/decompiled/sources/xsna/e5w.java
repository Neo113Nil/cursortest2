package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: ImItemHistoryCacheLoader.kt */
/* loaded from: classes2.dex */
public final class e5w {
    public static final e5w a = new e5w();

    public final d5w a(w2w w2wVar, wy1 wy1Var, int i) {
        s8v s8vVar = (s8v) w2wVar.I0().c(new x28(w2wVar, wy1Var, i, 3));
        if (s8vVar == null) {
            d5w d5wVar = (d5w) d5w.j.getValue();
            x7w x7wVar = wy1Var.a;
            x7w x7wVar2 = x7w.g;
            return d5w.a(d5wVar, null, null, null, (x7wVar.equals(x7wVar2) || wy1Var.b.equals(x7wVar2)) ? false : true, 431);
        }
        d5w a2 = t8w.a(s8vVar, w2wVar, this);
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return a2;
        }
        L.u(l, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemHistoryCacheLoader load " + a2});
        return a2;
    }
}
