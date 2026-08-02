package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class gi extends SuspendLambda implements wzs {
    public final /* synthetic */ hi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(hi hiVar, spj spjVar) {
        super(2, spjVar);
        this.b = hiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new gi(this.b, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new gi(this.b, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        try {
            long b = ((uh1) this.b.e.a).b("ExitInfoAnrLastReportedTimestamp");
            hi hiVar = this.b;
            ei eiVar = hiVar.c;
            wf wfVar = hiVar.a;
            List a = eiVar.a(wfVar.b, wfVar.c, b);
            if (a.isEmpty()) {
                return s3q0.a;
            }
            this.b.g.getClass();
            ArrayList a2 = mf.a(a);
            if (a2.isEmpty()) {
                return s3q0.a;
            }
            ArrayList a3 = this.b.g.a(a2);
            if (a3.isEmpty()) {
                return s3q0.a;
            }
            this.b.d.a(a3);
            hi.a(this.b, a3);
            this.b.h.set(false);
            return s3q0.a;
        } finally {
            this.b.h.set(false);
        }
    }
}
