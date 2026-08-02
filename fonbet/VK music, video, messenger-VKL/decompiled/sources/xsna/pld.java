package xsna;

import com.vk.media.filters.di.FiltersComponent;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.playback.di.MediaPlaybackComponent;

/* compiled from: ClipsChoosePreviewDeps.kt */
/* loaded from: classes17.dex */
public final class pld {
    public final FiltersComponent a;
    public final MediaPipelineComponent b;
    public final MediaPlaybackComponent c;

    public pld(FiltersComponent filtersComponent, MediaPipelineComponent mediaPipelineComponent, MediaPlaybackComponent mediaPlaybackComponent) {
        this.a = filtersComponent;
        this.b = mediaPipelineComponent;
        this.c = mediaPlaybackComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pld)) {
            return false;
        }
        pld pldVar = (pld) obj;
        return epx.f(this.a, pldVar.a) && epx.f(this.b, pldVar.b) && epx.f(this.c, pldVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ClipsChoosePreviewDeps(filtersComponent=" + this.a + ", mediaPipelineComponent=" + this.b + ", mediaPlaybackComponent=" + this.c + ')';
    }
}
