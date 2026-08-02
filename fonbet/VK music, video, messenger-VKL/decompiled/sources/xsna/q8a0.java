package xsna;

import com.vk.dto.photo.PhotoAlbum;

/* compiled from: PhotoFlowSettingsItem.kt */
/* loaded from: classes4.dex */
public abstract class q8a0 {

    /* compiled from: PhotoFlowSettingsItem.kt */
    public static abstract class a extends q8a0 {
        public final PhotoAlbum a;
        public final boolean b;

        /* compiled from: PhotoFlowSettingsItem.kt */
        /* renamed from: xsna.q8a0$a$a, reason: collision with other inner class name */
        public static final class C3553a extends a {
            public final PhotoAlbum c;
            public final boolean d;
            public final String e;

            public C3553a(PhotoAlbum photoAlbum, boolean z, String str) {
                super(photoAlbum, z);
                this.c = photoAlbum;
                this.d = z;
                this.e = str;
            }

            @Override // xsna.q8a0.a
            public final PhotoAlbum a() {
                return this.c;
            }

            @Override // xsna.q8a0.a
            public final boolean b() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3553a)) {
                    return false;
                }
                C3553a c3553a = (C3553a) obj;
                return epx.f(this.c, c3553a.c) && this.d == c3553a.d && epx.f(this.e, c3553a.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + qoy.b(this.c.hashCode() * 31, 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PrivateAlbum(album=");
                sb.append(this.c);
                sb.append(", checked=");
                sb.append(this.d);
                sb.append(", privacyDisplayString=");
                return ho8.a(sb, this.e, ')');
            }
        }

        /* compiled from: PhotoFlowSettingsItem.kt */
        public static final class b extends a {
            public final PhotoAlbum c;
            public final boolean d;

            public b(PhotoAlbum photoAlbum, boolean z) {
                super(photoAlbum, z);
                this.c = photoAlbum;
                this.d = z;
            }

            @Override // xsna.q8a0.a
            public final PhotoAlbum a() {
                return this.c;
            }

            @Override // xsna.q8a0.a
            public final boolean b() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.c, bVar.c) && this.d == bVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PublicAlbum(album=");
                sb.append(this.c);
                sb.append(", checked=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        public a(PhotoAlbum photoAlbum, boolean z) {
            this.a = photoAlbum;
            this.b = z;
        }

        public PhotoAlbum a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    /* compiled from: PhotoFlowSettingsItem.kt */
    public static abstract class b extends q8a0 {

        /* compiled from: PhotoFlowSettingsItem.kt */
        public static final class a extends b {
            public static final a a = new a();
        }

        /* compiled from: PhotoFlowSettingsItem.kt */
        /* renamed from: xsna.q8a0$b$b, reason: collision with other inner class name */
        public static final class C3554b extends b {
            public static final C3554b a = new C3554b();
        }

        /* compiled from: PhotoFlowSettingsItem.kt */
        public static final class c extends b {
            public static final c a = new c();
        }
    }
}
