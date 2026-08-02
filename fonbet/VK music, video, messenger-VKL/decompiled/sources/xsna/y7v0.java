package xsna;

import androidx.compose.ui.graphics.Path;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class y7v0 implements yzs {
    public final /* synthetic */ float b;

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mxj0 mxj0Var = (mxj0) obj2;
        ((Path) obj).g(new zhf0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (mxj0Var.a >> 32)) * this.b, Float.intBitsToFloat((int) (mxj0Var.a & 4294967295L))), Path.Direction.CounterClockwise);
        return s3q0.a;
    }
}
