package com.yandex.go.chargers.discounts.discount_stations.data.mappers;

import com.yandex.go.chargers.data.model.ChargersStationDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountStationsResponseDto;
import defpackage.mvg;
import defpackage.n7u0;
import defpackage.ny61;
import defpackage.tsa;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ln7u0;", "<anonymous>", "(Ltse;)Ln7u0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discounts.discount_stations.data.mappers.ChargersDiscountStationsMapper$mapStationItems$2$1$1", f = "ChargersDiscountStationsMapper.kt", l = {29, 30, 31}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscountStationsMapper$mapStationItems$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersDiscountStationsResponseDto.ChargersDiscountStationItem $station;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscountStationsMapper$mapStationItems$2$1$1(ChargersDiscountStationsResponseDto.ChargersDiscountStationItem chargersDiscountStationItem, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$station = chargersDiscountStationItem;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersDiscountStationsMapper$mapStationItems$2$1$1(this.$station, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersDiscountStationsMapper$mapStationItems$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tsa tsaVar;
        CharSequence charSequence;
        Object i;
        CharSequence charSequence2;
        tsa tsaVar2;
        CharSequence charSequence3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            ChargersDiscountStationsResponseDto.ChargersDiscountStationItem chargersDiscountStationItem = this.$station;
            ChargersStationDto chargersStationDto = chargersDiscountStationItem.a;
            tsaVar = chargersStationDto != null ? new tsa(chargersStationDto.a, chargersStationDto.b, null) : null;
            c cVar = this.this$0.a;
            FormattedText formattedText = chargersDiscountStationItem.b;
            this.L$0 = tsaVar;
            this.label = 1;
            obj = c.i(cVar, formattedText, null, this, 30);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) this.L$2;
                    charSequence3 = (CharSequence) this.L$1;
                    tsaVar2 = (tsa) this.L$0;
                    b.b(obj);
                    return new n7u0(tsaVar2, charSequence3, charSequence2, (CharSequence) obj);
                }
                CharSequence charSequence4 = (CharSequence) this.L$1;
                tsa tsaVar3 = (tsa) this.L$0;
                b.b(obj);
                charSequence = charSequence4;
                tsaVar = tsaVar3;
                CharSequence charSequence5 = (CharSequence) obj;
                c cVar2 = this.this$0.a;
                FormattedText formattedText2 = this.$station.d;
                this.L$0 = tsaVar;
                this.L$1 = charSequence;
                this.L$2 = charSequence5;
                this.label = 3;
                i = c.i(cVar2, formattedText2, null, this, 30);
                if (i != coroutineSingletons) {
                    charSequence2 = charSequence5;
                    obj = i;
                    tsaVar2 = tsaVar;
                    charSequence3 = charSequence;
                    return new n7u0(tsaVar2, charSequence3, charSequence2, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
            tsaVar = (tsa) this.L$0;
            b.b(obj);
        }
        CharSequence charSequence6 = (CharSequence) obj;
        c cVar3 = this.this$0.a;
        FormattedText formattedText3 = this.$station.c;
        this.L$0 = tsaVar;
        this.L$1 = charSequence6;
        this.label = 2;
        Object i3 = c.i(cVar3, formattedText3, null, this, 30);
        if (i3 != coroutineSingletons) {
            charSequence = charSequence6;
            obj = i3;
            CharSequence charSequence52 = (CharSequence) obj;
            c cVar22 = this.this$0.a;
            FormattedText formattedText22 = this.$station.d;
            this.L$0 = tsaVar;
            this.L$1 = charSequence;
            this.L$2 = charSequence52;
            this.label = 3;
            i = c.i(cVar22, formattedText22, null, this, 30);
            if (i != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
