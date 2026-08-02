package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.suggest.impl.view.divkit.custom_view.FullscreenSuperappSuggestDivCustomViewTypes;
import defpackage.clk;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.ju6;
import defpackage.k7x0;
import defpackage.l8x;
import defpackage.pav;
import defpackage.plk;
import defpackage.pwy0;
import defpackage.rqo;
import defpackage.rvo;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.wnt;
import defpackage.zuj0;
import java.util.LinkedHashMap;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes8.dex */
public final class a implements plk {
    public final tt2 b;
    public final tse c;
    public final pav d;
    public final pwy0 e;
    public final k7x0 f;
    public final ju6 g;
    public final zuj0 h;
    public final ru.yandex.taxi.map_common.image.a i;
    public final wnt j;
    public final LinkedHashMap k = new LinkedHashMap();
    public final boolean l;

    public a(tt2 tt2Var, tse tseVar, pav pavVar, pwy0 pwy0Var, k7x0 k7x0Var, ju6 ju6Var, zuj0 zuj0Var, ru.yandex.taxi.map_common.image.a aVar, wnt wntVar, rqo rqoVar) {
        this.b = tt2Var;
        this.c = tseVar;
        this.d = pavVar;
        this.e = pwy0Var;
        this.f = k7x0Var;
        this.g = ju6Var;
        this.h = zuj0Var;
        this.i = aVar;
        this.j = wntVar;
        this.l = ((Boolean) ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.OPTIMIZED_SHIMMERING).c()).booleanValue();
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, com.yandex.div.core.state.b bVar) {
        if ((view instanceof SuperappSuggestMapItemView) || (view instanceof OptimizedSuperappSuggestMapItemView)) {
            String view2 = view.toString();
            LinkedHashMap linkedHashMap = this.k;
            l8x l8xVar = (l8x) linkedHashMap.remove(view2);
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            linkedHashMap.put(view.toString(), tje.N(this.c, null, null, new SuperappSuggestMapItemViewAdapter$bindView$1(this, clkVar, view, null), 3));
        }
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, com.yandex.div.core.state.b bVar) {
        return this.l ? new OptimizedSuperappSuggestMapItemView(div2View.getContext()) : new SuperappSuggestMapItemView(div2View.getContext());
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return jl40.l(str, FullscreenSuperappSuggestDivCustomViewTypes.SUPERAPP_SUGGEST_MAP_ITEM.getType());
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        l8x l8xVar = (l8x) this.k.remove(view.toString());
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        if (view instanceof SuperappSuggestMapItemView) {
            ((SuperappSuggestMapItemView) view).resetState$impl();
        } else if (view instanceof OptimizedSuperappSuggestMapItemView) {
            ((OptimizedSuperappSuggestMapItemView) view).resetState$impl();
        }
    }
}
