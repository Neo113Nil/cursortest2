package xsna;

import com.vk.story.viewer.api.models.PreloadSource;

/* compiled from: IdeasStoryAction.kt */
/* loaded from: classes6.dex */
public final class atv implements rsv {
    public final PreloadSource b;

    public atv(PreloadSource preloadSource) {
        this.b = preloadSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof atv) && this.b == ((atv) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SetPreloadSource(source=" + this.b + ')';
    }
}
