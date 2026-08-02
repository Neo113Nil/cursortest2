package com.yandex.go.transfer_requirement.state.meeting;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/utils/UiStateDrawableWrapper;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/utils/UiStateDrawableWrapper;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.meeting.MeetingSectionUiStateMapper$mapSignItem$2$leadIcon$1", f = "MeetingSectionUiStateMapper.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MeetingSectionUiStateMapper$mapSignItem$2$leadIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ TransferRequirementExperiment.Card.MeetingSectionDto.SignItemDto $inputItemDto;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeetingSectionUiStateMapper$mapSignItem$2$leadIcon$1(TransferRequirementExperiment.Card.MeetingSectionDto.SignItemDto signItemDto, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$inputItemDto = signItemDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MeetingSectionUiStateMapper$mapSignItem$2$leadIcon$1(this.$inputItemDto, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MeetingSectionUiStateMapper$mapSignItem$2$leadIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = this.$inputItemDto.b;
            if (str == null) {
                return null;
            }
            a aVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            obj = a.a(aVar, str, this);
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
        return (UiStateDrawableWrapper) obj;
    }
}
