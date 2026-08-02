package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.vk.auth.restore.RestoreReason;
import com.vk.bridges.di.BridgeComponent;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.dto.Push;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.friends.impl.friends.presentation.fragment.PaginatedFriendsListFragment;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.profile.design.view.fab.ProfileFabView;
import com.vk.restriction.di.VideoRestrictionManagerComponent;
import com.vk.search.integration.friends.api.di.SearchFriendsIntegrationComponent;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import one.video.exo.offline.e;
import xsna.ahe0;
import xsna.e3m;
import xsna.n7r0;
import xsna.nyd0.h;
import xsna.vs60;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zf20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zf20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        UserId userId;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((bg20) obj).b.a(OpenMessagesHistoryReporter.Span.MESSAGES_ADAPTER_RENDER);
            case 1:
                return ((jl30) obj).k().a(OpenMessagesHistoryReporter.Span.LOAD_MESSAGES);
            case 2:
                ((vm30) obj).i.j();
                return s3q0.a;
            case 3:
                Context e = ((zn30) obj).e();
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.vk_icon_play_24, e);
            case 4:
                um50 um50Var = (um50) obj;
                um50Var.f.clear();
                um50Var.h.clear();
                uic uicVar = um50Var.i;
                if (uicVar != null) {
                    uicVar.clear();
                }
                um50Var.c.clear();
                return s3q0.a;
            case 5:
                ((o660) obj).b.invoke(zxd0.v.a);
                return s3q0.a;
            case 6:
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                return ((NewsfeedFragment) obj).io();
            case 7:
                return (VideoShareComponent) ((mo60) obj).c().a(fpf0.a(VideoShareComponent.class));
            case 8:
                d070 d070Var = (d070) obj;
                d070Var.a.a(new vs60.i.a(false));
                cht chtVar = d070Var.k;
                if (chtVar != null) {
                    chtVar.e = false;
                    int i2 = chtVar.c;
                    int i3 = chtVar.f;
                    if (i2 >= i3 || chtVar.d >= i3) {
                        chtVar.b.invoke();
                    }
                    chtVar.c = 0;
                    chtVar.d = 0;
                }
                return s3q0.a;
            case 9:
                RestoreReason.NoAvailableVerificationMethodsError noAvailableVerificationMethodsError = new RestoreReason.NoAvailableVerificationMethodsError((String) obj);
                q55 q55Var = q55.a;
                q55.c().b.S0(noAvailableVerificationMethodsError);
                return s3q0.a;
            case 10:
                ine0.m((Push) obj, ahe0.m.b);
                return s3q0.a;
            case 11:
                return com.vk.music.playlist.display.audiobook.offline.presentation.feature.a.a(((bt70) obj).getCurrentState());
            case 12:
                fkz fkzVar = (fkz) obj;
                long j = fkzVar.e;
                long j2 = fkzVar.d;
                StringBuilder b = fp.b(j, "start() - currentShift= ", " maxShift= ");
                b.append(j2);
                return b.toString();
            case 13:
                ((ygp0) obj).a(new one.video.exo.offline.f((e.c) null, (e.c) null, 7));
                return s3q0.a;
            case 14:
                ((hv80) obj).a.invoke(new OrderListAction.i(OrderPaymentResult.Cancelled));
                return s3q0.a;
            case 15:
                PaginatedFriendsListFragment paginatedFriendsListFragment = (PaginatedFriendsListFragment) obj;
                int i4 = PaginatedFriendsListFragment.p0;
                ((SearchFriendsIntegrationComponent) m7m.d(paginatedFriendsListFragment).mo408a(fpf0.a(SearchFriendsIntegrationComponent.class))).getClass();
                Bundle arguments = paginatedFriendsListFragment.getArguments();
                if (arguments == null || (userId = (UserId) arguments.getParcelable("user_id")) == null) {
                    userId = UserId.d;
                }
                return new vth0(userId, paginatedFriendsListFragment);
            case 16:
                int i5 = PlayerService.t;
                return new nd50((u2b0) ((PlayerService) obj).i.getValue(), o25.a());
            case 17:
                PlaylistScreenFragmentInternalComponent.a aVar2 = PlaylistScreenFragmentInternalComponent.x;
                nwy nwyVar = ((PlaylistScreenFragmentInternalComponent) obj).v;
                qcy<Object> qcyVar = PlaylistScreenFragmentInternalComponent.y[12];
                return new g7b0((s0a) nwyVar.c());
            case 18:
                return (MarketComponent) ((k7m) m7m.f((xzb0) obj)).a(fpf0.a(MarketComponent.class));
            case 19:
                int i6 = PostFragment.S0;
                return ((PostFragment) obj).Bo();
            case 20:
                int i7 = PostingFragment.s0;
                return new rg1((PostingFragment) obj, 3);
            case 21:
                return ((CommunityStrikesComponent) ((k7m) m7m.f((ikc0) obj)).a(fpf0.a(CommunityStrikesComponent.class))).ge();
            case 22:
                return ((BridgeComponent) ((rkd0) obj).c.getValue()).C1();
            case 23:
                return ((NewsFeedComponent) ((k7m) m7m.f((nnd0) obj)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 24:
                return ProfileFabView.C((ProfileFabView) obj);
            case 25:
                return ((nyd0) obj).new h();
            case 26:
                PublishState.Block block = ((PublishState) obj).b;
                if (block instanceof PublishState.Edit) {
                    return (PublishState.Edit) block;
                }
                return null;
            case 27:
                a5g0 a5g0Var = (a5g0) obj;
                int i8 = a5g0.k1;
                a5g0Var.fo(new e550(a5g0Var, 21));
                return s3q0.a;
            case 28:
                n7r0.c cVar = vzg0.p1;
                Dialog dialog = ((vzg0) obj).s;
                if (dialog != null) {
                    dialog.cancel();
                }
                return s3q0.a;
            default:
                return ((VideoRestrictionManagerComponent) ((k7m) m7m.f((smh0) obj)).a(fpf0.a(VideoRestrictionManagerComponent.class))).n2();
        }
    }
}
