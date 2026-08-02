package xsna;

import com.vk.dto.photo.Photo;

/* compiled from: MarketEditAlbumCoverPatch.kt */
/* loaded from: classes18.dex */
public interface ix00 extends xl50 {

    /* compiled from: MarketEditAlbumCoverPatch.kt */
    public interface a extends ix00 {

        /* compiled from: MarketEditAlbumCoverPatch.kt */
        /* renamed from: xsna.ix00$a$a, reason: collision with other inner class name */
        public static final class C3086a implements a {
            public final Photo b;

            public C3086a(Photo photo) {
                this.b = photo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3086a) && epx.f(this.b, ((C3086a) obj).b);
            }

            public final int hashCode() {
                Photo photo = this.b;
                if (photo == null) {
                    return 0;
                }
                return photo.hashCode();
            }

            public final String toString() {
                return tq.c(new StringBuilder("Image(photo="), this.b, ')');
            }
        }

        /* compiled from: MarketEditAlbumCoverPatch.kt */
        public static final class b implements a {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("IsHidden(isHidden="), this.b, ')');
            }
        }

        /* compiled from: MarketEditAlbumCoverPatch.kt */
        public static final class c implements a {
            public final boolean b;

            public c(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("IsMain(isMain="), this.b, ')');
            }
        }

        /* compiled from: MarketEditAlbumCoverPatch.kt */
        public static final class d implements a {
            public final String b;
            public final int c;

            public d(String str, int i) {
                this.b = str;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.b, dVar.b) && this.c == dVar.c;
            }

            public final int hashCode() {
                String str = this.b;
                return Integer.hashCode(this.c) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Title(title=");
                sb.append(this.b);
                sb.append(", cursorPosition=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: MarketEditAlbumCoverPatch.kt */
        public static final class e implements a {
            public final boolean b;

            public e(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.b == ((e) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("TitleError(isEmpty="), this.b, ')');
            }
        }
    }

    /* compiled from: MarketEditAlbumCoverPatch.kt */
    public static final class b implements ix00 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 629367822;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: MarketEditAlbumCoverPatch.kt */
    public static final class c implements ix00 {
        public final boolean b;
        public final String c;
        public final Photo d;
        public final boolean e;
        public final boolean f;

        public c(boolean z, String str, Photo photo, boolean z2, boolean z3) {
            this.b = z;
            this.c = str;
            this.d = photo;
            this.e = z2;
            this.f = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Photo photo = this.d;
            return Boolean.hashCode(this.f) + qoy.b((hashCode2 + (photo != null ? photo.hashCode() : 0)) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateContent(isEditMode=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", image=");
            sb.append(this.d);
            sb.append(", isHidden=");
            sb.append(this.e);
            sb.append(", isMain=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }
}
