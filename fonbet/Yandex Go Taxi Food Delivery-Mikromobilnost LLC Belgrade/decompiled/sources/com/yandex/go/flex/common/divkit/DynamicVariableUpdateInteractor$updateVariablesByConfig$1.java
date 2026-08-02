package com.yandex.go.flex.common.divkit;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.divkit.DynamicVariableUpdateInteractor$updateVariablesByConfig$1", f = "DynamicVariableUpdateInteractor.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DynamicVariableUpdateInteractor$updateVariablesByConfig$1 extends SuspendLambda implements wls {
    final /* synthetic */ DynamicVariableUpdateInteractor$updateVariablesByConfig$configurationCallback$1 $configurationCallback;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicVariableUpdateInteractor$updateVariablesByConfig$1(a aVar, DynamicVariableUpdateInteractor$updateVariablesByConfig$configurationCallback$1 dynamicVariableUpdateInteractor$updateVariablesByConfig$configurationCallback$1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$configurationCallback = dynamicVariableUpdateInteractor$updateVariablesByConfig$configurationCallback$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicVariableUpdateInteractor$updateVariablesByConfig$1(this.this$0, this.$configurationCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicVariableUpdateInteractor$updateVariablesByConfig$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                this.this$0.a.registerComponentCallbacks(this.$configurationCallback);
                this.label = 1;
                if (kotlinx.coroutines.a.d(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.this$0.a.unregisterComponentCallbacks(this.$configurationCallback);
            throw th;
        }
    }
}
