package yads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class ng extends h03 {
    @Override // yads.h03
    public final ut1 a(xt1 xt1Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            jc2 jc2Var = new jc2(byteBuffer.limit(), byteBuffer.array());
            jc2Var.c(12);
            int c = (jc2Var.c() + jc2Var.a(12)) - 4;
            jc2Var.c(44);
            jc2Var.d(jc2Var.a(12));
            jc2Var.c(16);
            ArrayList arrayList = new ArrayList();
            while (jc2Var.c() < c) {
                jc2Var.c(48);
                int a = jc2Var.a(8);
                jc2Var.c(4);
                int c2 = jc2Var.c() + jc2Var.a(12);
                String str = null;
                String str2 = null;
                while (jc2Var.c() < c2) {
                    int a2 = jc2Var.a(8);
                    int a3 = jc2Var.a(8);
                    int c3 = jc2Var.c() + a3;
                    if (a2 == 2) {
                        int a4 = jc2Var.a(16);
                        jc2Var.c(8);
                        if (a4 == 3) {
                            while (jc2Var.c() < c3) {
                                str = jc2Var.a(jc2Var.a(8), bu.a);
                                int a5 = jc2Var.a(8);
                                for (int i = 0; i < a5; i++) {
                                    jc2Var.d(jc2Var.a(8));
                                }
                            }
                        }
                    } else if (a2 == 21) {
                        str2 = jc2Var.a(a3, bu.a);
                    }
                    jc2Var.b(c3 * 8);
                }
                jc2Var.b(c2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new mg(a, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new ut1(arrayList);
            }
        }
        return null;
    }
}
