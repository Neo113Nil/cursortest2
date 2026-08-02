package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import androidx.media3.datasource.c;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.mention.SelectionChangeEditText;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.onboardingscreens.impl.recomthemes.presentation.fragment.UserRecomThemesFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.search.integration.followers.impl.presentation.SearchFollowersCatalogRootVh;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.stories.StoriesVideoEncoder;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersFragment;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vk.story.viewer.stat.di.StoryStatisticsComponent;
import com.vk.uxpolls.data.db.UxPollsDatabase;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.b;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.media.OkmpStreamPublisher;
import xsna.h7u0;
import xsna.jth0;
import xsna.oko0.a;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nm60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nm60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e2  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        b.c cVar;
        s3q0 stopPublishing$lambda$22;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.b) {
            case 0:
                rm60 rm60Var = (rm60) this.c;
                final RecyclerView.Adapter adapter = rm60Var.a.getAdapter();
                float b = iah0.b(18.0f);
                int a = iah0.a(8);
                ?? r0 = rm60Var.c;
                oog0 oog0Var = new oog0(b, a, ((Boolean) r0.getValue()).booleanValue() ? new mf7() { // from class: xsna.mm60
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.mf7
                    public final int e0(int i) {
                        RecyclerView.Adapter adapter2 = RecyclerView.Adapter.this;
                        if (i == 0) {
                            return ((mf7) adapter2).e0(i);
                        }
                        if (i == 1) {
                            return 2;
                        }
                        return i == adapter2.getItemCount() - 1 ? 4 : 1;
                    }
                } : new mf7() { // from class: xsna.lm60
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.mf7
                    public final int e0(int i) {
                        RecyclerView.Adapter adapter2 = RecyclerView.Adapter.this;
                        int e0 = ((mf7) adapter2).e0(i);
                        if (i == 0) {
                            e0 = (e0 & (-3)) | 1;
                        }
                        if (e0 == 0) {
                            e0 = 1;
                        }
                        return i == adapter2.getItemCount() - 1 ? (e0 & (-5)) | 1 : e0;
                    }
                });
                oog0Var.n = true;
                oog0Var.o = ((Boolean) r0.getValue()).booleanValue();
                return oog0Var;
            case 1:
                b.c cVar2 = (b.c) this.c;
                OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                oKVoipEngine.getClass();
                b.c cVar3 = OKVoipEngine.d;
                if (cVar3 == null) {
                    OKVoipEngine.d = cVar2;
                } else if (!cVar3.equals(cVar2)) {
                    cVar = OKVoipEngine.d;
                    OKVoipEngine.d = cVar2;
                    if (cVar != null) {
                        cVar.c();
                        if (oKVoipEngine.w()) {
                            dfs dfsVar = OKVoipEngine.i;
                            if (dfsVar != null) {
                                dfsVar.d(null);
                            }
                            oKVoipEngine.u(null);
                        }
                    }
                    return s3q0.a;
                }
                cVar = null;
                if (cVar != null) {
                }
                return s3q0.a;
            case 2:
                stopPublishing$lambda$22 = OkmpStreamPublisher.stopPublishing$lambda$22((OkmpStreamPublisher) this.c);
                return stopPublishing$lambda$22;
            case 3:
                return Boolean.valueOf(((tw90) this.c).c.a(PerformanceEventType.LONG_POLL_HISTORY));
            case 4:
                return (StoryProgressView) ((x2a0) this.c).itemView.findViewById(R.id.video_single_clip_song_progress);
            case 5:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) this.c;
                int i = PhotoFlowFragment.m0;
                return photoFlowFragment.fo().r4();
            case 6:
                hpb0 hpb0Var = (hpb0) this.c;
                Context context = hpb0Var.k().getContext();
                bpn0 bpn0Var = enj.a;
                h7u0.a aVar = new h7u0.a(e3m.h(context));
                aVar.g0(R.string.confirm);
                aVar.U(R.string.confirm_close_poll_edit);
                aVar.c0(R.string.delete, new mop(hpb0Var, 2));
                aVar.W(R.string.cancel, null);
                return aVar;
            case 7:
                return new rp50(new ds50(), new q5w(), new ad0(), new vua0(), new qq50(), new skd(), new yq50(), new nr2(), new ht50((ibr0) ((com.vk.newsfeed.common.util.j) this.c).c.getValue()));
            case 8:
                return new vec0(((Posting2Component) ((k7m) m7m.f((pgc0) this.c)).mo408a(fpf0.a(Posting2Component.class))).qd());
            case 9:
                xn50.a.c(((rhc0) this.c).c, new PostingAction.Editing.SetPostponePublish(null));
                return s3q0.a;
            case 10:
                ikc0 ikc0Var = (ikc0) this.c;
                return new xgc0(ikc0Var, ikc0Var.c, (b25) ikc0Var.o.getValue(), (ExtendedProfilesRepository) ikc0Var.b0.getValue());
            case 11:
                return ((SharingComponent) ((zqd0) this.c).c.getValue()).F2();
            case 12:
                return Float.valueOf(((vak0) ((zfe0) this.c).f).getFloatValue() * 0.5f);
            case 13:
                aqe0 aqe0Var = (aqe0) this.c;
                int i2 = aqe0.m1;
                nwy nwyVar = ((ClipsInternalNpsComponentImpl) aqe0Var.i1.getValue()).b;
                qcy<Object> qcyVar = ClipsInternalNpsComponentImpl.g[1];
                return ((vl70) nwyVar.c()).a();
            case 14:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                DialogInterface dialogInterface = (DialogInterface) ref$ObjectRef.element;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                ref$ObjectRef.element = null;
                return s3q0.a;
            case 15:
                ((a2t) this.c).d();
                return s3q0.a;
            case 16:
                u6g0 u6g0Var = (u6g0) this.c;
                return new t5r0((i5r0) u6g0Var.e.getValue(), (UxPollsDatabase) u6g0Var.b.b.getValue(), (p4r0) u6g0Var.g.getValue());
            case 17:
                return (LayoutInflater) this.c;
            case 18:
                jth0 jth0Var = (jth0) this.c;
                UserId userId = jth0Var.b;
                FragmentImpl fragmentImpl = jth0Var.d;
                return new SearchFollowersCatalogRootVh(userId, fragmentImpl.getArguments(), fragmentImpl.kn(), new o5a(fragmentImpl), (zqh0) jth0Var.f.getValue(), new jth0.d(0, fragmentImpl, FragmentImpl.class, "getViewLifecycleOwner", "getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;", 0), jth0Var.e);
            case 19:
                return SelectionStickerView.this.c0;
            case 20:
                azl azlVar = ((fdj0) this.c).c;
                if (azlVar != null) {
                    return Float.valueOf(azlVar.I0(125));
                }
                throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
            case 21:
                return (MediaPipelineComponent) ((k7m) m7m.f((StoriesVideoEncoder) this.c)).a(fpf0.a(MediaPipelineComponent.class));
            case 22:
                x8m0 x8m0Var = (x8m0) this.c;
                new WeakReference(Thread.currentThread());
                Context context2 = e43.a;
                Context context3 = context2 != null ? context2 : null;
                if (context2 == null) {
                    context2 = null;
                }
                return new j1d0(context3, new c.a(context2.getApplicationContext(), new etk(new VkHttpCallFactory(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 3), null)), x8m0Var.d, 24);
            case 23:
                StoryStatisticsStickersFragment storyStatisticsStickersFragment = (StoryStatisticsStickersFragment) this.c;
                int i3 = StoryStatisticsStickersFragment.X;
                return ((StoryStatisticsComponent) m7m.d(storyStatisticsStickersFragment).a(fpf0.a(StoryStatisticsComponent.class))).h7();
            case 24:
                return ((uzm0) this.c).n;
            case 25:
                oko0 oko0Var = (oko0) this.c;
                SelectionChangeEditText selectionChangeEditText = oko0Var.c;
                return new GestureDetector(selectionChangeEditText != null ? selectionChangeEditText.getContext() : null, oko0Var.new a());
            case 26:
                return ((BridgeComponent) ((k7m) m7m.f((mxq0) this.c)).a(fpf0.a(BridgeComponent.class))).s();
            case 27:
                UserRecomThemesFragment userRecomThemesFragment = (UserRecomThemesFragment) this.c;
                int i4 = UserRecomThemesFragment.U;
                return Boolean.valueOf(userRecomThemesFragment.requireArguments().getBoolean("from_registration_key"));
            case 28:
                WeakReference<VideoTextureView> weakReference = ((VideoAutoPlay) this.c).A;
                if (weakReference != null) {
                    return weakReference.get();
                }
                return null;
            default:
                return (VideoChannelComponent) m7m.d(((acs0) this.c).a).mo408a(fpf0.a(VideoChannelComponent.class));
        }
    }
}
