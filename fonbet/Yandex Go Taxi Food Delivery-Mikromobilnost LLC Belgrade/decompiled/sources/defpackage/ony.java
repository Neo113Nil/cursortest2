package defpackage;

import java.util.HashMap;
import kotlin.collections.a;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.linked_order.interactor.h;
import ru.yandex.taxi.linked_order.map.b;
import ru.yandex.taxi.multiorder.e;

/* loaded from: classes5.dex */
public final class ony extends ad5 {
    public final yi7 A;
    public final c9v B;
    public final e C;
    public final f2z D;
    public final ru.yandex.taxi.linked_order.provider.e E;
    public dny F;
    public boolean G;
    public boolean H;
    public String I;
    public final h x;
    public final b y;
    public final uq1 z;

    public ony(h hVar, b bVar, uq1 uq1Var, yi7 yi7Var, c9v c9vVar, e eVar, f2z f2zVar, ru.yandex.taxi.linked_order.provider.e eVar2) {
        super(nny.class);
        this.x = hVar;
        this.y = bVar;
        this.z = uq1Var;
        this.A = yi7Var;
        this.B = c9vVar;
        this.C = eVar;
        this.D = f2zVar;
        this.E = eVar2;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.y.Ig();
    }

    public final void Kg() {
        if (this.H) {
            return;
        }
        this.H = true;
        dny dnyVar = this.F;
        onr0 onr0Var = (onr0) this.B.c;
        String X = dnyVar != null ? a.X(c9v.d(dnyVar), ",", null, null, null, 62) : null;
        String str = dnyVar != null ? dnyVar.w : null;
        String str2 = dnyVar != null ? dnyVar.v : null;
        HashMap hashMap = new HashMap();
        if (X != null) {
            hashMap.put("button_list", X);
        }
        if (str != null) {
            hashMap.put(ClidProvider.STATE, str);
        }
        if (str2 != null) {
            hashMap.put("tariff_class", str2);
        }
        onr0Var.a.a("SharedOrderCard.Shown", hashMap, 1, new HashMap());
    }
}
