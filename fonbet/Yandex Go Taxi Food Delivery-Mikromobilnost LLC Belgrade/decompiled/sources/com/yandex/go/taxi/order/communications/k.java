package com.yandex.go.taxi.order.communications;

import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import defpackage.akz0;
import defpackage.gkz0;
import defpackage.hbp0;
import defpackage.ipf0;
import defpackage.kpf0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.wls;
import defpackage.ypf0;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes14.dex */
public final class k extends f {
    public static final /* synthetic */ int l0 = 0;
    public final ListItemSwitchComponent c0;
    public final ipf0 d0;
    public final ru.yandex.taxi.widget.c e0;
    public final o2y0 f0;
    public final PromoPlaqueAnalytics$Screen g0;
    public final wls h0;
    public final tls i0;
    public pzt0 j0;
    public pzt0 k0;

    public k(ru.yandex.taxi.utils.d dVar, ytz ytzVar, ypf0 ypf0Var, ListItemSwitchComponent listItemSwitchComponent, ipf0 ipf0Var, ru.yandex.taxi.widget.c cVar, o2y0 o2y0Var, PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen, wls wlsVar, tls tlsVar) {
        super(listItemSwitchComponent, dVar, ytzVar, ypf0Var);
        this.c0 = listItemSwitchComponent;
        this.d0 = ipf0Var;
        this.e0 = cVar;
        this.f0 = o2y0Var;
        this.g0 = promoPlaqueAnalytics$Screen;
        this.h0 = wlsVar;
        this.i0 = tlsVar;
    }

    @Override // com.yandex.go.taxi.order.communications.f
    public final void X(kpf0 kpf0Var) {
        super.X(kpf0Var);
        boolean z = kpf0Var.a.g.c != null;
        int i = z ? 0 : 8;
        ListItemSwitchComponent listItemSwitchComponent = this.c0;
        listItemSwitchComponent.setVisibility(i);
        if (z) {
            pzt0 pzt0Var = this.j0;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.j0 = tje.N(this.S.c(), null, null, new ToggleCommunicationsViewHolder$bind$1(kpf0Var, this, null), 3);
            return;
        }
        listItemSwitchComponent.stopProgressAnimation();
        pzt0 pzt0Var2 = this.k0;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
    }

    @Override // com.yandex.go.taxi.order.communications.f
    public final void Z() {
        super.Z();
        this.c0.stopProgressAnimation();
        pzt0 pzt0Var = this.k0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // com.yandex.go.taxi.order.communications.f
    public final void a0(CommunicationItem communicationItem) {
        akz0 akz0Var = communicationItem.g.c;
        if (akz0Var == null) {
            return;
        }
        hbp0.e(this.S, null, null, new ToggleCommunicationsViewHolder$reportPromoPlaqueShown$1(akz0Var, this, communicationItem, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        if (r14 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(gkz0 gkz0Var, FormattedText formattedText, FormattedText formattedText2, ContinuationImpl continuationImpl) {
        ToggleCommunicationsViewHolder$updateFormattedText$2 toggleCommunicationsViewHolder$updateFormattedText$2;
        int i;
        gkz0 gkz0Var2;
        ListItemSwitchComponent listItemSwitchComponent;
        FormattedText formattedText3;
        if (continuationImpl instanceof ToggleCommunicationsViewHolder$updateFormattedText$2) {
            toggleCommunicationsViewHolder$updateFormattedText$2 = (ToggleCommunicationsViewHolder$updateFormattedText$2) continuationImpl;
            int i2 = toggleCommunicationsViewHolder$updateFormattedText$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                toggleCommunicationsViewHolder$updateFormattedText$2.label = i2 - Integer.MIN_VALUE;
                ToggleCommunicationsViewHolder$updateFormattedText$2 toggleCommunicationsViewHolder$updateFormattedText$22 = toggleCommunicationsViewHolder$updateFormattedText$2;
                Object obj = toggleCommunicationsViewHolder$updateFormattedText$22.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = toggleCommunicationsViewHolder$updateFormattedText$22.label;
                ListItemSwitchComponent listItemSwitchComponent2 = this.c0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText4 = gkz0Var.b;
                    if (formattedText4 != null) {
                        formattedText = formattedText4;
                    }
                    if (formattedText != null) {
                        toggleCommunicationsViewHolder$updateFormattedText$22.L$0 = gkz0Var;
                        toggleCommunicationsViewHolder$updateFormattedText$22.L$1 = null;
                        toggleCommunicationsViewHolder$updateFormattedText$22.L$2 = formattedText2;
                        toggleCommunicationsViewHolder$updateFormattedText$22.L$3 = null;
                        toggleCommunicationsViewHolder$updateFormattedText$22.L$4 = listItemSwitchComponent2;
                        toggleCommunicationsViewHolder$updateFormattedText$22.label = 1;
                        obj = ru.yandex.taxi.widget.c.e(this.e0, formattedText, null, false, toggleCommunicationsViewHolder$updateFormattedText$22, 30);
                        if (obj != coroutineSingletons) {
                            gkz0Var2 = gkz0Var;
                            listItemSwitchComponent = listItemSwitchComponent2;
                        }
                        return coroutineSingletons;
                    }
                    FormattedText formattedText5 = gkz0Var.c;
                    formattedText3 = formattedText5 == null ? formattedText2 : formattedText5;
                    if (formattedText3 != null) {
                        toggleCommunicationsViewHolder$updateFormattedText$22.L$0 = null;
                        toggleCommunicationsViewHolder$updateFormattedText$22.L$1 = null;
                        toggleCommunicationsViewHolder$updateFormattedText$22.L$2 = null;
                        toggleCommunicationsViewHolder$updateFormattedText$22.L$3 = null;
                        toggleCommunicationsViewHolder$updateFormattedText$22.L$4 = listItemSwitchComponent2;
                        toggleCommunicationsViewHolder$updateFormattedText$22.label = 2;
                        obj = ru.yandex.taxi.widget.c.e(this.e0, formattedText3, null, false, toggleCommunicationsViewHolder$updateFormattedText$22, 30);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    listItemSwitchComponent2 = (ListItemSwitchComponent) toggleCommunicationsViewHolder$updateFormattedText$22.L$4;
                    kotlin.b.b(obj);
                    listItemSwitchComponent2.setSubtitle((CharSequence) obj);
                    return zy11.a;
                }
                listItemSwitchComponent = (ListItemSwitchComponent) toggleCommunicationsViewHolder$updateFormattedText$22.L$4;
                formattedText2 = (FormattedText) toggleCommunicationsViewHolder$updateFormattedText$22.L$2;
                gkz0Var2 = (gkz0) toggleCommunicationsViewHolder$updateFormattedText$22.L$0;
                kotlin.b.b(obj);
                listItemSwitchComponent.setTitle((CharSequence) obj);
                gkz0Var = gkz0Var2;
                FormattedText formattedText52 = gkz0Var.c;
                if (formattedText52 == null) {
                }
                if (formattedText3 != null) {
                }
                return zy11.a;
            }
        }
        toggleCommunicationsViewHolder$updateFormattedText$2 = new ToggleCommunicationsViewHolder$updateFormattedText$2(this, continuationImpl);
        ToggleCommunicationsViewHolder$updateFormattedText$2 toggleCommunicationsViewHolder$updateFormattedText$222 = toggleCommunicationsViewHolder$updateFormattedText$2;
        Object obj2 = toggleCommunicationsViewHolder$updateFormattedText$222.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = toggleCommunicationsViewHolder$updateFormattedText$222.label;
        ListItemSwitchComponent listItemSwitchComponent22 = this.c0;
        if (i != 0) {
        }
        listItemSwitchComponent.setTitle((CharSequence) obj2);
        gkz0Var = gkz0Var2;
        FormattedText formattedText522 = gkz0Var.c;
        if (formattedText522 == null) {
        }
        if (formattedText3 != null) {
        }
        return zy11.a;
    }
}
