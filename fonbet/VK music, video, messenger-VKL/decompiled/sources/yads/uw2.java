package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import xsna.kxa0;
import xsna.qcy;
import xsna.tv9;

/* loaded from: classes10.dex */
public final class uw2 implements um {
    public final km a;
    public final u52 b;
    public final dn c;
    public final e32 d;
    public final cu2 e;
    public final n32 f;
    public final Handler g;
    public final hx2 h;
    public final mm i;
    public final j12 j;
    public final kz k;
    public final ViewTreeObserver.OnPreDrawListener l;
    public v9 m;
    public x12 n;
    public boolean o;
    public cn p;

    public uw2(km kmVar, u52 u52Var, dn dnVar, e32 e32Var, cu2 cu2Var, n32 n32Var, Handler handler, hx2 hx2Var, mm mmVar, j12 j12Var, kz kzVar) {
        this.a = kmVar;
        this.b = u52Var;
        this.c = dnVar;
        this.d = e32Var;
        this.e = cu2Var;
        this.f = n32Var;
        this.g = handler;
        this.h = hx2Var;
        this.i = mmVar;
        this.j = j12Var;
        this.k = kzVar;
        this.l = new ViewTreeObserver.OnPreDrawListener() { // from class: xsna.ofz0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return yads.uw2.a(yads.uw2.this);
            }
        };
    }

    public static final void a(km kmVar) {
        kmVar.d();
    }

    @Override // yads.um
    public final List b() {
        j12 j12Var = this.j;
        x12 x12Var = this.n;
        j12Var.getClass();
        return j12.b(x12Var);
    }

    @Override // yads.um
    public final String getAdInfo() {
        return this.j.c(this.n);
    }

    public static final void b(uw2 uw2Var) {
        ql3.a(uw2Var.a.C, false);
    }

    @Override // yads.um
    public final List a() {
        j12 j12Var = this.j;
        x12 x12Var = this.n;
        j12Var.getClass();
        return j12.a(x12Var);
    }

    @Override // yads.um
    public final void a(Context context) {
        cn cnVar = this.p;
        if (cnVar != null) {
            an anVar = cnVar.a.e;
            mn2 mn2Var = anVar.c;
            qcy qcyVar = an.d[0];
            ViewGroup viewGroup = (ViewGroup) mn2Var.a.get();
            if (viewGroup != null) {
                rl3.a(viewGroup);
            }
            zf0 zf0Var = anVar.b;
            if (zf0Var != null) {
                zf0Var.c();
            }
        }
        this.b.b.a();
        this.m = null;
        this.n = null;
        this.o = true;
    }

    public /* synthetic */ uw2(km kmVar, ov2 ov2Var) {
        this(kmVar, new u52(kmVar.g(), ov2Var, kmVar.e(), kmVar.f()), new dn(kmVar.e(), kmVar.h()), new e32(kmVar.e()), new cu2(kmVar.e(), kmVar.h()), new n32(kmVar), new Handler(Looper.getMainLooper()), gx2.a(), new mm(), new j12(), new kxa0(kmVar, 17));
    }

    @Override // yads.um
    public final void a(Context context, v9 v9Var) {
        this.a.b.a(v5.c, null);
        qu2 a = this.h.a(context);
        if (a != null && a.F) {
            if (this.o) {
                return;
            }
            e13 e13Var = this.a.c.d.a;
            ov0 c = v9Var.c();
            this.m = v9Var;
            if (e13Var != null && g13.a(context, v9Var, c, this.i, e13Var)) {
                this.b.a(v9Var, new sw2(this), new rw2(this, context, v9Var));
                return;
            }
            l4 a2 = h9.a(e13Var != null ? e13Var.c(context) : 0, e13Var != null ? e13Var.a(context) : 0, c.c, c.d, om3.d(context), om3.b(context));
            oc1.a(a2.c, new Object[0]);
            this.a.b(a2);
            return;
        }
        this.a.b(h9.a);
    }

    public static final boolean a(uw2 uw2Var) {
        uw2Var.g.postDelayed(new tv9(uw2Var, 15), 50L);
        return true;
    }
}
