package defpackage;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.c;

/* loaded from: classes9.dex */
public abstract class c7 extends c implements Continuation, tse {
    public final fse x;

    public c7(fse fseVar, boolean z) {
        super(z);
        Q((l8x) fseVar.get(seu.C));
        this.x = fseVar.plus(this);
    }

    @Override // kotlinx.coroutines.c
    public final void P(CompletionHandlerException completionHandlerException) {
        d6z.I(this.x, completionHandlerException);
    }

    @Override // kotlinx.coroutines.c
    public final void Y(Object obj) {
        if (!(obj instanceof tzc)) {
            l0(obj);
        } else {
            tzc tzcVar = (tzc) obj;
            j0(tzcVar.a, tzc.b.get(tzcVar) == 1);
        }
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final fse get_context() {
        return this.x;
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.x;
    }

    public void j0(Throwable th, boolean z) {
    }

    public void l0(Object obj) {
    }

    public final void m0(CoroutineStart coroutineStart, c7 c7Var, wls wlsVar) {
        Object invoke;
        coroutineStart.getClass();
        int i = xse.a[coroutineStart.ordinal()];
        zy11 zy11Var = zy11.a;
        if (i == 1) {
            try {
                bvf0.P(zy11Var, dvw.b(dvw.a(wlsVar, c7Var, this)));
                return;
            } finally {
                th = th;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).getCause();
                }
                resumeWith(new Result.Failure(th));
            }
        }
        if (i == 2) {
            dvw.b(dvw.a(wlsVar, c7Var, this)).resumeWith(zy11Var);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            w511.b();
            return;
        }
        try {
            fse fseVar = this.x;
            Object H = gwk0.H(fseVar, null);
            try {
                if (wlsVar instanceof BaseContinuationImpl) {
                    ym11.e(2, wlsVar);
                    invoke = wlsVar.invoke(c7Var, this);
                } else {
                    fse fseVar2 = get_context();
                    Object intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = fseVar2 == EmptyCoroutineContext.a ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(this) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(fseVar2, this);
                    ym11.e(2, wlsVar);
                    invoke = wlsVar.invoke(c7Var, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
                }
                if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    resumeWith(invoke);
                }
            } finally {
                gwk0.x(fseVar, H);
            }
        } catch (Throwable th) {
            th = th;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable a = Result.a(obj);
        if (a != null) {
            obj = new tzc(a, false);
        }
        Object U = U(obj);
        if (U == ffx.c) {
            return;
        }
        r(U);
    }

    @Override // kotlinx.coroutines.c
    public final String y() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
