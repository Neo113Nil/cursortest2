package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes.dex */
public final class c44 extends c3f.a {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;

    public c44(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = list;
    }

    @Override // c3f.a
    public final List a() {
        return this.i;
    }

    @Override // c3f.a
    public final int b() {
        return this.d;
    }

    @Override // c3f.a
    public final int c() {
        return this.a;
    }

    @Override // c3f.a
    public final String d() {
        return this.b;
    }

    @Override // c3f.a
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.a)) {
            return false;
        }
        c3f.a aVar = (c3f.a) obj;
        if (this.a != aVar.c() || !this.b.equals(aVar.d()) || this.c != aVar.f() || this.d != aVar.b() || this.e != aVar.e() || this.f != aVar.g() || this.g != aVar.h()) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (aVar.i() != null) {
                return false;
            }
        } else if (!str.equals(aVar.i())) {
            return false;
        }
        List list = this.i;
        return list == null ? aVar.a() == null : list.equals(aVar.a());
    }

    @Override // c3f.a
    public final int f() {
        return this.c;
    }

    @Override // c3f.a
    public final long g() {
        return this.f;
    }

    @Override // c3f.a
    public final long h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        int hashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // c3f.a
    public final String i() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.a);
        sb.append(", processName=");
        sb.append(this.b);
        sb.append(", reasonCode=");
        sb.append(this.c);
        sb.append(", importance=");
        sb.append(this.d);
        sb.append(", pss=");
        sb.append(this.e);
        sb.append(", rss=");
        sb.append(this.f);
        sb.append(", timestamp=");
        sb.append(this.g);
        sb.append(", traceFile=");
        sb.append(this.h);
        sb.append(", buildIdMappingForArch=");
        return ly3.s(sb, this.i, "}");
    }
}
