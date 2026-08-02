package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.UserProfile;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vk.stat.scheme.CommonProfileStat$ContentTabsEvent;
import com.vk.stat.scheme.CommonProfileStat$ContentType;
import com.vk.stat.scheme.CommonProfileStat$WatchingContentEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AnotherUserProfileEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AvatarEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$CoverEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$EditProfileEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$OnboardingEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$PublishingEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$QrProfileEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$ServiceItem;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$ServicesEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$TypeProfileItem;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$UserDetailInfoEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$UserMenuEvent;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.gs90;
import xsna.lyd0;

/* compiled from: ProfileMetricsCollectorImpl.kt */
/* loaded from: classes5.dex */
public final class nyd0 implements lyd0 {
    public final bpn0 a = new bpn0(new ln20(this, 20));
    public final bpn0 b = new bpn0(new zf20(this, 25));
    public final bpn0 c = new bpn0(new hj60(this, 17));
    public final bpn0 d = new bpn0(new f550(this, 18));
    public final bpn0 e = new bpn0(new wzb0(this, 5));
    public final bpn0 f = new bpn0(new ag20(this, 25));
    public final bpn0 g = new bpn0(new e550(this, 15));
    public final bpn0 h = new bpn0(new s6y(this, 26));
    public final bpn0 i = new bpn0(new rka0(this, 6));
    public final bpn0 j = new bpn0(new iia0(this, 11));
    public final bpn0 k = new bpn0(new lbc0(this, 5));
    public final bpn0 l = new bpn0(new myd0(this, 0));
    public final bpn0 m = new bpn0(new pr6(28));
    public p n;

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class a {
        public a() {
        }

        public final void a(MobileOfficialAppsProfileStat$AnotherUserProfileEvent.AnotherUserProfileEventType anotherUserProfileEventType, MobileOfficialAppsProfileStat$AnotherUserProfileEvent.ContentSubscriptionType contentSubscriptionType) {
            nyd0.o(nyd0.this, new f(null, null, null, null, null, null, null, new MobileOfficialAppsProfileStat$AnotherUserProfileEvent(anotherUserProfileEventType, contentSubscriptionType), null, null, null, null, 3967));
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class b {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType anotherUserProfileMenuEventType, Long l) {
            nyd0.o(nyd0.this, new f(null, null, null, null, null, null, null, null, new MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent(anotherUserProfileMenuEventType, new MobileOfficialAppsProfileStat$ServiceItem(l, null, 2, 0 == true ? 1 : 0)), null, null, null, 3839));
        }

        public final void b(long j) {
            a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.CLICK_TO_APP_BUTTON, Long.valueOf(j));
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class c {
        public c() {
        }

        public final void a(MobileOfficialAppsProfileStat$AvatarEvent.AvatarEventType avatarEventType, String str) {
            nyd0.o(nyd0.this, new f(null, null, null, null, new MobileOfficialAppsProfileStat$AvatarEvent(avatarEventType, str), null, null, null, null, null, null, null, 4079));
        }

        public final void b() {
            a(MobileOfficialAppsProfileStat$AvatarEvent.AvatarEventType.CHANGE_AVATAR, null);
        }

        public final void c() {
            a(MobileOfficialAppsProfileStat$AvatarEvent.AvatarEventType.CLICK_TO_AVATAR, null);
        }

        public final void d() {
            a(MobileOfficialAppsProfileStat$AvatarEvent.AvatarEventType.DELETE_AVATAR, null);
        }

        public final void e(String str) {
            a(MobileOfficialAppsProfileStat$AvatarEvent.AvatarEventType.SAVE_AVATAR, str);
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class d {
        public d() {
        }

        public static void a(d dVar, MobileOfficialAppsProfileStat$CoverEvent.CoverEventType coverEventType) {
            nyd0.o(nyd0.this, new f(new MobileOfficialAppsProfileStat$CoverEvent(coverEventType, null, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, 4094));
        }

        public final void b() {
            a(this, MobileOfficialAppsProfileStat$CoverEvent.CoverEventType.COVER_FROM_CAMERA);
        }

        public final void c() {
            a(this, MobileOfficialAppsProfileStat$CoverEvent.CoverEventType.COVER_FROM_GALLERY);
        }

        public final void d(boolean z) {
            nyd0.o(nyd0.this, new f(new MobileOfficialAppsProfileStat$CoverEvent(MobileOfficialAppsProfileStat$CoverEvent.CoverEventType.PREVIEW_MODE_CHANGE, null, z ? MobileOfficialAppsProfileStat$CoverEvent.PreviewMode.SMARTPHONE : MobileOfficialAppsProfileStat$CoverEvent.PreviewMode.DESKTOP, 2, null), null, null, null, null, null, null, null, null, null, null, null, 4094));
        }

        public final void e() {
            a(this, MobileOfficialAppsProfileStat$CoverEvent.CoverEventType.SAVE_COVER);
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class e {
        public e() {
        }

        public static void b(e eVar, MobileOfficialAppsProfileStat$EditProfileEvent.EditProfileEvent editProfileEvent, MobileOfficialAppsProfileStat$EditProfileEvent.ChangedParameter changedParameter, String str, int i) {
            nyd0.o(nyd0.this, new f(null, null, null, new MobileOfficialAppsProfileStat$EditProfileEvent(editProfileEvent, (i & 4) == 0 ? str : null, (i & 2) != 0 ? null : changedParameter), null, null, null, null, null, null, null, null, 4087));
        }

        public final void a(MobileOfficialAppsProfileStat$EditProfileEvent.ChangedParameter changedParameter) {
            b(this, MobileOfficialAppsProfileStat$EditProfileEvent.EditProfileEvent.CHANGE_INFO, changedParameter, null, 4);
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public static final class f {
        public final MobileOfficialAppsProfileStat$CoverEvent a;
        public final MobileOfficialAppsProfileStat$OnboardingEvent b;
        public final MobileOfficialAppsProfileStat$UserMenuEvent c;
        public final MobileOfficialAppsProfileStat$EditProfileEvent d;
        public final MobileOfficialAppsProfileStat$AvatarEvent e;
        public final MobileOfficialAppsProfileStat$ServicesEvent f;
        public final MobileOfficialAppsProfileStat$PublishingEvent g;
        public final MobileOfficialAppsProfileStat$AnotherUserProfileEvent h;
        public final MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent i;
        public final CommonProfileStat$WatchingContentEvent j;
        public final MobileOfficialAppsProfileStat$UserDetailInfoEvent k;
        public final CommonProfileStat$ContentTabsEvent l;

        public f(MobileOfficialAppsProfileStat$CoverEvent mobileOfficialAppsProfileStat$CoverEvent, MobileOfficialAppsProfileStat$OnboardingEvent mobileOfficialAppsProfileStat$OnboardingEvent, MobileOfficialAppsProfileStat$UserMenuEvent mobileOfficialAppsProfileStat$UserMenuEvent, MobileOfficialAppsProfileStat$EditProfileEvent mobileOfficialAppsProfileStat$EditProfileEvent, MobileOfficialAppsProfileStat$AvatarEvent mobileOfficialAppsProfileStat$AvatarEvent, MobileOfficialAppsProfileStat$ServicesEvent mobileOfficialAppsProfileStat$ServicesEvent, MobileOfficialAppsProfileStat$PublishingEvent mobileOfficialAppsProfileStat$PublishingEvent, MobileOfficialAppsProfileStat$AnotherUserProfileEvent mobileOfficialAppsProfileStat$AnotherUserProfileEvent, MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent, CommonProfileStat$WatchingContentEvent commonProfileStat$WatchingContentEvent, MobileOfficialAppsProfileStat$UserDetailInfoEvent mobileOfficialAppsProfileStat$UserDetailInfoEvent, CommonProfileStat$ContentTabsEvent commonProfileStat$ContentTabsEvent, int i) {
            mobileOfficialAppsProfileStat$CoverEvent = (i & 1) != 0 ? null : mobileOfficialAppsProfileStat$CoverEvent;
            mobileOfficialAppsProfileStat$OnboardingEvent = (i & 2) != 0 ? null : mobileOfficialAppsProfileStat$OnboardingEvent;
            mobileOfficialAppsProfileStat$UserMenuEvent = (i & 4) != 0 ? null : mobileOfficialAppsProfileStat$UserMenuEvent;
            mobileOfficialAppsProfileStat$EditProfileEvent = (i & 8) != 0 ? null : mobileOfficialAppsProfileStat$EditProfileEvent;
            mobileOfficialAppsProfileStat$AvatarEvent = (i & 16) != 0 ? null : mobileOfficialAppsProfileStat$AvatarEvent;
            mobileOfficialAppsProfileStat$ServicesEvent = (i & 32) != 0 ? null : mobileOfficialAppsProfileStat$ServicesEvent;
            mobileOfficialAppsProfileStat$PublishingEvent = (i & 64) != 0 ? null : mobileOfficialAppsProfileStat$PublishingEvent;
            mobileOfficialAppsProfileStat$AnotherUserProfileEvent = (i & 128) != 0 ? null : mobileOfficialAppsProfileStat$AnotherUserProfileEvent;
            mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent = (i & 256) != 0 ? null : mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent;
            commonProfileStat$WatchingContentEvent = (i & 512) != 0 ? null : commonProfileStat$WatchingContentEvent;
            mobileOfficialAppsProfileStat$UserDetailInfoEvent = (i & 1024) != 0 ? null : mobileOfficialAppsProfileStat$UserDetailInfoEvent;
            commonProfileStat$ContentTabsEvent = (i & 2048) != 0 ? null : commonProfileStat$ContentTabsEvent;
            this.a = mobileOfficialAppsProfileStat$CoverEvent;
            this.b = mobileOfficialAppsProfileStat$OnboardingEvent;
            this.c = mobileOfficialAppsProfileStat$UserMenuEvent;
            this.d = mobileOfficialAppsProfileStat$EditProfileEvent;
            this.e = mobileOfficialAppsProfileStat$AvatarEvent;
            this.f = mobileOfficialAppsProfileStat$ServicesEvent;
            this.g = mobileOfficialAppsProfileStat$PublishingEvent;
            this.h = mobileOfficialAppsProfileStat$AnotherUserProfileEvent;
            this.i = mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent;
            this.j = commonProfileStat$WatchingContentEvent;
            this.k = mobileOfficialAppsProfileStat$UserDetailInfoEvent;
            this.l = commonProfileStat$ContentTabsEvent;
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class g {
        public g() {
            throw null;
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class h implements lyd0.a {
        public h() {
        }

        @Override // xsna.lyd0.a
        public final void a() {
            d(MobileOfficialAppsProfileStat$OnboardingEvent.OnboardingEventType.CLICK_TO_NEW_PROFILE, null);
        }

        @Override // xsna.lyd0.a
        public final void b(int i) {
            d(MobileOfficialAppsProfileStat$OnboardingEvent.OnboardingEventType.POPUP_HIDE, Integer.valueOf(i));
        }

        @Override // xsna.lyd0.a
        public final void c(int i) {
            d(MobileOfficialAppsProfileStat$OnboardingEvent.OnboardingEventType.POPUP_NEXT, Integer.valueOf(i));
        }

        public final void d(MobileOfficialAppsProfileStat$OnboardingEvent.OnboardingEventType onboardingEventType, Integer num) {
            nyd0.o(nyd0.this, new f(null, new MobileOfficialAppsProfileStat$OnboardingEvent(onboardingEventType, null, num, null, 10, null), null, null, null, null, null, null, null, null, null, null, 4093));
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class i {
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class j {
        public j() {
        }

        public final void a(MobileOfficialAppsProfileStat$PublishingEvent.PublishingEventType publishingEventType) {
            nyd0.o(nyd0.this, new f(null, null, null, null, null, null, new MobileOfficialAppsProfileStat$PublishingEvent(publishingEventType), null, null, null, null, null, 4031));
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class k {
        public k() {
        }

        public final void a(long j, MobileOfficialAppsProfileStat$ServiceItem.NativeServiceType nativeServiceType) {
            b(MobileOfficialAppsProfileStat$ServicesEvent.ServicesEventType.OPEN_SERVICE, Long.valueOf(j), nativeServiceType);
        }

        public final void b(MobileOfficialAppsProfileStat$ServicesEvent.ServicesEventType servicesEventType, Long l, MobileOfficialAppsProfileStat$ServiceItem.NativeServiceType nativeServiceType) {
            nyd0.o(nyd0.this, new f(null, null, null, null, null, new MobileOfficialAppsProfileStat$ServicesEvent(servicesEventType, new MobileOfficialAppsProfileStat$ServiceItem(l, nativeServiceType)), null, null, null, null, null, null, 4063));
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class l {
        public l() {
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class m {
        public m() {
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class n {
        public n() {
        }

        public final void a() {
            e(MobileOfficialAppsProfileStat$UserMenuEvent.UserMenuEventType.CLICK_TO_CHANGE_COVER);
        }

        public final void b() {
            e(MobileOfficialAppsProfileStat$UserMenuEvent.UserMenuEventType.CLICK_TO_DOTS);
        }

        public final void c() {
            e(MobileOfficialAppsProfileStat$UserMenuEvent.UserMenuEventType.CLICK_TO_MEMORIES);
        }

        public final void d() {
            e(MobileOfficialAppsProfileStat$UserMenuEvent.UserMenuEventType.COPY_LINK);
        }

        public final void e(MobileOfficialAppsProfileStat$UserMenuEvent.UserMenuEventType userMenuEventType) {
            nyd0.o(nyd0.this, new f(null, null, new MobileOfficialAppsProfileStat$UserMenuEvent(userMenuEventType), null, null, null, null, null, null, null, null, null, 4091));
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public final class o {
        public o() {
        }

        public final void a(CommonProfileStat$WatchingContentEvent.WatchingContentEventType watchingContentEventType, CommonProfileStat$ContentType commonProfileStat$ContentType) {
            nyd0.o(nyd0.this, new f(null, null, null, null, null, null, null, null, null, new CommonProfileStat$WatchingContentEvent(watchingContentEventType, commonProfileStat$ContentType), null, null, 3583));
        }
    }

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public static final class p extends lyd0.b {
    }

    public nyd0() {
        new bpn0(new xu0(29));
    }

    public static final void o(nyd0 nyd0Var, f fVar) {
        p pVar = nyd0Var.n;
        if (pVar == null) {
            return;
        }
        boolean z = false;
        MobileOfficialAppsProfileStat$QrProfileEvent mobileOfficialAppsProfileStat$QrProfileEvent = null;
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsProfileStat$TypeProfileItem(pVar.a, pVar.b, pVar.c, pVar.d, pVar.e, z, pVar.f, pVar.g, pVar.h, pVar.i, pVar.j, fVar.a, fVar.b, fVar.c, mobileOfficialAppsProfileStat$QrProfileEvent, fVar.d, fVar.e, fVar.f, fVar.g, fVar.h, fVar.i, fVar.j, fVar.l, fVar.k, null, 16793600, null), 2);
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), b2).q();
    }

    public static ArrayList p(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (epx.f(((ytd0) obj).b, ProfileAction.Type.OPEN_APP.h())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ytd0) next).d != null) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((ytd0) next2).d instanceof gs90.a) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Long.valueOf(((gs90.a) ((ytd0) it3.next()).d).a.b));
        }
        return arrayList4;
    }

    @Override // xsna.lyd0
    public final b a() {
        return (b) this.i.getValue();
    }

    @Override // xsna.lyd0
    public final l b() {
        return (l) this.l.getValue();
    }

    @Override // xsna.lyd0
    public final j c() {
        return (j) this.g.getValue();
    }

    @Override // xsna.lyd0
    public final m d() {
        return (m) this.k.getValue();
    }

    @Override // xsna.lyd0
    public final g e() {
        return (g) this.m.getValue();
    }

    @Override // xsna.lyd0
    public final d f() {
        return (d) this.a.getValue();
    }

    @Override // xsna.lyd0
    public final e g() {
        return (e) this.d.getValue();
    }

    @Override // xsna.lyd0
    public final k h() {
        return (k) this.f.getValue();
    }

    @Override // xsna.lyd0
    public final h i() {
        return (h) this.b.getValue();
    }

    @Override // xsna.lyd0
    public final n j() {
        return (n) this.c.getValue();
    }

    @Override // xsna.lyd0
    public final c k() {
        return (c) this.e.getValue();
    }

    @Override // xsna.lyd0
    public final void l(ExtendedUserProfile extendedUserProfile) {
        UserId userId;
        Collection collection;
        ArrayList arrayList;
        UserId userId2;
        List<ytd0> list;
        UserProfile userProfile = extendedUserProfile.a;
        if (userProfile == null || (userId = userProfile.c) == null) {
            return;
        }
        long j2 = userId.b;
        boolean e2 = extendedUserProfile.e();
        boolean z = userProfile.B.b;
        boolean z2 = extendedUserProfile.n0;
        boolean z3 = extendedUserProfile.A1;
        ImageStatus imageStatus = userProfile.R;
        Integer valueOf = imageStatus != null ? Integer.valueOf(imageStatus.b) : null;
        String str = extendedUserProfile.g1;
        boolean z4 = !(str == null || drm0.N(str));
        int i2 = extendedUserProfile.a1;
        MobileOfficialAppsProfileStat$TypeProfileItem.IsUsersFriend isUsersFriend = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? MobileOfficialAppsProfileStat$TypeProfileItem.IsUsersFriend.NONE : MobileOfficialAppsProfileStat$TypeProfileItem.IsUsersFriend.FRIEND : MobileOfficialAppsProfileStat$TypeProfileItem.IsUsersFriend.RECEIVE_REQUEST : MobileOfficialAppsProfileStat$TypeProfileItem.IsUsersFriend.SEND_REQUEST : MobileOfficialAppsProfileStat$TypeProfileItem.IsUsersFriend.NONE;
        ArrayList arrayList2 = extendedUserProfile.M1;
        if (arrayList2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                xtd0 xtd0Var = (xtd0) obj;
                List<ytd0> list2 = xtd0Var != null ? xtd0Var.a : null;
                if (list2 != null && !list2.isEmpty()) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(p(((xtd0) it.next()).a));
            }
            collection = c5g.v(arrayList4);
        } else {
            collection = EmptyList.b;
        }
        xtd0 xtd0Var2 = extendedUserProfile.N1;
        Iterable p2 = (xtd0Var2 == null || (list = xtd0Var2.a) == null) ? EmptyList.b : p(list);
        List singletonList = Collections.singletonList(MobileOfficialAppsProfileStat$ServiceItem.NativeServiceType.QUESTIONS);
        ArrayList arrayList5 = new ArrayList(c5g.u(singletonList, 10));
        Iterator it2 = singletonList.iterator();
        while (it2.hasNext()) {
            oyd0.a((MobileOfficialAppsProfileStat$ServiceItem.NativeServiceType) it2.next());
            arrayList5.add(-1L);
        }
        ArrayList u0 = j5g.u0(arrayList5, j5g.u0(p2, collection));
        ExtendedUserProfile.f[] fVarArr = extendedUserProfile.x1;
        if (fVarArr != null) {
            ArrayList arrayList6 = new ArrayList();
            for (ExtendedUserProfile.f fVar : fVarArr) {
                ApiApplication apiApplication = fVar.f;
                Long valueOf2 = (apiApplication == null || (userId2 = apiApplication.b) == null) ? null : Long.valueOf(userId2.b);
                if (valueOf2 != null) {
                    arrayList6.add(valueOf2);
                }
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        this.n = new p(j2, e2, z, z2, z3, valueOf, Boolean.valueOf(z4), isUsersFriend, u0, arrayList);
    }

    @Override // xsna.lyd0
    public final a m() {
        return (a) this.h.getValue();
    }

    @Override // xsna.lyd0
    public final o n() {
        return (o) this.j.getValue();
    }
}
