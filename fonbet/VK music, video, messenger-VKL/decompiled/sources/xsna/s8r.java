package xsna;

import java.io.File;

/* compiled from: DebugFileManagerScreen.kt */
/* loaded from: classes17.dex */
public final class s8r {
    public final String a;
    public final boolean b;
    public final long c;
    public final File d;
    public final boolean e;

    public s8r(String str, boolean z, long j, File file, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = j;
        this.d = file;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8r)) {
            return false;
        }
        s8r s8rVar = (s8r) obj;
        return epx.f(this.a, s8rVar.a) && this.b == s8rVar.b && this.c == s8rVar.c && epx.f(this.d, s8rVar.d) && this.e == s8rVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + bh10.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileEntry(name=");
        sb.append(this.a);
        sb.append(", isDirectory=");
        sb.append(this.b);
        sb.append(", sizeBytes=");
        sb.append(this.c);
        sb.append(", file=");
        sb.append(this.d);
        sb.append(", isShareable=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
