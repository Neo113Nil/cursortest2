package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.auth.ui.fastlogin.VkFastLoginView;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.log.L;
import com.vk.profile.user.impl.di.UserProfileComponentImpl;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.toggle.features.CatalogFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import java.lang.annotation.Annotation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class w0o0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ w0o0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                FeedFeatures feedFeatures = FeedFeatures.MVI_USER;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 2:
                qcy<Object>[] qcyVarArr = UserProfileComponentImpl.m;
                return new std0();
            case 3:
                CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
                catalogFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(catalogFeatures));
            case 4:
                return Integer.valueOf((int) x5r0.a(14, 1));
            case 5:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return Integer.valueOf(context.getColor(R.color.vk_blue_200));
            case 6:
                return Preference.f("video-subtitles-state");
            case 7:
                qcy<Object>[] qcyVarArr2 = VideoView.T0;
                return new mzr0();
            case 8:
                Bundle bundle = new Bundle();
                bundle.putParcelable("open_target_folder", FolderType.CHANNELS);
                return bundle;
            case 9:
                return new tub0(fpf0.a(dko.class), new Annotation[0]);
            case 10:
                return new bsp(VkCellSkeleton$Left$Main.Size.values(), "com.vk.core.view.components.cell.VkCellSkeleton.Left.Main.Size");
            case 11:
                int i = VkFastLoginView.v;
                TrackingElement.Registration registration = TrackingElement.Registration.PHONE_NUMBER;
                RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
                return new com.vk.registration.funnels.d(registration);
            case 12:
                return new pco(0);
            case 13:
                L.A("VoipCallView", "declineOrHang decline video call button called");
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                com.vk.voip.ui.c.C(cVar, null, 0L, false, true, true, null, 207);
                return s3q0.a;
            default:
                int i2 = c2x0.o1;
                return new e3x0();
        }
    }
}
