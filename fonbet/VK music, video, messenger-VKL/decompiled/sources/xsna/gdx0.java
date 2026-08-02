package xsna;

import androidx.media3.common.ParserException;
import java.io.IOException;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: WavHeaderReader.java */
/* loaded from: classes12.dex */
public final class gdx0 {
    public static final byte[] a = {0, 0, 0, 0, AmfConstants.TYPE_TYPED_OBJECT_MARKER, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* compiled from: WavHeaderReader.java */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(qgq qgqVar, xi90 xi90Var) throws IOException {
            qgqVar.peekFully(xi90Var.a, 0, 8);
            xi90Var.P(0);
            return new a(xi90Var.p(), xi90Var.t());
        }
    }

    public static boolean a(qgq qgqVar) throws IOException {
        xi90 xi90Var = new xi90(8);
        int i = a.a(qgqVar, xi90Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        qgqVar.peekFully(xi90Var.a, 0, 4);
        xi90Var.P(0);
        int p = xi90Var.p();
        if (p == 1463899717) {
            return true;
        }
        ahn.n("WavHeaderReader", "Unsupported form type: " + p);
        return false;
    }

    public static a b(int i, qgq qgqVar, xi90 xi90Var) throws IOException {
        a a2 = a.a(qgqVar, xi90Var);
        while (true) {
            int i2 = a2.a;
            if (i2 == i) {
                return a2;
            }
            sn.d(i2, "Ignoring unknown WAV chunk: ");
            long j = a2.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            qgqVar.skipFully((int) j2);
            a2 = a.a(qgqVar, xi90Var);
        }
    }
}
