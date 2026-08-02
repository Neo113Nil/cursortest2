package xsna;

import xsna.hxe;
import xsna.tlo0;

/* compiled from: Content.kt */
/* loaded from: classes17.dex */
public interface ffj {

    /* compiled from: Content.kt */
    public static final class a implements ffj {
        static {
            new a();
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 228780445;
        }

        public final String toString() {
            return "Divider";
        }
    }

    /* compiled from: Content.kt */
    public static final class b implements ffj {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Header(text=null)";
        }
    }

    /* compiled from: Content.kt */
    public static final class c<Key> implements ffj {
        public final tlo0.f a;
        public final hxe.a b;
        public final a c;

        /* compiled from: Content.kt */
        public static final class a {
            public final int a;
            public final Integer b;

            public a(int i, Integer num) {
                this.a = i;
                this.b = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b.equals(aVar.b);
            }

            public final int hashCode() {
                return (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Icon(iconRes=");
                sb.append(this.a);
                sb.append(", iconTint=");
                return oq.b(sb, this.b, ", iconSize=null)");
            }
        }

        public c() {
            throw null;
        }

        public c(tlo0.f fVar, hxe.a aVar, a aVar2) {
            this.a = fVar;
            this.b = aVar;
            this.c = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a.a) * 31;
            hxe.a aVar = this.b;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 961;
            a aVar2 = this.c;
            return (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        }

        public final String toString() {
            return "MenuItem(title=" + this.a + ", key=" + this.b + ", detail=null, icon=" + this.c + ", trailingIcon=null)";
        }
    }
}
