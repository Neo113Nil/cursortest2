package com.yandex.go.summary.interactor.common.state;

import com.yandex.go.zone.dto.objects.VerticalMode;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pmq0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor$special$$inlined$flatMapLatest$1", f = "SelectorUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SelectorUiStateInteractor$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$special$$inlined$flatMapLatest$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SelectorUiStateInteractor$special$$inlined$flatMapLatest$1 selectorUiStateInteractor$special$$inlined$flatMapLatest$1 = new SelectorUiStateInteractor$special$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        selectorUiStateInteractor$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        selectorUiStateInteractor$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return selectorUiStateInteractor$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.flow.internal.g X;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = pmq0.a[((VerticalMode) obj2).ordinal()];
            if (i2 == 1) {
                X = kotlinx.coroutines.flow.e.X(this.this$0.b.a(), new SelectorUiStateInteractor$uiStateFlow$1$1(this.this$0, null));
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                X = kotlinx.coroutines.flow.e.X(this.this$0.a.a(), new SelectorUiStateInteractor$uiStateFlow$1$2(this.this$0, null));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(X, vprVar, this) == coroutineSingletons) {
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
