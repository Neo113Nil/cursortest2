package com.yandex.go.flex.main_screen.utils;

import android.view.View;
import defpackage.ate0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.tje;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lt1w;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.utils.ViewExtensionsKt$insetsFlow$1", f = "ViewExtensions.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ViewExtensionsKt$insetsFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ View $this_insetsFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewExtensionsKt$insetsFlow$1(View view, Continuation continuation) {
        super(2, continuation);
        this.$this_insetsFlow = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ViewExtensionsKt$insetsFlow$1 viewExtensionsKt$insetsFlow$1 = new ViewExtensionsKt$insetsFlow$1(this.$this_insetsFlow, continuation);
        viewExtensionsKt$insetsFlow$1.L$0 = obj;
        return viewExtensionsKt$insetsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewExtensionsKt$insetsFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            oay0 oay0Var = new oay0(14, tje.i(this.$this_insetsFlow, 119, new ate0(28, y6f0Var)));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, oay0Var, this) == coroutineSingletons) {
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
