package xsna;

import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: VideoCardSize.kt */
/* loaded from: classes.dex */
public final class l8s0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final VideoCardViewState.Size e;

    public l8s0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = (pco.a(f, (float) Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE) > 0 || pco.a(f, (float) 96) < 0) ? VideoCardViewState.Size.Medium : VideoCardViewState.Size.Small;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8s0)) {
            return false;
        }
        l8s0 l8s0Var = (l8s0) obj;
        return pco.b(this.a, l8s0Var.a) && pco.b(this.b, l8s0Var.b) && pco.b(this.c, l8s0Var.c) && pco.b(this.d, l8s0Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCardSize(cardWidth=");
        oq.f(this.a, ", cardHeight=", sb);
        oq.f(this.b, ", placeholderWidth=", sb);
        oq.f(this.c, ", placeholderHeight=", sb);
        return ir.f(')', this.d, sb);
    }
}
