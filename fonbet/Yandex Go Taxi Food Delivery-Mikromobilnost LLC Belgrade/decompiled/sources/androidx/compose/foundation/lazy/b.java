package androidx.compose.foundation.lazy;

import android.os.Trace;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.h;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import defpackage.a5y;
import defpackage.a7y;
import defpackage.ac4;
import defpackage.ay40;
import defpackage.b6y;
import defpackage.c6y;
import defpackage.dub1;
import defpackage.i2t0;
import defpackage.is8;
import defpackage.lxv;
import defpackage.mtw;
import defpackage.n4y;
import defpackage.n6y;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.ptw;
import defpackage.reu;
import defpackage.s6y;
import defpackage.t6y;
import defpackage.tig0;
import defpackage.tje;
import defpackage.tls;
import defpackage.vdh;
import defpackage.w9u;
import defpackage.wkp0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.x6y;
import defpackage.xti0;
import defpackage.z5y;
import defpackage.zeb1;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class b implements wkp0 {
    public static final tig0 y = zeb1.c(new w9u(25), new mtw(21));
    public final vdh a;
    public boolean b;
    public s6y c;
    public boolean d;
    public final x6y e;
    public final oz40 f;
    public final ay40 g;
    public float h;
    public boolean i;
    public final h j;
    public final boolean k;
    public xti0 l;
    public final n4y m;
    public final ac4 n;
    public final c o;
    public final a5y p;
    public final c6y q;
    public final reu r;
    public final z5y s;
    public final oz40 t;
    public final oz40 u;
    public final oz40 v;
    public final oz40 w;
    public final d x;

    public b(int i, int i2, vdh vdhVar) {
        this.a = vdhVar;
        this.e = new x6y(i, i2);
        this.f = f.i(a7y.a, x4c.Q);
        this.g = new ay40();
        this.j = new h(new ptw(11, this));
        this.k = true;
        this.m = new n4y(this, 1);
        this.n = new ac4();
        this.o = new c();
        this.p = new a5y();
        this.q = new c6y(new is8(this, i, 5));
        this.r = new reu(18, this);
        this.s = new z5y();
        this.t = dub1.c();
        Boolean bool = Boolean.FALSE;
        this.u = f.j(bool);
        this.v = f.j(bool);
        this.w = dub1.c();
        this.x = new d();
    }

    @Override // defpackage.wkp0
    public final boolean a() {
        return this.j.a();
    }

    @Override // defpackage.wkp0
    public final boolean b() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.wkp0
    public final float c(float f) {
        return this.j.c(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r6.j.d(r7, r8, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r6.n.m(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.wkp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(MutatePriority mutatePriority, wls wlsVar, Continuation continuation) {
        LazyListState$scroll$1 lazyListState$scroll$1;
        int i;
        if (continuation instanceof LazyListState$scroll$1) {
            lazyListState$scroll$1 = (LazyListState$scroll$1) continuation;
            int i2 = lazyListState$scroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyListState$scroll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lazyListState$scroll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyListState$scroll$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.f.getValue() == a7y.a) {
                        lazyListState$scroll$1.L$0 = mutatePriority;
                        lazyListState$scroll$1.L$1 = wlsVar;
                        lazyListState$scroll$1.label = 1;
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
                    wlsVar = (wls) lazyListState$scroll$1.L$1;
                    mutatePriority = (MutatePriority) lazyListState$scroll$1.L$0;
                    kotlin.b.b(obj);
                }
                lazyListState$scroll$1.L$0 = null;
                lazyListState$scroll$1.L$1 = null;
                lazyListState$scroll$1.label = 2;
            }
        }
        lazyListState$scroll$1 = new LazyListState$scroll$1(this, continuation);
        Object obj2 = lazyListState$scroll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyListState$scroll$1.label;
        if (i != 0) {
        }
        lazyListState$scroll$1.L$0 = null;
        lazyListState$scroll$1.L$1 = null;
        lazyListState$scroll$1.label = 2;
    }

    @Override // defpackage.wkp0
    public final boolean e() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, zy11] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, int i2, Continuation continuation) {
        LazyListState$animateScrollToItem$1 lazyListState$animateScrollToItem$1;
        int i3;
        try {
            if (continuation instanceof LazyListState$animateScrollToItem$1) {
                lazyListState$animateScrollToItem$1 = (LazyListState$animateScrollToItem$1) continuation;
                int i4 = lazyListState$animateScrollToItem$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    lazyListState$animateScrollToItem$1.label = i4 - Integer.MIN_VALUE;
                    Object obj = lazyListState$animateScrollToItem$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = lazyListState$animateScrollToItem$1.label;
                    if (i3 != 0) {
                        kotlin.b.b(obj);
                        this.i = true;
                        LazyListState$animateScrollToItem$2 lazyListState$animateScrollToItem$2 = new LazyListState$animateScrollToItem$2(this, i, i2, null);
                        lazyListState$animateScrollToItem$1.label = 1;
                        if (d(MutatePriority.Default, lazyListState$animateScrollToItem$2, lazyListState$animateScrollToItem$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i3 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    this.i = false;
                    this = zy11.a;
                    return this;
                }
            }
            if (i3 != 0) {
            }
            this.i = false;
            this = zy11.a;
            return this;
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
        lazyListState$animateScrollToItem$1 = new LazyListState$animateScrollToItem$1(this, continuation);
        Object obj2 = lazyListState$animateScrollToItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = lazyListState$animateScrollToItem$1.label;
    }

    public final void g(s6y s6yVar, boolean z, boolean z2) {
        float f;
        long j;
        List list = s6yVar.k;
        int i = s6yVar.n;
        int i2 = s6yVar.b;
        t6y t6yVar = s6yVar.a;
        this.q.e = list.size();
        d dVar = this.x;
        x6y x6yVar = this.e;
        if (!z && this.b) {
            this.c = s6yVar;
            i2t0 D = tje.D();
            tls e = D != null ? D.e() : null;
            i2t0 O = tje.O(D);
            try {
                if (!(((Number) dVar.b.b.getValue()).floatValue() == 0.0f) && t6yVar != null && t6yVar.a == x6yVar.a.getIntValue() && i2 == x6yVar.b.getIntValue()) {
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
        this.v.setValue(Boolean.valueOf(((t6yVar != null ? t6yVar.a : 0) == 0 && i2 == 0) ? false : true));
        this.u.setValue(Boolean.valueOf(s6yVar.c));
        this.h -= s6yVar.d;
        this.f.setValue(s6yVar);
        if (z2) {
            x6yVar.getClass();
            if (i2 < 0.0f) {
                lxv.c("scrollOffset should be non-negative");
            }
            x6yVar.b.setIntValue(i2);
        } else {
            t6y t6yVar2 = (t6y) kotlin.collections.a.R(list);
            t6y t6yVar3 = (t6y) kotlin.collections.a.b0(list);
            if (t6yVar2 != null) {
                f = 0.0f;
                j = t6yVar2.a;
            } else {
                f = 0.0f;
                j = -1;
            }
            Trace.setCounter("firstVisibleItem:index", j);
            Trace.setCounter("lastVisibleItem:index", t6yVar3 != null ? t6yVar3.a : -1L);
            x6yVar.getClass();
            x6yVar.d = t6yVar != null ? t6yVar.k : null;
            if (x6yVar.c || i > 0) {
                x6yVar.c = true;
                if (i2 < f) {
                    lxv.c("scrollOffset should be non-negative");
                }
                x6yVar.a(t6yVar != null ? t6yVar.a : 0, i2);
            }
            if (this.k) {
                vdh vdhVar = this.a;
                int i3 = vdhVar.b;
                boolean z3 = vdhVar.d;
                if (i3 != -1 && !list.isEmpty() && i3 != vdh.a(s6yVar, z3)) {
                    vdhVar.b = -1;
                    b6y b6yVar = vdhVar.c;
                    if (b6yVar != null) {
                        b6yVar.cancel();
                    }
                    vdhVar.c = null;
                }
                int i4 = vdhVar.e;
                if (i4 != -1 && vdhVar.f != f && i4 != i && !list.isEmpty()) {
                    int a = vdh.a(s6yVar, vdhVar.f < f);
                    if (a >= 0 && a < i) {
                        vdhVar.b = a;
                        vdhVar.c = reu.G(this.r, a);
                    }
                }
                vdhVar.e = i;
            }
        }
        if (z) {
            dVar.b(s6yVar.f, s6yVar.i, s6yVar.h);
        }
    }

    public final int h() {
        return this.e.a.getIntValue();
    }

    public final int i() {
        return this.e.b.getIntValue();
    }

    public final s6y j() {
        return (s6y) this.f.getValue();
    }

    public final void k(float f, s6y s6yVar) {
        b6y b6yVar;
        b6y b6yVar2;
        if (this.k) {
            vdh vdhVar = this.a;
            vdhVar.getClass();
            if (!s6yVar.k.isEmpty()) {
                boolean z = f < 0.0f;
                int a = vdh.a(s6yVar, z);
                if (a >= 0 && a < s6yVar.n) {
                    if (a != vdhVar.b) {
                        if (vdhVar.d != z) {
                            vdhVar.b = -1;
                            b6y b6yVar3 = vdhVar.c;
                            if (b6yVar3 != null) {
                                b6yVar3.cancel();
                            }
                            vdhVar.c = null;
                        }
                        vdhVar.d = z;
                        vdhVar.b = a;
                        vdhVar.c = reu.G(this.r, a);
                    }
                    List list = s6yVar.k;
                    if (z) {
                        n6y n6yVar = (n6y) kotlin.collections.a.Z(list);
                        if (((((t6y) n6yVar).o + ((t6y) n6yVar).p) + s6yVar.q) - s6yVar.m < (-f) && (b6yVar2 = vdhVar.c) != null) {
                            b6yVar2.a();
                        }
                    } else if (s6yVar.l - ((t6y) ((n6y) kotlin.collections.a.P(list))).o < f && (b6yVar = vdhVar.c) != null) {
                        b6yVar.a();
                    }
                }
            }
            vdhVar.f = f;
        }
    }

    public final Object l(int i, int i2, Continuation continuation) {
        Object d = d(MutatePriority.Default, new LazyListState$scrollToItem$2(this, i, i2, null), continuation);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11.a;
    }

    public final void m(int i, int i2) {
        x6y x6yVar = this.e;
        if (x6yVar.a.getIntValue() != i || x6yVar.b.getIntValue() != i2) {
            c cVar = this.o;
            cVar.e();
            cVar.b = null;
            cVar.c = -1;
        }
        x6yVar.a(i, i2);
        x6yVar.d = null;
        xti0 xti0Var = this.l;
        if (xti0Var != null) {
            ((LayoutNode) xti0Var).h();
        }
    }

    public b(int i, int i2) {
        this(i, i2, new vdh(0));
    }

    public b() {
        this(0, 0, new vdh(0));
    }

    public /* synthetic */ b(int i, int i2, int i3) {
        this((i2 & 1) != 0 ? 0 : i, 0);
    }
}
