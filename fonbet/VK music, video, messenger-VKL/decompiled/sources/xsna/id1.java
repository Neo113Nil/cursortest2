package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseResult;

/* compiled from: AlbumChooseEvent.kt */
/* loaded from: classes7.dex */
public interface id1 extends pk50 {

    /* compiled from: AlbumChooseEvent.kt */
    public static final class a implements id1 {
        public final AlbumChooseResult a;

        public a(AlbumChooseResult albumChooseResult) {
            this.a = albumChooseResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            AlbumChooseResult albumChooseResult = this.a;
            if (albumChooseResult == null) {
                return 0;
            }
            return albumChooseResult.b.hashCode();
        }

        public final String toString() {
            return "Exit(result=" + this.a + ')';
        }
    }

    /* compiled from: AlbumChooseEvent.kt */
    public static final class b implements id1 {
        public final UserId a;
        public final String b;

        public b(UserId userId, String str) {
            this.a = userId;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCreateAlbum(ownerId=");
            sb.append(this.a);
            sb.append(", entryPoint=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
