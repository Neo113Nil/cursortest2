package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Yield.kt */
/* loaded from: classes11.dex */
public final class n5y0 {
    public static final Object a(ContinuationImpl continuationImpl) {
        Object obj;
        kotlin.coroutines.d context = continuationImpl.getContext();
        iyx.e(context);
        spj c = s7s0.c(continuationImpl);
        mcn mcnVar = c instanceof mcn ? (mcn) c : null;
        if (mcnVar == null) {
            obj = s3q0.a;
        } else {
            ovj ovjVar = mcnVar.e;
            if (upj.d(ovjVar, context)) {
                mcnVar.g = s3q0.a;
                mcnVar.d = 1;
                ovjVar.Q(context, mcnVar);
            } else {
                m5y0 m5y0Var = new m5y0();
                kotlin.coroutines.d plus = context.plus(m5y0Var);
                s3q0 s3q0Var = s3q0.a;
                mcnVar.g = s3q0Var;
                mcnVar.d = 1;
                ovjVar.Q(plus, mcnVar);
                if (m5y0Var.b) {
                    c0q a = bro0.a();
                    sk3<ocn<?>> sk3Var = a.e;
                    if (!(sk3Var != null ? sk3Var.isEmpty() : true)) {
                        if (a.c >= 4294967296L) {
                            mcnVar.g = s3q0Var;
                            mcnVar.d = 1;
                            a.V(mcnVar);
                            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                        } else {
                            a.X(true);
                            try {
                                mcnVar.run();
                                do {
                                } while (a.a0());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = s3q0.a;
                }
            }
            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : s3q0.a;
    }
}
