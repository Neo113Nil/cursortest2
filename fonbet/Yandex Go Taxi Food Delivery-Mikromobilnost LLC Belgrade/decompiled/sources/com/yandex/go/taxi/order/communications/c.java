package com.yandex.go.taxi.order.communications;

import android.view.View;
import defpackage.akz0;
import defpackage.hbp0;
import defpackage.kpf0;
import defpackage.pzt0;
import defpackage.tje;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes14.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ f c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ c(View view, f fVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = view;
        this.c = fVar;
        this.w = obj;
        this.x = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.x;
        Object obj2 = this.w;
        f fVar = this.c;
        View view = this.b;
        switch (i) {
            case 0:
                ButtonComponent buttonComponent = (ButtonComponent) view;
                e eVar = (e) fVar;
                buttonComponent.startProgress();
                hbp0 hbp0Var = eVar.S;
                hbp0Var.f();
                tje.N(hbp0Var.c(), null, null, new ActionButtonsCommunicationsViewHolder$onClickWhenDirectOffer$1$1(eVar, (ActionButton.f) obj2, buttonComponent, (CommunicationItem) obj, null), 3);
                break;
            default:
                ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) view;
                k kVar = (k) fVar;
                akz0 akz0Var = (akz0) obj2;
                kpf0 kpf0Var = (kpf0) obj;
                if (listItemSwitchComponent.isEnabled()) {
                    pzt0 pzt0Var = kVar.k0;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    listItemSwitchComponent.toggle();
                    listItemSwitchComponent.startProgressAnimation();
                    listItemSwitchComponent.setEnabled(false);
                    kVar.k0 = tje.N(kVar.S.c(), null, null, new ToggleCommunicationsViewHolder$bindInternal$2$1$1$1(kVar, akz0Var, listItemSwitchComponent, kpf0Var, null), 3);
                    break;
                }
                break;
        }
    }
}
