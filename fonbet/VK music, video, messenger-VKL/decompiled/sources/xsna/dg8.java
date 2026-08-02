package xsna;

import android.content.Intent;
import android.view.View;
import com.vk.clips.design.view.BroadcastFriendsView;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import java.util.LinkedList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: BroadcastFriendsPresenter.kt */
/* loaded from: classes16.dex */
public final class dg8 implements bg8, w8i {
    public static final String[] n = {"photo_base"};
    public final cg8 b;
    public io.reactivex.rxjava3.core.v<? super Boolean> f;
    public List<UserId> g;
    public int h;
    public boolean j;
    public Pair<n0r0, n0r0> k;
    public PrivacySetting l;
    public final bpn0 c = new bpn0(new jd(this, 12));
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new ld(this, 11));
    public UserId e = UserId.d;
    public List<? extends UserProfile> i = new LinkedList();
    public klu m = g().j().b;

    /* compiled from: BroadcastFriendsPresenter.kt */
    public static final class a extends io.reactivex.rxjava3.observers.a<List<? extends UserProfile>> {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            dg8 dg8Var = dg8.this;
            io.reactivex.rxjava3.core.v<? super Boolean> vVar = dg8Var.f;
            if (vVar != null) {
                vVar.onComplete();
            }
            Pair<n0r0, n0r0> pair = dg8Var.k;
            if (dg8Var.j) {
                cg8 cg8Var = dg8Var.b;
                cg8Var.setUserVisibleOnlyMe(dg8Var.g().d(((View) cg8Var).getContext()));
            } else if (pair != null && dg8.h(pair)) {
                cg8 cg8Var2 = dg8Var.b;
                cg8Var2.setUserVisibleFriendList(dg8Var.g().k(((View) cg8Var2).getContext(), pair));
            } else {
                dg8Var.b.h(dg8Var.h, dg8Var.i);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            io.reactivex.rxjava3.core.v<? super Boolean> vVar = dg8.this.f;
            if (vVar != null) {
                vVar.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            dg8 dg8Var = dg8.this;
            dg8Var.i = (List) obj;
            List<UserId> list = dg8Var.g;
            dg8Var.h = list != null ? list.size() : 0;
            io.reactivex.rxjava3.core.v<? super Boolean> vVar = dg8Var.f;
            if (vVar != null) {
                vVar.onNext(Boolean.TRUE);
            }
        }
    }

    public dg8(BroadcastFriendsView broadcastFriendsView) {
        this.b = broadcastFriendsView;
    }

    public static boolean h(Pair pair) {
        if (pair != null) {
            return (((n0r0) pair.i()).a() && ((n0r0) pair.j()).a()) ? false : true;
        }
        return false;
    }

    @Override // xsna.bg8
    public final eg8 K() {
        return new eg8(this);
    }

    public final void f(PrivacySetting privacySetting) {
        List<PrivacySetting.PrivacyRule> list;
        boolean z = false;
        if (privacySetting != null && (list = privacySetting.e) != null && list.contains(PrivacyRules.b)) {
            z = true;
        }
        this.j = z;
        this.k = privacySetting != null ? g().h(privacySetting) : null;
    }

    public final ufd0 g() {
        return (ufd0) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void i() {
        ((zvr0) this.d.getValue()).getClass();
        if (fkq0.b(this.e)) {
            n();
        } else {
            l(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.bg8
    public final void j(rfd0 rfd0Var) {
        PrivacySetting privacySetting = rfd0Var.a;
        if (!fkq0.d(this.e)) {
            if (fkq0.b(this.e)) {
                this.m = g().j().b;
                n();
                return;
            }
            return;
        }
        if (epx.f(privacySetting, this.l)) {
            return;
        }
        if (epx.f(privacySetting != null ? privacySetting.b : null, "lives")) {
            this.k = null;
            f(privacySetting);
            Pair<n0r0, n0r0> pair = this.k;
            if (this.j) {
                ufd0 g = g();
                cg8 cg8Var = this.b;
                cg8Var.setUserVisibleOnlyMe(g.d(((View) cg8Var).getContext()));
            } else {
                if (pair == null || !h(pair)) {
                    ((View) this.b).postDelayed(new o1(this, 2), 200L);
                    return;
                }
                ufd0 g2 = g();
                cg8 cg8Var2 = this.b;
                cg8Var2.setUserVisibleFriendList(g2.k(((View) cg8Var2).getContext(), pair));
            }
        }
    }

    @Override // xsna.bg8
    public final void k(UserId userId) {
        this.e = userId;
    }

    public final void l(boolean z) {
        io.reactivex.rxjava3.core.t L = (z ? io.reactivex.rxjava3.core.q.T(this.l) : rsg0.y0(new io(false), null, null, 3).U(new com.vk.movika.sdk.base.hooks.k(new t9(this, 11), 6))).U(new mj1(new v9(this, 10), 3)).L(new e05(new tl0(this, 16), 4), false);
        a aVar = new a();
        L.subscribe(aVar);
        ver0.a(aVar);
    }

    @Override // xsna.bg8
    public final void m() {
        l(this.l != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        ufd0 g = g();
        cg8 cg8Var = this.b;
        cg8Var.setGroupPrivacy(g.e(((View) cg8Var).getContext(), this.m));
        io.reactivex.rxjava3.core.v<? super Boolean> vVar = this.f;
        if (vVar != null) {
            vVar.onNext(Boolean.TRUE);
        }
        io.reactivex.rxjava3.core.v<? super Boolean> vVar2 = this.f;
        if (vVar2 != null) {
            vVar2.onComplete();
        }
    }

    @Override // xsna.bg8
    public final void o(BroadcastAuthor.Group group) {
        esw j = g().j();
        Group group2 = group.b;
        klu kluVar = (klu) j.a.get(group2);
        if (kluVar == null) {
            int i = group2.m;
            kluVar = (i == 2 || i == 1) ? z120.b : mt1.b;
        }
        j.b = kluVar;
        g().j().a(group2, this.m);
        this.m = g().j().b;
    }

    @Override // xsna.qk6
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
