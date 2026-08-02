package com.yandex.plus.experiments.impl.providers;

import defpackage.j5d0;
import defpackage.k2d0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q1d0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lk2d0;", "<anonymous>", "(Ltse;)Lk2d0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.experiments.impl.providers.ExperimentsRepository$getOrUpdateExperimentsDeferred$2$2", f = "ExperimentsRepository.kt", l = {130, 188, HProv.PP_CONTAINER_DEFAULT, HProv.PP_LCD_QUERY}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ExperimentsRepository$getOrUpdateExperimentsDeferred$2$2 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsRepository$getOrUpdateExperimentsDeferred$2$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExperimentsRepository$getOrUpdateExperimentsDeferred$2$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExperimentsRepository$getOrUpdateExperimentsDeferred$2$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r7 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if (r8 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        if (r8 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        if (r8 == r0) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            k2d0 k2d0Var = (k2d0) this.this$0.i.getValue();
            if (k2d0Var != null) {
                return k2d0Var;
            }
            com.yandex.plus.experiments.api.cooldown.a aVar2 = this.this$0.g;
            this.label = 1;
            obj = aVar2.b(this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else if (i == 2) {
            aVar = (a) this.L$0;
            kotlin.b.b(obj);
            q1d0 q1d0Var = (q1d0) obj;
            if (q1d0Var != null) {
                Object a2 = aVar.d.a(q1d0Var);
                r0 r0Var = aVar.k;
                j5d0 j5d0Var = new j5d0(a2 instanceof Result.Failure ? null : a2);
                r0Var.getClass();
                r0Var.m(null, j5d0Var);
                kotlin.b.b(a2);
                return a2;
            }
            a aVar3 = this.this$0;
            this.L$0 = null;
            this.label = 3;
            obj = a.b(aVar3, this);
        } else {
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                kotlin.b.b(a);
                return a;
            }
            kotlin.b.b(obj);
            k2d0 k2d0Var2 = (k2d0) obj;
            if (k2d0Var2 != null) {
                return k2d0Var2;
            }
            a aVar4 = this.this$0;
            this.label = 4;
            a = a.a(aVar4, this);
        }
        if (((Boolean) obj).booleanValue()) {
            ny61.r("Experiments on cooldown");
            return null;
        }
        aVar = this.this$0;
        com.yandex.plus.experiments.api.cache.a aVar5 = aVar.f;
        this.L$0 = aVar;
        this.I$0 = 0;
        this.label = 2;
        obj = com.yandex.plus.experiments.api.cache.a.d(aVar5, this);
    }
}
