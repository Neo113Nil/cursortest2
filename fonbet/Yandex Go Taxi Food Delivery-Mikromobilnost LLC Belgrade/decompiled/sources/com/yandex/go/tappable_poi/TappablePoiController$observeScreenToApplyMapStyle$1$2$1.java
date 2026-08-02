package com.yandex.go.tappable_poi;

import com.yandex.go.tappable_poi.experiments.TappablePoiCardExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.style.source.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tappable_poi.TappablePoiController$observeScreenToApplyMapStyle$1$2$1", f = "TappablePoiController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TappablePoiController$observeScreenToApplyMapStyle$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ TappablePoiCardExperiment.CardOption $cardOptions;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TappablePoiController$observeScreenToApplyMapStyle$1$2$1(TappablePoiCardExperiment.CardOption cardOption, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$cardOptions = cardOption;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TappablePoiController$observeScreenToApplyMapStyle$1$2$1 tappablePoiController$observeScreenToApplyMapStyle$1$2$1 = new TappablePoiController$observeScreenToApplyMapStyle$1$2$1(this.$cardOptions, this.this$0, continuation);
        tappablePoiController$observeScreenToApplyMapStyle$1$2$1.L$0 = obj;
        return tappablePoiController$observeScreenToApplyMapStyle$1$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TappablePoiController$observeScreenToApplyMapStyle$1$2$1 tappablePoiController$observeScreenToApplyMapStyle$1$2$1 = (TappablePoiController$observeScreenToApplyMapStyle$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tappablePoiController$observeScreenToApplyMapStyle$1$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        TappablePoiCardExperiment.CardOption cardOption = this.$cardOptions;
        if (cardOption == null || (str2 = cardOption.k) == null) {
            b bVar = this.this$0;
            ((e) bVar.g).b();
            bVar.l = null;
        } else {
            b bVar2 = this.this$0;
            if (str2.length() > 0) {
                ((e) bVar2.g).d(str2);
                bVar2.l = str2;
            }
        }
        TappablePoiCardExperiment.CardOption cardOption2 = this.$cardOptions;
        if (cardOption2 != null && (str = cardOption2.j) != null) {
            b bVar3 = this.this$0;
            if (str.length() > 0) {
                ((e) bVar3.g).c(5, str);
                bVar3.m = true;
            }
        }
        return zy11.a;
    }
}
