package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes.dex */
public final class b54 extends c3f.e.d.a.b.c {
    public final String a;
    public final String b;
    public final List c;
    public final c3f.e.d.a.b.c d;
    public final int e;

    public b54(String str, String str2, List list, c3f.e.d.a.b.c cVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = cVar;
        this.e = i;
    }

    @Override // c3f.e.d.a.b.c
    public final c3f.e.d.a.b.c a() {
        return this.d;
    }

    @Override // c3f.e.d.a.b.c
    public final List b() {
        return this.c;
    }

    @Override // c3f.e.d.a.b.c
    public final int c() {
        return this.e;
    }

    @Override // c3f.e.d.a.b.c
    public final String d() {
        return this.b;
    }

    @Override // c3f.e.d.a.b.c
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d.a.b.c)) {
            return false;
        }
        c3f.e.d.a.b.c cVar = (c3f.e.d.a.b.c) obj;
        if (!this.a.equals(cVar.e())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (cVar.d() != null) {
                return false;
            }
        } else if (!str.equals(cVar.d())) {
            return false;
        }
        if (!this.c.equals(cVar.b())) {
            return false;
        }
        c3f.e.d.a.b.c cVar2 = this.d;
        if (cVar2 == null) {
            if (cVar.a() != null) {
                return false;
            }
        } else if (!cVar2.equals(cVar.a())) {
            return false;
        }
        return this.e == cVar.c();
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        c3f.e.d.a.b.c cVar = this.d;
        return this.e ^ ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return oyr.m(this.e, "}", sb);
    }
}
