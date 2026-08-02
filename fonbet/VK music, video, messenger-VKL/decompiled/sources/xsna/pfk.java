package xsna;

import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import java.util.UUID;

/* compiled from: CropEditorArguments.kt */
/* loaded from: classes4.dex */
public final class pfk {
    public final ImageLink a;
    public final ImageCropArea b;
    public final PostingPreviewRatio c;
    public final MediaStoreEntry d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final CropFitContainerMode h;
    public final UUID i;

    public pfk(ImageLink imageLink, ImageCropArea imageCropArea, PostingPreviewRatio postingPreviewRatio, MediaStoreEntry mediaStoreEntry, boolean z, boolean z2, boolean z3, CropFitContainerMode cropFitContainerMode, UUID uuid) {
        this.a = imageLink;
        this.b = imageCropArea;
        this.c = postingPreviewRatio;
        this.d = mediaStoreEntry;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = cropFitContainerMode;
        this.i = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfk)) {
            return false;
        }
        pfk pfkVar = (pfk) obj;
        return epx.f(this.a, pfkVar.a) && epx.f(this.b, pfkVar.b) && epx.f(this.c, pfkVar.c) && epx.f(this.d, pfkVar.d) && this.e == pfkVar.e && this.f == pfkVar.f && this.g == pfkVar.g && this.h == pfkVar.h && epx.f(this.i, pfkVar.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ImageCropArea imageCropArea = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (imageCropArea == null ? 0 : imageCropArea.hashCode())) * 31)) * 31;
        MediaStoreEntry mediaStoreEntry = this.d;
        return this.i.hashCode() + ((this.h.hashCode() + qoy.b(qoy.b(qoy.b((hashCode2 + (mediaStoreEntry != null ? mediaStoreEntry.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        return "CropEditorArguments(imageLink=" + this.a + ", cropArea=" + this.b + ", currentRatio=" + this.c + ", originalMediaEntry=" + this.d + ", isNeedRecalculateRatio=" + this.e + ", hasGoods=" + this.f + ", isEditEnabled=" + this.g + ", fitContainerMode=" + this.h + ", targetScreenUniqueId=" + this.i + ')';
    }
}
