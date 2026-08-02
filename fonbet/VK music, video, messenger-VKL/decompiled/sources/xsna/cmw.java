package xsna;

import com.vk.clips.design.view.favorites.folder.ClipsFoldersCoverView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;

/* compiled from: ImageToFavoriteCoverAdapter.kt */
/* loaded from: classes16.dex */
public final class cmw implements ClipsFoldersCoverView.a {
    public final Image a;

    public cmw(Image image) {
        this.a = image;
    }

    @Override // com.vk.clips.design.view.favorites.folder.ClipsFoldersCoverView.a
    public final String a(int i) {
        ImageSize Cb = this.a.Cb(i, true, false);
        if (Cb != null) {
            return Cb.d.d;
        }
        return null;
    }
}
