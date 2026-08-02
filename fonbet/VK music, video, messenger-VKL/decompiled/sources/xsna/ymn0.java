package xsna;

import androidx.compose.foundation.MutatePriority;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.utils.swipable.DismissValue;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.fho;

/* compiled from: SwipeableV2.kt */
/* loaded from: classes17.dex */
public final class ymn0<T> {
    public final iq2<Float> a;
    public final izs<T, Boolean> b;
    public final wzs<azl, Float, Float> c;
    public final float d;
    public final wh50 e;
    public final f1m f;
    public final wh50 g;
    public final f1m h;
    public final wh50 i;
    public final f1m j;
    public final f1m k;
    public final wh50 l;
    public final odl m;
    public final wh50 n;
    public azl o;

    public ymn0(DismissValue dismissValue, izs izsVar, wzs wzsVar) {
        float f = hmn0.a;
        this.a = smn0.a;
        this.b = izsVar;
        this.c = wzsVar;
        this.d = f;
        this.e = androidx.compose.runtime.k.b(dismissValue);
        this.f = bbk0.b(new ofc0(this, 13));
        this.g = androidx.compose.runtime.k.b(null);
        this.h = bbk0.b(new x750(this, 29));
        this.i = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.j = bbk0.b(new kcj0(this, 3));
        this.k = bbk0.b(new l6n0(this, 1));
        this.l = androidx.compose.runtime.k.b(null);
        hfm0 hfm0Var = new hfm0(this, 4);
        fho.a aVar = fho.a;
        this.m = new odl(hfm0Var);
        this.n = androidx.compose.runtime.k.b(jgp.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [xsna.wh50] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [xsna.zak0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [xsna.zak0] */
    /* JADX WARN: Type inference failed for: r9v3, types: [xsna.zak0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, float f, ContinuationImpl continuationImpl) {
        wmn0 wmn0Var;
        int i;
        ?? r8;
        wh50 wh50Var;
        Object obj2;
        float d;
        Iterator<T> it;
        T t;
        T t2;
        try {
            if (continuationImpl instanceof wmn0) {
                wmn0Var = (wmn0) continuationImpl;
                int i2 = wmn0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wmn0Var.label = i2 - Integer.MIN_VALUE;
                    wmn0 wmn0Var2 = wmn0Var;
                    Object obj3 = wmn0Var2.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = wmn0Var2.label;
                    r8 = this.l;
                    wh50Var = this.e;
                    if (i != 0) {
                        kotlin.a.a(obj3);
                        Float f2 = c().get(obj);
                        if (f2 == null) {
                            ((zak0) wh50Var).setValue(obj);
                            return s3q0.a;
                        }
                        odl odlVar = this.m;
                        xmn0 xmn0Var = new xmn0(this, obj, f2, f, null);
                        wmn0Var2.label = 1;
                        if (odlVar.a(MutatePriority.Default, xmn0Var, wmn0Var2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj3);
                    }
                    while (true) {
                        if (it.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it.next();
                        if (Math.abs(((Number) ((Map.Entry) t2).getValue()).floatValue() - d) < 0.5f) {
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) t2;
                    obj2 = entry != null ? entry.getKey() : null;
                    if (obj2 == null) {
                        obj2 = ((zak0) wh50Var).getValue();
                    }
                    ((zak0) wh50Var).setValue(obj2);
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            while (true) {
                if (it.hasNext()) {
                }
            }
            Map.Entry entry2 = (Map.Entry) t2;
            if (entry2 != null) {
            }
            if (obj2 == null) {
            }
            ((zak0) wh50Var).setValue(obj2);
            return s3q0.a;
        } finally {
            ((zak0) r8).setValue(null);
            d = d();
            it = c().entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Math.abs(((Number) ((Map.Entry) t).getValue()).floatValue() - d) < 0.5f) {
                    break;
                }
            }
            Map.Entry entry3 = (Map.Entry) t;
            obj2 = entry3 != null ? entry3.getKey() : null;
            if (obj2 == null) {
                obj2 = ((zak0) wh50Var).getValue();
            }
            ((zak0) wh50Var).setValue(obj2);
        }
        wmn0Var = new wmn0(this, continuationImpl);
        wmn0 wmn0Var22 = wmn0Var;
        Object obj32 = wmn0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wmn0Var22.label;
        r8 = this.l;
        wh50Var = this.e;
    }

    public final Object b(float f, float f2, Object obj) {
        Map<T, Float> c = c();
        Float f3 = c.get(obj);
        azl azlVar = this.o;
        if (azlVar == null) {
            throw new IllegalArgumentException(("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=" + this + " SwipeableState?").toString());
        }
        float I0 = azlVar.I0(this.d);
        if (!epx.d(f3, f) && f3 != null) {
            float floatValue = f3.floatValue();
            wzs<azl, Float, Float> wzsVar = this.c;
            if (floatValue < f) {
                if (f2 >= I0) {
                    return vmn0.a(c, f, true);
                }
                Object a = vmn0.a(c, f, true);
                if (f >= Math.abs(f3.floatValue() + Math.abs(wzsVar.invoke(azlVar, Float.valueOf(Math.abs(((Number) pn00.h(a, c)).floatValue() - f3.floatValue()))).floatValue()))) {
                    return a;
                }
            } else {
                if (f2 <= (-I0)) {
                    return vmn0.a(c, f, false);
                }
                Object a2 = vmn0.a(c, f, false);
                float abs = Math.abs(f3.floatValue() - Math.abs(wzsVar.invoke(azlVar, Float.valueOf(Math.abs(f3.floatValue() - ((Number) pn00.h(a2, c)).floatValue()))).floatValue()));
                if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f <= abs : Math.abs(f) >= abs) {
                    return a2;
                }
            }
        }
        return obj;
    }

    public final Map<T, Float> c() {
        return (Map) ((zak0) this.n).getValue();
    }

    public final float d() {
        Float f = (Float) ((zak0) this.g).getValue();
        if (f != null) {
            return f.floatValue();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }
}
