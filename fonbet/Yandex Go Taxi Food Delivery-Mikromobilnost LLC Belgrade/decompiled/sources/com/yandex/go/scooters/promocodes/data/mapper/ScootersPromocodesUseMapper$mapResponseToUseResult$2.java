package com.yandex.go.scooters.promocodes.data.mapper;

import com.yandex.go.scooters.promocodes.data.model.ScootersPromocodesUseResponse;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uno0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Luno0;", "<anonymous>", "(Ltse;)Luno0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.promocodes.data.mapper.ScootersPromocodesUseMapper$mapResponseToUseResult$2", f = "ScootersPromocodesUseMapper.kt", l = {23, 23}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPromocodesUseMapper$mapResponseToUseResult$2 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersPromocodesUseResponse $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPromocodesUseMapper$mapResponseToUseResult$2(a aVar, ScootersPromocodesUseResponse scootersPromocodesUseResponse, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = scootersPromocodesUseResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPromocodesUseMapper$mapResponseToUseResult$2 scootersPromocodesUseMapper$mapResponseToUseResult$2 = new ScootersPromocodesUseMapper$mapResponseToUseResult$2(this.this$0, this.$response, continuation);
        scootersPromocodesUseMapper$mapResponseToUseResult$2.L$0 = obj;
        return scootersPromocodesUseMapper$mapResponseToUseResult$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPromocodesUseMapper$mapResponseToUseResult$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            qoh h2 = tje.h(tseVar, null, null, new ScootersPromocodesUseMapper$mapResponseToUseResult$2$titleAsync$1(this.this$0, this.$response, null), 3);
            h = tje.h(tseVar, null, null, new ScootersPromocodesUseMapper$mapResponseToUseResult$2$detailsAsync$1(this.this$0, this.$response, null), 3);
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
                return new uno0(charSequence, (List) obj);
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
            return new uno0(charSequence, (List) obj);
        }
        return coroutineSingletons;
    }
}
