package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class r9d implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ mtk0 c;

    public /* synthetic */ r9d(mtk0 mtk0Var, int i) {
        this.b = i;
        this.c = mtk0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((tdu) obj).j(((Number) this.c.getValue()).intValue());
                break;
            default:
                qgi0.m((tgi0) obj, new t1e0(((nwa0) this.c.getValue()).b, new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), 0));
                break;
        }
        return s3q0.a;
    }
}
