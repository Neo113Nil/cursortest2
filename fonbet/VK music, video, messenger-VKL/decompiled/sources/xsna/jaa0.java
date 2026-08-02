package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.attachpicker.stat.data.PhotoParamsDatabase_Impl;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;
import com.vk.common.links.LaunchContext;
import com.vk.coowners.di.NewsfeedCoownersComponent;
import com.vk.draftslist.api.DraftsListComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubFragment;
import com.vk.fave.di.FaveComponent;
import com.vk.feature.uxpolls.modalpoll.UxPollsModalFragment;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.api.di.PostingSettingsComponent;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsFragmentMvi;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.reefton.Reef;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.a9i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class jaa0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jaa0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        LegacyShowUseCase initialize$lambda$220$lambda$130;
        switch (this.b) {
            case 0:
                return new com.vk.attachpicker.stat.data.b((PhotoParamsDatabase_Impl) this.c);
            case 1:
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) this.c;
                int i = PodcastEpisodeFragment.u0;
                return ((MusicKidsModeComponent) m7m.d(podcastEpisodeFragment).a(fpf0.a(MusicKidsModeComponent.class))).n();
            case 2:
                return (NewsfeedCoownersComponent) ((k7m) m7m.f((xzb0) this.c)).a(fpf0.a(NewsfeedCoownersComponent.class));
            case 3:
                PostingAttachLocationFragment postingAttachLocationFragment = (PostingAttachLocationFragment) this.c;
                int i2 = PostingAttachLocationFragment.I0;
                postingAttachLocationFragment.wo();
                return s3q0.a;
            case 4:
                PostingFragment postingFragment = (PostingFragment) this.c;
                int i3 = PostingFragment.L0;
                return ((DraftsListComponent) ((k7m) m7m.f(postingFragment)).mo408a(fpf0.a(DraftsListComponent.class))).a();
            case 5:
                com.vk.newsfeed.impl.items.posting.item.modals.b bVar = (com.vk.newsfeed.impl.items.posting.item.modals.b) this.c;
                bVar.b.I0(null, bVar.a.h, true);
                return s3q0.a;
            case 6:
                PostingSettingsFragmentMvi postingSettingsFragmentMvi = (PostingSettingsFragmentMvi) this.c;
                int i4 = PostingSettingsFragmentMvi.Y;
                return ((PostingSettingsComponent) ((k7m) m7m.f(postingSettingsFragmentMvi)).mo408a(fpf0.a(PostingSettingsComponent.class))).X();
            case 7:
                f3d0 f3d0Var = (f3d0) this.c;
                int width = f3d0Var.E.getWidth();
                ViewGroup viewGroup = f3d0Var.E;
                Context context = viewGroup.getContext();
                HashSet hashSet = iah0.a;
                if (fnj.d(context)) {
                    width -= gjf0.a(viewGroup.getContext(), true) * 2;
                }
                return Integer.valueOf((int) (width * 0.58f));
            case 8:
                return ((FaveComponent) ((rkd0) this.c).f.getValue()).xf();
            case 9:
                foe0 foe0Var = (foe0) this.c;
                int i5 = foe0.D1;
                hv20<?> hv20Var = foe0Var.r1;
                (hv20Var != null ? hv20Var : null).L2();
                return s3q0.a;
            case 10:
                a9i0 a9i0Var = (a9i0) this.c;
                a9i0.a aVar = a9i0.i1;
                return new d9i0(a9i0Var.kn(), msy.a(LazyThreadSafetyMode.NONE, new b990(a9i0Var, 12)), a9i0Var);
            case 11:
                dbi0 dbi0Var = (dbi0) this.c;
                int i6 = dbi0.r1;
                dbi0Var.dismiss();
                return s3q0.a;
            case 12:
                initialize$lambda$220$lambda$130 = ServiceProvider.initialize$lambda$220$lambda$130((ServicesRegistry) this.c);
                return initialize$lambda$220$lambda$130;
            case 13:
                return ((NarrativeComponent) m7m.d((e8j0) this.c).a(fpf0.a(NarrativeComponent.class))).Ic();
            case 14:
                return (TextView) ((com.vk.sharing.core.view.f) this.c).findViewById(R.id.sharing_send_button_title);
            case 15:
                ((zvk0) this.c).b.a(StaticAdsItemViewEvent.a.b);
                return s3q0.a;
            case 16:
                List list = (List) this.c;
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                ftq A = StickersDatabase.a.b().A();
                List<StickerItem> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (StickerItem stickerItem : list2) {
                    arrayList.add(new atq(stickerItem.b, stickerItem.d, stickerItem.e, stickerItem.f, stickerItem.g, stickerItem.h, stickerItem.i, stickerItem.j, stickerItem.k, 2));
                }
                A.c(arrayList);
                return s3q0.a;
            case 17:
                return (jfm0) ((sbl0) this.c).h.invoke();
            case 18:
                Reef reef = ((hwl0) ((jwl0) this.c).b.c).a;
                if (reef == null) {
                    tv4.b("Reef is expected to be set at this point", com.vk.metrics.eventtracking.b.a);
                }
                if (reef != null) {
                    return new knf0(reef);
                }
                return null;
            case 19:
                ovn0 ovn0Var = (ovn0) this.c;
                qcy<Object>[] qcyVarArr = ovn0.m1;
                return ((TabbarSettingsComponent) ((k7m) m7m.f(ovn0Var)).a(fpf0.a(TabbarSettingsComponent.class))).b1();
            case 20:
                ndo0 ndo0Var = (ndo0) this.c;
                return ndo0Var.o ? fdo0.a(ndo0Var) : vco0.b;
            case 21:
                gho0 gho0Var = (gho0) this.c;
                tho0 g = gho0.g(gho0Var.p().a, jgz.c(0, gho0Var.p().a.c.length()));
                gho0Var.c.invoke(g);
                long j = g.b;
                gho0Var.x = new qko0(j);
                gho0Var.v = tho0.b(gho0Var.v, null, j, 5);
                gho0Var.j(true);
                return s3q0.a;
            case 22:
                ((com.vk.im.ui.components.theme_chooser.c) this.c).a.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.setOrientation(0);
                return linearLayoutManager;
            case 23:
                com.vk.profile.core.cover.a aVar2 = (com.vk.profile.core.cover.a) this.c;
                if (aVar2 != null) {
                    return aVar2;
                }
                throw new IllegalArgumentException("coverDelegate must be set for the legacy (non-Lego) header");
            case 24:
                return ((vxq0) this.c).n().a.n;
            case 25:
                return ((ClipsConfigViewersComponent) ((kzq0) this.c).a.a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 26:
                UxPollsModalFragment uxPollsModalFragment = (UxPollsModalFragment) this.c;
                int i7 = UxPollsModalFragment.f0;
                return Long.valueOf(uxPollsModalFragment.requireArguments().getLong("id"));
            case 27:
                VerificationStubFragment verificationStubFragment = (VerificationStubFragment) this.c;
                maz.c((maz) verificationStubFragment.N.getValue(), verificationStubFragment.requireContext(), i5s.a(new StringBuilder("https://"), a0a.d, "/@vk-verify"), LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 28:
                VideoCatalogFragment videoCatalogFragment = (VideoCatalogFragment) this.c;
                int i8 = VideoCatalogFragment.l0;
                return ((OnboardingComponent) m7m.d(videoCatalogFragment).a(fpf0.a(OnboardingComponent.class))).Yd();
            default:
                return new i1t0(true, ((VideoItemListSmallVh) this.c).n.J().Y1());
        }
    }

    public /* synthetic */ jaa0(List list, m9l0 m9l0Var) {
        this.b = 16;
        this.c = list;
    }
}
