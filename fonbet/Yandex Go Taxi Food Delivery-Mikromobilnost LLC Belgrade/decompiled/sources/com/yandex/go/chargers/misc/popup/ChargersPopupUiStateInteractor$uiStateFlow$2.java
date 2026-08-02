package com.yandex.go.chargers.misc.popup;

import defpackage.ana;
import defpackage.bna;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uma;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zma;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lzma;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.misc.popup.ChargersPopupUiStateInteractor$uiStateFlow$2", f = "ChargersPopupUiStateInteractor.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPopupUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ uma $payload;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ana this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPopupUiStateInteractor$uiStateFlow$2(ana anaVar, uma umaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = anaVar;
        this.$payload = umaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersPopupUiStateInteractor$uiStateFlow$2 chargersPopupUiStateInteractor$uiStateFlow$2 = new ChargersPopupUiStateInteractor$uiStateFlow$2(this.this$0, this.$payload, continuation);
        chargersPopupUiStateInteractor$uiStateFlow$2.L$0 = obj;
        return chargersPopupUiStateInteractor$uiStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPopupUiStateInteractor$uiStateFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            bna bnaVar = this.this$0.c;
            uma umaVar = this.$payload;
            bnaVar.getClass();
            String str = umaVar.b;
            zma zmaVar = new zma(umaVar.a, umaVar.c, str != null ? ((m7x0) bnaVar.a).a(str) : null);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(zmaVar, this) == coroutineSingletons) {
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
