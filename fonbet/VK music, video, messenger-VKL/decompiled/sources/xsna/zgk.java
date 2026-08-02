package xsna;

import com.vk.newsfeed.posting.crop_editor.domain.model.ImageCropResult;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;

/* compiled from: CropEditorSideEffect.kt */
/* loaded from: classes4.dex */
public interface zgk {

    /* compiled from: CropEditorSideEffect.kt */
    public static final class a implements zgk {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 872824431;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CropEditorSideEffect.kt */
    public static final class b implements zgk {
        public final ImageCropResult a;

        public b(ImageCropResult imageCropResult) {
            this.a = imageCropResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CloseWithResult(imageCropResult=" + this.a + ')';
        }
    }

    /* compiled from: CropEditorSideEffect.kt */
    public static final class c implements zgk {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(link="), this.a, ')');
        }
    }

    /* compiled from: CropEditorSideEffect.kt */
    public static final class d implements zgk {
        public final ImageLink a;
        public final boolean b;

        public d(ImageLink imageLink, boolean z) {
            this.a = imageLink;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPhotoEditor(imageLink=");
            sb.append(this.a);
            sb.append(", hasGoods=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
