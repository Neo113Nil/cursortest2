package defpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes15.dex */
public final class lyq {
    public final cyj a;
    public final String b;

    public lyq(cyj cyjVar, String str) {
        this.a = cyjVar;
        this.b = str;
    }

    public final long a() {
        uxj b = b();
        if (b == null) {
            return 0L;
        }
        try {
            long j = ((long[]) b.c)[0];
            b.close();
            return j;
        } finally {
        }
    }

    public final uxj b() {
        InputStream inputStream;
        cyj cyjVar = this.a;
        String str = this.b;
        synchronized (cyjVar) {
            if (cyjVar.B == null) {
                throw new IllegalStateException("cache is closed");
            }
            qxj qxjVar = (qxj) cyjVar.C.get(str);
            if (qxjVar == null) {
                return null;
            }
            if (!qxjVar.c) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[cyjVar.z];
            for (int i = 0; i < cyjVar.z; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(qxjVar.a(i));
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < cyjVar.z && (inputStream = inputStreamArr[i2]) != null; i2++) {
                        Charset charset = sw21.a;
                        try {
                            inputStream.close();
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                }
            }
            cyjVar.D++;
            cyjVar.B.append((CharSequence) ("READ " + str + '\n'));
            if (cyjVar.d()) {
                cyjVar.F.submit(cyjVar.G);
            }
            return new uxj(inputStreamArr, qxjVar.b);
        }
    }

    public final boolean equals(Object obj) {
        lyq lyqVar = obj instanceof lyq ? (lyq) obj : null;
        return this.b.equals(lyqVar != null ? lyqVar.b : null);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
