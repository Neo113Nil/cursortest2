package defpackage;

import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public class lc7 implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean w;
    public final File x;
    public final long y;

    public lc7(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.w = file != null;
        this.x = file;
        this.y = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(lc7 lc7Var) {
        String str = lc7Var.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(lc7Var.a);
        }
        long j = this.b - lc7Var.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append(Extension.FIX_SPACE);
        return oyr.n(this.c, "]", sb);
    }
}
