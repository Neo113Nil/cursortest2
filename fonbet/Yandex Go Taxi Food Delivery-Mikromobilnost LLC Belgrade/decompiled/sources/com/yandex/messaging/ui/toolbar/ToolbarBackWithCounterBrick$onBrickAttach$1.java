package com.yandex.messaging.ui.toolbar;

import android.view.View;
import com.yandex.messaging.views.CounterTextView;
import defpackage.ewh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.tz10;
import defpackage.wls;
import defpackage.x221;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx221;", "info", "Lzy11;", "<anonymous>", "(Lx221;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.toolbar.ToolbarBackWithCounterBrick$onBrickAttach$1", f = "ToolbarBackWithCounterBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ToolbarBackWithCounterBrick$onBrickAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarBackWithCounterBrick$onBrickAttach$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ToolbarBackWithCounterBrick$onBrickAttach$1 toolbarBackWithCounterBrick$onBrickAttach$1 = new ToolbarBackWithCounterBrick$onBrickAttach$1(this.this$0, continuation);
        toolbarBackWithCounterBrick$onBrickAttach$1.L$0 = obj;
        return toolbarBackWithCounterBrick$onBrickAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ToolbarBackWithCounterBrick$onBrickAttach$1 toolbarBackWithCounterBrick$onBrickAttach$1 = (ToolbarBackWithCounterBrick$onBrickAttach$1) create((x221) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        toolbarBackWithCounterBrick$onBrickAttach$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        x221 x221Var = (x221) this.L$0;
        int i = this.this$0.z.a(tz10.j) ? x221Var.b : x221Var.a;
        ((CounterTextView) this.this$0.A.getValue()).setCount(i);
        View view = this.this$0.getView();
        a aVar = this.this$0;
        view.setContentDescription(i > 0 ? aVar.getView().getContext().getResources().getQuantityString(ewh0.back_button_with_unread_content_desc, i, new Integer(i)) : aVar.getView().getContext().getString(oyh0.back_button_content_desc));
        return zy11.a;
    }
}
