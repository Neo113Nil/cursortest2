package com.ybsdk.feature.push.impl.domain;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.e5z0;
import defpackage.guy;
import defpackage.i3y;
import defpackage.i5z0;
import defpackage.juy;
import defpackage.ny61;
import defpackage.ong;
import defpackage.oo31;
import defpackage.pmf0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/push/impl/domain/PushNotificationsSubscriptionTask;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ooc", "feature-push-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PushNotificationsSubscriptionTask extends CoroutineWorker {
    public final i3y c;

    public PushNotificationsSubscriptionTask(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.c = kotlin.a.a(new pmf0(24));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PushNotificationsSubscriptionTask$doWork$1 pushNotificationsSubscriptionTask$doWork$1;
        int i;
        boolean z;
        String str;
        String a;
        String a2;
        juy juyVar;
        if (continuationImpl instanceof PushNotificationsSubscriptionTask$doWork$1) {
            pushNotificationsSubscriptionTask$doWork$1 = (PushNotificationsSubscriptionTask$doWork$1) continuationImpl;
            int i2 = pushNotificationsSubscriptionTask$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushNotificationsSubscriptionTask$doWork$1.label = i2 - Integer.MIN_VALUE;
                PushNotificationsSubscriptionTask$doWork$1 pushNotificationsSubscriptionTask$doWork$12 = pushNotificationsSubscriptionTask$doWork$1;
                Object obj = pushNotificationsSubscriptionTask$doWork$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushNotificationsSubscriptionTask$doWork$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ong inputData = getInputData();
                    Object obj2 = Boolean.TRUE;
                    Object obj3 = inputData.a.get("operation");
                    if (obj3 instanceof Boolean) {
                        obj2 = obj3;
                    }
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    String a3 = getInputData().a("uuid");
                    if (a3 == null) {
                        return new guy();
                    }
                    i5z0.a.a("Started task for uuid: " + a3 + ", will subscribe: " + booleanValue, new Object[0]);
                    i3y i3yVar = this.c;
                    if (booleanValue) {
                        String a4 = getInputData().a(AuthSdkActivity.RESPONSE_TYPE_TOKEN);
                        if (a4 != null && (a = getInputData().a("platform")) != null && (a2 = getInputData().a(MetaDataField.DEVICE_ID_FIELD)) != null) {
                            b bVar = (b) i3yVar.getValue();
                            pushNotificationsSubscriptionTask$doWork$12.L$0 = a3;
                            pushNotificationsSubscriptionTask$doWork$12.Z$0 = booleanValue;
                            pushNotificationsSubscriptionTask$doWork$12.label = 1;
                            Object a5 = bVar.a(a3, a2, a4, a, pushNotificationsSubscriptionTask$doWork$12);
                            if (a5 != coroutineSingletons) {
                                obj = a5;
                                z = booleanValue;
                                str = a3;
                                juyVar = (juy) obj;
                            }
                        }
                        return new guy();
                    }
                    b bVar2 = (b) i3yVar.getValue();
                    pushNotificationsSubscriptionTask$doWork$12.L$0 = a3;
                    pushNotificationsSubscriptionTask$doWork$12.Z$0 = booleanValue;
                    pushNotificationsSubscriptionTask$doWork$12.label = 2;
                    Object b = bVar2.b(a3, pushNotificationsSubscriptionTask$doWork$12);
                    if (b != coroutineSingletons) {
                        obj = b;
                        z = booleanValue;
                        str = a3;
                        juyVar = (juy) obj;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    z = pushNotificationsSubscriptionTask$doWork$12.Z$0;
                    str = (String) pushNotificationsSubscriptionTask$doWork$12.L$0;
                    kotlin.b.b(obj);
                    juyVar = (juy) obj;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = pushNotificationsSubscriptionTask$doWork$12.Z$0;
                    str = (String) pushNotificationsSubscriptionTask$doWork$12.L$0;
                    kotlin.b.b(obj);
                    juyVar = (juy) obj;
                }
                e5z0 e5z0Var = i5z0.a;
                StringBuilder l = oo31.l("Task for uuid: ", str, ", subscribe: ", ", completed: ", z);
                l.append(juyVar);
                e5z0Var.a(l.toString(), new Object[0]);
                return juyVar;
            }
        }
        pushNotificationsSubscriptionTask$doWork$1 = new PushNotificationsSubscriptionTask$doWork$1(this, continuationImpl);
        PushNotificationsSubscriptionTask$doWork$1 pushNotificationsSubscriptionTask$doWork$122 = pushNotificationsSubscriptionTask$doWork$1;
        Object obj4 = pushNotificationsSubscriptionTask$doWork$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushNotificationsSubscriptionTask$doWork$122.label;
        if (i != 0) {
        }
        e5z0 e5z0Var2 = i5z0.a;
        StringBuilder l2 = oo31.l("Task for uuid: ", str, ", subscribe: ", ", completed: ", z);
        l2.append(juyVar);
        e5z0Var2.a(l2.toString(), new Object[0]);
        return juyVar;
    }
}
