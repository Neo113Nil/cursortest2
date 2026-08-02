package defpackage;

import ru.yandex.taxi.plus.purchase.PlusPurchaseView;
import ru.yandex.taxi.plus.purchase.d;

/* loaded from: classes6.dex */
public final /* synthetic */ class pjd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ pjd0(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                PlusPurchaseView._init_$conditionsItemClicked(dVar);
                break;
            case 1:
                PlusPurchaseView._init_$subscribeActionClicked(dVar);
                break;
            default:
                dVar.x.a(((bkd0) dVar.C.b).b, false);
                break;
        }
    }
}
