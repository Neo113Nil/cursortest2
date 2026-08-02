package xsna;

import android.app.usage.UsageStatsManager;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.gallery.FastScroller;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.bridges.ProfileType;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.friends.recommendations.impl.presentation.RecommendationsRecyclerPaginatedView;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.sync.impl.DeferredSyncWorker;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;
import com.vk.navigation.marked.FragmentWithGlobalSearch$TargetAction;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchVideoRootVh;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vkontakte.android.R;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.webrtc.RTCLog;
import xsna.gfq;
import xsna.i6w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class b1j implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b1j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        RTCLog lambda$getRemoteSettings$14;
        io.reactivex.rxjava3.disposables.c cVar;
        FastScroller fastScroller;
        int i = this.b;
        int i2 = 17;
        boolean z = false;
        int i3 = 2;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((c1j) obj).itemView.findViewById(R.id.voip_room_participant_hand_status);
            case 1:
                lambda$getRemoteSettings$14 = ((ConversationFactory) obj).lambda$getRemoteSettings$14();
                return lambda$getRemoteSettings$14;
            case 2:
                LayoutNode f = itl.f((puj) obj);
                if (!f.u) {
                    voy.a(f).e(f);
                }
                return s3q0.a;
            case 3:
                ((k5h) obj).invoke();
                return s3q0.a;
            case 4:
                return (fhd0) ((h9l) obj).provide();
            case 5:
                ugl uglVar = (ugl) obj;
                uglVar.w(ocx.a(uglVar.l, null, null, false, null, null, null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4193791));
                return s3q0.a;
            case 6:
                return Integer.valueOf(((UsageStatsManager) ((DeferredSyncWorker) obj).b.getSystemService("usagestats")).getAppStandbyBucket());
            case 7:
                return new ns20(((k9m) obj).c);
            case 8:
                qkr0 qkr0Var = ((zam) obj).h;
                if (qkr0Var != null && (cVar = qkr0Var.a.v) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 9:
                View view = ((gfm) obj).c.g;
                LinearInterpolator linearInterpolator = gfm.n;
                return new vtt0(view, linearInterpolator, linearInterpolator, 200L, 16);
            case 10:
                psm psmVar = (psm) obj;
                io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
                io.reactivex.rxjava3.core.q<R> L = fVar.c(psmVar.z.a0(psmVar.q)).L(new ql2(new wq3(22), 14), false);
                xl0 xl0Var = new xl0(new rl2(18), i2);
                L.getClass();
                psmVar.i(new io.reactivex.rxjava3.internal.operators.observable.i0(L, xl0Var), io.reactivex.rxjava3.internal.functions.a.e, new el6(psmVar, 20));
                return fVar;
            case 11:
                return ((NewsFeedComponent) ((k7m) m7m.c(((hym) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 12:
                ((xuo) obj).c();
                return s3q0.a;
            case 13:
                int i4 = txo.q1;
                return ((MultiAccountComponent) ((k7m) m7m.f((txo) obj)).a(fpf0.a(MultiAccountComponent.class))).a();
            case 14:
                VkAuthErrorStatedEditText vkAuthErrorStatedEditText = ((opp) obj).y;
                return String.valueOf((vkAuthErrorStatedEditText != null ? vkAuthErrorStatedEditText : null).getText());
            case 15:
                int i5 = EntriesListFragment.m0;
                return ((StoryViewerComponent) m7m.d((EntriesListFragment) obj).a(fpf0.a(StoryViewerComponent.class))).va();
            case 16:
                gfq gfqVar = ((ffq) obj).a().f;
                if (!(gfqVar.c.P0() instanceof gfq.b.C2941b)) {
                    gfqVar.a.hide();
                }
                return s3q0.a;
            case 17:
                RecommendationsRecyclerPaginatedView recommendationsRecyclerPaginatedView = ((FriendsRecommendationsFragment) obj).Y;
                if (recommendationsRecyclerPaginatedView != null) {
                    return recommendationsRecyclerPaginatedView.getRecyclerView();
                }
                return null;
            case 18:
                return new xcx(((evs) obj).E);
            case 19:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) obj;
                if (galleryFragmentImpl.R.E.e && (fastScroller = galleryFragmentImpl.v0) != null) {
                    fastScroller.l.postDelayed(new kv2(fastScroller, i3), 500L);
                }
                return s3q0.a;
            case 20:
                GeoFragment geoFragment = (GeoFragment) obj;
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                return new cil(new bpn0(new myh(geoFragment, i2)), new bpn0(new dne(geoFragment, 27)));
            case 21:
                twt0.b(6, 100L, ((fzt) obj).i);
                return s3q0.a;
            case 22:
                GlobalSearchVideoRootVh globalSearchVideoRootVh = (GlobalSearchVideoRootVh) obj;
                if (((b25) globalSearchVideoRootVh.y.getValue()).c0() != ProfileType.RELATED) {
                    ((vqs0) globalSearchVideoRootVh.x.getValue()).getClass();
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                final giu giuVar = (giu) obj;
                return new ParticipantStatesManager.Listener() { // from class: xsna.fiu
                    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
                    public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
                        giu giuVar2 = giu.this;
                        kiu kiuVar = giuVar2.w;
                        if (kiuVar != null) {
                            giuVar2.c5(participantStatesManager.isHandRaised(mnh0.H(kiuVar.a.a)));
                        }
                    }
                };
            case 24:
                int i6 = HomeFragment2.x0;
                FragmentWithGlobalSearch$TargetAction fragmentWithGlobalSearch$TargetAction = FragmentWithGlobalSearch$TargetAction.HeaderSearchIconClick;
                FragmentActivity activity = ((HomeFragment2) obj).getActivity();
                if (activity != null) {
                    int i7 = HomeFragment2.b.$EnumSwitchMapping$0[fragmentWithGlobalSearch$TargetAction.ordinal()];
                    hd60.a().j0(activity, i7 != 1 ? i7 != 2 ? FragmentWithGlobalSearch$EntryMethod.Unknown : FragmentWithGlobalSearch$EntryMethod.FeedScreenSearchIcon : FragmentWithGlobalSearch$EntryMethod.HomeBottomIconLongTap);
                }
                return s3q0.a;
            case 25:
                return new gaw((und0) obj);
            case 26:
                ((f7w) obj).b.invoke(i6w.m.b);
                return s3q0.a;
            case 27:
                zvj.c(((dfw) obj).e, null);
                return s3q0.a;
            case 28:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar2 = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c) obj;
                cVar2.c.a();
                cVar2.c.c();
                return s3q0.a;
            default:
                return (TextView) ((wex) obj).itemView.findViewById(R.id.video_single_clip_owner);
        }
    }
}
