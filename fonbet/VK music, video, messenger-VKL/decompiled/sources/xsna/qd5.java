package xsna;

import com.vk.dto.common.id.UserId;
import java.util.concurrent.ConcurrentHashMap;
import xsna.wxi0;
import xsna.yre0;

/* compiled from: AuthorizedQueueSyncHolderDelegateImpl.kt */
/* loaded from: classes.dex */
public final class qd5 implements ure0<yre0.a.C4133a> {
    public final ese0 a;
    public final mui0 b;
    public final ConcurrentHashMap<UserId, vre0> c = new ConcurrentHashMap<>();

    public qd5(ese0 ese0Var, mui0 mui0Var) {
        this.a = ese0Var;
        this.b = mui0Var;
        mui0Var.f(new ayi0() { // from class: xsna.pd5
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                UserId a;
                wxi0 a2 = new vxi0(uxi0Var).a();
                wxi0.c cVar = a2 instanceof wxi0.c ? (wxi0.c) a2 : null;
                if (cVar == null || (a = cVar.a()) == null) {
                    return;
                }
                qd5.this.c.remove(new yre0.a.C4133a(new xis(a, 20)).a().invoke());
            }
        });
    }
}
