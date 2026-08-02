package com.yandex.go.transfer_requirement.state.service_section;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.axq0;
import defpackage.cu01;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rnr;
import defpackage.szz;
import defpackage.tje;
import defpackage.tse;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Laxq0;", "<anonymous>", "(Ltse;)Laxq0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.service_section.ServiceSectionUiStateMapper$map$2", f = "ServiceSectionUiStateMapper.kt", l = {72, HProv.ALG_SID_GR3410_12_256, 74, HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ServiceSectionUiStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ yo01 $cardState;
    final /* synthetic */ boolean $flightNumberValidationEnabled;
    final /* synthetic */ Map<String, String> $l10n;
    final /* synthetic */ TransferRequirementExperiment.Card.ServiceSectionDto $serviceSection;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceSectionUiStateMapper$map$2(TransferRequirementExperiment.Card.ServiceSectionDto serviceSectionDto, boolean z, a aVar, yo01 yo01Var, Map map, Continuation continuation) {
        super(2, continuation);
        this.$serviceSection = serviceSectionDto;
        this.$flightNumberValidationEnabled = z;
        this.this$0 = aVar;
        this.$cardState = yo01Var;
        this.$l10n = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ServiceSectionUiStateMapper$map$2 serviceSectionUiStateMapper$map$2 = new ServiceSectionUiStateMapper$map$2(this.$serviceSection, this.$flightNumberValidationEnabled, this.this$0, this.$cardState, this.$l10n, continuation);
        serviceSectionUiStateMapper$map$2.L$0 = obj;
        return serviceSectionUiStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceSectionUiStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012f  */
    /* JADX WARN: Type inference failed for: r3v11, types: [noh] */
    /* JADX WARN: Type inference failed for: r6v8, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qoh h;
        noh h2;
        Object s;
        noh nohVar;
        Object k;
        noh nohVar2;
        rnr rnrVar;
        Object k2;
        rnr rnrVar2;
        cu01 cu01Var;
        noh nohVar3;
        Object k3;
        cu01 cu01Var2;
        rnr rnrVar3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            TransferRequirementExperiment.Card.ServiceSectionDto serviceSectionDto = this.$serviceSection;
            if (serviceSectionDto == null) {
                return null;
            }
            qoh h3 = tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$map$2$numberInput$1(serviceSectionDto, this.this$0, this.$cardState, this.$l10n, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$map$2$transferTimeRow$1(this.$serviceSection, this.this$0, this.$cardState, this.$l10n, null), 3);
            h = tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$map$2$carriageInput$1(this.$serviceSection, this.this$0, this.$cardState, this.$l10n, null), 3);
            h2 = tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$map$2$luggage$1(this.$serviceSection, this.this$0, this.$cardState, this.$l10n, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h4;
            this.L$3 = h;
            this.L$4 = h2;
            this.label = 1;
            s = h3.s(this);
            if (s != coroutineSingletons) {
                nohVar = h4;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                rnrVar = (rnr) this.L$5;
                nohVar2 = (noh) this.L$4;
                ?? r6 = (noh) this.L$3;
                b.b(obj);
                h = r6;
                k = obj;
                cu01 cu01Var3 = (cu01) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar2;
                this.L$5 = rnrVar;
                this.L$6 = cu01Var3;
                this.label = 3;
                k2 = h.k(this);
                if (k2 != coroutineSingletons) {
                    noh nohVar4 = nohVar2;
                    rnrVar2 = rnrVar;
                    cu01Var = cu01Var3;
                    nohVar3 = nohVar4;
                    rnr rnrVar4 = (rnr) k2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = rnrVar2;
                    this.L$6 = cu01Var;
                    this.L$7 = rnrVar4;
                    this.label = 4;
                    k3 = nohVar3.k(this);
                    if (k3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rnr rnrVar5 = (rnr) this.L$7;
                cu01 cu01Var4 = (cu01) this.L$6;
                rnrVar2 = (rnr) this.L$5;
                b.b(obj);
                k3 = obj;
                rnrVar3 = rnrVar5;
                cu01Var2 = cu01Var4;
                return new axq0(rnrVar2, cu01Var2, rnrVar3, (szz) k3, this.$flightNumberValidationEnabled);
            }
            cu01Var = (cu01) this.L$6;
            rnrVar2 = (rnr) this.L$5;
            noh nohVar5 = (noh) this.L$4;
            b.b(obj);
            nohVar3 = nohVar5;
            k2 = obj;
            rnr rnrVar42 = (rnr) k2;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = rnrVar2;
            this.L$6 = cu01Var;
            this.L$7 = rnrVar42;
            this.label = 4;
            k3 = nohVar3.k(this);
            if (k3 != coroutineSingletons) {
                cu01Var2 = cu01Var;
                rnrVar3 = rnrVar42;
                return new axq0(rnrVar2, cu01Var2, rnrVar3, (szz) k3, this.$flightNumberValidationEnabled);
            }
            return coroutineSingletons;
        }
        h2 = (noh) this.L$4;
        ?? r3 = (noh) this.L$3;
        nohVar = (noh) this.L$2;
        b.b(obj);
        h = r3;
        s = obj;
        rnr rnrVar6 = (rnr) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h;
        this.L$4 = h2;
        this.L$5 = rnrVar6;
        this.label = 2;
        k = nohVar.k(this);
        if (k != coroutineSingletons) {
            nohVar2 = h2;
            rnrVar = rnrVar6;
            cu01 cu01Var32 = (cu01) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = nohVar2;
            this.L$5 = rnrVar;
            this.L$6 = cu01Var32;
            this.label = 3;
            k2 = h.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
