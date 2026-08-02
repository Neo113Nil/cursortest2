package com.yandex.go.transfer_requirement.state.meeting;

import android.graphics.drawable.Drawable;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.c9s;
import defpackage.ibs0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Libs0;", "<anonymous>", "(Ltse;)Libs0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.meeting.MeetingSectionUiStateMapper$mapSignItem$2", f = "MeetingSectionUiStateMapper.kt", l = {81, 82}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MeetingSectionUiStateMapper$mapSignItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $currentGreeting;
    final /* synthetic */ TransferRequirementExperiment.Card.MeetingSectionDto.SignItemDto $inputItemDto;
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
    public MeetingSectionUiStateMapper$mapSignItem$2(TransferRequirementExperiment.Card.MeetingSectionDto.SignItemDto signItemDto, a aVar, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.$inputItemDto = signItemDto;
        this.$l10n = map;
        this.$currentGreeting = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferRequirementExperiment.Card.MeetingSectionDto.SignItemDto signItemDto = this.$inputItemDto;
        Map<String, String> map = this.$l10n;
        MeetingSectionUiStateMapper$mapSignItem$2 meetingSectionUiStateMapper$mapSignItem$2 = new MeetingSectionUiStateMapper$mapSignItem$2(signItemDto, this.this$0, this.$currentGreeting, map, continuation);
        meetingSectionUiStateMapper$mapSignItem$2.L$0 = obj;
        return meetingSectionUiStateMapper$mapSignItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MeetingSectionUiStateMapper$mapSignItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        String str;
        String str2;
        CharSequence charSequence;
        Object k;
        String str3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            FormattedText formattedText = this.$inputItemDto.a;
            FormattedText a = formattedText != null ? c9s.a(formattedText, this.$l10n) : null;
            qoh h2 = a != null ? tje.h(tseVar, null, null, new MeetingSectionUiStateMapper$mapSignItem$2$title$1$1(this.this$0, a, null), 3) : null;
            h = tje.h(tseVar, null, null, new MeetingSectionUiStateMapper$mapSignItem$2$leadIcon$1(this.$inputItemDto, this.this$0, null), 3);
            String str4 = this.$inputItemDto.c;
            str = str4 != null ? this.$l10n.get(str4) : null;
            if (h2 == null) {
                str2 = str;
                charSequence = null;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = str2;
                this.L$5 = charSequence;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                    str3 = str2;
                    obj = k;
                    return new ibs0(charSequence, (Drawable) obj, this.$currentGreeting, str3);
                }
                return coroutineSingletons;
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
                return new ibs0(charSequence, (Drawable) obj, this.$currentGreeting, str3);
            }
            str = (String) this.L$4;
            h = (noh) this.L$3;
            b.b(obj);
        }
        String str5 = str;
        charSequence = (CharSequence) obj;
        str2 = str5;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = str2;
        this.L$5 = charSequence;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
