package androidx.room;

import defpackage.mg01;
import defpackage.mvg;
import defpackage.ne11;
import defpackage.ny61;
import defpackage.re01;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lre01;", "Lzy11;", "<anonymous>", "(Lre01;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", f = "InvalidationTracker.kt", l = {318, 319}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ mg01 $connection;
    final /* synthetic */ ObservedTableStates$ObserveOp[] $tablesToSync;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr, o oVar, mg01 mg01Var, Continuation continuation) {
        super(2, continuation);
        this.$tablesToSync = observedTableStates$ObserveOpArr;
        this.this$0 = oVar;
        this.$connection = mg01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(this.$tablesToSync, this.this$0, this.$connection, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1) create((re01) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (androidx.room.o.c(r8, r13, r7, r12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        r7 = r13;
        r6 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0081 -> B:10:0x0082). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr;
        o oVar;
        mg01 mg01Var;
        int i2;
        int i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            kotlin.b.b(obj);
            ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr2 = this.$tablesToSync;
            o oVar2 = this.this$0;
            mg01 mg01Var2 = this.$connection;
            int length = observedTableStates$ObserveOpArr2.length;
            i = 0;
            observedTableStates$ObserveOpArr = observedTableStates$ObserveOpArr2;
            oVar = oVar2;
            mg01Var = mg01Var2;
            i2 = length;
            i3 = 0;
            if (i3 >= i2) {
            }
        } else {
            if (i4 != 1 && i4 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$2;
            i3 = this.I$1;
            int i5 = this.I$0;
            mg01 mg01Var3 = (mg01) this.L$2;
            oVar = (o) this.L$1;
            observedTableStates$ObserveOpArr = (ObservedTableStates$ObserveOp[]) this.L$0;
            kotlin.b.b(obj);
            mg01Var = mg01Var3;
            i = i5;
            i3++;
            if (i3 >= i2) {
                int i6 = i + 1;
                int i7 = ne11.a[observedTableStates$ObserveOpArr[i3].ordinal()];
                if (i7 == 1) {
                    i = i6;
                    i3++;
                    if (i3 >= i2) {
                        return zy11.a;
                    }
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            w511.b();
                            return null;
                        }
                        this.L$0 = observedTableStates$ObserveOpArr;
                        this.L$1 = oVar;
                        this.L$2 = mg01Var;
                        this.I$0 = i6;
                        this.I$1 = i3;
                        this.I$2 = i2;
                        this.label = 2;
                        if (o.d(oVar, mg01Var, i, this) != coroutineSingletons) {
                            mg01Var3 = mg01Var;
                            i5 = i6;
                            mg01Var = mg01Var3;
                            i = i5;
                        }
                        return coroutineSingletons;
                    }
                    this.L$0 = observedTableStates$ObserveOpArr;
                    this.L$1 = oVar;
                    this.L$2 = mg01Var;
                    this.I$0 = i6;
                    this.I$1 = i3;
                    this.I$2 = i2;
                    this.label = 1;
                    i3++;
                    if (i3 >= i2) {
                    }
                }
            }
        }
    }
}
