package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: WindowInsetsRulers.android.kt */
/* loaded from: classes11.dex */
public final class bsx0 {
    public final jif0 f;
    public final jif0 g;
    public final wh50 a = androidx.compose.runtime.k.b(Boolean.TRUE);
    public final wh50 b = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final kg50 c = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final ah50 d = androidx.compose.runtime.j.a(0);
    public final kg50 e = androidx.compose.runtime.d.a(1.0f);
    public long h = -1;
    public long i = -1;
    public long j = -1;
    public long k = -1;

    public bsx0(String str) {
        this.f = new jif0(str.concat(" source"));
        this.g = new jif0(str.concat(" target"));
    }
}
