package xsna;

import java.util.List;

/* compiled from: GroupVerificationData.kt */
/* loaded from: classes18.dex */
public final class rmu {
    public final List<a> a;
    public final String b;
    public final String c;

    /* compiled from: GroupVerificationData.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;
        public final boolean g;

        public a(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = z;
            this.g = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupVerificationType(id=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", description=");
            sb.append(this.c);
            sb.append(", imageUrlLight=");
            sb.append(this.d);
            sb.append(", imageUrlDark=");
            sb.append(this.e);
            sb.append(", isWarning=");
            sb.append(this.f);
            sb.append(", isCompleted=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    public rmu(List<a> list, String str, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmu)) {
            return false;
        }
        rmu rmuVar = (rmu) obj;
        return epx.f(this.a, rmuVar.a) && epx.f(this.b, rmuVar.b) && epx.f(this.c, rmuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupVerificationData(types=");
        sb.append(this.a);
        sb.append(", infoLink=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.c, ')');
    }
}
