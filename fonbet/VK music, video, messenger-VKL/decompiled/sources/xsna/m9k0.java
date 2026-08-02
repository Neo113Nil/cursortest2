package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.ahh0;

/* compiled from: SnapFlingBehavior.kt */
/* loaded from: classes11.dex */
public final class m9k0 implements h4o0 {
    public final v9k0 a;
    public final l7l<Float> b;
    public final iq2<Float> c;
    public final ahh0.a d = ahh0.c;

    public m9k0(v9k0 v9k0Var, l7l<Float> l7lVar, iq2<Float> iq2Var) {
        this.a = v9k0Var;
        this.b = l7lVar;
        this.c = iq2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(m9k0 m9k0Var, ggh0 ggh0Var, float f, float f2, nk0 nk0Var, ContinuationImpl continuationImpl) {
        l9k0 l9k0Var;
        int i;
        m9k0Var.getClass();
        if (continuationImpl instanceof l9k0) {
            l9k0Var = (l9k0) continuationImpl;
            int i2 = l9k0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l9k0Var.label = i2 - Integer.MIN_VALUE;
                l9k0 l9k0Var2 = l9k0Var;
                Object obj = l9k0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = l9k0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (Math.abs(f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return s1v.a(f, f2, 28);
                    }
                    l9k0Var2.label = 1;
                    l7l<Float> l7lVar = m9k0Var.b;
                    rd3 xe8Var = Math.abs(fto0.f(l7lVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2)) >= Math.abs(f) ? new xe8(l7lVar) : new dv3(m9k0Var.c);
                    float f3 = r9k0.a;
                    obj = xe8Var.a(ggh0Var, new Float(f), new Float(f2), nk0Var, l9k0Var2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((eq2) obj).b;
            }
        }
        l9k0Var = new l9k0(m9k0Var, continuationImpl);
        l9k0 l9k0Var22 = l9k0Var;
        Object obj2 = l9k0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = l9k0Var22.label;
        if (i != 0) {
        }
        return ((eq2) obj2).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.h4o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ggh0 ggh0Var, float f, izs izsVar, ContinuationImpl continuationImpl) {
        k9k0 k9k0Var;
        int i;
        float floatValue;
        if (continuationImpl instanceof k9k0) {
            k9k0Var = (k9k0) continuationImpl;
            int i2 = k9k0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k9k0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = k9k0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = k9k0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    k9k0Var.label = 1;
                    obj = d(ggh0Var, f, izsVar, k9k0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                eq2 eq2Var = (eq2) obj;
                floatValue = eq2Var.a.floatValue();
                kq2<T, V> kq2Var = eq2Var.b;
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = ((Number) kq2Var.c()).floatValue();
                }
                return new Float(f2);
            }
        }
        k9k0Var = new k9k0(this, continuationImpl);
        Object obj3 = k9k0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = k9k0Var.label;
        if (i != 0) {
        }
        eq2 eq2Var2 = (eq2) obj3;
        floatValue = eq2Var2.a.floatValue();
        kq2<T, V> kq2Var2 = eq2Var2.b;
        float f22 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        return new Float(f22);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ggh0 ggh0Var, float f, izs izsVar, ContinuationImpl continuationImpl) {
        i9k0 i9k0Var;
        int i;
        izs izsVar2;
        if (continuationImpl instanceof i9k0) {
            i9k0Var = (i9k0) continuationImpl;
            int i2 = i9k0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i9k0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = i9k0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = i9k0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    j9k0 j9k0Var = new j9k0(this, f, izsVar, ggh0Var, null);
                    i9k0Var.L$0 = izsVar;
                    i9k0Var.label = 1;
                    obj = myc0.k(this.d, j9k0Var, i9k0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    izsVar2 = izsVar;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    izsVar2 = (izs) i9k0Var.L$0;
                    kotlin.a.a(obj);
                }
                eq2 eq2Var = (eq2) obj;
                izsVar2.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                return eq2Var;
            }
        }
        i9k0Var = new i9k0(this, continuationImpl);
        Object obj2 = i9k0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = i9k0Var.label;
        if (i != 0) {
        }
        eq2 eq2Var2 = (eq2) obj2;
        izsVar2.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        return eq2Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m9k0) {
            m9k0 m9k0Var = (m9k0) obj;
            if (epx.f(m9k0Var.c, this.c) && epx.f(m9k0Var.b, this.b) && epx.f(m9k0Var.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
