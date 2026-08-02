package xsna;

import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.msg_list.MsgListOpenAtLatestMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vk.toggle.features.ImFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.dg20;
import xsna.hg1;

/* compiled from: MessagesListViewModel.kt */
/* loaded from: classes16.dex */
public final class eg20 {
    public final vf20 a;
    public final nj0 b;
    public final of20 c;
    public final lya d;
    public final yf20 e;
    public final boolean f;
    public final io.reactivex.rxjava3.subjects.f<dg20> g;
    public final io.reactivex.rxjava3.subjects.f h;
    public final io.reactivex.rxjava3.core.w i;
    public final io.reactivex.rxjava3.disposables.b j;
    public final io.reactivex.rxjava3.core.q<Boolean> k;
    public final io.reactivex.rxjava3.subjects.d<xf20> l;
    public final io.reactivex.rxjava3.subjects.d<Integer> m;
    public final io.reactivex.rxjava3.subjects.d n;
    public final io.reactivex.rxjava3.subjects.f<w8v> o;
    public final io.reactivex.rxjava3.subjects.d<oj0> p;
    public final io.reactivex.rxjava3.internal.operators.observable.y q;
    public final io.reactivex.rxjava3.subjects.d<h5v> r;
    public final io.reactivex.rxjava3.internal.operators.observable.y s;
    public boolean t;

    /* compiled from: MessagesListViewModel.kt */
    public static final class a {
        public final w8v a;
        public final xf20 b;
        public final ProfilesInfo c;

        public a(w8v w8vVar, xf20 xf20Var, ProfilesInfo profilesInfo) {
            this.a = w8vVar;
            this.b = xf20Var;
            this.c = profilesInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessagesUpdateData(historyUpdate=");
            sb.append(this.a);
            sb.append(", messagesListModel=");
            sb.append(this.b);
            sb.append(", profiles=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.c, ')');
        }
    }

    public eg20(vf20 vf20Var, nj0 nj0Var, of20 of20Var, lya lyaVar, bg20 bg20Var, boolean z) {
        this.a = vf20Var;
        this.b = nj0Var;
        this.c = of20Var;
        this.d = lyaVar;
        this.e = bg20Var;
        this.f = z;
        io.reactivex.rxjava3.subjects.f<dg20> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.g = fVar;
        this.h = fVar;
        asu0 asu0Var = asu0.a;
        v860 A = asu0Var.A(1, "im-messages-list-update");
        this.i = A;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.j = bVar;
        io.reactivex.rxjava3.subjects.d O0 = io.reactivex.rxjava3.subjects.d.O0(new ProfilesInfo());
        int i = 3;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, vf20Var.e, null, null, new sop(O0, 29)));
        this.k = vf20Var.i;
        io.reactivex.rxjava3.subjects.d<xf20> N0 = io.reactivex.rxjava3.subjects.d.N0();
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, vf20Var.d, null, null, new f410(N0, i)));
        this.l = N0;
        io.reactivex.rxjava3.subjects.d<Integer> O02 = io.reactivex.rxjava3.subjects.d.O0(-1);
        int i2 = 27;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, vf20Var.d.t0(1L), null, null, new zxo(O02, i2)));
        this.m = O02;
        this.n = N0;
        io.reactivex.rxjava3.subjects.f<w8v> fVar2 = new io.reactivex.rxjava3.subjects.f<>();
        this.o = fVar2;
        io.reactivex.rxjava3.subjects.d<oj0> O03 = io.reactivex.rxjava3.subjects.d.O0(new oj0(0));
        this.p = O03;
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        this.q = new io.reactivex.rxjava3.internal.operators.observable.y(O03, qVar, aVar);
        io.reactivex.rxjava3.subjects.d<h5v> N02 = io.reactivex.rxjava3.subjects.d.N0();
        this.r = N02;
        this.s = new io.reactivex.rxjava3.internal.operators.observable.y(N02, qVar, aVar);
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = fVar2.a0(A);
        m5 m5Var = new m5(new d9j(this, 28), 26);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        int i3 = 4;
        int i4 = 6;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, new io.reactivex.rxjava3.internal.operators.observable.d3(new io.reactivex.rxjava3.internal.operators.observable.z(a0.E(m5Var, lVar, kVar, kVar), new c120(new kdn(this, 22), i3)), new io.reactivex.rxjava3.core.t[]{N0, O0}, new a.c(new dg1(new qci(5), i2))).j0(new oj0(0), new iw3(new com.vk.movika.sdk.android.defaultplayer.control.l(this, i4), 20)).E(new t520(new p010(this, i4), i), lVar, kVar, kVar), null, null, new l6u(this, 12)));
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, vf20Var.g, null, null, new e810(this, i)));
        axs0 axs0Var = new axs0();
        a1w a1wVar = q1w.a;
        bVar.b(io.reactivex.rxjava3.kotlin.c.h((a1wVar == null ? null : a1wVar).C(this, axs0Var).q(asu0Var.c()), null, new cws(this, 21), 1));
        a1w a1wVar2 = q1w.a;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, new io.reactivex.rxjava3.internal.operators.observable.i0((a1wVar2 == null ? null : a1wVar2).l.a(), new hg1.f2()).r0(asu0Var.c()), null, null, new d410(this, i3)));
    }

    public static Msg b(gj30 gj30Var, Integer num) {
        Object obj;
        Iterator<T> it = gj30Var.k().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Msg) obj).b == num.intValue()) {
                break;
            }
        }
        return (Msg) obj;
    }

    public static MsgListOpenMode c(de deVar) {
        if (deVar instanceof uj30) {
            return MsgListOpenAtLatestMode.b;
        }
        if (deVar instanceof sj30) {
            return MsgListOpenAtUnreadMode.b;
        }
        if (!(deVar instanceof rj30)) {
            return null;
        }
        rj30 rj30Var = (rj30) deVar;
        return new MsgListOpenAtMsgMode(rj30Var.b, rj30Var.c);
    }

    public final void a(dg20 dg20Var) {
        this.g.onNext(dg20Var);
    }

    public final void d(MsgListOpenMode msgListOpenMode) {
        de rj30Var;
        boolean z = msgListOpenMode instanceof MsgListOpenAtMsgMode;
        this.t = z;
        if (msgListOpenMode instanceof MsgListOpenAtLatestMode) {
            rj30Var = uj30.d;
        } else if (msgListOpenMode instanceof MsgListOpenAtUnreadMode) {
            rj30Var = sj30.b;
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            MsgListOpenAtMsgMode msgListOpenAtMsgMode = (MsgListOpenAtMsgMode) msgListOpenMode;
            rj30Var = new rj30(msgListOpenAtMsgMode.b, msgListOpenAtMsgMode.c);
        }
        vf20 vf20Var = this.a;
        ia20 ia20Var = vf20Var.b;
        io.reactivex.rxjava3.disposables.c cVar = ia20Var.g;
        if (cVar != null) {
            cVar.dispose();
        }
        if (!ia20Var.d.P0().isEmpty()) {
            ia20Var.d.onNext(new ProfilesInfo());
        }
        vf20Var.a.d(rj30Var);
    }

    public final void e(String str) {
        if (this.a.a.c().e) {
            d(MsgListOpenAtLatestMode.b);
            return;
        }
        xf20 P0 = this.l.P0();
        if (P0 == null) {
            return;
        }
        a(new dg20.k(P0.d, str));
    }

    public final void f(MsgIdType msgIdType, int i, boolean z, String str) {
        if (this.a.a.c().r(msgIdType, i)) {
            a(new dg20.l(msgIdType, i, z, str));
        } else {
            d(new MsgListOpenAtMsgMode(msgIdType, i));
            this.t = z;
        }
    }

    public final void g(boolean z) {
        ImFeatures imFeatures = ImFeatures.VKM_CHANNEL_DONUT_REACTION;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            tk30 tk30Var = this.b.a;
            tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, z, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, 1073741823));
        }
    }
}
