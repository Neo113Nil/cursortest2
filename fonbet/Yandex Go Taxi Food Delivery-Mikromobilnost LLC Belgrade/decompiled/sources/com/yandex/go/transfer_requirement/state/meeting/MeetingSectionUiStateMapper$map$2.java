package com.yandex.go.transfer_requirement.state.meeting;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.fh10;
import defpackage.ibs0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wk90;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfh10;", "<anonymous>", "(Ltse;)Lfh10;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.meeting.MeetingSectionUiStateMapper$map$2", f = "MeetingSectionUiStateMapper.kt", l = {48, 49}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MeetingSectionUiStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $currentGreeting;
    final /* synthetic */ String $currentPerson;
    final /* synthetic */ Map<String, String> $l10n;
    final /* synthetic */ TransferRequirementExperiment.Card.MeetingSectionDto $meetingSection;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeetingSectionUiStateMapper$map$2(Map map, TransferRequirementExperiment.Card.MeetingSectionDto meetingSectionDto, a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$l10n = map;
        this.$meetingSection = meetingSectionDto;
        this.this$0 = aVar;
        this.$currentPerson = str;
        this.$currentGreeting = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MeetingSectionUiStateMapper$map$2 meetingSectionUiStateMapper$map$2 = new MeetingSectionUiStateMapper$map$2(this.$l10n, this.$meetingSection, this.this$0, this.$currentPerson, this.$currentGreeting, continuation);
        meetingSectionUiStateMapper$map$2.L$0 = obj;
        return meetingSectionUiStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MeetingSectionUiStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v11, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        qoh h;
        wk90 wk90Var;
        Object s;
        qoh qohVar;
        String str2;
        Object k;
        String str3;
        wk90 wk90Var2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ibs0 ibs0Var = null;
        if (i == 0) {
            b.b(obj);
            str = this.$l10n.get(this.$meetingSection.a);
            TransferRequirementExperiment.Card.MeetingSectionDto.PersonItemDto personItemDto = this.$meetingSection.b;
            qoh h2 = personItemDto != null ? tje.h(tseVar, null, null, new MeetingSectionUiStateMapper$map$2$personItem$1$1(personItemDto, this.this$0, this.$currentPerson, this.$l10n, null), 3) : null;
            TransferRequirementExperiment.Card.MeetingSectionDto.SignItemDto signItemDto = this.$meetingSection.c;
            h = signItemDto != null ? tje.h(tseVar, null, null, new MeetingSectionUiStateMapper$map$2$signItem$1$1(signItemDto, this.this$0, this.$currentGreeting, this.$l10n, null), 3) : null;
            if (h2 != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = h;
                this.L$4 = str;
                this.label = 1;
                s = h2.s(this);
                if (s != coroutineSingletons) {
                    qohVar = h;
                    str2 = str;
                }
                return coroutineSingletons;
            }
            wk90Var = null;
            if (h != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = str;
                this.L$5 = wk90Var;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                    str3 = str;
                    wk90Var2 = wk90Var;
                    ibs0Var = (ibs0) k;
                    wk90Var = wk90Var2;
                    str = str3;
                }
                return coroutineSingletons;
            }
            return new fh10(str, wk90Var, ibs0Var);
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wk90Var2 = (wk90) this.L$5;
            ?? r2 = (CharSequence) this.L$4;
            b.b(obj);
            k = obj;
            str3 = r2;
            ibs0Var = (ibs0) k;
            wk90Var = wk90Var2;
            str = str3;
            return new fh10(str, wk90Var, ibs0Var);
        }
        ?? r1 = (CharSequence) this.L$4;
        ?? r3 = (noh) this.L$3;
        b.b(obj);
        s = obj;
        str2 = r1;
        qohVar = r3;
        wk90Var = (wk90) s;
        qoh qohVar2 = qohVar;
        str = str2;
        h = qohVar2;
        if (h != null) {
        }
        return new fh10(str, wk90Var, ibs0Var);
    }
}
