package com.yx360.design.compose.atoms.snackbar;

import android.view.View;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ysm;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yx360.design.compose.atoms.snackbar.DsSnackbar_androidKt$SnackbarAccessibilityEffect$1$1", f = "DsSnackbar.android.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DsSnackbar_androidKt$SnackbarAccessibilityEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $buttonText;
    final /* synthetic */ ysm $state;
    final /* synthetic */ String $title;
    final /* synthetic */ View $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsSnackbar_androidKt$SnackbarAccessibilityEffect$1$1(ysm ysmVar, String str, View view, String str2, Continuation continuation) {
        super(2, continuation);
        this.$state = ysmVar;
        this.$buttonText = str;
        this.$view = view;
        this.$title = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DsSnackbar_androidKt$SnackbarAccessibilityEffect$1$1(this.$state, this.$buttonText, this.$view, this.$title, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DsSnackbar_androidKt$SnackbarAccessibilityEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((Boolean) this.$state.a.getValue()).booleanValue()) {
                this.label = 1;
                if (kotlinx.coroutines.a.i(100L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = this.$buttonText;
        View view = this.$view;
        String str2 = this.$title;
        if (str != null) {
            view.announceForAccessibility(str2 + ". " + str);
        } else {
            view.announceForAccessibility(str2);
        }
        return zy11.a;
    }
}
