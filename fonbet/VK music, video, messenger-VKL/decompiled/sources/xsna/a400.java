package xsna;

import xsna.v400;

/* compiled from: LongPollCredentials.kt */
/* loaded from: classes2.dex */
public interface a400 {

    /* compiled from: LongPollCredentials.kt */
    public static final class a implements a400 {
        @Override // xsna.a400
        public final v400 a() {
            return null;
        }

        @Override // xsna.a400
        public final boolean b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* compiled from: LongPollCredentials.kt */
    public static final class b implements a400 {
        public final v400.b a;
        public final String b;
        public final String c;
        public final boolean d;

        public b(v400.b bVar, String str, String str2, boolean z) {
            this.a = bVar;
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public static b c(b bVar, v400.b bVar2) {
            String str = bVar.b;
            String str2 = bVar.c;
            boolean z = bVar.d;
            bVar.getClass();
            return new b(bVar2, str, str2, z);
        }

        @Override // xsna.a400
        public final v400 a() {
            return this.a;
        }

        @Override // xsna.a400
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
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessagesLongPollCredentials(sync=");
            sb.append(this.a);
            sb.append(", key=");
            sb.append(this.b);
            sb.append(", server=");
            sb.append(this.c);
            sb.append(", lpServerUnavailable=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    v400 a();

    boolean b();
}
