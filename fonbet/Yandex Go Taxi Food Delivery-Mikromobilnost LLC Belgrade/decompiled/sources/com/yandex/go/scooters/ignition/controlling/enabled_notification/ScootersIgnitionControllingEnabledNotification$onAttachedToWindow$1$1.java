package com.yandex.go.scooters.ignition.controlling.enabled_notification;

import android.graphics.Bitmap;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.enabled_notification.ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1", f = "ScootersIgnitionControllingEnabledNotification.kt", l = {64, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 69}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionExperiment.Ui.EnabledNotification $enabledNotification;
    final /* synthetic */ ScootersIgnitionExperiment $experiment;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ ScootersIgnitionControllingEnabledNotification this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1(ScootersIgnitionControllingEnabledNotification scootersIgnitionControllingEnabledNotification, ScootersIgnitionExperiment.Ui.EnabledNotification enabledNotification, ScootersIgnitionExperiment scootersIgnitionExperiment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersIgnitionControllingEnabledNotification;
        this.$enabledNotification = enabledNotification;
        this.$experiment = scootersIgnitionExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1 scootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1 = new ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1(this.this$0, this.$enabledNotification, this.$experiment, continuation);
        scootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1.L$0 = obj;
        return scootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e4, code lost:
    
        if (r13 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        if (r13 == r1) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        ListItemComponent listItemComponent;
        ListItemComponent listItemComponent2;
        noh nohVar;
        ListItemComponent listItemComponent3;
        ListItemComponent listItemComponent4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$iconAsync$1(this.$enabledNotification, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$titleAsync$1(this.this$0, this.$enabledNotification, this.$experiment, null), 3);
            h2 = tje.h(tseVar, null, null, new ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$1$1$subtitleAsync$1(this.this$0, this.$enabledNotification, this.$experiment, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            obj = h3.s(this);
        } else if (i == 1) {
            h2 = (noh) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                listItemComponent4 = (ListItemComponent) this.L$5;
                b.b(obj);
                listItemComponent4.setSubtitle((CharSequence) obj);
                return zy11.a;
            }
            listItemComponent2 = (ListItemComponent) this.L$5;
            nohVar = (noh) this.L$3;
            b.b(obj);
            listItemComponent2.setTitle((CharSequence) obj);
            listItemComponent4 = this.this$0.listItemComponent;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = listItemComponent4;
            this.label = 3;
            obj = nohVar.k(this);
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            listItemComponent3 = this.this$0.listItemComponent;
            listItemComponent3.setLeadImage(bitmap);
        }
        listItemComponent = this.this$0.listItemComponent;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = null;
        this.L$5 = listItemComponent;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            noh nohVar2 = h2;
            listItemComponent2 = listItemComponent;
            obj = k;
            nohVar = nohVar2;
            listItemComponent2.setTitle((CharSequence) obj);
            listItemComponent4 = this.this$0.listItemComponent;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = listItemComponent4;
            this.label = 3;
            obj = nohVar.k(this);
        }
        return coroutineSingletons;
    }
}
