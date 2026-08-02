package xsna;

import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;

/* compiled from: VideoDiscoveryCatalogRepository.kt */
/* loaded from: classes7.dex */
public final class tfs0 {
    public final VideoDiscoveryCatalogRepository$Section a;

    public tfs0(VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section) {
        this.a = videoDiscoveryCatalogRepository$Section;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfs0) && epx.f(this.a, ((tfs0) obj).a);
    }

    public final int hashCode() {
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = this.a;
        if (videoDiscoveryCatalogRepository$Section == null) {
            return 0;
        }
        return videoDiscoveryCatalogRepository$Section.hashCode();
    }

    public final String toString() {
        return "SectionPage(section=" + this.a + ')';
    }
}
