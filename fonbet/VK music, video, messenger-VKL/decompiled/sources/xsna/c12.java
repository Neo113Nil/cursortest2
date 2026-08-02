package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material.DrawerValue;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class c12<T> {
    public final vfk a;
    public final ecm b;
    public final iq2<Float> c;
    public final izs<T, Boolean> d;
    public final pix e = new pix();
    public final wh50 f;
    public final f1m g;
    public final kg50 h;
    public final kg50 i;
    public final wh50 j;
    public final wh50 k;
    public final s02 l;

    public c12(DrawerValue drawerValue, vfk vfkVar, ecm ecmVar, iq2 iq2Var, izs izsVar) {
        this.a = vfkVar;
        this.b = ecmVar;
        this.c = iq2Var;
        this.d = izsVar;
        new b12(this);
        this.f = androidx.compose.runtime.k.b(drawerValue);
        bbk0.b(new il1(this, 2));
        this.g = bbk0.b(new zy(this, 3));
        this.h = androidx.compose.runtime.d.a(Float.NaN);
        new f1m(new hh1(this, 1), k0x.c);
        this.i = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.j = androidx.compose.runtime.k.b(null);
        this.k = androidx.compose.runtime.k.b(new zk00(jgp.b));
        this.l = new s02(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MutatePriority mutatePriority, y02 y02Var, ContinuationImpl continuationImpl) {
        h02 h02Var;
        int i;
        izs<T, Boolean> izsVar;
        kg50 kg50Var;
        kg50 kg50Var2;
        T a;
        try {
            if (continuationImpl instanceof h02) {
                h02Var = (h02) continuationImpl;
                int i2 = h02Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    h02Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = h02Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = h02Var.label;
                    izsVar = this.d;
                    kg50Var = this.h;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        pix pixVar = this.e;
                        i02 i02Var = new i02(this, null, y02Var);
                        h02Var.label = 1;
                        pixVar.getClass();
                        if (zvj.d(new six(mutatePriority, pixVar, i02Var, null), h02Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    if (a != null && Math.abs(kg50Var2.getFloatValue() - b().c(a)) <= 0.5f && izsVar.invoke(a).booleanValue()) {
                        c(a);
                    }
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            if (a != null) {
                c(a);
            }
            return s3q0.a;
        } finally {
            kg50Var2 = (vak0) kg50Var;
            a = b().a(kg50Var2.getFloatValue());
            if (a != null && Math.abs(kg50Var2.getFloatValue() - b().c(a)) <= 0.5f && izsVar.invoke(a).booleanValue()) {
                c(a);
            }
        }
        h02Var = new h02(this, continuationImpl);
        Object obj2 = h02Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = h02Var.label;
        izsVar = this.d;
        kg50Var = this.h;
    }

    public final sgo<T> b() {
        return (sgo) ((zak0) this.k).getValue();
    }

    public final void c(T t) {
        ((zak0) this.f).setValue(t);
    }
}
