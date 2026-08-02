package xsna;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.v1h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class rgn implements v1h0.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rgn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // xsna.v1h0.b
    public final Bundle r() {
        Pair[] pairArr;
        switch (this.a) {
            case 0:
                Map<String, List<Object>> d = ((n1h0) this.b).d();
                Bundle bundle = new Bundle();
                for (Map.Entry<String, List<Object>> entry : d.entrySet()) {
                    String key = entry.getKey();
                    List<Object> value = entry.getValue();
                    bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
                }
                return bundle;
            default:
                q1h0 q1h0Var = (q1h0) this.b;
                for (Map.Entry entry2 : pn00.t(q1h0Var.d).entrySet()) {
                    q1h0Var.a((String) entry2.getKey(), ((xh50) entry2.getValue()).getValue());
                }
                for (Map.Entry entry3 : pn00.t(q1h0Var.b).entrySet()) {
                    q1h0Var.a((String) entry3.getKey(), ((v1h0.b) entry3.getValue()).r());
                }
                LinkedHashMap linkedHashMap = q1h0Var.a;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return yfb.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
