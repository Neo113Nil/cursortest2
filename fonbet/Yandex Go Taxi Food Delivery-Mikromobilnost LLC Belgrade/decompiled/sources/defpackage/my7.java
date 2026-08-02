package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final /* synthetic */ class my7 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy7 b;

    public /* synthetic */ my7(oy7 oy7Var, int i) {
        this.a = i;
        this.b = oy7Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object value;
        qy7 qy7Var;
        Object value2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oy7 oy7Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new my7(oy7Var, i2);
                b4d.a.getClass();
                ((agd) yfdVar).g = b4d.b;
                return zy11Var;
            default:
                wy7 wy7Var = (wy7) obj;
                jy7 jy7Var = (jy7) oy7Var.K;
                oy7 oy7Var2 = (oy7) jy7Var.c.b;
                co40 co40Var = jy7Var.a;
                pho phoVar = co40Var.a;
                py7 py7Var = jy7Var.b;
                r0 r0Var = py7Var.a;
                if (wy7Var instanceof ty7) {
                    ty7 ty7Var = (ty7) wy7Var;
                    LinkedHashMap linkedHashMap = ty7Var.a;
                    boolean z = ty7Var.b;
                    HashMap hashMap = new HashMap();
                    hashMap.put("groups", linkedHashMap);
                    phoVar.a("TaxiOrderCancel.CancelReasonsModalView.Shown", hashMap, 1, x4e.r(z, hashMap, "comment_field_shown"));
                    return zy11Var;
                }
                if (wy7Var instanceof sy7) {
                    sy7 sy7Var = (sy7) wy7Var;
                    oy7Var2.A((m950) ((t4) oy7Var2.I).get(), new av7(sy7Var.b, sy7Var.a), new ny7(new cx7(1, jy7Var)));
                    return zy11Var;
                }
                if (wy7Var instanceof ry7) {
                    w04 w04Var = new w04(23, (ry7) wy7Var, jy7Var);
                    do {
                        value2 = r0Var.getValue();
                    } while (!r0Var.k(value2, w04Var.invoke(value2)));
                    return zy11Var;
                }
                if (wy7Var instanceof vy7) {
                    vy7 vy7Var = (vy7) wy7Var;
                    String str = vy7Var.b;
                    do {
                        value = r0Var.getValue();
                        qy7Var = (qy7) value;
                        String str2 = qy7Var.b;
                        int i3 = vy7Var.a;
                        if (jl40.l(str2, str)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("rating", Integer.valueOf(i3));
                            hashMap2.put("group_id", str);
                            co40Var.a.a("TaxiOrderCancel.CancelReasonsModalView.Rating.Clicked", hashMap2, 1, new HashMap());
                            qy7Var = qy7.a(qy7Var, null, null, Integer.valueOf(i3), null, 11);
                        }
                    } while (!r0Var.k(value, qy7Var));
                    return zy11Var;
                }
                boolean z2 = wy7Var instanceof uy7;
                String str3 = null;
                if (!z2) {
                    w511.b();
                    return null;
                }
                x4e.B(phoVar, "TaxiOrderCancel.CancelReasonsModalView.DoneButton.Clicked", new HashMap(), 1);
                qy7 qy7Var2 = (qy7) py7Var.b.a.getValue();
                String str4 = qy7Var2.a;
                String str5 = qy7Var2.b;
                Integer num = qy7Var2.c;
                String str6 = qy7Var2.d;
                List h = scc.h(str4);
                if (str5 != null && str4 != null) {
                    str3 = str5;
                }
                oy7Var2.r(new nx7(h, str6, scc.h(str3), (str3 == null || num == null) ? b.f() : gw00.e(new Pair(str3, num)), 1));
                return zy11Var;
        }
    }
}
