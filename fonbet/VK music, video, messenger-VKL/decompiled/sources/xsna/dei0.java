package xsna;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.ProfileType;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.camera.editor.stories.impl.di.StoryEditorComponentImpl;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.ecomm.storefront.impl.community.presentation.fragment.StorefrontFragment;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.libvideo.api.di.VideoAdvertisementsComponent;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.screen.VideoActivity;
import com.vk.media.MediaFilteringStrategy;
import com.vk.media.filters.di.FiltersComponent;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.profile.user.impl.ui.f;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.stories.design.view.stats.tabs.info.mvi.StoryStatisticsInfoFragment;
import com.vk.stories.viewer.reactions.impl.di.StoryReactionsComponentImpl;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogContentVh;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import one.video.controls20.SimpleControlsView;
import one.video.player.OneVideoPlayer;
import xsna.c9p0;
import xsna.hgr0.a;
import xsna.pdq0.b;
import xsna.sx40;
import xsna.z6l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class dei0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dei0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v98, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 15;
        boolean z = false;
        int i3 = 1;
        ?? r10 = this.c;
        switch (i) {
            case 0:
                bei0 bei0Var = (bei0) r10;
                return Boolean.valueOf((bei0Var.y && bei0Var.g()) ? false : true);
            case 1:
                ixi0 ixi0Var = (ixi0) r10;
                RecyclerView recyclerView = (RecyclerView) ixi0Var.a.findViewById(R.id.session_rooms);
                recyclerView.setLayoutManager((LinearLayoutManager) ixi0Var.b.getValue());
                androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g();
                gVar.g = false;
                recyclerView.setItemAnimator(gVar);
                recyclerView.setRecycledViewPool(new rru());
                recyclerView.setHasFixedSize(false);
                bwt0.R(recyclerView, new p0r(ixi0Var, 4));
                return recyclerView;
            case 2:
                HorizontalRecyclerPaginationView a = ((znj0) r10).h().a();
                if (a != null) {
                    a.Fe();
                }
                return s3q0.a;
            case 3:
                OneVideoPlayer oneVideoPlayer = ((SimpleControlsView) r10).x;
                if (oneVideoPlayer != null && oneVideoPlayer.getState() == OneVideoPlayer.State.ENDED) {
                    oneVideoPlayer.seekTo(0L);
                }
                return s3q0.a;
            case 4:
                ((NewsFeedComponent) ((k7m) m7m.f((cvj0) r10)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 5:
                b.d dVar = new b.d("media_event_popup_action");
                dVar.b((String) r10, "event_id");
                dVar.e();
                return s3q0.a;
            case 6:
                return new ie0((u750) r10);
            case 7:
                s7l0 s7l0Var = (s7l0) r10;
                s7l0Var.H();
                vlo d = s7l0Var.p.d();
                c5p c5pVar = s7l0Var.n;
                List<uap> list = d.a;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Object meta = ((uap) it.next()).getMeta();
                    f5l0 f5l0Var = meta instanceof f5l0 ? (f5l0) meta : null;
                    if (f5l0Var != null) {
                        arrayList.add(f5l0Var);
                    }
                }
                c5pVar.b(new z6l0.b(arrayList));
                s7l0Var.d.c(true);
                return s3q0.a;
            case 8:
                int i4 = StickersDatabase_Impl.B;
                return new r6n0((StickersDatabase_Impl) r10);
            case 9:
                StorefrontFragment storefrontFragment = (StorefrontFragment) r10;
                qcy<Object>[] qcyVarArr = StorefrontFragment.S;
                return new ull0(storefrontFragment.requireContext(), storefrontFragment, m7m.d(storefrontFragment));
            case 10:
                CommonEditorComponent commonEditorComponent = (CommonEditorComponent) r10;
                qcy<Object>[] qcyVarArr2 = StoryEditorComponentImpl.h;
                return new ei9(commonEditorComponent.Ha(), commonEditorComponent.Wc(), commonEditorComponent.W3(), commonEditorComponent.X7());
            case 11:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) r10;
                y4t y4tVar = (y4t) storyMediaPickerFragment.Q.getValue();
                Bundle bundle = new Bundle();
                dhr0.a.getClass();
                bundle.putInt("theme", dhr0.u().c);
                bundle.putInt("media_type", 111);
                bundle.putBoolean("camera_enabled", false);
                bundle.putBoolean("long_previews", true);
                bundle.putBoolean("short_divider", true);
                bundle.putBoolean("prevent_styling_photo", false);
                bundle.putBoolean("prevent_styling_video", false);
                bundle.putSerializable("video_filtering_mode", MediaFilteringStrategy.VIDEO_AVC);
                bundle.putLong("story_trim_end_position", 60000L);
                bundle.putBoolean("single_mode", false);
                bundle.putParcelable("camera_params", storyMediaPickerFragment.fo());
                bundle.putLong("video_max_length_ms", TimeUnit.MINUTES.toMillis(3L));
                bundle.putBoolean("show_story_camera", true);
                bundle.putParcelable("gallery_picker_source_configuration", new GalleryPickerSourceConfiguration(false, false, GalleryPickerSourceConfiguration.EntryPoint.STORY, true, false, false, false, true, null, 371, null));
                return new s3t(bundle, y4tVar, new h6m0(storyMediaPickerFragment, r8 ? 1 : 0), new j5b0(storyMediaPickerFragment, i2), new tbe0(storyMediaPickerFragment, i2), new irc0(storyMediaPickerFragment, i2), new fhk0(storyMediaPickerFragment, i3));
            case 12:
                nwy nwyVar = ((StoryReactionsComponentImpl) r10).b;
                qcy<Object> qcyVar = StoryReactionsComponentImpl.d[0];
                return new gbm0((hbm0) nwyVar.c());
            case 13:
                return StoryStatisticsInfoFragment.fo((StoryStatisticsInfoFragment) r10);
            case 14:
                ColorDrawable colorDrawable = new ColorDrawable();
                colorDrawable.setColor(((xno0) r10).k);
                return colorDrawable;
            case 15:
                ((zak0) ((e6p0) r10).h).setValue(Boolean.valueOf(!r10.o()));
                return s3q0.a;
            case 16:
                TopBar$Middle.b bVar = (TopBar$Middle.b) r10;
                ((izs) ((zak0) bVar.e).getValue()).invoke(new tho0("", 0L, 6));
                gzs gzsVar = (gzs) ((zak0) bVar.h).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 17:
                ((izs) ((zak0) ((c9p0.d) r10).b).getValue()).invoke(new sx40.o0(PlayerContext.TOP));
                return s3q0.a;
            case 18:
                pdq0 pdq0Var = (pdq0) r10;
                return pdq0Var.new b((Looper) pdq0Var.k.getValue());
            case 19:
                return new f.e.AbstractC1725f.b(((f.b.c) ((f.b) r10)).a);
            case 20:
                hgr0 hgr0Var = (hgr0) r10;
                Regex regex = hgr0.X;
                return new vdr0(hgr0Var.requireContext(), hgr0Var.yn(), (wc80) hgr0Var.vn().k.getValue(), new udr0(hgr0Var.new a()), null, hgr0Var.vn().d.getState().f());
            case 21:
                return (TextView) ((lor0) r10).a.findViewById(R.id.nativeads_title);
            case 22:
                int i5 = VideoActivity.I;
                return ((VideoMinimizablePlayerComponent) m7m.a((VideoActivity) r10).a(fpf0.a(VideoMinimizablePlayerComponent.class))).P7();
            case 23:
                VideoCatalogSearchRootVh videoCatalogSearchRootVh = (VideoCatalogSearchRootVh) r10;
                if (((b25) videoCatalogSearchRootVh.t.getValue()).c0() != ProfileType.RELATED) {
                    ((vqs0) videoCatalogSearchRootVh.s.getValue()).getClass();
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                return ((FiltersComponent) ((k7m) m7m.c(((qis0) r10).h)).mo408a(fpf0.a(FiltersComponent.class))).r7();
            case 25:
                int i6 = VideoInteractiveFullscreenFragment.Q0;
                return (VideoShareComponent) m7m.d((VideoInteractiveFullscreenFragment) r10).a(fpf0.a(VideoShareComponent.class));
            case 26:
                return new i1t0(true, ((g7s0) r10).J().Y1());
            case 27:
                return rl3.I(new kss0[]{new qms0(r10), new igd0(), new zae0(r10), new qab0(r10), BuildInfo.q() ? new miz() : null, new dbo(r8 ? 1 : 0), new g0n0(), new vzm0(), new m7k(), new dbo(i3), new xh20(), new ost0(), new ke30(), new k9s0(), null, new j9s0()});
            case 28:
                return (VideoAdvertisementsComponent) ((f8m) r10).c(fpf0.a(VideoAdvertisementsComponent.class));
            default:
                ((VideoProfileCatalogContentVh) r10).s.d();
                return s3q0.a;
        }
    }
}
