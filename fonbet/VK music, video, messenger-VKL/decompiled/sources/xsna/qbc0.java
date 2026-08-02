package xsna;

import android.os.Bundle;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemHideVh;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.qrcode.QRStatsTracker;
import com.vk.qrcode.QRTypes$EmailQrAction;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.sharing.im_engine_impl.SharingImEngineActivity;
import com.vk.stat.scheme.CommonUxpollsStat$TypeUxpollsEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.story.archive.impl.presentation.list.StoryArchiveRecyclerPaginatedView;
import com.vk.toggle.features.ComFeatures;
import com.vk.video.growth.impl.di.VideoGrowthComponentImpl;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.cqc0;
import xsna.ghc0.e;
import xsna.wqq0;
import xsna.xqu;
import xsna.z0d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qbc0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qbc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        BackgroundWorker initialize$lambda$220$lambda$167;
        String string;
        int i = 1;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((rbc0) this.c).a.getBoolean("is_opened_from_archive"));
            case 1:
                return ((ghc0) this.c).new e();
            case 2:
                cqc0 cqc0Var = (cqc0) this.c;
                cqc0.c cVar = cqc0Var.o;
                if (cVar != null) {
                    bwt0.p0(cVar.C, true);
                    bwt0.p0(cVar.D, false);
                    s3q0 s3q0Var = s3q0.a;
                }
                cqc0Var.W0();
                return s3q0.a;
            case 3:
                Iterator<z0d0.b> it = ((z0d0) this.c).g.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                return s3q0.a;
            case 4:
                QRTypes$EmailQrAction.a aVar = (QRTypes$EmailQrAction.a) this.c;
                ArrayList arrayList = new ArrayList();
                QRTypes$EmailQrAction.b bVar = aVar.a;
                if (bVar != null) {
                    arrayList.add(bVar);
                }
                QRTypes$EmailQrAction.b bVar2 = aVar.b;
                if (bVar2 != null) {
                    arrayList.add(bVar2);
                }
                QRTypes$EmailQrAction.b bVar3 = aVar.c;
                if (bVar3 != null) {
                    arrayList.add(bVar3);
                }
                return arrayList;
            case 5:
                Group group = (Group) this.c;
                ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_JOIN;
                comFeatures.getClass();
                io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(com.vk.toggle.b.A.a(comFeatures) ? yfb.x(xqu.a.c(null, null, null, null, fkq0.a(group.c), null, null, null)) : new gqu(group.c, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
                al30 al30Var = new al30();
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                itg0.m(T.E(al30Var, lVar, kVar, kVar));
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.JOIN_GROUP);
                return s3q0.a;
            case 6:
                return ((prf0) this.c).a.findViewById(R.id.ads_image_container);
            case 7:
                rah0 rah0Var = (rah0) this.c;
                rah0Var.k = false;
                rah0Var.f.onNext(Boolean.FALSE);
                rah0Var.b.e(rah0Var.k);
                return s3q0.a;
            case 8:
                return ((hqh0) this.c).m;
            case 9:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((pii0) this.c)).a(fpf0.a(StoryEditorExtDepsComponent.class))).k7();
            case 10:
                initialize$lambda$220$lambda$167 = ServiceProvider.initialize$lambda$220$lambda$167((ServicesRegistry) this.c);
                return initialize$lambda$220$lambda$167;
            case 11:
                ((io.reactivex.rxjava3.core.b) this.c).onComplete();
                return s3q0.a;
            case 12:
                SharingImEngineActivity sharingImEngineActivity = (SharingImEngineActivity) this.c;
                int i3 = SharingImEngineActivity.q0;
                return new v8k0(sharingImEngineActivity, i2w.a());
            case 13:
                CatalogBlockDto catalogBlockDto = (CatalogBlockDto) this.c;
                return "SliderView has no registered variant for " + catalogBlockDto.l0() + ", " + catalogBlockDto.n1().f() + ", " + catalogBlockDto.n1().i();
            case 14:
                return new a5k0(((SmartCropFragmentInternalComponent) this.c).a.a);
            case 15:
                sgl0 sgl0Var = (sgl0) this.c;
                StringBuilder sb = new StringBuilder("REPLACE INTO ");
                sb.append(sgl0Var.a);
                bpn0 bpn0Var = sgl0Var.b;
                sb.append(rl3.Z((Enum[]) bpn0Var.getValue(), null, "(", ")", new fyi0(i), 25));
                sb.append("VALUES");
                sb.append(rl3.Z((Enum[]) bpn0Var.getValue(), null, "(", ")", new rgl0(i2), 25));
                return sb.toString();
            case 16:
                gzs<s3q0> gzsVar = ((StoryArchiveRecyclerPaginatedView) this.c).O;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 17:
                StoryEditorExtDepsComponentImpl storyEditorExtDepsComponentImpl = (StoryEditorExtDepsComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = StoryEditorExtDepsComponentImpl.r;
                return new StoryEditorExtDepsComponentImpl.c(storyEditorExtDepsComponentImpl);
            case 18:
                j1k0 j1k0Var = ((c4m0) this.c).f;
                if (j1k0Var != null) {
                    j1k0Var.invoke();
                }
                return s3q0.a;
            case 19:
                ebm0 ebm0Var = (ebm0) this.c;
                nzl0 nzl0Var = ebm0Var.b;
                nzl0Var.q();
                anm0.d((anm0) ebm0Var.g.getValue(), MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_REACTIONS_MENU, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, ebm0Var.f, ebm0Var.e, nzl0Var.p(), 32);
                return s3q0.a;
            case 20:
                ((ToolbarVh) this.c).y = null;
                return s3q0.a;
            case 21:
                zfp0 zfp0Var = (zfp0) this.c;
                int i4 = zfp0.x1;
                return ((DataRepositoryComponent) m7m.d(zfp0Var).a(fpf0.a(DataRepositoryComponent.class))).D();
            case 22:
                return new io.reactivex.rxjava3.internal.operators.observable.q(new did0((p870) this.c, 10)).k0();
            case 23:
                UserProfileFragment userProfileFragment = (UserProfileFragment) this.c;
                int i5 = UserProfileFragment.p0;
                return ((UserProfileComponent) ((k7m) m7m.f(userProfileFragment)).mo408a(fpf0.a(UserProfileComponent.class))).m3();
            case 24:
                throw null;
            case 25:
                return (ClipsEntryPointsComponent) ((k7m) m7m.f((l9s0) this.c)).mo408a(fpf0.a(ClipsEntryPointsComponent.class));
            case 26:
                VideoCommentsTreeInPlayerFragment videoCommentsTreeInPlayerFragment = (VideoCommentsTreeInPlayerFragment) this.c;
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                Bundle arguments = videoCommentsTreeInPlayerFragment.getArguments();
                return (arguments == null || (string = arguments.getString("referrer")) == null) ? "" : string;
            case 27:
                VideoEmbedFragment videoEmbedFragment = (VideoEmbedFragment) this.c;
                int i6 = VideoEmbedFragment.q0;
                return (VideoShareComponent) m7m.d(videoEmbedFragment).a(fpf0.a(VideoShareComponent.class));
            case 28:
                VideoGrowthComponentImpl videoGrowthComponentImpl = (VideoGrowthComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = VideoGrowthComponentImpl.k;
                gqh0 gqh0Var = new gqh0(videoGrowthComponentImpl, 14);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                return new l0s0(msy.a(lazyThreadSafetyMode, gqh0Var), msy.a(lazyThreadSafetyMode, new d3j0(videoGrowthComponentImpl, 13)), videoGrowthComponentImpl.N8());
            default:
                VideoItemHideVh videoItemHideVh = (VideoItemHideVh) this.c;
                dps0 dps0Var = videoItemHideVh.n;
                CommonUxpollsStat$TypeUxpollsEvent.EventType eventType = CommonUxpollsStat$TypeUxpollsEvent.EventType.UNDO_COMPLETE;
                VideoFile videoFile = videoItemHideVh.q;
                dps0Var.a(eventType, null, videoFile != null ? videoFile.r() : null, null);
                return s3q0.a;
        }
    }

    public /* synthetic */ qbc0(z0d0 z0d0Var, dbn dbnVar, Exception exc) {
        this.b = 3;
        this.c = z0d0Var;
    }

    public /* synthetic */ qbc0(wqq0.a aVar, wqq0.b bVar) {
        this.b = 24;
        this.c = aVar;
    }
}
