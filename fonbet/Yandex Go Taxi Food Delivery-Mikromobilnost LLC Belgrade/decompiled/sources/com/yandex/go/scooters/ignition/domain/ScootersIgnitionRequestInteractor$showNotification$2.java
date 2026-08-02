package com.yandex.go.scooters.ignition.domain;

import androidx.core.app.v;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionResponse;
import defpackage.fef;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.m2o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2o0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/app/Notification;", "<anonymous>", "(Ltse;)Landroid/app/Notification;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionRequestInteractor$showNotification$2", f = "ScootersIgnitionRequestInteractor.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionRequestInteractor$showNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ ief $currencyRulesDto;
    final /* synthetic */ ScootersIgnitionResponse.Notification $notification;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionRequestInteractor$showNotification$2(m mVar, ScootersIgnitionResponse.Notification notification, ief iefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$notification = notification;
        this.$currencyRulesDto = iefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionRequestInteractor$showNotification$2(this.this$0, this.$notification, this.$currencyRulesDto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionRequestInteractor$showNotification$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        m2o0 m2o0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            Random.a.getClass();
            int f = Random.b.f(110000, 189000);
            m mVar = this.this$0;
            m2o0 m2o0Var2 = mVar.b;
            com.yandex.go.scooters.ignition.data.h hVar = mVar.j;
            ScootersIgnitionResponse.Notification notification = this.$notification;
            FormattedText formattedText = notification.a;
            FormattedText formattedText2 = notification.b;
            fef h = gwk0.h(this.$currencyRulesDto);
            this.L$0 = m2o0Var2;
            this.I$0 = f;
            this.I$1 = f;
            this.label = 1;
            Object a = hVar.a(formattedText, formattedText2, h, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = f;
            obj = a;
            m2o0Var = m2o0Var2;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            m2o0Var = (m2o0) this.L$0;
            kotlin.b.b(obj);
        }
        return ((o2o0) m2o0Var).f(i, (v) obj);
    }
}
