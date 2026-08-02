package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Lambda;

/* compiled from: SemanticsSort.kt */
/* loaded from: classes11.dex */
public final class vgi0 extends Lambda implements gzs<Float> {
    public static final vgi0 i = new vgi0(0);

    @Override // xsna.gzs
    public final /* bridge */ /* synthetic */ Float invoke() {
        return Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
