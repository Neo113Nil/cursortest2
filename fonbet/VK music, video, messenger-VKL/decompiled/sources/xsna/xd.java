package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DispatchException;
import xsna.eyx;

/* compiled from: AbstractCoroutine.kt */
/* loaded from: classes11.dex */
public abstract class xd<T> extends pyx implements spj<T>, yvj {
    public final kotlin.coroutines.d d;

    public xd(kotlin.coroutines.d dVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            f0((eyx) dVar.get(eyx.a.b));
        }
        this.d = dVar.plus(this);
    }

    @Override // xsna.pyx
    public final String R() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // xsna.pyx
    public final void e0(CompletionHandlerException completionHandlerException) {
        rvj.a(this.d, completionHandlerException);
    }

    @Override // xsna.spj
    public final kotlin.coroutines.d getContext() {
        return this.d;
    }

    @Override // xsna.yvj
    public final kotlin.coroutines.d getCoroutineContext() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pyx
    public final void n0(Object obj) {
        if (!(obj instanceof d8i)) {
            v0(obj);
        } else {
            d8i d8iVar = (d8i) obj;
            u0(d8iVar.a, d8i.b.get(d8iVar) == 1);
        }
    }

    @Override // xsna.spj
    public final void resumeWith(Object obj) {
        Throwable a = Result.a(obj);
        if (a != null) {
            obj = new d8i(a, false);
        }
        Object j0 = j0(obj);
        if (j0 == tyx.b) {
            return;
        }
        G(j0);
    }

    public final void w0(CoroutineStart coroutineStart, xd xdVar, wzs wzsVar) {
        Object invoke;
        coroutineStart.getClass();
        int i = CoroutineStart.a.$EnumSwitchMapping$0[coroutineStart.ordinal()];
        if (i == 1) {
            try {
                upj.b(s3q0.a, s7s0.c(s7s0.a(xdVar, this, wzsVar)));
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
            s7s0.c(s7s0.a(xdVar, this, wzsVar)).resumeWith(s3q0.a);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        try {
            kotlin.coroutines.d dVar = this.d;
            Object b = mqo0.b(dVar, null);
            try {
                if (wzsVar instanceof BaseContinuationImpl) {
                    ttp0.d(2, wzsVar);
                    invoke = wzsVar.invoke(xdVar, this);
                } else {
                    kotlin.coroutines.d context = getContext();
                    spj intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = context == EmptyCoroutineContext.b ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(this) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(this, context);
                    ttp0.d(2, wzsVar);
                    invoke = wzsVar.invoke(xdVar, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
                }
                if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    resumeWith(invoke);
                }
            } finally {
                mqo0.a(dVar, b);
            }
        } catch (Throwable th) {
            th = th;
        }
    }

    public void v0(T t) {
    }

    public void u0(Throwable th, boolean z) {
    }
}
