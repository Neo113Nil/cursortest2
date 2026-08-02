package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.auth.enterpassword.EnterPasswordPresenter;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.clips.playlists.folders.root.b;
import com.vk.clips.playlists.folders.root.h;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.profile.PlainAddress;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.ui.utils.EduMaxTransitionTracker;
import com.vk.log.L;
import com.vk.mvi.core.internal.executors.ThreadType;
import com.vk.newsfeed.api.NewsfeedDeduplicator;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem;
import com.vk.stickers.ContextUser;
import com.vk.superapp.multiaccount.api.SimpleDate;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.ayv0;
import xsna.c4u;
import xsna.cce;
import xsna.d6p;
import xsna.f6p;
import xsna.osp;
import xsna.qn60;
import xsna.t5r;
import xsna.t7n;
import xsna.tj50;
import xsna.uuf;
import xsna.v1j;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lbe implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lbe(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v168, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ayv0 aVar;
        FrameLayout frameLayout;
        RecyclerView recyclerView;
        UserId userId;
        int i = this.b;
        int i2 = 4;
        int i3 = 18;
        int i4 = 12;
        int i5 = 6;
        int i6 = 15;
        int i7 = 3;
        boolean z = true;
        int i8 = 0;
        ?? r15 = this.c;
        switch (i) {
            case 0:
                return com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b.m((com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) r15, (cce.c) obj);
            case 1:
                int i9 = ClipsPlaylistPickerFragment.V;
                ((upe) ((ClipsPlaylistPickerFragment) r15).U.getValue()).setItems((List) obj);
                return s3q0.a;
            case 2:
                com.vk.clips.playlists.folders.root.c cVar = (com.vk.clips.playlists.folders.root.c) r15;
                com.vk.clips.playlists.folders.root.h hVar = (com.vk.clips.playlists.folders.root.h) obj;
                if (hVar instanceof h.a) {
                    cVar.C(new b.C0625b(((h.a) hVar).a));
                } else if (hVar instanceof h.c) {
                    cVar.C(new b.d(((h.c) hVar).a));
                } else {
                    if (!(hVar instanceof h.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.C(new b.d(((h.b) hVar).a));
                }
                return s3q0.a;
            case 3:
                ((rg50) r15).C(((Integer) obj).intValue());
                return s3q0.a;
            case 4:
                return j5g.u0((List) obj, (ArrayList) r15);
            case 5:
                uuf.c cVar2 = (uuf.c) r15;
                wuf wufVar = (wuf) obj;
                int i10 = ClipsWrapperFragment.Q0;
                d6e s = wufVar.s();
                if (s != null) {
                    s.d(((uuf.c.b) cVar2).a());
                }
                d6e j = wufVar.j();
                if (j != null) {
                    j.d(((uuf.c.b) cVar2).a());
                }
                return s3q0.a;
            case 6:
                ContextUser contextUser = (ContextUser) r15;
                Collection<Integer> collection = (Collection) obj;
                if (contextUser != null) {
                    contextUser.e = collection;
                }
                return s3q0.a;
            case 7:
                trg trgVar = (trg) r15;
                ArrayList<PlainAddress> arrayList = trgVar.e;
                List<GroupsAddressDto> list = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (GroupsAddressDto groupsAddressDto : list) {
                    PlainAddress plainAddress = new PlainAddress();
                    plainAddress.b = groupsAddressDto.getId();
                    double d = Double.NaN;
                    plainAddress.c = groupsAddressDto.n() != null ? r7.floatValue() : Double.NaN;
                    Float o = groupsAddressDto.o();
                    if (o != null) {
                        d = o.floatValue();
                    }
                    plainAddress.d = d;
                    arrayList2.add(plainAddress);
                }
                arrayList.clear();
                trgVar.f.clear();
                trgVar.g = 0;
                arrayList.addAll(arrayList2);
                pro0.f(new j6(i2, trgVar, arrayList2));
                return s3q0.a;
            case 8:
                return CommunityCreationOnboardingFinishState.a((CommunityCreationOnboardingFinishState) ((com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b) r15).b.getCurrentState(), CommunityCreationOnboardingFinishState.SubscribeStatus.NO_SUBSCRIBE);
            case 9:
                ((i18) obj).c = new t40((UserId) r15, 29);
                return s3q0.a;
            case 10:
                com.vk.profile.community.impl.ui.profile.e eVar = (com.vk.profile.community.impl.ui.profile.e) r15;
                tj50.a aVar2 = (tj50.a) obj;
                t3h t3hVar = new t3h(eVar, i7);
                ao8 ao8Var = ao8.d;
                h0u0 a = aVar2.a(t3hVar, ao8Var);
                h0u0 a2 = aVar2.a(new oj(i6), ao8Var);
                h0u0 a3 = aVar2.a(new pl2(i3), ao8Var);
                h0u0 a4 = aVar2.a(new arf(eVar, 5), ao8Var);
                h0u0 c = tj50.a.c(aVar2, jth.b, kth.b, lth.b, new ath(i8));
                zsh zshVar = new zsh(eVar, i8);
                ThreadType.a aVar3 = ThreadType.Companion;
                ThreadType[] threadTypeArr = {ThreadType.STATE};
                aVar3.getClass();
                ThreadType.a.a(threadTypeArr);
                return new CommunityProfileViewState.Data(a, a2, a3, aVar2.f(ao8Var, null, new izs[]{dth.b, eth.b, fth.b, gth.b, hth.b, ith.b}, new h2s(zshVar, 22)), a4, c, tj50.a.b(aVar2, bth.b, new f57(i4)), tj50.a.b(aVar2, cth.b, new zj(19)), aVar2.a(new ak(i6), ao8Var));
            case 11:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                e2g0 e2g0Var = ((CommunityRepliesFragment) r15).Z;
                if (e2g0Var != null) {
                    e2g0Var.o(booleanValue);
                }
                return s3q0.a;
            case 12:
                n2j n2jVar = (n2j) r15;
                ParticipantId participantId = n2jVar.m;
                if (participantId != null) {
                    n2jVar.l.invoke(new v1j.b(participantId));
                }
                return s3q0.a;
            case 13:
                u9j.a(new MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction(MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.EventType.MODAL_SYNC_CONTACTS_DECLINE_IMPORT_CONTACTS, null));
                ((aaj) r15).invoke();
                return s3q0.a;
            case 14:
                return (Uri) r15.get((DialogBackground.Size) obj);
            case 15:
                x960 x960Var = (x960) obj;
                a5n a5nVar = ((e4n) r15).f;
                a5nVar.c.a();
                return new io.reactivex.rxjava3.internal.operators.single.b(new d4n(a5nVar.b, new qn60.b[]{new aic(), new xc3(x960Var.a().c, null, a5nVar.c, (NewsfeedDeduplicator) a5nVar.f.getValue(), null, true, null)})).l(new qa(new vam(x960Var, i7), i3));
            case 16:
                ((h8n) r15).c(new t7n.a(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            case 17:
                com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f fVar = (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) r15;
                ?? r1 = fVar.i;
                ThemableShimmer themableShimmer = fVar.q;
                exo exoVar = (exo) obj;
                if (exoVar != null) {
                    View view = fVar.c;
                    hpt0.i(exoVar, view, view);
                    awt0.v((ViewGroup) r1.getValue(), true);
                    themableShimmer.b();
                } else {
                    awt0.v((ViewGroup) r1.getValue(), false);
                    themableShimmer.c();
                }
                return s3q0.a;
            case 18:
                d6p.a aVar4 = (d6p.a) obj;
                f6p f6pVar = ((d6p) r15).b;
                ViewStub viewStub = f6pVar.a;
                if (aVar4 instanceof d6p.a.b) {
                    d6p.a.b bVar = (d6p.a.b) aVar4;
                    Context context = f6pVar.b;
                    if (bwt0.J(viewStub)) {
                        View view2 = f6pVar.d;
                        if (view2 == null) {
                            view2 = null;
                        }
                        view2.setVisibility(0);
                    } else {
                        View inflate = viewStub.inflate();
                        f6pVar.d = inflate;
                        f6pVar.e = (VkUserStack) inflate.findViewById(R.id.edu_max_members_user_stack);
                        View view3 = f6pVar.d;
                        if (view3 == null) {
                            view3 = null;
                        }
                        f6pVar.f = (TextView) view3.findViewById(R.id.edu_max_members_title);
                        View view4 = f6pVar.d;
                        if (view4 == null) {
                            view4 = null;
                        }
                        f6pVar.g = view4.findViewById(R.id.edu_max_members_chevron);
                        View view5 = f6pVar.d;
                        if (view5 == null) {
                            view5 = null;
                        }
                        ViewGroup viewGroup = (ViewGroup) view5.findViewById(R.id.edu_max_members_badge);
                        bwt0.i0(viewGroup, new srg(f6pVar, i4));
                        f6pVar.h = viewGroup;
                    }
                    String str = bVar.c;
                    int i11 = bVar.b;
                    f6pVar.i = str;
                    List<qtd0> list2 = bVar.a;
                    boolean z2 = i11 <= list2.size();
                    f6p.e eVar2 = f6pVar.j;
                    List<qtd0> list3 = list2;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new f6p.f((qtd0) it.next()));
                    }
                    eVar2.setItems(arrayList3);
                    if (z2) {
                        View view6 = f6pVar.g;
                        if (view6 == null) {
                            view6 = null;
                        }
                        f4m.j(view6);
                        f6pVar.a();
                        f6p.d dVar = f6pVar.k;
                        if (dVar != null && (recyclerView = dVar.b) != null) {
                            f4m.j(recyclerView);
                        }
                        f6p.d dVar2 = f6pVar.k;
                        if (dVar2 != null && (frameLayout = dVar2.c) != null) {
                            frameLayout.setVisibility(0);
                        }
                        ViewGroup viewGroup2 = f6pVar.h;
                        if (viewGroup2 == null) {
                            viewGroup2 = null;
                        }
                        viewGroup2.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        ViewGroup viewGroup3 = f6pVar.h;
                        if (viewGroup3 == null) {
                            viewGroup3 = null;
                        }
                        viewGroup3.setClickable(false);
                        TextView textView = f6pVar.f;
                        if (textView == null) {
                            textView = null;
                        }
                        textView.setText(context.getString(R.string.vkim_edu_max_members_all_moved));
                    } else {
                        View view7 = f6pVar.g;
                        if (view7 == null) {
                            view7 = null;
                        }
                        view7.setVisibility(0);
                        ViewGroup viewGroup4 = f6pVar.h;
                        if (viewGroup4 == null) {
                            viewGroup4 = null;
                        }
                        viewGroup4.setTranslationZ(1.0f);
                        ViewGroup viewGroup5 = f6pVar.h;
                        if (viewGroup5 == null) {
                            viewGroup5 = null;
                        }
                        viewGroup5.setClickable(true);
                        TextView textView2 = f6pVar.f;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        textView2.setText(context.getResources().getQuantityString(R.plurals.vkim_edu_max_members_counter, i11, Integer.valueOf(list2.size()), Integer.valueOf(i11)));
                    }
                    ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
                    for (qtd0 qtd0Var : list3) {
                        Image Gb = qtd0Var.C8().Gb(f6p.o);
                        String str2 = Gb != null ? Gb.d : null;
                        if (str2 != null) {
                            aVar = new ayv0.c(str2);
                        } else {
                            com.vk.im.ui.views.avatars.b bVar2 = f6pVar.l;
                            bVar2.getClass();
                            aVar = new ayv0.a(bVar2.e(qtd0Var.name(), qtd0Var.t8()));
                        }
                        arrayList4.add(aVar);
                    }
                    if (arrayList4.size() > 3) {
                        VkUserStack vkUserStack = f6pVar.e;
                        if (vkUserStack == null) {
                            vkUserStack = null;
                        }
                        vkUserStack.setCounter(Integer.valueOf(arrayList4.size() - 3));
                        VkUserStack vkUserStack2 = f6pVar.e;
                        (vkUserStack2 == null ? null : vkUserStack2).setAvatars(arrayList4.subList(0, 2));
                    } else {
                        VkUserStack vkUserStack3 = f6pVar.e;
                        (vkUserStack3 == null ? null : vkUserStack3).setAvatars(arrayList4);
                    }
                } else {
                    if (!(aVar4 instanceof d6p.a.C2709a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (bwt0.J(viewStub)) {
                        View view8 = f6pVar.d;
                        f4m.j(view8 == null ? null : view8);
                    }
                }
                EduMaxTransitionTracker.b(EduMaxTransitionTracker.BannerType.BANNER_COUNTER, MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem.EventType.SHOW);
                return s3q0.a;
            case 19:
                VkButton vkButton = ((ubp) r15).i;
                if (vkButton != null) {
                    vkButton.setLoading(true);
                }
                return s3q0.a;
            case 20:
                EnterPasswordPresenter enterPasswordPresenter = (EnterPasswordPresenter) r15;
                String obj2 = ((pno0) obj).d().toString();
                if (!epx.f(enterPasswordPresenter.x, obj2) || !hg1.d(enterPasswordPresenter.A)) {
                    if (obj2.length() == 0) {
                        yop yopVar = (yop) enterPasswordPresenter.a;
                        if (yopVar != null) {
                            yopVar.Xi();
                        }
                    } else {
                        io.reactivex.rxjava3.disposables.c cVar3 = enterPasswordPresenter.A;
                        if (cVar3 != null) {
                            cVar3.dispose();
                        }
                        SignUpDataHolder signUpDataHolder = (SignUpDataHolder) enterPasswordPresenter.z.b;
                        vdx0 vdx0Var = e370.e;
                        if (vdx0Var == null) {
                            vdx0Var = null;
                        }
                        wen0 a5 = vdx0Var.a();
                        String str3 = signUpDataHolder.i;
                        String str4 = signUpDataHolder.j;
                        SimpleDate simpleDate = signUpDataHolder.m;
                        enterPasswordPresenter.A = mnh0.C(a5.c(obj2, str3, str4, simpleDate != null ? simpleDate.toString() : null, signUpDataHolder.c), enterPasswordPresenter.s, new t3h(enterPasswordPresenter, 16), new ozh(enterPasswordPresenter, 13), null);
                    }
                }
                return s3q0.a;
            case 21:
                L.i((Throwable) obj);
                ((osp.a) r15).k.b(false);
                return s3q0.a;
            case 22:
                gzs gzsVar = (gzs) ((m6o0) r15).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 23:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) r15;
                int i12 = FeedAnimatedView.y;
                return qVar;
            case 24:
                b69 b69Var = (b69) obj;
                s5r s5rVar = ((v5r) r15).f;
                if (s5rVar != null) {
                    s5rVar.b.onNext(new t5r.b(b69Var.a));
                }
                return s3q0.a;
            case 25:
                io.reactivex.rxjava3.schedulers.b bVar3 = (io.reactivex.rxjava3.schedulers.b) obj;
                return io.reactivex.rxjava3.core.q.T(bVar3.a).A(Math.max(0L, ((fhs) r15).E - bVar3.a()), TimeUnit.MILLISECONDS);
            case 26:
                ((rj70) ((FriendRequestsFragment) r15).V.getValue()).a(false);
                g620.s(0);
                return s3q0.a;
            case 27:
                ((zot) r15).u.invoke();
                return s3q0.a;
            case 28:
                GoodFragment goodFragment = (GoodFragment) r15;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                c4u a6 = goodFragment.Lo().a();
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                cxo Po = goodFragment.Po();
                a6.getClass();
                Good good = Po.r;
                h010 h010Var = Po.f;
                if (h010Var == null || (userId = h010Var.c) == null) {
                    userId = UserId.d;
                }
                UserId userId2 = userId;
                long j2 = h010Var != null ? h010Var.b : 0L;
                boolean z3 = Po.j0;
                boolean z4 = good != null && good.C && (Po.K == null || booleanValue2);
                if (!z3 || (Po.J != null && !booleanValue2)) {
                    z = false;
                }
                io.reactivex.rxjava3.internal.operators.single.b0 m = ((f110) Po.a.P.getValue()).a(0, 3, j2, userId2).m(io.reactivex.rxjava3.android.schedulers.a.b());
                io.reactivex.rxjava3.internal.operators.single.b0 m2 = a6.a.b(userId2, j2, 3, new rpz(null, null, Po.d0)).m(io.reactivex.rxjava3.android.schedulers.a.b());
                return new io.reactivex.rxjava3.internal.operators.observable.o1(((z4 && z) ? io.reactivex.rxjava3.core.x.B(m, m2, new n7(new com.vk.movika.tools.controls.seekbar.m(i5, a6, Po), 27)) : z4 ? m.l(new rf1(new n3i(a6, Po), 28)) : z ? m2.l(new q7(new f2s(a6, Po), 24)) : io.reactivex.rxjava3.core.x.k(new c4u.a(null, null, false))).w(), new s7(new sm0(23), i6));
            default:
                ((i7u) r15).b.invoke((m5u) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ lbe(t9j t9jVar, aaj aajVar) {
        this.b = 13;
        this.c = aajVar;
    }
}
