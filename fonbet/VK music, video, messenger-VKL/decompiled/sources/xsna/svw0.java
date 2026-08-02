package xsna;

import com.vk.voip.dto.profiles.VoipSex;

/* compiled from: VoipProfileUser.kt */
/* loaded from: classes7.dex */
public final class svw0 implements qvw0 {
    public final String a;
    public final sew0 b;
    public final VoipSex c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;

    public /* synthetic */ svw0(String str, sew0 sew0Var, VoipSex voipSex, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, String str3, String str4, boolean z6) {
        this(str, sew0Var, voipSex, z, z2, false, z3, z4, z5, str2, str3, str4, z6, null);
    }

    @Override // xsna.qvw0
    public final String a() {
        return this.q;
    }

    @Override // xsna.qvw0
    public final VoipSex b() {
        return this.c;
    }

    @Override // xsna.qvw0
    public final String c() {
        return this.n;
    }

    @Override // xsna.qvw0
    public final String d() {
        return this.o;
    }

    @Override // xsna.qvw0
    public final String e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svw0)) {
            return false;
        }
        svw0 svw0Var = (svw0) obj;
        return epx.f(this.a, svw0Var.a) && epx.f(this.b, svw0Var.b) && this.c == svw0Var.c && this.d == svw0Var.d && this.e == svw0Var.e && this.f == svw0Var.f && this.g == svw0Var.g && this.h == svw0Var.h && this.i == svw0Var.i && epx.f(this.j, svw0Var.j) && epx.f(this.k, svw0Var.k) && epx.f(this.l, svw0Var.l) && this.m == svw0Var.m && epx.f(this.n, svw0Var.n);
    }

    @Override // xsna.qvw0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(urd0.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str = this.n;
        return b + (str == null ? 0 : str.hashCode());
    }

    @Override // xsna.qvw0
    public final sew0 i() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipProfileUser(id=");
        sb.append(this.a);
        sb.append(", avatar=");
        sb.append(this.b);
        sb.append(", sex=");
        sb.append(this.c);
        sb.append(", isVerified=");
        sb.append(this.d);
        sb.append(", isFriend=");
        sb.append(this.e);
        sb.append(", isAnonym=");
        sb.append(this.f);
        sb.append(", isDeleted=");
        sb.append(this.g);
        sb.append(", isClosed=");
        sb.append(this.h);
        sb.append(", canCall=");
        sb.append(this.i);
        sb.append(", firstName=");
        sb.append(this.j);
        sb.append(", lastName=");
        sb.append(this.k);
        sb.append(", contactName=");
        sb.append(this.l);
        sb.append(", useContactName=");
        sb.append(this.m);
        sb.append(", changedName=");
        return ho8.a(sb, this.n, ')');
    }

    public svw0(String str, sew0 sew0Var, VoipSex voipSex, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, String str4, boolean z7, String str5) {
        this.a = str;
        this.b = sew0Var;
        this.c = voipSex;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = z7;
        this.n = str5;
        if (z7 && str4.length() > 0) {
            str2 = str4;
        }
        this.o = str2;
        if (z7 && str4.length() > 0) {
            str3 = "";
        }
        this.p = str3;
        this.q = v1v.a(' ', str2, str3);
    }
}
