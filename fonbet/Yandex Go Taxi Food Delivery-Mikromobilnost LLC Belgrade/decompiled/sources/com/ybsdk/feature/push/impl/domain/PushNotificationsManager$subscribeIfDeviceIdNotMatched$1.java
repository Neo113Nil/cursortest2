package com.ybsdk.feature.push.impl.domain;

import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.core.analytics.generated.delegates.PushNotificationsEvents$PushNotificationsActionStartAction;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.va90;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.push.impl.domain.PushNotificationsManager$subscribeIfDeviceIdNotMatched$1", f = "PushNotificationsManager.kt", l = {HProv.PP_ENUM_LOG, 142}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PushNotificationsManager$subscribeIfDeviceIdNotMatched$1 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationsManager$subscribeIfDeviceIdNotMatched$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PushNotificationsManager$subscribeIfDeviceIdNotMatched$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PushNotificationsManager$subscribeIfDeviceIdNotMatched$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        if (com.ybsdk.feature.push.impl.domain.a.a(r11, r10) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            long j = this.this$0.f.a.getLong("currentSubscribedUid", 0L);
            Long valueOf = Long.valueOf(j);
            if (j == 0) {
                valueOf = null;
            }
            i = valueOf != null ? 1 : 0;
            String string = this.this$0.f.a.getString("currentSubscribedDeviceId", null);
            va90 va90Var = this.this$0.h;
            this.L$0 = string;
            this.I$0 = i;
            this.label = 1;
            Object d = ((DeviceIdProvider) va90Var.a).d(this);
            if (d != coroutineSingletons) {
                str = string;
                obj = d;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.I$0;
        str = (String) this.L$0;
        kotlin.b.b(obj);
        boolean l = jl40.l(str, obj);
        if (i != 0 && !l) {
            this.this$0.i.X.s(PushNotificationsEvents$PushNotificationsActionStartAction.SUBSCRIBE_IF_DEVICE_ID_CHANGED);
            a aVar = this.this$0;
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
