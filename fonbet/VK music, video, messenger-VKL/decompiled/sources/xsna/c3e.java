package xsna;

import com.vk.clips.favorites.impl.ui.folders.content.recycler.ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState;
import com.vk.dto.common.Image;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import xsna.tlo0;

/* compiled from: ClipsFavoriteFolderContentListItem.kt */
/* loaded from: classes16.dex */
public final class c3e implements hfz {
    public final ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState b;
    public final String c;
    public final Image d;
    public final tlo0.h e;
    public final VideoOverlayView.c f;

    public c3e(ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState clipsFavoriteFolderContentListItem$MultiSelectCheckboxState, String str, Image image, tlo0.h hVar, VideoOverlayView.c.j jVar) {
        this.b = clipsFavoriteFolderContentListItem$MultiSelectCheckboxState;
        this.c = str;
        this.d = image;
        this.e = hVar;
        this.f = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3e)) {
            return false;
        }
        c3e c3eVar = (c3e) obj;
        return this.b == c3eVar.b && epx.f(this.c, c3eVar.c) && epx.f(this.d, c3eVar.d) && this.e.equals(c3eVar.e) && epx.f(this.f, c3eVar.f);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.c.hashCode());
    }

    public final int hashCode() {
        int c = u11.c(fq.b(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31, this.e.a);
        VideoOverlayView.c cVar = this.f;
        return c + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "Clip(multiSelectCheckboxState=" + this.b + ", videoFileUniqueKey=" + this.c + ", preview=" + this.d + ", title=" + this.e + ", restrictionOverlayState=" + this.f + ')';
    }
}
