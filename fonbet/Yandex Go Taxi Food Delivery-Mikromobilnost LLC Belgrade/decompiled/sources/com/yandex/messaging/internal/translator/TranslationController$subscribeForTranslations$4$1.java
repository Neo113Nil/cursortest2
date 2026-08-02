package com.yandex.messaging.internal.translator;

import defpackage.jyc;
import defpackage.kgx;
import defpackage.kse;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.op3;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.translator.TranslationController$subscribeForTranslations$4$1", f = "TranslationController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TranslationController$subscribeForTranslations$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ jyc $job;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationController$subscribeForTranslations$4$1(j jVar, jyc jycVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$job = jycVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TranslationController$subscribeForTranslations$4$1(this.this$0, this.$job, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TranslationController$subscribeForTranslations$4$1 translationController$subscribeForTranslations$4$1 = (TranslationController$subscribeForTranslations$4$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        translationController$subscribeForTranslations$4$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.m.remove(this.$job);
        j jVar = this.this$0;
        kse.a(jVar.a);
        ArrayList arrayList = jVar.m;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l8x l8xVar = (l8x) it.next();
                if (!l8xVar.k0() && !l8xVar.isCancelled()) {
                    break;
                }
            }
        }
        arrayList.clear();
        op3 op3Var = jVar.l;
        kgx kgxVar = j.n[0];
        op3Var.b(null);
        return zy11.a;
    }
}
