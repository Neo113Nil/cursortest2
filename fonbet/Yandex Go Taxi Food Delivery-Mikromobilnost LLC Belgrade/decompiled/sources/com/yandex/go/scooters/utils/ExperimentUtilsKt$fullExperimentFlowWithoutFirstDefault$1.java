package com.yandex.go.scooters.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.vn11;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.experiments.d;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvn11;", "T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.utils.ExperimentUtilsKt$fullExperimentFlowWithoutFirstDefault$1", f = "ExperimentUtils.kt", l = {13, 14, 16}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ExperimentUtilsKt$fullExperimentFlowWithoutFirstDefault$1 extends SuspendLambda implements wls {
    final /* synthetic */ vn11 $defaultValue;
    final /* synthetic */ t1b0 $this_fullExperimentFlowWithoutFirstDefault;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentUtilsKt$fullExperimentFlowWithoutFirstDefault$1(t1b0 t1b0Var, vn11 vn11Var, Continuation continuation) {
        super(2, continuation);
        this.$this_fullExperimentFlowWithoutFirstDefault = t1b0Var;
        this.$defaultValue = vn11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ExperimentUtilsKt$fullExperimentFlowWithoutFirstDefault$1 experimentUtilsKt$fullExperimentFlowWithoutFirstDefault$1 = new ExperimentUtilsKt$fullExperimentFlowWithoutFirstDefault$1(this.$this_fullExperimentFlowWithoutFirstDefault, this.$defaultValue, continuation);
        experimentUtilsKt$fullExperimentFlowWithoutFirstDefault$1.L$0 = obj;
        return experimentUtilsKt$fullExperimentFlowWithoutFirstDefault$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExperimentUtilsKt$fullExperimentFlowWithoutFirstDefault$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r8, r0, r7) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r8, r0, r7) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
    
        if (r8 == r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            t1b0 t1b0Var = this.$this_fullExperimentFlowWithoutFirstDefault;
            this.L$0 = vprVar;
            this.label = 1;
            obj = t1b0Var.b(this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        vn11 vn11Var = this.$defaultValue;
        t1b0 t1b0Var2 = this.$this_fullExperimentFlowWithoutFirstDefault;
        if (obj == vn11Var) {
            tpr a = t1b0Var2.a();
            this.L$0 = null;
            this.label = 2;
        } else {
            tpr b = d.b(t1b0Var2);
            this.L$0 = null;
            this.label = 3;
        }
    }
}
