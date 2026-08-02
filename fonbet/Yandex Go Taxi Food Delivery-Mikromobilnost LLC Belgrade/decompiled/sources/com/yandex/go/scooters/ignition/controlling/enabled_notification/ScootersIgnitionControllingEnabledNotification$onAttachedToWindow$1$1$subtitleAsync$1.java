package com.yandex.go.scooters.ignition.controlling.enabled_notification;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.f9s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.enabled_notification.ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$subtitleAsync$1", f = "ScootersIgnitionControllingEnabledNotification.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$subtitleAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionExperiment.Ui.EnabledNotification $enabledNotification;
    final /* synthetic */ ScootersIgnitionExperiment $experiment;
    int label;
    final /* synthetic */ ScootersIgnitionControllingEnabledNotification this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$subtitleAsync$1(ScootersIgnitionControllingEnabledNotification scootersIgnitionControllingEnabledNotification, ScootersIgnitionExperiment.Ui.EnabledNotification enabledNotification, ScootersIgnitionExperiment scootersIgnitionExperiment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersIgnitionControllingEnabledNotification;
        this.$enabledNotification = enabledNotification;
        this.$experiment = scootersIgnitionExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$subtitleAsync$1(this.this$0, this.$enabledNotification, this.$experiment, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$subtitleAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        cVar = this.this$0.formattedTextConverter;
        FormattedText e = f9s.e(this.$enabledNotification.c, this.$experiment);
        this.label = 1;
        Object e2 = c.e(cVar, e, null, false, this, 30);
        return e2 == coroutineSingletons ? coroutineSingletons : e2;
    }
}
