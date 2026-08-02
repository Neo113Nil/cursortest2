package defpackage;

import android.util.Pair;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.i;
import androidx.room.util.a;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final /* synthetic */ class cg10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ cg10(WorkDatabase workDatabase, fa51 fa51Var, fa51 fa51Var2, List list, String str, Set set, boolean z) {
        this.a = 2;
        this.c = workDatabase;
        this.w = fa51Var;
        this.x = fa51Var2;
        this.y = str;
        this.z = set;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.b;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj4;
                ((j5h) ((fg10) obj5).b.h).onLoadError(((Integer) pair.first).intValue(), (sf10) pair.second, (uwy) obj3, (he10) obj2, (IOException) obj, this.b);
                break;
            case 1:
                i iVar = (i) obj5;
                enw0 enw0Var = (enw0) obj4;
                br7 br7Var = (br7) obj3;
                el31 el31Var = (el31) obj2;
                Timebase timebase = (Timebase) obj;
                if (br7Var == iVar.e()) {
                    iVar.v = enw0Var.d(br7Var, true);
                    lm31 lm31Var = (lm31) el31Var.f(el31.b);
                    Objects.requireNonNull(lm31Var);
                    lm31Var.b(iVar.v, timebase, z);
                    iVar.R();
                    break;
                }
                break;
            case 2:
                WorkDatabase workDatabase = (WorkDatabase) obj5;
                fa51 fa51Var = (fa51) obj4;
                fa51 fa51Var2 = (fa51) obj3;
                String str = (String) obj2;
                Set set = (Set) obj;
                ia51 X0 = workDatabase.X0();
                ka51 Y0 = workDatabase.Y0();
                fa51 b = fa51.b(fa51Var2, null, fa51Var.b, null, fa51Var.k, fa51Var.n, fa51Var.s, fa51Var.t + 1, fa51Var.u, fa51Var.v, 29613053);
                if (fa51Var2.v == 1) {
                    b.u = fa51Var2.u;
                    b.v++;
                }
                a.b(X0.a, false, true, new e331(21, X0, udq0.W(b)));
                a.b(Y0.a, false, true, new lv21(str, 9));
                Y0.a(str, set);
                if (!z) {
                    X0.f(-1L, str);
                    a.b(workDatabase.W0().a, false, true, new brd(str, 16));
                    break;
                }
                break;
            default:
                sc81 sc81Var = (sc81) obj5;
                ((sf81) obj4).n(sc81Var.a, sc81Var.b, (nl81) obj3, (pil0) obj2, (IOException) obj, this.b);
                break;
        }
    }

    public /* synthetic */ cg10(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.z = serializable;
        this.b = z;
    }
}
