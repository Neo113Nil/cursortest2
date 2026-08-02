package com.yandex.go.scooters.data.mapper;

import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersDetailsMapper$toDetailsItem$3$modalViewSubtitleAsync$1", f = "ScootersDetailsMapper.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDetailsMapper$toDetailsItem$3$modalViewSubtitleAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ FormattedText $modalViewSubtitle;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailsMapper$toDetailsItem$3$modalViewSubtitleAsync$1(fef fefVar, c cVar, Continuation continuation, FormattedText formattedText) {
        super(2, continuation);
        this.$modalViewSubtitle = formattedText;
        this.this$0 = cVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FormattedText formattedText = this.$modalViewSubtitle;
        return new ScootersDetailsMapper$toDetailsItem$3$modalViewSubtitleAsync$1(this.$currencyRules, this.this$0, continuation, formattedText);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDetailsMapper$toDetailsItem$3$modalViewSubtitleAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            FormattedText formattedText = this.$modalViewSubtitle;
            if (formattedText == null) {
                return null;
            }
            c cVar = this.this$0;
            fef fefVar = this.$currencyRules;
            this.label = 1;
            obj = c.a(cVar, formattedText, fefVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (CharSequence) obj;
    }
}
