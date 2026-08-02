package yads;

import com.ironsource.X3;
import java.io.File;
import xsna.efz;

/* loaded from: classes10.dex */
public abstract class zr implements Comparable {
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final File f;
    public final long g;

    public zr(String str, long j, long j2, long j3, File file) {
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = file != null;
        this.f = file;
        this.g = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zr zrVar = (zr) obj;
        if (!this.b.equals(zrVar.b)) {
            return this.b.compareTo(zrVar.b);
        }
        long j = this.c - zrVar.c;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(this.c);
        sb.append(", ");
        return efz.b(this.d, X3.j.e, sb);
    }
}
