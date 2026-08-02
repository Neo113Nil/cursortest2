package defpackage;

import com.yandex.go.taxi.order.tariff_upgrade.ui.TariffUpgradeModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class ppx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ upx0 b;

    public /* synthetic */ ppx0(upx0 upx0Var, int i) {
        this.a = i;
        this.b = upx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        upx0 upx0Var = this.b;
        switch (i) {
            case 0:
                TariffUpgradeModalView.updateDetailsButton$lambda$0$detailsButtonClicked(upx0Var);
                break;
            default:
                TariffUpgradeModalView.onAttachedToWindow$doneButtonClicked(upx0Var);
                break;
        }
    }
}
