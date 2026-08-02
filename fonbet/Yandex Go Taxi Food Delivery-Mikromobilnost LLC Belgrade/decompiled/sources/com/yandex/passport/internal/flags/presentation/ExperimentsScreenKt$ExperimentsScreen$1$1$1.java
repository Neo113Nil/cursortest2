package com.yandex.passport.internal.flags.presentation;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarResult;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s0t0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.flags.presentation.ExperimentsScreenKt$ExperimentsScreen$1$1$1", f = "ExperimentsScreen.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ExperimentsScreenKt$ExperimentsScreen$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ c0 $command;
    final /* synthetic */ Context $localContext;
    final /* synthetic */ sls $onExit;
    final /* synthetic */ androidx.compose.material3.y $snackbarHostState;
    final /* synthetic */ tls $wish;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsScreenKt$ExperimentsScreen$1$1$1(c0 c0Var, sls slsVar, androidx.compose.material3.y yVar, Context context, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$command = c0Var;
        this.$onExit = slsVar;
        this.$snackbarHostState = yVar;
        this.$localContext = context;
        this.$wish = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExperimentsScreenKt$ExperimentsScreen$1$1$1(this.$command, this.$onExit, this.$snackbarHostState, this.$localContext, this.$wish, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExperimentsScreenKt$ExperimentsScreen$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c0 c0Var = this.$command;
            if (c0Var instanceof z) {
                this.$onExit.invoke();
            } else if (c0Var instanceof a0) {
                androidx.compose.material3.y yVar = this.$snackbarHostState;
                SnackbarDuration snackbarDuration = SnackbarDuration.Long;
                this.label = 1;
                yVar.getClass();
                obj = yVar.a(new s0t0(snackbarDuration), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (!(c0Var instanceof b0)) {
                    w511.b();
                    return null;
                }
                Toast.makeText(this.$localContext, ((b0) c0Var).a, 1).show();
            }
            this.$wish.invoke(new e0(this.$command));
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int i2 = b1.a[((SnackbarResult) obj).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            Runtime.getRuntime().exit(0);
        }
        this.$wish.invoke(new e0(this.$command));
        return zy11.a;
    }
}
