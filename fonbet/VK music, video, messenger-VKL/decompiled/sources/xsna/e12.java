package xsna;

import androidx.compose.foundation.MutatePriority;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.modal.SheetValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes17.dex */
public final class e12<T> {
    public final arb0 a;
    public final nm60 b;
    public final izs<T, Boolean> c;
    public final uix d;
    public final a12 e;
    public final wh50 f;
    public final f1m g;
    public final f1m h;
    public final kg50 i;
    public final kg50 j;
    public final wh50 k;
    public final wh50 l;
    public final u02 m;

    public e12(SheetValue sheetValue, arb0 arb0Var, nm60 nm60Var, izs izsVar) {
        xmk0<Float> xmk0Var = gz1.a;
        this.a = arb0Var;
        this.b = nm60Var;
        this.c = izsVar;
        this.d = new uix();
        this.e = new a12(this);
        this.f = androidx.compose.runtime.k.b(sheetValue);
        int i = 1;
        this.g = bbk0.b(new eu1(this, i));
        this.h = bbk0.b(new zg(this, i));
        this.i = androidx.compose.runtime.d.a(Float.NaN);
        new f1m(new pu(this, 6), k0x.c);
        this.j = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.k = androidx.compose.runtime.k.b(null);
        this.l = androidx.compose.runtime.k.b(new yk00(jgp.b));
        this.m = new u02(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MutatePriority mutatePriority, x02 x02Var, ContinuationImpl continuationImpl) {
        g02 g02Var;
        int i;
        izs<T, Boolean> izsVar;
        kg50 kg50Var;
        kg50 kg50Var2;
        T a;
        try {
            if (continuationImpl instanceof g02) {
                g02Var = (g02) continuationImpl;
                int i2 = g02Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    g02Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = g02Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = g02Var.label;
                    izsVar = this.c;
                    kg50Var = this.i;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        uix uixVar = this.d;
                        k02 k02Var = new k02(this, null, x02Var);
                        g02Var.label = 1;
                        uixVar.getClass();
                        if (zvj.d(new rix(mutatePriority, uixVar, k02Var, null), g02Var) == coroutineSingletons) {
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
        g02Var = new g02(this, continuationImpl);
        Object obj2 = g02Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = g02Var.label;
        izsVar = this.c;
        kg50Var = this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, MutatePriority mutatePriority, oz1 oz1Var, ContinuationImpl continuationImpl) {
        n02 n02Var;
        int i;
        izs<T, Boolean> izsVar;
        kg50 kg50Var;
        kg50 kg50Var2;
        T a;
        try {
            if (continuationImpl instanceof n02) {
                n02Var = (n02) continuationImpl;
                int i2 = n02Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    n02Var.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = n02Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = n02Var.label;
                    izsVar = this.c;
                    kg50Var = this.i;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        if (!e().f(obj)) {
                            h(obj);
                            return s3q0.a;
                        }
                        uix uixVar = this.d;
                        q02 q02Var = new q02(this, obj, oz1Var, null);
                        n02Var.label = 1;
                        uixVar.getClass();
                        if (zvj.d(new rix(mutatePriority, uixVar, q02Var, null), n02Var) == coroutineSingletons) {
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
        n02Var = new n02(this, continuationImpl);
        Object obj22 = n02Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = n02Var.label;
        izsVar = this.c;
        kg50Var = this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(float f, float f2, Object obj) {
        ugo<T> e = e();
        float c = e.c(obj);
        float floatValue = ((Number) this.b.invoke()).floatValue();
        if (c != f && !Float.isNaN(c)) {
            arb0 arb0Var = this.a;
            if (c < f) {
                if (f2 >= floatValue) {
                    return e.b(f, true);
                }
                T b = e.b(f, true);
                if (f >= Math.abs(Math.abs(((Number) arb0Var.invoke(Float.valueOf(Math.abs(e.c(b) - c)))).floatValue()) + c)) {
                    return b;
                }
            } else {
                if (f2 <= (-floatValue)) {
                    return e.b(f, false);
                }
                T b2 = e.b(f, false);
                float abs = Math.abs(c - Math.abs(((Number) arb0Var.invoke(Float.valueOf(Math.abs(c - e.c(b2))))).floatValue()));
                if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f <= abs : Math.abs(f) >= abs) {
                    return b2;
                }
            }
        }
        return obj;
    }

    public final float d(float f) {
        float f2 = f(f);
        kg50 kg50Var = this.i;
        vak0 vak0Var = (vak0) kg50Var;
        float floatValue = Float.isNaN(vak0Var.getFloatValue()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : vak0Var.getFloatValue();
        ((vak0) kg50Var).g(f2);
        return f2 - floatValue;
    }

    public final ugo<T> e() {
        return (ugo) ((zak0) this.l).getValue();
    }

    public final float f(float f) {
        vak0 vak0Var = (vak0) this.i;
        return swe0.f((Float.isNaN(vak0Var.getFloatValue()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : vak0Var.getFloatValue()) + f, e().d(), e().e());
    }

    public final float g() {
        kg50 kg50Var = this.i;
        if (Float.isNaN(((vak0) kg50Var).getFloatValue())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return ((vak0) kg50Var).getFloatValue();
    }

    public final void h(T t) {
        ((zak0) this.f).setValue(t);
    }

    public final void i(T t) {
        ((zak0) this.k).setValue(t);
    }
}
