package defpackage;

import kotlin.coroutines.Continuation;
import retrofit2.Call;
import retrofit2.a;

/* loaded from: classes15.dex */
public final class ewu extends fwu {
    public final ag7 d;

    public ewu(m6j0 m6j0Var, xf7 xf7Var, zme zmeVar, ag7 ag7Var) {
        super(m6j0Var, xf7Var, zmeVar);
        this.d = ag7Var;
    }

    @Override // defpackage.fwu
    public final Object a(yv60 yv60Var, Object[] objArr) {
        Call call = (Call) this.d.r(yv60Var);
        Continuation continuation = (Continuation) objArr[objArr.length - 1];
        try {
            return a.c(call, continuation);
        } catch (Exception e) {
            return a.d(e, continuation);
        }
    }
}
