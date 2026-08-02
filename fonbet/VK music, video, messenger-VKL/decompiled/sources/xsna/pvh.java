package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayoutWithFixedTouches;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.dialogslist.impl.DialogsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.offline.ui.presentation.MusicDownloadsSettingsFragment;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vk.profile.community.members.api.CommunityMembersFilter;
import com.vk.profile.community.members.impl.ui.MviMembersListFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import com.vkontakte.android.R;
import com.vkontakte.android.data.DonutAnalytics;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.h0k0;
import xsna.p060;
import xsna.s1c0;
import xsna.u4a;
import xsna.vvh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pvh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pvh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v81, types: [android.os.Parcelable] */
    @Override // xsna.gzs
    public final Object invoke() {
        RecyclerView recyclerView;
        int i;
        ExposedFunction invoke$lambda$48;
        Object failure;
        JSONObject g;
        Object obj;
        Object parcelable;
        Object obj2;
        Object serializable;
        boolean z = true;
        switch (this.b) {
            case 0:
                vvh vvhVar = (vvh) this.c;
                s1c0.a aVar = new s1c0.a();
                aVar.x = true;
                aVar.n = false;
                aVar.o = true;
                aVar.z = vvhVar.b;
                sf2 sf2Var = new sf2();
                sf2Var.b = vvhVar.m.d.mo2getContext();
                aVar.s = sf2Var.a();
                WallGetMode wallGetMode = vvhVar.e;
                int i2 = vvh.b.$EnumSwitchMapping$0[wallGetMode.ordinal()];
                if (i2 == 1) {
                    r4 = DonutAnalytics.DonutCustomTeaserScreen.DONUT_CONTENT_WALL;
                } else if (i2 == 2) {
                    r4 = DonutAnalytics.DonutCustomTeaserScreen.DONUT_CONTENT_PAYWALL;
                }
                aVar.A = r4;
                aVar.p = wallGetMode == WallGetMode.MAIN;
                return aVar.a();
            case 1:
                DialogsFragment dialogsFragment = (DialogsFragment) this.c;
                int i3 = dialogsFragment.Z;
                dialogsFragment.Z = i3;
                View view = dialogsFragment.getView();
                if (view != null && (recyclerView = (RecyclerView) view.findViewById(R.id.dialogs_recycler_view)) != null) {
                    Integer num = dialogsFragment.a0;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        int paddingBottom = recyclerView.getPaddingBottom();
                        dialogsFragment.a0 = Integer.valueOf(paddingBottom);
                        i = paddingBottom;
                    }
                    h48.a(recyclerView, i, i3, iah0.a(16));
                }
                return s3q0.a;
            case 2:
                gzs<s3q0> gzsVar = ((l1o) this.c).l;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 3:
                DzenArticleFragment dzenArticleFragment = (DzenArticleFragment) this.c;
                qcy<Object>[] qcyVarArr = DzenArticleFragment.R;
                return new xxs(dzenArticleFragment.getActivity());
            case 4:
                final com.vk.auth.enterphone.a aVar2 = (com.vk.auth.enterphone.a) this.c;
                return new p3a0() { // from class: xsna.epp
                    @Override // xsna.p3a0
                    public final void a() {
                        com.vk.auth.enterphone.a.this.F = true;
                        com.vk.registration.funnels.b.a.getClass();
                        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PHONE_REUSE_REQUESTED, null, null, null, null, null, null, 254);
                    }
                };
            case 5:
                mqp mqpVar = (mqp) this.c;
                return new hs60(Collections.singleton(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_DIGEST_DZEN)), new rvh(mqpVar, z ? 1 : 0), msy.a(LazyThreadSafetyMode.NONE, new atm(mqpVar, 3)));
            case 6:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) this.c;
                qcy<Object>[] qcyVarArr2 = FaveFeedFragment.s0;
                return m7m.d(faveFeedFragment);
            case 7:
                ((com.vk.attachpicker.fragment.gallery.c) this.c).d.invoke(Integer.valueOf(R.string.story_picker_max_items_message), null);
                vvr0.b(150, 75L);
                return s3q0.a;
            case 8:
                return ((y4u) this.c).c.dc();
            case 9:
                x7u x7uVar = (x7u) this.c;
                u7u u7uVar = x7uVar.o;
                if (u7uVar != null) {
                    x7uVar.l.f(u7uVar.b);
                }
                return s3q0.a;
            case 10:
                invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48((HandleInvocationsFromAdViewer) this.c);
                return invoke$lambda$48;
            case 11:
                ibx ibxVar = (ibx) this.c;
                return new xnt0(ibxVar.e().getView().getRootView(), e43.m(ibxVar.e().q3()), EmptyList.b, new jbx(ibxVar), true, true, true);
            case 12:
                u200 u200Var = (u200) this.c;
                try {
                    SakFeatures.Type type = SakFeatures.Type.LOGOUT_DEBOUNCE;
                    if (type.h()) {
                        SakFeatures.b.getClass();
                        ToggleManager toggleManager = SakFeatures.c;
                        toggleManager.getClass();
                        b.d j = toggleManager.j(type.getKey(), false);
                        if (j != null && (g = j.g()) != null) {
                            JSONArray optJSONArray = g.optJSONArray("illnessReasons");
                            failure = new i2l(g.optLong("debounceMillis", 0L), optJSONArray != null ? f370.O(optJSONArray) : EmptyList.b);
                        }
                        return new jrj0();
                    }
                    failure = new jrj0();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    u200Var.c.a(pn00.k(new Pair("key", "analytics_delegate"), new Pair("stacktrace", mnh0.A(a))));
                }
                jrj0 jrj0Var = new jrj0();
                if (failure instanceof Result.Failure) {
                    failure = jrj0Var;
                }
                return (r200) failure;
            case 13:
                ((df00) this.c).b(h0k0.f.a);
                return s3q0.a;
            case 14:
                a410 a410Var = (a410) this.c;
                return a410Var.O(new r210(a410Var.k, a410Var.l, a410Var.g));
            case 15:
                return (VkHealthPermissionsComponent) ((k7m) m7m.f((pr20) this.c)).a(fpf0.a(VkHealthPermissionsComponent.class));
            case 16:
                fv20 fv20Var = (fv20) this.c;
                int i4 = fv20.C1;
                return ((SessionManagementComponent) ((k7m) m7m.f(fv20Var)).a(fpf0.a(SessionManagementComponent.class))).J2();
            case 17:
                ModalPostDonutFragment modalPostDonutFragment = (ModalPostDonutFragment) this.c;
                int i5 = ModalPostDonutFragment.W;
                Bundle arguments = modalPostDonutFragment.getArguments();
                if (arguments == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable("ARG_AUTHOR_UID", UserId.class);
                    obj = (Parcelable) parcelable;
                } else {
                    ?? parcelable2 = arguments.getParcelable("ARG_AUTHOR_UID");
                    obj = (UserId) (parcelable2 instanceof UserId ? parcelable2 : null);
                }
                return (UserId) obj;
            case 18:
                MotionLayoutWithFixedTouches motionLayoutWithFixedTouches = (MotionLayoutWithFixedTouches) this.c;
                int i6 = MotionLayoutWithFixedTouches.O0;
                return motionLayoutWithFixedTouches.getTouchProcessor().e;
            case 19:
                ym30 ym30Var = ((vm30) this.c).t0;
                if (ym30Var != null) {
                    ym30Var.s0();
                }
                return s3q0.a;
            case 20:
                return new fk30(((cu30) this.c).e);
            case 21:
                u4a u4aVar = ((MusicArtistCatalogRootVh) this.c).m;
                u4a.a aVar3 = u4aVar.b;
                if (aVar3.c) {
                    return null;
                }
                return new zc40(aVar3.s.U(), aVar3.s.K(u4aVar), aVar3.e);
            case 22:
                return ((MusicAnalyticsComponent) ((k7m) m7m.f((MusicCatalogRootVh) this.c)).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 23:
                MusicDownloadsSettingsFragment musicDownloadsSettingsFragment = (MusicDownloadsSettingsFragment) this.c;
                qcy<Object>[] qcyVarArr3 = MusicDownloadsSettingsFragment.P;
                return (OfflineAudioComponent) m7m.d(musicDownloadsSettingsFragment).a(fpf0.a(OfflineAudioComponent.class));
            case 24:
                return new hs90(new fi90((du70) this.c, new cwa0(new jkl(), new bkl(), new tml())));
            case 25:
                return ((hx40) this.c).j;
            case 26:
                MusicSubscriptionControlFragment musicSubscriptionControlFragment = (MusicSubscriptionControlFragment) this.c;
                int i7 = MusicSubscriptionControlFragment.a0;
                return new ht8((oge0) musicSubscriptionControlFragment.T.getValue());
            case 27:
                yc50 yc50Var = (yc50) this.c;
                int i8 = yc50.x1;
                return ((DataRepositoryComponent) m7m.d(yc50Var).a(fpf0.a(DataRepositoryComponent.class))).D();
            case 28:
                MviMembersListFragment mviMembersListFragment = (MviMembersListFragment) this.c;
                MviMembersListFragment.a aVar4 = MviMembersListFragment.T;
                Bundle requireArguments = mviMembersListFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = requireArguments.getSerializable("filter", CommunityMembersFilter.class);
                    obj2 = serializable;
                } else {
                    ?? serializable2 = requireArguments.getSerializable("filter");
                    obj2 = (CommunityMembersFilter) (serializable2 instanceof CommunityMembersFilter ? serializable2 : null);
                }
                if (obj2 != null) {
                    return (CommunityMembersFilter) obj2;
                }
                throw new IllegalStateException("Required value was null.");
            default:
                return new p060.b((View) this.c);
        }
    }

    public /* synthetic */ pvh(p060 p060Var, View view) {
        this.b = 29;
        this.c = view;
    }
}
