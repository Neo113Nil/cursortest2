package defpackage;

import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;

/* loaded from: classes6.dex */
public final class j7t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SolidSummaryView b;

    public /* synthetic */ j7t0(SolidSummaryView solidSummaryView, int i) {
        this.a = i;
        this.b = solidSummaryView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t7t0 t7t0Var;
        int i = this.a;
        SolidSummaryView solidSummaryView = this.b;
        switch (i) {
            case 0:
                solidSummaryView.refreshFocusSequence();
                break;
            case 1:
                solidSummaryView.onRevealFinished();
                break;
            case 2:
                t7t0Var = solidSummaryView.binding;
                t7t0Var.p.sendAccessibilityEvent(8);
                break;
            default:
                solidSummaryView.runWhenOpen(new j7t0(solidSummaryView, 0));
                break;
        }
    }
}
