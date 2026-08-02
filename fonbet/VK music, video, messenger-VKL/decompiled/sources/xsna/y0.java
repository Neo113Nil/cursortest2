package xsna;

import androidx.credentials.provider.CredentialEntry;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AboutAppContent.kt */
/* loaded from: classes6.dex */
public final class y0 {
    public final String a;
    public final String b;
    public final String c;
    public final List<z3> d;
    public final boolean e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final String k;
    public final String l;

    public y0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return epx.f(this.a, y0Var.a) && epx.f(this.b, y0Var.b) && epx.f(this.c, y0Var.c) && epx.f(this.d, y0Var.d) && this.e == y0Var.e && this.f == y0Var.f && epx.f(this.g, y0Var.g) && epx.f(this.h, y0Var.h) && epx.f(this.i, y0Var.i) && this.j == y0Var.j && epx.f(this.k, y0Var.k) && epx.f(this.l, y0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + urd0.a(qoy.b(urd0.a(urd0.a(urd0.a(bh10.a(qoy.b(fw3.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AboutAppContent(title=");
        sb.append(this.a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", screenshots=");
        sb.append(this.d);
        sb.append(", hasCommunity=");
        sb.append(this.e);
        sb.append(", communityId=");
        sb.append(this.f);
        sb.append(", communityAvatar=");
        sb.append(this.g);
        sb.append(", communityTitle=");
        sb.append(this.h);
        sb.append(", communityDescription=");
        sb.append(this.i);
        sb.append(", communityIsVerified=");
        sb.append(this.j);
        sb.append(", privacyPolicy=");
        sb.append(this.k);
        sb.append(", terms=");
        return ho8.a(sb, this.l, ')');
    }

    public y0(String str, String str2, String str3, List<z3> list, boolean z, long j, String str4, String str5, String str6, boolean z2, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
        this.f = j;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = z2;
        this.k = str7;
        this.l = str8;
    }

    public y0(int i) {
        this("", "", "", EmptyList.b, false, 0L, CredentialEntry.FALSE_STRING, "", "", false, "", "");
    }
}
