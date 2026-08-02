package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes.dex */
public final class m44 extends c3f.e {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final c3f.e.a g;
    public final c3f.e.f h;
    public final c3f.e.AbstractC0027e i;
    public final c3f.e.c j;
    public final List k;
    public final int l;

    public m44(String str, String str2, String str3, long j, Long l, boolean z, c3f.e.a aVar, c3f.e.f fVar, c3f.e.AbstractC0027e abstractC0027e, c3f.e.c cVar, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = aVar;
        this.h = fVar;
        this.i = abstractC0027e;
        this.j = cVar;
        this.k = list;
        this.l = i;
    }

    @Override // c3f.e
    public final c3f.e.a a() {
        return this.g;
    }

    @Override // c3f.e
    public final String b() {
        return this.c;
    }

    @Override // c3f.e
    public final c3f.e.c c() {
        return this.j;
    }

    @Override // c3f.e
    public final Long d() {
        return this.e;
    }

    @Override // c3f.e
    public final List e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e)) {
            return false;
        }
        c3f.e eVar = (c3f.e) obj;
        if (!this.a.equals(eVar.f()) || !this.b.equals(eVar.h())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (eVar.b() != null) {
                return false;
            }
        } else if (!str.equals(eVar.b())) {
            return false;
        }
        if (this.d != eVar.j()) {
            return false;
        }
        Long l = this.e;
        if (l == null) {
            if (eVar.d() != null) {
                return false;
            }
        } else if (!l.equals(eVar.d())) {
            return false;
        }
        if (this.f != eVar.l() || !this.g.equals(eVar.a())) {
            return false;
        }
        c3f.e.f fVar = this.h;
        if (fVar == null) {
            if (eVar.k() != null) {
                return false;
            }
        } else if (!fVar.equals(eVar.k())) {
            return false;
        }
        c3f.e.AbstractC0027e abstractC0027e = this.i;
        if (abstractC0027e == null) {
            if (eVar.i() != null) {
                return false;
            }
        } else if (!abstractC0027e.equals(eVar.i())) {
            return false;
        }
        c3f.e.c cVar = this.j;
        if (cVar == null) {
            if (eVar.c() != null) {
                return false;
            }
        } else if (!cVar.equals(eVar.c())) {
            return false;
        }
        List list = this.k;
        if (list == null) {
            if (eVar.e() != null) {
                return false;
            }
        } else if (!list.equals(eVar.e())) {
            return false;
        }
        return this.l == eVar.g();
    }

    @Override // c3f.e
    public final String f() {
        return this.a;
    }

    @Override // c3f.e
    public final int g() {
        return this.l;
    }

    @Override // c3f.e
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        c3f.e.f fVar = this.h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        c3f.e.AbstractC0027e abstractC0027e = this.i;
        int hashCode5 = (hashCode4 ^ (abstractC0027e == null ? 0 : abstractC0027e.hashCode())) * 1000003;
        c3f.e.c cVar = this.j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list = this.k;
        return this.l ^ ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    @Override // c3f.e
    public final c3f.e.AbstractC0027e i() {
        return this.i;
    }

    @Override // c3f.e
    public final long j() {
        return this.d;
    }

    @Override // c3f.e
    public final c3f.e.f k() {
        return this.h;
    }

    @Override // c3f.e
    public final boolean l() {
        return this.f;
    }

    @Override // c3f.e
    public final l44 m() {
        l44 l44Var = new l44();
        l44Var.a = this.a;
        l44Var.b = this.b;
        l44Var.c = this.c;
        l44Var.d = this.d;
        l44Var.e = this.e;
        l44Var.f = this.f;
        l44Var.g = this.g;
        l44Var.h = this.h;
        l44Var.i = this.i;
        l44Var.j = this.j;
        l44Var.k = this.k;
        l44Var.l = this.l;
        l44Var.m = (byte) 7;
        return l44Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return oyr.m(this.l, "}", sb);
    }
}
