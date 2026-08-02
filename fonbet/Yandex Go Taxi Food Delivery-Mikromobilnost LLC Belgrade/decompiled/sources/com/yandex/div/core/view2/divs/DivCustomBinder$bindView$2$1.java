package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.Div2View;
import defpackage.clk;
import defpackage.rvo;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DivCustomBinder$bindView$2$1 extends Lambda implements sls {
    final /* synthetic */ clk $divValue;
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ com.yandex.div.core.state.b $path;
    final /* synthetic */ rvo $resolver;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivCustomBinder$bindView$2$1(g gVar, clk clkVar, Div2View div2View, rvo rvoVar, com.yandex.div.core.state.b bVar) {
        super(0);
        this.this$0 = gVar;
        this.$divValue = clkVar;
        this.$divView = div2View;
        this.$resolver = rvoVar;
        this.$path = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return this.this$0.w.createView(this.$divValue, this.$divView, this.$resolver, this.$path);
    }
}
