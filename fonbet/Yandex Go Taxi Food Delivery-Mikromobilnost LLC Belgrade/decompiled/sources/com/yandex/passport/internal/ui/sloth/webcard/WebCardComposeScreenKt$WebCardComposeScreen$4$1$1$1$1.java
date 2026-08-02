package com.yandex.passport.internal.ui.sloth.webcard;

import android.os.Build;
import android.view.Window;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o751;
import defpackage.oz40;
import defpackage.p751;
import defpackage.q751;
import defpackage.tse;
import defpackage.va90;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeScreenKt$WebCardComposeScreen$4$1$1$1$1", f = "WebCardComposeScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebCardComposeScreenKt$WebCardComposeScreen$4$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $webCardDisplayProperties$delegate;
    final /* synthetic */ Window $window;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCardComposeScreenKt$WebCardComposeScreen$4$1$1$1$1(Window window, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$window = window;
        this.$webCardDisplayProperties$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebCardComposeScreenKt$WebCardComposeScreen$4$1$1$1$1(this.$window, this.$webCardDisplayProperties$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebCardComposeScreenKt$WebCardComposeScreen$4$1$1$1$1 webCardComposeScreenKt$WebCardComposeScreen$4$1$1$1$1 = (WebCardComposeScreenKt$WebCardComposeScreen$4$1$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webCardComposeScreenKt$WebCardComposeScreen$4$1$1$1$1.invokeSuspend(zy11Var);
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
        boolean z = false;
        boolean l = jl40.l((h0) this.$webCardDisplayProperties$delegate.getValue(), new h0(0));
        boolean z2 = !l;
        Window window = this.$window;
        if (window != null) {
            Boolean valueOf = l ? null : Boolean.valueOf(z2);
            if (valueOf != null) {
                z = valueOf.booleanValue();
            } else if ((window.getDecorView().getResources().getConfiguration().uiMode & 48) == 32) {
                z = true;
            }
            va90 va90Var = new va90(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
            boolean z3 = !z;
            q751Var.U(z3);
            q751Var.T(z3);
        }
        return zy11.a;
    }
}
