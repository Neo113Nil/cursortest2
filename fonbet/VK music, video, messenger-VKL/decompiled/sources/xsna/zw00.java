package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;

/* compiled from: MarketEditAlbumCoverAction.kt */
/* loaded from: classes18.dex */
public interface zw00 extends kj50 {

    /* compiled from: MarketEditAlbumCoverAction.kt */
    public interface a extends zw00 {

        /* compiled from: MarketEditAlbumCoverAction.kt */
        /* renamed from: xsna.zw00$a$a, reason: collision with other inner class name */
        public static final class C4205a implements a {
            public final boolean b;

            public C4205a(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4205a) && this.b == ((C4205a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Hidden(isChecked="), this.b, ')');
            }
        }

        /* compiled from: MarketEditAlbumCoverAction.kt */
        public static final class b implements a {
            public final Photo b;

            public b(Photo photo) {
                this.b = photo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
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

        /* compiled from: MarketEditAlbumCoverAction.kt */
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
                return defpackage.q0.a(new StringBuilder("Main(isChecked="), this.b, ')');
            }
        }

        /* compiled from: MarketEditAlbumCoverAction.kt */
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
    }

    /* compiled from: MarketEditAlbumCoverAction.kt */
    public static final class b implements zw00 {
        public final UserId b;

        public b(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Init(ownerId="), this.b, ')');
        }
    }

    /* compiled from: MarketEditAlbumCoverAction.kt */
    public interface c extends zw00 {

        /* compiled from: MarketEditAlbumCoverAction.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2122561351;
            }

            public final String toString() {
                return "ButtonNextClick";
            }
        }

        /* compiled from: MarketEditAlbumCoverAction.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1776953134;
            }

            public final String toString() {
                return "OnBackPressed";
            }
        }

        /* compiled from: MarketEditAlbumCoverAction.kt */
        /* renamed from: xsna.zw00$c$c, reason: collision with other inner class name */
        public static final class C4206c implements c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4206c)) {
                    return false;
                }
                ((C4206c) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Integer.hashCode(4);
            }

            public final String toString() {
                return "ShowPhotoFromVkChooser(requestCode=4)";
            }
        }
    }
}
