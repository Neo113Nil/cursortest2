package xsna;

import androidx.compose.foundation.MutatePriority;
import com.unity3d.services.UnityAdsConstants;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class f12<T> {
    public final izs<? super T, Boolean> a;
    public izs<? super Float, Float> b;
    public gzs<Float> c;
    public iq2<Float> d;
    public l7l<Float> e;
    public final ni50 f;
    public final wh50 g;
    public final wh50 h;
    public final f1m i;
    public final kg50 j;
    public final f1m k;
    public final kg50 l;
    public final wh50 m;
    public final wh50 n;
    public final v02 o;

    public f12() {
        throw null;
    }

    @ozl
    public f12(T t, izs<? super T, Boolean> izsVar) {
        this.a = new a60(1);
        this.f = new ni50();
        this.g = androidx.compose.runtime.k.b(t);
        this.h = androidx.compose.runtime.k.b(t);
        this.i = bbk0.b(new q(this, 2));
        this.j = androidx.compose.runtime.d.a(Float.NaN);
        this.k = new f1m(new ah(this, 4), k0x.c);
        this.l = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.m = androidx.compose.runtime.k.b(null);
        this.n = androidx.compose.runtime.k.b(new mdl(new float[0], EmptyList.b));
        this.o = new v02(this);
        this.a = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, MutatePriority mutatePriority, zzs zzsVar, ContinuationImpl continuationImpl) {
        o02 o02Var;
        int i;
        wh50 wh50Var;
        try {
            if (continuationImpl instanceof o02) {
                o02Var = (o02) continuationImpl;
                int i2 = o02Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    o02Var.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = o02Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = o02Var.label;
                    wh50Var = this.m;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        if (!c().f(obj)) {
                            if (this.a.invoke(obj).booleanValue()) {
                                ((zak0) this.h).setValue(obj);
                                g(obj);
                            }
                            return s3q0.a;
                        }
                        ni50 ni50Var = this.f;
                        r02 r02Var = new r02(this, obj, zzsVar, null);
                        o02Var.label = 1;
                        if (ni50Var.b(mutatePriority, r02Var, o02Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj2);
                    }
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            return s3q0.a;
        } finally {
            ((zak0) wh50Var).setValue(null);
        }
        o02Var = new o02(this, continuationImpl);
        Object obj22 = o02Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = o02Var.label;
        wh50Var = this.m;
    }

    public final float b(float f) {
        float e = e(f);
        float f2 = e - f();
        this.o.a(e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return f2;
    }

    public final vgo<T> c() {
        return (vgo) ((zak0) this.n).getValue();
    }

    public final boolean d() {
        return (this.b == null || this.c == null || this.d == null || this.e == null) ? false : true;
    }

    public final float e(float f) {
        kg50 kg50Var = this.j;
        return swe0.f((Float.isNaN(((vak0) kg50Var).getFloatValue()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((vak0) kg50Var).getFloatValue()) + f, c().e(), c().d());
    }

    public final float f() {
        kg50 kg50Var = this.j;
        if (Float.isNaN(((vak0) kg50Var).getFloatValue())) {
            xzw.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return ((vak0) kg50Var).getFloatValue();
    }

    public final void g(T t) {
        ((zak0) this.g).setValue(t);
    }

    @ozl
    public final Object h(float f, ContinuationImpl continuationImpl) {
        if (!d()) {
            xzw.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        Object value = ((zak0) this.g).getValue();
        vgo<T> c = c();
        float f2 = f();
        izs<? super Float, Float> izsVar = this.b;
        if (izsVar == null) {
            izsVar = null;
        }
        gzs<Float> gzsVar = this.c;
        Object c2 = lz1.c(c, f2, f, izsVar, gzsVar != null ? gzsVar : null);
        return this.a.invoke(c2).booleanValue() ? lz1.h(this, c2, f, continuationImpl) : lz1.h(this, value, f, continuationImpl);
    }

    public final boolean i(T t) {
        ni50 ni50Var = this.f;
        wi50 wi50Var = ni50Var.b;
        wi50 wi50Var2 = ni50Var.b;
        boolean f = wi50Var.f();
        if (!f) {
            return f;
        }
        try {
            v02 v02Var = this.o;
            float c = c().c(t);
            if (!Float.isNaN(c)) {
                v02Var.a(c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ((zak0) this.m).setValue(null);
            }
            g(t);
            ((zak0) this.h).setValue(t);
            wi50Var2.c(null);
            return f;
        } catch (Throwable th) {
            wi50Var2.c(null);
            throw th;
        }
    }
}
