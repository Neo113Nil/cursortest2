package xsna;

import android.content.Context;
import android.view.View;
import com.vk.api.base.VkPaginationList;
import com.vk.core.view.TintTextView;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.posting.SettingsPostingContract$Mode;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.R;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;

/* compiled from: SettingsPostingPresenter.kt */
/* loaded from: classes4.dex */
public final class e3j0 implements b3j0, w8i {
    public final qdc0 b;
    public final f3j0 c;
    public final io.reactivex.rxjava3.disposables.b d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ckc0 i;
    public jzn j;
    public VkPaginationList<UserProfile> k;
    public VkPaginationList<ProfileFriendItem> l;
    public List<ListFriends> m;
    public boolean n;
    public final PostingMetricsCreationEntryPoint o;
    public final Object p;
    public final bpn0 q;

    public e3j0(qdc0 qdc0Var, f3j0 f3j0Var) {
        this.b = qdc0Var;
        this.c = f3j0Var;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.d = bVar;
        this.o = PostingMetricsCreationEntryPoint.Other;
        this.p = msy.a(LazyThreadSafetyMode.NONE, new d3j0(this, 0));
        this.q = new bpn0(new bbb0(this, 15));
        bVar.b(hg1.h(ysg0.b.a.b0(ywd0.class).a0(asu0.a.d()), new rj60(this, 19)));
    }

    @Override // xsna.b3j0
    public final void H0(int i) {
        Object obj;
        Iterator<T> it = this.b.B6().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((DonutPostingSettings.Duration) obj).b == i) {
                    break;
                }
            }
        }
        DonutPostingSettings.Duration duration = (DonutPostingSettings.Duration) obj;
        String str = duration != null ? duration.c : null;
        f3j0 f3j0Var = this.c;
        f3j0Var.i();
        TintTextView tintTextView = f3j0Var.l;
        if (tintTextView != null) {
            tintTextView.setText(str);
        }
        f3j0.d(f3j0Var.l);
    }

    @Override // xsna.b3j0
    public final void K5() {
        this.h = true;
    }

    @Override // xsna.b3j0
    public final void M3() {
        f3j0 f3j0Var = this.c;
        TintTextView tintTextView = f3j0Var.g;
        if (tintTextView != null) {
            tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.vk_icon_lock_outline_16, 0, R.drawable.ic_dropdown_12, 0);
        }
        TintTextView tintTextView2 = f3j0Var.g;
        if (tintTextView2 != null) {
            Context context = tintTextView2.getContext();
            tintTextView2.setText(context != null ? context.getString(R.string.newsfeed_newpost_for_friends) : null);
        }
        f3j0.d(f3j0Var.g);
    }

    @Override // xsna.b3j0
    public final void M5(boolean z) {
        if (!this.e) {
            this.c.m(z);
        }
        n4();
    }

    @Override // xsna.b3j0
    public final void N1(boolean z) {
        TintTextView tintTextView;
        if (!this.h && (tintTextView = this.c.j) != null) {
            bwt0.p0(tintTextView, z);
        }
        n4();
    }

    @Override // xsna.b3j0
    public final void P5() {
        f3j0 f3j0Var = this.c;
        TintTextView tintTextView = f3j0Var.h;
        if (tintTextView != null) {
            Context context = tintTextView.getContext();
            tintTextView.setText(context != null ? context.getString(R.string.post_from_group_signed) : null);
        }
        f3j0.d(f3j0Var.h);
    }

    @Override // xsna.b3j0
    public final boolean Q4() {
        return this.n;
    }

    @Override // xsna.b3j0
    public final void R0() {
        f3j0 f3j0Var = this.c;
        TintTextView tintTextView = f3j0Var.g;
        if (tintTextView != null) {
            tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.vk_icon_lock_outline_16, 0, R.drawable.ic_dropdown_12, 0);
        }
        TintTextView tintTextView2 = f3j0Var.g;
        if (tintTextView2 != null) {
            Context context = tintTextView2.getContext();
            tintTextView2.setText(context != null ? context.getString(R.string.newsfeed_newpost_for_best_friends_short) : null);
            tintTextView2.setDynamicBackgroundTint(R.attr.vk_ui_accent_green);
            tintTextView2.setDynamicDrawableTint(R.attr.vk_ui_accent_green);
            jno0.c(tintTextView2, R.attr.vk_ui_accent_green);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.b3j0
    public final void R6() {
        if (this.l == null) {
            io.reactivex.rxjava3.core.q y0 = rsg0.y0(new eos(), null, null, 3);
            View view = this.c.e;
            Context context = view != null ? view.getContext() : null;
            if (context != null) {
                y0 = hg1.m(y0, context, 0L, false, 62);
            }
            int i = 22;
            y0.subscribe(new q440(new gj80(this, 13), 18), new oo20(new e420(i), i));
        } else {
            x();
        }
        this.n = true;
        jbc0 jbc0Var = (jbc0) this.p.getValue();
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0Var.g();
    }

    @Override // xsna.b3j0
    public final void S6(List<ListFriends> list) {
        this.m = list;
    }

    @Override // xsna.b3j0
    public final void T0() {
        this.c.l(false);
        this.g = true;
    }

    @Override // xsna.b3j0
    public final void Z4(boolean z) {
        if (!this.g) {
            this.c.l(z);
        }
        n4();
    }

    public final boolean b() {
        f3j0 f3j0Var = this.c;
        TintTextView tintTextView = f3j0Var.f;
        if (tintTextView != null ? bwt0.K(tintTextView) : false) {
            return true;
        }
        TintTextView tintTextView2 = f3j0Var.h;
        if (tintTextView2 != null ? bwt0.K(tintTextView2) : false) {
            return true;
        }
        TintTextView tintTextView3 = f3j0Var.g;
        if (tintTextView3 != null ? bwt0.K(tintTextView3) : false) {
            return true;
        }
        TintTextView tintTextView4 = f3j0Var.i;
        if (tintTextView4 != null ? bwt0.K(tintTextView4) : false) {
            return true;
        }
        TintTextView tintTextView5 = f3j0Var.j;
        if (tintTextView5 != null ? bwt0.K(tintTextView5) : false) {
            return true;
        }
        TintTextView tintTextView6 = f3j0Var.k;
        return tintTextView6 != null ? bwt0.K(tintTextView6) : false;
    }

    @Override // xsna.b3j0
    public final void e1(Date date) {
        String str;
        Context context;
        f3j0 f3j0Var = this.c;
        TintTextView tintTextView = f3j0Var.f;
        if (tintTextView == null || (context = tintTextView.getContext()) == null || (str = context.getString(R.string.date_at)) == null) {
            str = "";
        }
        String str2 = pvo0.j(date.getTime(), false, false) + ' ' + str + ' ' + f3j0.p.format(date);
        TintTextView tintTextView2 = f3j0Var.f;
        if (tintTextView2 != null) {
            tintTextView2.setText(str2.substring(0, 1).toUpperCase(Locale.ROOT).concat(str2.substring(1)));
        }
        f3j0.d(f3j0Var.f);
    }

    @Override // xsna.b3j0
    public final void f5(boolean z) {
        if (!this.h) {
            this.c.h(z);
        }
        n4();
    }

    public final void g() {
        ((fhc0) this.q.getValue()).x().e(this.o);
        ckc0 ckc0Var = this.i;
        if (ckc0Var != null) {
            ckc0.c(ckc0Var, this.b.Um(), null, null, 6);
        }
    }

    @Override // xsna.b3j0
    public final void i5(boolean z) {
        TintTextView tintTextView = this.c.i;
        if (tintTextView != null) {
            bwt0.p0(tintTextView, z);
        }
        n4();
    }

    @Override // xsna.b3j0
    public final void j2(boolean z) {
        TintTextView tintTextView;
        if (!this.h && (tintTextView = this.c.j) != null) {
            tintTextView.setEnabled(z);
        }
        n4();
    }

    @Override // xsna.b3j0
    public final void n4() {
        boolean b = b();
        View view = this.c.e;
        if (view != null) {
            bwt0.p0(view, b);
        }
        b();
        this.b.getClass();
    }

    @Override // xsna.b3j0
    public final void o2() {
        f3j0 f3j0Var = this.c;
        TintTextView tintTextView = f3j0Var.g;
        if (tintTextView != null) {
            tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.vk_icon_user_outline_16, 0, R.drawable.ic_dropdown_12, 0);
        }
        TintTextView tintTextView2 = f3j0Var.g;
        if (tintTextView2 != null) {
            Context context = tintTextView2.getContext();
            tintTextView2.setText(context != null ? context.getString(R.string.newsfeed_newpost_for_all) : null);
        }
        f3j0.f(f3j0Var.g);
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

    @Override // xsna.b3j0
    public final void p1(VkPaginationList<ProfileFriendItem> vkPaginationList) {
        this.l = vkPaginationList;
    }

    @Override // xsna.b3j0
    public final void r3(VkPaginationList<UserProfile> vkPaginationList) {
        this.k = vkPaginationList;
    }

    @Override // xsna.b3j0
    public final void r5() {
        this.c.j(false);
        this.f = true;
    }

    @Override // xsna.b3j0
    public final void s1() {
        this.c.m(false);
        this.e = true;
    }

    @Override // xsna.b3j0
    public final void t4(boolean z) {
        TintTextView tintTextView;
        if (!this.h && (tintTextView = this.c.l) != null) {
            tintTextView.setEnabled(z);
        }
        n4();
    }

    @Override // xsna.b3j0
    public final void u1(boolean z) {
        if (!this.f) {
            this.c.j(z);
        }
        n4();
    }

    @Override // xsna.b3j0
    public final void v1() {
        f3j0 f3j0Var = this.c;
        TintTextView tintTextView = f3j0Var.h;
        if (tintTextView != null) {
            Context context = tintTextView.getContext();
            tintTextView.setText(context != null ? context.getString(R.string.newsfeed_newpost_without_sign) : null);
        }
        f3j0.f(f3j0Var.h);
    }

    @Override // xsna.b3j0
    public final void w4() {
        f3j0 f3j0Var = this.c;
        TintTextView tintTextView = f3j0Var.f;
        if (tintTextView != null) {
            Context context = tintTextView.getContext();
            tintTextView.setText(context != null ? context.getString(R.string.posting_settings_now) : null);
        }
        f3j0.f(f3j0Var.f);
    }

    public final void x() {
        Context context;
        VkPaginationList<ProfileFriendItem> vkPaginationList = this.l;
        List<ProfileFriendItem> list = vkPaginationList != null ? vkPaginationList.b : null;
        qdc0 qdc0Var = this.b;
        if (list == null || list.isEmpty()) {
            VkPaginationList<UserProfile> vkPaginationList2 = this.k;
            List<UserProfile> list2 = vkPaginationList2 != null ? vkPaginationList2.b : null;
            if (list2 == null || list2.isEmpty()) {
                PostingVisibilityMode o0 = qdc0Var.o0();
                PostingVisibilityMode postingVisibilityMode = PostingVisibilityMode.ALL;
                if (o0 == postingVisibilityMode) {
                    postingVisibilityMode = PostingVisibilityMode.FRIENDS;
                }
                qdc0Var.Q(postingVisibilityMode);
                return;
            }
        }
        PostingVisibilityMode o02 = qdc0Var.o0();
        VkPaginationList<ProfileFriendItem> vkPaginationList3 = this.l;
        List<ProfileFriendItem> list3 = vkPaginationList3 != null ? vkPaginationList3.b : null;
        List<ListFriends> list4 = this.m;
        VkPaginationList<UserProfile> vkPaginationList4 = this.k;
        gqc0 gqc0Var = new gqc0(o02, list3, list4, null, vkPaginationList4 != null ? vkPaginationList4.b : null);
        f3j0 f3j0Var = this.c;
        TintTextView tintTextView = f3j0Var.g;
        if (tintTextView == null || (context = tintTextView.getContext()) == null) {
            return;
        }
        new hqc0().a(context, gqc0Var, new kb40(f3j0Var, 23));
    }

    @Override // xsna.b3j0
    public final void hide() {
    }

    @Override // xsna.ik6
    public final void onStart() {
    }

    @Override // xsna.ik6
    public final void onStop() {
    }

    @Override // xsna.b3j0
    public final void show() {
    }

    @Override // xsna.b3j0
    public final void G3(List<ProfileFriendItem> list) {
    }

    @Override // xsna.b3j0
    public final void L6(boolean z) {
    }

    @Override // xsna.b3j0
    public final void V6(boolean z) {
    }

    @Override // xsna.b3j0
    public final void k2(boolean z) {
    }

    @Override // xsna.b3j0
    public final void q1(SettingsPostingContract$Mode settingsPostingContract$Mode) {
    }
}
