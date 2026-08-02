package com.yandex.go.summary.interactor.common.state;

import defpackage.d6m;
import defpackage.elx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lvnx0;", "<anonymous>", "(Ltse;)Ljava/util/concurrent/ConcurrentHashMap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor$getVerticalsTariffsQuick$2", f = "SelectorUiStateInteractor.kt", l = {260}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SelectorUiStateInteractor$getVerticalsTariffsQuick$2 extends SuspendLambda implements wls {
    final /* synthetic */ d6m $this_getVerticalsTariffsQuick;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$getVerticalsTariffsQuick$2(d6m d6mVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$this_getVerticalsTariffsQuick = d6mVar;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectorUiStateInteractor$getVerticalsTariffsQuick$2 selectorUiStateInteractor$getVerticalsTariffsQuick$2 = new SelectorUiStateInteractor$getVerticalsTariffsQuick$2(this.$this_getVerticalsTariffsQuick, this.this$0, continuation);
        selectorUiStateInteractor$getVerticalsTariffsQuick$2.L$0 = obj;
        return selectorUiStateInteractor$getVerticalsTariffsQuick$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectorUiStateInteractor$getVerticalsTariffsQuick$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.L$1;
            kotlin.b.b(obj);
            return concurrentHashMap;
        }
        kotlin.b.b(obj);
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        List list = this.$this_getVerticalsTariffsQuick.b;
        c cVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new SelectorUiStateInteractor$getVerticalsTariffsQuick$2$1$1(cVar, (elx0) it.next(), concurrentHashMap2, null), 3));
        }
        this.L$0 = null;
        this.L$1 = concurrentHashMap2;
        this.label = 1;
        return kotlinx.coroutines.a.b(arrayList, this) == coroutineSingletons ? coroutineSingletons : concurrentHashMap2;
    }
}
