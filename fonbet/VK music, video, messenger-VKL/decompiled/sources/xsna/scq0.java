package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: UploadStatus.kt */
/* loaded from: classes8.dex */
public final class scq0 {
    public final b9r a;
    public final int b;
    public final ArrayList c = new ArrayList();

    public scq0(b9r b9rVar, int i) {
        this.a = b9rVar;
        this.b = i;
    }

    public final void a(int i, bcc bccVar) {
        long j = bccVar.b;
        long j2 = bccVar.a;
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bcc bccVar2 = (bcc) it.next();
            long j3 = bccVar2.a;
            long j4 = bccVar2.b;
            long j5 = (j3 + j4) - 1;
            if (j3 > j2 || j2 > j5) {
                long j6 = (j3 + j4) - 1;
                long j7 = (j2 + j) - 1;
                if (j3 > j7 || j7 > j6) {
                }
            }
            long j8 = bccVar2.a;
            StringBuilder b = fp.b(j2, "Chunks intersect (", "-");
            b.append(j);
            tj0.d(b, "), (", j8, "-");
            throw new IllegalStateException(efz.b(j4, ")", b));
        }
        arrayList.add(i, bccVar);
    }

    public final long b() {
        Iterator it = this.c.iterator();
        long j = 0;
        while (it.hasNext()) {
            bcc bccVar = (bcc) it.next();
            long j2 = bccVar.b;
            if (j2 != bccVar.c || !bccVar.d) {
                j2 = 0;
            }
            j += j2;
        }
        return j;
    }

    public final String toString() {
        StringBuilder e = fw3.e("(");
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bcc bccVar = (bcc) it.next();
            if (e.length() > 1) {
                e.append(StringUtils.COMMA);
            }
            e.append(bccVar.a);
            e.append("-");
            e.append((bccVar.a + bccVar.b) - 1);
        }
        e.append(")");
        return e.toString();
    }
}
