package xsna;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;
import com.vk.api.generated.stories.dto.StoriesGetV5113ResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedDto;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.clips.design.view.camera.settings.ModalSettingsRowView;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastPage;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.music.podcast.api.menu.PodcastMenuItem;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.search.params.api.SearchParams;
import com.vk.settings.impl.presentation.base.fragment.section.NotificationSectionFragment;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import one.video.ad.ux.ShoppableAdView;
import xsna.el50;
import xsna.ffd0;
import xsna.k65;
import xsna.nh70;
import xsna.p1v;
import xsna.sbl0;
import xsna.sir0;
import xsna.tj50;
import xsna.uhg0;
import xsna.vzi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class or50 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ or50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:0x07f8, code lost:
    
        if (r9.Hg(r12.c) == true) goto L287;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ComposeView composeView;
        int i = this.b;
        int i2 = 3;
        int i3 = 7;
        int i4 = 25;
        int i5 = 14;
        int i6 = 23;
        int i7 = 16;
        int i8 = 4;
        f1o f1oVar = null;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                View view = (View) obj;
                cjx cjxVar = ((pr50) obj2).E;
                (cjxVar != null ? cjxVar : null).p(view, "DEFAULT");
                return s3q0.a;
            case 1:
                FragmentEntry fragmentEntry = (FragmentEntry) obj2;
                z1h0 z1h0Var = (Fragment) obj;
                if (epx.f(fragmentEntry.b, z1h0Var.getClass())) {
                    szf0 szf0Var = z1h0Var instanceof szf0 ? (szf0) z1h0Var : null;
                    if (szf0Var != null) {
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                p1v p1vVar = (p1v) obj;
                return p1vVar instanceof p1v.a ? ((io.reactivex.rxjava3.internal.operators.single.n) obj2).w() : p1vVar instanceof p1v.d ? io.reactivex.rxjava3.core.q.T(((p1v.d) p1vVar).a) : io.reactivex.rxjava3.internal.operators.observable.l1.b;
            case 3:
                ((m670) obj2).a.update(new k65.d(((gcu0) obj).a));
                return s3q0.a;
            case 4:
                ((qe70) obj2).o.b(vzi0.a.a);
                return s3q0.a;
            case 5:
                xz70 xz70Var = (xz70) obj2;
                eru0 eru0Var = (eru0) obj;
                SearchParams searchParams = xz70Var.g;
                if (searchParams != null) {
                    searchParams.h5(eru0Var.a);
                }
                xz70Var.a(xz70Var.f.b());
                xz70Var.c();
                return s3q0.a;
            case 6:
                UtilsDomainResolvedDto utilsDomainResolvedDto = (UtilsDomainResolvedDto) obj2;
                Boolean bool = (Boolean) obj;
                return new p2o(utilsDomainResolvedDto.e(), utilsDomainResolvedDto.d() != null ? r4.intValue() : 0L, bool.booleanValue());
            case 7:
                Object obj3 = ((v3a0) obj2).o;
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = null;
                }
                x3a0 x3a0Var = (x3a0) obj4;
                PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo = x3a0Var.x;
                String str = phoneValidationContract$ValidationDialogMetaInfo.c;
                String str2 = phoneValidationContract$ValidationDialogMetaInfo.b;
                boolean z4 = phoneValidationContract$ValidationDialogMetaInfo.d;
                x3a0Var.z.b(mnh0.B(new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(sir0.h(sir0.a, new sir0.e(str2, null, false, false, false, false, z4, false, false, null, 954)), new hu50(new px30(x3a0Var, 15), i3), io.reactivex.rxjava3.internal.functions.a.c), new jg4(x3a0Var, i2)), x3a0Var.s, new j440(x3a0Var, z4, str), new oe70(1, x3a0Var, str2, str, z4), null));
                return s3q0.a;
            case 8:
                ((com.vk.photos.root.photoflow.presentation.j) obj2).e.invoke(new a.q(((y7a0) obj).a));
                return s3q0.a;
            case 9:
                sma0 sma0Var = (sma0) obj2;
                awg0 awg0Var = (awg0) obj;
                int i9 = 13;
                el50.a.b(sma0Var, new qcw(i9));
                t060 t060Var = sma0Var.c;
                sj50 sj50Var = sma0Var.b;
                io.reactivex.rxjava3.internal.operators.observable.f0 K = ((gxh) t060Var.c).N0(fkq0.a(((ana0) sj50Var.getCurrentState()).b)).U(new dq(new nc90(z2 ? 1 : 0), 25)).K();
                UserId userId = ((ana0) sj50Var.getCurrentState()).b;
                up2 up2Var = (up2) ((fh9) t060Var.b).c;
                UserId a = fkq0.a(userId);
                up2Var.getClass();
                tfx tfxVar = new tfx("communitySubscriptions.getDetails", new en(i5), new kr(i9));
                tfx.n(tfxVar, "community_id", a, 0L, 0L, 12);
                tfx.o(tfxVar, "subscription_name", "pin_review", 0, 0, 12);
                return awg0Var.g(io.reactivex.rxjava3.core.x.A(K, rsg0.w0(yfb.x(tfxVar)).l(new hna0(ina0.b, 0)), io.reactivex.rxjava3.core.x.t(1L, TimeUnit.SECONDS), new qw80(new fli(i2), 2)).q(awg0Var.r().c()), new b8v(sma0Var, i9), new ca10(sma0Var, 9));
            case 10:
                com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) obj2;
                PodcastPage podcastPage = (PodcastPage) obj;
                mzp0 mzp0Var = bVar.c;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                bVar.e = podcastPage;
                MusicTrack musicTrack = podcastPage.b;
                ArrayList<MusicTrack> arrayList = podcastPage.c;
                if (musicTrack != null) {
                    musicTrack.I = bVar.j;
                }
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        if (((MusicTrack) obj5).b == bVar.i) {
                            arrayList2.add(obj5);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        MusicTrack musicTrack2 = (MusicTrack) it.next();
                        musicTrack2.I = bVar.j;
                        arrayList3.add(musicTrack2);
                    }
                }
                PodcastEpisodeFragment podcastEpisodeFragment = bVar.b;
                MusicTrack musicTrack3 = podcastPage.b;
                if (musicTrack3 != null) {
                    if (((Boolean) podcastEpisodeFragment.q0.getValue()).booleanValue() && (composeView = podcastEpisodeFragment.i0) != null) {
                        bwt0.p0(composeView, false);
                    }
                    if (musicTrack3.g == 11) {
                        FragmentActivity activity = podcastEpisodeFragment.getActivity();
                        if (activity != null) {
                            f1o f1oVar2 = new f1o(activity);
                            f1oVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            Episode episode = musicTrack3.w;
                            if (episode != null) {
                                f1oVar2.c.setText(episode.h);
                                f1oVar2.d.setText(hd60.a().h(episode.i));
                                LinkButton linkButton = episode.j;
                                String str3 = linkButton != null ? linkButton.b : null;
                                VkSimpleButton vkSimpleButton = f1oVar2.e;
                                vkSimpleButton.setText(str3);
                                bwt0.i0(vkSimpleButton, new jl6(episode, musicTrack3, f1oVar2, i8));
                            }
                            f4m.v(e3m.d(R.attr.actionBarSize, f1oVar2.getContext()), f1oVar2);
                            FrameLayout frameLayout = podcastEpisodeFragment.f0;
                            if (frameLayout != null) {
                                bwt0.p0(frameLayout, true);
                            }
                            FrameLayout frameLayout2 = podcastEpisodeFragment.f0;
                            if (frameLayout2 != null) {
                                frameLayout2.addView(f1oVar2);
                            }
                            RecyclerPaginatedView recyclerPaginatedView = podcastEpisodeFragment.U;
                            if (recyclerPaginatedView == null) {
                                recyclerPaginatedView = null;
                            }
                            bwt0.p0(recyclerPaginatedView, false);
                            AppBarLayout appBarLayout = podcastEpisodeFragment.h0;
                            if (appBarLayout != null) {
                                appBarLayout.setExpanded(true);
                            }
                            AppBarLayout appBarLayout2 = podcastEpisodeFragment.h0;
                            ViewGroup.LayoutParams layoutParams = appBarLayout2 != null ? appBarLayout2.getLayoutParams() : null;
                            CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
                            if (fVar != null) {
                                podcastEpisodeFragment.j0 = fVar.a;
                                fVar.c(null);
                            }
                            f1oVar = f1oVar2;
                        }
                        podcastEpisodeFragment.g0 = f1oVar;
                        podcastEpisodeFragment.mo(PodcastMenuItem.SubscribeToAuthor, false);
                        podcastEpisodeFragment.mo(PodcastMenuItem.GoToPost, false);
                        podcastEpisodeFragment.b0 = false;
                    } else {
                        FrameLayout frameLayout3 = podcastEpisodeFragment.f0;
                        if (frameLayout3 != null) {
                            bwt0.p0(frameLayout3, false);
                        }
                        f1o f1oVar3 = podcastEpisodeFragment.g0;
                        if (f1oVar3 != null) {
                            ViewParent parent = f1oVar3.getParent();
                            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup != null) {
                                viewGroup.removeView(f1oVar3);
                            }
                            RecyclerPaginatedView recyclerPaginatedView2 = podcastEpisodeFragment.U;
                            if (recyclerPaginatedView2 == null) {
                                recyclerPaginatedView2 = null;
                            }
                            bwt0.p0(recyclerPaginatedView2, true);
                            podcastEpisodeFragment.g0 = null;
                            CoordinatorLayout.c<View> cVar = podcastEpisodeFragment.j0;
                            if (cVar != null) {
                                AppBarLayout appBarLayout3 = podcastEpisodeFragment.h0;
                                ViewGroup.LayoutParams layoutParams2 = appBarLayout3 != null ? appBarLayout3.getLayoutParams() : null;
                                CoordinatorLayout.f fVar2 = layoutParams2 instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams2 : null;
                                if (fVar2 != null) {
                                    fVar2.c(cVar);
                                }
                                podcastEpisodeFragment.j0 = null;
                            }
                        }
                        utt0 utt0Var = podcastEpisodeFragment.V;
                        if (utt0Var == null) {
                            utt0Var = null;
                        }
                        utt0Var.x0(!(arrayList == null || arrayList.isEmpty()));
                        zgb0 zgb0Var = podcastEpisodeFragment.X;
                        if (zgb0Var != null) {
                            zgb0Var.clear();
                        }
                        zgb0 zgb0Var2 = podcastEpisodeFragment.X;
                        if (zgb0Var2 != null) {
                            zgb0Var2.x0(musicTrack3);
                        }
                        podcastEpisodeFragment.s0.clear();
                        ((zkb0) podcastEpisodeFragment.r0.getValue()).clear();
                        podcastEpisodeFragment.no(musicTrack3);
                        podcastEpisodeFragment.mo(PodcastMenuItem.SubscribeToAuthor, podcastPage.d && !jnj.d(musicTrack3.V));
                        PodcastMenuItem podcastMenuItem = PodcastMenuItem.GoToPost;
                        Episode episode2 = musicTrack3.w;
                        String str4 = episode2 != null ? episode2.g : null;
                        podcastEpisodeFragment.mo(podcastMenuItem, !(str4 == null || str4.length() == 0));
                        podcastEpisodeFragment.b0 = podcastEpisodeFragment.Z.contains(PodcastMenuItem.AddToBookFavorites);
                    }
                    podcastEpisodeFragment.b0 = !((xl40) podcastEpisodeFragment.o0.getValue()).isEnabled().getValue().booleanValue();
                    podcastEpisodeFragment.lo();
                }
                mzp0 mzp0Var2 = podcastEpisodeFragment.J;
                if (mzp0Var2 != null) {
                    mzp0Var2.d(podcastEpisodeFragment.getView());
                }
                return new VKList(arrayList);
            case 11:
                afd0 afd0Var = (afd0) obj2;
                FriendsGetFieldsResponseDto friendsGetFieldsResponseDto = (FriendsGetFieldsResponseDto) obj;
                List<UsersUserFullDto> d = friendsGetFieldsResponseDto.d();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = d.iterator();
                while (it2.hasNext()) {
                    String r2 = ((UsersUserFullDto) it2.next()).r2();
                    if (r2 != null) {
                        arrayList4.add(r2);
                    }
                }
                List<UsersUserFullDto> d2 = friendsGetFieldsResponseDto.d();
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = d2.iterator();
                while (it3.hasNext()) {
                    String D0 = ((UsersUserFullDto) it3.next()).D0();
                    if (D0 != null) {
                        arrayList5.add(D0);
                    }
                }
                afd0Var.T(new ffd0.c(new lcd0(friendsGetFieldsResponseDto.getCount(), arrayList4, arrayList5)));
                return s3q0.a;
            case 12:
                ((lb6) obj2).invoke();
                return s3q0.a;
            case 13:
                exd0 exd0Var = (exd0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    exd0Var.c.lo(((FriendsListParams.FriendsList) exd0Var.d).d);
                    cvk.w(y8g0.e(com.vkontakte.android.R.string.lists_friends_delete_success), false);
                }
                return s3q0.a;
            case 14:
                tgi0 tgi0Var = (tgi0) obj;
                int i10 = QuestionsListFragment.f0;
                qgi0.h(tgi0Var, ((CharSequence) obj2).toString());
                qgi0.r(tgi0Var, "toolbar_subtitle");
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((Collection) obj2).contains((zwm0) obj));
            case 16:
                RedesignNotificationSettingsFragment redesignNotificationSettingsFragment = (RedesignNotificationSettingsFragment) obj2;
                qlf0 qlf0Var = redesignNotificationSettingsFragment.V;
                nlf0 nlf0Var = redesignNotificationSettingsFragment.X;
                ?? r5 = redesignNotificationSettingsFragment.Q;
                nh70 nh70Var = (nh70) obj;
                RedesignNotificationSettingsFragment.a aVar = RedesignNotificationSettingsFragment.Y;
                if (nh70Var.equals(nh70.c.a)) {
                    redesignNotificationSettingsFragment.getFeature().C(pf70.b);
                } else if (nh70Var instanceof nh70.h) {
                    redesignNotificationSettingsFragment.getFeature().C(new yf70(((nh70.h) nh70Var).a));
                } else if (nh70Var instanceof nh70.e) {
                    redesignNotificationSettingsFragment.finish();
                } else if (nh70Var instanceof nh70.f) {
                    redesignNotificationSettingsFragment.kn().getSupportFragmentManager().l0("notification_section_status_change", redesignNotificationSettingsFragment.getViewLifecycleOwner(), redesignNotificationSettingsFragment.W);
                    redesignNotificationSettingsFragment.kn().getSupportFragmentManager().l0("UPDATE_SETTING_FROM_SECTION_KEY", redesignNotificationSettingsFragment.getViewLifecycleOwner(), nlf0Var);
                    Context requireContext = redesignNotificationSettingsFragment.requireContext();
                    nh70.f fVar3 = (nh70.f) nh70Var;
                    String str5 = fVar3.a;
                    String str6 = fVar3.b;
                    NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto = fVar3.c;
                    qlf0Var.getClass();
                    if (str5.equals("other")) {
                        g090 g090Var = new g090(RedesignNotificationSettingsFragment.class, null, null);
                        Bundle bundle = g090Var.j;
                        bundle.putString("section_id", str5);
                        bundle.putString("section_title", str6);
                        bundle.putParcelable("section", notificationsNotificationSettingsSectionRedesignDto);
                        g090Var.k(requireContext);
                    } else {
                        b130 b130Var = new b130(NotificationSectionFragment.class, null, null);
                        Bundle bundle2 = b130Var.j;
                        bundle2.putString("section_id", str5);
                        bundle2.putString("section_title", str6);
                        bundle2.putParcelable("section", notificationsNotificationSettingsSectionRedesignDto);
                        b130Var.k(requireContext);
                    }
                } else if (nh70Var.equals(nh70.b.a)) {
                    int e = ((msn) r5.getValue()).e();
                    redesignNotificationSettingsFragment.getFeature().C(new vf70(0));
                    redesignNotificationSettingsFragment.getFeature().e.b(((msn) r5.getValue()).d(((th70) redesignNotificationSettingsFragment.U.getValue(redesignNotificationSettingsFragment, RedesignNotificationSettingsFragment.Z[0])).c()).subscribe(new olf0(), new fs00(new nw4(redesignNotificationSettingsFragment, e, z3 ? 1 : 0), 17)));
                } else if (nh70Var.equals(nh70.d.a)) {
                    redesignNotificationSettingsFragment.getFeature().e.b(((msn) r5.getValue()).a(redesignNotificationSettingsFragment.requireContext()).subscribe(new ca10(new v4w(redesignNotificationSettingsFragment, i6), i7), new j990(new hs00(redesignNotificationSettingsFragment, i4), i3)));
                } else if (nh70Var instanceof nh70.g) {
                    redesignNotificationSettingsFragment.kn().getSupportFragmentManager().l0("notification_setting_status_change", redesignNotificationSettingsFragment.getViewLifecycleOwner(), nlf0Var);
                    Context requireContext2 = redesignNotificationSettingsFragment.requireContext();
                    nh70.g gVar = (nh70.g) nh70Var;
                    String str7 = gVar.a;
                    String str8 = gVar.b;
                    qlf0Var.getClass();
                    qlf0.e(requireContext2, str7, str8);
                } else {
                    if (!(nh70Var instanceof nh70.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    redesignNotificationSettingsFragment.kn().getSupportFragmentManager().k0(yfb.b(new Pair("section", ((nh70.a) nh70Var).a)), "notification_section_status_change");
                }
                return s3q0.a;
            case 17:
                ((gzs) obj2).invoke();
                return s3q0.a;
            case 18:
                shg0 shg0Var = (shg0) obj2;
                tj50.a aVar2 = (tj50.a) obj;
                b810 b810Var = new b810(shg0Var, i6);
                ao8 ao8Var = ao8.d;
                return new uhg0.b(aVar2.a(b810Var, ao8Var), aVar2.a(new h440(shg0Var, i5), ao8Var));
            case 19:
                ((zak0) ((sjg0) obj2).v).setValue((String) obj);
                return s3q0.a;
            case 20:
                ((zak0) ((zph0) obj2).j).setValue((tho0) obj);
                return s3q0.a;
            case 21:
                bei0 bei0Var = (bei0) obj2;
                if (bei0Var.a.i().a(((Long) obj).longValue())) {
                    ((zak0) bei0Var.n).setValue(s3q0.a);
                    bei0Var.m();
                    bei0Var.o();
                }
                return s3q0.a;
            case 22:
                ((ShoppableAdView) obj2).f.setTranslationX(((Float) obj).floatValue());
                return s3q0.a;
            case 23:
                f0l0 f0l0Var = (f0l0) obj2;
                ViewGroup viewGroup2 = (ViewGroup) obj;
                int i11 = k0l0.q;
                return new k0l0(f0l0Var.i, f0l0Var.j, f0l0Var.k, s3j0.b(viewGroup2, com.vkontakte.android.R.layout.vkim_stencil_view_holder, viewGroup2, false));
            case 24:
                sbl0 sbl0Var = (sbl0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    sbl0.a aVar3 = sbl0Var.f;
                    StoryQuestionEntry storyQuestionEntry = sbl0Var.d;
                    aVar3.c(storyQuestionEntry.b, storyQuestionEntry.c);
                    sbl0Var.c(y8g0.e(sbl0Var.a() ? com.vkontakte.android.R.string.story_question_unban_anonym_info : com.vkontakte.android.R.string.story_question_unban_info));
                    sbl0Var.d(sbl0Var.a() ? StoryViewAction.QUESTION_UNBAN_ANONYMOUS_AUTHOR : StoryViewAction.QUESTION_UNBAN_AUTHOR);
                } else {
                    sbl0Var.b();
                }
                return s3q0.a;
            case 25:
                rcl0 rcl0Var = (rcl0) obj2;
                nge0 nge0Var = (nge0) obj;
                if (nge0Var == null) {
                    return s3q0.a;
                }
                String str9 = nge0Var.f;
                String str10 = nge0Var.e;
                if (TextUtils.isEmpty(str10) && TextUtils.isEmpty(str9)) {
                    rcl0Var.b(nge0Var);
                } else {
                    if (str10 != null && str10.length() != 0) {
                        str9 = str10;
                    }
                    rcl0Var.b.ro(str9);
                }
                if (nge0Var.a == 1) {
                    t6g0 t6g0Var = t6g0.b;
                    t6g0.d().A();
                }
                return s3q0.a;
            case 26:
                return j5g.O0(((rsl0) ((zgm0) obj2).c.c.getValue()).a((StoriesGetV5113ResponseDto) obj).c);
            case 27:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.b) obj2).T(new e.b.d((List) obj));
                return s3q0.a;
            case 28:
                SuggestedPostsFragment suggestedPostsFragment = (SuggestedPostsFragment) obj2;
                com.vk.mvi.binder.c cVar2 = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                com.vk.mvi.binder.c.a(cVar2, f9t.w(suggestedPostsFragment.go()), new j4n0((y3n0) suggestedPostsFragment.l0.getValue()));
                com.vk.mvi.binder.c.b(cVar2, f9t.F(f9t.z(suggestedPostsFragment.go()), new n0m0(i8)), new hl30(suggestedPostsFragment, i7));
                return s3q0.a;
            default:
                ((ModalSettingsRowView) obj2).setHint((String) obj);
                return s3q0.a;
        }
    }
}
