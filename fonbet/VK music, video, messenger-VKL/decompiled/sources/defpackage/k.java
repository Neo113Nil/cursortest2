package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.fragment.app.FragmentManager;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.articles.ArticleFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.coauthors.invite.CoauthorsInviteDialog;
import com.vk.clips.design.view.component.play.ClipPlayPauseView;
import com.vk.clips.design.view.component.play.ClipPlayPauseView.a;
import com.vk.clips.design.view.component.play.ClipPlayPauseView.b;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.tool.view.newsfeed.mytarget.ClipEndOverlayAdWrapperView;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.community.strikes.impl.di.CommunityStrikesComponentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.articles.Article;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.im.ui.views.avatars.a;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;
import com.vk.textformat.di.MsgTextFormatComponent;
import com.vkontakte.android.R;
import java.util.List;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.ath0;
import xsna.b8e;
import xsna.bzd;
import xsna.bzd.d;
import xsna.bzd.e;
import xsna.c1j;
import xsna.cmd;
import xsna.cqa0;
import xsna.dwh0;
import xsna.e3m;
import xsna.f1i;
import xsna.fcy;
import xsna.fpf0;
import xsna.gzs;
import xsna.hsi;
import xsna.i5s;
import xsna.inf;
import xsna.izs;
import xsna.j5g;
import xsna.j5h;
import xsna.k7m;
import xsna.ko7;
import xsna.lzd;
import xsna.m7m;
import xsna.nwy;
import xsna.o99;
import xsna.oob;
import xsna.qcy;
import xsna.r1q0;
import xsna.r5;
import xsna.rn3;
import xsna.s3q0;
import xsna.t0e;
import xsna.u2i;
import xsna.uue;
import xsna.v6e;
import xsna.wak0;
import xsna.wgb;
import xsna.xuy;
import xsna.xvy;
import xsna.y89;
import xsna.yw9;
import xsna.z4h;
import xsna.zak0;
import xsna.zzf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class k implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if ((r1 != null ? r1.getIndex() : Integer.MAX_VALUE) <= 6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1.e() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        return new kotlin.Pair(java.lang.Boolean.valueOf(r2), java.lang.Boolean.valueOf(xsna.a020.v(r4.o)));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        List activities_delegate$lambda$1;
        rn3 rn3Var;
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                l0 l0Var = (l0) obj;
                return new cqa0(new o0(l0Var, l0.class, "presenter", "getPresenter()Lcom/vk/superapp/base/js/bridge/VkUiPresenter;", 0), l0Var.L0(), l0Var.w0());
            case 1:
                a aVar = (a) obj;
                return new a.C1177a(e3m.f(R.attr.im_contact_avatar_start_color, aVar.a), e3m.f(R.attr.im_contact_avatar_end_color, aVar.a));
            case 2:
                return ((com.vk.libvideo.bottomsheet.about.a) ((r5) obj).g1.getValue()).Y4();
            case 3:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 4:
                activities_delegate$lambda$1 = AndroidGetIsAdActivity.activities_delegate$lambda$1((AndroidGetIsAdActivity) obj);
                return activities_delegate$lambda$1;
            case 5:
                ArticleFragment articleFragment = (ArticleFragment) obj;
                Article article = articleFragment.T;
                if (article != null && (rn3Var = (rn3) articleFragment.S) != null) {
                    rn3Var.S(article.b, article.c);
                }
                return s3q0.a;
            case 6:
                ((izs) ((zak0) ((ko7) obj).d).getValue()).invoke(a.InterfaceC0957a.C0958a.b);
                return s3q0.a;
            case 7:
                return ((BridgeComponent) m7m.d(((yw9) obj).d).a(fpf0.a(BridgeComponent.class))).H2();
            case 8:
                ((ChannelFragment) obj).P0 = null;
                return s3q0.a;
            case 9:
                return i5s.a(new StringBuilder(), ((wgb) obj).s, ": executeLoadNext: skip network load, updating expired history");
            case 10:
                View view = ((oob) obj).r;
                return ((MsgTextFormatComponent) ((k7m) m7m.c(view != null ? view : null)).a(fpf0.a(MsgTextFormatComponent.class))).t3();
            case 11:
                int i2 = ClipEndOverlayAdWrapperView.m;
                return ((NewsFeedComponent) ((k7m) m7m.c((ClipEndOverlayAdWrapperView) obj)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 12:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                return new v6e(clipFeedListFragment.T, clipFeedListFragment.Ka());
            case 13:
                ClipPlayPauseView clipPlayPauseView = (ClipPlayPauseView) obj;
                int i3 = ClipPlayPauseView.c;
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clipPlayPauseView, (Property<ClipPlayPauseView, Float>) property, 0.6f, 1.2f);
                Property property2 = View.SCALE_Y;
                animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(clipPlayPauseView, (Property<ClipPlayPauseView, Float>) property2, 0.6f, 1.2f));
                animatorSet.setDuration(175L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(clipPlayPauseView, (Property<ClipPlayPauseView, Float>) property, 1.2f, 1.0f), ObjectAnimator.ofFloat(clipPlayPauseView, (Property<ClipPlayPauseView, Float>) property2, 1.2f, 1.0f));
                animatorSet2.setDuration(75L);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(animatorSet, animatorSet2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                Property property3 = View.ALPHA;
                animatorSet4.playTogether(animatorSet3, ObjectAnimator.ofFloat(clipPlayPauseView, (Property<ClipPlayPauseView, Float>) property3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(250L));
                animatorSet4.setInterpolator(new AccelerateInterpolator(1.8f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(clipPlayPauseView, (Property<ClipPlayPauseView, Float>) property3, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat2.setStartDelay(750L);
                ofFloat2.setDuration(250L);
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playSequentially(animatorSet4, ofFloat2);
                animatorSet5.addListener(clipPlayPauseView.new b());
                animatorSet5.addListener(clipPlayPauseView.new a());
                return animatorSet5;
            case 14:
                return (VkButton) ((cmd) obj).findViewById(R.id.done);
            case 15:
                bzd bzdVar = (bzd) obj;
                t0e t0eVar = bzdVar.c;
                return new lzd(t0eVar.getCtx(), bzdVar.n, bzdVar.new e(), t0eVar.getStickersInteractor(), bzdVar.new d(), bzdVar.e, bzdVar.g);
            case 16:
                return t0e.X4((t0e) obj);
            case 17:
                ((b8e) obj).invoke(Boolean.TRUE);
                return s3q0.a;
            case 18:
                return (ClipsPlaylistsComponentImpl) ((k7m) m7m.f((uue) obj)).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 19:
                return ((inf) obj).p;
            case 20:
                int i4 = ClipsWrapperFragment.Q0;
                return ((CameraClipsComponent) m7m.d((ClipsWrapperFragment) obj).a(fpf0.a(CameraClipsComponent.class))).c4();
            case 21:
                return (ClipsCoauthorsInternalComponent) ((k7m) m7m.f((CoauthorsInviteDialog) obj)).mo408a(fpf0.a(ClipsCoauthorsInternalComponent.class));
            case 22:
                j5h j5hVar = (j5h) obj;
                CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType communityMenuActionType = CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.CLICK;
                j5hVar.B6(false);
                j5hVar.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction(communityMenuActionType, (z4h.a) j5hVar.m, Integer.valueOf(((wak0) j5hVar.o).getIntValue())));
                return s3q0.a;
            case 23:
                fcy fcyVar = (fcy) obj;
                if (fcyVar != null) {
                    ((gzs) fcyVar).invoke();
                }
                return s3q0.a;
            case 24:
                f1i f1iVar = (f1i) obj;
                FragmentManager fragmentManager = ((ath0.a) f1iVar.l1.c).j;
                dwh0 dwh0Var = f1iVar.o1;
                fragmentManager.l0("search_params_view_location", f1iVar, dwh0Var.a(new o99(f1iVar, 4)));
                f1iVar.h1.a(dwh0Var.b(f1iVar.requireContext(), "search_params_view_location", ((VkGroupsSearchParams) ((zak0) f1iVar.j1).getValue()).f).a.a());
                return s3q0.a;
            case 25:
                nwy nwyVar = ((CommunityStrikesComponentImpl) obj).b;
                qcy<Object> qcyVar = CommunityStrikesComponentImpl.c[1];
                return (u2i) nwyVar.c();
            case 26:
                r1q0.a.a(SchemeStat$TypeClickItem.Subtype.SEARCH_ICON);
                ((y89) obj).invoke(new CommunityProfileAction.e.i.g());
                return s3q0.a;
            case 27:
                for (UsableRecyclerView.j jVar : (List) obj) {
                    if (jVar instanceof hsi) {
                        ((hsi) jVar).y3();
                    }
                }
                return s3q0.a;
            case 28:
                return ((c1j) obj).itemView.findViewById(R.id.voip_room_participant_assistance_status);
            default:
                zzf0 zzf0Var = (zzf0) obj;
                xvy xvyVar = zzf0Var.o;
                if (zzf0Var.f() != null) {
                    break;
                } else {
                    xuy xuyVar = (xuy) j5g.a0(xvyVar.j().f());
                    break;
                }
        }
    }
}
