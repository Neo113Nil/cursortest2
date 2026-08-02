package defpackage;

import ru.yandex.taxi.analytics.j;

/* loaded from: classes5.dex */
public final class gde {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gde(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b1) obj).m("pay_on_delivery", null, null);
                break;
            default:
                ((j) ((lx4) obj)).d("Summary.Requirements.PayOnDeliveryTapped").m();
                break;
        }
    }
}
