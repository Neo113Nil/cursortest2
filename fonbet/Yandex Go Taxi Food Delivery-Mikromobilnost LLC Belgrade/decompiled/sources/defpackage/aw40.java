package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import com.yandex.go.taxi.order.models.api.preorder.TollRoads;

/* loaded from: classes12.dex */
public final class aw40 {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;

    public aw40(LayoutDirection layoutDirection, fwi fwiVar, dyr dyrVar, ety0 ety0Var, Object obj) {
        long a;
        this.b = layoutDirection;
        this.c = fwiVar;
        this.d = dyrVar;
        this.e = ety0Var;
        this.f = obj;
        this.g = f.j(Boolean.TRUE);
        a = pmy0.a((ety0) this.e, (fwi) this.c, (dyr) this.d, pmy0.a, 1);
        this.a = a;
    }

    public static void a(aw40 aw40Var, LayoutDirection layoutDirection, fwi fwiVar, ety0 ety0Var, int i) {
        if ((i & 1) != 0) {
            layoutDirection = (LayoutDirection) aw40Var.b;
        }
        if ((i & 2) != 0) {
            fwiVar = (fwi) aw40Var.c;
        }
        dyr dyrVar = (dyr) aw40Var.d;
        if ((i & 8) != 0) {
            ety0Var = (ety0) aw40Var.e;
        }
        Object obj = aw40Var.f;
        LayoutDirection layoutDirection2 = (LayoutDirection) aw40Var.b;
        oz40 oz40Var = (oz40) aw40Var.g;
        if (layoutDirection == layoutDirection2 && jl40.l(fwiVar, (fwi) aw40Var.c) && jl40.l(dyrVar, (dyr) aw40Var.d) && jl40.l(ety0Var, (ety0) aw40Var.e)) {
            if (jl40.l(obj, aw40Var.f)) {
                return;
            }
            aw40Var.f = obj;
            oz40Var.setValue(Boolean.TRUE);
            return;
        }
        aw40Var.b = layoutDirection;
        aw40Var.c = fwiVar;
        aw40Var.d = dyrVar;
        aw40Var.e = ety0Var;
        oz40Var.setValue(Boolean.TRUE);
    }

    public aw40(String str, TollRoads tollRoads, SelectedTariffInfo selectedTariffInfo, as40 as40Var, String str2, String str3, long j) {
        this.b = str;
        this.e = tollRoads;
        this.f = selectedTariffInfo;
        this.g = as40Var;
        this.c = str2;
        this.d = str3;
        this.a = j;
    }
}
