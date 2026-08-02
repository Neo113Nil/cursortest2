package xsna;

import xsna.wzj;

/* compiled from: PlaylistHeaderData.kt */
/* loaded from: classes3.dex */
public final class h9b0 {
    public final wzj a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ h9b0() {
        this(wzj.b.a.a, "", false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9b0)) {
            return false;
        }
        h9b0 h9b0Var = (h9b0) obj;
        return epx.f(this.a, h9b0Var.a) && epx.f(this.b, h9b0Var.b) && this.c == h9b0Var.c && this.d == h9b0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistHeaderData(cover=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isCurator=");
        sb.append(this.c);
        sb.append(", isExplicit=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public h9b0(wzj wzjVar, String str, boolean z, boolean z2) {
        this.a = wzjVar;
        this.b = str;
        this.c = z;
        this.d = z2;
    }
}
