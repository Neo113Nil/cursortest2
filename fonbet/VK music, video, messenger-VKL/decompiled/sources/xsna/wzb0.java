package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.TextView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.clips.viewer.api.di.ClipActionsComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.ecomm.storefront.impl.community.presentation.fragment.StorefrontFragment;
import com.vk.libvideo.api.seek.di.VideoSeekComponent;
import com.vk.libvideo.screen.VideoActivity;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkPhoto;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkVideo;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.impl.presentation.model.RestorePostingStateMeta;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.profile.user.impl.ui.f;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.protect.di.ProtectAppComponent;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.stories.design.view.stats.tabs.info.mvi.StoryStatisticsInfoFragment;
import com.vk.stories.viewer.reactions.impl.di.StoryReactionsComponentImpl;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.story.viewer.stat.di.StoryStatisticsComponent;
import com.vk.superapp.di.SuperAppServicesComponentImpl;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import defpackage.StorefrontArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.ds60;
import xsna.lwq0;
import xsna.nyd0.c;
import xsna.s7d0;
import xsna.wq10;
import xsna.xno0.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wzb0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wzb0(VideoCatalogSearchRootVh videoCatalogSearchRootVh, Activity activity) {
        this.b = 29;
        this.c = videoCatalogSearchRootVh;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        wq10 cVar;
        int i = this.b;
        MediaPickerState mediaPickerState = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ClipActionsComponent) ((k7m) m7m.f((xzb0) obj)).mo408a(fpf0.a(ClipActionsComponent.class))).q5();
            case 1:
                return (YandexAdFeatureComponent) ((k7m) m7m.f((y1c0) obj)).a(fpf0.a(YandexAdFeatureComponent.class));
            case 2:
                PostingFragment postingFragment = (PostingFragment) obj;
                sbn sbnVar = postingFragment.k0;
                y1q0 y1q0Var = postingFragment.V;
                vq10 vq10Var = postingFragment.p0;
                f4z f4zVar = postingFragment.U;
                RestorePostingStateMeta restorePostingStateMeta = sbnVar.c;
                if (postingFragment.n0 == null && restorePostingStateMeta == null) {
                    return new zgc0(postingFragment.mo2getContext(), f4zVar, vq10Var, y1q0Var);
                }
                Context mo2getContext = postingFragment.mo2getContext();
                PostingState postingState = postingFragment.n0;
                ArrayList arrayList = vq10Var.b;
                if (postingState != null) {
                    mediaPickerState = postingState.z6();
                } else if (restorePostingStateMeta != null) {
                    mediaPickerState = restorePostingStateMeta.g;
                }
                if (mediaPickerState == null) {
                    return new zgc0(mo2getContext, f4zVar, vq10Var, y1q0Var);
                }
                ArrayList a = com.vk.newsfeed.posting.impl.domain.model.b.a(mediaPickerState);
                ArrayList arrayList2 = new ArrayList(c5g.u(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    MediaPickerEntry mediaPickerEntry = (MediaPickerEntry) it.next();
                    if (mediaPickerEntry instanceof LocalMediaEntry) {
                        cVar = new wq10.a(((LocalMediaEntry) mediaPickerEntry).ba());
                    } else if (mediaPickerEntry instanceof VkMediaEntry$VkPhoto) {
                        cVar = new wq10.b(((VkMediaEntry$VkPhoto) mediaPickerEntry).b);
                    } else {
                        if (!(mediaPickerEntry instanceof VkMediaEntry$VkVideo)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = new wq10.c(((VkMediaEntry$VkVideo) mediaPickerEntry).b);
                    }
                    arrayList2.add(cVar);
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                return new zgc0(mo2getContext, f4zVar, vq10Var, y1q0Var);
            case 3:
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                return new AtomicReference(((muc0) ((PostsFromNotificationsFragment) obj).N.getValue()).c);
            case 4:
                ((m8d0) obj).g().invoke(s7d0.a.a);
                return s3q0.a;
            case 5:
                return ((nyd0) obj).new c();
            case 6:
                return Boolean.valueOf(((PublishState) obj).e.length() > 128);
            case 7:
                return (gef0) obj;
            case 8:
                bei0 bei0Var = (bei0) obj;
                bei0Var.b();
                if (bei0Var.g()) {
                    bei0Var.i();
                }
                return s3q0.a;
            case 9:
                return new yej0((ebe) obj);
            case 10:
                return ((CommunityComponent) ((k7m) m7m.f((cvj0) obj)).a(fpf0.a(CommunityComponent.class))).df();
            case 11:
                int i2 = StickersDatabase_Impl.B;
                return new t2q((StickersDatabase_Impl) obj);
            case 12:
                qcy<Object>[] qcyVarArr2 = StorefrontFragment.S;
                return (StorefrontArgs) ((StorefrontFragment) obj).requireArguments().getParcelable("arguments_market_main_fragment");
            case 13:
                int i3 = StoryArchiveFragment.h0;
                return ((BridgeComponent) ((k7m) m7m.f((StoryArchiveFragment) obj)).a(fpf0.a(BridgeComponent.class))).f5();
            case 14:
                return new jbm0(((StoryReactionsComponentImpl) obj).a.a);
            case 15:
                int i4 = StoryStatisticsInfoFragment.T;
                return ((StoryStatisticsComponent) m7m.d((StoryStatisticsInfoFragment) obj).a(fpf0.a(StoryStatisticsComponent.class))).h7();
            case 16:
                qcy<Object>[] qcyVarArr3 = SuperAppServicesComponentImpl.f;
                return new gbn0(((ProtectAppComponent) obj).vb());
            case 17:
                return ((xno0) obj).new c();
            case 18:
                ((o3p0) obj).a();
                return s3q0.a;
            case 19:
                ((zak0) ((e6p0) obj).i).setValue(Boolean.valueOf(!r3.p()));
                return s3q0.a;
            case 20:
                return ((io.reactivex.rxjava3.internal.operators.observable.i0) obj).k0();
            case 21:
                return new f.e.AbstractC1725f.b(((f.b.c) ((f.b) obj)).a);
            case 22:
                RectF o = zjq.o(((UserProfileHeaderView) obj).A.getRightMainRect());
                Rect rect = new Rect();
                o.roundOut(rect);
                return rect;
            case 23:
                ListBuilder e = e43.e();
                e.add(lwq0.c.b.b);
                e.add(new lwq0.a.C3305a(ds60.a.C2747a.b));
                e.add(new lwq0.a.C3305a(ds60.a.b.b));
                e.add(lwq0.a.c.b);
                if (((fxq0) obj).k.b == WallGetMode.MAIN) {
                    e.add(lwq0.a.b.b);
                }
                return e.g();
            case 24:
                UserId userId = (UserId) ((AtomicReference) ((vxq0) obj).r.getValue()).get();
                StringBuilder sb = new StringBuilder();
                sb.append(fkq0.b(userId) ? "club" : CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
                sb.append(userId.b);
                return new AtomicReference(sb.toString());
            case 25:
                return ((a0r0) obj).a.T();
            case 26:
                ((tdr0) obj).d.z(null);
                return s3q0.a;
            case 27:
                return (TextView) ((lor0) obj).a.findViewById(R.id.nativeads_description);
            case 28:
                int i5 = VideoActivity.I;
                return ((VideoSeekComponent) m7m.a((VideoActivity) obj).mo408a(fpf0.a(VideoSeekComponent.class))).E1();
            default:
                int i6 = VideoCatalogSearchRootVh.S;
                return ((CastComponent) ((k7m) m7m.f((VideoCatalogSearchRootVh) obj)).a(fpf0.a(CastComponent.class))).o3().create();
        }
    }

    public /* synthetic */ wzb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
