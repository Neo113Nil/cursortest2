package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CursorAnimationState.kt */
/* loaded from: classes11.dex */
public final class amk {
    public final boolean a;
    public final AtomicReference<eyx> b = new AtomicReference<>(null);
    public final kg50 c = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    public amk(boolean z) {
        this.a = z;
    }
}
