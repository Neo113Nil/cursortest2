package com.yandex.passport.internal;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import androidx.core.app.s0;
import com.yandex.passport.R;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.p9;
import com.yandex.passport.internal.report.yd;
import defpackage.jl40;
import defpackage.lxj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.PassportInitialization$actualizeNamesOfChannelsNotifications$1", f = "PassportInitialization.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PassportInitialization$actualizeNamesOfChannelsNotifications$1 extends SuspendLambda implements wls {
    final /* synthetic */ PassportProcessGlobalComponent $component;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportInitialization$actualizeNamesOfChannelsNotifications$1(PassportProcessGlobalComponent passportProcessGlobalComponent, Continuation continuation) {
        super(2, continuation);
        this.$component = passportProcessGlobalComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportInitialization$actualizeNamesOfChannelsNotifications$1(this.$component, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PassportInitialization$actualizeNamesOfChannelsNotifications$1 passportInitialization$actualizeNamesOfChannelsNotifications$1 = (PassportInitialization$actualizeNamesOfChannelsNotifications$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        passportInitialization$actualizeNamesOfChannelsNotifications$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.push.h notificationHelper = this.$component.getNotificationHelper();
        s0 s0Var = notificationHelper.s;
        Context context = notificationHelper.a;
        try {
            for (Map.Entry entry : notificationHelper.t.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                NotificationChannel notificationChannel = s0Var.b.getNotificationChannel(str);
                if (notificationChannel == null) {
                    notificationHelper.e(str);
                } else if (!jl40.l(notificationChannel.getName(), str2)) {
                    notificationChannel.setName(str2);
                    notificationChannel.setDescription(str2);
                    s0Var.b(notificationChannel);
                    if (jl40.l(str, "com.yandex.passport") && notificationChannel.getGroup() == null) {
                        s0 s0Var2 = notificationHelper.s;
                        if (com.yandex.passport.internal.util.p.k(s0Var2) == null) {
                            s0Var2.b.createNotificationChannelGroup(new NotificationChannelGroup("passport_channel_group_id", context.getString(R.string.passport_am_name_notification_channel_group_yandex_id)));
                        }
                        if (notificationChannel.getImportance() > 3) {
                            notificationChannel.setImportance(3);
                        }
                        notificationChannel.setGroup("passport_channel_group_id");
                        s0Var.b(notificationChannel);
                    }
                }
            }
            lxj k = com.yandex.passport.internal.util.p.k(s0Var);
            if (k != null) {
                String string = context.getString(R.string.passport_am_name_notification_channel_group_yandex_id);
                if (!jl40.l((CharSequence) k.a, string)) {
                    s0Var.b.createNotificationChannelGroup(new NotificationChannelGroup("passport_channel_group_id", string));
                }
            }
            failure = zy11Var;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            com.yandex.passport.internal.report.reporters.s0 s0Var3 = notificationHelper.c;
            s0Var3.getClass();
            s0Var3.f(p9.w, new yd(a), new ld(a));
        }
        return zy11Var;
    }
}
