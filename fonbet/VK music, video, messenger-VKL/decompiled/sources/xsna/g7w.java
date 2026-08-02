package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.MsgReadAsLastData;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import xsna.i6w;

/* compiled from: ImItemListStatsMviMiddlewere.kt */
/* loaded from: classes2.dex */
public final class g7w implements h7f0<o6w, i6w, on50, v6w, m6w, l6w> {
    public final sl50<o6w, i6w, on50, v6w, m6w, l6w> b;
    public final feb c;
    public final k0w d;

    public g7w(sl50<o6w, i6w, on50, v6w, m6w, l6w> sl50Var, pbw pbwVar) {
        this.b = sl50Var;
        this.c = pbwVar.b();
        this.d = pbwVar.w();
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        Dialog c;
        Integer num;
        i6w i6wVar = (i6w) lj50Var;
        if (i6wVar instanceof i6w.s) {
            this.c.d(((i6w.s) i6wVar).b);
            return;
        }
        if ((i6wVar instanceof i6w.i) && (c = ((o6w) getCurrentState()).c(((i6w.i) i6wVar).b)) != null && c.Gb()) {
            long longValue = c.Sb().longValue();
            Msg msg = ((o6w) getCurrentState()).c.b.b.get(c.t3());
            cew.b.getClass();
            MsgReadAsLastData f = cew.f(longValue);
            if (f == null) {
                return;
            }
            MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
            if (msgFromUser == null) {
                return;
            }
            int i = msgFromUser.d;
            if ((i == f.a || ((num = f.d) != null && i == num.intValue())) && f.b == 1 && msgFromUser.T == null) {
                this.d.k(longValue, f.e.i());
            }
        }
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
