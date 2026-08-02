package defpackage;

import com.yandex.go.taxi.experiments.ShowPolicyDto;
import com.yandex.go.taxi.experiments.VerticalSelectorSettingsExperiment;
import com.yandex.go.taxi.experiments.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class pb31 {
    public final bk31 a;
    public final im4 b;
    public final q c;
    public final zuj0 d;

    public pb31(bk31 bk31Var, im4 im4Var, q qVar, zuj0 zuj0Var) {
        this.a = bk31Var;
        this.b = im4Var;
        this.c = qVar;
        this.d = zuj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x003f, code lost:
    
        if (r6.b < r5) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ob31 a(String str, String str2, boolean z, Map map, ArrayList arrayList) {
        vl4 vl4Var;
        String str3;
        String str4;
        oeq0 meq0Var;
        qr80 qr80Var;
        Map map2;
        vl4 vl4Var2;
        List<String> list = (List) map.getOrDefault(str, EmptyList.a);
        g86 g86Var = (g86) this.a.a.getValue();
        if (g86Var != null && (map2 = g86Var.a) != null && (vl4Var2 = (vl4) map2.get(str)) != null) {
            ShowPolicyDto showPolicyDto = vl4Var2.i;
            if (showPolicyDto != null) {
                String str5 = showPolicyDto.a;
                int i = showPolicyDto.b;
                int i2 = showPolicyDto.c;
                hm4 c = this.b.c(str5);
                if (c.a < i) {
                }
            }
            vl4Var = vl4Var2;
            if (vl4Var == null) {
                str3 = str2;
                str4 = g8e.p(str3, " ", vl4Var.a);
            } else {
                str3 = str2;
                str4 = str3;
            }
            int i3 = !z ? kyh0.content_description_selected : kyh0.content_description_unselected;
            int i4 = ((VerticalSelectorSettingsExperiment) this.c.c.b()).e.b;
            if (list.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (String str6 : list) {
                    Iterator it = arrayList.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i5 = -1;
                            break;
                        }
                        if (jl40.l(((bf31) it.next()).a, str6)) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 == -1) {
                        qr80Var = null;
                    } else {
                        bf31 bf31Var = (bf31) arrayList.get(i5);
                        qr80Var = new qr80(new gr80(bf31Var.a, bf31Var.b, i4), i5);
                    }
                    if (qr80Var != null) {
                        arrayList2.add(qr80Var);
                    }
                }
                meq0Var = new meq0(arrayList2);
            } else {
                meq0Var = leq0.a;
            }
            return new ob31(str, str3, z, meq0Var, vl4Var, str4, ((avj0) this.d).h(i3));
        }
        vl4Var = null;
        if (vl4Var == null) {
        }
        if (!z) {
        }
        int i42 = ((VerticalSelectorSettingsExperiment) this.c.c.b()).e.b;
        if (list.isEmpty()) {
        }
        return new ob31(str, str3, z, meq0Var, vl4Var, str4, ((avj0) this.d).h(i3));
    }
}
