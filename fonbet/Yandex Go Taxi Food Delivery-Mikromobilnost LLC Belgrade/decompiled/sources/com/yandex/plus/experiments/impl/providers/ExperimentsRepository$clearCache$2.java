package com.yandex.plus.experiments.impl.providers;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.experiments.impl.providers.ExperimentsRepository$clearCache$2", f = "ExperimentsRepository.kt", l = {193, 101, 105}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ExperimentsRepository$clearCache$2 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsRepository$clearCache$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExperimentsRepository$clearCache$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExperimentsRepository$clearCache$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r9.i(r8) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (com.yandex.plus.experiments.impl.providers.a.c(r5, r8) == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        int i;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                kotlin.b.b(obj);
                a aVar2 = this.this$0;
                kotlinx.coroutines.sync.a aVar3 = aVar2.j;
                this.L$0 = aVar3;
                this.L$1 = aVar2;
                this.I$0 = 0;
                this.label = 1;
                if (aVar3.a(this) != coroutineSingletons) {
                    aVar = aVar2;
                    i = 0;
                    obj2 = aVar3;
                }
                return coroutineSingletons;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    if (r1 == 3) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g050 g050Var = (g050) this.L$0;
                kotlin.b.b(obj);
                r1 = g050Var;
                r1.d(null);
                if (((Number) this.this$0.k.j().getValue()).intValue() > 0) {
                    a aVar4 = this.this$0;
                    this.L$0 = null;
                    this.label = 3;
                }
                return zy11.a;
            }
            int i2 = this.I$0;
            aVar = (a) this.L$1;
            Object obj3 = (g050) this.L$0;
            kotlin.b.b(obj);
            i = i2;
            obj2 = obj3;
            this.L$0 = obj2;
            this.L$1 = null;
            this.I$0 = i;
            this.I$1 = 0;
            this.label = 2;
            r1 = obj2;
        } catch (Throwable th) {
            r1.d(null);
            throw th;
        }
    }
}
