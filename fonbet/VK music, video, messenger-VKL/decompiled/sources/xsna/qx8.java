package xsna;

import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.io.File;

/* compiled from: CacheSpan.java */
/* loaded from: classes.dex */
public class qx8 implements Comparable<qx8> {
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;

    @Nullable
    public final File f;
    public final long g;

    public qx8(String str, long j, long j2, long j3, @Nullable File file) {
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = file != null;
        this.f = file;
        this.g = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(qx8 qx8Var) {
        String str = qx8Var.b;
        String str2 = this.b;
        if (!str2.equals(str)) {
            return str2.compareTo(qx8Var.b);
        }
        long j = this.c - qx8Var.c;
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
