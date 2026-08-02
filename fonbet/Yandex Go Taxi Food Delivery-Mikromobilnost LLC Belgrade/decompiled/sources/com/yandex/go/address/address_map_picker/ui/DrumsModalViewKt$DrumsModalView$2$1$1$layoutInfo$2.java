package com.yandex.go.address.address_map_picker.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s6y;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls6y;", "it", "", "<anonymous>", "(Ls6y;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.ui.DrumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2", f = "DrumsModalView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DrumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2 drumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2 = new DrumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2(2, continuation);
        drumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2.L$0 = obj;
        return drumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DrumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2) create((s6y) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s6y s6yVar = (s6y) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(s6yVar.n > 0);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
