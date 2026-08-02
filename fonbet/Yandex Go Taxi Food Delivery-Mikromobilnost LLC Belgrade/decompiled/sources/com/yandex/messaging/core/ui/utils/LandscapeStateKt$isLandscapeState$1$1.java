package com.yandex.messaging.core.ui.utils;

import android.content.res.Configuration;
import androidx.compose.runtime.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rol0;
import defpackage.tse;
import defpackage.wls;
import defpackage.yow;
import defpackage.yw8;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.core.ui.utils.LandscapeStateKt$isLandscapeState$1$1", f = "LandscapeState.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class LandscapeStateKt$isLandscapeState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Configuration $configuration;
    final /* synthetic */ oz40 $isLandscape;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandscapeStateKt$isLandscapeState$1$1(Configuration configuration, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$configuration = configuration;
        this.$isLandscape = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LandscapeStateKt$isLandscapeState$1$1(this.$configuration, this.$isLandscape, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LandscapeStateKt$isLandscapeState$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            b.b(obj);
            rol0 o = f.o(new yow(10, this.$configuration));
            yw8 yw8Var = new yw8(i2, this.$isLandscape);
            this.label = 1;
            if (o.collect(yw8Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
