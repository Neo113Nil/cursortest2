package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import xsna.nxn0;

/* compiled from: SchemaInfoUtil.kt */
/* loaded from: classes12.dex */
public final class n8h0 {

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
        }
    }

    public static final List<w7s> a(qyg0 qyg0Var) {
        int h = egi.h(qyg0Var, "id");
        int h2 = egi.h(qyg0Var, "seq");
        int h3 = egi.h(qyg0Var, "from");
        int h4 = egi.h(qyg0Var, "to");
        ListBuilder e = e43.e();
        while (qyg0Var.step()) {
            e.add(new w7s((int) qyg0Var.getLong(h), (int) qyg0Var.getLong(h2), qyg0Var.l2(h3), qyg0Var.l2(h4)));
        }
        return j5g.C0(e.g());
    }

    public static final nxn0.d b(hyg0 hyg0Var, String str, boolean z) {
        qyg0 V0 = hyg0Var.V0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int h = egi.h(V0, "seqno");
            int h2 = egi.h(V0, BidResponsedEx.KEY_CID);
            int h3 = egi.h(V0, "name");
            int h4 = egi.h(V0, CampaignEx.JSON_KEY_DESC);
            if (h != -1 && h2 != -1 && h3 != -1 && h4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (V0.step()) {
                    if (((int) V0.getLong(h2)) >= 0) {
                        int i = (int) V0.getLong(h);
                        String l2 = V0.l2(h3);
                        String str2 = V0.getLong(h4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), l2);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List D0 = j5g.D0(new a(), linkedHashMap.entrySet());
                ArrayList arrayList = new ArrayList(c5g.u(D0, 10));
                Iterator it = D0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List O0 = j5g.O0(arrayList);
                List D02 = j5g.D0(new b(), linkedHashMap2.entrySet());
                ArrayList arrayList2 = new ArrayList(c5g.u(D02, 10));
                Iterator it2 = D02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                nxn0.d dVar = new nxn0.d(str, O0, j5g.O0(arrayList2), z);
                yfb.d(V0, null);
                return dVar;
            }
            yfb.d(V0, null);
            return null;
        } finally {
        }
    }
}
