package defpackage;

import com.yandex.go.taxi.order.chat.ui.chat.TaxiOrderChatModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class czx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaxiOrderChatModalView b;

    public /* synthetic */ czx0(TaxiOrderChatModalView taxiOrderChatModalView, int i) {
        this.a = i;
        this.b = taxiOrderChatModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TaxiOrderChatModalView taxiOrderChatModalView = this.b;
        switch (i) {
            case 0:
                TaxiOrderChatModalView.invalidateMessages$lambda$0(taxiOrderChatModalView);
                break;
            default:
                TaxiOrderChatModalView.scrollToEnd$default(taxiOrderChatModalView, false, 1, null);
                break;
        }
    }
}
