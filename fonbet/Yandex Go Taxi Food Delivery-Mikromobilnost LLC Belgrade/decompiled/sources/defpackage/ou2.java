package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class ou2 extends ies0 {
    @Override // defpackage.ies0
    public final w820 b(d920 d920Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            df90 df90Var = new df90(byteBuffer.array(), byteBuffer.limit());
            df90Var.o(12);
            int d = (df90Var.d() + df90Var.g(12)) - 4;
            df90Var.o(44);
            df90Var.p(df90Var.g(12));
            df90Var.o(16);
            ArrayList arrayList = new ArrayList();
            while (df90Var.d() < d) {
                df90Var.o(48);
                int g = df90Var.g(8);
                df90Var.o(4);
                int d2 = df90Var.d() + df90Var.g(12);
                String str = null;
                String str2 = null;
                while (df90Var.d() < d2) {
                    int g2 = df90Var.g(8);
                    int g3 = df90Var.g(8);
                    int d3 = df90Var.d() + g3;
                    if (g2 == 2) {
                        int g4 = df90Var.g(16);
                        df90Var.o(8);
                        if (g4 == 3) {
                            while (df90Var.d() < d3) {
                                int g5 = df90Var.g(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[g5];
                                df90Var.j(g5, bArr);
                                str = new String(bArr, charset);
                                int g6 = df90Var.g(8);
                                for (int i = 0; i < g6; i++) {
                                    df90Var.p(df90Var.g(8));
                                }
                            }
                        }
                    } else if (g2 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[g3];
                        df90Var.j(g3, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    df90Var.m(d3 * 8);
                }
                df90Var.m(d2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new nu2(g, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new w820(arrayList);
            }
        }
        return null;
    }
}
