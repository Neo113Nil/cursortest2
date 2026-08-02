package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: CatalogRecyclerPoolController.kt */
/* loaded from: classes16.dex */
public final class qca implements w8i {
    public final Map<sif0, Integer> b;
    public final zia c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new ah(this, 9));
    public final q0w0 e;
    public ijf0 f;
    public zg g;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public qca(Map<sif0, Integer> map, zia ziaVar) {
        this.b = map;
        this.c = ziaVar;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<sif0, Integer> entry : map.entrySet()) {
            sif0 key = entry.getKey();
            arrayList.add(new Pair(Integer.valueOf(((mca) this.d.getValue()).a(key.b, key.a, key.c, false)), Integer.valueOf(entry.getValue().intValue())));
        }
        Map s = pn00.s(arrayList);
        dhr0.a.getClass();
        this.e = new q0w0(new t0.b(2, 1, s, dhr0.E(), qjg.a(lca.q), new ul1(this, 15), null, 448));
    }

    public final RecyclerView.u a() {
        return this.e.d.o();
    }
}
