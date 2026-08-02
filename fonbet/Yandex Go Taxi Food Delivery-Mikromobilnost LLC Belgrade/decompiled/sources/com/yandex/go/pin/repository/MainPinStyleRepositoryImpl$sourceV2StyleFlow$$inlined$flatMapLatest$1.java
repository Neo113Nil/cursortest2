package com.yandex.go.pin.repository;

import defpackage.fnx0;
import defpackage.g92;
import defpackage.ha2;
import defpackage.i1c0;
import defpackage.kb5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.DeliveryPinType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.repository.MainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1", f = "MainPinStyleRepositoryImpl.kt", l = {216, 228, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class MainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1(o oVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = oVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1 mainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1 = new MainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        mainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return mainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f8, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r10, r1, r9) != r2) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var;
        kb5 kb5Var;
        vpr vprVar;
        tpr g92Var;
        vpr vprVar2;
        vpr vprVar3 = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fnx0Var = (fnx0) obj2;
            kb5 kb5Var2 = fnx0Var.e;
            com.yandex.go.pin.interactor.a aVar = this.this$0.e;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar3;
            this.L$3 = null;
            this.L$4 = fnx0Var;
            this.L$5 = kb5Var2;
            this.label = 1;
            Object a = aVar.a(kb5Var2, this);
            if (a != coroutineSingletons) {
                kb5Var = kb5Var2;
                obj = a;
                vprVar = vprVar3;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kb5Var = (kb5) this.L$5;
            fnx0Var = (fnx0) this.L$4;
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g92Var = (tpr) this.L$8;
            vprVar2 = (vpr) this.L$2;
            kotlin.b.b(obj);
            ha2 n = kotlinx.coroutines.flow.e.n(g92Var, new g92(2, obj), ((com.yandex.go.summary.branding_pin.i) this.this$0.i).c(), new MainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1(this.this$0, null));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.label = 3;
        }
        i1c0 i1c0Var = (i1c0) obj;
        g92Var = i1c0Var != null ? new g92(2, i1c0Var) : new j(((ru.yandex.taxi.styling.f) this.this$0.c).d(new g92(2, kb5Var)), this.this$0);
        ru.yandex.taxi.delivery.pin.k kVar = this.this$0.g;
        pex0 pex0Var = fnx0Var.c;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = vprVar;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = g92Var;
        this.label = 2;
        kVar.getClass();
        obj = pex0Var != null ? kVar.d(pex0Var, DeliveryPinType.MAP_SOURCE, this) : null;
        if (obj != coroutineSingletons) {
            vprVar2 = vprVar;
            ha2 n2 = kotlinx.coroutines.flow.e.n(g92Var, new g92(2, obj), ((com.yandex.go.summary.branding_pin.i) this.this$0.i).c(), new MainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1(this.this$0, null));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
