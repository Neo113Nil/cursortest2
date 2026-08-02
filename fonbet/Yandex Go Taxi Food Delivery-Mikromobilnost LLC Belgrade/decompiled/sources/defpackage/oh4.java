package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import ru.yandex.taxi.logistics.sdk.ui_models.background.ScaleType;

/* loaded from: classes5.dex */
public final class oh4 {
    public final l7x0 a;
    public final yfa b;

    public oh4(yfa yfaVar, l7x0 l7x0Var) {
        this.b = yfaVar;
        this.a = l7x0Var;
    }

    public static ra90 b(oh4 oh4Var, w4v w4vVar, String str, kvi0 kvi0Var, boolean z, int i) {
        String str2;
        ldc e;
        String str3 = null;
        if ((i & 2) != 0) {
            str = null;
        }
        kvi0 kvi0Var2 = (i & 4) != 0 ? null : kvi0Var;
        l7x0 l7x0Var = oh4Var.a;
        if (!(w4vVar instanceof mvi0)) {
            if (!(w4vVar instanceof h3z)) {
                w511.b();
                return null;
            }
            h3z h3zVar = (h3z) w4vVar;
            Integer num = (Integer) s4v.a.get(h3zVar.a);
            int intValue = num != null ? num.intValue() : 0;
            String str4 = h3zVar.b;
            return new cuj0(intValue, str4 == null ? str : str4, h3zVar.c, null, 24);
        }
        mvi0 mvi0Var = (mvi0) w4vVar;
        qfc qfcVar = mvi0Var.d;
        zez0 zez0Var = (qfcVar == null || (e = oh4Var.b.e(qfcVar, z)) == null) ? null : new zez0(e.a);
        String str5 = mvi0Var.c;
        if (str5 == null) {
            if (z) {
                String str6 = mvi0Var.b;
                if (str6 != null) {
                    str3 = l7x0Var.a(str6);
                }
            } else {
                String str7 = mvi0Var.a;
                if (str7 != null) {
                    str3 = l7x0Var.a(str7);
                }
            }
            str2 = str3;
        } else {
            str2 = str5;
        }
        String str8 = mvi0Var.e;
        return new lvi0(str2, kvi0Var2, str8 == null ? str : str8, mvi0Var.f, zez0Var, 32);
    }

    public w3b1 a(u3b1 u3b1Var, boolean z) {
        nhe nheVar;
        boolean z2 = u3b1Var instanceof whc;
        yfa yfaVar = this.b;
        if (z2) {
            whc whcVar = (whc) u3b1Var;
            ldc e = yfaVar.e(whcVar.a, z);
            long j = e != null ? e.a : ph4.a;
            qfc qfcVar = whcVar.b;
            return new xhc(j, qfcVar != null ? yfaVar.e(qfcVar, z) : null);
        }
        if (u3b1Var instanceof riy) {
            if (z) {
                riy riyVar = (riy) u3b1Var;
                xiy xiyVar = riyVar.b;
                ArrayList c = c(xiyVar.a);
                double d = xiyVar.b;
                qfc qfcVar2 = riyVar.c;
                return new siy(c, d, qfcVar2 != null ? yfaVar.e(qfcVar2, z) : null);
            }
            riy riyVar2 = (riy) u3b1Var;
            xiy xiyVar2 = riyVar2.a;
            ArrayList c2 = c(xiyVar2.a);
            double d2 = xiyVar2.b;
            qfc qfcVar3 = riyVar2.c;
            return new siy(c2, d2, qfcVar3 != null ? yfaVar.e(qfcVar3, z) : null);
        }
        if (!(u3b1Var instanceof j8v)) {
            if (u3b1Var.equals(o121.a)) {
                return null;
            }
            w511.b();
            return null;
        }
        j8v j8vVar = (j8v) u3b1Var;
        String a = this.a.a(j8vVar.a);
        Float f = j8vVar.b;
        Float f2 = j8vVar.c;
        ScaleType scaleType = j8vVar.d;
        int i = scaleType == null ? -1 : nh4.a[scaleType.ordinal()];
        if (i == 1) {
            nheVar = mhe.a;
        } else if (i != 2) {
            nheVar = mhe.b;
            if (i != 3 && i == 4) {
                nheVar = mhe.f;
            }
        } else {
            nheVar = mhe.g;
        }
        nhe nheVar2 = nheVar;
        Float f3 = j8vVar.e;
        y7m y7mVar = f3 != null ? new y7m(f3.floatValue()) : null;
        Float f4 = j8vVar.f;
        y7m y7mVar2 = f4 != null ? new y7m(f4.floatValue()) : null;
        qfc qfcVar4 = j8vVar.g;
        ldc e2 = qfcVar4 != null ? yfaVar.e(qfcVar4, z) : null;
        qfc qfcVar5 = j8vVar.h;
        return new k8v(a, f, f2, nheVar2, y7mVar, y7mVar2, e2, qfcVar5 != null ? yfaVar.e(qfcVar5, z) : null);
    }

    public ArrayList c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object c = pair.c();
            String str = (String) pair.f();
            this.b.getClass();
            ldc j = yfa.j(str);
            arrayList2.add(new Pair(c, new ldc(j != null ? j.a : ph4.a)));
        }
        return arrayList2;
    }

    public oh4(l7x0 l7x0Var, yfa yfaVar) {
        this.a = l7x0Var;
        this.b = yfaVar;
    }
}
