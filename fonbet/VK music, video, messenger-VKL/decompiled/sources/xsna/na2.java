package xsna;

import android.graphics.Rect;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.f1z;

/* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
/* loaded from: classes11.dex */
public final class na2 extends f1z {
    public eyx b;
    public k1z c;
    public caj0 d;

    @Override // xsna.oua0
    public final void a() {
        eyx eyxVar = this.b;
        if (eyxVar != null) {
            eyxVar.b(null);
        }
        this.b = null;
        sh50<s3q0> k = k();
        if (k != null) {
            ((caj0) k).d();
        }
    }

    @Override // xsna.oua0
    public final void b(tho0 tho0Var, tho0 tho0Var2) {
        k1z k1zVar = this.c;
        if (k1zVar != null) {
            boolean z = (qko0.b(k1zVar.h.b, tho0Var2.b) && epx.f(k1zVar.h.c, tho0Var2.c)) ? false : true;
            k1zVar.h = tho0Var2;
            int size = k1zVar.j.size();
            for (int i = 0; i < size; i++) {
                thf0 thf0Var = (thf0) ((WeakReference) k1zVar.j.get(i)).get();
                if (thf0Var != null) {
                    thf0Var.g = tho0Var2;
                }
            }
            t0z t0zVar = k1zVar.m;
            synchronized (t0zVar.c) {
                t0zVar.j = null;
                t0zVar.l = null;
                t0zVar.k = null;
                t0zVar.m = null;
                t0zVar.n = null;
                s3q0 s3q0Var = s3q0.a;
            }
            if (epx.f(tho0Var, tho0Var2)) {
                if (z) {
                    j2x j2xVar = k1zVar.b;
                    int f = qko0.f(tho0Var2.b);
                    int e = qko0.e(tho0Var2.b);
                    qko0 qko0Var = k1zVar.h.c;
                    int f2 = qko0Var != null ? qko0.f(qko0Var.a) : -1;
                    qko0 qko0Var2 = k1zVar.h.c;
                    j2xVar.c(f, e, f2, qko0Var2 != null ? qko0.e(qko0Var2.a) : -1);
                    return;
                }
                return;
            }
            if (tho0Var != null && (!epx.f(tho0Var.a.c, tho0Var2.a.c) || (qko0.b(tho0Var.b, tho0Var2.b) && !epx.f(tho0Var.c, tho0Var2.c)))) {
                j2x j2xVar2 = k1zVar.b;
                j2xVar2.b().restartInput(j2xVar2.a);
                return;
            }
            int size2 = k1zVar.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                thf0 thf0Var2 = (thf0) ((WeakReference) k1zVar.j.get(i2)).get();
                if (thf0Var2 != null) {
                    tho0 tho0Var3 = k1zVar.h;
                    j2x j2xVar3 = k1zVar.b;
                    if (thf0Var2.k) {
                        thf0Var2.g = tho0Var3;
                        if (thf0Var2.i) {
                            j2xVar3.b().updateExtractedText(j2xVar3.a, thf0Var2.h, ahn.f(tho0Var3));
                        }
                        qko0 qko0Var3 = tho0Var3.c;
                        long j = tho0Var3.b;
                        int f3 = qko0Var3 != null ? qko0.f(qko0Var3.a) : -1;
                        qko0 qko0Var4 = tho0Var3.c;
                        j2xVar3.c(qko0.f(j), qko0.e(j), f3, qko0Var4 != null ? qko0.e(qko0Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // xsna.oua0
    public final void c() {
        f1z.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        this.b = aVar.L1(new ma2(null, this, aVar, null));
    }

    @Override // xsna.oua0
    public final void e(tho0 tho0Var, uv70 uv70Var, ljo0 ljo0Var, lk00 lk00Var, zhf0 zhf0Var, zhf0 zhf0Var2) {
        k1z k1zVar = this.c;
        if (k1zVar != null) {
            t0z t0zVar = k1zVar.m;
            synchronized (t0zVar.c) {
                try {
                    t0zVar.j = tho0Var;
                    t0zVar.l = uv70Var;
                    t0zVar.k = ljo0Var;
                    t0zVar.m = zhf0Var;
                    t0zVar.n = zhf0Var2;
                    if (!t0zVar.e) {
                        if (t0zVar.d) {
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                    t0zVar.a();
                    s3q0 s3q0Var2 = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // xsna.oua0
    public final void f(tho0 tho0Var, rnw rnwVar, lq5 lq5Var, c2u c2uVar) {
        ka2 ka2Var = new ka2(tho0Var, this, rnwVar, lq5Var, c2uVar, 0);
        f1z.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        this.b = aVar.L1(new ma2(ka2Var, this, aVar, null));
    }

    @Override // xsna.oua0
    public final void g(zhf0 zhf0Var) {
        Rect rect;
        k1z k1zVar = this.c;
        if (k1zVar != null) {
            k1zVar.l = new Rect(an10.b(zhf0Var.a), an10.b(zhf0Var.b), an10.b(zhf0Var.c), an10.b(zhf0Var.d));
            if (!k1zVar.j.isEmpty() || (rect = k1zVar.l) == null) {
                return;
            }
            k1zVar.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // xsna.f1z
    public final void i() {
        sh50<s3q0> k = k();
        if (k != null) {
            ((caj0) k).e(s3q0.a);
        }
    }

    public final sh50<s3q0> k() {
        caj0 caj0Var = this.d;
        if (caj0Var != null) {
            return caj0Var;
        }
        if (!otm0.a) {
            return null;
        }
        caj0 b = lyd.b(1, 0, BufferOverflow.DROP_LATEST, 2);
        this.d = b;
        return b;
    }
}
