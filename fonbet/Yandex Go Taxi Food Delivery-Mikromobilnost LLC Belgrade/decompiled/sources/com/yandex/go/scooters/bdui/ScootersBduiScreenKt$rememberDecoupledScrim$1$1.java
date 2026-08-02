package com.yandex.go.scooters.bdui;

import androidx.compose.runtime.f;
import defpackage.gr5;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.p9g0;
import defpackage.rol0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.bdui.ScootersBduiScreenKt$rememberDecoupledScrim$1$1", f = "ScootersBduiScreen.kt", l = {HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersBduiScreenKt$rememberDecoupledScrim$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $closing$delegate;
    final /* synthetic */ m3u0 $offsetVisibility$delegate;
    final /* synthetic */ androidx.compose.animation.core.a $scrimAlpha;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersBduiScreenKt$rememberDecoupledScrim$1$1(m3u0 m3u0Var, androidx.compose.animation.core.a aVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$offsetVisibility$delegate = m3u0Var;
        this.$scrimAlpha = aVar;
        this.$closing$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersBduiScreenKt$rememberDecoupledScrim$1$1(this.$offsetVisibility$delegate, this.$scrimAlpha, this.$closing$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersBduiScreenKt$rememberDecoupledScrim$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = f.o(new gr5(this.$offsetVisibility$delegate, 6));
            p9g0 p9g0Var = new p9g0(6, this.$scrimAlpha, this.$closing$delegate);
            this.label = 1;
            if (o.collect(p9g0Var, this) == coroutineSingletons) {
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
