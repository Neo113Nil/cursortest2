package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class rf3 {
    public final rh3 a;
    public final ge3 b;
    public final pf3 c;

    public /* synthetic */ rf3(Context context, hg3 hg3Var) {
        this(new rh3(), new ge3(context), new pf3(hg3Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9 A[EDGE_INSN: B:106:0x01f9->B:107:0x01f9 BREAK  A[LOOP:0: B:7:0x0064->B:19:0x0064], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [yads.e33] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [yads.ab] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r8v10, types: [yads.fe3] */
    /* JADX WARN: Type inference failed for: r8v3, types: [yads.fe3] */
    /* JADX WARN: Type inference failed for: r8v8, types: [yads.fe3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(List list, qk3 qk3Var) {
        List D0;
        Iterator it;
        int i;
        Iterator it2;
        String str;
        String str2;
        lm1 lm1Var;
        pm1 pm1Var;
        Object obj;
        Object obj2;
        String str3;
        this.a.getClass();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (((ye3) it3.next()).k != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (((ye3) obj3).k != null) {
                            arrayList.add(obj3);
                        }
                    }
                    D0 = j5g.D0(new qh3(), arrayList);
                    ge3 ge3Var = this.b;
                    ge3Var.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    it = D0.iterator();
                    while (true) {
                        i = 0;
                        if (it.hasNext()) {
                            break;
                        }
                        ye3 ye3Var = (ye3) it.next();
                        b20 b20Var = (b20) j5g.a0(ye3Var.b);
                        if (b20Var != null) {
                            if (b20Var.b.isEmpty()) {
                                qu2 qu2Var = ge3Var.e;
                                if (qu2Var != null && qu2Var.D0 && ye3Var.a) {
                                    String str4 = ye3Var.i;
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    str3 = new fe3(ye3Var, b20Var, new lm1(str4, null, null, null, null, null, 0, 0, 0, null), null, null, null, null, null);
                                } else {
                                    om1 om1Var = ge3Var.a;
                                    boolean z = qk3Var != null && qk3Var.c;
                                    om1Var.getClass();
                                    lm1 a = om1Var.a(b20Var.a);
                                    if (a == null) {
                                        str = null;
                                        pm1Var = null;
                                    } else {
                                        if (z) {
                                            List list2 = b20Var.a;
                                            ArrayList arrayList3 = new ArrayList();
                                            for (Object obj4 : list2) {
                                                if (!epx.f(((lm1) obj4).d, a.d)) {
                                                    arrayList3.add(obj4);
                                                }
                                            }
                                            str = null;
                                            lm1Var = om1Var.a(arrayList3);
                                        } else {
                                            str = null;
                                            lm1Var = null;
                                        }
                                        pm1Var = new pm1(a, lm1Var);
                                    }
                                    if (pm1Var != null) {
                                        hf3 hf3Var = ye3Var.d;
                                        ge3Var.b.getClass();
                                        Iterator it4 = hf3Var.a.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                obj = str;
                                                break;
                                            }
                                            obj = it4.next();
                                            iq0 iq0Var = (iq0) obj;
                                            if (epx.f(iq0Var.a, "social_ad_info") && iq0Var.b.length() > 0) {
                                                break;
                                            }
                                        }
                                        iq0 iq0Var2 = (iq0) obj;
                                        String str5 = iq0Var2 != null ? iq0Var2.b : str;
                                        ?? e33Var = str5 != null ? new e33(str5) : str;
                                        ge3Var.c.getClass();
                                        String a2 = n5.a(hf3Var);
                                        ge3Var.c.getClass();
                                        String a3 = n5.a(hf3Var);
                                        ?? a4 = a3 != null ? je1.a(a3) : str;
                                        ge3Var.d.getClass();
                                        Iterator it5 = hf3Var.a.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                obj2 = str;
                                                break;
                                            }
                                            obj2 = it5.next();
                                            if (epx.f(((iq0) obj2).a, "AdTune")) {
                                                break;
                                            }
                                        }
                                        iq0 iq0Var3 = (iq0) obj2;
                                        String str6 = iq0Var3 != null ? iq0Var3.b : str;
                                        ?? a5 = str6 != null ? je1.a(str6) : str;
                                        str3 = new fe3(ye3Var, b20Var, pm1Var.a, pm1Var.b, e33Var, a2, a4, a5 != 0 ? new ab(a5.optString("token"), a5.optString("advertiserInfo"), a5.optInt("show", 0) == 1) : str);
                                    }
                                }
                            } else {
                                str3 = new fe3(ye3Var, b20Var, new lm1("", null, null, null, null, null, 0, 0, 0, null), null, null, null, null, null);
                            }
                            str2 = str3;
                            if (str2 == null) {
                                arrayList2.add(str2);
                            }
                        } else {
                            str = null;
                        }
                        str2 = str;
                        if (str2 == null) {
                        }
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList2, 10));
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        fe3 fe3Var = (fe3) next;
                        pf3 pf3Var = this.c;
                        pf3Var.getClass();
                        ye3 ye3Var2 = fe3Var.a;
                        b20 b20Var2 = fe3Var.b;
                        lm1 lm1Var2 = fe3Var.c;
                        e33 e33Var2 = fe3Var.e;
                        String str7 = fe3Var.f;
                        JSONObject jSONObject = fe3Var.g;
                        pg3 pg3Var = new pg3(size, i2);
                        ab abVar = fe3Var.h;
                        String a6 = abVar != null ? bb.a(abVar) : null;
                        Object a7 = pf3Var.a.a(ye3Var2, b20Var2, lm1Var2, pg3Var, str7, a6, jSONObject);
                        String valueOf = String.valueOf(a31.a.getAndIncrement());
                        lm1 lm1Var3 = fe3Var.d;
                        arrayList4.add(new nf3(b20Var2, ye3Var2, lm1Var2, a7, lm1Var3 != null ? pf3Var.a.a(ye3Var2, b20Var2, lm1Var3, pg3Var, str7, a6, jSONObject) : null, e33Var2, valueOf, abVar));
                        i = i2;
                    }
                    return arrayList4;
                }
            }
        }
        D0 = j5g.O0(list);
        ge3 ge3Var2 = this.b;
        ge3Var2.getClass();
        ArrayList arrayList22 = new ArrayList();
        it = D0.iterator();
        while (true) {
            i = 0;
            if (it.hasNext()) {
            }
        }
        int size2 = arrayList22.size();
        ArrayList arrayList42 = new ArrayList(c5g.u(arrayList22, 10));
        it2 = arrayList22.iterator();
        while (it2.hasNext()) {
        }
        return arrayList42;
    }

    public rf3(rh3 rh3Var, ge3 ge3Var, pf3 pf3Var) {
        this.a = rh3Var;
        this.b = ge3Var;
        this.c = pf3Var;
    }
}
