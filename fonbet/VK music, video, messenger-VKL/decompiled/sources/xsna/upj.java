package xsna;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DispatchException;
import xsna.eyx;

/* compiled from: Continuation.kt */
/* loaded from: classes11.dex */
public final class upj {
    public static final con0 a = new con0("UNDEFINED");
    public static final con0 b = new con0("REUSABLE_CLAIMED");
    public static izs c = new nrw(0);

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void b(Object obj, spj spjVar) {
        if (!(spjVar instanceof mcn)) {
            spjVar.resumeWith(obj);
            return;
        }
        mcn mcnVar = (mcn) spjVar;
        ovj ovjVar = mcnVar.e;
        Throwable a2 = Result.a(obj);
        Object d8iVar = a2 == null ? obj : new d8i(a2, false);
        ContinuationImpl continuationImpl = mcnVar.f;
        if (d(ovjVar, continuationImpl.getContext())) {
            mcnVar.g = d8iVar;
            mcnVar.d = 1;
            c(ovjVar, continuationImpl.getContext(), mcnVar);
            return;
        }
        c0q a3 = bro0.a();
        if (a3.c >= 4294967296L) {
            mcnVar.g = d8iVar;
            mcnVar.d = 1;
            a3.V(mcnVar);
            return;
        }
        a3.X(true);
        try {
            eyx eyxVar = (eyx) continuationImpl.getContext().get(eyx.a.b);
            if (eyxVar == null || eyxVar.isActive()) {
                Object obj2 = mcnVar.h;
                kotlin.coroutines.d context = continuationImpl.getContext();
                Object b2 = mqo0.b(context, obj2);
                z2q0<?> c2 = b2 != mqo0.a ? mvj.c(continuationImpl, context, b2) : null;
                try {
                    continuationImpl.resumeWith(obj);
                    s3q0 s3q0Var = s3q0.a;
                } finally {
                    if (c2 == null || c2.y0()) {
                        mqo0.a(context, b2);
                    }
                }
            } else {
                mcnVar.resumeWith(new Result.Failure(eyxVar.I()));
            }
            while (a3.a0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void c(ovj ovjVar, kotlin.coroutines.d dVar, Runnable runnable) {
        try {
            ovjVar.P(dVar, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, ovjVar, dVar);
        }
    }

    public static final boolean d(ovj ovjVar, kotlin.coroutines.d dVar) {
        try {
            return ovjVar.S(dVar);
        } catch (Throwable th) {
            throw new DispatchException(th, ovjVar, dVar);
        }
    }
}
