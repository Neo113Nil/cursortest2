package defpackage;

import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;

/* loaded from: classes14.dex */
public final /* synthetic */ class mxx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaxiOnTheWayStateView b;
    public final /* synthetic */ String c;

    public /* synthetic */ mxx0(TaxiOnTheWayStateView taxiOnTheWayStateView, String str, int i) {
        this.a = i;
        this.b = taxiOnTheWayStateView;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        TaxiOnTheWayStateView taxiOnTheWayStateView = this.b;
        switch (i) {
            case 0:
                taxiOnTheWayStateView.showMultiorderTooltipInternal(str);
                break;
            default:
                taxiOnTheWayStateView.showMultiorderTooltipWithoutDismissDelayInternal(str);
                break;
        }
    }
}
