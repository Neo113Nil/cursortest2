package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class llj {
    public final qpp a;
    public final d5q b;
    public final kg50 c;
    public wxj0 d;

    public llj(qpp qppVar, d5q d5qVar, int i) {
        xxj0 xxj0Var;
        if ((i & 8) != 0) {
            int i2 = xh2.b;
            xxj0Var = new xxj0(fi2.i);
        } else {
            xxj0Var = null;
        }
        this.a = qppVar;
        this.b = d5qVar;
        this.c = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.d = xxj0Var;
    }
}
