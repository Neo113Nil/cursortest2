package com.yandex.go.chargers.subscription.data.mapper;

import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionTermItemDto;
import defpackage.jva;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lnoh;", "Ljva;", "<anonymous>", "(Ltse;)Lnoh;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.subscription.data.mapper.ChargersSubscriptionMapper$mapTermItem$2", f = "ChargersSubscriptionMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSubscriptionMapper$mapTermItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersSubscriptionTermItemDto $dto;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljva;", "<anonymous>", "(Ltse;)Ljva;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.subscription.data.mapper.ChargersSubscriptionMapper$mapTermItem$2$1", f = "ChargersSubscriptionMapper.kt", l = {53}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.subscription.data.mapper.ChargersSubscriptionMapper$mapTermItem$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ChargersSubscriptionTermItemDto $dto;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, ChargersSubscriptionTermItemDto chargersSubscriptionTermItemDto, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$dto = chargersSubscriptionTermItemDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$dto, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                c cVar = this.this$0.a;
                FormattedText formattedText = this.$dto.a;
                this.label = 1;
                obj = c.i(cVar, formattedText, null, this, 30);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            CharSequence charSequence = (CharSequence) obj;
            String str = this.$dto.b;
            return new jva(charSequence, str != null ? mja1.a(str, null, 6) : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSubscriptionMapper$mapTermItem$2(a aVar, ChargersSubscriptionTermItemDto chargersSubscriptionTermItemDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dto = chargersSubscriptionTermItemDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersSubscriptionMapper$mapTermItem$2 chargersSubscriptionMapper$mapTermItem$2 = new ChargersSubscriptionMapper$mapTermItem$2(this.this$0, this.$dto, continuation);
        chargersSubscriptionMapper$mapTermItem$2.L$0 = obj;
        return chargersSubscriptionMapper$mapTermItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersSubscriptionMapper$mapTermItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return tje.h(tseVar, null, null, new AnonymousClass1(this.this$0, this.$dto, null), 3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
