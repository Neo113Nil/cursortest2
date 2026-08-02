package xsna;

import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import java.util.List;

/* compiled from: VideoDiscoveryCatalogRepository.kt */
/* loaded from: classes7.dex */
public final class sfs0 {
    public final List<VideoDiscoveryCatalogRepository$Section> a;
    public final VideoDiscoveryCatalogRepository$Section b;

    public sfs0(VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section, List list) {
        this.a = list;
        this.b = videoDiscoveryCatalogRepository$Section;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfs0)) {
            return false;
        }
        sfs0 sfs0Var = (sfs0) obj;
        return epx.f(this.a, sfs0Var.a) && epx.f(this.b, sfs0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = this.b;
        return hashCode + (videoDiscoveryCatalogRepository$Section == null ? 0 : videoDiscoveryCatalogRepository$Section.hashCode());
    }

    public final String toString() {
        return "CatalogSkeleton(sections=" + this.a + ", currentSection=" + this.b + ')';
    }
}
