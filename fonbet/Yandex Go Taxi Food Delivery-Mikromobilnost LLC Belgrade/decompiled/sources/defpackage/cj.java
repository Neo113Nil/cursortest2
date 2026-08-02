package defpackage;

import com.yandex.go.taxi.order.util.accordion.AccordionComponent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class cj implements rqs0, jms {
    public final /* synthetic */ AccordionComponent a;

    public cj(AccordionComponent accordionComponent) {
        this.a = accordionComponent;
    }

    @Override // defpackage.rqs0
    public final void a(nqs0 nqs0Var, wss0 wss0Var) {
        this.a.onHeaderClickListener(nqs0Var, wss0Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof rqs0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, AccordionComponent.class, "onHeaderClickListener", "onHeaderClickListener(Lcom/yandex/go/slot/api/action/SlotItemAction;Lcom/yandex/go/slot/api/ui/SlotItemUiState$UiEvent;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
