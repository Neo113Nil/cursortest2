package yads;

import android.content.Context;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.bpn0;
import xsna.lq9;
import xsna.s7s0;

/* loaded from: classes10.dex */
public final class nw0 {
    public final Context a;
    public final Lazy b = new bpn0(new mw0(this));

    public nw0(Context context) {
        this.a = context;
    }

    public final Object a(String str, ow0 ow0Var) {
        lq9 lq9Var = new lq9(1, s7s0.c(ow0Var));
        lq9Var.o();
        hr hrVar = new hr(str, new kw0(lq9Var), new lw0(lq9Var));
        hrVar.j = false;
        UUID randomUUID = UUID.randomUUID();
        hrVar.q = randomUUID;
        ((dq2) this.b.getValue()).a(hrVar);
        lq9Var.r(new jw0(this, randomUUID));
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }
}
