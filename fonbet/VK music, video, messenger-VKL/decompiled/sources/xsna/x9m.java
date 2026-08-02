package xsna;

import java.util.List;

/* compiled from: DialogAppearanceModel.kt */
/* loaded from: classes2.dex */
public final class x9m {
    public final String a;
    public final long b;
    public final a c;
    public final a d;
    public final boolean e;
    public final int f;

    /* compiled from: DialogAppearanceModel.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final C3987a g;

        /* compiled from: DialogAppearanceModel.kt */
        /* renamed from: xsna.x9m$a$a, reason: collision with other inner class name */
        public static final class C3987a {
            public final List<String> a;
            public final int b;

            public C3987a(List<String> list, int i) {
                this.a = list;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3987a)) {
                    return false;
                }
                C3987a c3987a = (C3987a) obj;
                return epx.f(this.a, c3987a.a) && this.b == c3987a.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DialogAppearanceGradient(colors=");
                sb.append(this.a);
                sb.append(", angle=");
                return vu5.b(sb, this.b, ')');
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, C3987a c3987a) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = c3987a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return this.g.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "DialogAppearanceShade(accentColor=" + this.a + ", headerTint=" + this.b + ", writeBarTint=" + this.c + ", textPrimary=" + this.d + ", textPlaceholder=" + this.e + ", forwardLine=" + this.f + ", bubbleGradient=" + this.g + ')';
        }
    }

    public x9m(String str, long j, a aVar, a aVar2, boolean z, int i) {
        this.a = str;
        this.b = j;
        this.c = aVar;
        this.d = aVar2;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9m)) {
            return false;
        }
        x9m x9mVar = (x9m) obj;
        return epx.f(this.a, x9mVar.a) && this.b == x9mVar.b && epx.f(this.c, x9mVar.c) && epx.f(this.d, x9mVar.d) && this.e == x9mVar.e && this.f == x9mVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + qoy.b((this.d.hashCode() + ((this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogAppearanceModel(name=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        sb.append(", light=");
        sb.append(this.c);
        sb.append(", dark=");
        sb.append(this.d);
        sb.append(", isHidden=");
        sb.append(this.e);
        sb.append(", sort=");
        return vu5.b(sb, this.f, ')');
    }
}
