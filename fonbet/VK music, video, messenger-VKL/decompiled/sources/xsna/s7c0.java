package xsna;

import android.content.Context;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.VerticalVideoCatalogViewStyle;
import com.vk.core.apps.BuildInfo;
import com.vk.libvideo.adfree.api.domain.objects.VideoAdFreeTrapEventTrigger;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.voip.stereo.stub.create.di.VoipStereoCreateRoomComponentStub;
import kotlin.collections.builders.MapBuilder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class s7c0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ s7c0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        OperativeEventRepository initialize$lambda$220$lambda$83;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                return Boolean.valueOf(com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS));
            case 2:
                return Integer.valueOf(gb5.a.size());
            case 3:
                Context context = e43.a;
                if (context != null) {
                    return context;
                }
                return null;
            case 4:
                initialize$lambda$220$lambda$83 = ServiceProvider.initialize$lambda$220$lambda$83();
                return initialize$lambda$220$lambda$83;
            case 5:
                return new i1t0(true, bo.h());
            case 6:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMS_INBOX_INCORRECT_TEXT_ERROR, null, null, null, null, null, null, 254);
                return s3q0.a;
            case 7:
                return s3q0.a;
            case 8:
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return Boolean.FALSE;
            case 9:
                hhd0 hhd0Var = znk0.o;
                return (hhd0Var != null ? hhd0Var : null).a();
            case 10:
                return rhs.e();
            case 11:
                return e43.l(VideoAdFreeTrapEventTrigger.VIDEO_TAB_START, VideoAdFreeTrapEventTrigger.APP_START);
            case 12:
                return e43.l(dla0.c, v4q0.c, kla0.c, w4q0.c, kk0.c, k7k.c, i24.c, hmq.c, i2q0.c, lhs0.c, f1h0.c, pct0.c, k3u.c, gwf0.c, d770.c, e770.c, bxf0.c, zwf0.c, ftj.c, r6j0.c, v4g0.c, jk0.c, b14.c, uyo.c, cee0.c, a1p.c, v41.c, btj.c, gxf0.c, wo0.c, u1t0.c, e8s0.c, hxf0.c, up80.c, cxf0.c, m3v.c, n7j0.c, njj0.c, w0p.c, sj5.c);
            case 13:
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put(new sif0(CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5, null, null, 6), 3);
                mapBuilder.put(new sif0(CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1, null, null, 6), 3);
                CatalogViewType catalogViewType = CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS;
                VerticalVideoCatalogViewStyle.Style style = VerticalVideoCatalogViewStyle.Style.None;
                mapBuilder.put(new sif0(catalogViewType, null, new VerticalVideoCatalogViewStyle(style), 2), 3);
                CatalogDataType catalogDataType = CatalogDataType.DATA_SYNTHETIC_SECTION;
                mapBuilder.put(new sif0(catalogViewType, catalogDataType, null, 4), 1);
                CatalogViewType catalogViewType2 = CatalogViewType.FLOOR_CLIPS;
                mapBuilder.put(new sif0(catalogViewType2, null, new VerticalVideoCatalogViewStyle(style), 2), 1);
                mapBuilder.put(new sif0(catalogViewType2, catalogDataType, null, 4), 1);
                CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_VIDEO_VIDEOS;
                mapBuilder.put(new sif0(catalogViewType2, catalogDataType2, null, 4), 10);
                CatalogViewType catalogViewType3 = CatalogViewType.CAROUSEL_CLIPS;
                mapBuilder.put(new sif0(catalogViewType3, null, new VerticalVideoCatalogViewStyle(style), 2), 1);
                CatalogViewType catalogViewType4 = CatalogViewType.SEARCH_FLOOR_CLIPS;
                mapBuilder.put(new sif0(catalogViewType4, null, new VerticalVideoCatalogViewStyle(style), 2), 1);
                CatalogViewType catalogViewType5 = CatalogViewType.SEARCH_CAROUSEL_CLIPS;
                mapBuilder.put(new sif0(catalogViewType5, null, new VerticalVideoCatalogViewStyle(style), 2), 1);
                mapBuilder.put(new sif0(catalogViewType3, catalogDataType, null, 4), 1);
                CatalogViewType catalogViewType6 = CatalogViewType.CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS;
                mapBuilder.put(new sif0(catalogViewType6, null, new VerticalVideoCatalogViewStyle(style), 2), 1);
                mapBuilder.put(new sif0(catalogViewType4, catalogDataType, null, 4), 1);
                mapBuilder.put(new sif0(catalogViewType5, catalogDataType, null, 4), 1);
                mapBuilder.put(new sif0(catalogViewType6, catalogDataType, null, 4), 1);
                CatalogViewType catalogViewType7 = CatalogViewType.SEPARATOR;
                CatalogDataType catalogDataType3 = CatalogDataType.DATA_TYPE_NONE;
                mapBuilder.put(new sif0(catalogViewType7, catalogDataType3, null, 4), 3);
                mapBuilder.put(new sif0(CatalogViewType.HEADER, catalogDataType3, null, 4), 2);
                mapBuilder.put(new sif0(CatalogViewType.LARGE_LIST, null, null, 6), 7);
                CatalogViewType catalogViewType8 = CatalogViewType.VIDEO_SLIDER;
                mapBuilder.put(new sif0(catalogViewType8, null, null, 6), 2);
                mapBuilder.put(new sif0(catalogViewType8, catalogDataType, null, 4), 1);
                if (fxc0.B().J().O()) {
                    mapBuilder.put(new sif0(catalogViewType8, catalogDataType2, new CatalogSliderViewStyle(CatalogSliderViewStyle.Style.None)), 4);
                }
                return mapBuilder.h();
            case 14:
                int i = VideoEndView.z;
                return Boolean.FALSE;
            case 15:
                return new cts0();
            case 16:
                return Boolean.valueOf(fxc0.B().J().X1());
            case 17:
                Features.Type type = Features.Type.FEATURE_VIDEO_SHORT_ACTIONS;
                type.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(type) || fxc0.B().J().J1() || BuildInfo.s());
            case 18:
                return tlo0.Companion.serializer();
            case 19:
                L.A("VoipCallView", "declineOrHang decline button called");
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                com.vk.voip.ui.c.C(cVar, null, 0L, false, true, true, null, 207);
                return s3q0.a;
            default:
                qcy<Object>[] qcyVarArr3 = VoipStereoCreateRoomComponentStub.a;
                return new VoipStereoCreateRoomComponentStub.d();
        }
    }
}
