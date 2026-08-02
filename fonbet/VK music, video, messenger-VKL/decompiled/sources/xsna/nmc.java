package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;

/* compiled from: ClipCardViewState.kt */
/* loaded from: classes2.dex */
public final class nmc {
    public final PreviewViewState a;

    public nmc(PreviewViewState previewViewState) {
        this.a = previewViewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nmc) && epx.f(this.a, ((nmc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClipCardViewState(before=" + this.a + ')';
    }
}
