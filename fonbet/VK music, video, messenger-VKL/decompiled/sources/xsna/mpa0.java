package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PipelineDraweeControllerBuilderSupplier.java */
/* loaded from: classes.dex */
public final class mpa0 implements yhn0<lpa0> {
    public final Context a;
    public final skw b;
    public final npa0 c;

    public mpa0(Context context, clo cloVar) {
        gsl gslVar;
        wkw f = wkw.f();
        this.a = context;
        skw e = f.e();
        this.b = e;
        npa0 npa0Var = new npa0();
        this.c = npa0Var;
        Resources resources = context.getResources();
        synchronized (fsl.class) {
            try {
                if (fsl.a == null) {
                    fsl.a = new gsl();
                }
                gslVar = fsl.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        kj2 a = f.a();
        tjo a2 = a == null ? null : a.a();
        f.b.getExperiments().getClass();
        if (h0q0.c == null) {
            h0q0.c = new h0q0(new Handler(Looper.getMainLooper()));
        }
        h0q0 h0q0Var = h0q0.c;
        n220<ww8, svf> n220Var = e.f;
        yhn0<Boolean> a3 = cloVar != null ? cloVar.a() : null;
        npa0Var.a = resources;
        npa0Var.b = gslVar;
        npa0Var.c = a2;
        npa0Var.d = h0q0Var;
        npa0Var.e = n220Var;
        npa0Var.f = a3;
    }

    @Override // xsna.yhn0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lpa0 get() {
        return new lpa0(this.a, this.c, this.b);
    }
}
