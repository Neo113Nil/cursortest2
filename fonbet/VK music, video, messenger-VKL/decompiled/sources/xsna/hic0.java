package xsna;

import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public interface hic0 extends com.vk.newsfeed.posting.impl.domain.model.e {

    /* compiled from: PostingPatch.kt */
    public static final class a implements hic0 {
        public final PhotoAttachment b;

        public a(PhotoAttachment photoAttachment) {
            this.b = photoAttachment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RemoveCrops(attachment=" + this.b + ')';
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class b implements hic0 {
        public final MediaPickerSelectedItem b;

        public b(MediaPickerSelectedItem mediaPickerSelectedItem) {
            this.b = mediaPickerSelectedItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RemoveSmallCrop(item=" + this.b + ')';
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class c implements hic0 {
        public final ImageLink b;

        public c(ImageLink imageLink) {
            this.b = imageLink;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ResetCrop(link=" + this.b + ')';
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class d implements hic0 {
        public final PostingPreviewRatio b;
        public final String c;
        public final List<ImageCropArea> d;

        public d() {
            throw null;
        }

        public d(PostingPreviewRatio postingPreviewRatio, String str) {
            EmptyList emptyList = EmptyList.b;
            this.b = postingPreviewRatio;
            this.c = str;
            this.d = emptyList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectRatio(ratio=");
            sb.append(this.b);
            sb.append(", ratioMeta=");
            sb.append(this.c);
            sb.append(", newCropAreas=");
            return ms9.a(')', sb, this.d);
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class e implements hic0 {
        public final ImageCropArea b;
        public final boolean c;
        public final Attachment d;

        public e(ImageCropArea imageCropArea, Attachment attachment, boolean z) {
            this.b = imageCropArea;
            this.c = z;
            this.d = attachment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && this.c == eVar.c && epx.f(this.d, eVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
            Attachment attachment = this.d;
            return b + (attachment == null ? 0 : attachment.hashCode());
        }

        public final String toString() {
            return "SetCropArea(cropArea=" + this.b + ", shouldRewrite=" + this.c + ", attachment=" + this.d + ')';
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class f implements hic0 {
        public final List<ImageCropArea> b;

        public f(List<ImageCropArea> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("SetCropAreas(cropAreas="), this.b);
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class g implements hic0 {
        public final PhotoVideoAttachmentsCropData b;

        public g(PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData) {
            this.b = photoVideoAttachmentsCropData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetCropData(cropData=" + this.b + ')';
        }
    }
}
