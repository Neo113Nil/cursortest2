package defpackage;

import android.animation.Animator;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;

/* loaded from: classes14.dex */
public final /* synthetic */ class gik0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RideCardDriverSectionView b;

    public /* synthetic */ gik0(RideCardDriverSectionView rideCardDriverSectionView, int i) {
        this.a = i;
        this.b = rideCardDriverSectionView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 plateDisappearAnimator$lambda$0$0;
        zy11 updateDriverSubtitle$lambda$0$0;
        zy11 subtitleAppearAnimator$lambda$0$0;
        zy11 plateAppearAnimator$lambda$0$0;
        zy11 subtitleDisappearAnimator$lambda$0$0;
        int i = this.a;
        RideCardDriverSectionView rideCardDriverSectionView = this.b;
        switch (i) {
            case 0:
                plateDisappearAnimator$lambda$0$0 = RideCardDriverSectionView.getPlateDisappearAnimator$lambda$0$0(rideCardDriverSectionView, ((Float) obj).floatValue());
                return plateDisappearAnimator$lambda$0$0;
            case 1:
                updateDriverSubtitle$lambda$0$0 = RideCardDriverSectionView.updateDriverSubtitle$lambda$0$0(rideCardDriverSectionView, (Animator) obj);
                return updateDriverSubtitle$lambda$0$0;
            case 2:
                subtitleAppearAnimator$lambda$0$0 = RideCardDriverSectionView.getSubtitleAppearAnimator$lambda$0$0(rideCardDriverSectionView, ((Float) obj).floatValue());
                return subtitleAppearAnimator$lambda$0$0;
            case 3:
                plateAppearAnimator$lambda$0$0 = RideCardDriverSectionView.getPlateAppearAnimator$lambda$0$0(rideCardDriverSectionView, ((Float) obj).floatValue());
                return plateAppearAnimator$lambda$0$0;
            default:
                subtitleDisappearAnimator$lambda$0$0 = RideCardDriverSectionView.getSubtitleDisappearAnimator$lambda$0$0(rideCardDriverSectionView, ((Float) obj).floatValue());
                return subtitleDisappearAnimator$lambda$0$0;
        }
    }
}
