package xsna;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: AppInfoTableDecoder.java */
/* loaded from: classes12.dex */
public final class n53 extends b920 {
    @Override // xsna.b920
    @Nullable
    public final fi20 k(qi20 qi20Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            wi90 wi90Var = new wi90(byteBuffer.array(), byteBuffer.limit());
            wi90Var.o(12);
            int d = (wi90Var.d() + wi90Var.g(12)) - 4;
            wi90Var.o(44);
            wi90Var.p(wi90Var.g(12));
            wi90Var.o(16);
            ArrayList arrayList = new ArrayList();
            while (wi90Var.d() < d) {
                wi90Var.o(48);
                int g = wi90Var.g(8);
                wi90Var.o(4);
                int d2 = wi90Var.d() + wi90Var.g(12);
                String str = null;
                String str2 = null;
                while (wi90Var.d() < d2) {
                    int g2 = wi90Var.g(8);
                    int g3 = wi90Var.g(8);
                    int d3 = wi90Var.d() + g3;
                    if (g2 == 2) {
                        int g4 = wi90Var.g(16);
                        wi90Var.o(8);
                        if (g4 == 3) {
                            while (wi90Var.d() < d3) {
                                int g5 = wi90Var.g(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[g5];
                                wi90Var.j(g5, bArr);
                                str = new String(bArr, charset);
                                int g6 = wi90Var.g(8);
                                for (int i = 0; i < g6; i++) {
                                    wi90Var.p(wi90Var.g(8));
                                }
                            }
                        }
                    } else if (g2 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[g3];
                        wi90Var.j(g3, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    wi90Var.m(d3 * 8);
                }
                wi90Var.m(d2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new m53(g, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new fi20(arrayList);
            }
        }
        return null;
    }
}
