package com.yandex.go.transfer_requirement.state.meeting;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.c9s;
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
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwk90;", "<anonymous>", "(Ltse;)Lwk90;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.meeting.MeetingSectionUiStateMapper$mapPersonItem$2", f = "MeetingSectionUiStateMapper.kt", l = {64, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MeetingSectionUiStateMapper$mapPersonItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $currentPerson;
    final /* synthetic */ Map<String, String> $l10n;
    final /* synthetic */ TransferRequirementExperiment.Card.MeetingSectionDto.PersonItemDto $personItemDto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeetingSectionUiStateMapper$mapPersonItem$2(TransferRequirementExperiment.Card.MeetingSectionDto.PersonItemDto personItemDto, a aVar, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.$personItemDto = personItemDto;
        this.$l10n = map;
        this.$currentPerson = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferRequirementExperiment.Card.MeetingSectionDto.PersonItemDto personItemDto = this.$personItemDto;
        Map<String, String> map = this.$l10n;
        MeetingSectionUiStateMapper$mapPersonItem$2 meetingSectionUiStateMapper$mapPersonItem$2 = new MeetingSectionUiStateMapper$mapPersonItem$2(personItemDto, this.this$0, this.$currentPerson, map, continuation);
        meetingSectionUiStateMapper$mapPersonItem$2.L$0 = obj;
        return meetingSectionUiStateMapper$mapPersonItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MeetingSectionUiStateMapper$mapPersonItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        String str;
        String str2;
        CharSequence charSequence;
        String str3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        UiStateDrawableWrapper uiStateDrawableWrapper = null;
        if (i == 0) {
            b.b(obj);
            FormattedText formattedText = this.$personItemDto.a;
            FormattedText a = formattedText != null ? c9s.a(formattedText, this.$l10n) : null;
            qoh h2 = a != null ? tje.h(tseVar, null, null, new MeetingSectionUiStateMapper$mapPersonItem$2$title$1$1(this.this$0, a, null), 3) : null;
            String str4 = this.$personItemDto.b;
            h = str4 != null ? tje.h(tseVar, null, null, new MeetingSectionUiStateMapper$mapPersonItem$2$leadIcon$1$1(this.this$0, str4, null), 3) : null;
            str = this.$currentPerson;
            if (str == null) {
                String str5 = this.$personItemDto.c;
                str = str5 != null ? this.$l10n.get(str5) : null;
            }
            if (h2 == null) {
                str2 = str;
                charSequence = null;
                if (h != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = str2;
                    this.L$5 = charSequence;
                    this.label = 2;
                    Object k = h.k(this);
                    if (k != coroutineSingletons) {
                        str3 = str2;
                        obj = k;
                        uiStateDrawableWrapper = (UiStateDrawableWrapper) obj;
                        str2 = str3;
                    }
                    return coroutineSingletons;
                }
                return new wk90(charSequence, uiStateDrawableWrapper, str2);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = h;
            this.L$4 = str;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence = (CharSequence) this.L$5;
                str3 = (String) this.L$4;
                b.b(obj);
                uiStateDrawableWrapper = (UiStateDrawableWrapper) obj;
                str2 = str3;
                return new wk90(charSequence, uiStateDrawableWrapper, str2);
            }
            str = (String) this.L$4;
            h = (noh) this.L$3;
            b.b(obj);
        }
        String str6 = str;
        charSequence = (CharSequence) obj;
        str2 = str6;
        if (h != null) {
        }
        return new wk90(charSequence, uiStateDrawableWrapper, str2);
    }
}
