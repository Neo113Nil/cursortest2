package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.archive.impl.ArchiveWithChannelsFragment;
import com.vk.archive.impl.ArchiveWithChannelsFragment.a;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDelayedPublishListFragment;
import com.vk.content.privacy.di.ContentPrivacyComponent;
import com.vk.core.view.TextViewEllipsizeEnd;
import com.vk.ecomm.cart.impl.cart.CartFragment;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreenFragmentMvi2;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.topics.impl.fragments.BoardTopicsFragment;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.CommonCameraComponent;
import com.vkontakte.android.task.di.components.CommonVoipBridgeComponent;
import java.util.UUID;
import kotlin.Lazy;
import xsna.boh;
import xsna.dzh;
import xsna.nzl;
import xsna.ox30;
import xsna.z4h;
import xsna.ztp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ji0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ji0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 0;
        int i2 = 4;
        int i3 = 3;
        int i4 = 6;
        switch (this.b) {
            case 0:
                return UUID.nameUUIDFromBytes(((AdStatPixel) this.c).getUrl().getBytes(emb.b));
            case 1:
                ((AlbumsListFragment) this.c).W.b(true);
                return s3q0.a;
            case 2:
                return ((e12) this.c).e();
            case 3:
                ArchiveWithChannelsFragment archiveWithChannelsFragment = (ArchiveWithChannelsFragment) this.c;
                rw30 rw30Var = archiveWithChannelsFragment.T;
                if (rw30Var == null) {
                    ViewGroup viewGroup = (ViewGroup) archiveWithChannelsFragment.requireView();
                    ox30.a aVar = ox30.a.b;
                    a1w a1wVar = q1w.a;
                    a1w a1wVar2 = a1wVar != null ? a1wVar : null;
                    g2v.c().getClass();
                    rw30 rw30Var2 = new rw30(a1wVar2, k9u0.a, archiveWithChannelsFragment.kn(), aVar, null, 112);
                    rw30Var2.w = archiveWithChannelsFragment.new a();
                    rw30Var2.D0(archiveWithChannelsFragment.requireContext(), viewGroup, (ViewStub) viewGroup.findViewById(R.id.im_search_container), null);
                    archiveWithChannelsFragment.T = rw30Var2;
                    rw30Var = rw30Var2;
                }
                rw30.i1(rw30Var, null, 3);
                return s3q0.a;
            case 4:
                com.vk.music.pref.a aVar2 = ((dn4) this.c).b;
                return vtk0.a(ztp.f.a(aVar2.R0(), aVar2.w0()));
            case 5:
                r46 r46Var = (r46) this.c;
                r46Var.L(r46Var.d.F(r46Var, new ln(r46Var.c.f)), new xz(r46Var, i2), new k41(new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(r46Var, i4), i3));
                r46Var.j.i(new k9(r46Var, 7));
                return s3q0.a;
            case 6:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.c(((y440) this.c).getBottomPanel())).a(fpf0.a(StoryEditorExtDepsComponent.class))).R();
            case 7:
                return ((ContentPrivacyComponent) ((Lazy) this.c).getValue()).Z8();
            case 8:
                BaseSharingExternalActivity baseSharingExternalActivity = (BaseSharingExternalActivity) this.c;
                int i5 = BaseSharingExternalActivity.Z;
                baseSharingExternalActivity.J3();
                return s3q0.a;
            case 9:
                BoardTopicsFragment boardTopicsFragment = (BoardTopicsFragment) this.c;
                int i6 = BoardTopicsFragment.S0;
                return new com.vk.topics.impl.fragments.d(boardTopicsFragment.v0, boardTopicsFragment);
            case 10:
                BookingMastersScreenFragmentMvi2 bookingMastersScreenFragmentMvi2 = (BookingMastersScreenFragmentMvi2) this.c;
                return new rr7(((OnlineBookingInternalComponent) bookingMastersScreenFragmentMvi2.O.getValue()).Jf(), (BookingScreenParams) bookingMastersScreenFragmentMvi2.N.getValue(), bookingMastersScreenFragmentMvi2.J, new nh(i2));
            case 11:
                BottomSheetCommentsFragment bottomSheetCommentsFragment = (BottomSheetCommentsFragment) this.c;
                nzl.a aVar3 = BottomSheetCommentsFragment.f1;
                return (VideoChannelComponent) m7m.d(bottomSheetCommentsFragment).mo408a(fpf0.a(VideoChannelComponent.class));
            case 12:
                CartFragment cartFragment = (CartFragment) this.c;
                qcy<Object>[] qcyVarArr = CartFragment.Y;
                return (FrameLayout) cartFragment.requireView().findViewById(R.id.cart_empty_cart_container);
            case 13:
                return ((uwb) this.c).r;
            case 14:
                tsu tsuVar = ((azb) this.c).k;
                if (tsuVar != null) {
                    xyb xybVar = (xyb) tsuVar.b;
                    xybVar.w = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(xybVar.l.b(xybVar, new q6k(xybVar.q.a.f)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new pm1(new l00(xybVar, 15), i4)), new uu4(xybVar, 2)).subscribe(new cp0(new p40(xybVar, 24), 9), new xn(new p1(xybVar, 23), 8));
                }
                return s3q0.a;
            case 15:
                return o1d.r((o1d) this.c);
            case 16:
                return (TextViewEllipsizeEnd) ((q8d) this.c).b().findViewById(R.id.video_single_clip_descr);
            case 17:
                ClipsGridDelayedPublishListFragment clipsGridDelayedPublishListFragment = (ClipsGridDelayedPublishListFragment) this.c;
                int i7 = ClipsGridDelayedPublishListFragment.l0;
                return new zde(clipsGridDelayedPublishListFragment.T, new rce(i), new ClipsGridDelayedPublishListFragment.b(2, clipsGridDelayedPublishListFragment, ClipsGridDelayedPublishListFragment.class, "showClipsGridMenuActions", "showClipsGridMenuActions(Lcom/vk/dto/common/ClipVideoFile;Ljava/lang/Integer;)V", 0), new ClipsGridDelayedPublishListFragment.c(2, clipsGridDelayedPublishListFragment, ClipsGridDelayedPublishListFragment.class, "showClipsGridShortMenuActions", "showClipsGridShortMenuActions(Lcom/vk/dto/common/ClipVideoFile;Ljava/lang/Integer;)V", 0), false, new ClipsGridDelayedPublishListFragment.d(clipsGridDelayedPublishListFragment, ClipsGridDelayedPublishListFragment.class, "selectedProfileId", "getSelectedProfileId()Lcom/vk/dto/common/id/UserId;", 0), new nd1(i4), clipsGridDelayedPublishListFragment.getViewLifecycleOwner(), clipsGridDelayedPublishListFragment.j0);
            case 18:
                return ((oz50) this.c).f();
            case 19:
                return new ykf((b25) ((iff) this.c).f.getValue());
            case 20:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                int i8 = ClipsWrapperFragment.Q0;
                return new ytf((jwe) clipsWrapperFragment.i0.getValue(), ((Boolean) clipsWrapperFragment.z0.getValue()).booleanValue());
            case 21:
                CommonCameraComponent commonCameraComponent = (CommonCameraComponent) this.c;
                return new dig((b25) commonCameraComponent.a.getValue(), commonCameraComponent.b, commonCameraComponent.c, commonCameraComponent.d, commonCameraComponent.e, commonCameraComponent.f, commonCameraComponent.g, commonCameraComponent.h);
            case 22:
                CommonVoipBridgeComponent commonVoipBridgeComponent = (CommonVoipBridgeComponent) this.c;
                qcy<Object>[] qcyVarArr2 = CommonVoipBridgeComponent.g;
                xkg xkgVar = xkg.a;
                yre0 yre0Var = (yre0) commonVoipBridgeComponent.a.getValue();
                vre0 vre0Var = (vre0) commonVoipBridgeComponent.b.getValue();
                vx2.a.getClass();
                return new nng(vre0Var, yre0Var, vx2.b, commonVoipBridgeComponent.c, commonVoipBridgeComponent.e, (usw0) commonVoipBridgeComponent.d.getValue());
            case 23:
                return ((CommunityAddressesFragment) this.c).w0;
            case 24:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.c;
                int i9 = CommunityCheckListFragment.Y;
                h3p0.b(communityCheckListFragment);
                return s3q0.a;
            case 25:
                return Float.valueOf(c1h.v((c1h) this.c, 0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6));
            case 26:
                h5h h5hVar = (h5h) this.c;
                CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType communityMenuActionType = CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.ADD_NEW_ITEM;
                h5hVar.B6(false);
                h5hVar.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction(communityMenuActionType, (z4h.a) h5hVar.m, Integer.valueOf(((wak0) h5hVar.o).getIntValue())));
                return s3q0.a;
            case 27:
                boh.a aVar4 = (boh.a) this.c;
                f4m.v(an10.b(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (((View) aVar4.itemView.getParent()).getHeight() - aVar4.itemView.getY()) - aVar4.itemView.getHeight())), aVar4.itemView);
                return s3q0.a;
            case 28:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) this.c;
                int i10 = CommunityProfileFragment.k0;
                return new gsh(communityProfileFragment.requireContext(), communityProfileFragment.kn(), communityProfileFragment.V, new wqf(communityProfileFragment, i3), new trf(communityProfileFragment, i2));
            default:
                ((CommunityReviewsFragment) this.c).R.c(dzh.i.a);
                return s3q0.a;
        }
    }
}
