package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes.dex */
public final class f54 extends c3f.e.d.a.b.AbstractC0020e {
    public final String a;
    public final int b;
    public final List c;

    public f54(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    @Override // c3f.e.d.a.b.AbstractC0020e
    public final List a() {
        return this.c;
    }

    @Override // c3f.e.d.a.b.AbstractC0020e
    public final int b() {
        return this.b;
    }

    @Override // c3f.e.d.a.b.AbstractC0020e
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d.a.b.AbstractC0020e)) {
            return false;
        }
        c3f.e.d.a.b.AbstractC0020e abstractC0020e = (c3f.e.d.a.b.AbstractC0020e) obj;
        return this.a.equals(abstractC0020e.c()) && this.b == abstractC0020e.b() && this.c.equals(abstractC0020e.a());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.a);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        return ly3.s(sb, this.c, "}");
    }
}
