package xsna;

import com.vk.dto.common.data.VKList;
import java.util.List;

/* compiled from: PastAsrListPatch.kt */
/* loaded from: classes7.dex */
public interface dn90 extends xl50 {

    /* compiled from: PastAsrListPatch.kt */
    public static abstract class a implements dn90 {

        /* compiled from: PastAsrListPatch.kt */
        /* renamed from: xsna.dn90$a$a, reason: collision with other inner class name */
        public static final class C2742a extends a {
            public final Throwable b;

            public C2742a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2742a) && epx.f(this.b, ((C2742a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: PastAsrListPatch.kt */
        public static final class b extends a {
            public final List<ev3> b;
            public final int c;
            public final boolean d;

            public b(int i, VKList vKList, boolean z) {
                this.b = vKList;
                this.c = i;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(asrItems=");
                sb.append(this.b);
                sb.append(", nextFrom=");
                sb.append(this.c);
                sb.append(", hasMore=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: PastAsrListPatch.kt */
        public static final class c extends a {
            public static final c b = new c();
        }
    }

    /* compiled from: PastAsrListPatch.kt */
    public static abstract class b implements dn90 {

        /* compiled from: PastAsrListPatch.kt */
        public static final class a extends b {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: PastAsrListPatch.kt */
        /* renamed from: xsna.dn90$b$b, reason: collision with other inner class name */
        public static final class C2743b extends b {
            public final List<ev3> b;
            public final int c;
            public final boolean d;

            public C2743b(int i, VKList vKList, boolean z) {
                this.b = vKList;
                this.c = i;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2743b)) {
                    return false;
                }
                C2743b c2743b = (C2743b) obj;
                return epx.f(this.b, c2743b.b) && this.c == c2743b.c && this.d == c2743b.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(asrItems=");
                sb.append(this.b);
                sb.append(", nextFrom=");
                sb.append(this.c);
                sb.append(", hasMore=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: PastAsrListPatch.kt */
        public static final class c extends b {
            public static final c b = new c();
        }
    }

    /* compiled from: PastAsrListPatch.kt */
    public static abstract class c implements dn90 {

        /* compiled from: PastAsrListPatch.kt */
        public static final class a extends c {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: PastAsrListPatch.kt */
        public static final class b extends c {
            public final List<ev3> b;
            public final int c;
            public final boolean d;

            public b(int i, VKList vKList, boolean z) {
                this.b = vKList;
                this.c = i;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(asrItems=");
                sb.append(this.b);
                sb.append(", nextFrom=");
                sb.append(this.c);
                sb.append(", hasMore=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: PastAsrListPatch.kt */
        /* renamed from: xsna.dn90$c$c, reason: collision with other inner class name */
        public static final class C2744c extends c {
            public static final C2744c b = new C2744c();
        }
    }

    /* compiled from: PastAsrListPatch.kt */
    public static final class d implements dn90 {
        public final ev3 b;

        public d(ev3 ev3Var) {
            this.b = ev3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RemoveSingeItem(item=" + this.b + ')';
        }
    }
}
