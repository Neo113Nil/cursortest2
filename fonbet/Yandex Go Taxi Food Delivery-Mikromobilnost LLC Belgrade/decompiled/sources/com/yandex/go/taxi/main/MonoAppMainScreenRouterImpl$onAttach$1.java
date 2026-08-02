package com.yandex.go.taxi.main;

import defpackage.a5y0;
import defpackage.gse0;
import defpackage.jse0;
import defpackage.m630;
import defpackage.mvg;
import defpackage.n630;
import defpackage.ny61;
import defpackage.o630;
import defpackage.p630;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.main.MonoAppMainScreenRouterImpl$onAttach$1", f = "MonoAppMainScreenRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MonoAppMainScreenRouterImpl$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ p630 $payload;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonoAppMainScreenRouterImpl$onAttach$1(p630 p630Var, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = p630Var;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MonoAppMainScreenRouterImpl$onAttach$1(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MonoAppMainScreenRouterImpl$onAttach$1 monoAppMainScreenRouterImpl$onAttach$1 = (MonoAppMainScreenRouterImpl$onAttach$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        monoAppMainScreenRouterImpl$onAttach$1.invokeSuspend(zy11Var);
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
        p630 p630Var = this.$payload;
        boolean z = p630Var instanceof n630;
        f fVar = this.this$0;
        if (z) {
            fVar.R(((n630) p630Var).a);
        } else if (!fVar.E.a.Kg() && this.this$0.F.a()) {
            f.Q(this.this$0, gse0.a, "launch with unauthorized user and preload");
        } else if (this.this$0.E.a.Kg()) {
            p630 p630Var2 = this.$payload;
            boolean z2 = p630Var2 instanceof o630;
            f fVar2 = this.this$0;
            if (z2) {
                fVar2.S(((o630) p630Var2).a);
            } else if (p630Var2 instanceof m630) {
                boolean e = fVar2.G.e();
                f fVar3 = this.this$0;
                if (e) {
                    fVar3.S(new a5y0("back to main from delivery order details", null, null, 14));
                } else {
                    f.Q(fVar3, new jse0(), "back to main screen");
                }
            } else {
                f.Q(fVar2, new jse0(), "back to main screen");
            }
        } else {
            f.Q(this.this$0, new jse0(), "back to main screen with unauthorized user");
        }
        return zy11.a;
    }
}
