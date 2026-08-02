package xsna;

import android.net.Uri;
import com.vk.newsfeed.posting.crop_editor.presentation.domain.model.RectPoints;
import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;

/* compiled from: CropEditorAction.kt */
/* loaded from: classes4.dex */
public interface ofk extends kj50 {

    /* compiled from: CropEditorAction.kt */
    public static final class a implements ofk {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 622916317;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CropEditorAction.kt */
    public static final class b implements ofk {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -304949440;
        }

        public final String toString() {
            return "CloseWithResult";
        }
    }

    /* compiled from: CropEditorAction.kt */
    public static final class c implements ofk {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "EditImage(isImageEdited=true)";
        }
    }

    /* compiled from: CropEditorAction.kt */
    public static final class d implements ofk {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 574463883;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: CropEditorAction.kt */
    public static final class e implements ofk {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 649872965;
        }

        public final String toString() {
            return "OpenCropWiki";
        }
    }

    /* compiled from: CropEditorAction.kt */
    public static final class f implements ofk {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 197060666;
        }

        public final String toString() {
            return "OpenPhotoEditor";
        }
    }

    /* compiled from: CropEditorAction.kt */
    public static final class g implements ofk {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1565632111;
        }

        public final String toString() {
            return "ResetCropArea";
        }
    }

    /* compiled from: CropEditorAction.kt */
    public static final class h implements ofk {
        public final RectPoints b;

        public h(RectPoints rectPoints) {
            this.b = rectPoints;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SaveCropArea(cropPoints=" + this.b + ')';
        }
    }

    /* compiled from: CropEditorAction.kt */
    public static final class i implements ofk {
        public final PostingPreviewRatio b;

        public i(PostingPreviewRatio postingPreviewRatio) {
            this.b = postingPreviewRatio;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectRatio(ratio=" + this.b + ')';
        }
    }

    /* compiled from: CropEditorAction.kt */
    public static final class j implements ofk {
        public final CropFitContainerMode b;

        public j(CropFitContainerMode cropFitContainerMode) {
            this.b = cropFitContainerMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.b == ((j) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetFitContainerMode(mode=" + this.b + ')';
        }
    }

    /* compiled from: CropEditorAction.kt */
    public static final class k implements ofk {
        public final Uri b;

        public k(Uri uri) {
            this.b = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return alb0.b(new StringBuilder("SetImage(uri="), this.b, ')');
        }
    }
}
