package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: PullRefreshState.kt */
/* loaded from: classes11.dex */
public final class zfe0 {
    public final yvj a;
    public final wh50 b;
    public final kg50 g;
    public final kg50 h;
    public final f1m c = bbk0.b(new nm60(this, 12));
    public final wh50 d = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final kg50 e = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final kg50 f = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final ni50 i = new ni50();

    public zfe0(yvj yvjVar, wh50 wh50Var, float f, float f2) {
        this.a = yvjVar;
        this.b = wh50Var;
        this.g = androidx.compose.runtime.d.a(f2);
        this.h = androidx.compose.runtime.d.a(f);
    }

    public final float a() {
        return ((Number) this.c.getValue()).floatValue();
    }

    public final float b() {
        return ((vak0) this.g).getFloatValue();
    }

    public final boolean c() {
        return ((Boolean) ((zak0) this.d).getValue()).booleanValue();
    }
}
