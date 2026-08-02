package com.yandex.go.taxi.order.details.v2.state.elements.companion;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ComboCompanion;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rek0;
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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/common_models/net/FormattedText;", "formattedTitle", "Lrek0;", "<anonymous>", "(Lru/yandex/taxi/common_models/net/FormattedText;)Lrek0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion.RideCardCompanionItemDataSource$getBodyFlow$1", f = "RideCardCompanionItemDataSource.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCompanionItemDataSource$getBodyFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$ComboCompanion $item;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrek0;", "<anonymous>", "(Ltse;)Lrek0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion.RideCardCompanionItemDataSource$getBodyFlow$1$1", f = "RideCardCompanionItemDataSource.kt", l = {60, 61}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.state.elements.companion.RideCardCompanionItemDataSource$getBodyFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ FormattedText $formattedTitle;
        final /* synthetic */ RideCardItemDto$ComboCompanion $item;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, FormattedText formattedText, RideCardItemDto$ComboCompanion rideCardItemDto$ComboCompanion, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$formattedTitle = formattedText;
            this.$item = rideCardItemDto$ComboCompanion;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$formattedTitle, this.$item, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        
            if (r10 == r1) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            noh h;
            CharSequence charSequence;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                qoh h2 = tje.h(tseVar, null, null, new RideCardCompanionItemDataSource$getBodyFlow$1$1$title$1(this.this$0, this.$formattedTitle, null), 3);
                h = tje.h(tseVar, null, null, new RideCardCompanionItemDataSource$getBodyFlow$1$1$subtitle$1(this.this$0, this.$item, null), 3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.label = 1;
                obj = h2.s(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence = (CharSequence) this.L$3;
                    b.b(obj);
                    return new rek0(charSequence, (CharSequence) obj);
                }
                h = (noh) this.L$2;
                b.b(obj);
            }
            CharSequence charSequence2 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = charSequence2;
            this.label = 2;
            Object k = h.k(this);
            if (k != coroutineSingletons) {
                charSequence = charSequence2;
                obj = k;
                return new rek0(charSequence, (CharSequence) obj);
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompanionItemDataSource$getBodyFlow$1(a aVar, RideCardItemDto$ComboCompanion rideCardItemDto$ComboCompanion, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = rideCardItemDto$ComboCompanion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardCompanionItemDataSource$getBodyFlow$1 rideCardCompanionItemDataSource$getBodyFlow$1 = new RideCardCompanionItemDataSource$getBodyFlow$1(this.this$0, this.$item, continuation);
        rideCardCompanionItemDataSource$getBodyFlow$1.L$0 = obj;
        return rideCardCompanionItemDataSource$getBodyFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardCompanionItemDataSource$getBodyFlow$1) create((FormattedText) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FormattedText formattedText = (FormattedText) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, formattedText, this.$item, null);
        this.L$0 = null;
        this.label = 1;
        Object n = bvf0.n(anonymousClass1, this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
