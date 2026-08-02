package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class he2 {
    public static final hzk a = hzk.n("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final hzk b = hzk.n("k");

    public static void a(be2 be2Var, nsz nszVar) {
        Float valueOf = Float.valueOf(0.0f);
        List list = (List) be2Var.b;
        if (list.isEmpty()) {
            list.add(new rkx(nszVar, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(nszVar.m)));
        } else if (((rkx) list.get(0)).b == null) {
            list.set(0, new rkx(nszVar, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(nszVar.m)));
        }
    }

    public static boolean b(be2 be2Var) {
        if (be2Var != null) {
            return be2Var.Bc() && ((Float) ((rkx) ((List) be2Var.b).get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x011e, code lost:
    
        if (r1.b == 1.0f) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ge2 c(c cVar, nsz nszVar) {
        ae2 ae2Var;
        boolean z = cVar.k() == JsonReader$Token.BEGIN_OBJECT;
        if (z) {
            cVar.c();
        }
        yvi0 yvi0Var = null;
        ie2 ie2Var = null;
        be2 be2Var = null;
        ae2 ae2Var2 = null;
        be2 be2Var2 = null;
        be2 be2Var3 = null;
        be2 be2Var4 = null;
        be2 be2Var5 = null;
        be2 be2Var6 = null;
        ae2 ae2Var3 = null;
        be2 be2Var7 = null;
        be2 be2Var8 = null;
        while (cVar.hasNext()) {
            switch (cVar.o(a)) {
                case 0:
                    cVar.c();
                    while (cVar.hasNext()) {
                        if (cVar.o(b) != 0) {
                            cVar.v();
                            cVar.skipValue();
                        } else {
                            yvi0Var = de2.a(cVar, nszVar);
                        }
                    }
                    cVar.e();
                    break;
                case 1:
                    ie2Var = de2.b(cVar, nszVar);
                    break;
                case 2:
                    ae2Var2 = new ae2(ukx.a(cVar, nszVar, 1.0f, o430.G, false), 3);
                    break;
                case 3:
                    be2Var6 = bb1.C(cVar, nszVar, false);
                    a(be2Var6, nszVar);
                    break;
                case 4:
                    be2Var = bb1.C(cVar, nszVar, false);
                    a(be2Var, nszVar);
                    break;
                case 5:
                    ae2Var3 = bb1.D(cVar, nszVar);
                    break;
                case 6:
                    be2Var7 = bb1.C(cVar, nszVar, false);
                    break;
                case 7:
                    be2Var8 = bb1.C(cVar, nszVar, false);
                    break;
                case 8:
                    be2Var2 = bb1.C(cVar, nszVar, false);
                    break;
                case 9:
                    be2Var3 = bb1.C(cVar, nszVar, false);
                    break;
                case 10:
                    be2Var4 = bb1.C(cVar, nszVar, false);
                    a(be2Var4, nszVar);
                    break;
                case 11:
                    be2Var5 = bb1.C(cVar, nszVar, false);
                    a(be2Var5, nszVar);
                    break;
                default:
                    cVar.v();
                    cVar.skipValue();
                    break;
            }
        }
        if (z) {
            cVar.e();
        }
        if (yvi0Var == null || (yvi0Var.Bc() && ((PointF) ((rkx) ((ArrayList) yvi0Var.a).get(0)).b).equals(0.0f, 0.0f))) {
            yvi0Var = null;
        }
        ie2 ie2Var2 = (ie2Var == null || (!(ie2Var instanceof ee2) && ie2Var.Bc() && ((PointF) ((rkx) ie2Var.Nb().get(0)).b).equals(0.0f, 0.0f))) ? null : ie2Var;
        be2 be2Var9 = b(be2Var) ? null : be2Var;
        if (ae2Var2 != null) {
            if (ae2Var2.Bc()) {
                dlm0 dlm0Var = (dlm0) ((rkx) ((List) ae2Var2.b).get(0)).b;
                if (dlm0Var.a == 1.0f) {
                }
            }
            ae2Var = ae2Var2;
            return new ge2(yvi0Var, ie2Var2, ae2Var, be2Var9, ae2Var3, be2Var7, be2Var8, (be2Var2 != null || (be2Var2.Bc() && ((Float) ((rkx) ((List) be2Var2.b).get(0)).b).floatValue() == 0.0f)) ? null : be2Var2, (be2Var3 != null || (be2Var3.Bc() && ((Float) ((rkx) ((List) be2Var3.b).get(0)).b).floatValue() == 0.0f)) ? null : be2Var3, !b(be2Var4) ? null : be2Var4, !b(be2Var5) ? null : be2Var5, !b(be2Var6) ? null : be2Var6);
        }
        ae2Var = null;
        return new ge2(yvi0Var, ie2Var2, ae2Var, be2Var9, ae2Var3, be2Var7, be2Var8, (be2Var2 != null || (be2Var2.Bc() && ((Float) ((rkx) ((List) be2Var2.b).get(0)).b).floatValue() == 0.0f)) ? null : be2Var2, (be2Var3 != null || (be2Var3.Bc() && ((Float) ((rkx) ((List) be2Var3.b).get(0)).b).floatValue() == 0.0f)) ? null : be2Var3, !b(be2Var4) ? null : be2Var4, !b(be2Var5) ? null : be2Var5, !b(be2Var6) ? null : be2Var6);
    }
}
