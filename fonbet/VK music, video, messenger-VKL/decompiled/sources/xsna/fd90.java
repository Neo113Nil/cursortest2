package xsna;

import android.content.Context;
import android.graphics.RectF;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.auth.ui.fastlogin.VkFastLoginView;
import com.vk.core.view.components.cell.VkCellSkeleton$Middle$Size;
import com.vk.im.ui.views.StencilLayout;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.profile.user.impl.di.UserProfileComponentImpl;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.lang.annotation.Annotation;
import xsna.hdm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fd90 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ fd90(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        HandleGatewayEventResponse initialize$lambda$220$lambda$144;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return ((NewsFeedComponent) ((k7m) m7m.f(iuc0.b)).a(fpf0.a(NewsFeedComponent.class))).ib();
            case 2:
                return new dkd0(0);
            case 3:
                fxc0.B().T().C(!fxc0.B().T().y());
                return s3q0.a;
            case 4:
                FeedFeatures feedFeatures = FeedFeatures.FRIEND_LIKES_INLINE;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 5:
                return s3q0.a;
            case 6:
                initialize$lambda$220$lambda$144 = ServiceProvider.initialize$lambda$220$lambda$144();
                return initialize$lambda$220$lambda$144;
            case 7:
                int i = StencilLayout.i;
                return new RectF();
            case 8:
                return new z4l0();
            case 9:
                int i2 = StoryReactionViewGroup.s;
                return s3q0.a;
            case 10:
                return e43.l(hdm0.b.c, hdm0.a.c);
            case 11:
                r55 r55Var = r55.a;
                Object i3 = r55.i();
                qou0 qou0Var = i3 instanceof qou0 ? (qou0) i3 : null;
                if (qou0Var != null) {
                    return qou0Var.a();
                }
                return null;
            case 12:
                return "executeUploading: recoverable invocation error occurred";
            case 13:
                qcy<Object>[] qcyVarArr = UserProfileComponentImpl.m;
                return new jnj0();
            case 14:
                return Integer.valueOf((int) x5r0.a(16, 1));
            case 15:
                Context context = e43.a;
                return Integer.valueOf((context != null ? context : null).getColor(R.color.vk_orange_fire));
            case 16:
                return Boolean.valueOf(fxc0.B().J().i0());
            case 17:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_STOP_CAST_ON_CALL;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 18:
                return new s290();
            case 19:
                return new azs0();
            case 20:
                return s3q0.a;
            case 21:
                return new tub0(fpf0.a(k1u0.class), new Annotation[0]);
            case 22:
                return VkCellSkeleton$Middle$Size.Companion.serializer();
            case 23:
                int i4 = VkFastLoginView.v;
                TrackingElement.Registration registration = TrackingElement.Registration.EMAIL;
                RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
                return new com.vk.registration.funnels.d(registration);
            default:
                return new pco(0);
        }
    }
}
