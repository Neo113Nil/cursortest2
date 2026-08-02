package com.yandex.go.navigator.main_screen;

import defpackage.gh00;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.mx0;
import defpackage.n1l0;
import defpackage.ny61;
import defpackage.o1l0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zb00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.main_screen.MainModalRouter$content$1$routeControlsUiActionHandler$1$1", f = "MainModalRouter.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainModalRouter$content$1$routeControlsUiActionHandler$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ o1l0 $it;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainModalRouter$content$1$routeControlsUiActionHandler$1$1(i iVar, o1l0 o1l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$it = o1l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainModalRouter$content$1$routeControlsUiActionHandler$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainModalRouter$content$1$routeControlsUiActionHandler$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zb00 zb00Var = this.this$0.H;
        o1l0 o1l0Var = this.$it;
        this.label = 1;
        com.yandex.go.navigator.analitycs.a aVar = zb00Var.f;
        if (jl40.l(o1l0Var, n1l0.b)) {
            aVar.f();
            obj2 = com.yandex.go.navigator.a.c(zb00Var.a, new mx0(6, zb00Var), this, 3);
        } else {
            if (jl40.l(o1l0Var, n1l0.a)) {
                aVar.e();
                ((gh00) zb00Var.b).w();
            } else if (!jl40.l(o1l0Var, n1l0.c)) {
                w511.b();
                return null;
            }
            obj2 = zy11Var;
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
