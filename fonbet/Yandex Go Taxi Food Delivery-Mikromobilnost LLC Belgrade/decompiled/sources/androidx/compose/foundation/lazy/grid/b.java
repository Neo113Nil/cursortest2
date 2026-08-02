package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.h;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.runtime.f;
import defpackage.a4y;
import defpackage.a5y;
import defpackage.ac4;
import defpackage.ay40;
import defpackage.b6y;
import defpackage.c6y;
import defpackage.ddb1;
import defpackage.dub1;
import defpackage.i2t0;
import defpackage.i4u;
import defpackage.i4y;
import defpackage.is8;
import defpackage.j4y;
import defpackage.j73;
import defpackage.k4y;
import defpackage.l4y;
import defpackage.lxv;
import defpackage.mtw;
import defpackage.n4y;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.p4y;
import defpackage.ptw;
import defpackage.tdh;
import defpackage.tig0;
import defpackage.tje;
import defpackage.tls;
import defpackage.w9u;
import defpackage.wkp0;
import defpackage.wls;
import defpackage.wz40;
import defpackage.x4c;
import defpackage.xti0;
import defpackage.z5y;
import defpackage.zeb1;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class b implements wkp0 {
    public static final tig0 w = zeb1.c(new w9u(24), new mtw(18));
    public final tdh a;
    public boolean b;
    public i4y c;
    public final l4y d;
    public final oz40 e;
    public final ay40 f;
    public float g;
    public final h h;
    public final boolean i;
    public xti0 j;
    public final n4y k;
    public final ac4 l;
    public final androidx.compose.foundation.lazy.layout.c m;
    public final a5y n;
    public final c6y o;
    public final i4u p;
    public final z5y q;
    public final oz40 r;
    public final oz40 s;
    public final oz40 t;
    public final oz40 u;
    public final d v;

    public b(int i, int i2, tdh tdhVar) {
        this.a = tdhVar;
        this.d = new l4y(i, i2);
        this.e = f.i(p4y.a, x4c.Q);
        this.f = new ay40();
        this.h = new h(new ptw(6, this));
        this.i = true;
        this.k = new n4y(this, 0);
        this.l = new ac4();
        this.m = new androidx.compose.foundation.lazy.layout.c();
        this.n = new a5y();
        this.o = new c6y(new is8(this, i, 4));
        this.p = new i4u(this);
        this.q = new z5y();
        this.r = dub1.c();
        this.s = dub1.c();
        Boolean bool = Boolean.FALSE;
        this.t = f.j(bool);
        this.u = f.j(bool);
        this.v = new d();
    }

    @Override // defpackage.wkp0
    public final boolean a() {
        return this.h.a();
    }

    @Override // defpackage.wkp0
    public final boolean b() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.wkp0
    public final float c(float f) {
        return this.h.c(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r6.h.d(r7, r8, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r6.l.m(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.wkp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(MutatePriority mutatePriority, wls wlsVar, Continuation continuation) {
        LazyGridState$scroll$1 lazyGridState$scroll$1;
        int i;
        if (continuation instanceof LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (LazyGridState$scroll$1) continuation;
            int i2 = lazyGridState$scroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyGridState$scroll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyGridState$scroll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyGridState$scroll$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.e.getValue() == p4y.a) {
                        lazyGridState$scroll$1.L$0 = mutatePriority;
                        lazyGridState$scroll$1.L$1 = wlsVar;
                        lazyGridState$scroll$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wlsVar = (wls) lazyGridState$scroll$1.L$1;
                    mutatePriority = (MutatePriority) lazyGridState$scroll$1.L$0;
                    kotlin.b.b(obj);
                }
                lazyGridState$scroll$1.L$0 = null;
                lazyGridState$scroll$1.L$1 = null;
                lazyGridState$scroll$1.label = 2;
            }
        }
        lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, continuation);
        Object obj2 = lazyGridState$scroll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyGridState$scroll$1.label;
        if (i != 0) {
        }
        lazyGridState$scroll$1.L$0 = null;
        lazyGridState$scroll$1.L$1 = null;
        lazyGridState$scroll$1.label = 2;
    }

    @Override // defpackage.wkp0
    public final boolean e() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    public final void f(i4y i4yVar, boolean z, boolean z2) {
        j4y j4yVar;
        j4y j4yVar2;
        j4y j4yVar3;
        List list = i4yVar.m;
        int i = i4yVar.p;
        k4y k4yVar = i4yVar.a;
        int i2 = i4yVar.b;
        this.o.e = list.size();
        Object obj = null;
        obj = null;
        l4y l4yVar = this.d;
        d dVar = this.v;
        if (!z && this.b) {
            this.c = i4yVar;
            i2t0 D = tje.D();
            tls e = D != null ? D.e() : null;
            i2t0 O = tje.O(D);
            try {
                if (!(((Number) dVar.b.b.getValue()).floatValue() == 0.0f) && i2 == l4yVar.b.getIntValue() && k4yVar != null && (j4yVar3 = (j4y) j73.D(k4yVar.b)) != null && j4yVar3.a == l4yVar.a.getIntValue()) {
                    dVar.a();
                }
                return;
            } finally {
                tje.W(D, O, e);
            }
        }
        if (z) {
            this.b = true;
        }
        this.g -= i4yVar.d;
        this.e.setValue(i4yVar);
        this.u.setValue(Boolean.valueOf(((k4yVar != null ? k4yVar.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(i4yVar.c));
        if (z2) {
            l4yVar.getClass();
            if (i2 < 0.0f) {
                lxv.c("scrollOffset should be non-negative");
            }
            l4yVar.b.setIntValue(i2);
        } else {
            l4yVar.getClass();
            if (k4yVar != null && (j4yVar2 = (j4y) j73.D(k4yVar.b)) != null) {
                obj = j4yVar2.b;
            }
            l4yVar.d = obj;
            if (l4yVar.c || i > 0) {
                l4yVar.c = true;
                if (i2 < 0.0f) {
                    lxv.c("scrollOffset should be non-negative (" + i2 + ')');
                }
                l4yVar.a((k4yVar == null || (j4yVar = (j4y) j73.D(k4yVar.b)) == null) ? 0 : j4yVar.a, i2);
            }
            if (this.i) {
                tdh tdhVar = this.a;
                wz40 wz40Var = tdhVar.c;
                int i3 = tdhVar.b;
                boolean z3 = tdhVar.d;
                if (i3 != -1 && !list.isEmpty() && i3 != tdh.b(i4yVar, z3)) {
                    tdhVar.b = -1;
                    Object[] objArr = wz40Var.a;
                    int i4 = wz40Var.c;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((b6y) objArr[i5]).cancel();
                    }
                    wz40Var.g();
                }
                int i6 = tdhVar.e;
                if (i6 != -1 && tdhVar.f != 0.0f && i6 != i && !list.isEmpty()) {
                    int b = tdh.b(i4yVar, tdhVar.f < 0.0f);
                    int a = tdh.a(i4yVar, tdhVar.f < 0.0f);
                    if (a >= 0 && a < i && b != tdhVar.b && b >= 0) {
                        tdhVar.b = b;
                        wz40Var.g();
                        wz40Var.d(wz40Var.c, this.p.g(b));
                    }
                }
                tdhVar.e = i;
            }
        }
        if (z) {
            dVar.b(i4yVar.f, i4yVar.i, i4yVar.h);
        }
    }

    public final i4y g() {
        return (i4y) this.e.getValue();
    }

    public final void h(float f, i4y i4yVar) {
        if (this.i) {
            tdh tdhVar = this.a;
            wz40 wz40Var = tdhVar.c;
            List list = i4yVar.m;
            Orientation orientation = i4yVar.q;
            if (!list.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int b = tdh.b(i4yVar, z);
                int a = tdh.a(i4yVar, z);
                if (a >= 0 && a < i4yVar.p) {
                    if (b != tdhVar.b && b >= 0) {
                        if (tdhVar.d != z) {
                            Object[] objArr = wz40Var.a;
                            int i2 = wz40Var.c;
                            for (int i3 = 0; i3 < i2; i3++) {
                                ((b6y) objArr[i3]).cancel();
                            }
                        }
                        tdhVar.d = z;
                        tdhVar.b = b;
                        wz40Var.g();
                        wz40Var.d(wz40Var.c, this.p.g(b));
                    }
                    List list2 = i4yVar.m;
                    if (z) {
                        a4y a4yVar = (a4y) kotlin.collections.a.Z(list2);
                        if (((ddb1.d(a4yVar, orientation) + ((int) (orientation == Orientation.Vertical ? ((j4y) a4yVar).s & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : ((j4y) a4yVar).s >> 32))) + i4yVar.s) - i4yVar.o < (-f)) {
                            Object[] objArr2 = wz40Var.a;
                            int i4 = wz40Var.c;
                            while (i < i4) {
                                ((b6y) objArr2[i]).a();
                                i++;
                            }
                        }
                    } else if (i4yVar.n - ddb1.d((a4y) kotlin.collections.a.P(list2), orientation) < f) {
                        Object[] objArr3 = wz40Var.a;
                        int i5 = wz40Var.c;
                        while (i < i5) {
                            ((b6y) objArr3[i]).a();
                            i++;
                        }
                    }
                }
            }
            tdhVar.f = f;
        }
    }

    public b(int i, int i2) {
        this(i, i2, new tdh(0));
    }

    public b() {
        this(0, 0, new tdh(0));
    }
}
