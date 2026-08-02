package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import defpackage.h8;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/Div2ViewLocator;", "", "<init>", "()V", "findByDataTag", "Lcom/yandex/div/core/view2/Div2View;", "dataTagId", "", "root", "Landroid/view/View;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Div2ViewLocator {
    public final Div2View findByDataTag(String dataTagId, View root) {
        if (root instanceof Div2View) {
            Div2View div2View = (Div2View) root;
            if (jl40.l(div2View.getDataTag().a, dataTagId)) {
                return div2View;
            }
        }
        if (root instanceof ViewGroup) {
            h8 h8Var = new h8(3, (ViewGroup) root);
            while (h8Var.hasNext()) {
                Div2View findByDataTag = findByDataTag(dataTagId, (View) h8Var.next());
                if (findByDataTag != null) {
                    return findByDataTag;
                }
            }
        }
        return null;
    }
}
