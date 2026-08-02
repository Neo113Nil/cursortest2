package com.yandex.go.plus.notification;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.g6u;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tj60;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.notifications.c;

/* loaded from: classes8.dex */
public final class a {
    public final c a;
    public final tt2 b;
    public Context c;
    public tj60 d;

    public a(c cVar, tt2 tt2Var) {
        this.a = cVar;
        this.b = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c7, code lost:
    
        if (defpackage.tje.k0(r14, r7, r1) != r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PlusSubscriptionActivationStatusInAppNotificationGateway$show$1 plusSubscriptionActivationStatusInAppNotificationGateway$show$1;
        int i;
        tj60 tj60Var;
        String str4;
        String str5;
        Context context;
        if (continuationImpl instanceof PlusSubscriptionActivationStatusInAppNotificationGateway$show$1) {
            plusSubscriptionActivationStatusInAppNotificationGateway$show$1 = (PlusSubscriptionActivationStatusInAppNotificationGateway$show$1) continuationImpl;
            int i2 = plusSubscriptionActivationStatusInAppNotificationGateway$show$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSubscriptionActivationStatusInAppNotificationGateway$show$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSubscriptionActivationStatusInAppNotificationGateway$show$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSubscriptionActivationStatusInAppNotificationGateway$show$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Context context2 = this.c;
                    if (context2 != null && (tj60Var = this.d) != null) {
                        String str6 = (str3 == null || evu0.J(str3)) ? null : str3;
                        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$0 = str;
                        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$1 = str2;
                        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$2 = null;
                        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$3 = context2;
                        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$4 = tj60Var;
                        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.label = 1;
                        Object a = this.a.a(e3n.c, str6, plusSubscriptionActivationStatusInAppNotificationGateway$show$1);
                        if (a != coroutineSingletons) {
                            str4 = str;
                            str5 = str2;
                            context = context2;
                            obj = a;
                        }
                        return coroutineSingletons;
                    }
                    return Boolean.FALSE;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return Boolean.TRUE;
                }
                tj60Var = (tj60) plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$4;
                Context context3 = (Context) plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$3;
                String str7 = (String) plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$1;
                String str8 = (String) plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$0;
                kotlin.b.b(obj);
                context = context3;
                str5 = str7;
                str4 = str8;
                tj60 tj60Var2 = tj60Var;
                this.b.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                PlusSubscriptionActivationStatusInAppNotificationGateway$show$2 plusSubscriptionActivationStatusInAppNotificationGateway$show$2 = new PlusSubscriptionActivationStatusInAppNotificationGateway$show$2(tj60Var2, context, str4, str5, (Bitmap) obj, null);
                plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$0 = null;
                plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$1 = null;
                plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$2 = null;
                plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$3 = null;
                plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$4 = null;
                plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$5 = null;
                plusSubscriptionActivationStatusInAppNotificationGateway$show$1.label = 2;
            }
        }
        plusSubscriptionActivationStatusInAppNotificationGateway$show$1 = new PlusSubscriptionActivationStatusInAppNotificationGateway$show$1(this, continuationImpl);
        Object obj2 = plusSubscriptionActivationStatusInAppNotificationGateway$show$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSubscriptionActivationStatusInAppNotificationGateway$show$1.label;
        if (i != 0) {
        }
        tj60 tj60Var22 = tj60Var;
        this.b.getClass();
        sjh sjhVar2 = uyj.a;
        g6u g6uVar2 = o400.a;
        PlusSubscriptionActivationStatusInAppNotificationGateway$show$2 plusSubscriptionActivationStatusInAppNotificationGateway$show$22 = new PlusSubscriptionActivationStatusInAppNotificationGateway$show$2(tj60Var22, context, str4, str5, (Bitmap) obj2, null);
        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$0 = null;
        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$1 = null;
        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$2 = null;
        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$3 = null;
        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$4 = null;
        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.L$5 = null;
        plusSubscriptionActivationStatusInAppNotificationGateway$show$1.label = 2;
    }
}
