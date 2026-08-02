package xsna;

import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.Map;
import kotlin.Pair;
import xsna.ug30;

/* compiled from: MsgActionDelegatesProvider.kt */
/* loaded from: classes2.dex */
public final class wg30 implements vg30 {
    public final kly a;
    public final fd20 b;
    public final zdw c;

    public wg30(kly klyVar, fd20 fd20Var, zdw zdwVar) {
        this.a = klyVar;
        this.b = fd20Var;
        this.c = zdwVar;
    }

    @Override // xsna.vg30
    public final Map<ug30, cpj0> a(MsgFromUser msgFromUser) {
        return pn00.k(new Pair(ug30.n.a, this.b.a(msgFromUser.d, msgFromUser.c)), new Pair(ug30.e0.a, new x2y0(msgFromUser.c, msgFromUser.h.d, (v2y0) this.a.b)), new Pair(ug30.y.a, new l9j0(this.c.g.getValue().b())));
    }
}
