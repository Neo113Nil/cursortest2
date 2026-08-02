package xsna;

import com.vk.dto.common.GoodAlbum;

/* compiled from: StorefrontAlbumsAction.kt */
/* loaded from: classes18.dex */
public interface sjl0 extends lj50 {

    /* compiled from: StorefrontAlbumsAction.kt */
    public interface a extends sjl0 {

        /* compiled from: StorefrontAlbumsAction.kt */
        /* renamed from: xsna.sjl0$a$a, reason: collision with other inner class name */
        public static final class C3669a implements a {
            public final GoodAlbum b;
            public final int c;

            public C3669a(GoodAlbum goodAlbum, int i) {
                this.b = goodAlbum;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3669a)) {
                    return false;
                }
                C3669a c3669a = (C3669a) obj;
                return epx.f(this.b, c3669a.b) && this.c == c3669a.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Album(goodAlbum=");
                sb.append(this.b);
                sb.append(", pos=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: StorefrontAlbumsAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1256477068;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* compiled from: StorefrontAlbumsAction.kt */
        public static final class c implements a {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 607930512;
            }

            public final String toString() {
                return "Bookmarks";
            }
        }

        /* compiled from: StorefrontAlbumsAction.kt */
        public static final class d implements a {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1256446803;
            }

            public final String toString() {
                return "Cart";
            }
        }

        /* compiled from: StorefrontAlbumsAction.kt */
        public static final class e implements a {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 352458918;
            }

            public final String toString() {
                return "CreateAlbum";
            }
        }

        /* compiled from: StorefrontAlbumsAction.kt */
        public static final class f implements a {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1575224709;
            }

            public final String toString() {
                return "ViewedGoods";
            }
        }
    }

    /* compiled from: StorefrontAlbumsAction.kt */
    public static final class b implements sjl0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -143875102;
        }

        public final String toString() {
            return "LoadMore";
        }
    }

    /* compiled from: StorefrontAlbumsAction.kt */
    public static final class c implements sjl0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1499040224;
        }

        public final String toString() {
            return "Reload";
        }
    }
}
