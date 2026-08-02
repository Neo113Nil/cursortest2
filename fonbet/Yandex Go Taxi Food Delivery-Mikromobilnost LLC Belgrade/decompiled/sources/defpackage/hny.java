package defpackage;

import ru.yandex.taxi.linked_order.modals.info.LinkedOrderInfoModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class hny implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ony b;

    public /* synthetic */ hny(ony onyVar, int i) {
        this.a = i;
        this.b = onyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ony onyVar = this.b;
        switch (i) {
            case 0:
                LinkedOrderInfoModalView._init_$backToMapClicked(onyVar);
                break;
            case 1:
                LinkedOrderInfoModalView._init_$focusToCurrentOrder(onyVar);
                break;
            case 2:
                LinkedOrderInfoModalView._init_$doneOrderClicked(onyVar);
                break;
            case 3:
                LinkedOrderInfoModalView._init_$callButtonClicked(onyVar);
                break;
            case 4:
                LinkedOrderInfoModalView._init_$callTrustingContactButtonClicked(onyVar);
                break;
            default:
                ((nny) onyVar.Dg()).td(true);
                break;
        }
    }
}
