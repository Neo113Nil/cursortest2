package xsna;

import androidx.compose.foundation.MutatePriority;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cuy;
import xsna.dak0;

/* compiled from: LazyListState.kt */
/* loaded from: classes11.dex */
public final class xvy implements khh0 {
    public static final fh9 y = q6x.C(new xht(6), new nde(0, 6));
    public final lhl a;
    public boolean b;
    public hvy c;
    public boolean d;
    public final ovy e;
    public final wh50<hvy> f;
    public final tg50 g;
    public float h;
    public boolean i;
    public final bml j;
    public final boolean k;
    public stf0 l;
    public final vvy m;
    public final cu5 n;
    public final bty<ivy> o;
    public final qsy p;
    public final cuy q;
    public final uvy r;
    public final buy s;
    public final wh50<s3q0> t;
    public final wh50 u;
    public final wh50 v;
    public final wh50<s3q0> w;
    public final euy x;

    /* compiled from: LazyListState.kt */
    @b6l(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {464, 466}, m = "scroll", v = 1)
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
            return xvy.this.b(null, null, this);
        }
    }

    /* compiled from: LazyListState.kt */
    @b6l(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<ggh0, spj<? super s3q0>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$index = i;
            this.$scrollOffset = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return xvy.this.new b(this.$index, this.$scrollOffset, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(ggh0 ggh0Var, spj<? super s3q0> spjVar) {
            return ((b) create(ggh0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            xvy.this.l(this.$index, this.$scrollOffset, true);
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xvy() {
        this(0, 0, r0);
        lhl lhlVar = new lhl();
        lhlVar.a = -1;
        lhlVar.d = -1;
    }

    @Override // xsna.khh0
    public final boolean a() {
        return this.j.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r5.j.b(r6, r7, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r5.n.t(r0) == r1) goto L23;
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
                    if (((zak0) this.f).getValue() == zvy.a) {
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
        return ((Boolean) ((zak0) this.u).getValue()).booleanValue();
    }

    @Override // xsna.khh0
    public final float d(float f) {
        return this.j.d(f);
    }

    @Override // xsna.khh0
    public final boolean e() {
        return ((Boolean) ((zak0) this.v).getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, spj spjVar) {
        svy svyVar;
        int i2;
        try {
            if (spjVar instanceof svy) {
                svyVar = (svy) spjVar;
                int i3 = svyVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    svyVar.label = i3 - Integer.MIN_VALUE;
                    Object obj = svyVar.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = svyVar.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        this.i = true;
                        wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> tvyVar = new tvy(this, i, 0, null);
                        svyVar.label = 1;
                        if (b(MutatePriority.Default, tvyVar, svyVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    this.i = false;
                    return s3q0.a;
                }
            }
            if (i2 != 0) {
            }
            this.i = false;
            return s3q0.a;
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
        svyVar = new svy(this, spjVar);
        Object obj3 = svyVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = svyVar.label;
    }

    public final void g(hvy hvyVar, boolean z, boolean z2) {
        String str;
        long j;
        int i = hvyVar.n;
        List<ivy> list = hvyVar.k;
        int i2 = hvyVar.b;
        ivy ivyVar = hvyVar.a;
        this.q.f = list.size();
        euy euyVar = this.x;
        ovy ovyVar = this.e;
        if (!z && this.b) {
            this.c = hvyVar;
            dak0 a2 = dak0.a.a();
            izs<Object, s3q0> e = a2 != null ? a2.e() : null;
            dak0 b2 = dak0.a.b(a2);
            try {
                if (euyVar.a() && ivyVar != null && ivyVar.a == ((wak0) ovyVar.a).getIntValue() && i2 == ((wak0) ovyVar.b).getIntValue()) {
                    euyVar.b();
                }
                s3q0 s3q0Var = s3q0.a;
                dak0.a.d(a2, b2, e);
                return;
            } catch (Throwable th) {
                dak0.a.d(a2, b2, e);
                throw th;
            }
        }
        if (z) {
            this.b = true;
        }
        ((zak0) this.v).setValue(Boolean.valueOf(((ivyVar != null ? ivyVar.a : 0) == 0 && i2 == 0) ? false : true));
        ((zak0) this.u).setValue(Boolean.valueOf(hvyVar.c));
        this.h -= hvyVar.d;
        ((zak0) this.f).setValue(hvyVar);
        if (z2) {
            ovyVar.getClass();
            if (!(((float) i2) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                xzw.c("scrollOffset should be non-negative");
            }
            ((wak0) ovyVar.b).C(i2);
        } else {
            ivy ivyVar2 = (ivy) j5g.a0(list);
            ivy ivyVar3 = (ivy) j5g.k0(list);
            if (ivyVar2 != null) {
                str = "scrollOffset should be non-negative";
                j = ivyVar2.a;
            } else {
                str = "scrollOffset should be non-negative";
                j = -1;
            }
            ld2.a(j, "firstVisibleItem:index");
            ld2.a(ivyVar3 != null ? ivyVar3.a : -1L, "lastVisibleItem:index");
            ovyVar.getClass();
            ovyVar.d = ivyVar != null ? ivyVar.k : null;
            if (ovyVar.c || i > 0) {
                ovyVar.c = true;
                if (!(((float) i2) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                    xzw.c(str);
                }
                ovyVar.a(ivyVar != null ? ivyVar.a : 0, i2);
            }
            if (this.k) {
                lhl lhlVar = this.a;
                lhlVar.getClass();
                int i3 = lhlVar.a;
                boolean z3 = lhlVar.c;
                if (i3 != -1 && !list.isEmpty() && i3 != lhl.a(hvyVar, z3)) {
                    lhlVar.a = -1;
                    cuy.b bVar = lhlVar.b;
                    if (bVar != null) {
                        bVar.cancel();
                    }
                    lhlVar.b = null;
                }
                int i4 = lhlVar.d;
                if (i4 != -1 && lhlVar.e != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i4 != i && !list.isEmpty()) {
                    int a3 = lhl.a(hvyVar, lhlVar.e < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (a3 >= 0 && a3 < i) {
                        lhlVar.a = a3;
                        lhlVar.b = this.r.a(a3);
                    }
                }
                lhlVar.d = i;
            }
        }
        if (z) {
            euyVar.c(hvyVar.f, hvyVar.i, hvyVar.h);
        }
    }

    public final int h() {
        return ((wak0) this.e.a).getIntValue();
    }

    public final int i() {
        return ((wak0) this.e.b).getIntValue();
    }

    public final fvy j() {
        return (fvy) ((zak0) this.f).getValue();
    }

    public final Object k(int i, int i2, spj<? super s3q0> spjVar) {
        Object b2 = b(MutatePriority.Default, new b(i, i2, null), spjVar);
        return b2 == CoroutineSingletons.COROUTINE_SUSPENDED ? b2 : s3q0.a;
    }

    public final void l(int i, int i2, boolean z) {
        ovy ovyVar = this.e;
        if (((wak0) ovyVar.a).getIntValue() != i || ((wak0) ovyVar.b).getIntValue() != i2) {
            bty<ivy> btyVar = this.o;
            btyVar.e();
            btyVar.b = null;
            btyVar.c = -1;
        }
        ovyVar.a(i, i2);
        ovyVar.d = null;
        if (!z) {
            zq70.A(this.t);
            return;
        }
        stf0 stf0Var = this.l;
        if (stf0Var != null) {
            stf0Var.k();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xvy(int i, int i2) {
        this(i, i2, r0);
        lhl lhlVar = new lhl();
        lhlVar.a = -1;
        lhlVar.d = -1;
    }

    public xvy(final int i, int i2, lhl lhlVar) {
        this.a = lhlVar;
        this.e = new ovy(i, i2);
        this.f = androidx.compose.runtime.k.a(zvy.a, w65.e);
        this.g = new tg50();
        this.j = new bml(new cqv(this, 5));
        this.k = true;
        this.m = new vvy(this);
        this.n = new cu5();
        this.o = new bty<>();
        this.p = new qsy();
        this.q = new cuy(null, new izs() { // from class: xsna.rvy
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                b160 b160Var = (b160) obj;
                lhl lhlVar2 = xvy.this.a;
                dak0 a2 = dak0.a.a();
                dak0.a.d(a2, dak0.a.b(a2), a2 != null ? a2.e() : null);
                lhlVar2.getClass();
                int b2 = b160Var.b() == -1 ? 2 : b160Var.b();
                for (int i3 = 0; i3 < b2; i3++) {
                    b160Var.a(i + i3);
                }
                return s3q0.a;
            }
        });
        this.r = new uvy(this);
        this.s = new buy();
        this.t = zq70.n();
        Boolean bool = Boolean.FALSE;
        this.u = androidx.compose.runtime.k.b(bool);
        this.v = androidx.compose.runtime.k.b(bool);
        this.w = zq70.n();
        this.x = new euy();
    }

    public /* synthetic */ xvy(int i, int i2, int i3) {
        this((i2 & 1) != 0 ? 0 : i, 0);
    }
}
