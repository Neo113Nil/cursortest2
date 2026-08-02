package xsna;

import com.vk.dto.common.Image;
import com.vkontakte.android.R;

/* compiled from: ImageSource.kt */
/* loaded from: classes6.dex */
public abstract class qlw {

    /* compiled from: ImageSource.kt */
    public static final class a extends qlw {
        public final int a = R.drawable.vk_icon_avatar_placeholder_anonim_150;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ByDrawableId(resId="), this.a, ')');
        }
    }

    /* compiled from: ImageSource.kt */
    public static final class b extends qlw {
        public final Image a;

        public b(Image image) {
            this.a = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            Image image = this.a;
            if (image == null) {
                return 0;
            }
            return image.hashCode();
        }

        public final String toString() {
            return er.d(new StringBuilder("ByImage(image="), this.a, ')');
        }
    }
}
