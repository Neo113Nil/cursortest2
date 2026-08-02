package defpackage;

import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.parser.moshi.c;
import java.util.Collections;

/* loaded from: classes10.dex */
public abstract class fe2 {
    public static final hzk a = hzk.n("s", "a");
    public static final hzk b = hzk.n("s", "e", "o", "r");
    public static final hzk c = hzk.n("fc", "sc", "sw", "t", "o");

    public static lb7 a(c cVar, nsz nszVar) {
        cVar.c();
        bc bcVar = null;
        m2v m2vVar = null;
        while (cVar.hasNext()) {
            int o = cVar.o(a);
            if (o == 0) {
                cVar.c();
                ae2 ae2Var = null;
                ae2 ae2Var2 = null;
                ae2 ae2Var3 = null;
                TextRangeUnits textRangeUnits = null;
                while (cVar.hasNext()) {
                    int o2 = cVar.o(b);
                    if (o2 == 0) {
                        ae2Var = bb1.D(cVar, nszVar);
                    } else if (o2 == 1) {
                        ae2Var2 = bb1.D(cVar, nszVar);
                    } else if (o2 == 2) {
                        ae2Var3 = bb1.D(cVar, nszVar);
                    } else if (o2 != 3) {
                        cVar.v();
                        cVar.skipValue();
                    } else {
                        int nextInt = cVar.nextInt();
                        if (nextInt == 1 || nextInt == 2) {
                            textRangeUnits = nextInt == 1 ? TextRangeUnits.PERCENT : TextRangeUnits.INDEX;
                        } else {
                            nszVar.a("Unsupported text range units: " + nextInt);
                            textRangeUnits = TextRangeUnits.INDEX;
                        }
                    }
                }
                cVar.e();
                if (ae2Var == null && ae2Var2 != null) {
                    ae2Var = new ae2(Collections.singletonList(new rkx(0)), 1);
                }
                m2vVar = new m2v(ae2Var, ae2Var2, ae2Var3, textRangeUnits);
            } else if (o != 1) {
                cVar.v();
                cVar.skipValue();
            } else {
                cVar.c();
                ae2 ae2Var4 = null;
                ae2 ae2Var5 = null;
                be2 be2Var = null;
                be2 be2Var2 = null;
                ae2 ae2Var6 = null;
                while (cVar.hasNext()) {
                    int o3 = cVar.o(c);
                    if (o3 == 0) {
                        ae2Var4 = bb1.B(cVar, nszVar);
                    } else if (o3 == 1) {
                        ae2Var5 = bb1.B(cVar, nszVar);
                    } else if (o3 == 2) {
                        be2Var = bb1.C(cVar, nszVar, true);
                    } else if (o3 == 3) {
                        be2Var2 = bb1.C(cVar, nszVar, true);
                    } else if (o3 != 4) {
                        cVar.v();
                        cVar.skipValue();
                    } else {
                        ae2Var6 = bb1.D(cVar, nszVar);
                    }
                }
                cVar.e();
                bcVar = new bc(ae2Var4, ae2Var5, be2Var, be2Var2, ae2Var6);
            }
        }
        cVar.e();
        return new lb7(4, bcVar, m2vVar);
    }
}
