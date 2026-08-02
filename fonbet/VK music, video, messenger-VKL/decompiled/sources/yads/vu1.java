package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.d;
import xsna.bdn;
import xsna.q86;
import xsna.s3q0;
import xsna.vhn0;
import xsna.wgl;
import xsna.whn0;
import xsna.zvj;

/* loaded from: classes10.dex */
public final class vu1 {
    public static final Object f = new Object();
    public static volatile vu1 g;
    public final ou1 a;
    public final su1 b;
    public final xv2 c;
    public final ov2 d;
    public uu1 e;

    public vu1(ou1 ou1Var, su1 su1Var, xv2 xv2Var, ov2 ov2Var, uu1 uu1Var) {
        this.a = ou1Var;
        this.b = su1Var;
        this.c = xv2Var;
        this.d = ov2Var;
        this.e = uu1Var;
    }

    public static final void a(vu1 vu1Var) {
        ArrayList arrayList;
        su1 su1Var = vu1Var.b;
        synchronized (su1Var.a) {
            arrayList = new ArrayList(su1Var.b);
            su1Var.b.clear();
            s3q0 s3q0Var = s3q0.a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v61 v61Var = (v61) it.next();
            if (v61Var != null) {
                v61Var.a();
            }
        }
    }

    public final void b(Context context, l00 l00Var) {
        boolean z;
        boolean z2;
        synchronized (f) {
            try {
                v61 v61Var = new v61(this.a, l00Var);
                z = true;
                z2 = false;
                if (this.e != uu1.d) {
                    this.b.a(v61Var);
                    if (this.e == uu1.b) {
                        this.e = uu1.c;
                        z2 = true;
                        z = false;
                    } else {
                        z = false;
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.a.a.a.execute(new xsna.o4(l00Var, 27));
        }
        if (z2) {
            xv2 xv2Var = this.c;
            ov2 ov2Var = this.d;
            xv2Var.getClass();
            mv3 mv3Var = (mv3) ov2Var;
            y10 y10Var = new y10(mv3Var.a());
            vhn0 a = whn0.a();
            bdn bdnVar = bdn.a;
            this.a.a.b.execute(new wv2(context, mv3Var, zvj.a(d.a.a(a, wgl.c).plus(y10Var)), tu1.a(mv3Var)));
        }
    }

    public final void a(uv2 uv2Var) {
        if (uv2Var instanceof tv2) {
            synchronized (f) {
                this.e = uu1.d;
                s3q0 s3q0Var = s3q0.a;
            }
        } else if (uv2Var instanceof sv2) {
            synchronized (f) {
                this.e = uu1.b;
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
        ou1 ou1Var = this.a;
        ou1Var.a.a.execute(new q86(this, 14));
    }

    public final void a(Context context, l00 l00Var) {
        j1.a(context);
        ou1 ou1Var = this.a;
        ou1Var.a.b.execute(new xsna.x(this, context, l00Var, 4));
    }

    public static final void a(vu1 vu1Var, Context context, l00 l00Var) {
        vu1Var.b(context, l00Var);
    }

    public static final void a(l00 l00Var) {
        l00Var.onInitializationCompleted();
    }
}
