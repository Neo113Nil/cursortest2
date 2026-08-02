package androidx.compose.ui.input.pointer;

import defpackage.dvw;
import defpackage.e530;
import defpackage.exw0;
import defpackage.fwi;
import defpackage.fxw0;
import defpackage.gwd0;
import defpackage.hwd0;
import defpackage.j18;
import defpackage.kol0;
import defpackage.kx91;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.tje;
import defpackage.tls;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.wz40;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes10.dex */
public final class g extends e530 implements hwd0, fwi, gwd0 {
    public final wz40 A;
    public tvd0 B;
    public long C;
    public Object a;
    public Object b;
    public PointerInputEventHandler c;
    public pzt0 w;
    public tvd0 x = exw0.a;
    public final wz40 y;
    public final wz40 z;

    public g(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.c = pointerInputEventHandler;
        wz40 wz40Var = new wz40(new f[16]);
        this.y = wz40Var;
        this.z = wz40Var;
        this.A = new wz40(new f[16]);
        this.C = 0L;
    }

    @Override // defpackage.gwd0
    public final void C0() {
        G0();
    }

    @Override // defpackage.gwd0
    public final void D() {
        tvd0 tvd0Var = this.B;
        if (tvd0Var == null) {
            return;
        }
        List list = tvd0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((zvd0) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    zvd0 zvd0Var = (zvd0) list.get(i2);
                    long j = zvd0Var.a;
                    long j2 = zvd0Var.c;
                    long j3 = zvd0Var.b;
                    float f = zvd0Var.e;
                    boolean z = zvd0Var.d;
                    arrayList.add(new zvd0(j, j3, j2, false, f, j3, j2, z, z, zvd0Var.i, 0L, 1.0f, 0L));
                }
                tvd0 tvd0Var2 = new tvd0(arrayList, null);
                this.x = tvd0Var2;
                F0(tvd0Var2, PointerEventPass.Initial);
                F0(tvd0Var2, PointerEventPass.Main);
                F0(tvd0Var2, PointerEventPass.Final);
                this.B = null;
                return;
            }
        }
    }

    public final Object E0(wls wlsVar, Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        final f fVar = new f(this, j18Var);
        synchronized (this.z) {
            this.y.b(fVar);
            new kol0(dvw.b(dvw.a(wlsVar, fVar, fVar)), CoroutineSingletons.COROUTINE_SUSPENDED).resumeWith(zy11.a);
        }
        j18Var.w(new tls() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                f fVar2 = f.this;
                j18 j18Var2 = fVar2.c;
                if (j18Var2 != null) {
                    j18Var2.b(th);
                }
                fVar2.c = null;
                return zy11.a;
            }
        });
        return j18Var.s();
    }

    public final void F0(tvd0 tvd0Var, PointerEventPass pointerEventPass) {
        j18 j18Var;
        j18 j18Var2;
        synchronized (this.z) {
            wz40 wz40Var = this.A;
            wz40Var.c(wz40Var.c, this.y);
        }
        try {
            int i = fxw0.a[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                wz40 wz40Var2 = this.A;
                Object[] objArr = wz40Var2.a;
                int i2 = wz40Var2.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    f fVar = (f) objArr[i3];
                    if (pointerEventPass == fVar.w && (j18Var = fVar.c) != null) {
                        fVar.c = null;
                        j18Var.resumeWith(tvd0Var);
                    }
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                wz40 wz40Var3 = this.A;
                int i4 = wz40Var3.c - 1;
                Object[] objArr2 = wz40Var3.a;
                if (i4 < objArr2.length) {
                    while (i4 >= 0) {
                        f fVar2 = (f) objArr2[i4];
                        if (pointerEventPass == fVar2.w && (j18Var2 = fVar2.c) != null) {
                            fVar2.c = null;
                            j18Var2.resumeWith(tvd0Var);
                        }
                        i4--;
                    }
                }
            }
            this.A.g();
        } catch (Throwable th) {
            this.A.g();
            throw th;
        }
    }

    public final void G0() {
        pzt0 pzt0Var = this.w;
        if (pzt0Var != null) {
            pzt0Var.u(new PointerInputResetException());
            this.w = null;
        }
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return qje.P(this).R.getDensity();
    }

    @Override // defpackage.gwd0
    public final void m0(tvd0 tvd0Var, PointerEventPass pointerEventPass, long j) {
        this.C = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.x = tvd0Var;
        }
        if (this.w == null) {
            this.w = tje.N(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        F0(tvd0Var, pointerEventPass);
        List list = tvd0Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tvd0Var = null;
                break;
            } else if (!kx91.d((zvd0) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.B = tvd0Var;
    }

    @Override // defpackage.cqh, defpackage.gwd0
    public final void onDensityChange() {
        G0();
    }

    @Override // defpackage.e530
    public final void onDetach() {
        G0();
    }

    @Override // defpackage.fwi
    public final float u0() {
        return qje.P(this).R.u0();
    }
}
