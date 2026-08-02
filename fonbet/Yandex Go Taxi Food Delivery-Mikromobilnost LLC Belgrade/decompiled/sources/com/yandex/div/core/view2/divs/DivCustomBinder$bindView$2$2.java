package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import defpackage.clk;
import defpackage.rvo;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lzy11;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
final class DivCustomBinder$bindView$2$2 extends Lambda implements tls {
    final /* synthetic */ clk $divValue;
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ com.yandex.div.core.state.b $path;
    final /* synthetic */ rvo $resolver;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivCustomBinder$bindView$2$2(g gVar, clk clkVar, Div2View div2View, rvo rvoVar, com.yandex.div.core.state.b bVar) {
        super(1);
        this.this$0 = gVar;
        this.$divValue = clkVar;
        this.$divView = div2View;
        this.$resolver = rvoVar;
        this.$path = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.this$0.w.bindView((View) obj, this.$divValue, this.$divView, this.$resolver, this.$path);
        return zy11.a;
    }
}
