package com.yandex.go.messenger_native;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.yandex.messaging.PushPriority;
import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.action.MessagingActionParser;
import defpackage.c120;
import defpackage.ftn;
import defpackage.h720;
import defpackage.i3y;
import defpackage.j420;
import defpackage.jb7;
import defpackage.jl40;
import defpackage.l7c;
import defpackage.leb1;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.p520;
import defpackage.pyh0;
import defpackage.pyr;
import defpackage.scc;
import defpackage.syr;
import defpackage.t350;
import defpackage.wz10;
import defpackage.z83;
import defpackage.z8g;
import defpackage.zmg0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d {
    public static final List d = scc.g(48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 42, 35, 169);
    public final Context a;
    public final c120 b;
    public final t350 c;

    public d(Context context, c120 c120Var, t350 t350Var) {
        this.a = context;
        this.b = c120Var;
        this.c = t350Var;
        syr syrVar = new syr(context, new pyr(context.getString(pyh0.provider_authority), context.getString(pyh0.provider_package), context.getString(pyh0.font_query), zmg0.com_google_android_gms_fonts_certs));
        syrVar.b = true;
        syrVar.a(d);
        syrVar.e = 1;
        ftn.d(syrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Intent intent, ContinuationImpl continuationImpl) {
        NativeMessengerDelegateImpl$handleNotificationIntent$1 nativeMessengerDelegateImpl$handleNotificationIntent$1;
        Object obj;
        int i;
        MessagingAction messagingAction;
        Bundle bundleExtra;
        if (continuationImpl instanceof NativeMessengerDelegateImpl$handleNotificationIntent$1) {
            nativeMessengerDelegateImpl$handleNotificationIntent$1 = (NativeMessengerDelegateImpl$handleNotificationIntent$1) continuationImpl;
            int i2 = nativeMessengerDelegateImpl$handleNotificationIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nativeMessengerDelegateImpl$handleNotificationIntent$1.label = i2 - Integer.MIN_VALUE;
                obj = nativeMessengerDelegateImpl$handleNotificationIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nativeMessengerDelegateImpl$handleNotificationIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (intent != null) {
                        if (!jl40.l(intent.getAction(), "com.yandex.messenger.Notification.ACTION")) {
                            intent = null;
                        }
                        if (intent != null && (bundleExtra = intent.getBundleExtra("com.yandex.messenger.MESSAGING_ACTION")) != null) {
                            messagingAction = MessagingActionParser.a(bundleExtra);
                            if (messagingAction != null) {
                                nativeMessengerDelegateImpl$handleNotificationIntent$1.L$0 = null;
                                nativeMessengerDelegateImpl$handleNotificationIntent$1.L$1 = messagingAction;
                                nativeMessengerDelegateImpl$handleNotificationIntent$1.label = 1;
                                obj = this.c.a.b(nativeMessengerDelegateImpl$handleNotificationIntent$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return zy11.a;
                        }
                    }
                    messagingAction = null;
                    if (messagingAction != null) {
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                messagingAction = (MessagingAction) nativeMessengerDelegateImpl$handleNotificationIntent$1.L$1;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    Context context = this.a;
                    jb7 jb7Var = new jb7(context);
                    p520 b = leb1.b(context);
                    j420 j420Var = (j420) ((i3y) jb7Var.w).getValue();
                    if (((Boolean) j420Var.c.getValue()).booleanValue()) {
                        ((h720) ((z8g) jb7Var.k()).H.get()).a();
                        ((z8g) jb7Var.k()).a().f("tech_messenger_opened_with_action", "action", messagingAction.getClass().getSimpleName(), "source", b.b());
                        wz10.a((wz10) ((z8g) jb7Var.k()).q.get(), context, messagingAction, b);
                    } else {
                        z83.i();
                        Toast.makeText(j420Var.a, oyh0.error_default, 0).show();
                    }
                }
                return zy11.a;
            }
        }
        nativeMessengerDelegateImpl$handleNotificationIntent$1 = new NativeMessengerDelegateImpl$handleNotificationIntent$1(this, continuationImpl);
        obj = nativeMessengerDelegateImpl$handleNotificationIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nativeMessengerDelegateImpl$handleNotificationIntent$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        NativeMessengerDelegateImpl$handlePush$1 nativeMessengerDelegateImpl$handlePush$1;
        Object obj;
        int i;
        if (continuationImpl instanceof NativeMessengerDelegateImpl$handlePush$1) {
            nativeMessengerDelegateImpl$handlePush$1 = (NativeMessengerDelegateImpl$handlePush$1) continuationImpl;
            int i2 = nativeMessengerDelegateImpl$handlePush$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nativeMessengerDelegateImpl$handlePush$1.label = i2 - Integer.MIN_VALUE;
                obj = nativeMessengerDelegateImpl$handlePush$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nativeMessengerDelegateImpl$handlePush$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    nativeMessengerDelegateImpl$handlePush$1.L$0 = map;
                    nativeMessengerDelegateImpl$handlePush$1.label = 1;
                    obj = this.c.a.b(nativeMessengerDelegateImpl$handlePush$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) nativeMessengerDelegateImpl$handlePush$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                jb7 jb7Var = new jb7(this.a);
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                }
                Map s = kotlin.collections.b.s(arrayList);
                PushPriority pushPriority = PushPriority.Unknown;
                ((z8g) jb7Var.k()).a().reportEvent("tech_cloud_message_received");
                return Boolean.valueOf(((com.yandex.messaging.push.b) ((z8g) jb7Var.k()).O.get()).a(new l7c(s, pushPriority, pushPriority)));
            }
        }
        nativeMessengerDelegateImpl$handlePush$1 = new NativeMessengerDelegateImpl$handlePush$1(this, continuationImpl);
        obj = nativeMessengerDelegateImpl$handlePush$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nativeMessengerDelegateImpl$handlePush$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
