package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ViewUtils.kt */
/* loaded from: classes16.dex */
public final class tz50 implements tpr {
    public final xvy a;
    public final wh50 b;
    public final gzs<s3q0> c;
    public final l7l<Float> d;
    public final tpr e;

    public tz50(xvy xvyVar, wh50 wh50Var, gzs gzsVar, l7l l7lVar, zel zelVar) {
        this.a = xvyVar;
        this.b = wh50Var;
        this.c = gzsVar;
        this.d = l7lVar;
        this.e = zelVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ggh0 ggh0Var, float f, ContinuationImpl continuationImpl) {
        sz50 sz50Var;
        int i;
        if (continuationImpl instanceof sz50) {
            sz50Var = (sz50) continuationImpl;
            int i2 = sz50Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sz50Var.label = i2 - Integer.MIN_VALUE;
                Object obj = sz50Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sz50Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    float f2 = swe0.f(f, -15000.0f, 15000.0f);
                    if (((Boolean) this.b.getValue()).booleanValue()) {
                        List<xuy> f3 = this.a.j().f();
                        if (!f3.isEmpty()) {
                            float f4 = fto0.f(this.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
                            Iterator<T> it = f3.iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                i3 += ((xuy) it.next()).getSize();
                            }
                            if (((xuy) j5g.i0(f3)).getIndex() + ((float) Math.ceil(f4 / (i3 / f3.size()))) >= r2.j().d() - 3) {
                                this.c.invoke();
                            }
                        }
                    }
                    sz50Var.L$0 = null;
                    sz50Var.L$1 = null;
                    sz50Var.F$0 = f;
                    sz50Var.F$1 = f2;
                    sz50Var.I$0 = 0;
                    sz50Var.label = 1;
                    obj = this.e.a(ggh0Var, f2, sz50Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return new Float(((Number) obj).floatValue());
            }
        }
        sz50Var = new sz50(this, continuationImpl);
        Object obj2 = sz50Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sz50Var.label;
        if (i != 0) {
        }
        return new Float(((Number) obj2).floatValue());
    }
}
