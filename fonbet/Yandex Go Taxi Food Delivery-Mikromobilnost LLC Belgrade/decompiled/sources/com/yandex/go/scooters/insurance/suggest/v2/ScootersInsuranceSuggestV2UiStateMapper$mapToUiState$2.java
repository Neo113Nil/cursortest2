package com.yandex.go.scooters.insurance.suggest.v2;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.c6z;
import defpackage.fef;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.sun0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsun0;", "<anonymous>", "(Ltse;)Lsun0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.insurance.suggest.v2.ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2", f = "ScootersInsuranceSuggestV2UiStateMapper.kt", l = {62, 67, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 70, 71, 72}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ long $insurancePrice;
    final /* synthetic */ long $insurancePriceCoverage;
    final /* synthetic */ ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow $insuranceUpsaleWindow;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ c6z $localizedExperiment;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2(g gVar, ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow upsaleWindow, c6z c6zVar, fef fefVar, boolean z, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$insuranceUpsaleWindow = upsaleWindow;
        this.$localizedExperiment = c6zVar;
        this.$currencyRules = fefVar;
        this.$isLoading = z;
        this.$insurancePriceCoverage = j;
        this.$insurancePrice = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2 scootersInsuranceSuggestV2UiStateMapper$mapToUiState$2 = new ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2(this.this$0, this.$insuranceUpsaleWindow, this.$localizedExperiment, this.$currencyRules, this.$isLoading, this.$insurancePriceCoverage, this.$insurancePrice, continuation);
        scootersInsuranceSuggestV2UiStateMapper$mapToUiState$2.L$0 = obj;
        return scootersInsuranceSuggestV2UiStateMapper$mapToUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ed  */
    /* JADX WARN: Type inference failed for: r0v10, types: [noh] */
    /* JADX WARN: Type inference failed for: r3v8, types: [noh] */
    /* JADX WARN: Type inference failed for: r4v14, types: [noh] */
    /* JADX WARN: Type inference failed for: r7v13, types: [noh] */
    /* JADX WARN: Type inference failed for: r9v23, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        qoh h2;
        Object b;
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        Object k;
        List list;
        boolean z;
        noh nohVar4;
        String str;
        noh nohVar5;
        Object k2;
        String str2;
        List list2;
        noh nohVar6;
        CharSequence charSequence;
        Object k3;
        noh nohVar7;
        CharSequence charSequence2;
        Object k4;
        List list3;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        String str3;
        Object k5;
        CharSequence charSequence6;
        String str4;
        CharSequence charSequence7;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                qoh h3 = tje.h(tseVar, null, null, new ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$insuranceUpsaleWindow, this.$localizedExperiment, this.$currencyRules, null), 3);
                h = tje.h(tseVar, null, null, new ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2$subtitleAsync$1(this.this$0, this.$insuranceUpsaleWindow, this.$localizedExperiment, this.$currencyRules, this.$insurancePriceCoverage, null), 3);
                qoh h4 = tje.h(tseVar, null, null, new ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2$rejectButtonTextAsync$1(this.this$0, this.$insuranceUpsaleWindow, this.$localizedExperiment, this.$currencyRules, null), 3);
                qoh h5 = tje.h(tseVar, null, null, new ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2$confirmButtonTextAsync$1(this.this$0, this.$insuranceUpsaleWindow, this.$localizedExperiment, this.$currencyRules, this.$insurancePrice, null), 3);
                h2 = tje.h(tseVar, null, null, new ScootersInsuranceSuggestV2UiStateMapper$mapToUiState$2$bottomProviderInfoTextAsync$1(this.this$0, this.$insuranceUpsaleWindow, this.$localizedExperiment, this.$currencyRules, null), 3);
                g gVar = this.this$0;
                ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow upsaleWindow = this.$insuranceUpsaleWindow;
                c6z c6zVar = this.$localizedExperiment;
                fef fefVar = this.$currencyRules;
                this.L$0 = null;
                this.L$1 = h3;
                this.L$2 = h;
                this.L$3 = h4;
                this.L$4 = h5;
                this.L$5 = h2;
                this.label = 1;
                b = g.b(gVar, tseVar, upsaleWindow, c6zVar, fefVar, this);
                if (b != coroutineSingletons) {
                    nohVar = h3;
                    nohVar2 = h4;
                    nohVar3 = h5;
                    List list4 = (List) b;
                    boolean z2 = this.$isLoading;
                    String str5 = this.$insuranceUpsaleWindow.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = h;
                    this.L$3 = nohVar2;
                    this.L$4 = nohVar3;
                    this.L$5 = h2;
                    this.L$6 = list4;
                    this.L$7 = str5;
                    this.Z$0 = z2;
                    this.label = 2;
                    k = nohVar.k(this);
                    if (k != coroutineSingletons) {
                        noh nohVar8 = nohVar2;
                        list = list4;
                        z = z2;
                        nohVar4 = nohVar3;
                        str = str5;
                        nohVar5 = nohVar8;
                        CharSequence charSequence8 = (CharSequence) k;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = nohVar5;
                        this.L$4 = nohVar4;
                        this.L$5 = h2;
                        this.L$6 = list;
                        this.L$7 = str;
                        this.L$8 = charSequence8;
                        this.Z$0 = z;
                        this.label = 3;
                        k2 = h.k(this);
                        if (k2 != coroutineSingletons) {
                            str2 = str;
                            list2 = list;
                            nohVar6 = nohVar4;
                            charSequence = charSequence8;
                            CharSequence charSequence9 = (CharSequence) k2;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = nohVar6;
                            this.L$5 = h2;
                            this.L$6 = null;
                            this.L$7 = str2;
                            this.L$8 = charSequence;
                            this.L$9 = charSequence9;
                            this.L$10 = list2;
                            this.Z$0 = z;
                            this.label = 4;
                            k3 = nohVar5.k(this);
                            if (k3 != coroutineSingletons) {
                                nohVar7 = nohVar6;
                                charSequence2 = charSequence9;
                                CharSequence charSequence10 = (CharSequence) k3;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = h2;
                                this.L$6 = null;
                                this.L$7 = str2;
                                this.L$8 = charSequence;
                                this.L$9 = charSequence2;
                                this.L$10 = list2;
                                this.L$11 = charSequence10;
                                this.Z$0 = z;
                                this.label = 5;
                                k4 = nohVar7.k(this);
                                if (k4 != coroutineSingletons) {
                                    CharSequence charSequence11 = charSequence;
                                    list3 = list2;
                                    charSequence3 = charSequence11;
                                    String str6 = str2;
                                    charSequence4 = charSequence2;
                                    charSequence5 = charSequence10;
                                    str3 = str6;
                                    CharSequence charSequence12 = (CharSequence) k4;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = str3;
                                    this.L$8 = charSequence3;
                                    this.L$9 = charSequence4;
                                    this.L$10 = list3;
                                    this.L$11 = charSequence5;
                                    this.L$12 = charSequence12;
                                    this.Z$0 = z;
                                    this.label = 6;
                                    k5 = h2.k(this);
                                    if (k5 != coroutineSingletons) {
                                        charSequence6 = charSequence12;
                                        str4 = str3;
                                        charSequence7 = charSequence3;
                                        return new sun0(z, str4, charSequence7, charSequence4, list3, charSequence5, charSequence6, (CharSequence) k5);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                ?? r0 = (noh) this.L$5;
                nohVar3 = (noh) this.L$4;
                nohVar2 = (noh) this.L$3;
                noh nohVar9 = (noh) this.L$2;
                nohVar = (noh) this.L$1;
                kotlin.b.b(obj);
                h2 = r0;
                h = nohVar9;
                b = obj;
                List list42 = (List) b;
                boolean z22 = this.$isLoading;
                String str52 = this.$insuranceUpsaleWindow.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = nohVar2;
                this.L$4 = nohVar3;
                this.L$5 = h2;
                this.L$6 = list42;
                this.L$7 = str52;
                this.Z$0 = z22;
                this.label = 2;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                z = this.Z$0;
                str = (String) this.L$7;
                list = (List) this.L$6;
                ?? r3 = (noh) this.L$5;
                noh nohVar10 = (noh) this.L$4;
                nohVar5 = (noh) this.L$3;
                h = (noh) this.L$2;
                kotlin.b.b(obj);
                h2 = r3;
                nohVar4 = nohVar10;
                k = obj;
                CharSequence charSequence82 = (CharSequence) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar5;
                this.L$4 = nohVar4;
                this.L$5 = h2;
                this.L$6 = list;
                this.L$7 = str;
                this.L$8 = charSequence82;
                this.Z$0 = z;
                this.label = 3;
                k2 = h.k(this);
                if (k2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                z = this.Z$0;
                CharSequence charSequence13 = (CharSequence) this.L$8;
                String str7 = (String) this.L$7;
                List list5 = (List) this.L$6;
                ?? r4 = (noh) this.L$5;
                noh nohVar11 = (noh) this.L$4;
                nohVar5 = (noh) this.L$3;
                kotlin.b.b(obj);
                charSequence = charSequence13;
                list2 = list5;
                h2 = r4;
                str2 = str7;
                nohVar6 = nohVar11;
                k2 = obj;
                CharSequence charSequence92 = (CharSequence) k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar6;
                this.L$5 = h2;
                this.L$6 = null;
                this.L$7 = str2;
                this.L$8 = charSequence;
                this.L$9 = charSequence92;
                this.L$10 = list2;
                this.Z$0 = z;
                this.label = 4;
                k3 = nohVar5.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                z = this.Z$0;
                list2 = (List) this.L$10;
                charSequence2 = (CharSequence) this.L$9;
                charSequence = (CharSequence) this.L$8;
                str2 = (String) this.L$7;
                ?? r7 = (noh) this.L$5;
                noh nohVar12 = (noh) this.L$4;
                kotlin.b.b(obj);
                h2 = r7;
                nohVar7 = nohVar12;
                k3 = obj;
                CharSequence charSequence102 = (CharSequence) k3;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = h2;
                this.L$6 = null;
                this.L$7 = str2;
                this.L$8 = charSequence;
                this.L$9 = charSequence2;
                this.L$10 = list2;
                this.L$11 = charSequence102;
                this.Z$0 = z;
                this.label = 5;
                k4 = nohVar7.k(this);
                if (k4 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                z = this.Z$0;
                CharSequence charSequence14 = (CharSequence) this.L$11;
                List list6 = (List) this.L$10;
                CharSequence charSequence15 = (CharSequence) this.L$9;
                CharSequence charSequence16 = (CharSequence) this.L$8;
                String str8 = (String) this.L$7;
                ?? r9 = (noh) this.L$5;
                kotlin.b.b(obj);
                charSequence5 = charSequence14;
                charSequence3 = charSequence16;
                charSequence4 = charSequence15;
                list3 = list6;
                h2 = r9;
                str3 = str8;
                k4 = obj;
                CharSequence charSequence122 = (CharSequence) k4;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = str3;
                this.L$8 = charSequence3;
                this.L$9 = charSequence4;
                this.L$10 = list3;
                this.L$11 = charSequence5;
                this.L$12 = charSequence122;
                this.Z$0 = z;
                this.label = 6;
                k5 = h2.k(this);
                if (k5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                z = this.Z$0;
                CharSequence charSequence17 = (CharSequence) this.L$12;
                charSequence5 = (CharSequence) this.L$11;
                list3 = (List) this.L$10;
                charSequence4 = (CharSequence) this.L$9;
                CharSequence charSequence18 = (CharSequence) this.L$8;
                String str9 = (String) this.L$7;
                kotlin.b.b(obj);
                k5 = obj;
                charSequence6 = charSequence17;
                charSequence7 = charSequence18;
                str4 = str9;
                return new sun0(z, str4, charSequence7, charSequence4, list3, charSequence5, charSequence6, (CharSequence) k5);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
