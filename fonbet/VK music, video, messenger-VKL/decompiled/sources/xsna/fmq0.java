package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;

/* compiled from: UserProfileAvatarAlbumLoader.kt */
/* loaded from: classes5.dex */
public final class fmq0 {
    public VKList<Photo> a;

    /* compiled from: UserProfileAvatarAlbumLoader.kt */
    public static final class a {
        public final int a;
        public final Photo b;
        public final String c;

        public a(int i, Photo photo, String str) {
            this.a = i;
            this.b = photo;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderPhoto(index=");
            sb.append(this.a);
            sb.append(", photo=");
            sb.append(this.b);
            sb.append(", url=");
            return ho8.a(sb, this.c, ')');
        }
    }
}
