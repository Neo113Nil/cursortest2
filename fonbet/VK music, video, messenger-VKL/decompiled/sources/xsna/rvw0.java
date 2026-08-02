package xsna;

import com.vk.voip.dto.profiles.VoipSex;

/* compiled from: VoipProfileGroup.kt */
/* loaded from: classes7.dex */
public final class rvw0 implements qvw0 {
    public final String a;
    public final sew0 b;
    public final String c;
    public final boolean d;
    public final String f;
    public final String h;
    public final VoipSex e = VoipSex.UNKNOWN;
    public final String g = "";

    public rvw0(String str, sew0 sew0Var, String str2, boolean z) {
        this.a = str;
        this.b = sew0Var;
        this.c = str2;
        this.d = z;
        this.f = str2;
        this.h = str2;
    }

    @Override // xsna.qvw0
    public final String a() {
        return this.h;
    }

    @Override // xsna.qvw0
    public final VoipSex b() {
        return this.e;
    }

    @Override // xsna.qvw0
    public final String c() {
        return null;
    }

    @Override // xsna.qvw0
    public final String d() {
        return this.f;
    }

    @Override // xsna.qvw0
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvw0)) {
            return false;
        }
        rvw0 rvw0Var = (rvw0) obj;
        return epx.f(this.a, rvw0Var.a) && epx.f(this.b, rvw0Var.b) && epx.f(this.c, rvw0Var.c) && this.d == rvw0Var.d;
    }

    @Override // xsna.qvw0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    @Override // xsna.qvw0
    public final sew0 i() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipProfileGroup(id=");
        sb.append(this.a);
        sb.append(", avatar=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", isClosed=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
