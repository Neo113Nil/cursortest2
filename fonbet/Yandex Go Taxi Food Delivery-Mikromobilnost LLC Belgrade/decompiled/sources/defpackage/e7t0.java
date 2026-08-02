package defpackage;

import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;

/* loaded from: classes6.dex */
public final /* synthetic */ class e7t0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SolidSummaryView b;

    public /* synthetic */ e7t0(SolidSummaryView solidSummaryView, int i) {
        this.a = i;
        this.b = solidSummaryView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 _init_$lambda$13;
        boolean insetsCancellable$lambda$0;
        FloatButtonIconComponent floatButtonIconComponent;
        FloatButtonIconComponent floatButtonIconComponent2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        SolidSummaryView solidSummaryView = this.b;
        switch (i) {
            case 0:
                _init_$lambda$13 = SolidSummaryView._init_$lambda$13(solidSummaryView, (vgv0) obj);
                break;
            case 1:
                insetsCancellable$lambda$0 = SolidSummaryView.insetsCancellable$lambda$0(solidSummaryView, (t1w) obj);
                break;
            case 2:
                floatButtonIconComponent = solidSummaryView.summaryRouteButton;
                floatButtonIconComponent.setVisibility(0);
                break;
            default:
                floatButtonIconComponent2 = solidSummaryView.summaryRouteButton;
                floatButtonIconComponent2.setVisibility(0);
                break;
        }
        return zy11Var;
    }
}
