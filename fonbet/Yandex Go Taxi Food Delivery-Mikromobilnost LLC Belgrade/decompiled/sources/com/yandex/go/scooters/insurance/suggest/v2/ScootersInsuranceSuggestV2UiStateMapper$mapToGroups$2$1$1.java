package com.yandex.go.scooters.insurance.suggest.v2;

import defpackage.c6z;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.run0;
import defpackage.tse;
import defpackage.uun0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrun0;", "<anonymous>", "(Ltse;)Lrun0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.insurance.suggest.v2.ScootersInsuranceSuggestV2UiStateMapper$mapToGroups$2$1$1", f = "ScootersInsuranceSuggestV2UiStateMapper.kt", l = {MSException.ERROR_INVALID_PARAMETER, HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsuranceSuggestV2UiStateMapper$mapToGroups$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item $item;
    final /* synthetic */ c6z $localizedExperiment;
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsuranceSuggestV2UiStateMapper$mapToGroups$2$1$1(g gVar, ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item item, c6z c6zVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$item = item;
        this.$localizedExperiment = c6zVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersInsuranceSuggestV2UiStateMapper$mapToGroups$2$1$1(this.this$0, this.$item, this.$localizedExperiment, this.$currencyRules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersInsuranceSuggestV2UiStateMapper$mapToGroups$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        if (r9 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        ScootersInsuranceSuggestV2UiState$Item$Action scootersInsuranceSuggestV2UiState$Item$Action = null;
        if (i2 == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            FormattedText formattedText = this.$item.a;
            c6z c6zVar = this.$localizedExperiment;
            fef fefVar = this.$currencyRules;
            this.label = 1;
            obj = g.a(gVar, formattedText, c6zVar, fefVar, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence = (CharSequence) this.L$0;
                kotlin.b.b(obj);
                CharSequence charSequence2 = (CharSequence) obj;
                ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item item = this.$item;
                String str = item.c;
                i = uun0.a[item.d.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        scootersInsuranceSuggestV2UiState$Item$Action = ScootersInsuranceSuggestV2UiState$Item$Action.DETAILS;
                    } else {
                        if (i != 3) {
                            w511.b();
                            return null;
                        }
                        scootersInsuranceSuggestV2UiState$Item$Action = ScootersInsuranceSuggestV2UiState$Item$Action.PROVIDER_INFO;
                    }
                }
                return new run0(charSequence, charSequence2, str, scootersInsuranceSuggestV2UiState$Item$Action);
            }
            kotlin.b.b(obj);
        }
        CharSequence charSequence3 = (CharSequence) obj;
        g gVar2 = this.this$0;
        FormattedText formattedText2 = this.$item.b;
        c6z c6zVar2 = this.$localizedExperiment;
        fef fefVar2 = this.$currencyRules;
        this.L$0 = charSequence3;
        this.label = 2;
        Object a = g.a(gVar2, formattedText2, c6zVar2, fefVar2, this);
        if (a != coroutineSingletons) {
            charSequence = charSequence3;
            obj = a;
            CharSequence charSequence22 = (CharSequence) obj;
            ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item item2 = this.$item;
            String str2 = item2.c;
            i = uun0.a[item2.d.ordinal()];
            if (i != 1) {
            }
            return new run0(charSequence, charSequence22, str2, scootersInsuranceSuggestV2UiState$Item$Action);
        }
        return coroutineSingletons;
    }
}
