package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes.dex */
public final class i44 extends c3f.d {
    public final List a;
    public final String b;

    public i44(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // c3f.d
    public final List a() {
        return this.a;
    }

    @Override // c3f.d
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.d)) {
            return false;
        }
        c3f.d dVar = (c3f.d) obj;
        if (!this.a.equals(dVar.a())) {
            return false;
        }
        String str = this.b;
        return str == null ? dVar.b() == null : str.equals(dVar.b());
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return oyr.t(sb, this.b, "}");
    }
}
