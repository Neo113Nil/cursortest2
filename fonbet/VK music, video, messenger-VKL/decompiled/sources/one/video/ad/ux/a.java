package one.video.ad.ux;

import xsna.epx;
import xsna.iq;
import xsna.n6j;
import xsna.urd0;
import xsna.xe9;

/* compiled from: ShoppableAdProduct.kt */
/* loaded from: classes8.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final C2169a e;
    public final String f;

    /* compiled from: ShoppableAdProduct.kt */
    /* renamed from: one.video.ad.ux.a$a, reason: collision with other inner class name */
    public static final class C2169a {
        public final String a;
        public final int b;

        public C2169a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2169a)) {
                return false;
            }
            C2169a c2169a = (C2169a) obj;
            return epx.f(this.a, c2169a.a) && this.b == c2169a.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return iq.a(this.b, "Label(text=", this.a, ", colorRes=", ")");
        }
    }

    public a(String str, String str2, String str3, String str4, C2169a c2169a, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = c2169a;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        C2169a c2169a = this.e;
        return this.f.hashCode() + ((hashCode + (c2169a != null ? c2169a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder a = xe9.a("ShoppableAdProduct(id=", this.a, ", link=", this.b, ", pictureUrl=");
        n6j.b(a, this.c, ", price=", this.d, ", label=");
        a.append(this.e);
        a.append(", title=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
