package xsna;

import com.vk.dto.photo.PhotoAlbum;

/* compiled from: AlbumsSettingsSideEffect.kt */
/* loaded from: classes4.dex */
public abstract class kq1 {

    /* compiled from: AlbumsSettingsSideEffect.kt */
    public static final class a extends kq1 {
        public static final a a = new a();
    }

    /* compiled from: AlbumsSettingsSideEffect.kt */
    public static final class b extends kq1 {
        public final PhotoAlbum a;

        public b(PhotoAlbum photoAlbum) {
            this.a = photoAlbum;
        }
    }

    /* compiled from: AlbumsSettingsSideEffect.kt */
    public static final class c extends kq1 {
        public final Throwable a;

        public c(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: AlbumsSettingsSideEffect.kt */
    public static final class d extends kq1 {
    }

    /* compiled from: AlbumsSettingsSideEffect.kt */
    public static final class e extends kq1 {
        public final j7k0 a;

        public e(j7k0 j7k0Var) {
            this.a = j7k0Var;
        }
    }
}
