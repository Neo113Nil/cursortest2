package defpackage;

import kotlin.coroutines.Continuation;
import retrofit2.Call;
import retrofit2.a;

/* loaded from: classes9.dex */
public final class dwu extends fwu {
    public final ag7 d;
    public final boolean e;

    public dwu(m6j0 m6j0Var, xf7 xf7Var, zme zmeVar, ag7 ag7Var, boolean z) {
        super(m6j0Var, xf7Var, zmeVar);
        this.d = ag7Var;
        this.e = z;
    }

    @Override // defpackage.fwu
    public final Object a(yv60 yv60Var, Object[] objArr) {
        Call call = (Call) this.d.r(yv60Var);
        Continuation continuation = (Continuation) objArr[objArr.length - 1];
        try {
            return this.e ? a.b(call, continuation) : a.a(call, continuation);
        } catch (LinkageError | ThreadDeath | VirtualMachineError e) {
            throw e;
        } catch (Throwable th) {
            return a.d(th, continuation);
        }
    }
}
