package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ClipUpload.kt */
/* loaded from: classes17.dex */
public final class jed extends eed {
    public volatile float b;
    public volatile boolean c;
    public volatile boolean d;

    public /* synthetic */ jed(xdd xddVar) {
        this(xddVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false);
    }

    public final jed a() {
        return new jed(this.a, this.b, this.c, this.d);
    }

    public final float b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final void e(float f) {
        this.b = f;
    }

    public final void f() {
        this.c = true;
    }

    public jed(xdd xddVar, float f, boolean z, boolean z2) {
        super(xddVar);
        this.b = f;
        this.c = z;
        this.d = z2;
    }
}
