package defpackage;

import android.widget.ImageView;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipGlobalSearchFeatureRootVh;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.sdk.shared.clips.SdkNewsMonotheme;
import com.vk.clips.uploader.impl.ClipsUploadSdkUploaderComponentBase;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.common.clips.NewsMonotheme;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.movika.sdk.base.observable.m;
import com.vk.newsfeed.api.posting.viewpresenter.CropsForRatio;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import com.vk.photo.editor.features.collage.view.CollageSlotView;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.profile.community.impl.ui.events.CommunityEventsFragment;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PrimaryModeEvent;
import com.vk.topics.impl.fragments.BoardTopicsFragment;
import com.vk.video.profile.presentation.a;
import com.vk.voip.ui.settings.participants_view.c;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkUploaderComponentVkApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.a5i;
import xsna.b94;
import xsna.bzd;
import xsna.c5g;
import xsna.cr4;
import xsna.d2e;
import xsna.d3h;
import xsna.d4h;
import xsna.e0f;
import xsna.fef;
import xsna.fpf0;
import xsna.ghc0;
import xsna.gzs;
import xsna.ixc;
import xsna.iz;
import xsna.jm90;
import xsna.k5d0;
import xsna.k7m;
import xsna.laa;
import xsna.lu9;
import xsna.m0f;
import xsna.m7m;
import xsna.mb;
import xsna.nlf;
import xsna.nwy;
import xsna.o1d;
import xsna.qcy;
import xsna.rgj0;
import xsna.s0e;
import xsna.s3q0;
import xsna.so10;
import xsna.tgj0;
import xsna.u2f;
import xsna.u7e;
import xsna.u86;
import xsna.wlg;
import xsna.x1n0;
import xsna.y440;
import xsna.z84;
import xsna.zd9;
import xsna.zi6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        k5d0 k5d0Var;
        String str;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new x1n0(((l0) obj).e);
            case 1:
                z84 z84Var = ((b94) obj).t;
                if (z84Var != null) {
                    ghc0.i d = z84Var.h.d();
                    PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = z84Var.i;
                    d.getClass();
                    ghc0.i.a(d, MobileOfficialAppsConPostingStat$PrimaryModeEvent.PrimaryModeEventType.RATIO_CHANGE, postingMetricsCreationEntryPoint);
                    lu9 lu9Var = z84Var.p;
                    if (lu9Var != null && (k5d0Var = lu9Var.e) != null) {
                        int i3 = k5d0Var.b + 1;
                        List<PreviewRatio> list = k5d0Var.a;
                        int size = i3 % list.size();
                        k5d0Var.b = size;
                        PreviewRatio previewRatio = list.get(size);
                        ArrayList a = lu9Var.f.a(previewRatio);
                        if (previewRatio.equals(lu9Var.l)) {
                            str = lu9.c(previewRatio);
                        } else if (previewRatio.c()) {
                            str = "original";
                        } else {
                            str = previewRatio.b() + '_' + previewRatio.a() + "_manual";
                        }
                        lu9Var.m = str;
                        z84 z84Var2 = lu9Var.a;
                        z84Var2.x0(new CropsForRatio(previewRatio, a, null, null, 12, null));
                        z84Var2.r1(lu9Var.g);
                    }
                }
                return s3q0.a;
            case 2:
                return ((cr4) obj).a.P1();
            case 3:
                return u86.M((y440) obj);
            case 4:
                SignUpDataHolder signUpDataHolder = ((zi6) obj).p;
                boolean z = (signUpDataHolder != null ? signUpDataHolder : null).y != null;
                jm90 jm90Var = new jm90();
                jm90Var.b = z;
                return jm90Var;
            case 5:
                int i4 = BoardTopicsFragment.S0;
                ((BoardTopicsFragment) obj).Mo();
                return s3q0.a;
            case 6:
                ((c) obj).a(j.a.a);
                return s3q0.a;
            case 7:
                float f = CameraUIView.w1;
                zd9 camera1View = ((CameraUIView) obj).getCamera1View();
                if (camera1View != null) {
                    camera1View.O(false);
                }
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((laa) obj).b.o());
            case 9:
                int i5 = ChannelFragment.a1;
                Channel b = ((ChannelFragment) obj).lo().b();
                return Boolean.valueOf((b != null ? b.z : null) == ChannelType.PERSONAL_CHANNEL);
            case 10:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i6 = ClipFeedListFragment.a2;
                return new m0f(new ixc(clipFeedListFragment, i2), new mb(clipFeedListFragment, 25), new m(clipFeedListFragment, 24), new iz(clipFeedListFragment, 22), !clipFeedListFragment.isResumed());
            case 11:
                List<UIBlock> mo78O0 = ((ClipGlobalSearchFeatureRootVh) obj).k0().mo78O0();
                if (mo78O0 == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : mo78O0) {
                    if (obj2 instanceof UIBlockVideo) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((UIBlockVideo) it.next()).B);
                }
                return arrayList2;
            case 12:
                return o1d.o((o1d) obj);
            case 13:
                NewsMonotheme newsMonotheme = ((ClipVideoFileAdapter) obj).m.T1;
                if (newsMonotheme != null) {
                    return new SdkNewsMonotheme(newsMonotheme.b, newsMonotheme.c);
                }
                return null;
            case 14:
                ((bzd) obj).q(false);
                return s3q0.a;
            case 15:
                return ((s0e) obj).i().findViewById(R.id.video_overlay_view);
            case 16:
                return ((CameraClipsComponent) ((k7m) m7m.f((d2e) obj)).a(fpf0.a(CameraClipsComponent.class))).p9();
            case 17:
                ((u7e) obj).b.e.invoke();
                return s3q0.a;
            case 18:
                int i7 = ClipsHolderViewImpl.d0;
                return ((ClipsConfigViewersComponent) ((k7m) m7m.c((ClipsHolderViewImpl) obj)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 19:
                return (ImageView) ((e0f.a) obj).itemView.findViewById(R.id.video_single_clip_like);
            case 20:
                qcy<Object>[] qcyVarArr = ClipsUploadSdkUploaderComponentBase.c;
                ClipsUploadSdkUploaderComponentVkApp clipsUploadSdkUploaderComponentVkApp = (ClipsUploadSdkUploaderComponentVkApp) ((ClipsUploadSdkUploaderComponentBase) obj);
                nlf k = clipsUploadSdkUploaderComponentVkApp.k();
                nwy nwyVar = clipsUploadSdkUploaderComponentVkApp.e;
                qcy<Object> qcyVar = ClipsUploadSdkUploaderComponentVkApp.g[0];
                return new fef(k, (u2f) nwyVar.c(), new h(clipsUploadSdkUploaderComponentVkApp, 27));
            case 21:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) obj;
                nwy nwyVar2 = clipsViewerComponentImpl.B;
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                qcy<Object> qcyVar2 = qcyVarArr2[14];
                tgj0 tgj0Var = (tgj0) nwyVar2.c();
                nwy nwyVar3 = clipsViewerComponentImpl.C;
                qcy<Object> qcyVar3 = qcyVarArr2[15];
                return new so10(tgj0Var, (rgj0) nwyVar3.c());
            case 22:
                int i8 = ClipsWrapperFragment.Q0;
                return ((ClipsConfigViewersComponent) m7m.d((ClipsWrapperFragment) obj).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 23:
                gzs<s3q0> gzsVar = ((CollageSlotView) obj).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 24:
                return ((BridgeComponent) obj).a0();
            case 25:
                ((wlg) obj).c.invoke(a.a0.b);
                return s3q0.a;
            case 26:
                qcy<Object>[] qcyVarArr3 = CommunityEventsFragment.P;
                return ((CommunityEventsFragment) obj).eo().getCurrentState();
            case 27:
                ((d3h) ((d4h) obj).c.invoke()).g();
                return s3q0.a;
            case 28:
                return (a5i) ((com.vk.profile.community.impl.ui.profile.a) obj).k.C0.getValue();
            default:
                int i9 = CommunityReviewsFragment.o0;
                ((CommunityReviewsFragment) obj).a0();
                return s3q0.a;
        }
    }
}
