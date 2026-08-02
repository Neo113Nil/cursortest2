package xsna;

/* compiled from: StoryDialogOpenParams.kt */
/* loaded from: classes6.dex */
public final class h1m0 {
    public final com.vk.story.viewer.api.a a;
    public final enm0 b;

    public h1m0(com.vk.story.viewer.api.a aVar, enm0 enm0Var) {
        this.a = aVar;
        this.b = enm0Var;
    }

    public final com.vk.story.viewer.api.a a() {
        return this.a;
    }

    public final enm0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1m0)) {
            return false;
        }
        h1m0 h1m0Var = (h1m0) obj;
        return epx.f(this.a, h1m0Var.a) && epx.f(this.b, h1m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StoryDialogOpenParams(storyDialogConfig=" + this.a + ", storyViewerConfig=" + this.b + ')';
    }
}
