package defpackage;

import android.view.View;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;

/* loaded from: classes6.dex */
public final /* synthetic */ class g7t0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SolidSummaryView b;

    public /* synthetic */ g7t0(SolidSummaryView solidSummaryView, int i) {
        this.a = i;
        this.b = solidSummaryView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View view;
        View _init_$lambda$0;
        View _init_$lambda$1;
        zy11 attachSummaryExpandedView$lambda$0;
        View focusedExpandedView;
        View focusedExpandedView2;
        View focusedExpandedView3;
        FloatButtonIconComponent floatButtonIconComponent;
        FloatButtonIconComponent floatButtonIconComponent2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        SolidSummaryView solidSummaryView = this.b;
        switch (i) {
            case 0:
                view = SolidSummaryView.topRightViewProvider$lambda$0(solidSummaryView);
                break;
            case 1:
                _init_$lambda$0 = SolidSummaryView._init_$lambda$0(solidSummaryView);
                break;
            case 2:
                _init_$lambda$1 = SolidSummaryView._init_$lambda$1(solidSummaryView);
                break;
            case 3:
                attachSummaryExpandedView$lambda$0 = SolidSummaryView.attachSummaryExpandedView$lambda$0(solidSummaryView);
                break;
            case 4:
                focusedExpandedView = solidSummaryView.getFocusedExpandedView();
                break;
            case 5:
                focusedExpandedView2 = solidSummaryView.getFocusedExpandedView();
                break;
            case 6:
                focusedExpandedView3 = solidSummaryView.getFocusedExpandedView();
                break;
            case 7:
                floatButtonIconComponent = solidSummaryView.summaryRouteButton;
                floatButtonIconComponent.setVisibility(8);
                break;
            default:
                floatButtonIconComponent2 = solidSummaryView.summaryRouteButton;
                floatButtonIconComponent2.setVisibility(8);
                break;
        }
        return zy11Var;
    }
}
