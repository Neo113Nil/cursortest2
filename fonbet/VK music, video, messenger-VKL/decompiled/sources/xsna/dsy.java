package xsna;

import androidx.compose.foundation.MutatePriority;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cuy;
import xsna.dak0;

/* compiled from: LazyGridState.kt */
/* loaded from: classes11.dex */
public final class dsy implements khh0 {
    public static final fh9 w = q6x.C(new kz0(26), new wni(3));
    public final khl a;
    public boolean b;
    public mry c;
    public final sry d;
    public final wh50<mry> e;
    public final tg50 f;
    public float g;
    public final bml h;
    public final boolean i;
    public stf0 j;
    public final csy k;
    public final cu5 l;
    public final bty<nry> m;
    public final qsy n;
    public final cuy o;
    public final bsy p;
    public final buy q;
    public final wh50<s3q0> r;
    public final wh50<s3q0> s;
    public final wh50 t;
    public final wh50 u;
    public final euy v;

    /* compiled from: LazyGridState.kt */
    @b6l(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {496, 498}, m = "scroll", v = 1)
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
            return dsy.this.b(null, null, this);
        }
    }

    public dsy() {
        this(0, 0, new khl());
    }

    public static Object j(dsy dsyVar, int i, SuspendLambda suspendLambda) {
        dsyVar.getClass();
        Object b = dsyVar.b(MutatePriority.Default, new esy(dsyVar, i, 0, null), suspendLambda);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
    }

    @Override // xsna.khh0
    public final boolean a() {
        return this.h.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r5.h.b(r6, r7, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r5.l.t(r0) == r1) goto L23;
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
                    if (((zak0) this.e).getValue() == gsy.a) {
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
        return ((Boolean) ((zak0) this.t).getValue()).booleanValue();
    }

    @Override // xsna.khh0
    public final float d(float f) {
        return this.h.d(f);
    }

    @Override // xsna.khh0
    public final boolean e() {
        return ((Boolean) ((zak0) this.u).getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(mry mryVar, boolean z, boolean z2) {
        nry nryVar;
        nry nryVar2;
        nry nryVar3;
        int i = mryVar.p;
        List<nry> list = mryVar.m;
        ory oryVar = mryVar.a;
        int i2 = mryVar.b;
        this.o.f = list.size();
        Object obj = null;
        obj = null;
        euy euyVar = this.v;
        sry sryVar = this.d;
        if (!z && this.b) {
            this.c = mryVar;
            dak0 a2 = dak0.a.a();
            izs<Object, s3q0> e = a2 != null ? a2.e() : null;
            dak0 b = dak0.a.b(a2);
            try {
                if (euyVar.a() && i2 == ((wak0) sryVar.b).getIntValue() && oryVar != null && (nryVar3 = (nry) rl3.O(oryVar.b)) != null && nryVar3.a == ((wak0) sryVar.a).getIntValue()) {
                    euyVar.b();
                }
                s3q0 s3q0Var = s3q0.a;
                dak0.a.d(a2, b, e);
                return;
            } catch (Throwable th) {
                dak0.a.d(a2, b, e);
                throw th;
            }
        }
        if (z) {
            this.b = true;
        }
        this.g -= mryVar.d;
        ((zak0) this.e).setValue(mryVar);
        ((zak0) this.u).setValue(Boolean.valueOf(((oryVar != null ? oryVar.a : 0) == 0 && i2 == 0) ? false : true));
        ((zak0) this.t).setValue(Boolean.valueOf(mryVar.c));
        if (z2) {
            sryVar.getClass();
            if (!(((float) i2) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                xzw.c("scrollOffset should be non-negative");
            }
            ((wak0) sryVar.b).C(i2);
        } else {
            sryVar.getClass();
            if (oryVar != null && (nryVar2 = (nry) rl3.O(oryVar.b)) != null) {
                obj = nryVar2.b;
            }
            sryVar.d = obj;
            if (sryVar.c || i > 0) {
                sryVar.c = true;
                if ((((float) i2) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == false) {
                    xzw.c("scrollOffset should be non-negative (" + i2 + ')');
                }
                sryVar.a((oryVar == null || (nryVar = (nry) rl3.O(oryVar.b)) == null) ? 0 : nryVar.a, i2);
            }
            if (this.i) {
                khl khlVar = this.a;
                khlVar.getClass();
                ci50<cuy.b> ci50Var = khlVar.b;
                int i3 = khlVar.a;
                boolean z3 = khlVar.c;
                if (i3 != -1 && !list.isEmpty() && i3 != khl.b(mryVar, z3)) {
                    khlVar.a = -1;
                    cuy.b[] bVarArr = ci50Var.b;
                    int i4 = ci50Var.d;
                    for (int i5 = 0; i5 < i4; i5++) {
                        bVarArr[i5].cancel();
                    }
                    ci50Var.g();
                }
                int i6 = khlVar.d;
                if (i6 != -1 && khlVar.e != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i6 != i && !list.isEmpty()) {
                    int b2 = khl.b(mryVar, khlVar.e < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    int a3 = khl.a(mryVar, khlVar.e < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (a3 >= 0 && a3 < i && b2 != khlVar.a && b2 >= 0) {
                        khlVar.a = b2;
                        ci50Var.g();
                        ci50Var.c(ci50Var.d, this.p.a(b2));
                    }
                }
                khlVar.d = i;
            }
        }
        if (z) {
            euyVar.c(mryVar.f, mryVar.i, mryVar.h);
        }
    }

    public final int g() {
        return ((wak0) this.d.a).getIntValue();
    }

    public final int h() {
        return ((wak0) this.d.b).getIntValue();
    }

    public final kry i() {
        return (kry) ((zak0) this.e).getValue();
    }

    public final void k(int i, int i2, boolean z) {
        sry sryVar = this.d;
        if (((wak0) sryVar.a).getIntValue() != i || ((wak0) sryVar.b).getIntValue() != i2) {
            bty<nry> btyVar = this.m;
            btyVar.e();
            btyVar.b = null;
            btyVar.c = -1;
        }
        sryVar.a(i, i2);
        sryVar.d = null;
        if (!z) {
            zq70.A(this.s);
            return;
        }
        stf0 stf0Var = this.j;
        if (stf0Var != null) {
            stf0Var.k();
        }
    }

    public dsy(int i, int i2) {
        this(i, i2, new khl());
    }

    public dsy(int i, int i2, khl khlVar) {
        this.a = khlVar;
        this.d = new sry(i, i2);
        this.e = androidx.compose.runtime.k.a(gsy.a, w65.e);
        this.f = new tg50();
        this.h = new bml(new zxo(this, 22));
        this.i = true;
        this.k = new csy(this);
        this.l = new cu5();
        this.m = new bty<>();
        this.n = new qsy();
        this.o = new cuy(null, new c9b(this, i, 2));
        this.p = new bsy(this);
        this.q = new buy();
        this.r = zq70.n();
        this.s = zq70.n();
        Boolean bool = Boolean.FALSE;
        this.t = androidx.compose.runtime.k.b(bool);
        this.u = androidx.compose.runtime.k.b(bool);
        this.v = new euy();
    }
}
