package com.yandex.go.mainscreen.superapp.popup.data;

import defpackage.b3w0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lg3w0;", "Lb3w0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lvpr;Lb3w0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.popup.data.SuperAppMainScreenPopupRepository$observeUiState$5", f = "SuperAppMainScreenPopupRepository.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenPopupRepository$observeUiState$5 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenPopupRepository$observeUiState$5(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SuperAppMainScreenPopupRepository$observeUiState$5 superAppMainScreenPopupRepository$observeUiState$5 = new SuperAppMainScreenPopupRepository$observeUiState$5(this.this$0, (Continuation) obj3);
        superAppMainScreenPopupRepository$observeUiState$5.L$0 = (vpr) obj;
        superAppMainScreenPopupRepository$observeUiState$5.L$1 = (b3w0) obj2;
        return superAppMainScreenPopupRepository$observeUiState$5.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        b3w0 b3w0Var = (b3w0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (c.b(cVar, vprVar, b3w0Var, this) == coroutineSingletons) {
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
