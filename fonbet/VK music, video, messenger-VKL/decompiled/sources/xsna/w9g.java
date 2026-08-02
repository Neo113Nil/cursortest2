package xsna;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Clickable.kt */
/* loaded from: classes11.dex */
public final class w9g extends zc {
    public gzs<s3q0> N;
    public boolean O;
    public final xg50<eyx> P;
    public final xg50<a> Q;
    public xlb0 R;
    public yok0 S;
    public yok0 T;
    public boolean U;
    public boolean V;
    public long W;
    public boolean X;
    public nuw Y;
    public yok0 Z;
    public yok0 a0;
    public boolean b0;
    public boolean c0;
    public long d0;
    public boolean e0;

    /* compiled from: Clickable.kt */
    public static final class a {
    }

    /* compiled from: Clickable.kt */
    @b6l(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1", f = "Clickable.kt", l = {1572}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return w9g.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                long c = ((rut0) ovi.a(w9g.this, uvi.t)).c();
                this.label = 1;
                if (qsl.b(c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            gzs<s3q0> gzsVar = w9g.this.N;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            return s3q0.a;
        }
    }

    public w9g() {
        throw null;
    }

    public w9g(gzs gzsVar, gzs gzsVar2, boolean z, sg50 sg50Var, guw guwVar, boolean z2, boolean z3, String str, plg0 plg0Var) {
        super(sg50Var, guwVar, z2, z3, str, plg0Var, gzsVar);
        this.N = gzsVar2;
        this.O = z;
        xg50 xg50Var = t300.a;
        this.P = new xg50<>();
        this.Q = new xg50<>();
        this.W = -1L;
        this.d0 = -1L;
    }

    public final void A2(long j, xlb0 xlb0Var) {
        if (this.w && !this.X) {
            q2(xlb0Var.c, false);
            this.W = j;
            if (!this.V && !this.U) {
                this.x.invoke();
            }
        }
        this.R = null;
        this.X = false;
        this.U = false;
        yok0 yok0Var = this.S;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.S = null;
        this.V = false;
    }

    public final void B2() {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        long j4;
        xg50<eyx> xg50Var = this.P;
        Object[] objArr = xg50Var.c;
        long[] jArr = xg50Var.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j5 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            j2 = 128;
            while (true) {
                long j6 = jArr[i];
                j3 = 255;
                if ((((~j6) << c3) & j6 & j5) != j5) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j6 & 255) < 128) {
                            c2 = c3;
                            j4 = j5;
                            ((eyx) objArr[(i << 3) + i3]).b(null);
                        } else {
                            c2 = c3;
                            j4 = j5;
                        }
                        j6 >>= 8;
                        i3++;
                        c3 = c2;
                        j5 = j4;
                    }
                    c = c3;
                    j = j5;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                    j = j5;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
                j5 = j;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        xg50Var.d();
        xg50<a> xg50Var2 = this.Q;
        Object[] objArr2 = xg50Var2.c;
        long[] jArr2 = xg50Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j7 = jArr2[i4];
                if ((((~j7) << c) & j7 & j) != j) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j7 & j3) < j2) {
                            ((a) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j7 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        xg50Var2.d();
    }

    @Override // xsna.zc, xsna.puw
    public final void E1(fa2 fa2Var, PointerEventPass pointerEventPass) {
        ArrayList arrayList = fa2Var.a;
        super.E1(fa2Var, pointerEventPass);
        int i = 0;
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.Y == null || this.c0) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                nuw nuwVar = (nuw) arrayList.get(i);
                if (nuwVar.i && !nuwVar.equals(this.Y)) {
                    y2(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.Y == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (c4g0.h((nuw) arrayList.get(i2))) {
                    nuw nuwVar2 = (nuw) arrayList.get(0);
                    nuwVar2.i = true;
                    this.Y = nuwVar2;
                    if (this.w) {
                        yok0 yok0Var = this.a0;
                        if (yok0Var != null && yok0Var.isActive()) {
                            ((rut0) ovi.a(this, uvi.t)).getClass();
                            if (nuwVar2.b - this.d0 < 40) {
                                this.e0 = true;
                                return;
                            }
                            this.b0 = true;
                            yok0 yok0Var2 = this.a0;
                            if (yok0Var2 != null) {
                                yok0Var2.b(null);
                            }
                            this.a0 = null;
                        }
                        this.c0 = false;
                        r2(nuwVar2);
                        if (this.N != null) {
                            this.Z = myc0.h(W1(), null, null, new y9g(this, null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.c0) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                nuw nuwVar3 = (nuw) arrayList.get(i3);
                if (!nuwVar3.h || nuwVar3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((nuw) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            nuw nuwVar4 = (nuw) arrayList.get(0);
            nuwVar4.i = true;
            z2(nuwVar4.b, this.Y);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            nuw nuwVar5 = (nuw) arrayList.get(i4);
            if (nuwVar5.i || !nuwVar5.h || nuwVar5.d) {
                float e = ((rut0) ovi.a(this, uvi.t)).e();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    nuw nuwVar6 = (nuw) arrayList.get(i5);
                    boolean z = Math.abs(ov70.d(ov70.e(nuwVar6.c, this.Y.c))) > e;
                    if (nuwVar6.i || z) {
                        y2(true);
                        return;
                    }
                }
                return;
            }
        }
        nuw nuwVar7 = (nuw) arrayList.get(0);
        nuwVar7.i = true;
        z2(nuwVar7.b, this.Y);
    }

    @Override // xsna.zc, xsna.cmb0
    public final void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j) {
        super.H(plb0Var, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.R == null || this.V) {
                return;
            }
            List<xlb0> list = plb0Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                xlb0 xlb0Var = list.get(i);
                if (xlb0Var.c() && !xlb0Var.equals(this.R)) {
                    y2(false);
                    return;
                }
            }
            return;
        }
        if (this.R == null) {
            if (z2o0.f(plb0Var, true, false)) {
                xlb0 xlb0Var2 = plb0Var.a.get(0);
                xlb0Var2.a();
                this.R = xlb0Var2;
                if (this.w) {
                    yok0 yok0Var = this.T;
                    if (yok0Var != null && yok0Var.isActive()) {
                        ((rut0) ovi.a(this, uvi.t)).getClass();
                        if (xlb0Var2.b - this.W < 40) {
                            this.X = true;
                            return;
                        }
                        this.U = true;
                        yok0 yok0Var2 = this.T;
                        if (yok0Var2 != null) {
                            yok0Var2.b(null);
                        }
                        this.T = null;
                    }
                    this.V = false;
                    s2(xlb0Var2);
                    if (this.N != null) {
                        this.S = myc0.h(W1(), null, null, new x9g(this, null), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = plb0Var.c == 2;
        List<xlb0> list2 = plb0Var.a;
        if (z && !this.V && this.w && this.N != null) {
            yok0 yok0Var3 = this.S;
            if (yok0Var3 != null) {
                yok0Var3.b(null);
            }
            this.S = null;
            gzs<s3q0> gzsVar = this.N;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            if (this.O) {
                ((vtu) ovi.a(this, uvi.l)).a(0);
            }
            this.V = true;
        }
        if (this.V) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!fdi.o(list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        list2.get(i3).a();
                    }
                    return;
                }
            }
            xlb0 xlb0Var3 = list2.get(0);
            xlb0Var3.a();
            A2(xlb0Var3.b, this.R);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!fdi.n(list2.get(i4))) {
                long o2 = o2(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    xlb0 xlb0Var4 = list2.get(i5);
                    if (xlb0Var4.c() || fdi.z(xlb0Var4, j, o2)) {
                        y2(false);
                        return;
                    }
                }
                return;
            }
        }
        xlb0 xlb0Var5 = list2.get(0);
        xlb0Var5.a();
        A2(xlb0Var5.b, this.R);
    }

    @Override // xsna.puw
    public final void J0() {
        y2(true);
    }

    @Override // xsna.q630.c
    public final void c2() {
        B2();
    }

    @Override // xsna.zc, xsna.cmb0
    public final void h1() {
        super.h1();
        y2(false);
    }

    @Override // xsna.zc
    public final void l2(tgi0 tgi0Var) {
        if (this.N != null) {
            kd kdVar = new kd(this, 25);
            qcy<Object>[] qcyVarArr = qgi0.a;
            tgi0Var.a(wfi0.c, new ck(null, kdVar));
        }
    }

    @Override // xsna.zc
    public final tkn0 m2() {
        return null;
    }

    @Override // xsna.zc
    public final void u2() {
        B2();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f A[RETURN] */
    @Override // xsna.zc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v2(KeyEvent keyEvent) {
        boolean z;
        long u = zq70.u(keyEvent);
        if (this.N != null) {
            xg50<eyx> xg50Var = this.P;
            if (xg50Var.b(u) == null) {
                xg50Var.i(u, myc0.h(W1(), null, null, new b(null), 3));
                z = true;
                if (this.Q.b(u) != null) {
                    return z;
                }
                throw null;
            }
        }
        z = false;
        if (this.Q.b(u) != null) {
        }
    }

    @Override // xsna.zc
    public final void w2(KeyEvent keyEvent) {
        long u = zq70.u(keyEvent);
        xg50<eyx> xg50Var = this.P;
        boolean z = false;
        if (xg50Var.b(u) != null) {
            eyx b2 = xg50Var.b(u);
            if (b2 != null) {
                if (b2.isActive()) {
                    b2.b(null);
                } else {
                    z = true;
                }
            }
            xg50Var.h(u);
        }
        if (z) {
            return;
        }
        this.x.invoke();
    }

    public final void y2(boolean z) {
        if (z) {
            this.Y = null;
            yok0 yok0Var = this.Z;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            this.Z = null;
            yok0 yok0Var2 = this.a0;
            if (yok0Var2 != null) {
                yok0Var2.b(null);
            }
            this.a0 = null;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1L;
            this.e0 = false;
        } else {
            this.R = null;
            yok0 yok0Var3 = this.S;
            if (yok0Var3 != null) {
                yok0Var3.b(null);
            }
            this.S = null;
            yok0 yok0Var4 = this.T;
            if (yok0Var4 != null) {
                yok0Var4.b(null);
            }
            this.T = null;
            this.U = false;
            this.V = false;
            this.W = -1L;
            this.X = false;
        }
        p2(z);
    }

    public final void z2(long j, nuw nuwVar) {
        if (this.w && !this.e0) {
            q2(nuwVar.c, true);
            this.d0 = j;
            if (!this.c0 && !this.b0) {
                this.x.invoke();
            }
        }
        this.Y = null;
        this.e0 = false;
        this.b0 = false;
        yok0 yok0Var = this.Z;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.Z = null;
        this.c0 = false;
    }
}
