package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.superapp.di.SuperAppServicesComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SearchFeatures;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.InitializedLazyImpl;
import kotlinx.serialization.KSerializer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class t970 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ t970(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new s870();
            case 1:
                return Float.valueOf(Resources.getSystem().getDisplayMetrics().density);
            case 2:
                return Boolean.valueOf(MusicFeatures.OFFLINE_PENDING_UI.h());
            case 3:
                int i = PhotoVideoAttachActivity.g0;
                return s3q0.a;
            case 4:
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                return new y3v();
            case 5:
                int[] iArr = PrivacyEditFragment.W0;
                return null;
            case 6:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_COMMUNITY_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 7:
                return new com.vk.newsfeed.common.recycler.holders.attachments.market.a();
            case 8:
                Context context = e43.a;
                Context context2 = context != null ? context : null;
                HashSet hashSet = iah0.a;
                return Boolean.valueOf(fnj.b(context2));
            case 9:
                qcy<Object>[] qcyVarArr2 = SuperAppServicesComponentImpl.f;
                return new le80();
            case 10:
                FeedFeatures feedFeatures = FeedFeatures.REDESIGN_TEXT_CHIP;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 11:
                return new rpj(fpf0.a(CharSequence.class), new tub0(fpf0.a(CharSequence.class), new Annotation[0]), new KSerializer[0]);
            case 12:
                return new ArrayList();
            case 13:
                return new tr60(null, false, new InitializedLazyImpl(Boolean.FALSE), null, new c0x(1), VideoAutoPlayDelayType.WALL, 81);
            case 14:
                return Integer.valueOf((int) x5r0.a(11, 1));
            case 15:
                bpn0 bpn0Var = o25.a;
                return (b25) (bpn0Var != null ? bpn0Var : null).getValue();
            case 16:
                return new VideoEffect(null, null);
            case 17:
                return new ucg0();
            case 18:
                return new a390();
            case 19:
                bpn0 bpn0Var2 = VideoOverlayView.I;
                return Integer.valueOf(iah0.a(24));
            case 20:
                return new a7t0();
            case 21:
                return tlo0.Companion.serializer();
            default:
                qcy<Object>[] qcyVarArr3 = VkTopBarSearchQueryVh.s;
                ccw0 d = vtk0.d();
                Context context3 = e43.a;
                return Boolean.valueOf(d.b(context3 != null ? context3 : null));
        }
    }

    public /* synthetic */ t970(w970 w970Var) {
        this.b = 0;
    }
}
