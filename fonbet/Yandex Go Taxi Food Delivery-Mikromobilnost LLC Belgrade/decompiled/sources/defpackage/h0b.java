package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.widget.surge.HistoryChart;
import ru.yandex.taxi.widget.surge.a;

/* loaded from: classes6.dex */
public final class h0b extends lys {
    public static final /* synthetic */ int S = 0;

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        g0b g0bVar = (g0b) obj;
        HistoryChart historyChart = ((lqw0) ((zo31) this.R)).a;
        List<d0b> list = g0bVar.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (d0b d0bVar : list) {
            arrayList.add(new rlu(d0bVar.b, d0bVar.a, d0bVar.c));
        }
        f0b f0bVar = g0bVar.c;
        tlu tluVar = null;
        if (f0bVar != null) {
            e0b e0bVar = f0bVar.d;
            tluVar = new tlu(f0bVar.a, f0bVar.c, f0bVar.b, e0bVar != null ? new slu(e0bVar.a, e0bVar.c, e0bVar.b) : null);
        }
        historyChart.update(new a(arrayList, tluVar, new a.C0123a(g0bVar.a.a)));
    }
}
