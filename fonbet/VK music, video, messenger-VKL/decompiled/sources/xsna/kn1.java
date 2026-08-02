package xsna;

import com.vk.dto.photo.PhotoAlbum;
import java.util.List;

/* compiled from: AlbumsItem.kt */
/* loaded from: classes4.dex */
public abstract class kn1 {

    /* compiled from: AlbumsItem.kt */
    public static final class a extends kn1 {
        public final PhotoAlbum a;

        public a(PhotoAlbum photoAlbum) {
            this.a = photoAlbum;
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
            return "Album(photoAlbum=" + this.a + ')';
        }
    }

    /* compiled from: AlbumsItem.kt */
    public static final class b extends kn1 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("EmptyNonSystemBlock(albumOfCurrentUser="), this.a, ')');
        }
    }

    /* compiled from: AlbumsItem.kt */
    public static final class c extends kn1 {
        public final List<PhotoAlbum> a;
        public final tlo0 b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends PhotoAlbum> list, tlo0 tlo0Var) {
            this.a = list;
            this.b = tlo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SystemBlock(systemAlbums=");
            sb.append(this.a);
            sb.append(", userAlbumsTitle=");
            return bt.a(sb, this.b, ')');
        }
    }
}
