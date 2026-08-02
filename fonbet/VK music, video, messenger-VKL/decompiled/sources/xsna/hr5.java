package xsna;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.Image;

/* compiled from: UserEditableData.kt */
/* loaded from: classes5.dex */
public interface hr5 {

    /* compiled from: UserEditableData.kt */
    public static final class a implements hr5 {
        public final Image a;

        public a(Image image) {
            this.a = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return er.d(new StringBuilder("ImageWrapper(image="), this.a, ')');
        }
    }

    /* compiled from: UserEditableData.kt */
    public static final class b implements hr5 {
        public final Bitmap a;
        public final RectF b;
        public final PhotosPhotoDto c;

        public b(Bitmap bitmap, RectF rectF, PhotosPhotoDto photosPhotoDto) {
            this.a = bitmap;
            this.b = rectF;
            this.c = photosPhotoDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "PhotoWrapper(thumb=" + this.a + ", rect=" + this.b + ", photo=" + this.c + ')';
        }
    }
}
