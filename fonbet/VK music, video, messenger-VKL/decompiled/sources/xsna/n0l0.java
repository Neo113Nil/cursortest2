package xsna;

import com.vk.superapp.health.js.bridge.api.events.GetSteps$Response;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* compiled from: StepCounterInfoBridgeMapper.kt */
/* loaded from: classes6.dex */
public final class n0l0 {
    public static ArrayList a(List list) {
        ArrayList arrayList;
        List<m0l0> list2 = list;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (m0l0 m0l0Var : list2) {
            Integer valueOf = Integer.valueOf(m0l0Var.a);
            float f = 1000;
            Float valueOf2 = Float.valueOf(m0l0Var.b * f);
            SimpleDateFormat simpleDateFormat = dnv0.a;
            String format = dnv0.a.format(new Date(m0l0Var.c));
            Integer valueOf3 = Integer.valueOf(m0l0Var.d);
            Float valueOf4 = Float.valueOf(m0l0Var.e * f);
            List<s0l0> list3 = m0l0Var.g;
            if (list3 != null) {
                List<s0l0> list4 = list3;
                arrayList = new ArrayList(c5g.u(list4, i));
                for (s0l0 s0l0Var : list4) {
                    arrayList.add(new GetSteps$Response.Data.StepsList.Details(Integer.valueOf(s0l0Var.a), Integer.valueOf((int) (s0l0Var.b * f)), s0l0Var.c, Boolean.valueOf(s0l0Var.d)));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new GetSteps$Response.Data.StepsList(valueOf, valueOf2, format, valueOf3, valueOf4, arrayList));
            i = 10;
        }
        return arrayList2;
    }
}
