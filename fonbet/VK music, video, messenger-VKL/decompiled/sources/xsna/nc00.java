package xsna;

import android.view.View;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import xsna.q630;

/* compiled from: Magnifier.android.kt */
/* loaded from: classes11.dex */
public final class nc00 extends q630.c implements o1u, lio, fgi0, hr70 {
    public tta0 A;
    public final wh50 B;
    public f1m C;
    public long D;
    public q9x E;
    public nm8 F;
    public izs<? super azl, ov70> p;
    public izs<? super uco, s3q0> q;
    public float r;
    public boolean s;
    public long t;
    public float u;
    public float v;
    public boolean w;
    public uta0 x;
    public View y;
    public azl z;

    /* compiled from: Magnifier.android.kt */
    @b6l(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return nc00.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0032 -> B:8:0x001f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:6:0x0051). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.a.a(r6)
                goto L51
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                kotlin.a.a(r6)
                goto L2e
            L1c:
                kotlin.a.a(r6)
            L1f:
                xsna.nc00 r6 = xsna.nc00.this
                xsna.nm8 r6 = r6.F
                if (r6 == 0) goto L2e
                r5.label = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L2e
                goto L50
            L2e:
                xsna.nc00 r6 = xsna.nc00.this
                xsna.tta0 r6 = r6.A
                if (r6 == 0) goto L1f
                xsna.x90 r6 = new xsna.x90
                r1 = 26
                r6.<init>(r1)
                r5.label = r2
                kotlin.coroutines.d r1 = r5.getContext()
                xsna.g830 r1 = xsna.i830.a(r1)
                xsna.h830 r4 = new xsna.h830
                r4.<init>(r6)
                java.lang.Object r6 = r1.k(r4, r5)
                if (r6 != r0) goto L51
            L50:
                return r0
            L51:
                xsna.nc00 r6 = xsna.nc00.this
                xsna.tta0 r6 = r6.A
                if (r6 == 0) goto L1f
                r6.c()
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: xsna.nc00.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public nc00() {
        throw null;
    }

    public nc00(izs izsVar, izs izsVar2, float f, boolean z, long j, float f2, float f3, boolean z2, uta0 uta0Var) {
        this.p = izsVar;
        this.q = izsVar2;
        this.r = f;
        this.s = z;
        this.t = j;
        this.u = f2;
        this.v = f3;
        this.w = z2;
        this.x = uta0Var;
        this.B = androidx.compose.runtime.k.a(null, w65.e);
        this.D = 9205357640488583168L;
    }

    @Override // xsna.hr70
    public final void D1() {
        ir70.a(this, new dgm(this, 19));
    }

    @Override // xsna.o1u
    public final void T1(androidx.compose.ui.node.o oVar) {
        ((zak0) this.B).setValue(oVar);
    }

    @Override // xsna.q630.c
    public final void a2() {
        D1();
        this.F = w0b.a(0, null, null, 7);
        myc0.h(W1(), null, CoroutineStart.UNDISPATCHED, new a(null), 1);
    }

    @Override // xsna.q630.c
    public final void b2() {
        tta0 tta0Var = this.A;
        if (tta0Var != null) {
            tta0Var.dismiss();
        }
        this.A = null;
    }

    public final long i2() {
        if (this.C == null) {
            this.C = bbk0.b(new ufk(this, 12));
        }
        f1m f1mVar = this.C;
        if (f1mVar != null) {
            return ((ov70) f1mVar.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void j2() {
        tta0 tta0Var = this.A;
        if (tta0Var != null) {
            tta0Var.dismiss();
        }
        View view = this.y;
        if (view == null) {
            view = jtl.a(this);
        }
        View view2 = view;
        this.y = view2;
        azl azlVar = this.z;
        if (azlVar == null) {
            azlVar = itl.f(this).z;
        }
        azl azlVar2 = azlVar;
        this.z = azlVar2;
        this.A = this.x.b(view2, this.s, this.t, this.u, this.v, this.w, azlVar2, this.r);
        l2();
    }

    public final void k2() {
        azl azlVar = this.z;
        if (azlVar == null) {
            azlVar = itl.f(this).z;
            this.z = azlVar;
        }
        long j = this.p.invoke(azlVar).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & i2()) == 9205357640488583168L) {
            this.D = 9205357640488583168L;
            tta0 tta0Var = this.A;
            if (tta0Var != null) {
                tta0Var.dismiss();
                return;
            }
            return;
        }
        this.D = ov70.f(i2(), j);
        if (this.A == null) {
            j2();
        }
        tta0 tta0Var2 = this.A;
        if (tta0Var2 != null) {
            tta0Var2.b(this.D, 9205357640488583168L, this.r);
        }
        l2();
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        tgi0Var.a(oc00.a, new cfl(this, 20));
    }

    public final void l2() {
        azl azlVar;
        tta0 tta0Var = this.A;
        if (tta0Var == null || (azlVar = this.z) == null || q9x.a(tta0Var.a(), this.E)) {
            return;
        }
        izs<? super uco, s3q0> izsVar = this.q;
        if (izsVar != null) {
            izsVar.invoke(new uco(azlVar.E(pli.w(tta0Var.a()))));
        }
        this.E = new q9x(tta0Var.a());
    }

    @Override // xsna.lio
    public final void v(toy toyVar) {
        toyVar.s1();
        nm8 nm8Var = this.F;
        if (nm8Var != null) {
            nm8Var.f(s3q0.a);
        }
    }
}
