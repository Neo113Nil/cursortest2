package com.yandex.go.something_wrong_screen.ui;

import com.yandex.go.something_wrong_screen.domain.entities.SomethingWrongScreenToggleTapSource;
import defpackage.l8t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v8t0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.something_wrong_screen.ui.SomethingWrongScreenPresenter$onToggleClick$1", f = "SomethingWrongScreenPresenter.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SomethingWrongScreenPresenter$onToggleClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isChecked;
    int label;
    final /* synthetic */ v8t0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SomethingWrongScreenPresenter$onToggleClick$1(v8t0 v8t0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = v8t0Var;
        this.$isChecked = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SomethingWrongScreenPresenter$onToggleClick$1(this.this$0, this.$isChecked, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SomethingWrongScreenPresenter$onToggleClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l8t0 l8t0Var = this.this$0.z;
            boolean z = this.$isChecked;
            SomethingWrongScreenToggleTapSource somethingWrongScreenToggleTapSource = SomethingWrongScreenToggleTapSource.MODAL_VIEW;
            this.label = 1;
            if (l8t0Var.a.d(z, somethingWrongScreenToggleTapSource, this) == coroutineSingletons) {
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
