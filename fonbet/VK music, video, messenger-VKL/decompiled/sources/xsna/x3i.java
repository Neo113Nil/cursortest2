package xsna;

import android.content.ClipboardManager;
import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.user.RequestUserProfile;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.engine.di.ImCmdDirectExecutorComponent;
import com.vk.im.engine.di.event.ImEventPublisherScopedComponentImpl;
import com.vk.im.engine.event.publisher.di.ImEventPublisherComponent;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.profile.community.creationonboarding.api.models.CreationOnboardingArguments;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.e3m;
import xsna.fss;
import xsna.o2j;
import xsna.pn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class x3i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x3i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        r2 = false;
        r2 = false;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                y89 y89Var = (y89) obj;
                y89Var.invoke(new CommunityProfileAction.e.g.a(null));
                y89Var.invoke(CommunityProfileAction.e.i.c.b);
                return s3q0.a;
            case 1:
                return ((s5i) obj).a.findViewById(R.id.ads_image_container);
            case 2:
                return (TextView) ((z0j) obj).itemView.findViewById(R.id.voip_participants_section_count);
            case 3:
                ((a2j) obj).T(o2j.u.b);
                return s3q0.a;
            case 4:
                Boolean bool = (Boolean) ((mtk0) obj).getValue();
                bool.booleanValue();
                return bool;
            case 5:
                fck fckVar = (fck) obj;
                qcy<Object>[] qcyVarArr = fck.t1;
                final CreationOnboardingArguments creationOnboardingArguments = (CreationOnboardingArguments) fckVar.i1.getValue();
                final zqu zquVar = new zqu();
                Object systemService = fckVar.requireContext().getSystemService("clipboard");
                final ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                return k9q0.g(new c5f(creationOnboardingArguments, 10), new wb0() { // from class: xsna.yck
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        return new wck(sj50Var, CreationOnboardingArguments.this.g, zquVar, clipboardManager);
                    }
                });
            case 6:
                RecyclerView recyclerView = ((r3n) obj).a;
                if (recyclerView instanceof UsableRecyclerView) {
                    i2 = ((UsableRecyclerView) recyclerView).getTotalScrollDy();
                } else if (recyclerView instanceof FeedRecyclerView) {
                    i2 = ((FeedRecyclerView) recyclerView).getTotalScrollDy();
                }
                return Integer.valueOf(i2);
            case 7:
                int i3 = DisplayMusicPlaylistFragment.b0;
                return new ef50(null, new DisplayMusicPlaylistFragment.b(0, (g950) ((DisplayMusicPlaylistFragment) obj).S.getValue(), g950.class, "hasMusicSubscription", "hasMusicSubscription()Z", 0));
            case 8:
                ((cdo) obj).d.invoke();
                return s3q0.a;
            case 9:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) obj;
                qcy<Object>[] qcyVarArr2 = FaveFeedFragment.s0;
                eh60 eh60Var = new eh60(((NewsFeedBridgeComponent) faveFeedFragment.go().b.getValue()).Ad().a().p());
                qn60 qn60Var = new qn60(new zyp0());
                faveFeedFragment.R = qn60Var;
                ?? r1 = faveFeedFragment.go().b;
                bpn0 bpn0Var = faveFeedFragment.T;
                s1c0 s1c0Var = (s1c0) bpn0Var.getValue();
                AtomicReference<String> atomicReference = faveFeedFragment.N;
                pn60 pn60Var = new pn60(new pn60.a(s1c0Var, atomicReference.get(), atomicReference.get()), r1);
                faveFeedFragment.S = pn60Var;
                rn60.a(qn60Var);
                FaveFeedFragment.e eVar = new FaveFeedFragment.e(faveFeedFragment.O);
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) eVar);
                return new qpq(new cqq((s1c0) bpn0Var.getValue(), faveFeedFragment.fo(), qn60Var, pn60Var, eh60Var, new s1v(), faveFeedFragment.go().a, new AtomicReference(new wn60((byte) 0)), new aqw(), faveFeedFragment.eo(), new cpq(new aqq(), new jpq(), new yoq()), cVar, fs60.a(qn60Var, pn60Var, cVar, faveFeedFragment.go().a)));
            case 10:
                yis yisVar = (yis) obj;
                yisVar.n.a(new fss.b.c((RequestUserProfile) yisVar.m));
                return s3q0.a;
            case 11:
                int i4 = FriendsImportFragment.a0;
                return ((FriendsImportFragment) obj).jo().e;
            case 12:
                return ((GalleryFragmentImpl) obj).g0;
            case 13:
                ((uut) obj).j();
                return s3q0.a;
            case 14:
                return ((y4u) obj).h.xe();
            case 15:
                HomeFragment2 homeFragment2 = (HomeFragment2) obj;
                int i5 = HomeFragment2.x0;
                ViewPager viewPager = homeFragment2.S;
                if (viewPager != null && viewPager.getCurrentItem() == 0 && homeFragment2.ko()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                return (ImCmdDirectExecutorComponent) ((g8m) obj).a(fpf0.a(ImCmdDirectExecutorComponent.class));
            case 17:
                ImEventPublisherScopedComponentImpl imEventPublisherScopedComponentImpl = (ImEventPublisherScopedComponentImpl) obj;
                acw acwVar = imEventPublisherScopedComponentImpl.a;
                return acwVar.a ? new t3w(sdy.n(acwVar)) : ((ImEventPublisherComponent) imEventPublisherScopedComponentImpl.b.getValue()).G();
            case 18:
                return new androidx.lifecycle.m((f5z) ((z8w) obj).k.getValue(), true);
            case 19:
                h5x h5xVar = (h5x) obj;
                wh50 wh50Var = h5xVar.m;
                h5xVar.setInspectorEnabled(!((Boolean) ((zak0) wh50Var).getValue()).booleanValue());
                izs<Boolean, s3q0> onChangeHighlight = h5xVar.getOnChangeHighlight();
                if (onChangeHighlight != null) {
                    Boolean bool2 = (Boolean) ((zak0) wh50Var).getValue();
                    bool2.booleanValue();
                    onChangeHighlight.invoke(bool2);
                }
                return s3q0.a;
            case 20:
                return new zvp(((n1y) obj).c);
            case 21:
                ((a500) obj).l(ImBgSyncState.CONNECTED);
                return s3q0.a;
            case 22:
                return ((bg20) obj).b.a(OpenMessagesHistoryReporter.Span.LOAD_MESSAGES_HISTORY_TOTAL);
            case 23:
                return ((jl30) obj).k().a(OpenMessagesHistoryReporter.Span.LOAD_PROFILES);
            case 24:
                Context e = ((zn30) obj).e();
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.vk_icon_pause_24, e);
            case 25:
                Context context = ((qr30) obj).d;
                return (context != null ? context : null).getString(R.string.vkim_msg_link_single);
            case 26:
                return Boolean.valueOf(((u440) obj).d8());
            case 27:
                return ((MusicAnalyticsComponent) ((k7m) m7m.f((MusicSearchCatalogRootVh) obj)).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 28:
                um50 um50Var = (um50) obj;
                ml50 ml50Var = um50Var.f;
                vj50<State, TaskId, Task, Patch> vj50Var = um50Var.b;
                ((qj50) ml50Var.c).init();
                um50Var.h.b.init();
                rl50<State> rl50Var = um50Var.i;
                if (rl50Var != 0) {
                    rl50Var.init();
                }
                yl50 b = vj50Var.b();
                if (b != null) {
                    um50Var.a(b);
                } else {
                    um50Var.e(new ye40(3));
                }
                List<hn50> c = vj50Var.c(um50Var.e.b());
                if (c != null) {
                    for (hn50 hn50Var : c) {
                        if (hn50Var != null) {
                            um50Var.g(hn50Var);
                        }
                    }
                }
                return s3q0.a;
            default:
                return ((ClipsUploadVkComponent) j6i.b((h7m) ((yx50) obj).C.getValue(), ClipsUploadVkComponent.class)).Uc();
        }
    }
}
