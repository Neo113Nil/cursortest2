package xsna;

import java.util.ArrayList;
import xsna.ln00;

/* compiled from: MappedTrackInfoExt.kt */
/* loaded from: classes8.dex */
public final class ym00 {
    public static final ArrayList a(ln00.a aVar, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = aVar.a;
        for (int i3 = 0; i3 < i2; i3++) {
            if (aVar.b[i3] == i) {
                qfp0 qfp0Var = aVar.c[i3];
                int i4 = qfp0Var.a;
                for (int i5 = 0; i5 < i4; i5++) {
                    pfp0 a = qfp0Var.a(i5);
                    int i6 = a.a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        arrayList.add(a.d[i7]);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final int b(ln00.a aVar, int i, izs<? super androidx.media3.common.a, Boolean> izsVar) {
        int i2 = aVar.a;
        for (int i3 = 0; i3 < i2; i3++) {
            if (aVar.b[i3] == i) {
                qfp0 qfp0Var = aVar.c[i3];
                int i4 = qfp0Var.a;
                for (int i5 = 0; i5 < i4; i5++) {
                    pfp0 a = qfp0Var.a(i5);
                    int i6 = a.a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (izsVar.invoke(a.d[i7]).booleanValue()) {
                            return i7;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
