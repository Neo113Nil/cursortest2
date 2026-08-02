package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Cover.kt */
/* loaded from: classes7.dex */
public final class b3k implements PointerInputEventHandler {
    public final /* synthetic */ wh50<v2k> a;
    public final /* synthetic */ wh50<en10> b;

    public b3k(wh50<v2k> wh50Var, wh50<en10> wh50Var2) {
        this.a = wh50Var;
        this.b = wh50Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        final wh50<v2k> wh50Var = this.a;
        final wh50<en10> wh50Var2 = this.b;
        Object c = d7s.c(dmb0Var, new ekp0(false, new zzs() { // from class: xsna.a3k
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.zzs
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                ov70 ov70Var = (ov70) obj;
                ov70 ov70Var2 = (ov70) obj2;
                float floatValue = ((Float) obj3).floatValue();
                ((Float) obj4).getClass();
                v2k v2kVar = (v2k) wh50.this.getValue();
                if (v2kVar != null) {
                    float[] a = en10.a();
                    float f = d3k.a;
                    wh50 wh50Var3 = wh50Var2;
                    en10.g(a, ((en10) wh50Var3.getValue()).a);
                    long j = ov70Var.a;
                    long j2 = ov70Var2.a;
                    float f2 = a[0];
                    float f3 = v2kVar.c.a[0];
                    float f4 = swe0.f(floatValue * f2, 1.0f * f3, f3 * 4.0f);
                    float f5 = f4 / f2;
                    en10.f(f5, f5, a);
                    float f6 = a[12];
                    float f7 = a[13];
                    long b = ov70.b(f4, ov70.f(ov70.g(1 - f5, ov70.e(j, (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32))), j2));
                    en10.i(Float.intBitsToFloat((int) (b >> 32)), Float.intBitsToFloat((int) (b & 4294967295L)), a);
                    zhf0 zhf0Var = v2kVar.a;
                    zhf0 zhf0Var2 = v2kVar.b;
                    zhf0 c2 = en10.c(a, zhf0Var);
                    float f8 = c2.a - zhf0Var2.a;
                    float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (f8 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f8 = 0.0f;
                    }
                    float f10 = zhf0Var2.c - c2.c;
                    if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f10 = 0.0f;
                    }
                    float f11 = c2.b - zhf0Var2.b;
                    if (f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f11 = 0.0f;
                    }
                    float f12 = zhf0Var2.d - c2.d;
                    if (f12 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f9 = f12;
                    }
                    en10.i(((-f8) + f10) / a[0], ((-f11) + f9) / a[5], a);
                    wh50Var3.setValue(new en10(a));
                }
                return s3q0.a;
            }
        }, null), spjVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c != coroutineSingletons) {
            c = s3q0.a;
        }
        return c == coroutineSingletons ? c : s3q0.a;
    }
}
