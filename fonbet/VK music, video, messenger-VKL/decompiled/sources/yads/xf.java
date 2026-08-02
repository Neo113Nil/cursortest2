package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.d;
import xsna.bdn;
import xsna.hpj;
import xsna.myc0;
import xsna.wgl;
import xsna.whn0;
import xsna.zvj;

/* loaded from: classes10.dex */
public final class xf {
    public static void a(Context context, bu1 bu1Var) {
        vf vfVar;
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        hpj a = zvj.a(d.a.a(whn0.a(), wglVar).plus(new y10(bu1Var)));
        jf jfVar = new jf(wglVar, new Handler(Looper.getMainLooper()));
        pf pfVar = new pf(bu1Var);
        h73 h73Var = new h73();
        qu2 a2 = gx2.a().a(context);
        if (a2 == null || !a2.i0) {
            return;
        }
        Long l = a2.j0;
        long longValue = l != null ? l.longValue() : 1000L;
        Long l2 = a2.k0;
        long longValue2 = l2 != null ? l2.longValue() : 6000L;
        Set set = a2.q0;
        if (set == null) {
            set = EmptySet.b;
        }
        Set set2 = set;
        vf vfVar2 = vf.k;
        if (vfVar2 == null) {
            synchronized (vf.j) {
                vfVar = vf.k;
                if (vfVar == null) {
                    vf vfVar3 = new vf(longValue, longValue2, set2, a, jfVar, pfVar, h73Var);
                    vf.k = vfVar3;
                    vfVar = vfVar3;
                }
            }
            vfVar2 = vfVar;
        }
        if (vfVar2.i.getAndSet(true)) {
            return;
        }
        myc0.h(vfVar2.d, vfVar2.h, null, new tf(vfVar2, null), 2).E(new uf(vfVar2));
    }
}
