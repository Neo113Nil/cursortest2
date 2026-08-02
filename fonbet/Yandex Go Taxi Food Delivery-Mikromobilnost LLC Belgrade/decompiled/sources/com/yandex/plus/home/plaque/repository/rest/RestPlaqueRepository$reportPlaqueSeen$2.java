package com.yandex.plus.home.plaque.repository.rest;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.plus.home.datasource.openapi.apis.CrossPlaqueControllerApi;
import com.yandex.plus.log.api.LogPriority;
import defpackage.e6d0;
import defpackage.eo2;
import defpackage.jy50;
import defpackage.l6d0;
import defpackage.m6d0;
import defpackage.mvg;
import defpackage.n270;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Le6d0;", "Lzy11;", "<anonymous>", "(Ltse;)Le6d0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$reportPlaqueSeen$2", f = "RestPlaqueRepository.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RestPlaqueRepository$reportPlaqueSeen$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $feedbackToken;
    final /* synthetic */ String $seenContext;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestPlaqueRepository$reportPlaqueSeen$2(b bVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$feedbackToken = str;
        this.$seenContext = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RestPlaqueRepository$reportPlaqueSeen$2(this.this$0, this.$feedbackToken, this.$seenContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RestPlaqueRepository$reportPlaqueSeen$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eo2 eo2Var;
        l6d0 l6d0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            eo2 eo2Var2 = (eo2) this.this$0.j.invoke();
            jy50 jy50Var = new jy50(this.$feedbackToken, this.$seenContext);
            pgz pgzVar = this.this$0.m;
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "RestPlaqueRepository", "reportPlaqueSeen() request=" + jy50Var);
            }
            n270 n270Var = (n270) eo2Var2;
            n270Var.c();
            CrossPlaqueControllerApi crossPlaqueControllerApi = this.this$0.a;
            this.L$0 = n270Var;
            this.L$1 = null;
            l6d0 l6d0Var2 = l6d0.a;
            this.L$2 = l6d0Var2;
            this.label = 1;
            Object b = crossPlaqueControllerApi.b(jy50Var, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            eo2Var = n270Var;
            obj = b;
            l6d0Var = l6d0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l6d0Var = (l6d0) this.L$2;
            eo2Var = (eo2) this.L$0;
            kotlin.b.b(obj);
        }
        e6d0 e6d0Var = (e6d0) obj;
        m6d0 m6d0Var = this.this$0.c;
        l6d0Var.getClass();
        m6d0Var.a(e6d0Var);
        boolean z = e6d0Var instanceof e6d0.b;
        if (z) {
            eo2.a(eo2Var);
        } else if (!(e6d0Var instanceof e6d0.a)) {
            w511.b();
            return null;
        }
        if (z) {
            return e6d0Var;
        }
        if (e6d0Var instanceof e6d0.a) {
            ((n270) eo2Var).b();
            return e6d0Var;
        }
        w511.b();
        return null;
    }
}
