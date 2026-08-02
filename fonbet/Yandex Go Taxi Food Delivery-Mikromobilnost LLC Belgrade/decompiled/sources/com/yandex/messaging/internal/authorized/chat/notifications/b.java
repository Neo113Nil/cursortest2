package com.yandex.messaging.internal.authorized.chat.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import androidx.core.app.s0;
import com.squareup.moshi.Moshi;
import com.yandex.div.internal.widget.EllipsizedTextView;
import defpackage.at2;
import defpackage.evu0;
import defpackage.g6b;
import defpackage.ho9;
import defpackage.i6b;
import defpackage.if90;
import defpackage.ii60;
import defpackage.jk60;
import defpackage.jl40;
import defpackage.k020;
import defpackage.ki60;
import defpackage.li60;
import defpackage.mi60;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.ooc;
import defpackage.oyh0;
import defpackage.p150;
import defpackage.pg60;
import defpackage.rz10;
import defpackage.uj60;
import defpackage.wh21;
import defpackage.wi60;
import defpackage.yab;
import defpackage.ydz;
import defpackage.yh60;
import defpackage.z120;
import defpackage.z83;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public final Context a;
    public final o1b0 b;
    public final g6b c;
    public final i6b d;
    public final rz10 e;
    public final p150 f;
    public final mi60 g;
    public final pg60 h;
    public final wi60 i;

    public b(Context context, o1b0 o1b0Var, g6b g6bVar, i6b i6bVar, rz10 rz10Var, p150 p150Var, mi60 mi60Var, pg60 pg60Var, wi60 wi60Var) {
        this.a = context;
        this.b = o1b0Var;
        this.c = g6bVar;
        this.d = i6bVar;
        this.e = rz10Var;
        this.f = p150Var;
        this.g = mi60Var;
        this.h = pg60Var;
        this.i = wi60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jk60 jk60Var, ContinuationImpl continuationImpl) {
        DeepSyncChatNotificationController$updateNotification$1 deepSyncChatNotificationController$updateNotification$1;
        int i;
        zy11 zy11Var;
        String string;
        s0 s0Var;
        Notification notification;
        b bVar = this;
        if (continuationImpl instanceof DeepSyncChatNotificationController$updateNotification$1) {
            deepSyncChatNotificationController$updateNotification$1 = (DeepSyncChatNotificationController$updateNotification$1) continuationImpl;
            int i2 = deepSyncChatNotificationController$updateNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deepSyncChatNotificationController$updateNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deepSyncChatNotificationController$updateNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deepSyncChatNotificationController$updateNotification$1.label;
                zy11 zy11Var2 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o1b0 o1b0Var = bVar.b;
                    if (o1b0Var.f) {
                        rz10 rz10Var = bVar.e;
                        if (jl40.l((String) rz10Var.j.invoke(), o1b0Var.c)) {
                            if (jk60Var.b != null) {
                                Context context = bVar.a;
                                s0 s0Var2 = new s0(context);
                                if (bVar.i.c()) {
                                    deepSyncChatNotificationController$updateNotification$1.L$0 = bVar;
                                    deepSyncChatNotificationController$updateNotification$1.L$1 = s0Var2;
                                    deepSyncChatNotificationController$updateNotification$1.label = 1;
                                    mi60 mi60Var = bVar.g;
                                    ki60 ki60Var = mi60Var.a;
                                    li60 li60Var = new li60(false, false, ki60Var.a, ki60Var.h, ki60Var.b, ki60Var.c, ki60Var.d, ki60Var.e, ki60Var.f, ki60Var.g, ki60Var.k, ki60Var.i, ki60Var.j);
                                    k020 k020Var = mi60Var.d;
                                    long j = mi60Var.c.a;
                                    at2 at2Var = k020Var.b;
                                    yab yabVar = new yab(at2Var.B().P(1, j), (Moshi) k020Var.h.get(), at2Var.Y().g(j));
                                    try {
                                        ii60 l1 = yabVar.moveToFirst() ? yabVar.l1(li60Var) : null;
                                        yabVar.close();
                                        if (l1 == null) {
                                            z83.i();
                                            zy11Var = zy11Var2;
                                            obj = null;
                                        } else {
                                            String h = bVar.f.h();
                                            StatusBarNotification[] activeNotifications = ((NotificationManager) context.getSystemService("notification")).getActiveNotifications();
                                            i6b i6bVar = bVar.d;
                                            zy11Var = zy11Var2;
                                            int i3 = 24;
                                            String concat = new uj60(i6bVar.c.c, i3, i6bVar.b.a(), false).a().concat("_deepsync");
                                            int i4 = (int) i6bVar.a.a;
                                            int length = activeNotifications.length;
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 < length) {
                                                    StatusBarNotification statusBarNotification = activeNotifications[i5];
                                                    StatusBarNotification[] statusBarNotificationArr = activeNotifications;
                                                    if (statusBarNotification.getId() == i4 && jl40.l(statusBarNotification.getTag(), concat)) {
                                                        string = context.getString(oyh0.deep_sync_chat_notification_text);
                                                        break;
                                                    }
                                                    i5++;
                                                    activeNotifications = statusBarNotificationArr;
                                                } else {
                                                    int i6 = l1.d;
                                                    String str = l1.a;
                                                    if (i6 == 1) {
                                                        string = context.getString(oyh0.deep_sync_chat_notification_text_for_image_emoji);
                                                    } else if (i6 != 0) {
                                                        string = context.getString(oyh0.deep_sync_chat_notification_text);
                                                    } else if (str == null) {
                                                        string = context.getString(oyh0.deep_sync_chat_notification_text);
                                                    } else {
                                                        List d = if90.d(str, false);
                                                        string = (d.size() == 1 && evu0.y(((wh21) d.get(0)).d.toString(), str, false)) ? context.getString(oyh0.deep_sync_chat_notification_text_for_link_with_preview, str) : context.getString(oyh0.deep_sync_chat_notification_text_for_text_with_preview, str);
                                                    }
                                                }
                                            }
                                            if (string.length() > 200) {
                                                string = string.substring(0, 199).concat(EllipsizedTextView.DEFAULT_ELLIPSIS);
                                            }
                                            ii60 a = ii60.a(l1, string, h, 8094);
                                            ho9 ho9Var = bVar.h.g.a;
                                            com.yandex.messaging.internal.authorized.chat.notifications.builder.c cVar = new com.yandex.messaging.internal.authorized.chat.notifications.builder.c((Context) ho9Var.a.get(), (z120) ho9Var.b.get(), (p150) ho9Var.c.get(), (c) ho9Var.d.get(), a);
                                            yh60 yh60Var = new yh60(Collections.singletonList(a), jk60Var.a, jk60Var.b, (String) null);
                                            int i7 = 24;
                                            com.yandex.messaging.internal.authorized.chat.notifications.builder.b bVar2 = new com.yandex.messaging.internal.authorized.chat.notifications.builder.b(bVar.c, new uj60(i6bVar.c.c, i7, i6bVar.b.a(), false).a(), (int) i6bVar.a.a);
                                            bVar2.e = cVar;
                                            bVar2.f = new Long(a.c);
                                            bVar2.h = yh60Var;
                                            Integer num = (Integer) rz10Var.k.invoke();
                                            if (num != null) {
                                                bVar2.i = new Integer(num.intValue());
                                            }
                                            obj = bVar2.a(deepSyncChatNotificationController$updateNotification$1);
                                        }
                                        if (obj == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        s0Var = s0Var2;
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            ooc.g(yabVar, th);
                                            throw th2;
                                        }
                                    }
                                } else if (ydz.a.a()) {
                                    ydz.a();
                                    return zy11Var2;
                                }
                            }
                            return zy11Var2;
                        }
                    }
                    return zy11Var2;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s0 s0Var3 = (s0) deepSyncChatNotificationController$updateNotification$1.L$1;
                b bVar3 = (b) deepSyncChatNotificationController$updateNotification$1.L$0;
                kotlin.b.b(obj);
                s0Var = s0Var3;
                bVar = bVar3;
                zy11Var = zy11Var2;
                notification = (Notification) obj;
                if (notification != null) {
                    return zy11Var;
                }
                if (ydz.a.a()) {
                    ydz.a();
                }
                i6b i6bVar2 = bVar.d;
                int i8 = 24;
                s0Var.d(new uj60(i6bVar2.c.c, i8, i6bVar2.b.a(), false).a().concat("_deepsync"), (int) bVar.d.a.a, notification);
                return zy11Var;
            }
        }
        deepSyncChatNotificationController$updateNotification$1 = new DeepSyncChatNotificationController$updateNotification$1(bVar, continuationImpl);
        Object obj2 = deepSyncChatNotificationController$updateNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deepSyncChatNotificationController$updateNotification$1.label;
        zy11 zy11Var22 = zy11.a;
        if (i != 0) {
        }
        notification = (Notification) obj2;
        if (notification != null) {
        }
    }
}
