package com.yandex.go.summary.interactor.common.state;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ob5;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "Lob5;", "", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor$resolveAllPrices$2", f = "SelectorUiStateInteractor.kt", l = {379}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SelectorUiStateInteractor$resolveAllPrices$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<ob5, FormattedText> $pendingPrices;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$resolveAllPrices$2(Map map, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$pendingPrices = map;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectorUiStateInteractor$resolveAllPrices$2 selectorUiStateInteractor$resolveAllPrices$2 = new SelectorUiStateInteractor$resolveAllPrices$2(this.$pendingPrices, this.this$0, continuation);
        selectorUiStateInteractor$resolveAllPrices$2.L$0 = obj;
        return selectorUiStateInteractor$resolveAllPrices$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectorUiStateInteractor$resolveAllPrices$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Map<ob5, FormattedText> map = this.$pendingPrices;
            c cVar = this.this$0;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<ob5, FormattedText> entry : map.entrySet()) {
                arrayList.add(tje.h(tseVar, null, null, new SelectorUiStateInteractor$resolveAllPrices$2$1$1(entry.getKey(), cVar, entry.getValue(), null), 3));
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return kotlin.collections.b.s((Iterable) obj);
    }
}
