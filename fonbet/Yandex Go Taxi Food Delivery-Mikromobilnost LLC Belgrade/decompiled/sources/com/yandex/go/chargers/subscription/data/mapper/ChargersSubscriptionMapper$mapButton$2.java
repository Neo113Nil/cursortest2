package com.yandex.go.chargers.subscription.data.mapper;

import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionButtonDto;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cta;
import defpackage.fta;
import defpackage.mvg;
import defpackage.noh;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lnoh;", "Lfta;", "<anonymous>", "(Ltse;)Lnoh;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.subscription.data.mapper.ChargersSubscriptionMapper$mapButton$2", f = "ChargersSubscriptionMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSubscriptionMapper$mapButton$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersSubscriptionButtonDto $dto;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfta;", "<anonymous>", "(Ltse;)Lfta;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.subscription.data.mapper.ChargersSubscriptionMapper$mapButton$2$1", f = "ChargersSubscriptionMapper.kt", l = {67, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.subscription.data.mapper.ChargersSubscriptionMapper$mapButton$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ noh $action;
        final /* synthetic */ noh $title;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(noh nohVar, noh nohVar2, Continuation continuation) {
            super(2, continuation);
            this.$title = nohVar;
            this.$action = nohVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$title, this.$action, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CharSequence charSequence;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                noh nohVar = this.$title;
                this.label = 1;
                obj = nohVar.k(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence = (CharSequence) this.L$0;
                    b.b(obj);
                    return new fta(charSequence, (cta) obj);
                }
                b.b(obj);
            }
            CharSequence charSequence2 = (CharSequence) obj;
            noh nohVar2 = this.$action;
            this.L$0 = charSequence2;
            this.label = 2;
            Object k = nohVar2.k(this);
            if (k != coroutineSingletons) {
                obj = k;
                charSequence = charSequence2;
                return new fta(charSequence, (cta) obj);
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSubscriptionMapper$mapButton$2(a aVar, ChargersSubscriptionButtonDto chargersSubscriptionButtonDto, Continuation continuation) {
        super(2, continuation);
        this.$dto = chargersSubscriptionButtonDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersSubscriptionMapper$mapButton$2 chargersSubscriptionMapper$mapButton$2 = new ChargersSubscriptionMapper$mapButton$2(this.this$0, this.$dto, continuation);
        chargersSubscriptionMapper$mapButton$2.L$0 = obj;
        return chargersSubscriptionMapper$mapButton$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersSubscriptionMapper$mapButton$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ChargersSubscriptionButtonDto chargersSubscriptionButtonDto = this.$dto;
        if (chargersSubscriptionButtonDto.a == null) {
            return null;
        }
        return tje.h(tseVar, null, null, new AnonymousClass1(tje.h(tseVar, null, null, new ChargersSubscriptionMapper$mapButton$2$title$1(this.this$0, chargersSubscriptionButtonDto, null), 3), tje.h(tseVar, null, null, new ChargersSubscriptionMapper$mapButton$2$action$1(this.this$0, this.$dto, null), 3), null), 3);
    }
}
