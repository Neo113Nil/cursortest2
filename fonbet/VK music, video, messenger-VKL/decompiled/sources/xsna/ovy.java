package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: LazyListScrollPosition.kt */
/* loaded from: classes11.dex */
public final class ovy {
    public final rg50 a;
    public final rg50 b;
    public boolean c;
    public Object d;
    public final tty e;

    public ovy(int i, int i2) {
        this.a = androidx.compose.runtime.i.a(i);
        this.b = androidx.compose.runtime.i.a(i2);
        this.e = new tty(i, 30, 100);
    }

    public final void a(int i, int i2) {
        if (i < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            xzw.a("Index should be non-negative (" + i + ')');
        }
        ((wak0) this.a).C(i);
        this.e.c(i);
        ((wak0) this.b).C(i2);
    }
}
