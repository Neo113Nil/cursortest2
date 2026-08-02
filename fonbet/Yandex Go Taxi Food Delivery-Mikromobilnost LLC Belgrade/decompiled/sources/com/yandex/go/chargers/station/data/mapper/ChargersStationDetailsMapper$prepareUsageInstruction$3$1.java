package com.yandex.go.chargers.station.data.mapper;

import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse;
import defpackage.era;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lera;", "<anonymous>", "(Ltse;)Lera;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.data.mapper.ChargersStationDetailsMapper$prepareUsageInstruction$3$1", f = "ChargersStationDetailsMapper.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersStationDetailsMapper$prepareUsageInstruction$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersStationDetailsResponse.UsageInstruction.InstructionItem $it;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersStationDetailsMapper$prepareUsageInstruction$3$1(a aVar, ChargersStationDetailsResponse.UsageInstruction.InstructionItem instructionItem, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = instructionItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersStationDetailsMapper$prepareUsageInstruction$3$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersStationDetailsMapper$prepareUsageInstruction$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0.f;
            FormattedText formattedText = this.$it.b;
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
            kotlin.b.b(obj);
        }
        CharSequence charSequence = (CharSequence) obj;
        String str = this.$it.a;
        return new era(charSequence, str != null ? ((m7x0) this.this$0.a).a(str) : null);
    }
}
