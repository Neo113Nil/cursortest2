package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.u;
import defpackage.gxg;
import defpackage.h1t0;
import defpackage.iip0;
import defpackage.j1t0;
import defpackage.jj2;
import defpackage.jl40;
import defpackage.knj;
import defpackage.l7s0;
import defpackage.mt71;
import defpackage.ny61;
import defpackage.sae;
import defpackage.snr;
import defpackage.tje;
import defpackage.tls;
import defpackage.uh6;
import defpackage.vi2;
import defpackage.z2a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a implements snr {
    public final j1t0 a;
    public final gxg b;
    public final jj2 c;
    public final knj d = u.c;

    public a(j1t0 j1t0Var, gxg gxgVar, jj2 jj2Var) {
        this.a = j1t0Var;
        this.b = gxgVar;
        this.c = jj2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, iip0 iip0Var, float f, float f2, h1t0 h1t0Var, ContinuationImpl continuationImpl) {
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof SnapFlingBehavior$tryApproach$1) {
            snapFlingBehavior$tryApproach$1 = (SnapFlingBehavior$tryApproach$1) continuationImpl;
            int i2 = snapFlingBehavior$tryApproach$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$tryApproach$1.label = i2 - Integer.MIN_VALUE;
                SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$12 = snapFlingBehavior$tryApproach$1;
                Object obj = snapFlingBehavior$tryApproach$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = snapFlingBehavior$tryApproach$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                        return uh6.a(f, f2, 28);
                    }
                    snapFlingBehavior$tryApproach$12.label = 1;
                    gxg gxgVar = aVar.b;
                    obj = (Math.abs(mt71.k(gxgVar, 0.0f, f2)) >= Math.abs(f) ? new sae(24, gxgVar) : new l7s0(aVar.c)).n(iip0Var, new Float(f), new Float(f2), h1t0Var, snapFlingBehavior$tryApproach$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((vi2) obj).b;
            }
        }
        snapFlingBehavior$tryApproach$1 = new SnapFlingBehavior$tryApproach$1(aVar, continuationImpl);
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$122 = snapFlingBehavior$tryApproach$1;
        Object obj2 = snapFlingBehavior$tryApproach$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = snapFlingBehavior$tryApproach$122.label;
        if (i != 0) {
        }
        return ((vi2) obj2).b;
    }

    @Override // defpackage.snr
    public Object a(iip0 iip0Var, float f, Continuation continuation) {
        return d(iip0Var, f, z2a1.a, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(iip0 iip0Var, float f, tls tlsVar, ContinuationImpl continuationImpl) {
        SnapFlingBehavior$fling$1 snapFlingBehavior$fling$1;
        int i;
        tls tlsVar2;
        if (continuationImpl instanceof SnapFlingBehavior$fling$1) {
            snapFlingBehavior$fling$1 = (SnapFlingBehavior$fling$1) continuationImpl;
            int i2 = snapFlingBehavior$fling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$fling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = snapFlingBehavior$fling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = snapFlingBehavior$fling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SnapFlingBehavior$fling$result$1 snapFlingBehavior$fling$result$1 = new SnapFlingBehavior$fling$result$1(this, f, tlsVar, iip0Var, null);
                    snapFlingBehavior$fling$1.L$0 = tlsVar;
                    snapFlingBehavior$fling$1.label = 1;
                    obj = tje.k0(this.d, snapFlingBehavior$fling$result$1, snapFlingBehavior$fling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tlsVar2 = tlsVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tlsVar2 = (tls) snapFlingBehavior$fling$1.L$0;
                    kotlin.b.b(obj);
                }
                vi2 vi2Var = (vi2) obj;
                tlsVar2.invoke(new Float(0.0f));
                return vi2Var;
            }
        }
        snapFlingBehavior$fling$1 = new SnapFlingBehavior$fling$1(this, continuationImpl);
        Object obj2 = snapFlingBehavior$fling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = snapFlingBehavior$fling$1.label;
        if (i != 0) {
        }
        vi2 vi2Var2 = (vi2) obj2;
        tlsVar2.invoke(new Float(0.0f));
        return vi2Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(iip0 iip0Var, float f, tls tlsVar, ContinuationImpl continuationImpl) {
        SnapFlingBehavior$performFling$1 snapFlingBehavior$performFling$1;
        int i;
        if (continuationImpl instanceof SnapFlingBehavior$performFling$1) {
            snapFlingBehavior$performFling$1 = (SnapFlingBehavior$performFling$1) continuationImpl;
            int i2 = snapFlingBehavior$performFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$performFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = snapFlingBehavior$performFling$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = snapFlingBehavior$performFling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    snapFlingBehavior$performFling$1.label = 1;
                    obj = c(iip0Var, f, tlsVar, snapFlingBehavior$performFling$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                vi2 vi2Var = (vi2) obj;
                return new Float(vi2Var.a.floatValue() != 0.0f ? ((Number) vi2Var.b.e()).floatValue() : 0.0f);
            }
        }
        snapFlingBehavior$performFling$1 = new SnapFlingBehavior$performFling$1(this, continuationImpl);
        Object obj3 = snapFlingBehavior$performFling$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = snapFlingBehavior$performFling$1.label;
        if (i != 0) {
        }
        vi2 vi2Var2 = (vi2) obj3;
        return new Float(vi2Var2.a.floatValue() != 0.0f ? ((Number) vi2Var2.b.e()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (jl40.l(aVar.c, this.c) && jl40.l(aVar.b, this.b) && jl40.l(aVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
