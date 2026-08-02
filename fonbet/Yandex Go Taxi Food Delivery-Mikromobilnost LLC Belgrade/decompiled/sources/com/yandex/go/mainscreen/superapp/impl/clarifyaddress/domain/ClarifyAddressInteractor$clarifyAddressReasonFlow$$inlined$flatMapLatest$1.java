package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.f2t;
import defpackage.g92;
import defpackage.hay0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.owz0;
import defpackage.r0t;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.ClarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$flatMapLatest$1", f = "ClarifyAddressInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ClarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$flatMapLatest$1(f fVar, Continuation continuation) {
        super(3, continuation);
        this.receiver$inlined = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ClarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$flatMapLatest$1 clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$flatMapLatest$1 = new ClarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$flatMapLatest$1(this.receiver$inlined, (Continuation) obj3);
        clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r0t r0tVar = (r0t) obj2;
            f fVar = this.receiver$inlined;
            hay0 hay0Var = fVar.c;
            if (r0tVar == null) {
                g92Var = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.persuggest.source.j(((f2t) hay0Var.a).h)), new ClarifyAddressInteractor$unsupportedAddressFlow$$inlined$flatMapLatest$1(fVar, null));
            } else {
                Boolean bool = hay0Var.b.a(r0tVar).a;
                g92Var = bool != null ? bool.booleanValue() : false ? new g92(2, null) : new g92(2, new owz0(hay0Var.b.a(r0tVar).b));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
