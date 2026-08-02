package com.yandex.go.places.flex.container.ui;

import com.yandex.go.places.flex.container.domain.interactors.a;
import defpackage.b9c0;
import defpackage.k8c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8c0;
import defpackage.tse;
import defpackage.wls;
import defpackage.y8c0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.flex.container.ui.PlacesFlexContainerScreenPresenter$loadDocumentByPath$1", f = "PlacesFlexContainerScreenPresenter.kt", l = {187}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesFlexContainerScreenPresenter$loadDocumentByPath$1 extends SuspendLambda implements wls {
    final /* synthetic */ y8c0 $documentLoad;
    int label;
    final /* synthetic */ b9c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesFlexContainerScreenPresenter$loadDocumentByPath$1(b9c0 b9c0Var, y8c0 y8c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = b9c0Var;
        this.$documentLoad = y8c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesFlexContainerScreenPresenter$loadDocumentByPath$1(this.this$0, this.$documentLoad, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesFlexContainerScreenPresenter$loadDocumentByPath$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0.y;
            y8c0 y8c0Var = this.$documentLoad;
            o8c0 o8c0Var = y8c0Var.a;
            k8c0 k8c0Var = y8c0Var.b;
            this.label = 1;
            if (aVar.b(o8c0Var, k8c0Var, this) == coroutineSingletons) {
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
