package com.yandex.go.taxi.order.superapp.orders.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.y6y0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.superapp.orders.ui.TaxiOrderViewHolder$convertText$1", f = "TaxiOrderViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderViewHolder$convertText$1 extends SuspendLambda implements wls {
    final /* synthetic */ Consumer<CharSequence> $onComplete;
    final /* synthetic */ FormattedText $text;
    final /* synthetic */ c $this_convertText;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.superapp.orders.ui.TaxiOrderViewHolder$convertText$1$1", f = "TaxiOrderViewHolder.kt", l = {833}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.superapp.orders.ui.TaxiOrderViewHolder$convertText$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Consumer<CharSequence> $onComplete;
        final /* synthetic */ FormattedText $text;
        final /* synthetic */ c $this_convertText;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Consumer consumer, c cVar, FormattedText formattedText, b bVar, Continuation continuation) {
            super(2, continuation);
            this.$onComplete = consumer;
            this.$this_convertText = cVar;
            this.$text = formattedText;
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$onComplete, this.$this_convertText, this.$text, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            b bVar;
            Consumer consumer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    Consumer<CharSequence> consumer2 = this.$onComplete;
                    c cVar = this.$this_convertText;
                    FormattedText formattedText = this.$text;
                    b bVar2 = this.this$0;
                    try {
                        this.L$0 = bVar2;
                        this.L$1 = consumer2;
                        this.label = 1;
                        Object e = c.e(cVar, formattedText, null, false, this, 30);
                        if (e == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        consumer = consumer2;
                        obj = e;
                        bVar = bVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = bVar2;
                        bVar.T0.b("convertText", th, new y6y0(1));
                        return zy11.a;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    consumer = (Consumer) this.L$1;
                    bVar = (b) this.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        bVar.T0.b("convertText", th, new y6y0(1));
                        return zy11.a;
                    }
                }
                consumer.accept(obj);
                return zy11.a;
            } catch (CancellationException e2) {
                throw e2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderViewHolder$convertText$1(Consumer consumer, c cVar, FormattedText formattedText, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$onComplete = consumer;
        this.$this_convertText = cVar;
        this.$text = formattedText;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiOrderViewHolder$convertText$1 taxiOrderViewHolder$convertText$1 = new TaxiOrderViewHolder$convertText$1(this.$onComplete, this.$this_convertText, this.$text, this.this$0, continuation);
        taxiOrderViewHolder$convertText$1.L$0 = obj;
        return taxiOrderViewHolder$convertText$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOrderViewHolder$convertText$1 taxiOrderViewHolder$convertText$1 = (TaxiOrderViewHolder$convertText$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOrderViewHolder$convertText$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.$onComplete, this.$this_convertText, this.$text, this.this$0, null), 3);
        return zy11.a;
    }
}
