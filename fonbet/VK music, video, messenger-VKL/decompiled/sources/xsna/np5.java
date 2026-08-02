package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.animation.AccelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.design.view.camera.ClipsTimerTimeSelectorWrap;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.api.model.ReviewsActionType;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.feed.core.models.MyTargetBrandLiftSurvey;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.f;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.subscription.impl.RxUsersSubscriptionBusImpl;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.group_selector.ui.a;
import com.vk.voip.ui.group_selector.ui.b;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.data.FriendsUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.atq0;
import xsna.fdo0;
import xsna.gy50;
import xsna.i3o;
import xsna.l310;
import xsna.msw0;
import xsna.o410;
import xsna.r1r0;
import xsna.ro90;
import xsna.rye;
import xsna.t310;
import xsna.ubg;
import xsna.vyh;
import xsna.wk50;
import xsna.zew0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class np5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ np5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [xsna.msw0$a] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Float recordingTimeFractionValue;
        String b;
        int i = 20;
        int i2 = 6;
        int i3 = 5;
        int i4 = 3;
        boolean z = false;
        int i5 = 1;
        switch (this.b) {
            case 0:
                AvatarAnimatedStack avatarAnimatedStack = (AvatarAnimatedStack) this.c;
                Paint paint = (Paint) this.d;
                float f = avatarAnimatedStack.i / 2.0f;
                ((Canvas) obj).drawCircle((-f) / 2.5f, f, f, paint);
                return s3q0.a;
            case 1:
                gy50.e eVar = (gy50.e) this.c;
                f69 f69Var = (f69) this.d;
                FragmentManager fragmentManager = (FragmentManager) obj;
                GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
                CallMemberId callMemberId = eVar.a;
                groupCallViewModel.getClass();
                kiu b2 = GroupCallViewModel.b(callMemberId);
                if (b2 != null) {
                    zew0.a aVar = zew0.k1;
                    Context context = f69Var.a;
                    zew0.a.b(aVar, context, R.drawable.vk_icon_user_star_badge_outline_28, R.attr.vk_ui_icon_accent, context.getString(R.string.voip_grant_admin_to_dialog_title), context.getString(b2.i ? R.string.voip_grant_admin_to_dialog_message_female : R.string.voip_grant_admin_to_dialog_message_male, b2.e), null, new zew0.b.d(eVar.a), new zew0.c(R.string.voip_grant_admin_to_dialog_negative_button), false, 288).Td(fragmentManager, "");
                }
                return s3q0.a;
            case 2:
                ClipsFavoriteFolderContentListViewState.g gVar = (ClipsFavoriteFolderContentListViewState.g) this.c;
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.d;
                ClipsFavoriteFolderContentListFragment.b bVar = (ClipsFavoriteFolderContentListFragment.b) obj;
                int i6 = ClipsFavoriteFolderContentListFragment.W;
                AutoTransition autoTransition = new AutoTransition();
                autoTransition.setDuration(300L);
                autoTransition.setOrdering(0);
                ConstraintLayout constraintLayout = bVar.a;
                VkTopBar vkTopBar = bVar.b;
                TransitionManager.endTransitions(constraintLayout);
                TransitionManager.beginDelayedTransition(bVar.a, autoTransition);
                if (gVar instanceof ClipsFavoriteFolderContentListViewState.g.b) {
                    vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.talkback_ic_cancel), new com.vk.movika.sdk.base.logic.processor.actions.d(clipsFavoriteFolderContentListFragment, i), null, com.vk.core.compose.component.semantics.b.a(null, new vt1(11), 3), 4));
                    ClipsFavoriteFolderContentListViewState.g.b bVar2 = (ClipsFavoriteFolderContentListViewState.g.b) gVar;
                    List<ClipsFavoriteFolderContentListViewState.g.b.a> list = bVar2.a;
                    List<ClipsFavoriteFolderContentListViewState.g.b.a> list2 = bVar2.a;
                    if (list.isEmpty()) {
                        ClipsFavoriteFolderContentListFragment.b bVar3 = clipsFavoriteFolderContentListFragment.V;
                        if (bVar3 != null) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) bVar3.a().getLayoutParams();
                            bVar4.j = 0;
                            bVar4.l = -1;
                            bVar3.a().setLayoutParams(bVar4);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    } else {
                        int size = list2.size();
                        clipsFavoriteFolderContentListFragment.getClass();
                        clipsFavoriteFolderContentListFragment.go(new z2e(size, clipsFavoriteFolderContentListFragment));
                        int i7 = 0;
                        for (Object obj2 : list2) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                e43.t();
                                throw null;
                            }
                            ClipsFavoriteFolderContentListViewState.g.b.a aVar2 = (ClipsFavoriteFolderContentListViewState.g.b.a) obj2;
                            VkButton vkButton = (VkButton) bVar.e.getChildAt(i7);
                            vkButton.setText(aVar2.b.a(clipsFavoriteFolderContentListFragment.requireContext()));
                            vkButton.setOnClickListener(new wnb(i5, clipsFavoriteFolderContentListFragment, aVar2));
                            vkButton.setMode(aVar2.c ? VkButton.Mode.Primary : VkButton.Mode.Secondary);
                            vkButton.setEnabled(aVar2.d);
                            i7 = i8;
                        }
                        ClipsFavoriteFolderContentListFragment.b bVar5 = clipsFavoriteFolderContentListFragment.V;
                        if (bVar5 != null) {
                            int i9 = ClipsFavoriteFolderContentListFragment.W;
                            ConstraintLayout.b bVar6 = (ConstraintLayout.b) bVar5.a().getLayoutParams();
                            bVar6.l = 0;
                            bVar6.j = -1;
                            bVar5.a().setLayoutParams(bVar6);
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                    }
                } else {
                    if (!(gVar instanceof ClipsFavoriteFolderContentListViewState.g.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkTopBar.setBack(new VkTopBar.b(new com.vk.movika.sdk.base.logic.processor.actions.g(clipsFavoriteFolderContentListFragment, 26), tq.h(tlo0.Companion, R.string.talkback_ic_back), null, null, com.vk.core.compose.component.semantics.b.a(null, new gt(r9), 3), 12));
                    ClipsFavoriteFolderContentListFragment.b bVar7 = clipsFavoriteFolderContentListFragment.V;
                    if (bVar7 != null) {
                        ConstraintLayout.b bVar8 = (ConstraintLayout.b) bVar7.a().getLayoutParams();
                        bVar8.j = 0;
                        bVar8.l = -1;
                        bVar7.a().setLayoutParams(bVar8);
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                }
                return s3q0.a;
            case 3:
                o9f o9fVar = (o9f) this.c;
                ClipsTimerTimeSelectorWrap clipsTimerTimeSelectorWrap = (ClipsTimerTimeSelectorWrap) this.d;
                o9fVar.d = (int) (o9fVar.b.i.b * ((clipsTimerTimeSelectorWrap == null || (recordingTimeFractionValue = clipsTimerTimeSelectorWrap.getRecordingTimeFractionValue()) == null) ? 1.0f : recordingTimeFractionValue.floatValue()));
                VkSegmentedControl vkSegmentedControl = o9fVar.f;
                Integer valueOf = vkSegmentedControl != null ? Integer.valueOf(vkSegmentedControl.getSelectedTabPosition()) : null;
                r9 = ((valueOf != null && valueOf.intValue() == 0) || valueOf == null || valueOf.intValue() != 1) ? 3 : 10;
                o9fVar.e = r9;
                jpd jpdVar = o9fVar.b;
                jpdVar.y.i(o9fVar.d - jpdVar.G, true, Integer.valueOf(r9));
                dw20 dw20Var = o9fVar.c;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 4:
                ubg ubgVar = (ubg) this.c;
                ubg.a aVar3 = (ubg.a) this.d;
                xbg xbgVar = ubgVar.r;
                if (xbgVar != null) {
                    aVar3.d(xbgVar.b);
                    xbg xbgVar2 = ubgVar.r;
                    if (xbgVar2 == null || !xbgVar2.n) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(Arrays.copyOf(ubg.s, 4));
                        ofFloat.setInterpolator(new AccelerateInterpolator());
                        ofFloat.setDuration(300L);
                        ofFloat.addUpdateListener(new i20(ubgVar, i5));
                        ofFloat.addListener(new vbg(ubgVar));
                        ofFloat.start();
                        ubgVar.n = ofFloat;
                    }
                }
                return s3q0.a;
            case 5:
                mdg mdgVar = (mdg) this.c;
                iag iagVar = (iag) this.d;
                if (iagVar instanceof NewsComment) {
                    NewsComment newsComment = (NewsComment) iagVar;
                    if (fkq0.d(newsComment.j)) {
                        List list3 = (List) yfb.x(r1r0.a.b((s1r0) mdgVar.Z.getValue(), Collections.singletonList(newsComment.j), e43.l(UsersFieldsDto.FIRST_NAME_ACC, UsersFieldsDto.BLACKLISTED_BY_ME), null, null, 58)).u(0L);
                        UsersUserFullDto usersUserFullDto = list3 != null ? (UsersUserFullDto) j5g.a0(list3) : null;
                        newsComment.e = usersUserFullDto != null ? usersUserFullDto.H0() : null;
                        if (!fkq0.d(mdgVar.i)) {
                            UserProfile userProfile = (UserProfile) j5g.a0((List) new io.reactivex.rxjava3.internal.operators.observable.o1(new com.vk.newsfeed.impl.helpers.a().a(fkq0.e(mdgVar.i), newsComment.j, true), new zj0(new vr0(i), 8)).a());
                            z = epx.f(userProfile != null ? userProfile.c : null, newsComment.j);
                        } else if ((usersUserFullDto != null ? usersUserFullDto.k() : null) == BaseBoolIntDto.YES) {
                            z = true;
                        }
                        newsComment.x = z;
                    }
                }
                return s3q0.a;
            case 6:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b bVar9 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b) this.c;
                wk50.a aVar4 = (wk50.a) this.d;
                String str = ((b4g0) obj).b;
                if (drm0.N(str)) {
                    bVar9.f(aVar4);
                } else {
                    bVar9.b.b(new vyh.f(oq.d(tlo0.Companion, str)));
                }
                return s3q0.a;
            case 7:
                Context context2 = (Context) this.c;
                String str2 = (String) this.d;
                SimpleDateFormat simpleDateFormat = bgu0.a;
                rex0 rex0Var = e370.j;
                bgu0.b(context2, rex0Var != null ? rex0Var : null, str2);
                return s3q0.a;
            case 8:
                izs izsVar = (izs) this.c;
                tho0 tho0Var = (tho0) obj;
                ((wh50) this.d).setValue(tho0Var);
                izsVar.invoke(new i3o.f(tho0Var.a.c, tho0Var.b));
                return s3q0.a;
            case 9:
                FaveTag faveTag = (FaveTag) this.c;
                String str3 = (String) this.d;
                if (((Boolean) obj).booleanValue()) {
                    p870.f().e(1205, new FaveTag(faveTag.b, str3));
                } else {
                    p870.f().e(1200, s3q0.a);
                }
                return s3q0.a;
            case 10:
                ((sg50) this.c).c((vax) this.d);
                return s3q0.a;
            case 11:
                wjs wjsVar = (wjs) this.c;
                qtd0 qtd0Var = (qtd0) this.d;
                xym0 xym0Var = wjsVar.f;
                long id = qtd0Var.id();
                xym0Var.getClass();
                RxUsersSubscriptionBusImpl m = xwk.e().T().m();
                SubscribeStatus.Companion.getClass();
                m.b(new kym0(SubscribeStatus.a.a(0), new UserId(id), null, null, 12));
                wjsVar.b.M();
                wjsVar.e = null;
                return s3q0.a;
            case 12:
                w2y w2yVar = (w2y) this.c;
                t2y t2yVar = (t2y) this.d;
                WebApiApplication webApiApplication = (WebApiApplication) obj;
                w2yVar.c = Boolean.valueOf(webApiApplication.U);
                t2yVar.invoke(Boolean.valueOf(webApiApplication.U));
                return s3q0.a;
            case 13:
                a410 a410Var = (a410) this.c;
                a410Var.Y(false, (x410) this.d);
                a410Var.l.b(new t310.e(tq.h(tlo0.Companion, R.string.market_all_reviews_delete_and_restore_error)));
                return s3q0.a;
            case 14:
                w410 w410Var = (w410) this.c;
                o410.h hVar = (o410.h) this.d;
                u60 u60Var = (u60) obj;
                if (u60Var == ReviewsActionType.ACTION_COPY_TEXT) {
                    w410Var.f.invoke(new l310.i(hVar.a.d));
                } else if (u60Var == ReviewsActionType.ACTION_EDIT) {
                    MarketItemReviewsFragment.c cVar = w410Var.f;
                    f210 f210Var = hVar.a;
                    cVar.invoke(new l310.k(f210Var.b, f210Var.c));
                } else if (u60Var == ReviewsActionType.ACTION_REPORT) {
                    MarketItemReviewsFragment.c cVar2 = w410Var.f;
                    f210 f210Var2 = hVar.a;
                    cVar2.invoke(new l310.h(f210Var2.b, f210Var2.c));
                } else if (u60Var == ReviewsActionType.ACTION_DELETE) {
                    MarketItemReviewsFragment.c cVar3 = w410Var.f;
                    f210 f210Var3 = hVar.a;
                    cVar3.invoke(new l310.j(f210Var3.b, f210Var3.c));
                } else if (u60Var == ReviewsActionType.ACTION_REPLY) {
                    MarketItemReviewsFragment.c cVar4 = w410Var.f;
                    f210 f210Var4 = hVar.a;
                    cVar4.invoke(new l310.q.a(null, f210Var4.b, f210Var4.a, Long.valueOf(f210Var4.c)));
                }
                return s3q0.a;
            case 15:
                ModernPlaylistModel modernPlaylistModel = (ModernPlaylistModel) this.c;
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = (MusicPlaybackLaunchContext) this.d;
                List list4 = (List) obj;
                if (list4.isEmpty()) {
                    return io.reactivex.rxjava3.core.q.T(EmptyList.b);
                }
                ArrayList U0 = j5g.U0(list4, 100, 100, true);
                ArrayList arrayList = new ArrayList(c5g.u(U0, 10));
                Iterator it = U0.iterator();
                while (true) {
                    int i10 = 21;
                    if (!it.hasNext()) {
                        return io.reactivex.rxjava3.core.q.r(arrayList).f0(EmptyList.b, new e8(new i60(i2), i10)).w();
                    }
                    arrayList.add(rsg0.T(yfb.x(hx4.o((hx4) modernPlaylistModel.g.getValue(), (List) it.next(), musicPlaybackLaunchContext.Lb(), 2))).U(new c8(new ulz(i3), i10)));
                }
            case 16:
                vh40 vh40Var = (vh40) this.c;
                MusicTrack musicTrack = (MusicTrack) this.d;
                Playlist playlist = (Playlist) obj;
                sg40 sg40Var = vh40Var.c;
                Future submit = sg40Var.n.submit(new ng40(sg40Var, o25.a().c(), musicTrack, playlist));
                int i11 = io.reactivex.rxjava3.core.g.b;
                return new io.reactivex.rxjava3.internal.operators.flowable.u0(new io.reactivex.rxjava3.internal.operators.flowable.x(submit)).l(new or20(new ebx(playlist, r9), i4));
            case 17:
                et50 et50Var = (et50) this.c;
                List<MyTargetBrandLiftSurvey.Question> list5 = (List) this.d;
                int i12 = et50Var.n1;
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    et50Var.n1 = i13;
                    MyTargetBrandLiftSurvey.Question question = list5.get(i13);
                    et50Var.fo(question, list5);
                    et50Var.eo(question);
                    et50Var.bo(question);
                    et50Var.co(question, list5);
                }
                return s3q0.a;
            case 18:
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                if (str4 != null && (b = pzl.b(str5, ". ", str4)) != null) {
                    str5 = b;
                }
                qgi0.h(tgi0Var, str5);
                qgi0.r(tgi0Var, "order_list_cart_button");
                return s3q0.a;
            case 19:
                ((rn90) this.c).l.a(new ro90.a(((eo90) this.d).b));
                return s3q0.a;
            case 20:
                String str6 = (String) this.c;
                List list6 = (List) this.d;
                qyg0 V0 = ((hyg0) obj).V0(str6);
                try {
                    Iterator it2 = list6.iterator();
                    while (it2.hasNext()) {
                        V0.bindLong(i5, ((Number) it2.next()).intValue());
                        i5++;
                    }
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 21:
                rye.b bVar10 = (rye.b) this.c;
                bVar10.b(((gtl) this.d).b, new fm20(bVar10, 22), true);
                return s3q0.a;
            case 22:
                k170 k170Var = (k170) this.c;
                fdo0.a aVar5 = (fdo0.a) this.d;
                npp0 npp0Var = (npp0) obj;
                if (npp0Var instanceof wn0) {
                    k170Var.invoke(((wn0) npp0Var).p);
                } else {
                    if (!(npp0Var instanceof der)) {
                        throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                    }
                    ((der) npp0Var).getClass();
                    aVar5.invoke(null);
                }
                return Boolean.TRUE;
            case 23:
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.c;
                rlq0 rlq0Var = (rlq0) this.d;
                if (extendedUserProfile.a1 == 2) {
                    FriendsUtils.a(1);
                }
                if (extendedUserProfile.a1 == 3) {
                    extendedUserProfile.a1 = 2;
                    String string = rlq0Var.c.getString(extendedUserProfile.a.K().booleanValue() ? R.string.user_profile_friend_deleted_f : R.string.user_profile_friend_deleted_m, extendedUserProfile.a.d + ' ' + extendedUserProfile.a.f);
                    fpq0 fpq0Var = rlq0Var.k;
                    if (fpq0Var == null) {
                        fpq0Var = null;
                    }
                    fpq0Var.B(new f.h(new atq0.f(null, string, null, 5)));
                }
                if (extendedUserProfile.a1 == 1) {
                    extendedUserProfile.a1 = 0;
                    Integer valueOf2 = extendedUserProfile.Q1 ? Integer.valueOf(R.string.user_profile_unfollowed) : extendedUserProfile.k0 ? Integer.valueOf(R.string.user_profile_friend_request_canceled) : null;
                    if (valueOf2 != null) {
                        fpq0 fpq0Var2 = rlq0Var.k;
                        if (fpq0Var2 == null) {
                            fpq0Var2 = null;
                        }
                        fpq0Var2.B(new f.h(new atq0.f(valueOf2, null, null, 6)));
                    }
                }
                FriendsUtils.d(extendedUserProfile.a1, rlq0Var.b.a);
                u5p0 u5p0Var = rlq0Var.i;
                if (u5p0Var == null) {
                    u5p0Var = null;
                }
                u5p0Var.invoke(new UserProfileAction.x(null, 15));
                return s3q0.a;
            case 24:
                bdr0 bdr0Var = (bdr0) this.c;
                ni0 ni0Var = (ni0) this.d;
                bdr0Var.d = null;
                ((utj) obj).b();
                ni0Var.invoke();
                return s3q0.a;
            case 25:
                ((d7w0) this.c).l.a(((e7w0) this.d).b);
                return s3q0.a;
            case 26:
                b.a.d dVar = (b.a.d) this.c;
                dpw0<com.vk.voip.ui.group_selector.ui.a> dpw0Var = ((row0) this.d).l;
                if (dVar instanceof b.a.d.C2047a) {
                    dpw0Var.a(a.C2042a.a);
                } else if (dVar instanceof b.a.d.C2048b) {
                    dpw0Var.a(a.e.a);
                } else {
                    if (!(dVar instanceof b.a.d.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dpw0Var.a(new a.f(((b.a.d.c) dVar).c));
                }
                return s3q0.a;
            default:
                msw0 msw0Var = (msw0) this.c;
                msw0.c cVar5 = (msw0.c) this.d;
                Object obj3 = msw0Var.h1;
                (obj3 != null ? obj3 : 0).c(cVar5);
                msw0Var.dismiss();
                return s3q0.a;
        }
    }

    public /* synthetic */ np5(qnl qnlVar, Context context, String str) {
        this.b = 7;
        this.c = context;
        this.d = str;
    }

    public /* synthetic */ np5(wjs wjsVar, qtd0 qtd0Var, Peer peer) {
        this.b = 11;
        this.c = wjsVar;
        this.d = qtd0Var;
    }
}
