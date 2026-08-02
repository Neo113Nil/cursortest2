package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.dt1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class s26 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ s26(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 1:
                wh50 wh50Var = this.c;
                wh50Var.setValue(Float.valueOf(swe0.f(((Number) wh50Var.getValue()).floatValue() - 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)));
                break;
            case 2:
                this.c.setValue(Boolean.TRUE);
                break;
            default:
                dt1.a.getClass();
                this.c.setValue(dt1.a.o);
                break;
        }
        return s3q0.a;
    }
}
