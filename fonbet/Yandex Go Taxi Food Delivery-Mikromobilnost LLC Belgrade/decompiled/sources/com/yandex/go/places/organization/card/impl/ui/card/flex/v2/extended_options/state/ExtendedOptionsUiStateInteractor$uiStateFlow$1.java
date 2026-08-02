package com.yandex.go.places.organization.card.impl.ui.card.flex.v2.extended_options.state;

import defpackage.k7v;
import defpackage.mvg;
import defpackage.nxo;
import defpackage.ny61;
import defpackage.oxo;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xxo;
import defpackage.zp;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lxxo;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.card.flex.v2.extended_options.state.ExtendedOptionsUiStateInteractor$uiStateFlow$1", f = "ExtendedOptionsUiStateInteractor.kt", l = {21}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ExtendedOptionsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtendedOptionsUiStateInteractor$uiStateFlow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ExtendedOptionsUiStateInteractor$uiStateFlow$1 extendedOptionsUiStateInteractor$uiStateFlow$1 = new ExtendedOptionsUiStateInteractor$uiStateFlow$1(this.this$0, continuation);
        extendedOptionsUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return extendedOptionsUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExtendedOptionsUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            oxo oxoVar = aVar.a;
            String str = aVar.b;
            ArrayList<zp> arrayList = aVar.c;
            oxoVar.getClass();
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (zp zpVar : arrayList) {
                String str2 = zpVar.b;
                k7v k7vVar = zpVar.c;
                arrayList2.add(new nxo(str2, k7vVar != null ? k7vVar.a : null, zpVar.a));
            }
            xxo xxoVar = new xxo(arrayList2, str);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(xxoVar, this) == coroutineSingletons) {
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
