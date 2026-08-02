package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;

/* loaded from: classes14.dex */
public final /* synthetic */ class hik0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RideCardDriverSectionView b;

    public /* synthetic */ hik0(RideCardDriverSectionView rideCardDriverSectionView, int i) {
        this.a = i;
        this.b = rideCardDriverSectionView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int carImageEndPadding_delegate$lambda$0;
        zy11 plateDisappearAnimator$lambda$0$1;
        zy11 plateAppearAnimator$lambda$0$1;
        int i = this.a;
        RideCardDriverSectionView rideCardDriverSectionView = this.b;
        switch (i) {
            case 0:
                carImageEndPadding_delegate$lambda$0 = RideCardDriverSectionView.carImageEndPadding_delegate$lambda$0(rideCardDriverSectionView);
                break;
            case 1:
                plateDisappearAnimator$lambda$0$1 = RideCardDriverSectionView.getPlateDisappearAnimator$lambda$0$1(rideCardDriverSectionView);
                return plateDisappearAnimator$lambda$0$1;
            case 2:
                plateAppearAnimator$lambda$0$1 = RideCardDriverSectionView.getPlateAppearAnimator$lambda$0$1(rideCardDriverSectionView);
                return plateAppearAnimator$lambda$0$1;
            case 3:
                carImageEndPadding_delegate$lambda$0 = RideCardDriverSectionView.avatarImageHeightHalf_delegate$lambda$0(rideCardDriverSectionView);
                break;
            default:
                carImageEndPadding_delegate$lambda$0 = RideCardDriverSectionView.carPlateAnimationStartTranslation_delegate$lambda$0(rideCardDriverSectionView);
                break;
        }
        return Integer.valueOf(carImageEndPadding_delegate$lambda$0);
    }
}
