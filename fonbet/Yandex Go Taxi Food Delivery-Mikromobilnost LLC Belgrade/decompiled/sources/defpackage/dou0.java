package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class dou0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public dou0(String str, int i, String str2, int i2, int i3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dou0)) {
            return false;
        }
        dou0 dou0Var = (dou0) obj;
        return jl40.l(this.a, dou0Var.a) && jl40.l(this.b, dou0Var.b) && this.c == dou0Var.c && this.d == dou0Var.d && this.e == dou0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + oyr.b(this.d, oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("StoryAnalyticsData(screenName=", this.a, ", currentStoryId=", this.b, ", storyPosition=");
        vfc.u(this.c, this.d, ", pageCount=", ", pagePosition=", v);
        return oyr.m(this.e, Extension.C_BRAKE, v);
    }
}
