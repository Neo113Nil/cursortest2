package com.yandex.div.core.view2.state;

import android.view.View;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import com.yandex.div2.j3;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* compiled from: DivMultipleStateSwitcher.kt */
/* loaded from: classes7.dex */
public final class DivMultipleStateSwitcher implements DivStateSwitcher {
    private final DivBinder divBinder;
    private final Div2View divView;

    public DivMultipleStateSwitcher(Div2View div2View, DivBinder divBinder) {
        this.divView = div2View;
        this.divBinder = divBinder;
    }

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    public void switchStates(j3.b bVar, List<DivStatePath> list, ExpressionResolver expressionResolver) {
        View childAt = this.divView.getChildAt(0);
        a aVar = bVar.a;
        List<DivStatePath> compactPathList$div_release = DivPathUtils.INSTANCE.compactPathList$div_release(list);
        ArrayList<DivStatePath> arrayList = new ArrayList();
        for (Object obj : compactPathList$div_release) {
            if (!((DivStatePath) obj).isRootPath()) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (DivStatePath divStatePath : arrayList) {
            Pair<DivStateLayout, a.m> tryFindStateDivAndLayout$div_release = DivPathUtils.INSTANCE.tryFindStateDivAndLayout$div_release(childAt, bVar, divStatePath, expressionResolver);
            if (tryFindStateDivAndLayout$div_release == null) {
                return;
            }
            DivStateLayout d = tryFindStateDivAndLayout$div_release.d();
            a.m g = tryFindStateDivAndLayout$div_release.g();
            if (d != null && !linkedHashSet.contains(d)) {
                DivStatePath path = d.getPath();
                if (path != null) {
                    divStatePath = path;
                }
                BindingContext bindingContext = d.getBindingContext();
                if (bindingContext == null) {
                    bindingContext = this.divView.getBindingContext$div_release();
                }
                this.divBinder.bind(bindingContext, d, g, divStatePath.parentState());
                linkedHashSet.add(d);
            }
        }
        if (linkedHashSet.isEmpty()) {
            this.divBinder.bind(this.divView.getBindingContext$div_release(), childAt, aVar, DivStatePath.Companion.fromState$div_release(bVar));
        }
        this.divBinder.attachIndicators$div_release();
    }
}
