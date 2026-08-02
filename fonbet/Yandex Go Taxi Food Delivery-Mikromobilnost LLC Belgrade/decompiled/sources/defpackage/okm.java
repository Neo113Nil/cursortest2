package defpackage;

import com.yandex.go.navigator.driving.DrivingModalView;
import com.yandex.go.navigator.driving.DrivingTimeTextView;
import ru.yandex.taxi.design.FloatButtonIconComponent;

/* loaded from: classes12.dex */
public final /* synthetic */ class okm implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrivingModalView b;

    public /* synthetic */ okm(DrivingModalView drivingModalView, int i) {
        this.a = i;
        this.b = drivingModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        DrivingTimeTextView[] sizeAwareTextViews_delegate$lambda$0;
        int scrollViewMaxHeight_delegate$lambda$0;
        FloatButtonIconComponent incidentsButton_delegate$lambda$0;
        zy11 onAttachedToWindow$lambda$1;
        int i = this.a;
        DrivingModalView drivingModalView = this.b;
        switch (i) {
            case 0:
                sizeAwareTextViews_delegate$lambda$0 = DrivingModalView.sizeAwareTextViews_delegate$lambda$0(drivingModalView);
                return sizeAwareTextViews_delegate$lambda$0;
            case 1:
                scrollViewMaxHeight_delegate$lambda$0 = DrivingModalView.scrollViewMaxHeight_delegate$lambda$0(drivingModalView);
                break;
            case 2:
                incidentsButton_delegate$lambda$0 = DrivingModalView.incidentsButton_delegate$lambda$0(drivingModalView);
                return incidentsButton_delegate$lambda$0;
            case 3:
                onAttachedToWindow$lambda$1 = DrivingModalView.onAttachedToWindow$lambda$1(drivingModalView);
                return onAttachedToWindow$lambda$1;
            case 4:
                scrollViewMaxHeight_delegate$lambda$0 = DrivingModalView.bubbleBottomMargin_delegate$lambda$0(drivingModalView);
                break;
            case 5:
                scrollViewMaxHeight_delegate$lambda$0 = DrivingModalView.baseBubbleHorizontalMargin_delegate$lambda$0(drivingModalView);
                break;
            default:
                scrollViewMaxHeight_delegate$lambda$0 = DrivingModalView.horizontalButtonsMargin_delegate$lambda$0(drivingModalView);
                break;
        }
        return Integer.valueOf(scrollViewMaxHeight_delegate$lambda$0);
    }
}
