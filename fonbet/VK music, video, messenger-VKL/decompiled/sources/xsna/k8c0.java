package xsna;

import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;

/* compiled from: PostToClipsPubDeps.kt */
/* loaded from: classes4.dex */
public final class k8c0 {
    public final w9c0 a;
    public final gxh b;
    public final b25 c;
    public final ClipsUploadUiVkNavigator d;

    public k8c0(w9c0 w9c0Var, gxh gxhVar, b25 b25Var, ClipsUploadUiVkNavigator clipsUploadUiVkNavigator) {
        this.a = w9c0Var;
        this.b = gxhVar;
        this.c = b25Var;
        this.d = clipsUploadUiVkNavigator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8c0)) {
            return false;
        }
        k8c0 k8c0Var = (k8c0) obj;
        return epx.f(this.a, k8c0Var.a) && epx.f(this.b, k8c0Var.b) && epx.f(this.c, k8c0Var.c) && epx.f(this.d, k8c0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PostToClipsPubDeps(postWithVideoToClipHelper=" + this.a + ", communityRepository=" + this.b + ", authBridge=" + this.c + ", clipsUploadNavigator=" + this.d + ')';
    }
}
