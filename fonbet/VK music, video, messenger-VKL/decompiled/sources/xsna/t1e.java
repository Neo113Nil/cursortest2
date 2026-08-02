package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupSmallHorizontalListItemVh;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsViewState;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.community.design.view.components.catalog.CommunityCardView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.text.expandable.VkExpandableText;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.log.L;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.multiaccount.api.f;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cse;
import xsna.ee3;
import xsna.jns;
import xsna.owg;
import xsna.qvq;
import xsna.sst0;
import xsna.tj50;
import xsna.uhu;
import xsna.x89;
import xsna.y6u;
import xsna.ylw0;
import xsna.zqe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class t1e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t1e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        sst0.b.C3688b c3688b;
        x89.a aVar;
        x89.c cVar;
        VoipChangeNameConfig.PreselectedUser anonym;
        VoipChangeNameConfig.PreselectedUser preselectedUser;
        int i = this.b;
        boolean z = false;
        boolean z2 = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new ClipsEntryPointsViewState.a(((tj50.a) obj).a(new com.vk.clips.entrypoints.feature.d(1, ((com.vk.clips.entrypoints.feature.e) obj2).d, com.vk.clips.entrypoints.ui.c.class, "toViewState", "toViewState(Lcom/vk/clips/entrypoints/feature/ClipsEntryPointsState$Content;)Lcom/vk/clips/entrypoints/ui/ClipsEntryPointsViewState$ContentUIState;", 0), ao8.d));
            case 1:
                ((u6e) obj2).C(new qvq.m.c((eqe) obj));
                return s3q0.a;
            case 2:
                ((com.vk.clips.interests.impl.feature.c) obj2).d.getClass();
                return new ClipsInterestsViewState.e(((tj50.a) obj).a(new fj1(8), ao8.d));
            case 3:
                ((nre) obj2).C(new zqe.l(((cse.a.b) obj).a));
                return s3q0.a;
            case 4:
                Throwable th = (Throwable) obj;
                ((i8f) obj2).getClass();
                L.g("ClipsTemplateEditorRequestsHandlerImpl", th);
                h03.b(th);
                return s3q0.a;
            case 5:
                ((CommunityCardView.a) obj2).b.invoke();
                return s3q0.a;
            case 6:
                yvg yvgVar = (yvg) obj2;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                if (extendedCommunityProfile != null) {
                    yvgVar.T(new owg.b(extendedCommunityProfile.O0, extendedCommunityProfile.A0));
                }
                return s3q0.a;
            case 7:
                int i2 = d2h.p1;
                ((d2h) obj2).dismiss();
                return s3q0.a;
            case 8:
                gzs<s3q0> gzsVar = ((gch) obj2).x;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 9:
                vuh vuhVar = (vuh) obj2;
                sst0.b bVar = (sst0.b) vuhVar.m;
                if (bVar != null && (c3688b = bVar.c) != null) {
                    vuhVar.o.c(c3688b);
                }
                return s3q0.a;
            case 10:
                f4g0 f4g0Var = (f4g0) obj;
                e2g0 e2g0Var = ((CommunityReviewsFragment) obj2).S;
                if (e2g0Var != null) {
                    e2g0Var.n(f4g0Var.a(), f4g0Var.b(), f4g0Var.c());
                }
                return s3q0.a;
            case 11:
                ((zak0) ((ygk) obj2).q).setValue((zhf0) obj);
                return s3q0.a;
            case 12:
                final qal qalVar = (qal) obj2;
                final AppCarouselItem appCarouselItem = (AppCarouselItem) obj;
                ApiApplication apiApplication = appCarouselItem.f;
                RecyclerView.Adapter<?> adapter = qalVar.C;
                final ee3 ee3Var = adapter instanceof ee3 ? (ee3) adapter : null;
                if (ee3Var != null) {
                    ee3 ee3Var2 = (ee3) adapter;
                    List<ee3.b> currentList = ee3Var2.getCurrentList();
                    final ArrayList arrayList = new ArrayList();
                    for (Object obj3 : currentList) {
                        ee3.b bVar2 = (ee3.b) obj3;
                        if (bVar2 instanceof ee3.b.a) {
                            ApiApplication apiApplication2 = ((ee3.b.a) bVar2).a.f;
                            if (!epx.f(apiApplication2 != null ? apiApplication2.b : null, apiApplication != null ? apiApplication.b : null)) {
                                arrayList.add(obj3);
                            }
                        }
                        if (bVar2 instanceof ee3.b.C2798b) {
                            arrayList.add(obj3);
                        }
                    }
                    boolean z3 = arrayList.size() == 1 && (j5g.b0(0, arrayList) instanceof ee3.b.C2798b);
                    if (arrayList.isEmpty() || z3) {
                        nbf0 nbf0Var = qalVar.K;
                        if (nbf0Var != null) {
                            nbf0Var.c = new gzs() { // from class: xsna.pal
                                /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    qal qalVar2 = qal.this;
                                    nbf0 nbf0Var2 = qalVar2.K;
                                    if (nbf0Var2 != null) {
                                        nbf0Var2.c = null;
                                    }
                                    ee3Var.submitList(arrayList);
                                    qal.T6(appCarouselItem.f);
                                    ((NewsFeedComponent) qalVar2.J.getValue()).w().e(148, qalVar2.q6());
                                    return s3q0.a;
                                }
                            };
                        }
                        ee3Var2.notifyItemRemoved(0);
                    } else {
                        ee3Var.submitList(arrayList);
                        qal.T6(apiApplication);
                    }
                }
                return s3q0.a;
            case 13:
                efm efmVar = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj2).e;
                if (efmVar != null) {
                    efmVar.g();
                }
                return s3q0.a;
            case 14:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, (MsgRequestStatus) obj2, null, null, null, 0, false, false, null, null, 0, null, 0, -1073741825, 2097151);
            case 15:
                List list = (List) obj;
                if (!(((mxo) obj2).f instanceof SwitcherUiMode.EcoplateRestricted)) {
                    return list;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof f.a) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 16:
                par0.a.getClass();
                par0.d((Throwable) obj);
                o200 o200Var = (o200) ((qop) obj2).a;
                if (o200Var != null) {
                    o200Var.X2();
                }
                return s3q0.a;
            case 17:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, (SuspendLambda) obj2, 3));
            case 18:
                VkExpandableText vkExpandableText = new VkExpandableText((Context) obj, null, 6, 0);
                vkExpandableText.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                vkExpandableText.setTextAppearance(R.style.VkUiTypography_Subhead);
                vkExpandableText.setExpandButton(new VkExpandableText.a(oq.d(tlo0.Companion, "Показать еще"), new x7g(R.attr.vk_ui_text_link), null, new mxj((c9q) obj2, 11), 20));
                vkExpandableText.o();
                return vkExpandableText;
            case 19:
                ((tdu) obj).b(((Number) ((mtk0) obj2).getValue()).floatValue());
                return s3q0.a;
            case 20:
                gsr gsrVar = (gsr) obj2;
                MotionEvent motionEvent = (MotionEvent) obj;
                gsrVar.getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
                gsrVar.setPressed(true);
                return s3q0.a;
            case 21:
                return new uxj((ViewGroup) obj, ((txr) obj2).j);
            case 22:
                jzr jzrVar = (jzr) obj2;
                if (((a1s) obj) instanceof e580) {
                    jzrVar.a();
                } else {
                    jzrVar.getClass();
                }
                return s3q0.a;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((v1z) obj2).f).setValue(bool);
                return s3q0.a;
            case 24:
                FriendsAndFollowersRootFragment friendsAndFollowersRootFragment = (FriendsAndFollowersRootFragment) obj2;
                FriendsAndFollowersTabType friendsAndFollowersTabType = (FriendsAndFollowersTabType) obj;
                int i3 = FriendsAndFollowersRootFragment.Z;
                if (friendsAndFollowersRootFragment.ho()) {
                    friendsAndFollowersRootFragment.U = true;
                    try {
                        friendsAndFollowersRootFragment.ko(friendsAndFollowersTabType);
                    } finally {
                        friendsAndFollowersRootFragment.U = false;
                    }
                } else {
                    int e = FriendsAndFollowersRootFragment.b.e(friendsAndFollowersTabType, friendsAndFollowersRootFragment.V.d);
                    VkTabs vkTabs = (VkTabs) friendsAndFollowersRootFragment.go().b;
                    int i4 = VkTabs.t;
                    vkTabs.l(e, true);
                }
                return s3q0.a;
            case 25:
                ((xms) obj2).T(new jns.c.b((hns) obj));
                return s3q0.a;
            case 26:
                FriendsSelectionFragment friendsSelectionFragment = (FriendsSelectionFragment) obj2;
                String str = (String) obj;
                int i5 = FriendsSelectionFragment.w0;
                xqs xqsVar = friendsSelectionFragment.h0;
                (xqsVar != null ? xqsVar : null).b(str);
                friendsSelectionFragment.po().post(new vb(friendsSelectionFragment, z2 ? 1 : 0));
                return s3q0.a;
            case 27:
                ((k6u) obj2).T((y6u.e.c) obj);
                return s3q0.a;
            case 28:
                uhu.a aVar2 = ((aiu) obj2).q;
                if (aVar2 != null) {
                    uhu uhuVar = uhu.this;
                    x89 x89Var = uhuVar.t;
                    if ((x89Var instanceof x89.a) && (cVar = (aVar = (x89.a) x89Var).b) != null) {
                        if (cVar instanceof x89.c.C3983c) {
                            preselectedUser = VoipChangeNameConfig.PreselectedUser.User.b;
                        } else if (cVar instanceof x89.c.b) {
                            preselectedUser = new VoipChangeNameConfig.PreselectedUser.Group(((x89.c.b) cVar).b.c);
                        } else {
                            if (!(cVar instanceof x89.c.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            anonym = new VoipChangeNameConfig.PreselectedUser.Anonym(null, 1, null);
                            new ylw0.a(uhuVar.i, new VoipChangeNameConfig(aVar.a.a, "request_key_change_name", anonym, false, true, false, 0, null, 232, null)).I0(null);
                        }
                        anonym = preselectedUser;
                        new ylw0.a(uhuVar.i, new VoipChangeNameConfig(aVar.a.a, "request_key_change_name", anonym, false, true, false, 0, null, 232, null)).I0(null);
                    }
                }
                return s3q0.a;
            default:
                VkAvatar vkAvatar = (VkAvatar) obj;
                vkAvatar.o0((String) ((GroupSmallHorizontalListItemVh.b) ((VkTile.h) obj2)).a.invoke(Integer.valueOf(vkAvatar.getWidth())), null);
                return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t1e(wzs wzsVar) {
        this.b = 17;
        this.c = (SuspendLambda) wzsVar;
    }
}
