package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.catalog2.common.ui.mvp.holder.ComposeConfigurableHeaderVh;
import com.vk.contactssync.impl.di.ContactSyncColdStartModalComponentImpl;
import com.vk.core.fragments.BottomFragmentHandler;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendsRequestsPaginatedView;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.narratives.impl.highlights.HighlightChooseCoverFragment;
import com.vk.navigation.marked.FragmentWithGlobalSearch$TargetAction;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchChannelsCatalogRootVh;
import com.vk.video.growth.api.CommunityGrowthTrapEvent;
import com.vk.video.growth.api.CommunityGrowthTrapScreen;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import xsna.l5n;
import xsna.pn60;
import xsna.w1g0;
import xsna.xdr;
import xsna.xn50;
import xsna.xyj;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dnh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x03a3, code lost:
    
        if (r1 == null) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        UserId userId;
        Object obj;
        Object parcelable;
        int i = this.b;
        int i2 = 8;
        int i3 = 4;
        int i4 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((MarketComponent) ((h7m) obj2).a(fpf0.a(MarketComponent.class))).Ob();
            case 1:
                ((VideoGrowthComponent) ((mph) obj2).b.a1.getValue()).Z7().f(CommunityGrowthTrapScreen.GROUP, CommunityGrowthTrapEvent.BOTTOM_BANNER);
                return s3q0.a;
            case 2:
                com.vk.profile.community.impl.ui.profile.c cVar = (com.vk.profile.community.impl.ui.profile.c) obj2;
                CommunityProfileFragment communityProfileFragment = cVar.a;
                ynh ynhVar = cVar.d;
                ajg0 ajg0Var = (ajg0) ynhVar.g.getValue();
                gyh gyhVar = (gyh) ynhVar.i.getValue();
                com.vk.movika.sdk.base.logic.processor.actions.d dVar = cVar.j;
                Bundle arguments = communityProfileFragment.getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = arguments.getParcelable("id", UserId.class);
                        obj = (Parcelable) parcelable;
                    } else {
                        ?? parcelable2 = arguments.getParcelable("id");
                        obj = (UserId) (parcelable2 instanceof UserId ? parcelable2 : null);
                    }
                    userId = (UserId) obj;
                    break;
                }
                userId = UserId.d;
                return new cwh(communityProfileFragment, ajg0Var, dVar, gyhVar, userId, ynhVar.f());
            case 3:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) obj2;
                mfy mfyVar = communityRepliesFragment.Y;
                WriteBar writeBar = communityRepliesFragment.U;
                EditText input = writeBar != null ? writeBar.getInput() : null;
                mfyVar.getClass();
                int i5 = CommunityRepliesFragment.d0;
                xn50.a.c(communityRepliesFragment, w1g0.f.b);
                s3q0 s3q0Var = s3q0.a;
                if (mfyVar.a && input != null) {
                    input.post(new sc4(input, i2));
                }
                return s3q0.a;
            case 4:
                int i6 = ComposeConfigurableHeaderVh.F;
                return ((ComposeConfigurableHeaderVh) obj2).a().findViewById(R.id.ds_internal_group_header_right_layout);
            case 5:
                i1j i1jVar = (i1j) obj2;
                View findViewById = i1jVar.c.findViewById(R.id.voip_save_room_participants_button);
                bwt0.i0(findViewById, new cqf(i1jVar, i2));
                return findViewById;
            case 6:
                return (TextView) ((k2j) obj2).itemView.findViewById(R.id.room_participants);
            case 7:
                return new t9j(((ContactSyncColdStartModalComponentImpl) obj2).a.g5(), com.vk.contacts.d.a, new u9j());
            case 8:
                ((lzj) obj2).a.invoke(xyj.b.a.b);
                return s3q0.a;
            case 9:
                return new pco(((s890) obj2).b());
            case 10:
                fhl fhlVar = (fhl) obj2;
                return new g7o(new ehl(fhlVar), new krh(fhlVar, i3));
            case 11:
                ShortVideoListView.c cVar2 = (ShortVideoListView.c) ((zoi) ((ShortVideoListView.e) obj2).j.getValue()).getValue();
                if (cVar2 != null) {
                    cVar2.invoke(true);
                }
                return s3q0.a;
            case 12:
                vtm vtmVar = (vtm) obj2;
                vtmVar.l.setVisibility(8);
                vtmVar.w.e(false);
                vtmVar.x.c(false);
                vtmVar.y.c(false);
                vtmVar.z.c(true);
                vtmVar.A.c(false);
                vtmVar.B.c(false);
                vtmVar.n.setVisibility(4);
                vtmVar.r.submitList(vtmVar.D.a);
                return s3q0.a;
            case 13:
                DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) obj2;
                s1c0 s1c0Var = (s1c0) discoverMediaTabFragment2.R.getValue();
                String str = (String) ((AtomicReference) discoverMediaTabFragment2.b0.getValue()).get();
                bpn0 bpn0Var = discoverMediaTabFragment2.c0;
                pn60.a aVar = new pn60.a(s1c0Var, str, (String) ((AtomicReference) bpn0Var.getValue()).get());
                qn60 qn60Var = new qn60(new uhp());
                DiscoverMediaTabFragment2.f fVar = new DiscoverMediaTabFragment2.f((AtomicReference) bpn0Var.getValue());
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar3 = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) fVar);
                pn60 pn60Var = new pn60(aVar, discoverMediaTabFragment2.fo().e);
                p2n eo = discoverMediaTabFragment2.eo();
                a3n fo = discoverMediaTabFragment2.fo();
                x5n x5nVar = discoverMediaTabFragment2.d0;
                ?? r10 = discoverMediaTabFragment2.Q;
                es60 a = fs60.a(qn60Var, pn60Var, cVar3, discoverMediaTabFragment2.fo().a);
                ?? r4 = fo.e;
                bpn0 bpn0Var2 = new bpn0(new v3n(((NewsFeedBridgeComponent) r4.getValue()).Ad().a(), i4));
                s1v s1vVar = new s1v();
                t4n a2 = t4n.a(t4n.f, null, eo.b, eo.c, 0, 9);
                ArrayList u0 = j5g.u0(e43.l(l5n.a.C3232a.b, l5n.a.b.b, l5n.a.c.b), Collections.singletonList(l5n.b.C3233b.b));
                AtomicReference atomicReference = new AtomicReference(new wn60((byte) 0));
                qn60 qn60Var2 = a.a;
                a5n a5nVar = new a5n(new z3n(new b4n(), new a4n(), new y3n()), qn60Var2, a.b, a.c, atomicReference, bpn0Var2, fo.f, fo.d, r4, fo.i, fo.j, fo.c, s1vVar, r10, fo.k, fo.p, fo.q, x5nVar, a);
                rn60.a(qn60Var2);
                return new y4n(new z4n(new p3h(a2, 10), new we0(u0, 3)), a5nVar, fo.o);
            case 14:
                c8n c8nVar = (c8n) obj2;
                fq60 fq60Var = (fq60) c8nVar.e.getValue();
                yo60.j.a aVar2 = yo60.j.a.a;
                gq60 gq60Var = c8nVar.c;
                fq60Var.getClass();
                fq60.c(aVar2, gq60Var);
                return s3q0.a;
            case 15:
                return g5z.a(((w3p) obj2).a);
            case 16:
                int i7 = ExploreFragment.h0;
                ((ExploreFragment) obj2).no(FragmentWithGlobalSearch$TargetAction.HeaderSearchQueryViewClick);
                return s3q0.a;
            case 17:
                iar iarVar = (iar) obj2;
                if (iarVar.h == null) {
                    return null;
                }
                File file = iarVar.h;
                return new u7r(new File(file != null ? file : null, "append"), iarVar.c, iarVar.b, iarVar.e, iarVar.f);
            case 18:
                com.vk.photo.editor.features.filter.b bVar = (com.vk.photo.editor.features.filter.b) obj2;
                com.vk.photo.editor.features.filter.c cVar4 = bVar.c;
                v3p v3pVar = bVar.d;
                FilterUiModel l = cVar4.l();
                FilterUiModel k = l != null ? cVar4.k(l) : null;
                v3pVar.c(true);
                v3pVar.b().b(new xdr.e(((com.vk.photo.editor.ivm.filter.c) ((b8f0) cVar4.m()).b.getValue()).d, l != null ? l.b : null, l != null ? l.i : null, k != null ? k.b : null));
                return s3q0.a;
            case 19:
                ((apr) obj2).b.requestLayout();
                return s3q0.a;
            case 20:
                com.vk.core.fragments.e eVar = (com.vk.core.fragments.e) obj2;
                if (com.vk.toggle.d.J()) {
                    return new BottomFragmentHandler(eVar.a);
                }
                return null;
            case 21:
                ((ahs) obj2).getClass();
                return null;
            case 22:
                FriendsRequestsPaginatedView friendsRequestsPaginatedView = ((FriendRequestsFragment) obj2).Z;
                if (friendsRequestsPaginatedView != null) {
                    return friendsRequestsPaginatedView.getRecyclerView();
                }
                return null;
            case 23:
                m9t m9tVar = (m9t) obj2;
                m9tVar.j1.invoke();
                m9tVar.dismiss();
                return s3q0.a;
            case 24:
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                return Integer.valueOf(e3m.a(R.dimen.vk_bottom_navigation_height, ((GeoFragment) obj2).requireContext()));
            case 25:
                return Boolean.valueOf(((wot) obj2).b.e());
            case 26:
                return new o6a(((GlobalSearchChannelsCatalogRootVh) obj2).m.b.s.N(), r6, i3);
            case 27:
                GoodFragment goodFragment = (GoodFragment) obj2;
                qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                return new vkd0(new GoodFragment.b(1, goodFragment.Qo(), omd0.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0), (rkd0) goodFragment.L0.getValue());
            case 28:
                int i8 = HighlightChooseCoverFragment.R;
                ((HighlightChooseCoverFragment) obj2).finish();
                return s3q0.a;
            default:
                return new y8x(((cev) obj2).s.d(brm0.x(1000, "abc")));
        }
    }
}
