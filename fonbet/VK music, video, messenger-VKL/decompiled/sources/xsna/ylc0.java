package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.VkPaginationList;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.posting.SettingsPostingContract$Mode;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.DonutSettingsDialogConfig;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.community.PostingSettingsCommunityView;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.user.PostingSettingsUserView;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.bmc0;
import xsna.dmc0;
import xsna.fhc0;

/* compiled from: PostingSettingsPresenterNew.kt */
/* loaded from: classes4.dex */
public final class ylc0 implements c3j0, w8i {
    public final qdc0 b;
    public final dmc0 c;
    public PostingMetricsCreationEntryPoint d = PostingMetricsCreationEntryPoint.Other;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public final Object f;
    public final bpn0 g;
    public SettingsPostingContract$Mode h;
    public final Object i;
    public final Object j;

    /* compiled from: PostingSettingsPresenterNew.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingsPostingContract$Mode.values().length];
            try {
                iArr[SettingsPostingContract$Mode.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingsPostingContract$Mode.Community.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ylc0(qdc0 qdc0Var, dmc0 dmc0Var) {
        this.b = qdc0Var;
        this.c = dmc0Var;
        rf20 rf20Var = new rf20(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, rf20Var);
        this.g = new bpn0(new hk70(this, 9));
        this.i = msy.a(lazyThreadSafetyMode, new by20(this, 18));
        this.j = msy.a(lazyThreadSafetyMode, new b410(this, 17));
    }

    @Override // xsna.b3j0
    public final void G3(List<ProfileFriendItem> list) {
        g().k = list;
    }

    @Override // xsna.b3j0
    public final void H0(int i) {
        Object obj;
        xch b = b();
        Iterator<T> it = b.d.B6().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((DonutPostingSettings.Duration) obj).b == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        DonutPostingSettings.Duration duration = (DonutPostingSettings.Duration) obj;
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.b) {
                zif0Var = PostingSettingsCommunityItem.b.d((PostingSettingsCommunityItem.b) zif0Var, DonutSettingsDialogConfig.Mode.Dones, duration, false, false, false, 28);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void K5() {
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.b) {
                zif0Var = PostingSettingsCommunityItem.b.d((PostingSettingsCommunityItem.b) zif0Var, null, null, false, false, false, 27);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void L6(boolean z) {
        mlq0 g = g();
        bmc0 bmc0Var = g.g;
        g.b(bmc0.a(bmc0Var, null, bmc0.a.a(bmc0Var.b, false, z, 1), 1), true);
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.d) {
                PostingSettingsCommunityItem.d dVar = (PostingSettingsCommunityItem.d) zif0Var;
                boolean z2 = dVar.c;
                dVar.getClass();
                zif0Var = new PostingSettingsCommunityItem.d(z, z2);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void M3() {
        mlq0 g = g();
        bmc0 bmc0Var = g.g;
        g.b(bmc0.a(bmc0Var, bmc0.b.a(bmc0Var.a, false, PostingVisibilityMode.FRIENDS, 3), null, 2), true);
    }

    @Override // xsna.b3j0
    public final void M5(boolean z) {
        mlq0 g = g();
        bmc0 bmc0Var = g.g;
        g.b(bmc0.a(bmc0Var, bmc0.b.a(bmc0Var.a, z, null, 5), null, 2), true);
    }

    @Override // xsna.b3j0
    public final void N1(boolean z) {
        boolean z2;
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.b) {
                z2 = z;
                zif0Var = PostingSettingsCommunityItem.b.d((PostingSettingsCommunityItem.b) zif0Var, null, null, z2, false, false, 27);
            } else {
                z2 = z;
            }
            arrayList.add(zif0Var);
            z = z2;
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void P5() {
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.a) {
                zif0Var = PostingSettingsCommunityItem.a.d((PostingSettingsCommunityItem.a) zif0Var, true, false, false, 6);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.c3j0
    public final void Q(PostingVisibilityMode postingVisibilityMode) {
        this.b.Q(postingVisibilityMode);
    }

    @Override // xsna.b3j0
    public final boolean Q4() {
        return g().l;
    }

    @Override // xsna.b3j0
    public final void R0() {
        mlq0 g = g();
        bmc0 bmc0Var = g.g;
        g.b(bmc0.a(bmc0Var, bmc0.b.a(bmc0Var.a, false, PostingVisibilityMode.BEST_FRIENDS, 3), null, 2), true);
    }

    @Override // xsna.b3j0
    public final void R6() {
        Context context;
        mlq0 g = g();
        if (g.i == null) {
            dmc0 dmc0Var = g.c;
            io.reactivex.rxjava3.core.q y0 = rsg0.y0(new eos(), null, null, 3);
            PostingSettingsUserView postingSettingsUserView = dmc0Var.h;
            if (postingSettingsUserView != null && (context = postingSettingsUserView.getContext()) != null) {
                y0 = hg1.m(y0, context, 0L, false, 62);
            }
            y0.subscribe(new d750(new hb40(g, 28), 24), new ox80(new l140(23), 16));
        } else {
            g.a();
        }
        g.l = true;
        jbc0 jbc0Var = g.d;
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0Var.g();
    }

    @Override // xsna.b3j0
    public final void S6(List<ListFriends> list) {
        g().j = list;
    }

    @Override // xsna.b3j0
    public final void T0() {
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.a) {
                zif0Var = PostingSettingsCommunityItem.a.d((PostingSettingsCommunityItem.a) zif0Var, false, false, false, 3);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void V6(boolean z) {
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.a) {
                zif0Var = PostingSettingsCommunityItem.a.d((PostingSettingsCommunityItem.a) zif0Var, false, !z, false, 5);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void Z4(boolean z) {
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.a) {
                zif0Var = PostingSettingsCommunityItem.a.d((PostingSettingsCommunityItem.a) zif0Var, false, false, z, 3);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final xch b() {
        return (xch) this.j.getValue();
    }

    @Override // xsna.b3j0
    public final void e1(Date date) {
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.c) {
                zif0Var = PostingSettingsCommunityItem.c.d((PostingSettingsCommunityItem.c) zif0Var, date, false, 2);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final mlq0 g() {
        return (mlq0) this.i.getValue();
    }

    public final void g2() {
        ((fhc0.e) this.g.getValue()).h(this.d);
        this.b.g2();
    }

    @Override // xsna.b3j0
    public final void hide() {
        PostingSettingsCommunityView postingSettingsCommunityView;
        SettingsPostingContract$Mode settingsPostingContract$Mode = this.h;
        int i = settingsPostingContract$Mode == null ? -1 : a.$EnumSwitchMapping$0[settingsPostingContract$Mode.ordinal()];
        if (i == 1) {
            g().c.c(false);
        } else if (i == 2 && (postingSettingsCommunityView = b().a.i) != null) {
            bwt0.p0(postingSettingsCommunityView, false);
        }
    }

    @Override // xsna.b3j0
    public final void j2(boolean z) {
        boolean z2;
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.b) {
                z2 = z;
                zif0Var = PostingSettingsCommunityItem.b.d((PostingSettingsCommunityItem.b) zif0Var, null, null, false, z2, false, 23);
            } else {
                z2 = z;
            }
            arrayList.add(zif0Var);
            z = z2;
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void k2(boolean z) {
        mlq0 g = g();
        bmc0 bmc0Var = g.g;
        g.b(bmc0.a(bmc0Var, null, bmc0.a.a(bmc0Var.b, z, false, 2), 1), true);
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.d) {
                PostingSettingsCommunityItem.d dVar = (PostingSettingsCommunityItem.d) zif0Var;
                boolean z2 = dVar.b;
                dVar.getClass();
                zif0Var = new PostingSettingsCommunityItem.d(z2, z);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.c3j0
    public final PostingVisibilityMode o0() {
        return this.b.o0();
    }

    @Override // xsna.b3j0
    public final void o2() {
        mlq0 g = g();
        bmc0 bmc0Var = g.g;
        g.b(bmc0.a(bmc0Var, bmc0.b.a(bmc0Var.a, false, PostingVisibilityMode.ALL, 3), null, 2), true);
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.ik6
    public final void onStart() {
        mlq0 g = g();
        g.getClass();
        g.f.b(hg1.h(ysg0.b.a.b0(ywd0.class).a0(asu0.a.d()), new mvl0(g, 5)));
        g.c.b(g.g);
        b().b();
    }

    @Override // xsna.b3j0
    public final void p1(VkPaginationList<ProfileFriendItem> vkPaginationList) {
        g().i = vkPaginationList;
    }

    @Override // xsna.b3j0
    public final void q1(SettingsPostingContract$Mode settingsPostingContract$Mode) {
        View view;
        if (this.h == null) {
            this.h = settingsPostingContract$Mode;
            int i = dmc0.a.$EnumSwitchMapping$0[settingsPostingContract$Mode.ordinal()];
            dmc0 dmc0Var = this.c;
            if (i == 1) {
                view = dmc0Var.h;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                view = dmc0Var.i;
            }
            if (view != null) {
                pbc0 pbc0Var = (pbc0) dmc0Var.d.getValue();
                pbc0Var.getClass();
                a94 a94Var = new a94(14, view, pbc0Var);
                bwt0.p0(view, true);
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.postDelayed(new u69(3, view, a94Var), pbc0Var.d);
            }
            Iterator it = ((ArrayList) j5g.V(j5g.s0(e43.l(dmc0Var.h, dmc0Var.i), view))).iterator();
            while (it.hasNext()) {
                bwt0.p0((ViewGroup) it.next(), false);
            }
        }
    }

    @Override // xsna.b3j0
    public final void r3(VkPaginationList<UserProfile> vkPaginationList) {
        g().h = vkPaginationList;
    }

    @Override // xsna.b3j0
    public final void r5() {
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.c) {
                zif0Var = PostingSettingsCommunityItem.c.d((PostingSettingsCommunityItem.c) zif0Var, null, false, 1);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void s1() {
        mlq0 g = g();
        bmc0 bmc0Var = g.g;
        g.b(bmc0.a(bmc0Var, bmc0.b.a(bmc0Var.a, false, null, 6), null, 2), true);
    }

    @Override // xsna.b3j0
    public final void show() {
        PostingSettingsCommunityView postingSettingsCommunityView;
        SettingsPostingContract$Mode settingsPostingContract$Mode = this.h;
        int i = settingsPostingContract$Mode == null ? -1 : a.$EnumSwitchMapping$0[settingsPostingContract$Mode.ordinal()];
        if (i == 1) {
            g().c.c(true);
        } else if (i == 2 && (postingSettingsCommunityView = b().a.i) != null) {
            bwt0.p0(postingSettingsCommunityView, true);
        }
    }

    @Override // xsna.b3j0
    public final void t4(boolean z) {
        boolean z2;
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.b) {
                z2 = z;
                zif0Var = PostingSettingsCommunityItem.b.d((PostingSettingsCommunityItem.b) zif0Var, null, null, false, false, z2, 15);
            } else {
                z2 = z;
            }
            arrayList.add(zif0Var);
            z = z2;
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void u1(boolean z) {
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.c) {
                zif0Var = PostingSettingsCommunityItem.c.d((PostingSettingsCommunityItem.c) zif0Var, null, z, 1);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void v1() {
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.a) {
                zif0Var = PostingSettingsCommunityItem.a.d((PostingSettingsCommunityItem.a) zif0Var, false, false, false, 6);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void w4() {
        xch b = b();
        List<PostingSettingsCommunityItem> list = b.g.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (zif0 zif0Var : list) {
            if (zif0Var instanceof PostingSettingsCommunityItem.c) {
                zif0Var = PostingSettingsCommunityItem.c.d((PostingSettingsCommunityItem.c) zif0Var, null, false, 2);
            }
            arrayList.add(zif0Var);
        }
        b.g = new rlc0(arrayList);
        b.b();
    }

    @Override // xsna.b3j0
    public final void n4() {
    }

    @Override // xsna.ik6
    public final void onStop() {
    }

    @Override // xsna.b3j0
    public final void f5(boolean z) {
    }

    @Override // xsna.b3j0
    public final void i5(boolean z) {
    }
}
