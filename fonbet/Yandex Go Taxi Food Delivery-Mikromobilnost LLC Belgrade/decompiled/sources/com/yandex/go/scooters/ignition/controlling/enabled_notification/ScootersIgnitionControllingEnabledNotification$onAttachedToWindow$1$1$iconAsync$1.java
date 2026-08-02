package com.yandex.go.scooters.ignition.controlling.enabled_notification;

import android.graphics.Bitmap;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.g16;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pav;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.enabled_notification.ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$iconAsync$1", f = "ScootersIgnitionControllingEnabledNotification.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$iconAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionExperiment.Ui.EnabledNotification $enabledNotification;
    Object L$0;
    int label;
    final /* synthetic */ ScootersIgnitionControllingEnabledNotification this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$iconAsync$1(ScootersIgnitionExperiment.Ui.EnabledNotification enabledNotification, ScootersIgnitionControllingEnabledNotification scootersIgnitionControllingEnabledNotification, Continuation continuation) {
        super(2, continuation);
        this.$enabledNotification = enabledNotification;
        this.this$0 = scootersIgnitionControllingEnabledNotification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$iconAsync$1(this.$enabledNotification, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$iconAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k7x0 k7x0Var;
        pav pavVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (this.$enabledNotification.a.length() <= 0) {
                return null;
            }
            k7x0Var = this.this$0.tagUrlFormatter;
            String a = ((m7x0) k7x0Var).a(this.$enabledNotification.a);
            pavVar = this.this$0.imageLoader;
            g16 b = pavVar.b().b(a);
            this.L$0 = null;
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (Bitmap) obj;
    }
}
