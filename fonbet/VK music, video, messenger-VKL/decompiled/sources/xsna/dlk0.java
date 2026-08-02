package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.elk0;
import xsna.fi20;
import xsna.glk0;

/* compiled from: SpliceInfoDecoder.java */
/* loaded from: classes12.dex */
public final class dlk0 extends b920 {
    public final xi90 c = new xi90();
    public final wi90 d = new wi90();
    public txo0 e;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r5 != r7) goto L14;
     */
    @Override // xsna.b920
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fi20 k(qi20 qi20Var, ByteBuffer byteBuffer) {
        fi20.a flk0Var;
        long j;
        xi90 xi90Var = this.c;
        wi90 wi90Var = this.d;
        txo0 txo0Var = this.e;
        if (txo0Var != null) {
            long j2 = qi20Var.j;
            synchronized (txo0Var) {
                long j3 = txo0Var.b;
            }
        }
        txo0 txo0Var2 = new txo0(qi20Var.g);
        this.e = txo0Var2;
        txo0Var2.a(qi20Var.g - qi20Var.j);
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        xi90Var.N(array, limit);
        wi90Var.l(array, limit);
        wi90Var.o(39);
        long g = (wi90Var.g(1) << 32) | wi90Var.g(32);
        wi90Var.o(20);
        int g2 = wi90Var.g(12);
        int g3 = wi90Var.g(8);
        xi90Var.Q(14);
        if (g3 == 0) {
            flk0Var = new flk0();
        } else if (g3 == 255) {
            long E = xi90Var.E();
            int i = g2 - 4;
            xi90Var.n(new byte[i], 0, i);
            flk0Var = new xfd0(E, g);
        } else if (g3 == 4) {
            int C = xi90Var.C();
            ArrayList arrayList = new ArrayList(C);
            for (int i2 = 0; i2 < C; i2++) {
                xi90Var.E();
                boolean z = (xi90Var.C() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int C2 = xi90Var.C();
                    boolean z2 = (C2 & 64) != 0;
                    boolean z3 = (C2 & 32) != 0;
                    if (z2) {
                        xi90Var.E();
                    }
                    if (!z2) {
                        int C3 = xi90Var.C();
                        ArrayList arrayList3 = new ArrayList(C3);
                        for (int i3 = 0; i3 < C3; i3++) {
                            xi90Var.C();
                            xi90Var.E();
                            arrayList3.add(new glk0.a());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        xi90Var.C();
                        xi90Var.E();
                    }
                    xi90Var.J();
                    xi90Var.C();
                    xi90Var.C();
                }
                arrayList.add(new glk0.b(arrayList2));
            }
            flk0Var = new glk0(arrayList);
        } else if (g3 == 5) {
            txo0 txo0Var3 = this.e;
            xi90Var.E();
            boolean z4 = (xi90Var.C() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = C.TIME_UNSET;
            } else {
                int C4 = xi90Var.C();
                boolean z5 = (C4 & 64) != 0;
                boolean z6 = (C4 & 32) != 0;
                boolean z7 = (C4 & 16) != 0;
                long d = (!z5 || z7) ? C.TIME_UNSET : ivo0.d(g, xi90Var);
                if (!z5) {
                    int C5 = xi90Var.C();
                    ArrayList arrayList4 = new ArrayList(C5);
                    for (int i4 = 0; i4 < C5; i4++) {
                        xi90Var.C();
                        txo0Var3.b(!z7 ? ivo0.d(g, xi90Var) : C.TIME_UNSET);
                        arrayList4.add(new elk0.a());
                    }
                    list = arrayList4;
                }
                if (z6) {
                    xi90Var.C();
                    xi90Var.E();
                }
                xi90Var.J();
                xi90Var.C();
                xi90Var.C();
                j = d;
            }
            flk0Var = new elk0(list, j, txo0Var3.b(j));
        } else if (g3 != 6) {
            flk0Var = null;
        } else {
            txo0 txo0Var4 = this.e;
            long d2 = ivo0.d(g, xi90Var);
            flk0Var = new ivo0(d2, txo0Var4.b(d2));
        }
        return flk0Var == null ? new fi20(new fi20.a[0]) : new fi20(flk0Var);
    }
}
