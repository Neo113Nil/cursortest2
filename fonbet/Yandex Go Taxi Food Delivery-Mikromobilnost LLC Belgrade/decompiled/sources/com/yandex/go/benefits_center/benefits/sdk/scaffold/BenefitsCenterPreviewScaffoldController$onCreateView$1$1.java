package com.yandex.go.benefits_center.benefits.sdk.scaffold;

import com.yandex.go.flex.common.api.actions.CloseAction;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vn5;
import defpackage.wgr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.benefits_center.benefits.sdk.scaffold.BenefitsCenterPreviewScaffoldController$onCreateView$1$1", f = "BenefitsCenterPreviewScaffoldController.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BenefitsCenterPreviewScaffoldController$onCreateView$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ vn5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsCenterPreviewScaffoldController$onCreateView$1$1(vn5 vn5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vn5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BenefitsCenterPreviewScaffoldController$onCreateView$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BenefitsCenterPreviewScaffoldController$onCreateView$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            wgr wgrVar = this.this$0.b;
            CloseAction closeAction = new CloseAction();
            this.label = 1;
            if (wgrVar.a(closeAction, this) == coroutineSingletons) {
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
