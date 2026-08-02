package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y7a;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ly7a;", "<anonymous>", "(Ltse;)Ly7a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareChargersOfferContent$2$header$1$1", f = "ChargersOfferUiStateMapper.kt", l = {200, 201}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareChargersOfferContent$2$header$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersOfferResponseDto.Header $it;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareChargersOfferContent$2$header$1$1(b bVar, ChargersOfferResponseDto.Header header, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$it = header;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$header$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareChargersOfferContent$2$header$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
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
            kotlin.b.b(obj);
            e eVar = this.this$0.f;
            FormattedText formattedText = this.$it.a;
            this.label = 1;
            obj = eVar.x(formattedText, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence = (CharSequence) this.L$0;
                kotlin.b.b(obj);
                return new y7a(charSequence, (CharSequence) obj);
            }
            kotlin.b.b(obj);
        }
        CharSequence charSequence2 = (CharSequence) obj;
        e eVar2 = this.this$0.f;
        FormattedText formattedText2 = this.$it.b;
        this.L$0 = charSequence2;
        this.label = 2;
        Object x = eVar2.x(formattedText2, this);
        if (x != coroutineSingletons) {
            obj = x;
            charSequence = charSequence2;
            return new y7a(charSequence, (CharSequence) obj);
        }
        return coroutineSingletons;
    }
}
