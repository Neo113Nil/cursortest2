package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class fst0 extends ies0 {
    public final ef90 a = new ef90();
    public final df90 b = new df90();
    public sez0 c;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r5 != r7) goto L14;
     */
    @Override // defpackage.ies0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w820 b(d920 d920Var, ByteBuffer byteBuffer) {
        s820 gst0Var;
        long j;
        ef90 ef90Var = this.a;
        df90 df90Var = this.b;
        sez0 sez0Var = this.c;
        if (sez0Var != null) {
            long j2 = d920Var.B;
            synchronized (sez0Var) {
                long j3 = sez0Var.b;
            }
        }
        sez0 sez0Var2 = new sez0(d920Var.y);
        this.c = sez0Var2;
        sez0Var2.a(d920Var.y - d920Var.B);
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ef90Var.I(limit, array);
        df90Var.k(limit, array);
        df90Var.o(39);
        long g = (df90Var.g(1) << 32) | df90Var.g(32);
        df90Var.o(20);
        int g2 = df90Var.g(12);
        int g3 = df90Var.g(8);
        ef90Var.L(14);
        if (g3 == 0) {
            gst0Var = new gst0();
        } else if (g3 == 255) {
            long A = ef90Var.A();
            int i = g2 - 4;
            ef90Var.i(0, i, new byte[i]);
            gst0Var = new j4f0(0, A, g);
        } else if (g3 == 4) {
            int y = ef90Var.y();
            ArrayList arrayList = new ArrayList(y);
            for (int i2 = 0; i2 < y; i2++) {
                ef90Var.A();
                boolean z = (ef90Var.y() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int y2 = ef90Var.y();
                    boolean z2 = (y2 & 64) != 0;
                    boolean z3 = (y2 & 32) != 0;
                    if (z2) {
                        ef90Var.A();
                    }
                    if (!z2) {
                        int y3 = ef90Var.y();
                        ArrayList arrayList3 = new ArrayList(y3);
                        for (int i3 = 0; i3 < y3; i3++) {
                            ef90Var.y();
                            ef90Var.A();
                            arrayList3.add(new ity());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        ef90Var.y();
                        ef90Var.A();
                    }
                    ef90Var.E();
                    ef90Var.y();
                    ef90Var.y();
                }
                wdz wdzVar = new wdz();
                Collections.unmodifiableList(arrayList2);
                arrayList.add(wdzVar);
            }
            gst0Var = new hst0();
            Collections.unmodifiableList(arrayList);
        } else if (g3 == 5) {
            sez0 sez0Var3 = this.c;
            ef90Var.A();
            boolean z4 = (ef90Var.y() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int y4 = ef90Var.y();
                boolean z5 = (y4 & 64) != 0;
                boolean z6 = (y4 & 32) != 0;
                boolean z7 = (y4 & 16) != 0;
                long a = (!z5 || z7) ? -9223372036854775807L : j4f0.a(g, ef90Var);
                if (!z5) {
                    int y5 = ef90Var.y();
                    ArrayList arrayList4 = new ArrayList(y5);
                    for (int i4 = 0; i4 < y5; i4++) {
                        ef90Var.y();
                        sez0Var3.b(!z7 ? j4f0.a(g, ef90Var) : -9223372036854775807L);
                        arrayList4.add(new hay(13));
                    }
                    list = arrayList4;
                }
                if (z6) {
                    ef90Var.y();
                    ef90Var.A();
                }
                ef90Var.E();
                ef90Var.y();
                ef90Var.y();
                j = a;
            }
            gst0Var = new j4f0(list, j, sez0Var3.b(j));
        } else if (g3 != 6) {
            gst0Var = null;
        } else {
            sez0 sez0Var4 = this.c;
            long a2 = j4f0.a(g, ef90Var);
            gst0Var = new j4f0(2, a2, sez0Var4.b(a2));
        }
        return gst0Var == null ? new w820(new s820[0]) : new w820(gst0Var);
    }
}
