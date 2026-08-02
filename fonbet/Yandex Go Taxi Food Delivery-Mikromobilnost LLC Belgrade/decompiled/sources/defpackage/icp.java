package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes9.dex */
public final class icp extends wsx0 {
    public final /* synthetic */ f7l0 e;
    public final /* synthetic */ jcp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icp(String str, f7l0 f7l0Var, jcp jcpVar) {
        super(str, true);
        this.e = f7l0Var;
        this.f = jcpVar;
    }

    @Override // defpackage.wsx0
    public final long a() {
        e7l0 e7l0Var;
        f7l0 f7l0Var = this.e;
        try {
            e7l0Var = f7l0Var.d();
        } catch (Throwable th) {
            e7l0Var = new e7l0(f7l0Var, null, th, 2);
        }
        jcp jcpVar = this.f;
        if (!((CopyOnWriteArrayList) jcpVar.w).contains(f7l0Var)) {
            return -1L;
        }
        ((LinkedBlockingDeque) jcpVar.x).put(e7l0Var);
        return -1L;
    }
}
