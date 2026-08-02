package xsna;

import android.net.Uri;
import android.util.Size;

/* compiled from: ImageCellItem.kt */
/* loaded from: classes17.dex */
public final class ehw implements yp10 {
    public final int a;
    public final Uri b;
    public final long c;
    public final String d;
    public final Size e;
    public final b f;
    public final a g;

    /* compiled from: ImageCellItem.kt */
    public static final class a {
        public final b a;
        public final AbstractC2809a b;

        /* compiled from: ImageCellItem.kt */
        /* renamed from: xsna.ehw$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC2809a {

            /* compiled from: ImageCellItem.kt */
            /* renamed from: xsna.ehw$a$a$a, reason: collision with other inner class name */
            public static final class C2810a extends AbstractC2809a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2810a)) {
                        return false;
                    }
                    ((C2810a) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return "Custom(view=null)";
                }
            }

            /* compiled from: ImageCellItem.kt */
            /* renamed from: xsna.ehw$a$a$b */
            public static final class b extends AbstractC2809a {
                public final String a;

                public b(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("DefaultBadge(text="), this.a, ')');
                }
            }
        }

        /* compiled from: ImageCellItem.kt */
        public static abstract class b {

            /* compiled from: ImageCellItem.kt */
            /* renamed from: xsna.ehw$a$b$a, reason: collision with other inner class name */
            public static final class C2811a extends b {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2811a)) {
                        return false;
                    }
                    ((C2811a) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return "Custom(view=null)";
                }
            }

            /* compiled from: ImageCellItem.kt */
            /* renamed from: xsna.ehw$a$b$b, reason: collision with other inner class name */
            public static final class C2812b extends b {
                public final long a;

                public C2812b(long j) {
                    this.a = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2812b) && this.a == ((C2812b) obj).a;
                }

                public final int hashCode() {
                    return Long.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.a(')', this.a, new StringBuilder("DefaultDate(dateMs="));
                }
            }
        }

        public a() {
            this(null, null, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            b bVar = this.a;
            int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            AbstractC2809a abstractC2809a = this.b;
            return (hashCode + (abstractC2809a != null ? abstractC2809a.hashCode() : 0)) * 31;
        }

        public final String toString() {
            return "Labels(topLeft=" + this.a + ", bottomRight=" + this.b + ", bottomLeft=null)";
        }

        public a(b.C2812b c2812b, AbstractC2809a.b bVar, int i) {
            c2812b = (i & 1) != 0 ? null : c2812b;
            bVar = (i & 2) != 0 ? null : bVar;
            this.a = c2812b;
            this.b = bVar;
        }
    }

    /* compiled from: ImageCellItem.kt */
    public static abstract class b {

        /* compiled from: ImageCellItem.kt */
        public static final class a extends b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1553873681;
            }

            public final String toString() {
                return "Checked";
            }
        }

        /* compiled from: ImageCellItem.kt */
        /* renamed from: xsna.ehw$b$b, reason: collision with other inner class name */
        public static final class C2813b extends b {
            public final int a;

            public C2813b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2813b) && this.a == ((C2813b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Counted(value="), this.a, ')');
            }
        }

        /* compiled from: ImageCellItem.kt */
        public static final class c extends b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2103569972;
            }

            public final String toString() {
                return "Disabled";
            }
        }

        /* compiled from: ImageCellItem.kt */
        public static final class d extends b {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -157904938;
            }

            public final String toString() {
                return "NotSelected";
            }
        }
    }

    public ehw(int i, Uri uri, long j, String str, Size size, b bVar, a aVar) {
        this.a = i;
        this.b = uri;
        this.c = j;
        this.d = str;
        this.e = size;
        this.f = bVar;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehw)) {
            return false;
        }
        ehw ehwVar = (ehw) obj;
        return this.a == ehwVar.a && epx.f(this.b, ehwVar.b) && this.c == ehwVar.c && epx.f(this.d, ehwVar.d) && epx.f(this.e, ehwVar.e) && epx.f(this.f, ehwVar.f) && epx.f(this.g, ehwVar.g);
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
        Size size = this.e;
        int hashCode = (this.f.hashCode() + ((a2 + (size == null ? 0 : size.hashCode())) * 31)) * 31;
        a aVar = this.g;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ImageCellItem(id=" + this.a + ", imageSource=" + this.b + ", dateModifiedMs=" + this.c + ", contentDescription=" + this.d + ", imageSize=" + this.e + ", selectedState=" + this.f + ", labels=" + this.g + ')';
    }
}
