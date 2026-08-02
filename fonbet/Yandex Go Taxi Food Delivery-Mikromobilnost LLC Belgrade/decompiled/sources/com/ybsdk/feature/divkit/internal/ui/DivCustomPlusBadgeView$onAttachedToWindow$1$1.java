package com.ybsdk.feature.divkit.internal.ui;

import defpackage.mpk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.divkit.internal.ui.DivCustomPlusBadgeView$onAttachedToWindow$1$1", f = "DivCustomPlusBadgeViewAdapter.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DivCustomPlusBadgeView$onAttachedToWindow$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ mpk $dependencies;
    int label;
    final /* synthetic */ DivCustomPlusBadgeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivCustomPlusBadgeView$onAttachedToWindow$1$1(DivCustomPlusBadgeView divCustomPlusBadgeView, mpk mpkVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = divCustomPlusBadgeView;
        this.$dependencies = mpkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivCustomPlusBadgeView$onAttachedToWindow$1$1(this.this$0, this.$dependencies, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivCustomPlusBadgeView$onAttachedToWindow$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object createAndAddPlusPlaqueView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            DivCustomPlusBadgeView divCustomPlusBadgeView = this.this$0;
            mpk mpkVar = this.$dependencies;
            this.label = 1;
            createAndAddPlusPlaqueView = divCustomPlusBadgeView.createAndAddPlusPlaqueView(mpkVar, this);
            if (createAndAddPlusPlaqueView == coroutineSingletons) {
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
