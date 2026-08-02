package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.customview;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import defpackage.c5l;
import defpackage.clk;
import defpackage.f5l;
import defpackage.ngd0;
import defpackage.plk;
import defpackage.pmf;
import defpackage.qmf;
import defpackage.rmf;
import defpackage.rvo;
import defpackage.zh5;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/customview/DivCustomContainerViewAdapterImpl;", "Lplk;", "Lqmf;", "customViewFactoryDelegateCreator", "", "", "", "customViewConfigurations", "Lzh5;", "bduiVariableController", "<init>", "(Lqmf;Ljava/util/Map;Lzh5;)V", "type", "", "isCustomTypeSupported", "(Ljava/lang/String;)Z", "Lclk;", "div", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lrvo;", "expressionResolver", "Lcom/yandex/div/core/state/b;", StateEntry.COLUMN_PATH, "Landroid/view/View;", "createView", "(Lclk;Lcom/yandex/div/core/view2/Div2View;Lrvo;Lcom/yandex/div/core/state/b;)Landroid/view/View;", "view", "Lzy11;", "bindView", "(Landroid/view/View;Lclk;Lcom/yandex/div/core/view2/Div2View;Lrvo;Lcom/yandex/div/core/state/b;)V", "release", "(Landroid/view/View;Lclk;)V", "Lpmf;", "customViewDelegate", "Lpmf;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivCustomContainerViewAdapterImpl implements plk {
    private final pmf customViewDelegate;

    public DivCustomContainerViewAdapterImpl(qmf qmfVar, Map<String, Object> map, zh5 zh5Var) {
        this.customViewDelegate = ((rmf) qmfVar).a(zh5Var, map);
    }

    @Override // defpackage.plk
    public void bindView(View view, clk div, Div2View divView, rvo expressionResolver, b path) {
        this.customViewDelegate.a(new DivCustomActionHandlerImpl(divView), div.j, view, new BduiExpressionResolverImpl(expressionResolver));
    }

    @Override // defpackage.plk
    public View createView(clk div, Div2View divView, rvo expressionResolver, b path) {
        return this.customViewDelegate.b(div.j, divView.getContext(), div.i);
    }

    @Override // defpackage.plk
    public boolean isCustomTypeSupported(String type) {
        return this.customViewDelegate.d(type);
    }

    @Override // defpackage.plk
    public f5l preload(clk clkVar, c5l c5lVar) {
        return ngd0.x;
    }

    @Override // defpackage.plk
    public void release(View view, clk div) {
    }
}
