package com.yandex.go.navigator.main_screen;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rfb1;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.x700;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.main_screen.MainModalScreenKt$MainModalScreen$3$1", f = "MainModalScreen.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainModalScreenKt$MainModalScreen$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $anchoredTarget;
    final /* synthetic */ wg6 $state;
    final /* synthetic */ x700 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainModalScreenKt$MainModalScreen$3$1(x700 x700Var, wg6 wg6Var, int i, Continuation continuation) {
        super(2, continuation);
        this.$uiState = x700Var;
        this.$state = wg6Var;
        this.$anchoredTarget = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainModalScreenKt$MainModalScreen$3$1(this.$uiState, this.$state, this.$anchoredTarget, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainModalScreenKt$MainModalScreen$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$uiState.d) {
                int b = rfb1.b(this.$state);
                int i2 = this.$anchoredTarget;
                if (b != i2) {
                    wg6 wg6Var = this.$state;
                    this.label = 1;
                    if (com.yandex.go.design.compose.modal.bottomsheet.c.d(wg6Var, i2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
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
