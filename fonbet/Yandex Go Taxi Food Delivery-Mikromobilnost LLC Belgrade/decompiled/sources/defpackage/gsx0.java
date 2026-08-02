package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;

/* loaded from: classes6.dex */
public final /* synthetic */ class gsx0 implements jms {
    public final /* synthetic */ TariffsRibbonView a;

    public gsx0(TariffsRibbonView tariffsRibbonView) {
        this.a = tariffsRibbonView;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gsx0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, TariffsRibbonView.class, "onViewHolderClicked", "onViewHolderClicked(Lru/yandex/taxi/preorder/summary/selector/ui/ribbon/holder/BaseTariffViewHolder;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
