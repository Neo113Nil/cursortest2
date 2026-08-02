package xsna;

import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: OverlaySettings.java */
/* loaded from: classes12.dex */
public interface b390 {
    public static final Pair<Float, Float> a;
    public static final Pair<Float, Float> b;
    public static final Pair<Float, Float> c;

    static {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a = Pair.create(valueOf, valueOf);
        b = Pair.create(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(1.0f);
        c = Pair.create(valueOf2, valueOf2);
    }
}
