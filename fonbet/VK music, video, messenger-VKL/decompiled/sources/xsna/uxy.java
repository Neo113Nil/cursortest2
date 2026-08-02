package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.cuy;
import xsna.dak0;

/* compiled from: LazyStaggeredGridState.kt */
/* loaded from: classes11.dex */
public final class uxy implements khh0 {
    public static final fh9 x = q6x.C(new ak(28), new mq2(7));
    public boolean a;
    public lxy b;
    public final pxy c;
    public final wh50<lxy> d = androidx.compose.runtime.k.a(mxy.a, w65.e);
    public final bxy e = new bxy();
    public final wh50 f;
    public final wh50 g;
    public stf0 h;
    public final txy i;
    public final cu5 j;
    public final qsy k;
    public final boolean l;
    public final cuy m;
    public final bml n;
    public float o;
    public int p;
    public final pg50<cuy.b> q;
    public final tg50 r;
    public final buy s;
    public final bty<nxy> t;
    public final wh50<s3q0> u;
    public final wh50<s3q0> v;
    public final euy w;

    /* compiled from: LazyStaggeredGridState.kt */
    @b6l(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", l = {282, 284}, m = "scroll", v = 1)
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return uxy.this.b(null, null, this);
        }
    }

    public uxy(int[] iArr, int[] iArr2) {
        this.c = new pxy(iArr, iArr2, new vxy(2, this, uxy.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0));
        Boolean bool = Boolean.FALSE;
        this.f = androidx.compose.runtime.k.b(bool);
        this.g = androidx.compose.runtime.k.b(bool);
        this.i = new txy(this);
        this.j = new cu5();
        this.k = new qsy();
        this.l = true;
        this.m = new cuy(null, null);
        this.n = new bml(new gmj(this, 20));
        this.p = -1;
        this.q = g9x.a();
        this.r = new tg50();
        this.s = new buy();
        this.t = new bty<>();
        this.u = zq70.n();
        this.v = zq70.n();
        this.w = new euy();
    }

    @Override // xsna.khh0
    public final boolean a() {
        return this.n.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r5.n.b(r6, r7, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r5.j.t(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.khh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(MutatePriority mutatePriority, wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (((zak0) this.d).getValue() == mxy.a) {
                        aVar.L$0 = mutatePriority;
                        aVar.L$1 = wzsVar;
                        aVar.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    wzsVar = (wzs) aVar.L$1;
                    mutatePriority = (MutatePriority) aVar.L$0;
                    kotlin.a.a(obj);
                }
                aVar.L$0 = null;
                aVar.L$1 = null;
                aVar.label = 2;
            }
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        aVar.L$0 = null;
        aVar.L$1 = null;
        aVar.label = 2;
    }

    @Override // xsna.khh0
    public final boolean c() {
        return ((Boolean) ((zak0) this.f).getValue()).booleanValue();
    }

    @Override // xsna.khh0
    public final float d(float f) {
        return this.n.d(f);
    }

    @Override // xsna.khh0
    public final boolean e() {
        return ((Boolean) ((zak0) this.g).getValue()).booleanValue();
    }

    public final void f(lxy lxyVar, boolean z, boolean z2) {
        nxy nxyVar;
        dak0 a2;
        izs<Object, s3q0> e;
        dak0 b;
        euy euyVar = this.w;
        pxy pxyVar = this.c;
        if (!z && this.a) {
            this.b = lxyVar;
            a2 = dak0.a.a();
            e = a2 != null ? a2.e() : null;
            b = dak0.a.b(a2);
            try {
                if (euyVar.a() && Arrays.equals(lxyVar.a, pxyVar.b) && Arrays.equals(lxyVar.b, pxyVar.d)) {
                    euyVar.b();
                }
                s3q0 s3q0Var = s3q0.a;
                return;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.a = true;
        }
        float f = this.o;
        float f2 = lxyVar.c;
        List<nxy> list = lxyVar.m;
        int[] iArr = lxyVar.a;
        int[] iArr2 = lxyVar.b;
        this.o = f - f2;
        ((zak0) this.d).setValue(lxyVar);
        if (z2) {
            pxyVar.d = iArr2;
            ((wak0) pxyVar.e).C(pxy.b(pxyVar.b, iArr2));
        } else {
            pxyVar.getClass();
            int a3 = pxy.a(iArr);
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    nxyVar = null;
                    break;
                }
                nxyVar = list.get(i);
                if (nxyVar.a == a3) {
                    break;
                } else {
                    i++;
                }
            }
            nxy nxyVar2 = nxyVar;
            pxyVar.g = nxyVar2 != null ? nxyVar2.b : null;
            pxyVar.h.c(a3);
            if (pxyVar.f || lxyVar.l > 0) {
                pxyVar.f = true;
                a2 = dak0.a.a();
                e = a2 != null ? a2.e() : null;
                b = dak0.a.b(a2);
                try {
                    pxyVar.b = iArr;
                    ((wak0) pxyVar.c).C(pxy.a(iArr));
                    pxyVar.d = iArr2;
                    ((wak0) pxyVar.e).C(pxy.b(iArr, iArr2));
                    s3q0 s3q0Var2 = s3q0.a;
                } finally {
                    dak0.a.d(a2, b, e);
                }
            }
            if (this.p != -1 && !list.isEmpty()) {
                int index = ((twy) j5g.Y(list)).getIndex();
                int index2 = ((twy) j5g.i0(list)).getIndex();
                int i2 = this.p;
                if (index > i2 || i2 > index2) {
                    this.p = -1;
                    pg50<cuy.b> pg50Var = this.q;
                    Object[] objArr = pg50Var.c;
                    long[] jArr = pg50Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((cuy.b) objArr[(i3 << 3) + i5]).cancel();
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                            }
                            if (i3 == length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    pg50Var.d();
                }
            }
        }
        ((zak0) this.g).setValue(Boolean.valueOf(iArr[0] != 0 || iArr2[0] > 0));
        ((zak0) this.f).setValue(Boolean.valueOf(lxyVar.f));
        if (z) {
            euyVar.c(lxyVar.e, lxyVar.k, lxyVar.t);
        }
    }

    public final cxy g() {
        return (cxy) ((zak0) this.d).getValue();
    }

    public final void h(float f, lxy lxyVar) {
        pg50<cuy.b> pg50Var;
        int d;
        long h;
        if (!this.l) {
            return;
        }
        List<nxy> list = lxyVar.m;
        if (list.isEmpty()) {
            return;
        }
        boolean z = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = z ? ((nxy) j5g.i0(list)).a : ((nxy) j5g.Y(list)).a;
        if (i == this.p) {
            return;
        }
        this.p = i;
        qg50 a2 = p9x.a();
        int[] iArr = (int[]) lxyVar.i.b;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            pg50Var = this.q;
            if (i2 >= length) {
                break;
            }
            bxy bxyVar = this.e;
            if (z) {
                d = i + 1;
                int length2 = bxyVar.a + bxyVar.b.length;
                while (true) {
                    if (d >= length2) {
                        d = bxyVar.a + bxyVar.b.length;
                        break;
                    } else if (bxyVar.a(d, i2)) {
                        break;
                    } else {
                        d++;
                    }
                }
            } else {
                d = bxyVar.d(i, i2);
            }
            int i3 = d;
            if (i3 < 0 || i3 >= lxyVar.l || a2.a(i3)) {
                break;
            }
            a2.g(i3);
            if (!pg50Var.a(i3)) {
                lxyVar.j.e(i3);
                int i4 = iArr[i2];
                if (lxyVar.u == Orientation.Vertical) {
                    if (i4 < 0) {
                        wzw.a("width must be >= 0");
                    }
                    h = s6j.h(i4, i4, 0, Integer.MAX_VALUE);
                } else {
                    if (i4 < 0) {
                        wzw.a("height must be >= 0");
                    }
                    h = s6j.h(0, Integer.MAX_VALUE, i4, i4);
                }
                pg50Var.k(i3, this.m.a(i3, h, true, null));
            }
            i2++;
            i = i3;
        }
        long[] jArr = pg50Var.a;
        int length3 = jArr.length - 2;
        if (length3 < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j = jArr[i5];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length3)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j) < 128) {
                        int i8 = (i5 << 3) + i7;
                        int i9 = pg50Var.b[i8];
                        cuy.b bVar = (cuy.b) pg50Var.c[i8];
                        boolean a3 = a2.a(i9);
                        if (!a3) {
                            bVar.cancel();
                        }
                        if (!a3) {
                            pg50Var.j(i8);
                        }
                    }
                    j >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length3) {
                return;
            } else {
                i5++;
            }
        }
    }
}
