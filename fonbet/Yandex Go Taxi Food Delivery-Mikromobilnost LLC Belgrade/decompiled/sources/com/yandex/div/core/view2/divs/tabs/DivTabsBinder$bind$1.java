package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import defpackage.mdl;
import defpackage.rvo;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
final class DivTabsBinder$bind$1 extends Lambda implements tls {
    final /* synthetic */ mdl $div;
    final /* synthetic */ rvo $resolver;
    final /* synthetic */ DivTabsLayout $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivTabsBinder$bind$1(DivTabsLayout divTabsLayout, mdl mdlVar, rvo rvoVar) {
        super(1);
        this.$this_bind = divTabsLayout;
        this.$div = mdlVar;
        this.$resolver = rvoVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        com.yandex.div.core.view2.divs.a.e(this.$this_bind.getDivider(), this.$div.A, this.$resolver);
        return zy11.a;
    }
}
