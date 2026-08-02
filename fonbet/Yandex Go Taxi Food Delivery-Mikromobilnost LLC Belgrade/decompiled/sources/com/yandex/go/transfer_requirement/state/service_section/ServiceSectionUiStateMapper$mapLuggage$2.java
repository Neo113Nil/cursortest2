package com.yandex.go.transfer_requirement.state.service_section;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.bvf0;
import defpackage.bxq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qzz;
import defpackage.rzz;
import defpackage.tse;
import defpackage.uzz;
import defpackage.vzz;
import defpackage.w511;
import defpackage.wls;
import defpackage.yo01;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lszz;", "<anonymous>", "(Ltse;)Lszz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.service_section.ServiceSectionUiStateMapper$mapLuggage$2", f = "ServiceSectionUiStateMapper.kt", l = {HProv.PP_VERSION_EX, 143}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ServiceSectionUiStateMapper$mapLuggage$2 extends SuspendLambda implements wls {
    final /* synthetic */ yo01 $cardState;
    final /* synthetic */ Map<String, String> $l10n;
    final /* synthetic */ TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto $luggageInfoDto;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceSectionUiStateMapper$mapLuggage$2(TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto luggageInfoDto, a aVar, yo01 yo01Var, Map map, Continuation continuation) {
        super(2, continuation);
        this.$luggageInfoDto = luggageInfoDto;
        this.this$0 = aVar;
        this.$cardState = yo01Var;
        this.$l10n = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ServiceSectionUiStateMapper$mapLuggage$2(this.$luggageInfoDto, this.this$0, this.$cardState, this.$l10n, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceSectionUiStateMapper$mapLuggage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r12 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r12 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return new rzz((vzz) obj);
            }
            if (i == 2) {
                b.b(obj);
                return new qzz((uzz) obj);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        int i2 = bxq0.a[this.$luggageInfoDto.a.ordinal()];
        if (i2 == 1) {
            a aVar = this.this$0;
            TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto luggageInfoDto = this.$luggageInfoDto;
            boolean z = this.$cardState.e > 0;
            Map<String, String> map = this.$l10n;
            this.label = 1;
            aVar.getClass();
            obj = bvf0.n(new ServiceSectionUiStateMapper$mapLuggageToggle$2(luggageInfoDto, map, z, aVar, null), this);
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            a aVar2 = this.this$0;
            TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto luggageInfoDto2 = this.$luggageInfoDto;
            int i3 = this.$cardState.e;
            Map<String, String> map2 = this.$l10n;
            this.label = 2;
            aVar2.getClass();
            obj = bvf0.n(new ServiceSectionUiStateMapper$mapLuggageCount$2(luggageInfoDto2, map2, i3, aVar2, null), this);
        }
        return coroutineSingletons;
    }
}
