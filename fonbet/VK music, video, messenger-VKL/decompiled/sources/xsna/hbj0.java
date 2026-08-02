package xsna;

import android.widget.ImageView;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderBrandedVh;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.core.view.fresco.VKEnhancedImageView.d;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.libvideo.api.di.VideoDownloadsComponent;
import com.vk.libvideo.api.di.VideoPromoComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.VideoActivity;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.ui.SuperAppItemDecoration;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.VideoProfileSource;
import com.vkontakte.android.R;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.stat.StatProcessor;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.TensorflowSegmentationType;
import xsna.bgp0;
import xsna.c9p0;
import xsna.fh8;
import xsna.sqt0;
import xsna.sx40;
import xsna.z9o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hbj0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hbj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Conversation conversation;
        TensorflowModel tensorflowModel;
        TensorflowModel tensorflowModel2;
        TensorflowModel tensorflowModel3;
        int i = this.b;
        dfw0 dfw0Var = null;
        dfw0Var = null;
        dfw0Var = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((StoryViewerComponent) ((k7m) m7m.f((ibj0) obj)).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 1:
                return new afj0(((dfj0) obj).d);
            case 2:
                clj0 clj0Var = (clj0) obj;
                xj8 xj8Var = clj0Var.c;
                hd8 a = xj8Var.a();
                if (a != null) {
                    boolean equals = a.d.equals(xj8Var.c());
                    ReentrantLock reentrantLock = xj8Var.d;
                    reentrantLock.lock();
                    try {
                        if (xj8.f(xj8Var)) {
                            if (!xj8Var.h()) {
                                throw new IllegalArgumentException("No permissions to stop broadcast");
                            }
                            xj8Var.a.M().c();
                        }
                        s3q0 s3q0Var = s3q0.a;
                        reentrantLock.unlock();
                        if (equals) {
                            try {
                                dfw0Var = clj0Var.b.e(a.a, a.b);
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return new it80(dfw0Var);
            case 3:
                return new chk(((cvj0) obj).Q);
            case 4:
                conversation = ((StatProcessor) obj).conversation;
                return conversation;
            case 5:
                int i2 = StickersDatabase_Impl.B;
                return new l6e0((StickersDatabase_Impl) obj);
            case 6:
                int i3 = StoryArchiveFragment.h0;
                return ((NarrativeComponent) ((k7m) m7m.f((StoryArchiveFragment) obj)).a(fpf0.a(NarrativeComponent.class))).n4();
            case 7:
                return ((DonutVideoComponent) ((x5n0) obj).t0.getValue()).getActionHandler();
            case 8:
                return ((SuperAppItemDecoration) obj).b.getDrawable(R.drawable.vk_superapp_menu_rect_background);
            case 9:
                z9o0 z9o0Var = (z9o0) obj;
                if (!o25.a().b()) {
                    return new TensorflowModel[]{TensorflowModel.HUMAN_SEGMENTATION};
                }
                TensorflowSegmentationType b = z9o0Var.b();
                int[] iArr = z9o0.a.$EnumSwitchMapping$1;
                if (iArr[b.ordinal()] == 2) {
                    TensorflowModel tensorflowModel4 = TensorflowModel.HAND_DETECTION;
                    TensorflowModel tensorflowModel5 = TensorflowModel.HAND_CLASSIFICATION;
                    TensorflowModel tensorflowModel6 = TensorflowModel.FACE_DETECTION;
                    TensorflowModel tensorflowModel7 = TensorflowModel.SKY_SEGMENTATION_RECURRENT;
                    TensorflowModel tensorflowModel8 = TensorflowModel.CAT_FACE_DETECTION;
                    TensorflowModel tensorflowModel9 = TensorflowModel.CAT_FACE_LANDMARK;
                    TensorflowModel tensorflowModel10 = TensorflowModel.HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH;
                    TensorflowModel tensorflowModel11 = TensorflowModel.HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH;
                    int i4 = z9o0.a.$EnumSwitchMapping$0[z9o0Var.e().ordinal()];
                    if (i4 == 1) {
                        tensorflowModel3 = TensorflowModel.FACE_LANDMARK;
                    } else {
                        if (i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tensorflowModel3 = TensorflowModel.FACE_LANDMARK_WITH_ATTENTION;
                    }
                    return new TensorflowModel[]{tensorflowModel4, tensorflowModel5, tensorflowModel6, tensorflowModel7, tensorflowModel8, tensorflowModel9, tensorflowModel10, tensorflowModel11, tensorflowModel3};
                }
                TensorflowModel tensorflowModel12 = TensorflowModel.HAND_DETECTION;
                TensorflowModel tensorflowModel13 = TensorflowModel.HAND_CLASSIFICATION;
                TensorflowModel tensorflowModel14 = TensorflowModel.FACE_DETECTION;
                TensorflowModel tensorflowModel15 = TensorflowModel.SKY_SEGMENTATION_RECURRENT;
                TensorflowModel tensorflowModel16 = TensorflowModel.CAT_FACE_DETECTION;
                TensorflowModel tensorflowModel17 = TensorflowModel.CAT_FACE_LANDMARK;
                int i5 = iArr[z9o0Var.b().ordinal()];
                if (i5 == 1) {
                    tensorflowModel = TensorflowModel.HUMAN_SEGMENTATION;
                } else if (i5 == 2) {
                    tensorflowModel = TensorflowModel.HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tensorflowModel = TensorflowModel.HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH;
                }
                int i6 = z9o0.a.$EnumSwitchMapping$0[z9o0Var.e().ordinal()];
                if (i6 == 1) {
                    tensorflowModel2 = TensorflowModel.FACE_LANDMARK;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tensorflowModel2 = TensorflowModel.FACE_LANDMARK_WITH_ATTENTION;
                }
                return new TensorflowModel[]{tensorflowModel12, tensorflowModel13, tensorflowModel14, tensorflowModel15, tensorflowModel16, tensorflowModel17, tensorflowModel, tensorflowModel2};
            case 10:
                return ((bio0) obj).I.getCustomSelectionActionModeCallback();
            case 11:
                ((izs) ((zak0) ((c9p0.c) obj).d).getValue()).invoke(new sx40.o0(PlayerContext.TOP));
                return s3q0.a;
            case 12:
                ((xfp0) obj).T(new bgp0.b());
                return s3q0.a;
            case 13:
                ((q7) obj).b(sls.a);
                return s3q0.a;
            case 14:
                int i7 = UserProfileHeaderView.G;
                ((slq0) obj).a(UserProfileAction.m.j.b);
                return s3q0.a;
            case 15:
                return new hvq0(new b990((vxq0) obj, 26));
            case 16:
                qcy<Object>[] qcyVarArr = VKEnhancedImageView.N;
                return ((VKEnhancedImageView) obj).new d();
            case 17:
                return m33.a(R.drawable.vk_icon_share_outline_20, ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) obj).itemView.getContext());
            case 18:
                int i8 = VideoActivity.I;
                return ((VideoPromoComponent) m7m.a((VideoActivity) obj).a(fpf0.a(VideoPromoComponent.class))).L();
            case 19:
                ImageView imageView = ((VideoCatalogHeaderBrandedVh) obj).q;
                return ((CastComponent) ((k7m) m7m.c(imageView != null ? imageView : null)).a(fpf0.a(CastComponent.class))).cd();
            case 20:
                return (Boolean) ((bus0) obj).a.invoke();
            case 21:
                return (VideoDownloadsComponent) ((f8m) obj).c(fpf0.a(VideoDownloadsComponent.class));
            case 22:
                return ((CatalogLegacyComponent) ((k7m) m7m.f((y6t0) obj)).a(fpf0.a(CatalogLegacyComponent.class))).qf();
            case 23:
                VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) obj;
                ?? r0 = videoProfileFragmentOld.X;
                int i9 = VideoProfileFragmentOld.p0;
                bpn0 bpn0Var = o25.a;
                if (!epx.f(((b25) (bpn0Var != null ? bpn0Var : null).getValue()).c(), videoProfileFragmentOld.ho()) && fkq0.c(videoProfileFragmentOld.ho()) && !((Boolean) r0.getValue()).booleanValue()) {
                    return new VideoProfileSource.ForeignProfile(videoProfileFragmentOld.ho());
                }
                UserId ho = ((Boolean) r0.getValue()).booleanValue() ? videoProfileFragmentOld.ho() : o25.a().c();
                videoProfileFragmentOld.requireArguments().putParcelable("VideoProfileFragment.user_id", ho);
                return new VideoProfileSource.OwnProfile(ho);
            case 24:
                tet0 tet0Var = (tet0) obj;
                wh50<set0> wh50Var = tet0Var.m;
                VideoSearchFiltersImpl copy = ((set0) ((zak0) wh50Var).getValue()).copy();
                copy.f = true ^ copy.f;
                ((zak0) wh50Var).setValue(copy);
                tet0Var.B();
                return s3q0.a;
            case 25:
                qcy<Object>[] qcyVarArr2 = VideoView.T0;
                return ((MarketComponent) ((k7m) m7m.c((VideoView) obj)).a(fpf0.a(MarketComponent.class))).l7();
            case 26:
                return new sqt0.l((sqt0) obj);
            case 27:
                com.vk.superapp.browser.ui.a aVar = (com.vk.superapp.browser.ui.a) obj;
                long appId = aVar.yn().b.getAppId();
                WebApiApplication m = aVar.yn().b.m();
                return new v73(appId, m != null ? m.w : null, aVar.vn().d.getState().q(), aVar.yn().c(), aVar.yn().a.T0(), aVar.yn().l(), aVar.yn().b.a(), Boolean.valueOf(aVar.yn().b.m() != null));
            case 28:
                return ((ggu0) obj).n;
            default:
                lcw0 lcw0Var = (lcw0) obj;
                lcw0Var.f.a(fh8.b.C2873b.a);
                lcw0Var.a.dismiss();
                return s3q0.a;
        }
    }
}
