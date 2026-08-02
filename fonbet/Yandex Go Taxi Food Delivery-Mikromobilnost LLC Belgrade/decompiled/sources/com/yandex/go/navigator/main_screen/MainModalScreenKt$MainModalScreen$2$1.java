package com.yandex.go.navigator.main_screen;

import defpackage.gp5;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t24;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u700;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.main_screen.MainModalScreenKt$MainModalScreen$2$1", f = "MainModalScreen.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainModalScreenKt$MainModalScreen$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ wg6 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainModalScreenKt$MainModalScreen$2$1(wg6 wg6Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$action = tlsVar;
        this.$state = wg6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainModalScreenKt$MainModalScreen$2$1(this.$state, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainModalScreenKt$MainModalScreen$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.$action.invoke(u700.a);
            tpr t = kotlinx.coroutines.flow.e.t(new mth(androidx.compose.runtime.f.o(new gp5(this.$state, 7)), 6));
            t24 t24Var = new t24(6, this.$action);
            this.label = 1;
            if (t.collect(t24Var, this) == coroutineSingletons) {
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
