package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.SheetValue;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class d12<T> {
    public final af50 a;
    public final gzs<Float> b;
    public final dac0 c;
    public final izs<T, Boolean> d;
    public final wh50 g;
    public final kg50 k;
    public final wh50 l;
    public final wh50 m;
    public final t02 n;
    public final tix e = new tix();
    public final z02 f = new z02(this);
    public final f1m h = bbk0.b(new gy0(this, 1));
    public final f1m i = bbk0.b(new yg(this, 3));
    public final kg50 j = androidx.compose.runtime.d.a(Float.NaN);

    public d12(SheetValue sheetValue, af50 af50Var, gzs gzsVar, dac0 dac0Var, izs izsVar) {
        this.a = af50Var;
        this.b = gzsVar;
        this.c = dac0Var;
        this.d = izsVar;
        this.g = androidx.compose.runtime.k.b(sheetValue);
        new f1m(new m4(this, 5), k0x.c);
        this.k = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.l = androidx.compose.runtime.k.b(null);
        this.m = androidx.compose.runtime.k.b(new xk00(jgp.b));
        this.n = new t02(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MutatePriority mutatePriority, w02 w02Var, ContinuationImpl continuationImpl) {
        f02 f02Var;
        int i;
        izs<T, Boolean> izsVar;
        kg50 kg50Var;
        kg50 kg50Var2;
        T a;
        try {
            if (continuationImpl instanceof f02) {
                f02Var = (f02) continuationImpl;
                int i2 = f02Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    f02Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = f02Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = f02Var.label;
                    izsVar = this.d;
                    kg50Var = this.j;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        tix tixVar = this.e;
                        j02 j02Var = new j02(this, null, w02Var);
                        f02Var.label = 1;
                        tixVar.getClass();
                        if (zvj.d(new qix(mutatePriority, tixVar, j02Var, null), f02Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    if (a != null && Math.abs(kg50Var2.getFloatValue() - e().c(a)) <= 0.5f && izsVar.invoke(a).booleanValue()) {
                        h(a);
                    }
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            if (a != null) {
                h(a);
            }
            return s3q0.a;
        } finally {
            kg50Var2 = (vak0) kg50Var;
            a = e().a(kg50Var2.getFloatValue());
            if (a != null && Math.abs(kg50Var2.getFloatValue() - e().c(a)) <= 0.5f && izsVar.invoke(a).booleanValue()) {
                h(a);
            }
        }
        f02Var = new f02(this, continuationImpl);
        Object obj2 = f02Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = f02Var.label;
        izsVar = this.d;
        kg50Var = this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, MutatePriority mutatePriority, zzs zzsVar, ContinuationImpl continuationImpl) {
        m02 m02Var;
        int i;
        izs<T, Boolean> izsVar;
        kg50 kg50Var;
        kg50 kg50Var2;
        T a;
        try {
            if (continuationImpl instanceof m02) {
                m02Var = (m02) continuationImpl;
                int i2 = m02Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    m02Var.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = m02Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = m02Var.label;
                    izsVar = this.d;
                    kg50Var = this.j;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        if (!e().f(obj)) {
                            h(obj);
                            return s3q0.a;
                        }
                        tix tixVar = this.e;
                        p02 p02Var = new p02(this, obj, zzsVar, null);
                        m02Var.label = 1;
                        tixVar.getClass();
                        if (zvj.d(new qix(mutatePriority, tixVar, p02Var, null), m02Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj2);
                    }
                    if (a != null && Math.abs(kg50Var2.getFloatValue() - e().c(a)) <= 0.5f && izsVar.invoke(a).booleanValue()) {
                        h(a);
                    }
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            if (a != null) {
                h(a);
            }
            return s3q0.a;
        } finally {
            i(null);
            kg50Var2 = (vak0) kg50Var;
            a = e().a(kg50Var2.getFloatValue());
            if (a != null && Math.abs(kg50Var2.getFloatValue() - e().c(a)) <= 0.5f && izsVar.invoke(a).booleanValue()) {
                h(a);
            }
        }
        m02Var = new m02(this, continuationImpl);
        Object obj22 = m02Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = m02Var.label;
        izsVar = this.d;
        kg50Var = this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(float f, float f2, Object obj) {
        tgo<T> e = e();
        float c = e.c(obj);
        float floatValue = this.b.invoke().floatValue();
        if (c != f && !Float.isNaN(c)) {
            af50 af50Var = this.a;
            if (c < f) {
                if (f2 >= floatValue) {
                    return e.b(f, true);
                }
                T b = e.b(f, true);
                if (f >= Math.abs(Math.abs(((Number) af50Var.invoke(Float.valueOf(Math.abs(e.c(b) - c)))).floatValue()) + c)) {
                    return b;
                }
            } else {
                if (f2 <= (-floatValue)) {
                    return e.b(f, false);
                }
                T b2 = e.b(f, false);
                float abs = Math.abs(c - Math.abs(((Number) af50Var.invoke(Float.valueOf(Math.abs(c - e.c(b2))))).floatValue()));
                if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f <= abs : Math.abs(f) >= abs) {
                    return b2;
                }
            }
        }
        return obj;
    }

    public final float d(float f) {
        float f2 = f(f);
        kg50 kg50Var = this.j;
        vak0 vak0Var = (vak0) kg50Var;
        float floatValue = Float.isNaN(vak0Var.getFloatValue()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : vak0Var.getFloatValue();
        ((vak0) kg50Var).g(f2);
        return f2 - floatValue;
    }

    public final tgo<T> e() {
        return (tgo) ((zak0) this.m).getValue();
    }

    public final float f(float f) {
        vak0 vak0Var = (vak0) this.j;
        return swe0.f((Float.isNaN(vak0Var.getFloatValue()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : vak0Var.getFloatValue()) + f, e().d(), e().e());
    }

    public final float g() {
        kg50 kg50Var = this.j;
        if (Float.isNaN(((vak0) kg50Var).getFloatValue())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return ((vak0) kg50Var).getFloatValue();
    }

    public final void h(T t) {
        ((zak0) this.g).setValue(t);
    }

    public final void i(T t) {
        ((zak0) this.l).setValue(t);
    }
}
