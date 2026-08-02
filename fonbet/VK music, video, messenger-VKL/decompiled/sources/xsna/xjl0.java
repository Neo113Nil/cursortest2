package xsna;

/* compiled from: StorefrontAlbumsEvent.kt */
/* loaded from: classes18.dex */
public interface xjl0 extends pk50 {

    /* compiled from: StorefrontAlbumsEvent.kt */
    public static final class a implements xjl0 {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("ErrorToast(error="), this.a, ')');
        }
    }

    /* compiled from: StorefrontAlbumsEvent.kt */
    public interface b extends xjl0 {

        /* compiled from: StorefrontAlbumsEvent.kt */
        public static final class a implements b {
            public final int a;
            public final boolean b;
            public final String c;

            public a(int i, boolean z, String str) {
                this.a = i;
                this.b = z;
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
                return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Album(albumId=");
                sb.append(this.a);
                sb.append(", canEdit=");
                sb.append(this.b);
                sb.append(", albumTitle=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: StorefrontAlbumsEvent.kt */
        /* renamed from: xsna.xjl0$b$b, reason: collision with other inner class name */
        public static final class C4010b implements b {
            public static final C4010b a = new C4010b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4010b);
            }

            public final int hashCode() {
                return -580065030;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* compiled from: StorefrontAlbumsEvent.kt */
        public static final class c implements b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1682485706;
            }

            public final String toString() {
                return "Bookmarks";
            }
        }

        /* compiled from: StorefrontAlbumsEvent.kt */
        public static final class d implements b {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -580034765;
            }

            public final String toString() {
                return "Cart";
            }
        }

        /* compiled from: StorefrontAlbumsEvent.kt */
        public static final class e implements b {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -2087117984;
            }

            public final String toString() {
                return "CreateAlbum";
            }
        }

        /* compiled from: StorefrontAlbumsEvent.kt */
        public static final class f implements b {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -864352193;
            }

            public final String toString() {
                return "ViewedGoods";
            }
        }
    }
}
