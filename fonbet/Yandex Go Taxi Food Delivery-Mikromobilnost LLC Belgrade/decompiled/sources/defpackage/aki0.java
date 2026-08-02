package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public abstract class aki0 {
    public static final bys a(RecyclerView recyclerView, tls tlsVar) {
        j3x j3xVar = new j3x();
        tlsVar.invoke(j3xVar);
        RecyclerView.e eVar = j3xVar.b;
        if (eVar == null) {
            eVar = new LinearLayoutManager(recyclerView.getContext(), 1, false);
        }
        recyclerView.setLayoutManager(eVar);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        return bysVar;
    }

    public static final void b(f3x f3xVar, wls wlsVar) {
        ((j3x) f3xVar.b).a.add(new zxs((Class) f3xVar.a, new xji0(f3xVar, 0), new mj1(wlsVar, f3xVar, 3)));
    }
}
