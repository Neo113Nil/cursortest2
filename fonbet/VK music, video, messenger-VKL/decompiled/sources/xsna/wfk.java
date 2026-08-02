package xsna;

import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;

/* compiled from: CropEditorPatch.kt */
/* loaded from: classes4.dex */
public interface wfk extends xl50 {

    /* compiled from: CropEditorPatch.kt */
    public static final class a implements wfk {
        public final CropFitContainerMode b;

        public a(CropFitContainerMode cropFitContainerMode) {
            this.b = cropFitContainerMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChangeFitContainerMode(mode=" + this.b + ')';
        }
    }

    /* compiled from: CropEditorPatch.kt */
    public static final class b implements wfk {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "EditImage(isImageEdited=true)";
        }
    }

    /* compiled from: CropEditorPatch.kt */
    public static final class c implements wfk {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 436656968;
        }

        public final String toString() {
            return "Loaded";
        }
    }

    /* compiled from: CropEditorPatch.kt */
    public static final class d implements wfk {
        public final ImageCropArea b;

        public d(ImageCropArea imageCropArea) {
            this.b = imageCropArea;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ResetCropArea(cropArea=" + this.b + ')';
        }
    }

    /* compiled from: CropEditorPatch.kt */
    public static final class e implements wfk {
        public final ImageCropArea b;

        public e(ImageCropArea imageCropArea) {
            this.b = imageCropArea;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SaveCropArea(cropArea=" + this.b + ')';
        }
    }

    /* compiled from: CropEditorPatch.kt */
    public static final class f implements wfk {
        public final PostingPreviewRatio b;

        public f(PostingPreviewRatio postingPreviewRatio) {
            this.b = postingPreviewRatio;
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
            return "SelectRatio(ratio=" + this.b + ')';
        }
    }

    /* compiled from: CropEditorPatch.kt */
    public static final class g implements wfk {
        public final mhk b;

        public g(mhk mhkVar) {
            this.b = mhkVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.a.hashCode();
        }

        public final String toString() {
            return "SetImage(imageState=" + this.b + ')';
        }
    }
}
