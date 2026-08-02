package xsna;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dialogslist.impl.DialogsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.friends.api.presentation.FriendsListType;
import com.vk.friends.api.presentation.FriendsSelectionType;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.friends.impl.friends.presentation.fragment.PaginatedFriendsListFragment;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.fragments.ImCreateChatFragment;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.inappreview.ReviewActionResult$Failed;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.lbv;
import xsna.mqp;
import xsna.nzb;
import xsna.ubg;
import xsna.uhu.a;
import xsna.vrh0;
import xsna.xrg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class sbg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sbg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.os.Parcelable] */
    @Override // xsna.gzs
    public final Object invoke() {
        FolderType folderType;
        Parcelable parcelable;
        Object parcelable2;
        List<UserId> list;
        FragmentImpl b;
        int i = this.b;
        int i2 = 2;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new ubg.b((View) obj);
            case 1:
                return ((leg) obj).n;
            case 2:
                ((nzb.d) obj).invoke();
                return s3q0.a;
            case 3:
                xrg xrgVar = (xrg) ((zak0) ((xrg.a) obj).n).getValue();
                if (xrgVar == null) {
                    return s3q0.a;
                }
                xrgVar.h.invoke(xrgVar.g.b);
                return s3q0.a;
            case 4:
                d3h d3hVar = (d3h) obj;
                FragmentImpl fragmentImpl = d3hVar.a;
                return c7h.a(((CommunitySubscriptionComponent) m7m.d(fragmentImpl).mo408a(fpf0.a(CommunitySubscriptionComponent.class))).D6(), fragmentImpl.requireContext(), fragmentImpl, d3hVar.k, null, null, 24);
            case 5:
                ((ebh) obj).c();
                return s3q0.a;
            case 6:
                return ((TabbarSettingsComponent) ((ynh) obj).r0.getValue()).b1();
            case 7:
                int i3 = CommunityReviewsFragment.o0;
                return ((BridgeComponent) m7m.d((CommunityReviewsFragment) obj).a(fpf0.a(BridgeComponent.class))).t().b();
            case 8:
                return ((ClipsConfigViewersComponent) ((n0i) obj).a.a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 9:
                o1i o1iVar = (o1i) obj;
                return o6h.a((o6h) o1iVar.r.getValue(), o1iVar.q, o1iVar.f, null, o1iVar.d, null, 20);
            case 10:
                ((w2j) obj).b.onDismiss();
                return s3q0.a;
            case 11:
                return ((paj) obj).itemView.getContext().getString(R.string.vkim_contact_already_in_chat);
            case 12:
                com.vk.im.ui.components.contacts.c cVar = (com.vk.im.ui.components.contacts.c) obj;
                cVar.Y0().d();
                cVar.Z0(cVar.A.a);
                return s3q0.a;
            case 13:
                return Integer.valueOf(((j3k) obj).a.getContext().getColor(R.color.vk_black));
            case 14:
                int i4 = DialogsFragment.c0;
                Bundle arguments = ((DialogsFragment) obj).getArguments();
                return (arguments == null || (folderType = (FolderType) arguments.getParcelable("folder_type")) == null) ? FolderType.DEFAULT : folderType;
            case 15:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                Bundle requireArguments = ((DiscoverMediaTabFragment2) obj).requireArguments();
                String string = requireArguments.getString("ref", "unknown");
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("discover_id", DiscoverId.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable("discover_id");
                    parcelable = (DiscoverId) (parcelable3 instanceof DiscoverId ? parcelable3 : null);
                }
                DiscoverId discoverId = (DiscoverId) parcelable;
                if (discoverId == null) {
                    discoverId = DiscoverId.i;
                }
                return new p2n(string, discoverId, requireArguments.getBoolean("DiscoverMediaFragmentWasCreated", false), requireArguments.containsKey("discover_id"), requireArguments.getBoolean("show_in_lego_theme", false));
            case 16:
                return new mqp.c((mqp) obj);
            case 17:
                vrh0.a aVar = ((zuq) obj).i;
                if (aVar != null) {
                    aVar.a();
                }
                return s3q0.a;
            case 18:
                n0s n0sVar = (n0s) obj;
                return n0sVar.b.b().compileStatement(n0sVar.a.d());
            case 19:
                FriendsFragment friendsFragment = (FriendsFragment) obj;
                ?? r1 = friendsFragment.h0;
                if (friendsFragment.W || friendsFragment.X) {
                    gqs gqsVar = (gqs) r1.getValue();
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_ALL;
                    iqs iqsVar = new iqs(friendsFragment.V, com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen), mobileOfficialAppsCoreNavStat$EventScreen, FriendsListType.ALL, friendsFragment.a0);
                    FriendsSelectionType friendsSelectionType = friendsFragment.X ? FriendsSelectionType.MULTIPLE : FriendsSelectionType.SINGLE;
                    UserId[] userIdArr = friendsFragment.Y;
                    if (userIdArr == null || (list = rl3.u0(userIdArr)) == null) {
                        list = EmptyList.b;
                    }
                    b = gqsVar.b(iqsVar, friendsSelectionType, list);
                    if (b instanceof FriendsSelectionFragment) {
                        if (friendsFragment.W) {
                            ((FriendsSelectionFragment) b).r0 = friendsFragment.n0;
                        }
                        if (friendsFragment.X) {
                            ((FriendsSelectionFragment) b).s0 = new y87(friendsFragment.o0, i2);
                        }
                        FriendsSelectionFragment friendsSelectionFragment = (FriendsSelectionFragment) b;
                        friendsSelectionFragment.t0 = friendsFragment.p0;
                        friendsSelectionFragment.u0 = friendsFragment.eo();
                        friendsSelectionFragment.v0 = true;
                    }
                } else {
                    gqs gqsVar2 = (gqs) r1.getValue();
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_ALL;
                    b = gqsVar2.a(new iqs(friendsFragment.V, com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen2), mobileOfficialAppsCoreNavStat$EventScreen2, FriendsListType.ALL, friendsFragment.a0));
                    if (b instanceof PaginatedFriendsListFragment) {
                        ((PaginatedFriendsListFragment) b).n0 = true;
                    }
                }
                return new uts(b, R.id.friends_screen_all_tab, R.string.friends, R.plurals.friends_tab_all, new ci7(23), 0);
            case 20:
                return ((y4u) obj).g.Y4();
            case 21:
                uhu uhuVar = (uhu) obj;
                aiu aiuVar = new aiu(uhuVar.i);
                aiuVar.q = uhuVar.new a();
                return aiuVar;
            case 22:
                ((cbv) obj).p.onNext(lbv.a.a);
                return s3q0.a;
            case 23:
                jlv jlvVar = (jlv) obj;
                String str = jlvVar.e;
                r100.a(str, "Condition action is triggered");
                r100.a(str, "Request review");
                AppCompatActivity appCompatActivity = jlvVar.a;
                if (appCompatActivity.isDestroyed() || appCompatActivity.isFinishing()) {
                    r100.a(str, "Can't request review because activity is finishing or destroyed");
                    return io.reactivex.rxjava3.core.x.i(new ReviewActionResult$Failed(ReviewActionResult$Failed.ErrorReason.INTERNAL_ERROR));
                }
                Intent intent = new Intent("com.huawei.appmarket.intent.action.guidecomment");
                intent.setPackage("com.huawei.appmarket");
                return new io.reactivex.rxjava3.internal.operators.single.b(new qo9(3, jlvVar, intent));
            case 24:
                int i5 = ImCreateChatFragment.d0;
                ((ImCreateChatFragment) obj).Mf(0, null);
                return s3q0.a;
            case 25:
                com.vk.im.video.g gVar = (com.vk.im.video.g) obj;
                qbm qbmVar = gVar.h;
                if (qbmVar == null) {
                    return null;
                }
                Msg msg = gVar.r;
                return qbmVar.c((msg != null ? msg : null).c);
            case 26:
                List list2 = (List) obj;
                return "IM_ITEMS_LOADER ImItemListLoaderUpdater merged list size -> " + list2.size() + ", items\n " + j5g.g0(list2, "\n", null, null, 0, new oqu(i2), 30);
            case 27:
                ImSelectContactsFragment imSelectContactsFragment = (ImSelectContactsFragment) obj;
                VkTopBar vkTopBar = imSelectContactsFragment.Q;
                if (vkTopBar == null) {
                    vkTopBar = null;
                }
                vkTopBar.setMiddle(new VkTopBar.Middle.d(imSelectContactsFragment.getString(R.string.search), new tho0((String) null, 0L, 7), false, new wzf(imSelectContactsFragment, 24), new udo(imSelectContactsFragment, 18), null, null, null, null, null, 4068));
                VkTopBar vkTopBar2 = imSelectContactsFragment.Q;
                if (vkTopBar2 == null) {
                    vkTopBar2 = null;
                }
                vkTopBar2.setAfter(null);
                return s3q0.a;
            case 28:
                return ((l4y) obj).n(VkStepsBridgeDelegatesFactory.DelegateType.GET_INFO_HC);
            default:
                return ((r6y) obj).l;
        }
    }
}
