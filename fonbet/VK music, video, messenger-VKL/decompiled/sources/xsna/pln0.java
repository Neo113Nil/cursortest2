package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pln0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ tra0 c;

    public /* synthetic */ pln0(tra0 tra0Var, int i) {
        this.b = i;
        this.c = tra0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        tra0.a aVar = (tra0.a) obj;
        switch (this.b) {
            case 0:
                aVar.q(this.c, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            default:
                tra0.a.x(aVar, this.c, 0, 0);
                break;
        }
        return s3q0.a;
    }
}
