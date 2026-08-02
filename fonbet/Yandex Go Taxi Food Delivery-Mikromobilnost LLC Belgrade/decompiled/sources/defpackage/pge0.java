package defpackage;

import com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class pge0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreGeoAuthOnboardingModalView b;

    public /* synthetic */ pge0(PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView, int i) {
        this.a = i;
        this.b = preGeoAuthOnboardingModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView = this.b;
        switch (i) {
            case 0:
                preGeoAuthOnboardingModalView.updateAgreementScrollFadeVisibility();
                break;
            case 1:
                preGeoAuthOnboardingModalView.updateAgreementScrollFadeVisibility();
                break;
            default:
                PreGeoAuthOnboardingModalView.setupButton$lambda$0$0(preGeoAuthOnboardingModalView);
                break;
        }
    }
}
