package xsna;

import com.vk.clips.sdk.models.SdkImages;

/* compiled from: VideoBaseImmediateClipState.kt */
/* loaded from: classes17.dex */
public final class f5s0 {
    public final String a;
    public final rlh0 b;
    public final boolean c;
    public final SdkImages d;

    public f5s0(String str, rlh0 rlh0Var, boolean z, SdkImages sdkImages) {
        this.a = str;
        this.b = rlh0Var;
        this.c = z;
        this.d = sdkImages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5s0)) {
            return false;
        }
        f5s0 f5s0Var = (f5s0) obj;
        return epx.f(this.a, f5s0Var.a) && epx.f(this.b, f5s0Var.b) && this.c == f5s0Var.c && epx.f(this.d, f5s0Var.d);
    }

    public final int hashCode() {
        int b = qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        SdkImages sdkImages = this.d;
        return b + (sdkImages == null ? 0 : sdkImages.hashCode());
    }

    public final String toString() {
        return "VideoBaseImmediateClipState(uniqueKey=" + this.a + ", videoSize=" + this.b + ", hasBlurredRestriction=" + this.c + ", image=" + this.d + ')';
    }
}
