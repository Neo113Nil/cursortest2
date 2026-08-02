package defpackage;

import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public abstract class gzg {
    public static final CoroutineSingletons a = CoroutineSingletons.COROUTINE_SUSPENDED;

    public static final Object a(gyc gycVar) {
        zls zlsVar = (zls) gycVar.a;
        hzg hzgVar = new hzg();
        hzgVar.a = zlsVar;
        hzgVar.b = hzgVar;
        CoroutineSingletons coroutineSingletons = a;
        hzgVar.c = coroutineSingletons;
        while (true) {
            Object obj = hzgVar.c;
            Continuation continuation = hzgVar.b;
            if (continuation == null) {
                b.b(obj);
                return obj;
            }
            if (jl40.l(coroutineSingletons, obj)) {
                try {
                    zls zlsVar2 = hzgVar.a;
                    zy11 zy11Var = zy11.a;
                    ym11.e(3, zlsVar2);
                    Object invoke = zlsVar2.invoke(hzgVar, zy11Var, continuation);
                    if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        continuation.resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    continuation.resumeWith(new Result.Failure(th));
                }
            } else {
                hzgVar.c = coroutineSingletons;
                continuation.resumeWith(obj);
            }
        }
    }
}
