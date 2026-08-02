package com.yandex.go.transfer_requirement.state.meeting;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Libs0;", "<anonymous>", "(Ltse;)Libs0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.meeting.MeetingSectionUiStateMapper$map$2$signItem$1$1", f = "MeetingSectionUiStateMapper.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MeetingSectionUiStateMapper$map$2$signItem$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $currentGreeting;
    final /* synthetic */ TransferRequirementExperiment.Card.MeetingSectionDto.SignItemDto $it;
    final /* synthetic */ Map<String, String> $l10n;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeetingSectionUiStateMapper$map$2$signItem$1$1(TransferRequirementExperiment.Card.MeetingSectionDto.SignItemDto signItemDto, a aVar, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = signItemDto;
        this.$currentGreeting = str;
        this.$l10n = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MeetingSectionUiStateMapper$map$2$signItem$1$1(this.$it, this.this$0, this.$currentGreeting, this.$l10n, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MeetingSectionUiStateMapper$map$2$signItem$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        a aVar = this.this$0;
        TransferRequirementExperiment.Card.MeetingSectionDto.SignItemDto signItemDto = this.$it;
        String str = this.$currentGreeting;
        Map<String, String> map = this.$l10n;
        this.label = 1;
        aVar.getClass();
        Object n = bvf0.n(new MeetingSectionUiStateMapper$mapSignItem$2(signItemDto, aVar, str, map, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
