package xsna;

import com.vk.dto.photo.Photo;

/* compiled from: MarketEditAlbumCoverState.kt */
/* loaded from: classes18.dex */
public interface kx00 extends km50 {

    /* compiled from: MarketEditAlbumCoverState.kt */
    public static final class a implements kx00 {
        public final String b;
        public final int c;
        public final boolean d;
        public final Photo e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public a(String str, int i, boolean z, Photo photo, boolean z2, boolean z3, boolean z4) {
            this.b = str;
            this.c = i;
            this.d = z;
            this.e = photo;
            this.f = z2;
            this.g = z3;
            this.h = z4;
        }

        public static a a(a aVar, String str, int i, boolean z, Photo photo, boolean z2, boolean z3, int i2) {
            if ((i2 & 1) != 0) {
                str = aVar.b;
            }
            String str2 = str;
            if ((i2 & 2) != 0) {
                i = aVar.c;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                z = aVar.d;
            }
            boolean z4 = z;
            if ((i2 & 8) != 0) {
                photo = aVar.e;
            }
            Photo photo2 = photo;
            if ((i2 & 16) != 0) {
                z2 = aVar.f;
            }
            boolean z5 = z2;
            if ((i2 & 32) != 0) {
                z3 = aVar.g;
            }
            boolean z6 = aVar.h;
            aVar.getClass();
            return new a(str2, i3, z4, photo2, z5, z3, z6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h;
        }

        public final int hashCode() {
            String str = this.b;
            int b = qoy.b(shy.a(this.c, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.d);
            Photo photo = this.e;
            return Boolean.hashCode(this.h) + qoy.b(qoy.b((b + (photo != null ? photo.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(title=");
            sb.append(this.b);
            sb.append(", titleCursorPosition=");
            sb.append(this.c);
            sb.append(", isTitleEmptyError=");
            sb.append(this.d);
            sb.append(", image=");
            sb.append(this.e);
            sb.append(", isHidden=");
            sb.append(this.f);
            sb.append(", isMain=");
            sb.append(this.g);
            sb.append(", isEditMode=");
            return defpackage.q0.a(sb, this.h, ')');
        }
    }

    /* compiled from: MarketEditAlbumCoverState.kt */
    public static final class b implements kx00 {
    }

    /* compiled from: MarketEditAlbumCoverState.kt */
    public static final class c implements kx00 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -229265577;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
