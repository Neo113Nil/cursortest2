package com.yandex.messaging.miniapps.js;

import defpackage.dqv;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rh20;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.miniapps.js.MiniAppJsInterface$receiveMessage$2", f = "MiniAppJsInterface.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class MiniAppJsInterface$receiveMessage$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $innerType;
    final /* synthetic */ dqv $message;
    int label;
    final /* synthetic */ MiniAppJsInterface this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppJsInterface$receiveMessage$2(MiniAppJsInterface miniAppJsInterface, String str, dqv dqvVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = miniAppJsInterface;
        this.$innerType = str;
        this.$message = dqvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MiniAppJsInterface$receiveMessage$2(this.this$0, this.$innerType, this.$message, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MiniAppJsInterface$receiveMessage$2 miniAppJsInterface$receiveMessage$2 = (MiniAppJsInterface$receiveMessage$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        miniAppJsInterface$receiveMessage$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = this.this$0.c;
        String str = this.$innerType;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            rh20 rh20Var = (rh20) next;
            if (jl40.l(rh20Var.a.getValue(), str) && !rh20Var.d) {
                arrayList2.add(next);
            }
        }
        dqv dqvVar = this.$message;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            rh20 rh20Var2 = (rh20) it2.next();
            rh20Var2.a(dqvVar);
            if (rh20Var2.b) {
                linkedHashSet.add(rh20Var2);
            }
        }
        this.this$0.c.removeAll(linkedHashSet);
        return zy11.a;
    }
}
