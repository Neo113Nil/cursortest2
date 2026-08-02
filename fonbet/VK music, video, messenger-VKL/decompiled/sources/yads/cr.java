package yads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes10.dex */
public final class cr {
    public final sq0 a;
    public nq0 b;
    public ld0 c;

    public cr(sq0 sq0Var) {
        this.a = sq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r7.b != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        r13 = new java.lang.StringBuilder("None of the available extractors (");
        r14 = yads.mc3.a;
        r14 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        if (r12 >= r8.length) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        r14.append(r8[r12].getClass().getSimpleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r12 >= (r8.length - 1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        r14.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r13.append(r14.toString());
        r13.append(") could read the stream.");
        r8 = r13.toString();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        throw new yads.ob3(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(p30 p30Var, Uri uri, Map map, long j, long j2, qq0 qq0Var) {
        ld0 ld0Var = new ld0(p30Var, j, j2);
        this.c = ld0Var;
        if (this.b != null) {
            return;
        }
        nq0[] createExtractors = this.a.createExtractors(uri, map);
        int i = 0;
        if (createExtractors.length != 1) {
            int length = createExtractors.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                nq0 nq0Var = createExtractors[i2];
                try {
                } catch (EOFException unused) {
                    if (this.b != null) {
                        continue;
                    } else if (ld0Var.d != j) {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    if (this.b == null && ld0Var.d != j) {
                        throw new IllegalStateException();
                    }
                    ld0Var.f = 0;
                    throw th;
                }
                if (nq0Var.a(ld0Var)) {
                    this.b = nq0Var;
                    ld0Var.f = 0;
                    break;
                } else {
                    if (this.b == null && ld0Var.d != j) {
                        throw new IllegalStateException();
                    }
                    ld0Var.f = 0;
                    i2++;
                }
            }
        } else {
            this.b = createExtractors[0];
        }
        this.b.a(qq0Var);
    }
}
