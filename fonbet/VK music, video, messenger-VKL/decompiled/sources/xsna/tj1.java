package xsna;

import com.vk.dto.photo.PhotoAlbum;

/* compiled from: AlbumPickerPatch.kt */
/* loaded from: classes5.dex */
public abstract class tj1 implements xl50 {

    /* compiled from: AlbumPickerPatch.kt */
    public static abstract class a extends tj1 {

        /* compiled from: AlbumPickerPatch.kt */
        /* renamed from: xsna.tj1$a$a, reason: collision with other inner class name */
        public static final class C3748a extends a {
            public final ewp b;

            public C3748a(ewp ewpVar) {
                this.b = ewpVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3748a) && epx.f(this.b, ((C3748a) obj).b);
            }

            public final int hashCode() {
                return this.b.a.hashCode();
            }

            public final String toString() {
                return "Error(errorLoading=" + this.b + ')';
            }
        }

        /* compiled from: AlbumPickerPatch.kt */
        public static final class b extends a {
            public static final b b = new b();
        }

        /* compiled from: AlbumPickerPatch.kt */
        public static final class c extends a {
            public final wia0<PhotoAlbum> b;

            public c(wia0<PhotoAlbum> wia0Var) {
                this.b = wia0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(photoAlbum=" + this.b + ')';
            }
        }
    }
}
