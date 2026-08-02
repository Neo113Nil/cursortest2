package defpackage;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;

/* loaded from: classes6.dex */
public final /* synthetic */ class o7t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SolidSummaryView b;
    public final /* synthetic */ SummaryExpandReason c;

    public /* synthetic */ o7t0(SolidSummaryView solidSummaryView, SummaryExpandReason summaryExpandReason, int i) {
        this.a = i;
        this.b = solidSummaryView;
        this.c = summaryExpandReason;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SummaryExpandReason summaryExpandReason = this.c;
        SolidSummaryView solidSummaryView = this.b;
        switch (i) {
            case 0:
                solidSummaryView.tryExpandToPager(summaryExpandReason);
                break;
            default:
                solidSummaryView.showCurrentTariffCard(summaryExpandReason);
                break;
        }
    }
}
