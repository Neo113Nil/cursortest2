package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.c;
import java.util.Collections;

/* loaded from: classes10.dex */
public abstract class hyt {
    public static final hzk a = hzk.n("nm", "g", "o", "t", "s", "e", "r", "hd");
    public static final hzk b = hzk.n("p", "k");

    public static fyt a(c cVar, nsz nszVar) {
        ae2 ae2Var = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType = null;
        ce2 ce2Var = null;
        ae2 ae2Var2 = null;
        ae2 ae2Var3 = null;
        boolean z = false;
        while (cVar.hasNext()) {
            switch (cVar.o(a)) {
                case 0:
                    str = cVar.nextString();
                    break;
                case 1:
                    cVar.c();
                    int i = -1;
                    while (cVar.hasNext()) {
                        int o = cVar.o(b);
                        if (o == 0) {
                            i = cVar.nextInt();
                        } else if (o != 1) {
                            cVar.v();
                            cVar.skipValue();
                        } else {
                            ce2Var = new ce2(ukx.a(cVar, nszVar, 1.0f, new dn60(i, 4, (byte) 0), false));
                        }
                    }
                    cVar.e();
                    break;
                case 2:
                    ae2Var = bb1.D(cVar, nszVar);
                    break;
                case 3:
                    gradientType = cVar.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    ae2Var2 = bb1.E(cVar, nszVar);
                    break;
                case 5:
                    ae2Var3 = bb1.E(cVar, nszVar);
                    break;
                case 6:
                    fillType = cVar.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = cVar.nextBoolean();
                    break;
                default:
                    cVar.v();
                    cVar.skipValue();
                    break;
            }
        }
        if (ae2Var == null) {
            ae2Var = new ae2(Collections.singletonList(new rkx(100)), 1);
        }
        return new fyt(str, gradientType, fillType, ce2Var, ae2Var, ae2Var2, ae2Var3, z);
    }
}
