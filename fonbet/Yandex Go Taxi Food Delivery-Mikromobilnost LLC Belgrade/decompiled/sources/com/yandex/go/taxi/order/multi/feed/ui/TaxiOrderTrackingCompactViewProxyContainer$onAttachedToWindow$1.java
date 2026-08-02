package com.yandex.go.taxi.order.multi.feed.ui;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.bkx0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p2y0;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1", f = "TaxiOrderTrackingCompactViewProxyContainer.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ TaxiOrderTrackingCompactViewProxyContainer this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$3, reason: invalid class name */
    final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Object addCompactView;
            addCompactView = ((TaxiOrderTrackingCompactViewProxyContainer) this.receiver).addCompactView((Pair) obj, (Continuation) obj2);
            return addCompactView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1(TaxiOrderTrackingCompactViewProxyContainer taxiOrderTrackingCompactViewProxyContainer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = taxiOrderTrackingCompactViewProxyContainer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p2y0 p2y0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            p2y0Var = this.this$0.orderHolderRepository;
            g X = kotlinx.coroutines.flow.e.X(vng.l(new mth(((e0) p2y0Var).g, 6), new bkx0(23), vng.c), new TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, null));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, this.this$0, TaxiOrderTrackingCompactViewProxyContainer.class, "addCompactView", "addCompactView(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(X, anonymousClass3, this) == coroutineSingletons) {
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
