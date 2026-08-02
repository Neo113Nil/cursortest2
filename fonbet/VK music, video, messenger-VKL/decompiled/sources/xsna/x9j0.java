package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.fragments.SharedChatsFragment;
import java.util.Set;
import xsna.z9j0;

/* compiled from: SharedChatsListPresenter.kt */
/* loaded from: classes2.dex */
public final class x9j0 extends ok6<vtm> {
    public final Context d;
    public final DialogExt e;
    public final y9j0 f;
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();
    public final DisplayNameFormatter h = new DisplayNameFormatter(null, 3, null);
    public SharedChatsFragment i;

    public x9j0(Context context, DialogExt dialogExt, y9j0 y9j0Var) {
        this.d = context;
        this.e = dialogExt;
        this.f = y9j0Var;
    }

    @Override // xsna.ok6
    public final void i() {
        this.g.e();
    }

    @Override // xsna.ok6
    public final void k() {
        io.reactivex.rxjava3.disposables.b bVar = this.g;
        bVar.e();
        y9j0 y9j0Var = this.f;
        io.reactivex.rxjava3.internal.operators.single.c C = y9j0Var.a.C(y9j0Var, new z9j0(new z9j0.b(y9j0Var.b.f)));
        asu0 asu0Var = asu0.a;
        bVar.b(C.q(asu0Var.c()).l(new adz(new aj50(this, 21), 12)).m(asu0Var.d()).subscribe(new bqs(new af50(this, 28), 25), new o7y(new ut30(this, 17), 16)));
    }

    @Override // xsna.ok6
    public final void l(vtm vtmVar) {
        vtmVar.F = new a();
    }

    @Override // xsna.ok6
    public final void m(vtm vtmVar) {
        vtmVar.F = null;
    }

    /* compiled from: SharedChatsListPresenter.kt */
    public final class a implements xtm {
        public a() {
        }

        @Override // xsna.xtm
        public final void f(DialogExt dialogExt) {
            SharedChatsFragment sharedChatsFragment = x9j0.this.i;
            if (sharedChatsFragment != null) {
                o0w.x(sharedChatsFragment.P.d().b(), sharedChatsFragment.kn(), null, dialogExt.e, dialogExt, null, MsgListOpenAtUnreadMode.b, false, null, null, null, null, null, null, "shared_chats", null, null, null, false, null, null, null, null, null, 1073733586);
            }
        }

        @Override // xsna.xtm
        public final void m() {
            SharedChatsFragment sharedChatsFragment = x9j0.this.i;
            if (sharedChatsFragment != null) {
                o0w b = sharedChatsFragment.P.d().b();
                jbs jbsVar = new jbs(sharedChatsFragment);
                DialogExt dialogExt = sharedChatsFragment.R;
                if (dialogExt == null) {
                    dialogExt = null;
                }
                b.O(jbsVar, "shared_chats", dialogExt.f, null);
            }
        }

        @Override // xsna.xtm
        public final void e() {
        }

        @Override // xsna.xtm
        public final void i() {
        }

        @Override // xsna.xtm
        public final void k() {
        }

        @Override // xsna.xtm
        public final void n() {
        }

        @Override // xsna.xtm
        public final void p() {
        }

        @Override // xsna.xtm
        public final void a(InfoBar infoBar) {
        }

        @Override // xsna.xtm
        public final void c(DialogExt dialogExt) {
        }

        @Override // xsna.xtm
        public final void g(msm msmVar) {
        }

        @Override // xsna.xtm
        public final void j(Object obj) {
        }

        @Override // xsna.xtm
        public final void o(Set<? extends Peer> set) {
        }

        @Override // xsna.xtm
        public final void q(String str) {
        }

        @Override // xsna.xtm
        public final void b(DialogsFilter dialogsFilter, DialogsFilterChangeSource dialogsFilterChangeSource) {
        }

        @Override // xsna.xtm
        public final void d(InfoBar infoBar, InfoBar.Button button) {
        }

        @Override // xsna.xtm
        public final void h(int i, Peer peer) {
        }

        @Override // xsna.xtm
        public final void l(View view, qtd0 qtd0Var, boolean z) {
        }
    }
}
