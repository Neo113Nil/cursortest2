package xsna;

import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.gson.Gson;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.attachpicker.di.AttachPickerComponent;
import com.vk.attachpicker.impl.ImagePickerActivity;
import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.mention.SelectionChangeEditText;
import com.vk.dto.user.UserProfile;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.network.eventhub.api.di.EventHubComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.posting.di.PostingComponentImpl;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.uxpolls.data.db.UxPollsDatabase_Impl;
import java.util.Optional;
import xsna.eac0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dac0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dac0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        VideoFile orElse;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((eac0) obj).new b();
            case 1:
                qcy<Object>[] qcyVarArr = PostingComponentImpl.j;
                max0 max0Var = new max0();
                ((NewsfeedMappersComponent) ((PostingComponentImpl) obj).a.getValue()).B1();
                return new elc0(max0Var);
            case 2:
                int i2 = PostingFragment.L0;
                return ((NewsFeedComponent) ((k7m) m7m.f((PostingFragment) obj)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 3:
                ((AttachPickerComponent) ((k7m) m7m.f((ikc0) obj)).a(fpf0.a(AttachPickerComponent.class))).getClass();
                return ImagePickerActivity.class;
            case 4:
                return ((SharingComponent) ((zqd0) obj).c.getValue()).u();
            case 5:
                ((UserProfile) obj).k = false;
                dw20 dw20Var = com.vk.qrcode.d.k;
                if (dw20Var == null) {
                    return null;
                }
                dw20Var.Pn(-2);
                return s3q0.a;
            case 6:
                u6g0 u6g0Var = (u6g0) obj;
                return new j5r0(u6g0Var.a, (Gson) u6g0Var.f.getValue());
            case 7:
                ((nri0) obj).e.invoke(new UserProfileAction.p.a.C1689a());
                return s3q0.a;
            case 8:
                ((mwi0) obj).getClass();
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.B0.m().a.z0();
                return s3q0.a;
            case 9:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 10:
                return ((gdj0) obj).c;
            case 11:
                com.vk.clips.sdk.shared.item.static_ads.c cVar = (com.vk.clips.sdk.shared.item.static_ads.c) obj;
                return new rwk0(cVar, cVar.m.d());
            case 12:
                StoryEditText storyEditText = ((s4m0) obj).b.k;
                mhy.j(storyEditText != null ? storyEditText : null);
                return s3q0.a;
            case 13:
                x8m0 x8m0Var = (x8m0) obj;
                ((j1d0) x8m0Var.h.getValue()).f = x8m0Var.i;
                return s3q0.a;
            case 14:
                int i3 = StoryStatisticsStickersFragment.X;
                return ((StoryViewerComponent) m7m.d((StoryStatisticsStickersFragment) obj).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 15:
                plm0 plm0Var = (plm0) obj;
                return new q50(plm0Var.a, plm0Var.f, plm0Var.n, plm0Var.b(), plm0Var.g, plm0Var.o);
            case 16:
                x3n0 x3n0Var = (x3n0) obj;
                mo60 mo60Var = x3n0Var.a;
                return new hv50(mo60Var.X, mo60Var.Y, ((NewsFeedComponent) x3n0Var.c.getValue()).cc());
            case 17:
                return Boolean.valueOf(((zak0) ((h17) obj).a.c.g).getValue() == BigPlayerBottomSheetValue.Collapsed);
            case 18:
                k2o0 k2o0Var = (k2o0) obj;
                k2o0Var.o.invalidateRoot();
                k2o0Var.p = null;
                return s3q0.a;
            case 19:
                return (EventHubComponent) ((k7m) m7m.f((b7o0) obj)).a(fpf0.a(EventHubComponent.class));
            case 20:
                mhy.j((SelectionChangeEditText) obj);
                return s3q0.a;
            case 21:
                e1p0 e1p0Var = (e1p0) obj;
                e1p0Var.Q.invoke(Boolean.valueOf(true ^ e1p0Var.P));
                return s3q0.a;
            case 22:
                int i4 = irq0.a;
                throw null;
            case 23:
                return ((NewsfeedOptionalAdsComponent) ((k7m) m7m.f((mxq0) obj)).mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class))).d5();
            case 24:
                return new mnb0((UxPollsDatabase_Impl) obj);
            case 25:
                return Float.valueOf(new PathMeasure(((r9r0) obj).a, false).getLength());
            case 26:
                return new RectF((Rect) obj);
            case 27:
                return ((DonutVideoComponent) ((VideoItemListLargeVh) obj).j0.getValue()).s3();
            case 28:
                Optional<VideoFile> P0 = ((com.vk.video.ui.discovery.minimizable.g) obj).P.P0();
                if (P0 == null || (orElse = P0.orElse(null)) == null) {
                    return null;
                }
                return new slt0(orElse, orElse.r());
            default:
                ((rzl0) obj).invoke(ygt0.a);
                return s3q0.a;
        }
    }

    public /* synthetic */ dac0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
