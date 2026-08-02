package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.am.OnAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes9.dex */
public final class fx60 {
    public final jj3 a;
    public final ast0 b;

    public fx60(jj3 jj3Var, ast0 ast0Var) {
        this.a = jj3Var;
        this.b = ast0Var;
    }

    public final void a(Events$Zalogin$LoginContext events$Zalogin$LoginContext, sls slsVar) {
        b(events$Zalogin$LoginContext, slsVar, new bgc(12));
    }

    public final void b(Events$Zalogin$LoginContext events$Zalogin$LoginContext, sls slsVar, sls slsVar2) {
        this.a.c(new um3(events$Zalogin$LoginContext, new qzj0(null, new ga1(8, this, slsVar2, slsVar)), false, false, 28));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, uj] */
    public final Object c(Events$Zalogin$LoginContext events$Zalogin$LoginContext, ContinuationImpl continuationImpl) {
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        Ref$ObjectRef y = b64.y(j18Var);
        cx60 cx60Var = new cx60(0, y);
        cl7 cl7Var = new cl7(j18Var, cx60Var);
        OnAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2 onAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2 = new OnAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2(cl7Var);
        b(events$Zalogin$LoginContext, new ex60(onAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2, 0), new ex60(onAuthorizedAndReadyInteractorImpl$waitForUserAuthorizedAndReady$$inlined$suspendCallbackApi$2, 1));
        y.element = uj.C;
        if (cl7Var.c()) {
            cx60Var.invoke();
        } else {
            j18Var.w(new dx60(cl7Var, 0));
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
