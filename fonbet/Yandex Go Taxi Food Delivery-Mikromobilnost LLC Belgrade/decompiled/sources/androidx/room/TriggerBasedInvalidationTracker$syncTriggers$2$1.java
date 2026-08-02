package androidx.room;

import defpackage.mg01;
import defpackage.mvg;
import defpackage.nq60;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmg01;", "connection", "Lzy11;", "<anonymous>", "(Lmg01;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {307, 314}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TriggerBasedInvalidationTracker$syncTriggers$2$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$syncTriggers$2$1(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this.this$0, continuation);
        triggerBasedInvalidationTracker$syncTriggers$2$1.L$0 = obj;
        return triggerBasedInvalidationTracker$syncTriggers$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1) create((mg01) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x009b, code lost:
    
        if (r15 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0043, code lost:
    
        if (r8 == r2) goto L51;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mg01 mg01Var;
        Object c;
        nq60 nq60Var;
        ReentrantLock reentrantLock;
        ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr;
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp;
        nq60 nq60Var2;
        ReentrantLock reentrantLock2;
        boolean z;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z2 = false;
        if (i == 0) {
            kotlin.b.b(obj);
            mg01Var = (mg01) this.L$0;
            this.L$0 = mg01Var;
            this.label = 1;
            c = mg01Var.c(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                reentrantLock2 = (ReentrantLock) this.L$1;
                nq60Var2 = (nq60) this.L$0;
                try {
                    kotlin.b.b(obj);
                    reentrantLock = reentrantLock2;
                    nq60Var = nq60Var2;
                    nq60Var.f = false;
                    reentrantLock.unlock();
                    return zy11Var;
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    try {
                        nq60Var2.f = z;
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        reentrantLock = reentrantLock2;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
            }
            mg01Var = (mg01) this.L$0;
            kotlin.b.b(obj);
            c = obj;
        }
        if (((Boolean) c).booleanValue()) {
            return zy11Var;
        }
        o oVar = this.this$0;
        nq60Var = oVar.h;
        reentrantLock = nq60Var.e;
        reentrantLock.lock();
        try {
            nq60Var.f = true;
            ReentrantLock reentrantLock3 = nq60Var.a;
            reentrantLock3.lock();
            try {
                if (nq60Var.d) {
                    nq60Var.d = false;
                    int length = nq60Var.b.length;
                    observedTableStates$ObserveOpArr = new ObservedTableStates$ObserveOp[length];
                    int i2 = 0;
                    boolean z3 = false;
                    while (i2 < length) {
                        boolean z4 = nq60Var.b[i2] > 0 ? true : z2;
                        boolean[] zArr = nq60Var.c;
                        if (z4 != zArr[i2]) {
                            zArr[i2] = z4;
                            observedTableStates$ObserveOp = z4 ? ObservedTableStates$ObserveOp.ADD : ObservedTableStates$ObserveOp.REMOVE;
                            z3 = true;
                        } else {
                            observedTableStates$ObserveOp = ObservedTableStates$ObserveOp.NO_OP;
                        }
                        observedTableStates$ObserveOpArr[i2] = observedTableStates$ObserveOp;
                        i2++;
                        z2 = false;
                    }
                }
                observedTableStates$ObserveOpArr = null;
                if (observedTableStates$ObserveOpArr != null) {
                    try {
                        if (observedTableStates$ObserveOpArr.length != 0) {
                            Transactor$SQLiteTransactionType transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.IMMEDIATE;
                            TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 triggerBasedInvalidationTracker$syncTriggers$2$1$1$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(observedTableStates$ObserveOpArr, oVar, mg01Var, null);
                            this.L$0 = nq60Var;
                            this.L$1 = reentrantLock;
                            this.label = 2;
                            if (mg01Var.b(transactor$SQLiteTransactionType, triggerBasedInvalidationTracker$syncTriggers$2$1$1$1, this) != coroutineSingletons) {
                                nq60Var2 = nq60Var;
                                reentrantLock2 = reentrantLock;
                                reentrantLock = reentrantLock2;
                                nq60Var = nq60Var2;
                            }
                            return coroutineSingletons;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        nq60Var2 = nq60Var;
                        reentrantLock2 = reentrantLock;
                        z = false;
                        nq60Var2.f = z;
                        throw th;
                    }
                }
                nq60Var.f = false;
                reentrantLock.unlock();
                return zy11Var;
            } finally {
                reentrantLock3.unlock();
            }
        } catch (Throwable th4) {
            th = th4;
            reentrantLock.unlock();
            throw th;
        }
    }
}
