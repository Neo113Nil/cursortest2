package xsna;

import java.util.ArrayList;

/* compiled from: VoipSelectVideoTabPatch.kt */
/* loaded from: classes7.dex */
public abstract class z0x0 implements xl50 {

    /* compiled from: VoipSelectVideoTabPatch.kt */
    public static abstract class a extends z0x0 {

        /* compiled from: VoipSelectVideoTabPatch.kt */
        /* renamed from: xsna.z0x0$a$a, reason: collision with other inner class name */
        public static final class C4148a extends a {
            public final Throwable b;

            public C4148a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4148a) && epx.f(this.b, ((C4148a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VoipSelectVideoTabPatch.kt */
        public static final class b extends a {
            public final String b;
            public final ArrayList c;
            public final int d;

            public b(String str, ArrayList arrayList, int i) {
                this.b = str;
                this.c = arrayList;
                this.d = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
            }

            public final int hashCode() {
                String str = this.b;
                return Integer.hashCode(this.d) + qr.a(this.c, (str == null ? 0 : str.hashCode()) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(nextFrom=");
                sb.append(this.b);
                sb.append(", items=");
                sb.append(this.c);
                sb.append(", count=");
                return vu5.b(sb, this.d, ')');
            }
        }

        /* compiled from: VoipSelectVideoTabPatch.kt */
        public static final class c extends a {
            public static final c b = new c();
        }
    }

    /* compiled from: VoipSelectVideoTabPatch.kt */
    public static abstract class b extends z0x0 {

        /* compiled from: VoipSelectVideoTabPatch.kt */
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

        /* compiled from: VoipSelectVideoTabPatch.kt */
        /* renamed from: xsna.z0x0$b$b, reason: collision with other inner class name */
        public static final class C4149b extends b {
            public final String b;
            public final ArrayList c;
            public final int d;

            public C4149b(String str, ArrayList arrayList, int i) {
                this.b = str;
                this.c = arrayList;
                this.d = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4149b)) {
                    return false;
                }
                C4149b c4149b = (C4149b) obj;
                return epx.f(this.b, c4149b.b) && epx.f(this.c, c4149b.c) && this.d == c4149b.d;
            }

            public final int hashCode() {
                String str = this.b;
                return Integer.hashCode(this.d) + qr.a(this.c, (str == null ? 0 : str.hashCode()) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(nextFrom=");
                sb.append(this.b);
                sb.append(", items=");
                sb.append(this.c);
                sb.append(", count=");
                return vu5.b(sb, this.d, ')');
            }
        }

        /* compiled from: VoipSelectVideoTabPatch.kt */
        public static final class c extends b {
            public static final c b = new c();
        }
    }

    /* compiled from: VoipSelectVideoTabPatch.kt */
    public static abstract class c extends z0x0 {

        /* compiled from: VoipSelectVideoTabPatch.kt */
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

        /* compiled from: VoipSelectVideoTabPatch.kt */
        public static final class b extends c {
            public final String b;
            public final ArrayList c;
            public final int d;

            public b(String str, ArrayList arrayList, int i) {
                this.b = str;
                this.c = arrayList;
                this.d = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
            }

            public final int hashCode() {
                String str = this.b;
                return Integer.hashCode(this.d) + qr.a(this.c, (str == null ? 0 : str.hashCode()) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(nextFrom=");
                sb.append(this.b);
                sb.append(", items=");
                sb.append(this.c);
                sb.append(", count=");
                return vu5.b(sb, this.d, ')');
            }
        }

        /* compiled from: VoipSelectVideoTabPatch.kt */
        /* renamed from: xsna.z0x0$c$c, reason: collision with other inner class name */
        public static final class C4150c extends c {
            public static final C4150c b = new C4150c();
        }
    }
}
