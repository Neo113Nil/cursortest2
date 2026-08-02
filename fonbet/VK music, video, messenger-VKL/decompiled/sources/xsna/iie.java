package xsna;

import android.animation.AnimatorSet;
import android.net.Uri;
import android.os.Bundle;
import com.vk.api.generated.auth.dto.AuthExternalFlowOutResponseDto;
import com.vk.api.generated.fave.dto.FaveCheckLinkResponseDto;
import com.vk.api.generated.groups.dto.GroupsBanInfoDto;
import com.vk.api.generated.groups.dto.GroupsBanInfoReasonDto;
import com.vk.api.generated.groups.dto.GroupsOwnerXtrBanInfoDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.avatarpicker.a;
import com.vk.clips.interests.impl.feature.ClipsInterestsState;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.interests.impl.ui.c;
import com.vk.dto.common.Image;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.im.engine.internal.merge.messages.MessagesMergerInput;
import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.ui.components.msg_search.vc.HideReason;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.ModalPostAllReactionsFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.b;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vk.profile.user.impl.ui.ModalUserProfileFragment;
import com.vk.stickers.views.LongtapRecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import xsna.dai;
import xsna.dr00;
import xsna.gm50;
import xsna.ha70;
import xsna.jge;
import xsna.kb70;
import xsna.mcz;
import xsna.osp;
import xsna.tj50;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class iie implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iie(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ClipsInterestsViewState.UIScreenStep uIScreenStep;
        int i;
        ArrayList arrayList;
        List list;
        tlo0.g c;
        tlo0.a aVar;
        int i2;
        tlo0.f h;
        tlo0.a aVar2;
        izs izsVar;
        UserProfile a;
        UserProfile userProfile;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                com.vk.clips.interests.impl.ui.c cVar = (com.vk.clips.interests.impl.ui.c) obj2;
                ClipsInterestsState.Content content = (ClipsInterestsState.Content) obj;
                List<jge.b> list2 = content.e;
                ClipsInterestsState.Content.Step step = content.c;
                cVar.getClass();
                ClipsInterestsState.Content.FlowCompletedType flowCompletedType = content.g;
                int i4 = c.a.$EnumSwitchMapping$1[flowCompletedType.ordinal()];
                if (i4 == 1) {
                    uIScreenStep = ClipsInterestsViewState.UIScreenStep.FINISH_KEEP_VIEW;
                } else if (i4 == 2) {
                    uIScreenStep = ClipsInterestsViewState.UIScreenStep.FINISH_RESET_VIEW;
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = c.a.$EnumSwitchMapping$0[step.ordinal()];
                    if (i5 == 1) {
                        uIScreenStep = ClipsInterestsViewState.UIScreenStep.MAIN_CATEGORIES;
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uIScreenStep = ClipsInterestsViewState.UIScreenStep.SUB_CATEGORIES;
                    }
                }
                ClipsInterestsViewState.UIScreenStep uIScreenStep2 = uIScreenStep;
                Image image = content.b;
                int[] iArr = c.a.$EnumSwitchMapping$0;
                int i6 = iArr[step.ordinal()];
                if (i6 == 1) {
                    i = 50;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 100;
                }
                ClipsInterestsViewState.a aVar3 = new ClipsInterestsViewState.a(i, image);
                if (flowCompletedType == ClipsInterestsState.Content.FlowCompletedType.FLOW_FINISHED_CONTENT_HIDDEN) {
                    list = EmptyList.b;
                } else {
                    int i7 = iArr[step.ordinal()];
                    if (i7 == 1) {
                        List<jge.a> list3 = content.d;
                        arrayList = new ArrayList(c5g.u(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(com.vk.clips.interests.impl.ui.c.a((jge.a) it.next(), cVar, content));
                        }
                    } else {
                        if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<jge.b> list4 = list2;
                        arrayList = new ArrayList(c5g.u(list4, 10));
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(com.vk.clips.interests.impl.ui.c.a((jge) it2.next(), cVar, content));
                        }
                    }
                    list = arrayList;
                }
                ClipsInterestsViewState.g gVar = new ClipsInterestsViewState.g(list);
                int[] iArr2 = c.a.$EnumSwitchMapping$0;
                int i8 = iArr2[step.ordinal()];
                if (i8 == 1) {
                    tlo0.Companion.getClass();
                    c = tlo0.a.c(R.string.clips_interests_step, "1", "2");
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tlo0.Companion.getClass();
                    c = tlo0.a.c(R.string.clips_interests_step, "2", "2");
                }
                int i9 = iArr2[step.ordinal()];
                if (i9 == 1) {
                    aVar = tlo0.Companion;
                    i2 = R.string.clips_interests_title_step_1;
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = tlo0.Companion;
                    i2 = R.string.clips_interests_title_step_2;
                }
                ClipsInterestsViewState.f fVar = new ClipsInterestsViewState.f(c, tq.h(aVar, i2));
                int i10 = iArr2[step.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2 = tlo0.Companion;
                } else {
                    if (!list2.isEmpty()) {
                        h = tq.h(tlo0.Companion, R.string.clips_interests_action_next);
                        return new ClipsInterestsViewState.d(uIScreenStep2, aVar3, gVar, fVar, new ClipsInterestsViewState.b(h));
                    }
                    aVar2 = tlo0.Companion;
                }
                h = tq.h(aVar2, R.string.clips_interests_action_save);
                return new ClipsInterestsViewState.d(uIScreenStep2, aVar3, gVar, fVar, new ClipsInterestsViewState.b(h));
            case 1:
                CustomSpinner customSpinner = (CustomSpinner) obj2;
                customSpinner.setDropDownVerticalOffset(((CustomSpinner) obj).getMeasuredHeight());
                customSpinner.setDropDownHorizontalOffset(cn70.b(8));
                return s3q0.a;
            case 2:
                s2h s2hVar = (s2h) obj2;
                CommunityEventsState communityEventsState = (CommunityEventsState) obj;
                CommunityEventsState.Content content2 = communityEventsState.c;
                CommunityEventsState.Content.Items items = content2 instanceof CommunityEventsState.Content.Items ? (CommunityEventsState.Content.Items) content2 : null;
                if (items == null) {
                    return communityEventsState;
                }
                ArrayList u0 = j5g.u0(s2hVar.a, items.a);
                return CommunityEventsState.a(communityEventsState, new CommunityEventsState.Content.Items(u0, u0.size() < s2hVar.b, CommunityEventsState.Content.Items.Paging.None));
            case 3:
                return Boolean.valueOf(epx.f(((bun) obj).c, ((lhh) obj2).a));
            case 4:
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) obj2).T(new e.j.a((Throwable) obj));
                return s3q0.a;
            case 5:
                wh50 wh50Var = ((dai.d) obj2).b;
                if (wh50Var != null && (izsVar = (izs) wh50Var.getValue()) != null) {
                    izsVar.invoke(obj);
                }
                return s3q0.a;
            case 6:
                return ((ParticipantStore) obj2).get((ParticipantId) obj);
            case 7:
                Object obj3 = ((vak) obj2).o;
                ((rak) (obj3 != null ? obj3 : null)).a();
                return s3q0.a;
            case 8:
                Uri uri = (Uri) obj;
                a.InterfaceC0422a interfaceC0422a = ((com.vk.avatarpicker.a) obj2).a;
                if (interfaceC0422a != null) {
                    interfaceC0422a.t0(uri);
                }
                return s3q0.a;
            case 9:
                w2w w2wVar = (w2w) obj2;
                return w2wVar.K().n().e(UUID.randomUUID().toString(), k9q0.p(w2wVar) ? ReporterType.GROUP_CHAT : ReporterType.CHAT, ((MessagesMergerInput) obj).c.size());
            case 10:
                ((tdu) obj).n(((wfo) obj2).b());
                return s3q0.a;
            case 11:
                ((EnterProfilePresenter) obj2).z0();
                return s3q0.a;
            case 12:
                osp.a aVar4 = (osp.a) obj2;
                izs<osp, s3q0> izsVar2 = aVar4.j;
                if (izsVar2 != null) {
                    izsVar2.invoke(aVar4.k);
                }
                return s3q0.a;
            case 13:
                w4q w4qVar = (w4q) obj2;
                AuthExternalFlowOutResponseDto authExternalFlowOutResponseDto = (AuthExternalFlowOutResponseDto) obj;
                SignUpDataHolder signUpDataHolder = w4qVar.p;
                Bundle bundle = (signUpDataHolder != null ? signUpDataHolder : null).K;
                if (bundle != null) {
                    m63.m(bundle, authExternalFlowOutResponseDto.d());
                }
                y4q y4qVar = (y4q) w4qVar.a;
                if (y4qVar != null) {
                    y4qVar.e();
                }
                return s3q0.a;
            case 14:
                ((efr0) obj2).invoke(Boolean.valueOf(((FaveCheckLinkResponseDto) obj).d()));
                return s3q0.a;
            case 15:
                sdi.v((Throwable) obj, ((q7r) obj2).j0.getView());
                return s3q0.a;
            case 16:
                kb70 kb70Var = (kb70) obj;
                return Boolean.valueOf((kb70Var instanceof kb70.d) && epx.f(((kb70.d) kb70Var).a, ((ha70.b) obj2).a));
            case 17:
                List<GroupsOwnerXtrBanInfoDto> list5 = (List) obj2;
                new j2r0();
                List<UsersUserFullDto> list6 = (List) obj;
                int e = on00.e(c5g.u(list6, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (UsersUserFullDto usersUserFullDto : list6) {
                    linkedHashMap.put(Long.valueOf(usersUserFullDto.s1().b), j2r0.a(usersUserFullDto));
                }
                ArrayList arrayList2 = new ArrayList();
                for (GroupsOwnerXtrBanInfoDto groupsOwnerXtrBanInfoDto : list5) {
                    UsersUserDto e2 = groupsOwnerXtrBanInfoDto.e();
                    if (e2 == null) {
                        a = null;
                    } else {
                        a = i2r0.a(e2);
                        GroupsBanInfoDto d = groupsOwnerXtrBanInfoDto.d();
                        if (d != null) {
                            Bundle bundle2 = a.s;
                            if (d.d() != null && (userProfile = (UserProfile) linkedHashMap.get(Long.valueOf(r6.intValue()))) != null) {
                                bundle2.putParcelable("ban_admin", userProfile);
                            }
                            Integer g = d.g();
                            if (g != null) {
                                bundle2.putInt("ban_date", g.intValue());
                            }
                            Integer i11 = d.i();
                            if (i11 != null) {
                                bundle2.putInt("ban_end_date", i11.intValue());
                            }
                            GroupsBanInfoReasonDto j = d.j();
                            if (j != null) {
                                bundle2.putInt("ban_reason", j.i());
                            }
                            String e3 = d.e();
                            if (e3 != null) {
                                bundle2.putString("ban_comment", e3);
                            }
                            Boolean f = d.f();
                            if (f != null) {
                                bundle2.putBoolean("ban_comment_visible", f.booleanValue());
                            }
                        }
                    }
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                return arrayList2;
            case 18:
                quv quvVar = (quv) obj2;
                brj brjVar = (brj) obj;
                AnimatorSet animatorSet = quvVar.A;
                List l = e43.l(quvVar.h, quvVar.f);
                boolean z = brjVar.a;
                boolean z2 = brjVar.d;
                quvVar.A = quv.q(animatorSet, l, z, z2);
                quvVar.B = quv.q(quvVar.B, Collections.singletonList(quvVar.i), brjVar.b, z2);
                quvVar.j.setVisibility(brjVar.c ? 0 : 8);
                return s3q0.a;
            case 19:
                ucp.f(((xgy) obj2).c);
                return s3q0.a;
            case 20:
                g0z g0zVar = (g0z) obj2;
                bn40.d("Failed to load curator's popular tracks");
                g0zVar.c(g0zVar.a, "net_error");
                return s3q0.a;
            case 21:
                zcz zczVar = (zcz) obj2;
                zczVar.e.onNext(new mcz.c(zczVar.q));
                zczVar.d(R.string.link_copied);
                return s3q0.a;
            case 22:
                LongtapRecyclerView longtapRecyclerView = (LongtapRecyclerView) obj2;
                LongtapRecyclerView.a aVar5 = longtapRecyclerView.b;
                if (aVar5 != null) {
                    aVar5.a();
                }
                io.reactivex.rxjava3.disposables.c cVar2 = longtapRecyclerView.i;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                longtapRecyclerView.i = null;
                return s3q0.a;
            case 23:
                oq00 oq00Var = ((com.vk.clips.sdk.shared.item.market_ads.c) obj2).d;
                oq00Var.getClass();
                return new dr00.c(((tj50.a) obj).a(new l2k(oq00Var, 25), ao8.d));
            case 24:
                ((Boolean) obj).booleanValue();
                int i12 = MarketEditAlbumCoverFragment.c0;
                ((MarketEditAlbumCoverFragment) obj2).getClass();
                throw null;
            case 25:
                ((z010) obj2).n.b(false);
                return s3q0.a;
            case 26:
                vo20 vo20Var = (vo20) obj2;
                ro20 ro20Var = (ro20) obj;
                if (!vo20Var.r) {
                    throw new IllegalStateException("Instance is destroyed");
                }
                vo20Var.q.b(ro20Var);
                return s3q0.a;
            case 27:
                ModalPostAllReactionsFragment modalPostAllReactionsFragment = (ModalPostAllReactionsFragment) obj2;
                b.d dVar = (b.d) obj;
                int i13 = ModalPostAllReactionsFragment.Z;
                gm50.a.a(modalPostAllReactionsFragment, dVar.a, new u9(21, modalPostAllReactionsFragment, dVar));
                return s3q0.a;
            case 28:
                int i14 = ModalUserProfileFragment.C0;
                ((ModalUserProfileFragment) obj2).a0();
                return s3q0.a;
            default:
                rw30 rw30Var = (rw30) obj2;
                zk70.e((Throwable) obj);
                if (rw30Var.o.c()) {
                    rw30Var.b1().b(HideReason.ERROR, false);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ iie(qpu qpuVar, List list) {
        this.b = 17;
        this.c = list;
    }
}
