package com.yandex.go.intentprocessor;

import defpackage.hxx;
import defpackage.ire0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intentprocessor.LocationDependentIntentInteractorImpl$handleRouteIntent$1", f = "LocationDependentIntentInteractorImpl.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LocationDependentIntentInteractorImpl$handleRouteIntent$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDependentIntentInteractorImpl$handleRouteIntent$1(i iVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LocationDependentIntentInteractorImpl$handleRouteIntent$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((LocationDependentIntentInteractorImpl$handleRouteIntent$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0;
            if (iVar.c.a != null) {
                this.label = 1;
                obj = i.a(iVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i iVar2 = this.this$0;
        if (booleanValue) {
            iVar2.c();
            return zy11Var;
        }
        if (!iVar2.b.a()) {
            i iVar3 = this.this$0;
            ((pep0) iVar3.j).f((m950) iVar3.h.get(), ire0.a, hxx.a);
            return zy11Var;
        }
        return zy11Var;
    }
}
