package com.yandex.go.scooters.data.mapper;

import defpackage.bdc;
import defpackage.fef;
import defpackage.h5w;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.otn0;
import defpackage.pdc;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lotn0;", "<anonymous>", "(Ltse;)Lotn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScooterOfferMapper$mapToOptionItemConfig$2", f = "ScooterOfferMapper.kt", l = {541, 542, 543}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScooterOfferMapper$mapToOptionItemConfig$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ h5w.a $experimentOfferItemConfig;
    final /* synthetic */ ScootersClientInsuranceNewExperiment $insuranceExperiment;
    final /* synthetic */ long $insurancePrice;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScooterOfferMapper$mapToOptionItemConfig$2(a aVar, h5w.a aVar2, ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment, fef fefVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$experimentOfferItemConfig = aVar2;
        this.$insuranceExperiment = scootersClientInsuranceNewExperiment;
        this.$currencyRules = fefVar;
        this.$insurancePrice = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScooterOfferMapper$mapToOptionItemConfig$2 scooterOfferMapper$mapToOptionItemConfig$2 = new ScooterOfferMapper$mapToOptionItemConfig$2(this.this$0, this.$experimentOfferItemConfig, this.$insuranceExperiment, this.$currencyRules, this.$insurancePrice, continuation);
        scooterOfferMapper$mapToOptionItemConfig$2.L$0 = obj;
        return scooterOfferMapper$mapToOptionItemConfig$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScooterOfferMapper$mapToOptionItemConfig$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r3 == r2) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    /* JADX WARN: Type inference failed for: r3v11, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qoh h;
        noh h2;
        Object s;
        Object k;
        noh nohVar;
        CharSequence charSequence;
        Object k2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new ScooterOfferMapper$mapToOptionItemConfig$2$titleAsync$1(this.this$0, this.$experimentOfferItemConfig, this.$insuranceExperiment, this.$currencyRules, this.$insurancePrice, null), 3);
            h = tje.h(tseVar, null, null, new ScooterOfferMapper$mapToOptionItemConfig$2$subtitleAsync$1(this.this$0, this.$experimentOfferItemConfig, this.$insuranceExperiment, this.$currencyRules, this.$insurancePrice, null), 3);
            h2 = tje.h(tseVar, null, null, new ScooterOfferMapper$mapToOptionItemConfig$2$trailLabelAsync$1(this.this$0, this.$experimentOfferItemConfig, this.$insuranceExperiment, this.$currencyRules, this.$insurancePrice, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            s = h3.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence3 = (CharSequence) this.L$5;
                    charSequence2 = (CharSequence) this.L$4;
                    kotlin.b.b(obj);
                    k2 = obj;
                    pdc pdcVar = this.this$0.b;
                    return new otn0(charSequence2, charSequence3, (CharSequence) k2, ((ufu) pdcVar).a(new bdc(xng0.controlMinor), this.$experimentOfferItemConfig.d));
                }
                charSequence = (CharSequence) this.L$4;
                nohVar = (noh) this.L$3;
                kotlin.b.b(obj);
                k = obj;
                CharSequence charSequence4 = (CharSequence) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = charSequence;
                this.L$5 = charSequence4;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                    charSequence2 = charSequence;
                    charSequence3 = charSequence4;
                    pdc pdcVar2 = this.this$0.b;
                    return new otn0(charSequence2, charSequence3, (CharSequence) k2, ((ufu) pdcVar2).a(new bdc(xng0.controlMinor), this.$experimentOfferItemConfig.d));
                }
                return coroutineSingletons;
            }
            h2 = (noh) this.L$3;
            ?? r3 = (noh) this.L$2;
            kotlin.b.b(obj);
            h = r3;
            s = obj;
        }
        CharSequence charSequence5 = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = charSequence5;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            nohVar = h2;
            charSequence = charSequence5;
            CharSequence charSequence42 = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = charSequence;
            this.L$5 = charSequence42;
            this.label = 3;
            k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
