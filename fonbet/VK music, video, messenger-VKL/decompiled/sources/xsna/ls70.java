package xsna;

import java.util.List;

/* compiled from: ObtainVerificationScreenData.kt */
/* loaded from: classes18.dex */
public final class ls70 {
    public final d a;
    public final b b;
    public final String c;
    public final String d;
    public final List<a> e;
    public final c f;

    /* compiled from: ObtainVerificationScreenData.kt */
    public static final class a {
        public final boolean a;
        public final String b;
        public final String c;

        public a(boolean z, String str, String str2) {
            this.a = z;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Condition(isCompleted=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", name=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ObtainVerificationScreenData.kt */
    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoreInfoButtonData(text=");
            sb.append(this.a);
            sb.append(", link=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: ObtainVerificationScreenData.kt */
    public static final class c {
        public final String a;
        public final boolean b;

        public c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ObtainVerificationButtonData(text=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ObtainVerificationScreenData.kt */
    public static final class d {
        public final String a;
        public final String b;

        public d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ObtainVerificationScreenImage(light=");
            sb.append(this.a);
            sb.append(", dark=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public ls70(d dVar, b bVar, String str, String str2, List<a> list, c cVar) {
        this.a = dVar;
        this.b = bVar;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls70)) {
            return false;
        }
        ls70 ls70Var = (ls70) obj;
        return epx.f(this.a, ls70Var.a) && epx.f(this.b, ls70Var.b) && epx.f(this.c, ls70Var.c) && epx.f(this.d, ls70Var.d) && epx.f(this.e, ls70Var.e) && epx.f(this.f, ls70Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + fw3.a(urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "ObtainVerificationScreenData(image=" + this.a + ", info=" + this.b + ", title=" + this.c + ", description=" + this.d + ", conditions=" + this.e + ", button=" + this.f + ')';
    }
}
