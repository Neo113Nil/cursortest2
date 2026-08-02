package com.yandex.go.transfer_requirement.state.service_section;

import android.graphics.drawable.Drawable;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.cu01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xo01;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcu01;", "<anonymous>", "(Ltse;)Lcu01;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.service_section.ServiceSectionUiStateMapper$mapTransferTimeRow$2", f = "ServiceSectionUiStateMapper.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ServiceSectionUiStateMapper$mapTransferTimeRow$2 extends SuspendLambda implements wls {
    final /* synthetic */ TransferRequirementExperiment.Card.ServiceSectionDto.LabeledIconInfoDto $dto;
    final /* synthetic */ Map<String, String> $l10n;
    final /* synthetic */ xo01 $selectedTime;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceSectionUiStateMapper$mapTransferTimeRow$2(Map map, TransferRequirementExperiment.Card.ServiceSectionDto.LabeledIconInfoDto labeledIconInfoDto, xo01 xo01Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$l10n = map;
        this.$dto = labeledIconInfoDto;
        this.$selectedTime = xo01Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ServiceSectionUiStateMapper$mapTransferTimeRow$2 serviceSectionUiStateMapper$mapTransferTimeRow$2 = new ServiceSectionUiStateMapper$mapTransferTimeRow$2(this.$l10n, this.$dto, this.$selectedTime, this.this$0, continuation);
        serviceSectionUiStateMapper$mapTransferTimeRow$2.L$0 = obj;
        return serviceSectionUiStateMapper$mapTransferTimeRow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceSectionUiStateMapper$mapTransferTimeRow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = this.$l10n.get(this.$dto.a);
            qoh h = tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapTransferTimeRow$2$leadIcon$1(this.$dto, this.this$0, null), 3);
            xo01 xo01Var = this.$selectedTime;
            String format = xo01Var != null ? String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(xo01Var.a), Integer.valueOf(xo01Var.b)}, 2)) : "00:00";
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = str;
            this.L$5 = format;
            this.label = 1;
            Object s = h.s(this);
            if (s == coroutineSingletons) {
                return coroutineSingletons;
            }
            charSequence = str;
            charSequence2 = format;
            obj = s;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charSequence2 = (CharSequence) this.L$5;
            charSequence = (CharSequence) this.L$4;
            b.b(obj);
        }
        return new cu01(charSequence, charSequence2, (Drawable) obj);
    }
}
