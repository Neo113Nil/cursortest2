package com.ybsdk.core.utils.ext.view;

import android.view.View;
import defpackage.hh31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.phd;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Landroid/view/View;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.utils.ext.view.ViewExtensionsKt$globalLayouts$1", f = "ViewExtensions.kt", l = {438}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ViewExtensionsKt$globalLayouts$1 extends SuspendLambda implements wls {
    final /* synthetic */ View $this_globalLayouts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewExtensionsKt$globalLayouts$1(View view, Continuation continuation) {
        super(2, continuation);
        this.$this_globalLayouts = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ViewExtensionsKt$globalLayouts$1 viewExtensionsKt$globalLayouts$1 = new ViewExtensionsKt$globalLayouts$1(this.$this_globalLayouts, continuation);
        viewExtensionsKt$globalLayouts$1.L$0 = obj;
        return viewExtensionsKt$globalLayouts$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewExtensionsKt$globalLayouts$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            View view = this.$this_globalLayouts;
            phd phdVar = new phd(y6f0Var, view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(phdVar);
            hh31 hh31Var = new hh31(7, this.$this_globalLayouts, phdVar);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, hh31Var, this) == coroutineSingletons) {
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
