package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.draftslist.api.DraftsListComponent;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.notifications.list.impl.presentation.base.fragment.list.NotificationListFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.poll.views.PollTimePickerView;
import com.vk.profile.questions.impl.QuestionsUsableRecyclerPaginatedView;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.stories.design.view.StoryProgressView;
import com.vkontakte.android.R;
import kotlin.Result;
import me.grishka.appkit.views.UsableRecyclerView;
import ru.ok.android.webrtc.PatchedVideoEncoderFactory;
import ru.ok.media.OkmpStreamPublisher;
import xsna.m760;
import xsna.m760.b;
import xsna.rfa0.c;
import xsna.xh60;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w100 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w100(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 doFail$lambda$38;
        int totalScrollDy = 0;
        int i = 2;
        switch (this.b) {
            case 0:
                pk50 pk50Var = (pk50) this.c;
                return "[send event] New MVI event [" + fpf0.a(pk50Var.getClass()).l() + "] with data: " + pk50Var + ' ' + x100.a(null);
            case 1:
                return ((ke00) this.c).a.kn();
            case 2:
                ((vw20) this.c).f.invoke();
                return s3q0.a;
            case 3:
                MusicOfflineCatalogFragment musicOfflineCatalogFragment = (MusicOfflineCatalogFragment) this.c;
                int i2 = MusicOfflineCatalogFragment.X;
                return ((VkClientMultiAccountComponent) m7m.d(musicOfflineCatalogFragment).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 4:
                return m33.a(R.drawable.vk_icon_illustration_disclaimer_bankruptcy_360w, ((bv50) this.c).b.getContext());
            case 5:
                m760 m760Var = (m760) this.c;
                int i3 = m760.A;
                m760.b bVar = m760Var.new b();
                long m = Preference.m(0L, "games_confirm_exit_dialog", "animation_shown_timestamp");
                return new fdf0(bVar, m == 0 || System.currentTimeMillis() - m >= m760.C, new vo50(2), true);
            case 6:
                return ((NewsFeedComponent) ((k7m) m7m.f((fa60) this.c)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 7:
                return new androidx.lifecycle.m((f5z) ((tc60) this.c).c.getValue(), true);
            case 8:
                NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) this.c;
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                return newsfeedCustomFragment2.getActivity();
            case 9:
                wg60 wg60Var = ((sg60) this.c).j;
                return new Result(wg60Var.b.f(new vxf0(), new gjj0(wg60Var.c)));
            case 10:
                yj60 yj60Var = (yj60) this.c;
                yj60Var.h.m("Display fresh news button");
                yj60Var.c(new xh60.b.a(true));
                return s3q0.a;
            case 11:
                RecyclerView recyclerView = ((rm60) this.c).a;
                if (recyclerView instanceof UsableRecyclerView) {
                    totalScrollDy = ((UsableRecyclerView) recyclerView).getTotalScrollDy();
                } else if (recyclerView instanceof FeedRecyclerView) {
                    totalScrollDy = ((FeedRecyclerView) recyclerView).getTotalScrollDy();
                }
                return Integer.valueOf(totalScrollDy);
            case 12:
                return new qo60((bq60) this.c);
            case 13:
                NotificationListFragment notificationListFragment = (NotificationListFragment) this.c;
                int i4 = NotificationListFragment.a0;
                return ((DataRepositoryComponent) m7m.d(notificationListFragment).a(fpf0.a(DataRepositoryComponent.class))).C();
            case 14:
                id70 id70Var = (id70) this.c;
                int i5 = id70.q1;
                return ((UserProfileComponent) m7m.d(id70Var).mo408a(fpf0.a(UserProfileComponent.class))).m3();
            case 15:
                return wzi0.a((vzi0) ((mtk0) this.c).getValue());
            case 16:
                doFail$lambda$38 = OkmpStreamPublisher.doFail$lambda$38((OkmpStreamPublisher) this.c);
                return doFail$lambda$38;
            case 17:
                return "LivePlayerImpl.handleError() - state= " + wl80.this.G;
            case 18:
                return PatchedVideoEncoderFactory.a((PatchedVideoEncoderFactory) this.c);
            case 19:
                ((StoryProgressView) ((u2a0) this.c).r.getValue()).setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 20:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) this.c;
                int i6 = PhotoFlowFragment.m0;
                return photoFlowFragment.fo().z8();
            case 21:
                return ((rfa0) this.c).new c();
            case 22:
                return (PollTimePickerView) ((hpb0) this.c).g(R.id.poll_time_picker);
            case 23:
                return new z1n((b25) ((com.vk.newsfeed.common.util.j) this.c).b.getValue());
            case 24:
                PostViewFragment postViewFragment = (PostViewFragment) this.c;
                String[] strArr = PostViewFragment.T0;
                hbt0 Ao = postViewFragment.Ao();
                if (Ao != null) {
                    Ao.y();
                }
                return s3q0.a;
            case 25:
                return ((DraftsListComponent) ((k7m) m7m.f((rhc0) this.c)).mo408a(fpf0.a(DraftsListComponent.class))).a();
            case 26:
                fsc0 fsc0Var = (fsc0) this.c;
                fq60 fq60Var = (fq60) fsc0Var.e.getValue();
                yo60.j.a aVar = yo60.j.a.a;
                gq60 gq60Var = fsc0Var.c;
                fq60Var.getClass();
                fq60.c(aVar, gq60Var);
                return s3q0.a;
            case 27:
                QuestionsUsableRecyclerPaginatedView.a aVar2 = (QuestionsUsableRecyclerPaginatedView.a) this.c;
                int i7 = QuestionsUsableRecyclerPaginatedView.U;
                dhr0.a.getClass();
                dhr0.D().getClass();
                com.vk.core.ui.themes.a.b(aVar2);
                return s3q0.a;
            case 28:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) this.c;
                qcy<Object>[] qcyVarArr2 = ReactionsFeedFragment.q0;
                return new k3f0(new x1e0(reactionsFeedFragment, i));
            default:
                return Integer.valueOf(((idf0) this.c).getBindingAdapterPosition());
        }
    }

    public /* synthetic */ w100(pk50 pk50Var, x100 x100Var) {
        this.b = 0;
        this.c = pk50Var;
    }
}
