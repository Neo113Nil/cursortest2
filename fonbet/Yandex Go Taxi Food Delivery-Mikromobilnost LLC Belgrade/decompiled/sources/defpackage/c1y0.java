package defpackage;

import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedScrollUpButton;

/* loaded from: classes14.dex */
public final class c1y0 extends iq60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaxiOrderFeedScrollUpButton b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1y0(TaxiOrderFeedScrollUpButton taxiOrderFeedScrollUpButton, int i) {
        super(4);
        this.a = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.b = taxiOrderFeedScrollUpButton;
                super(bool);
                break;
            default:
                this.b = taxiOrderFeedScrollUpButton;
                break;
        }
    }

    @Override // defpackage.iq60
    public final void afterChange(kgx kgxVar, Object obj, Object obj2) {
        int i = this.a;
        TaxiOrderFeedScrollUpButton taxiOrderFeedScrollUpButton = this.b;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ((Number) obj).intValue();
                taxiOrderFeedScrollUpButton.tryToInvalidateIcon();
                break;
            default:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                taxiOrderFeedScrollUpButton.tryToInvalidateIcon();
                break;
        }
    }
}
