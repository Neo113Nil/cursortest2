package com.yandex.go.tappable_poi;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.tappable_poi.experiments.TappablePoiCardExperiment;
import com.yandex.go.tappable_poi.experiments.c;
import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.bms;
import defpackage.ha2;
import defpackage.jsq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tappable_poi.TappablePoiController$observeScreenToApplyMapStyle$1", f = "TappablePoiController.kt", l = {271}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TappablePoiController$observeScreenToApplyMapStyle$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/navigation/screen/api/Screen;", MetaDataField.SCREEN_FIELD, "Lcom/yandex/go/tappable_poi/experiments/TappablePoiCardExperiment;", "experiment", "Lo2y0;", "order", "Lcom/yandex/go/tappable_poi/experiments/TappablePoiCardExperiment$CardOption;", "<anonymous>", "(Lcom/yandex/go/navigation/screen/api/Screen;Lcom/yandex/go/tappable_poi/experiments/TappablePoiCardExperiment;Lo2y0;)Lcom/yandex/go/tappable_poi/experiments/TappablePoiCardExperiment$CardOption;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.tappable_poi.TappablePoiController$observeScreenToApplyMapStyle$1$1", f = "TappablePoiController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.tappable_poi.TappablePoiController$observeScreenToApplyMapStyle$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements bms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(4, continuation);
            this.this$0 = bVar;
        }

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (Continuation) obj4);
            anonymousClass1.L$0 = (Screen) obj;
            anonymousClass1.L$1 = (TappablePoiCardExperiment) obj2;
            anonymousClass1.L$2 = (o2y0) obj3;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            Screen screen = (Screen) this.L$0;
            TappablePoiCardExperiment tappablePoiCardExperiment = (TappablePoiCardExperiment) this.L$1;
            o2y0 o2y0Var = (o2y0) this.L$2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            Object obj2 = null;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (!tappablePoiCardExperiment.b || (list = tappablePoiCardExperiment.c) == null) {
                return null;
            }
            b bVar = this.this$0;
            for (Object obj3 : list) {
                TappablePoiCardExperiment.CardOption cardOption = (TappablePoiCardExperiment.CardOption) obj3;
                c cVar = bVar.c;
                String str = cardOption.a;
                jsq0 jsq0Var = cardOption.b;
                cVar.getClass();
                if (c.b(str) == screen) {
                    bVar.c.getClass();
                    if (scc.g(Screen.ORDER, Screen.ORDERS_LIST, Screen.ORDER_DETAILS, Screen.ORDER_TRACKING).contains(screen)) {
                        if ((o2y0Var != null ? o2y0Var.c() : null) != null && !jsq0Var.a.isEmpty() && !jsq0Var.contains(o2y0Var.c())) {
                        }
                    }
                    obj2 = obj3;
                    break;
                }
            }
            return (TappablePoiCardExperiment.CardOption) obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TappablePoiController$observeScreenToApplyMapStyle$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TappablePoiController$observeScreenToApplyMapStyle$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TappablePoiController$observeScreenToApplyMapStyle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.navigation.screen.b c = this.this$0.f.c();
            b bVar = this.this$0;
            ha2 n = e.n(c, bVar.c.b, ((e0) bVar.h).g, new AnonymousClass1(bVar, null));
            b bVar2 = this.this$0;
            o oVar = new o(n, new TappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$1(3, null));
            a aVar = new a(bVar2);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(aVar, this) == coroutineSingletons) {
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
