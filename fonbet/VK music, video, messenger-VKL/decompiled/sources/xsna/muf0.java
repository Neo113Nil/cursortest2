package xsna;

import kotlin.coroutines.EmptyCoroutineContext;
import xsna.eyx;
import xsna.pvj;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class muf0 implements yvj, huf0 {
    public static final xq9 f = new xq9();
    public final kotlin.coroutines.d b;
    public final kotlin.coroutines.d c;
    public final muf0 d = this;
    public volatile kotlin.coroutines.d e;

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class a extends kotlin.coroutines.a implements pvj {
        public final /* synthetic */ gvi b;
        public final /* synthetic */ muf0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gvi gviVar, muf0 muf0Var) {
            super(pvj.a.b);
            this.b = gviVar;
            this.c = muf0Var;
        }

        @Override // xsna.pvj
        public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
            gvi gviVar = this.b;
            muf0 muf0Var = this.c;
            gviVar.e(muf0Var, th);
            kotlin.coroutines.d dVar2 = muf0Var.c;
            pvj.a aVar = pvj.a.b;
            pvj pvjVar = (pvj) dVar2.get(aVar);
            if (pvjVar != null) {
                pvjVar.handleException(dVar, th);
                return;
            }
            pvj pvjVar2 = (pvj) muf0Var.b.get(aVar);
            if (pvjVar2 == null) {
                throw th;
            }
            pvjVar2.handleException(dVar, th);
        }
    }

    public muf0(kotlin.coroutines.d dVar, kotlin.coroutines.d dVar2) {
        this.b = dVar;
        this.c = dVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                kotlin.coroutines.d dVar = this.e;
                if (dVar == null) {
                    this.e = f;
                } else {
                    iyx.b(dVar, new y7s());
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.huf0
    public final void d() {
        a();
    }

    @Override // xsna.huf0
    public final void f() {
        a();
    }

    @Override // xsna.yvj
    public final kotlin.coroutines.d getCoroutineContext() {
        kotlin.coroutines.d dVar;
        kotlin.coroutines.d dVar2 = this.e;
        if (dVar2 != null && dVar2 != f) {
            return dVar2;
        }
        gvi gviVar = (gvi) this.b.get(gvi.c);
        kotlin.coroutines.d aVar = gviVar != null ? new a(gviVar, this) : EmptyCoroutineContext.b;
        synchronized (this.d) {
            try {
                dVar = this.e;
                if (dVar == null) {
                    kotlin.coroutines.d dVar3 = this.b;
                    dVar = dVar3.plus(new gyx((eyx) dVar3.get(eyx.a.b))).plus(this.c).plus(aVar);
                } else if (dVar == f) {
                    kotlin.coroutines.d dVar4 = this.b;
                    gyx gyxVar = new gyx((eyx) dVar4.get(eyx.a.b));
                    gyxVar.M(new y7s());
                    dVar = dVar4.plus(gyxVar).plus(this.c).plus(aVar);
                }
                this.e = dVar;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // xsna.huf0
    public final void e() {
    }
}
