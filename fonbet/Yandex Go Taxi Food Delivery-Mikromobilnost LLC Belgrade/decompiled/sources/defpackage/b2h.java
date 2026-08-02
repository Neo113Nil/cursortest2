package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoParams;
import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2Fragment;
import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2Params;
import com.ybsdk.feature.kyc.internal.screens.photov3.PhotoFragment;
import com.ybsdk.feature.kyc.internal.screens.photov3.PhotoParams;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class b2h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ gnx b;

    public /* synthetic */ b2h(gnx gnxVar, int i) {
        this.a = i;
        this.b = gnxVar;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        FragmentScreen fragmentScreen;
        int i = this.a;
        x0h x0hVar = x0h.a;
        gnx gnxVar = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.DocumentsOnline)) {
                    return x0hVar;
                }
                DeeplinkAction.DocumentsOnline documentsOnline = (DeeplinkAction.DocumentsOnline) baseDeeplinkAction;
                String applicationId = documentsOnline.getApplicationId();
                String applicationType = documentsOnline.getApplicationType();
                String documentGroup = documentsOnline.getDocumentGroup();
                gnxVar.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("PhotoScreen", false, new PhotoParams(applicationId, applicationType, documentGroup), null, qoi0.a(PhotoFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null)), null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.KycOnlineCamera)) {
                    return x0hVar;
                }
                DeeplinkAction.KycOnlineCamera kycOnlineCamera = (DeeplinkAction.KycOnlineCamera) baseDeeplinkAction;
                String applicationId2 = kycOnlineCamera.getApplicationId();
                String applicationType2 = kycOnlineCamera.getApplicationType();
                wcp0 wcp0Var = gnxVar.b;
                if (applicationType2 != null) {
                    wcp0Var.getClass();
                    fragmentScreen = new FragmentScreen("KycPhotoV2Screen", false, new KycPhotoV2Params(applicationId2), null, qoi0.a(KycPhotoV2Fragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null);
                } else {
                    wcp0Var.getClass();
                    fragmentScreen = new FragmentScreen("KycPhotoScreen", false, new KycPhotoParams(applicationId2), null, qoi0.a(KycPhotoFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null);
                }
                return new v0h(Collections.singletonList(fragmentScreen), null, 6);
        }
    }
}
