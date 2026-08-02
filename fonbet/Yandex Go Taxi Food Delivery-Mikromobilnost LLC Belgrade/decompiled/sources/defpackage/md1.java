package defpackage;

import android.content.Context;
import ru.yandex.taxi.layers.source.factory.componentfactory.e;
import ru.yandex.taxi.layers.source.factory.componentfactory.l;
import ru.yandex.taxi.map_common.map.utils.a;
import ru.yandex.taxi.widget.c;

/* loaded from: classes9.dex */
public final class md1 implements v7p {
    public final /* synthetic */ int a = 1;
    public final m2g b;
    public final m2g c;
    public final m2g d;
    public final etx e;
    public final m2g f;
    public final n2g g;
    public final n2g h;

    public md1(m2g m2gVar, m2g m2gVar2, m2g m2gVar3, etx etxVar, m2g m2gVar4, n2g n2gVar, n2g n2gVar2) {
        this.b = m2gVar;
        this.c = m2gVar2;
        this.d = m2gVar3;
        this.e = etxVar;
        this.f = m2gVar4;
        this.g = n2gVar;
        this.h = n2gVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        n2g n2gVar = this.h;
        n2g n2gVar2 = this.g;
        m2g m2gVar = this.f;
        etx etxVar = this.e;
        m2g m2gVar2 = this.d;
        m2g m2gVar3 = this.c;
        m2g m2gVar4 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) m2gVar4.get();
                tt2 tt2Var = (tt2) m2gVar3.get();
                c cVar = (c) m2gVar2.get();
                sxx sxxVar = (sxx) etxVar.get();
                a aVar = (a) n2gVar2.get();
                return new e(tt2Var, (pdc) m2gVar.get(), sxxVar, (pwy0) n2gVar.get(), context, aVar, cVar);
            default:
                Context context2 = (Context) m2gVar4.get();
                tt2 tt2Var2 = (tt2) m2gVar3.get();
                c cVar2 = (c) m2gVar2.get();
                sxx sxxVar2 = (sxx) etxVar.get();
                return new l(tt2Var2, (pdc) m2gVar.get(), sxxVar2, (pwy0) n2gVar.get(), context2, (a) n2gVar2.get(), cVar2);
        }
    }

    public md1(m2g m2gVar, m2g m2gVar2, m2g m2gVar3, etx etxVar, n2g n2gVar, n2g n2gVar2, m2g m2gVar4) {
        this.b = m2gVar;
        this.c = m2gVar2;
        this.d = m2gVar3;
        this.e = etxVar;
        this.g = n2gVar;
        this.h = n2gVar2;
        this.f = m2gVar4;
    }
}
