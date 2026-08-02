package com.ybsdk.feature.push.impl.domain;

import androidx.work.ExistingWorkPolicy;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ybsdk.core.analytics.generated.delegates.PushNotificationsEvents$PushNotificationsActionStartAction;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yo40;
import defpackage.yvi0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.push.impl.domain.PushNotificationsManager$unsubscribe$1", f = "PushNotificationsManager.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PushNotificationsManager$unsubscribe$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationsManager$unsubscribe$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PushNotificationsManager$unsubscribe$1 pushNotificationsManager$unsubscribe$1 = new PushNotificationsManager$unsubscribe$1(this.this$0, continuation);
        pushNotificationsManager$unsubscribe$1.L$0 = obj;
        return pushNotificationsManager$unsubscribe$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PushNotificationsManager$unsubscribe$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            this.this$0.i.X.s(PushNotificationsEvents$PushNotificationsActionStartAction.UNSUBSCRIBE);
            yo40 yo40Var = this.this$0.b;
            this.L$0 = tseVar;
            this.label = 1;
            obj = ((yvi0) yo40Var.a).u(this);
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
        String str = (String) obj;
        zy11 zy11Var = zy11.a;
        if (str == null) {
            x4c.g("Unsubscription from pushes failed", null, "uuid is null", null, 10);
            return zy11Var;
        }
        androidx.work.impl.b.i(this.this$0.a).b("PushSubscriptionTask".concat(str));
        androidx.work.impl.b.i(this.this$0.a).g("PushSubscriptionTask".concat(str), ExistingWorkPolicy.REPLACE, Collections.singletonList(ooc.j(str, null, null, null, false)));
        return zy11Var;
    }
}
