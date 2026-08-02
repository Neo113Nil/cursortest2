package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: LazyGridScrollPosition.kt */
/* loaded from: classes11.dex */
public final class sry {
    public final rg50 a;
    public final rg50 b;
    public boolean c;
    public Object d;
    public final tty e;

    public sry(int i, int i2) {
        this.a = androidx.compose.runtime.i.a(i);
        this.b = androidx.compose.runtime.i.a(i2);
        this.e = new tty(i, 90, 200);
    }

    public final void a(int i, int i2) {
        if (i < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            xzw.a("Index should be non-negative");
        }
        ((wak0) this.a).C(i);
        this.e.c(i);
        ((wak0) this.b).C(i2);
    }
}
