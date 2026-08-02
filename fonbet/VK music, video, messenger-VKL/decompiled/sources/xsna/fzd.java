package xsna;

import android.graphics.Bitmap;
import com.vk.dto.clips.ClipItemFilterType;

/* compiled from: ClipsEditorPreviewItem.kt */
/* loaded from: classes16.dex */
public final class fzd {
    public final Bitmap a;
    public final Bitmap b;
    public final a c;

    /* compiled from: ClipsEditorPreviewItem.kt */
    public static final class a {
        public final String a;
        public final long b;
        public final ClipItemFilterType c;

        public a(String str, long j, ClipItemFilterType clipItemFilterType) {
            this.a = str;
            this.b = j;
            this.c = clipItemFilterType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "PreviewInfo(path=" + this.a + ", framePosition=" + this.b + ", filterType=" + this.c + ')';
        }
    }

    public fzd(Bitmap bitmap, Bitmap bitmap2, a aVar) {
        this.a = bitmap;
        this.b = bitmap2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzd)) {
            return false;
        }
        fzd fzdVar = (fzd) obj;
        return epx.f(this.a, fzdVar.a) && epx.f(this.b, fzdVar.b) && epx.f(this.c, fzdVar.c);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Bitmap bitmap2 = this.b;
        return this.c.hashCode() + ((hashCode + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClipsEditorPreviewItem(photo=" + this.a + ", filteredPhoto=" + this.b + ", previewInfo=" + this.c + ')';
    }
}
