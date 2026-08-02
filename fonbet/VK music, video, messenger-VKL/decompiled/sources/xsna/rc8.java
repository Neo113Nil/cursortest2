package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: BringIntoViewRelocator.kt */
/* loaded from: classes17.dex */
public final class rc8 implements qc8 {
    public final wh50 a;

    /* compiled from: BringIntoViewRelocator.kt */
    public static final class a {
        public final float a;

        public a(float f) {
            this.a = f;
        }
    }

    public rc8() {
        this(0);
    }

    @Override // xsna.qc8
    public final void a() {
        ((zak0) this.a).setValue(new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    public rc8(int i) {
        this.a = androidx.compose.runtime.k.b(new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }
}
