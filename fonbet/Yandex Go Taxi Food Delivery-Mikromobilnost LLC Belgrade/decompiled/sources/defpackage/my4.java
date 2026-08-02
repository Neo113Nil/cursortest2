package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class my4 {
    public final fl51 a;
    public final xa90 b;
    public final xfu c;
    public final pl40 d;

    public my4(fl51 fl51Var, xa90 xa90Var, xfu xfuVar, pl40 pl40Var) {
        this.a = fl51Var;
        this.b = xa90Var;
        this.c = xfuVar;
        this.d = pl40Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final idc a(String str) {
        Integer num;
        fdc fdcVar;
        String Q = str != null ? evu0.Q(ShimmerDivHandler.NUMBER_SING, str) : null;
        if (Q != null) {
            this.b.getClass();
            fl51 fl51Var = this.a;
            int i = fl51Var.a;
            int i2 = fl51Var.g;
            int i3 = fl51Var.e;
            switch (Q.hashCode()) {
                case -2051498519:
                    if (Q.equals("cardDivider")) {
                        num = Integer.valueOf(fl51Var.t);
                        break;
                    }
                    num = null;
                    break;
                case -1884548997:
                    if (Q.equals("bgInvert")) {
                        num = Integer.valueOf(fl51Var.c);
                        break;
                    }
                    num = null;
                    break;
                case -1732262959:
                    if (Q.equals("textOnControl")) {
                        num = Integer.valueOf(fl51Var.j);
                        break;
                    }
                    num = null;
                    break;
                case -1715476298:
                    if (Q.equals("controlMain")) {
                        num = Integer.valueOf(i3);
                        break;
                    }
                    num = null;
                    break;
                case -1639914408:
                    if (Q.equals("controlMinor")) {
                        num = Integer.valueOf(fl51Var.f);
                        break;
                    }
                    num = null;
                    break;
                case -1487903893:
                    if (Q.equals("bgFloating")) {
                        num = Integer.valueOf(fl51Var.d);
                        break;
                    }
                    num = null;
                    break;
                case -1407377732:
                    if (Q.equals("iconMinor")) {
                        num = Integer.valueOf(fl51Var.m);
                        break;
                    }
                    num = null;
                    break;
                case -1391797346:
                    if (Q.equals("bgMain")) {
                        num = Integer.valueOf(i);
                        break;
                    }
                    num = null;
                    break;
                case -1332194002:
                    if (Q.equals(C0553n3.g)) {
                        num = Integer.valueOf(i);
                        break;
                    }
                    num = null;
                    break;
                case -1054513528:
                    if (Q.equals("textMinor")) {
                        num = Integer.valueOf(fl51Var.h);
                        break;
                    }
                    num = null;
                    break;
                case -1003855738:
                    if (Q.equals("textMain")) {
                        num = Integer.valueOf(i2);
                        break;
                    }
                    num = null;
                    break;
                case -738143790:
                    if (Q.equals("iconMain")) {
                        num = Integer.valueOf(fl51Var.l);
                        break;
                    }
                    num = null;
                    break;
                case -688823980:
                    if (Q.equals("fogDark")) {
                        num = Integer.valueOf(fl51Var.q);
                        break;
                    }
                    num = null;
                    break;
                case -318264286:
                    if (Q.equals("pressed")) {
                        num = Integer.valueOf(fl51Var.p);
                        break;
                    }
                    num = null;
                    break;
                case -195801488:
                    if (Q.equals("bgMinor")) {
                        num = Integer.valueOf(fl51Var.b);
                        break;
                    }
                    num = null;
                    break;
                case 110997:
                    if (Q.equals("pin")) {
                        num = Integer.valueOf(fl51Var.o);
                        break;
                    }
                    num = null;
                    break;
                case 3321844:
                    if (Q.equals("line")) {
                        num = Integer.valueOf(fl51Var.n);
                        break;
                    }
                    num = null;
                    break;
                case 3556653:
                    if (Q.equals("text")) {
                        num = Integer.valueOf(i2);
                        break;
                    }
                    num = null;
                    break;
                case 96784904:
                    if (Q.equals("error")) {
                        num = Integer.valueOf(fl51Var.u);
                        break;
                    }
                    num = null;
                    break;
                case 104349611:
                    if (Q.equals("everFront")) {
                        num = Integer.valueOf(fl51Var.s);
                        break;
                    }
                    num = null;
                    break;
                case 280324901:
                    if (Q.equals("everBack")) {
                        num = Integer.valueOf(fl51Var.r);
                        break;
                    }
                    num = null;
                    break;
                case 817196644:
                    if (Q.equals("textOnControlMinor")) {
                        num = Integer.valueOf(fl51Var.k);
                        break;
                    }
                    num = null;
                    break;
                case 951543133:
                    if (Q.equals("control")) {
                        num = Integer.valueOf(i3);
                        break;
                    }
                    num = null;
                    break;
                case 1560148835:
                    if (Q.equals("textInvert")) {
                        num = Integer.valueOf(fl51Var.i);
                        break;
                    }
                    num = null;
                    break;
                default:
                    num = null;
                    break;
            }
            ddc ddcVar = num != null ? new ddc(num.intValue()) : null;
            if (ddcVar != null) {
                return ddcVar;
            }
            this.d.getClass();
            List Y = evu0.Y(Q, new char[]{';'}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = Y.iterator();
            while (it.hasNext()) {
                ycc.r(evu0.Y((String) it.next(), new char[]{':'}, 0, 6), arrayList);
            }
            if (arrayList.size() != 1) {
                if (arrayList.size() == 2 && jl40.l(arrayList.get(0), "l")) {
                    jgz jgzVar = jgz.a;
                    jgz.d(new IllegalStateException(), oyr.p("MultiHexConverter: Wrong format: '", Q, "'"), new Object[0]);
                } else if (arrayList.size() >= 4 && jl40.l(arrayList.get(0), "l") && jl40.l(arrayList.get(2), "d")) {
                    Integer b = iob1.b((String) arrayList.get(1));
                    ddc ddcVar2 = b != null ? new ddc(b.intValue()) : null;
                    if (ddcVar2 != null) {
                        Integer b2 = iob1.b((String) arrayList.get(3));
                        ddc ddcVar3 = b2 != null ? new ddc(b2.intValue()) : null;
                        if (ddcVar3 != null) {
                            fdcVar = new fdc(ddcVar2.a, ddcVar3.a);
                            if (fdcVar == null) {
                                return fdcVar;
                            }
                            this.c.getClass();
                            Integer b3 = iob1.b(Q);
                            if (b3 != null && b3.intValue() == 0) {
                                b3 = null;
                            }
                            if (b3 != null) {
                                return new ddc(b3.intValue());
                            }
                        }
                    }
                } else {
                    jgz jgzVar2 = jgz.a;
                    jgz.d(new IllegalStateException(), oyr.p("MultiHexConverter: Wrong format: '", Q, "'"), new Object[0]);
                }
            }
            fdcVar = null;
            if (fdcVar == null) {
            }
        }
        return null;
    }
}
