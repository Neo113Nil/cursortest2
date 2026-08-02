package com.yandex.go.flex.common.data.bdui;

import defpackage.ku00;
import defpackage.kwu;
import defpackage.meu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omt;
import defpackage.pmt;
import defpackage.qjr;
import defpackage.qmt;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4j0;
import defpackage.ysu0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Livj0;", "<anonymous>", "(Ltse;)Livj0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.data.bdui.GoBDUIClient$executeRequest$3", f = "GoBDUIClient.kt", l = {111}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class GoBDUIClient$executeRequest$3 extends SuspendLambda implements wls {
    final /* synthetic */ ku00 $listener;
    final /* synthetic */ qmt $request;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoBDUIClient$executeRequest$3(b bVar, qmt qmtVar, ku00 ku00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$request = qmtVar;
        this.$listener = ku00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoBDUIClient$executeRequest$3(this.this$0, this.$request, this.$listener, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoBDUIClient$executeRequest$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        qmt qmtVar = this.$request;
        ku00 ku00Var = this.$listener;
        this.label = 1;
        bVar.getClass();
        kwu kwuVar = ((pmt) qmtVar).a;
        meu meuVar = ((pmt) qmtVar).b;
        if (!(qmtVar instanceof pmt)) {
            w511.b();
            return null;
        }
        pmt pmtVar = (pmt) qmtVar;
        x4j0 x4j0Var = new x4j0(kwuVar, meuVar, new ysu0(pmtVar.d, pmtVar.c));
        ArrayList o0 = kotlin.collections.a.o0(bVar.f, new a(qmtVar, bVar, ku00Var));
        Object a = ((qjr) o0.get(0)).a(new omt(o0, 1, x4j0Var), this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
