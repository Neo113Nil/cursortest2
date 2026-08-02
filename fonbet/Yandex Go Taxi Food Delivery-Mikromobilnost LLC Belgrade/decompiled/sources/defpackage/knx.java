package defpackage;

import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.e;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class knx implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ KycPhotoFragment b;

    public /* synthetic */ knx(KycPhotoFragment kycPhotoFragment, int i) {
        this.a = i;
        this.b = kycPhotoFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        e constraintSetLandscape270_delegate$lambda$8;
        pey viewLifecycleOwner;
        PreviewView onViewCreated$lambda$12;
        e constraintSetPortrait_delegate$lambda$4;
        e constraintSetLandscape90_delegate$lambda$6;
        int i = this.a;
        KycPhotoFragment kycPhotoFragment = this.b;
        switch (i) {
            case 0:
                constraintSetLandscape270_delegate$lambda$8 = KycPhotoFragment.constraintSetLandscape270_delegate$lambda$8(kycPhotoFragment);
                return constraintSetLandscape270_delegate$lambda$8;
            case 1:
                viewLifecycleOwner = kycPhotoFragment.getViewLifecycleOwner();
                return viewLifecycleOwner;
            case 2:
                onViewCreated$lambda$12 = KycPhotoFragment.onViewCreated$lambda$12(kycPhotoFragment);
                return onViewCreated$lambda$12;
            case 3:
                constraintSetPortrait_delegate$lambda$4 = KycPhotoFragment.constraintSetPortrait_delegate$lambda$4(kycPhotoFragment);
                return constraintSetPortrait_delegate$lambda$4;
            default:
                constraintSetLandscape90_delegate$lambda$6 = KycPhotoFragment.constraintSetLandscape90_delegate$lambda$6(kycPhotoFragment);
                return constraintSetLandscape90_delegate$lambda$6;
        }
    }
}
