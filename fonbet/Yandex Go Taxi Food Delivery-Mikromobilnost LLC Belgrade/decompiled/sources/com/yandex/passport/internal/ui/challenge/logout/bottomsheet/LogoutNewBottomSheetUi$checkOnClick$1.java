package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutNewBottomSheetUi$checkOnClick$1", f = "LogoutNewBottomSheetUi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LogoutNewBottomSheetUi$checkOnClick$1 extends SuspendLambda implements tls {
    final /* synthetic */ ViewGroup $parent;
    final /* synthetic */ View $this_checkOnClick;
    int label;
    final /* synthetic */ q1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutNewBottomSheetUi$checkOnClick$1(q1 q1Var, View view, ViewGroup viewGroup, Continuation continuation) {
        super(1, continuation);
        this.this$0 = q1Var;
        this.$this_checkOnClick = view;
        this.$parent = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LogoutNewBottomSheetUi$checkOnClick$1(this.this$0, this.$this_checkOnClick, this.$parent, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        LogoutNewBottomSheetUi$checkOnClick$1 logoutNewBottomSheetUi$checkOnClick$1 = (LogoutNewBottomSheetUi$checkOnClick$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        logoutNewBottomSheetUi$checkOnClick$1.invokeSuspend(zy11Var);
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
        q1 q1Var = this.this$0;
        View view = this.$this_checkOnClick;
        q1Var.getClass();
        q1.f(view, true);
        ViewGroup viewGroup = this.$parent;
        View view2 = this.$this_checkOnClick;
        q1 q1Var2 = this.this$0;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return zy11.a;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return null;
            }
            if (childAt.getId() != view2.getId()) {
                q1Var2.getClass();
                q1.f(childAt, !q1.c(view2));
            }
            i = i2;
        }
    }
}
