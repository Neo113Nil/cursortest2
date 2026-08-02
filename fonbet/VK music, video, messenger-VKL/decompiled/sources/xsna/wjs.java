package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.api_commands.friends.FriendsAddApiCmd;

/* compiled from: FriendSubscriptionHelper.kt */
/* loaded from: classes2.dex */
public final class wjs {
    public final a1w a;
    public final a b;
    public io.reactivex.rxjava3.disposables.c d;
    public io.reactivex.rxjava3.disposables.c e;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final xym0 f = new xym0();

    /* compiled from: FriendSubscriptionHelper.kt */
    public interface a {
        void M();

        void d0(qtd0 qtd0Var);

        void l0(Throwable th);

        void u(Throwable th);

        void v(qtd0 qtd0Var);

        void z(qtd0 qtd0Var);
    }

    public wjs(a1w a1wVar, a aVar) {
        this.a = a1wVar;
        this.b = aVar;
    }

    public final void a(qtd0 qtd0Var, FriendsAddApiCmd.Source source, FriendsAddApiCmd.BlockType blockType) {
        if (this.d != null) {
            return;
        }
        this.b.v(qtd0Var);
        Peer B7 = qtd0Var.B7();
        io.reactivex.rxjava3.internal.operators.single.c C = this.a.C(this, new zjs(B7, source, blockType, 2));
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c e = io.reactivex.rxjava3.kotlin.c.e(C.q(asu0Var.c()).m(asu0Var.d()), new vam(this, B7), new nvg(this, 24));
        this.c.b(e);
        this.d = e;
    }

    public final void b() {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.e = null;
    }

    public final void c(qtd0 qtd0Var) {
        if (this.e != null) {
            return;
        }
        this.b.z(qtd0Var);
        Peer B7 = qtd0Var.B7();
        io.reactivex.rxjava3.internal.operators.single.c C = this.a.C(this, new ess(B7));
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c e = io.reactivex.rxjava3.kotlin.c.e(C.q(asu0Var.c()).m(asu0Var.d()), new tcn(this, B7), new np5(this, qtd0Var, B7));
        this.c.b(e);
        this.e = e;
    }
}
