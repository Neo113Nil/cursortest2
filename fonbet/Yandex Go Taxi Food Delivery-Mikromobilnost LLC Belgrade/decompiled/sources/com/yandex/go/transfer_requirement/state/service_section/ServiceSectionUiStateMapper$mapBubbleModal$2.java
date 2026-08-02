package com.yandex.go.transfer_requirement.state.service_section;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.c9s;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tzz;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltzz;", "<anonymous>", "(Ltse;)Ltzz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.service_section.ServiceSectionUiStateMapper$mapBubbleModal$2", f = "ServiceSectionUiStateMapper.kt", l = {199, 200, 201}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ServiceSectionUiStateMapper$mapBubbleModal$2 extends SuspendLambda implements wls {
    final /* synthetic */ TransferRequirementExperiment.Card.ServiceSectionDto.BubbleModalDto $dto;
    final /* synthetic */ Map<String, String> $l10n;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceSectionUiStateMapper$mapBubbleModal$2(TransferRequirementExperiment.Card.ServiceSectionDto.BubbleModalDto bubbleModalDto, a aVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.$dto = bubbleModalDto;
        this.$l10n = map;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ServiceSectionUiStateMapper$mapBubbleModal$2 serviceSectionUiStateMapper$mapBubbleModal$2 = new ServiceSectionUiStateMapper$mapBubbleModal$2(this.$dto, this.this$0, this.$l10n, continuation);
        serviceSectionUiStateMapper$mapBubbleModal$2.L$0 = obj;
        return serviceSectionUiStateMapper$mapBubbleModal$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceSectionUiStateMapper$mapBubbleModal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        noh nohVar;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        CharSequence charSequence3;
        noh nohVar2;
        CharSequence charSequence4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CharSequence charSequence5 = null;
        if (i == 0) {
            b.b(obj);
            FormattedText formattedText2 = this.$dto.a;
            qoh h3 = formattedText2 != null ? tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapBubbleModal$2$title$1$1(this.this$0, c9s.a(formattedText2, this.$l10n), null), 3) : null;
            FormattedText formattedText3 = this.$dto.b;
            h = formattedText3 != null ? tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapBubbleModal$2$text$1$1(this.this$0, c9s.a(formattedText3, this.$l10n), null), 3) : null;
            TransferRequirementExperiment.Card.ServiceSectionDto.BubbleModalButtonDto bubbleModalButtonDto = this.$dto.c;
            h2 = (bubbleModalButtonDto == null || (formattedText = bubbleModalButtonDto.a) == null) ? null : tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapBubbleModal$2$buttonText$1$1(this.this$0, c9s.a(formattedText, this.$l10n), null), 3);
            if (h3 == null) {
                nohVar = h2;
                charSequence = null;
                if (h != null) {
                    charSequence2 = charSequence;
                    charSequence3 = null;
                    if (nohVar != null) {
                    }
                    return new tzz(charSequence2, charSequence3, charSequence5);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar;
                this.L$4 = charSequence;
                this.label = 2;
                Object k = h.k(this);
                if (k != coroutineSingletons) {
                    nohVar2 = nohVar;
                    obj = k;
                    CharSequence charSequence6 = charSequence;
                    charSequence3 = (CharSequence) obj;
                    nohVar = nohVar2;
                    charSequence2 = charSequence6;
                    if (nohVar != null) {
                    }
                    return new tzz(charSequence2, charSequence3, charSequence5);
                }
                return coroutineSingletons;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            obj = h3.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence3 = (CharSequence) this.L$5;
                    charSequence4 = (CharSequence) this.L$4;
                    b.b(obj);
                    charSequence5 = (CharSequence) obj;
                    charSequence2 = charSequence4;
                    return new tzz(charSequence2, charSequence3, charSequence5);
                }
                charSequence = (CharSequence) this.L$4;
                nohVar2 = (noh) this.L$3;
                b.b(obj);
                CharSequence charSequence62 = charSequence;
                charSequence3 = (CharSequence) obj;
                nohVar = nohVar2;
                charSequence2 = charSequence62;
                if (nohVar != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = charSequence2;
                    this.L$5 = charSequence3;
                    this.label = 3;
                    obj = nohVar.k(this);
                    if (obj != coroutineSingletons) {
                        charSequence4 = charSequence2;
                        charSequence5 = (CharSequence) obj;
                        charSequence2 = charSequence4;
                    }
                    return coroutineSingletons;
                }
                return new tzz(charSequence2, charSequence3, charSequence5);
            }
            h2 = (noh) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
        }
        noh nohVar3 = h2;
        charSequence = (CharSequence) obj;
        nohVar = nohVar3;
        if (h != null) {
        }
    }
}
