package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class j54 extends c3f.e.d.a.c {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public j54(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // c3f.e.d.a.c
    public final int a() {
        return this.c;
    }

    @Override // c3f.e.d.a.c
    public final int b() {
        return this.b;
    }

    @Override // c3f.e.d.a.c
    public final String c() {
        return this.a;
    }

    @Override // c3f.e.d.a.c
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d.a.c)) {
            return false;
        }
        c3f.e.d.a.c cVar = (c3f.e.d.a.c) obj;
        return this.a.equals(cVar.c()) && this.b == cVar.b() && this.c == cVar.a() && this.d == cVar.d();
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", defaultProcess=");
        return x4e.i(sb, this.d, "}");
    }
}
