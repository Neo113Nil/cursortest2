package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FlingBehavior.kt */
/* loaded from: classes17.dex */
public final class r270 implements tpr {
    public static final r270 a = new r270();

    @Override // xsna.tpr
    public final Object a(ggh0 ggh0Var, float f, ContinuationImpl continuationImpl) {
        return new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
