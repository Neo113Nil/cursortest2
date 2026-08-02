package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: PullRefresh.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class wfe0 extends AdaptedFunctionReference implements wzs<Float, spj<? super Float>, Object> {
    @Override // xsna.wzs
    public final Object invoke(Float f, spj<? super Float> spjVar) {
        float floatValue = f.floatValue();
        zfe0 zfe0Var = (zfe0) this.receiver;
        boolean c = zfe0Var.c();
        kg50 kg50Var = zfe0Var.f;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!c) {
            if (zfe0Var.a() > zfe0Var.b()) {
                ((gzs) zfe0Var.b.getValue()).invoke();
            }
            myc0.h(zfe0Var.a, null, null, new yfe0(zfe0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null), 3);
            if (((vak0) kg50Var).getFloatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || floatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                floatValue = 0.0f;
            }
            ((vak0) kg50Var).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            f2 = floatValue;
        }
        return new Float(f2);
    }
}
