package com.yandex.div.core.view2.reuse.util;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.a;
import java.util.List;
import xsna.e9e0;

/* compiled from: RebindUtils.kt */
/* loaded from: classes7.dex */
public final class RebindUtilsKt {
    public static final boolean tryRebindPlainContainerChildren(ViewGroup viewGroup, Div2View div2View, List<DivItemBuilderResult> list, e9e0<DivViewCreator> e9e0Var) {
        ReusableTokenList currentRebindReusableList$div_release = div2View.getCurrentRebindReusableList$div_release();
        if (currentRebindReusableList$div_release == null) {
            return false;
        }
        viewGroup.removeAllViews();
        for (DivItemBuilderResult divItemBuilderResult : list) {
            View uniqueViewForDiv = currentRebindReusableList$div_release.getUniqueViewForDiv(divItemBuilderResult.getDiv());
            if (uniqueViewForDiv == null) {
                uniqueViewForDiv = e9e0Var.get().create(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            viewGroup.addView(uniqueViewForDiv);
        }
        return true;
    }

    public static final boolean tryRebindRecycleContainerChildren(ViewGroup viewGroup, Div2View div2View, a aVar) {
        View uniqueViewForDiv;
        ReusableTokenList currentRebindReusableList$div_release = div2View.getCurrentRebindReusableList$div_release();
        if (currentRebindReusableList$div_release == null || (uniqueViewForDiv = currentRebindReusableList$div_release.getUniqueViewForDiv(aVar)) == null) {
            return false;
        }
        viewGroup.addView(uniqueViewForDiv);
        return true;
    }
}
