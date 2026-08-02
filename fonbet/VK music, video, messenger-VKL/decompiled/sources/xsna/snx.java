package xsna;

import com.vk.core.view.interop.model.ContentScale;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: InteropAvatar.kt */
/* loaded from: classes17.dex */
public final class snx {
    public final b a;
    public final List<a> b;

    /* compiled from: InteropAvatar.kt */
    public interface a {

        /* compiled from: InteropAvatar.kt */
        /* renamed from: xsna.snx$a$a, reason: collision with other inner class name */
        public static final class C3682a implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3682a)) {
                    return false;
                }
                ((C3682a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Icon(icon=null, tint=null, size=null, pictureOffset=null, alignment=null, clipCircle=false, semanticsConfiguration=" + ((Object) "null") + ", onClick=null)";
            }
        }

        /* compiled from: InteropAvatar.kt */
        public static final class b implements a {
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
                return Boolean.hashCode(false) * 31;
            }

            public final String toString() {
                return "Live(clip=false, semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }

        /* compiled from: InteropAvatar.kt */
        public static final class c implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                ((c) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return 0;
            }

            public final String toString() {
                return "MobileOnline(semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }

        /* compiled from: InteropAvatar.kt */
        public static final class d implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                ((d) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return 0;
            }

            public final String toString() {
                return "WebOnline(semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }
    }

    /* compiled from: InteropAvatar.kt */
    public interface b {

        /* compiled from: InteropAvatar.kt */
        public static final class a implements b {
            public final b8g a;

            public a(b8g b8gVar) {
                this.a = b8gVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return Integer.hashCode(this.a.a);
            }

            public final String toString() {
                return "Color(color=" + this.a + ')';
            }
        }

        /* compiled from: InteropAvatar.kt */
        /* renamed from: xsna.snx$b$b, reason: collision with other inner class name */
        public static final class C3683b implements b {
            public final gko a;
            public final ipi b;

            public C3683b(gko gkoVar, b8g b8gVar, int i) {
                b8gVar = (i & 2) != 0 ? null : b8gVar;
                this.a = gkoVar;
                this.b = b8gVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3683b)) {
                    return false;
                }
                C3683b c3683b = (C3683b) obj;
                return this.a.equals(c3683b.a) && epx.f(this.b, c3683b.b);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a.a) * 31;
                ipi ipiVar = this.b;
                return (hashCode + (ipiVar == null ? 0 : ipiVar.hashCode())) * 31;
            }

            public final String toString() {
                return "Icon(icon=" + this.a + ", tint=" + this.b + ", background=null)";
            }
        }

        /* compiled from: InteropAvatar.kt */
        public static final class c implements b {
            public final rlw a;
            public final ContentScale b;
            public final ipi c;

            public c(rlw rlwVar, ContentScale contentScale, b8g b8gVar, int i) {
                contentScale = (i & 4) != 0 ? ContentScale.Fit : contentScale;
                b8gVar = (i & 8) != 0 ? null : b8gVar;
                this.a = rlwVar;
                this.b = contentScale;
                this.c = b8gVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
                ipi ipiVar = this.c;
                return hashCode + (ipiVar == null ? 0 : ipiVar.hashCode());
            }

            public final String toString() {
                return "Image(image=" + this.a + ", colorFilter=null, contentScale=" + this.b + ", background=" + this.c + ')';
            }
        }

        /* compiled from: InteropAvatar.kt */
        public static final class d implements b {
            public static final d a = new d();
        }

        /* compiled from: InteropAvatar.kt */
        public static final class e implements b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                ((e) obj).getClass();
                Object obj2 = tnx.a;
                return obj2.equals(obj2);
            }

            public final int hashCode() {
                return (tnx.a.hashCode() + 84971) * 31;
            }

            public final String toString() {
                return "Text(text=VK, profileType=" + tnx.a + ", background=null)";
            }
        }
    }

    /* compiled from: InteropAvatar.kt */
    public interface c {

        /* compiled from: InteropAvatar.kt */
        public static final class a implements c {
            public final gko a;
            public final ipi b;

            public a(gko gkoVar, ipi ipiVar) {
                this.a = gkoVar;
                this.b = ipiVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
            }

            public final String toString() {
                return "Dark(icon=" + this.a + ", tint=" + this.b + ')';
            }
        }
    }

    public snx() {
        throw null;
    }

    public snx(b bVar) {
        EmptyList emptyList = EmptyList.b;
        this.a = bVar;
        this.b = emptyList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snx)) {
            return false;
        }
        snx snxVar = (snx) obj;
        return epx.f(this.a, snxVar.a) && epx.f(this.b, snxVar.b);
    }

    public final int hashCode() {
        return fw3.a(this.a.hashCode() * 31, 961, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteropAvatar(content=");
        sb.append(this.a);
        sb.append(", badges=");
        return vp.b(", border=null, overlay=null)", sb, this.b);
    }
}
