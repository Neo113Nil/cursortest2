package defpackage;

import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;

/* loaded from: classes6.dex */
public final /* synthetic */ class h7t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SolidSummaryView b;

    public /* synthetic */ h7t0(SolidSummaryView solidSummaryView, int i) {
        this.a = i;
        this.b = solidSummaryView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SolidSummaryView solidSummaryView = this.b;
        switch (i) {
            case 0:
                solidSummaryView.refreshBottomOffset();
                break;
            case 1:
                SolidSummaryView._init_$lambda$6(solidSummaryView);
                break;
            case 2:
                SolidSummaryView._init_$lambda$7(solidSummaryView);
                break;
            case 3:
                solidSummaryView.onPaymentMethodClicked();
                break;
            case 4:
                SolidSummaryView._init_$lambda$11(solidSummaryView);
                break;
            case 5:
                solidSummaryView.onRequirementsClick();
                break;
            default:
                solidSummaryView.toggleSummaryStateByHandlerTap();
                break;
        }
    }
}
