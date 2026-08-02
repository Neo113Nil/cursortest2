package com.yandex.messaging.internal.authorized.chat.notifications.builder;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.q;
import androidx.core.app.v;
import com.yandex.messaging.NotificationActionService;
import com.yandex.messaging.action.MessagingActionParserKt;
import com.yandex.messaging.internal.authorized.chat.notifications.autocancel.CancelNotificationBroadcastReceiver;
import defpackage.c6b;
import defpackage.ch60;
import defpackage.d6b;
import defpackage.e6b;
import defpackage.f6b;
import defpackage.fcb1;
import defpackage.g620;
import defpackage.g6b;
import defpackage.h6b;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.l620;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.og60;
import defpackage.oyh0;
import defpackage.p150;
import defpackage.p8b;
import defpackage.vjt0;
import defpackage.w220;
import defpackage.wwg0;
import defpackage.yh60;
import defpackage.yj60;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final class b {
    public final String a;
    public final int b;
    public boolean c;
    public boolean d;
    public og60 e;
    public Long f;
    public Long g;
    public yh60 h;
    public Integer i = Integer.valueOf(wwg0.msg_notification_icon);
    public final /* synthetic */ g6b j;

    public b(g6b g6bVar, String str, int i) {
        this.j = g6bVar;
        this.a = str;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ChatNotificationBuilder$DslNotificationBuilder$build$1 chatNotificationBuilder$DslNotificationBuilder$build$1;
        int i;
        g6b g6bVar;
        v vVar;
        Notification notification;
        yh60 yh60Var;
        CoroutineSingletons coroutineSingletons;
        String str;
        String str2;
        Object a;
        v vVar2;
        og60 og60Var;
        v vVar3;
        Intent putExtras;
        q qVar;
        b bVar = this;
        if (continuationImpl instanceof ChatNotificationBuilder$DslNotificationBuilder$build$1) {
            chatNotificationBuilder$DslNotificationBuilder$build$1 = (ChatNotificationBuilder$DslNotificationBuilder$build$1) continuationImpl;
            int i2 = chatNotificationBuilder$DslNotificationBuilder$build$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatNotificationBuilder$DslNotificationBuilder$build$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatNotificationBuilder$DslNotificationBuilder$build$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatNotificationBuilder$DslNotificationBuilder$build$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g6bVar = bVar.j;
                    h6b h6bVar = g6bVar.d;
                    Context context = g6bVar.a;
                    String a2 = h6bVar.a();
                    vVar = new v(context, a2);
                    vVar.h(16, false);
                    vVar.x = "msg";
                    vVar.h(8, false);
                    vVar.I = 2;
                    ch60 ch60Var = ((w220) g6bVar.f.get()).d;
                    Integer num = ch60Var.c.getBoolean("enable_all_notifications_sound", true) ? 1 : null;
                    int intValue = num != null ? num.intValue() : 0;
                    Integer num2 = ch60Var.c.getBoolean("enable_all_notifications_vibrate", true) ? 2 : null;
                    vVar.g(intValue | (num2 != null ? num2.intValue() : 0));
                    vVar.j(-16776961, 1000, 1000);
                    vVar.L = bVar.d;
                    vVar.A = 0;
                    vVar.m = 2;
                    if (!bVar.c) {
                        vVar.r = a2;
                    }
                    Long l = bVar.f;
                    Notification notification2 = vVar.K;
                    if (l != null) {
                        notification2.when = l.longValue();
                    }
                    Long l2 = bVar.g;
                    String str3 = bVar.a;
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        notification = notification2;
                        int i3 = (int) g6bVar.c.a.a;
                        yj60 yj60Var = g6bVar.b;
                        if (yj60Var.d) {
                            vVar.H = longValue;
                        } else {
                            Context context2 = yj60Var.a;
                            if (longValue != 0) {
                                PendingIntent broadcast = PendingIntent.getBroadcast(context2, 1, new Intent(context2, (Class<?>) CancelNotificationBroadcastReceiver.class).putExtra(CancelNotificationBroadcastReceiver.NOTIFICATION_TAG, str3).putExtra(CancelNotificationBroadcastReceiver.NOTIFICATION_ID, i3), 1140850688);
                                yj60Var.b.getClass();
                                ((AlarmManager) yj60Var.c.getValue()).set(1, System.currentTimeMillis() + longValue, broadcast);
                            }
                        }
                    } else {
                        notification = notification2;
                    }
                    notification.icon = g6bVar.g.a(bVar.i.intValue());
                    yh60Var = bVar.h;
                    if (yh60Var == null) {
                        coroutineSingletons = coroutineSingletons2;
                        og60Var = bVar.e;
                        if (og60Var != null) {
                        }
                        return vVar.b();
                    }
                    int i4 = wwg0.msg_notification_icon;
                    com.yandex.messaging.internal.authorized.chat.notifications.d dVar = g6bVar.e;
                    String string = context.getString(oyh0.mark_as_read_button_notification);
                    o1b0 o1b0Var = dVar.c;
                    Bundle a3 = fcb1.a(g620.d, p8b.a(o1b0Var.b));
                    Context context3 = dVar.a;
                    Intent putExtras2 = new Intent(context3, (Class<?>) NotificationActionService.class).setPackage(context3.getPackageName()).putExtra("Chat.CHAT_ID", o1b0Var.b).putExtras(a3).putExtra("Chat.CHAT_NAME", dVar.b.h()).putExtras(yh60Var.a());
                    int i5 = bVar.b;
                    Intent putExtra = putExtras2.putExtra("id", i5).putExtra("tag", str3);
                    putExtra.setAction("com.yandex.messenger.Chat.MARK_AS_READ");
                    str = "Chat.CHAT_NAME";
                    str2 = "Chat.CHAT_ID";
                    vVar.a(i4, string, PendingIntent.getService(context3, (int) o1b0Var.a, putExtra, 167772160));
                    if (g6bVar.h.c) {
                        chatNotificationBuilder$DslNotificationBuilder$build$1.L$0 = bVar;
                        chatNotificationBuilder$DslNotificationBuilder$build$1.L$1 = vVar;
                        chatNotificationBuilder$DslNotificationBuilder$build$1.L$2 = g6bVar;
                        chatNotificationBuilder$DslNotificationBuilder$build$1.L$3 = yh60Var;
                        chatNotificationBuilder$DslNotificationBuilder$build$1.label = 1;
                        a = dVar.a(yh60Var, i5, str3, chatNotificationBuilder$DslNotificationBuilder$build$1);
                        coroutineSingletons = coroutineSingletons2;
                        if (a != coroutineSingletons) {
                            vVar2 = vVar;
                        }
                        return coroutineSingletons;
                    }
                    coroutineSingletons = coroutineSingletons2;
                    com.yandex.messaging.internal.authorized.chat.notifications.d dVar2 = g6bVar.e;
                    Context context4 = dVar2.a;
                    f6b f6bVar = dVar2.e;
                    p150 p150Var = dVar2.b;
                    o1b0 o1b0Var2 = dVar2.c;
                    if (yh60Var.d != null) {
                        putExtras = new Intent("com.yandex.messenger.Chat.NOTIFICATION_CLICK").putExtra(str2, o1b0Var2.b).putExtra("Chat.BOT_ID", o1b0Var2.c).putExtra(str, p150Var.h()).putExtras(yh60Var.a());
                    } else {
                        String str4 = str2;
                        if (jl40.l(f6bVar, d6b.a)) {
                            putExtras = dVar2.d.a(dVar2.a, dVar2.b(), l620.d);
                        } else if (jl40.l(f6bVar, c6b.a)) {
                            Intent intent = new Intent("com.yandex.messenger.Notification.ACTION");
                            intent.putExtra("com.yandex.messenger.MESSAGING_ACTION", MessagingActionParserKt.b(dVar2.b()));
                            putExtras = intent;
                        } else if (f6bVar instanceof e6b) {
                            putExtras = (Intent) ((e6b) f6bVar).a.invoke(o1b0Var2.b, p150Var.h());
                        } else if (jl40.l(f6bVar, d6b.b)) {
                            putExtras = new Intent("com.yandex.messenger.Chat.OPEN");
                            putExtras.putExtra(str4, o1b0Var2.b);
                            putExtras.putExtra("Chat.BOT_ID", o1b0Var2.c);
                            l620 l620Var = l620.d;
                            l620Var.getClass();
                            i3y i3yVar = vjt0.a;
                            putExtras.putExtra("Chat.OPEN_SOURCE", l620Var.a);
                            putExtras.putExtra("Chat.OPENED_FROM_NOTIFICATION", true);
                            putExtras.putExtra(str, p150Var.h());
                            putExtras.putExtras(yh60Var.a());
                        } else {
                            putExtras = new Intent("com.yandex.messenger.Chat.NOTIFICATION_CLICK").putExtra(str4, o1b0Var2.b).putExtra("Chat.BOT_ID", o1b0Var2.c).putExtra(str, p150Var.h()).putExtras(yh60Var.a());
                        }
                    }
                    putExtras.setFlags(SelfTester_JCP.IMITA);
                    putExtras.setPackage(context4.getPackageName());
                    vVar.h = PendingIntent.getActivity(context4, (int) o1b0Var2.a, putExtras, 201326592);
                    com.yandex.messaging.internal.authorized.chat.notifications.d dVar3 = g6bVar.e;
                    o1b0 o1b0Var3 = dVar3.c;
                    Bundle a4 = fcb1.a(g620.d, p8b.a(o1b0Var3.b));
                    Intent intent2 = new Intent("com.yandex.messenger.Chat.DISMISS");
                    Context context5 = dVar3.a;
                    vVar.K.deleteIntent = PendingIntent.getService(context5, (int) o1b0Var3.a, intent2.setPackage(context5.getPackageName()).putExtra("chat id", o1b0Var3.b).putExtras(a4).putExtras(yh60Var.a()), 201326592);
                    og60Var = bVar.e;
                    if (og60Var != null) {
                        chatNotificationBuilder$DslNotificationBuilder$build$1.L$0 = vVar;
                        chatNotificationBuilder$DslNotificationBuilder$build$1.L$1 = null;
                        chatNotificationBuilder$DslNotificationBuilder$build$1.L$2 = null;
                        chatNotificationBuilder$DslNotificationBuilder$build$1.L$3 = null;
                        chatNotificationBuilder$DslNotificationBuilder$build$1.label = 2;
                        if (og60Var.a(vVar, chatNotificationBuilder$DslNotificationBuilder$build$1) != coroutineSingletons) {
                            vVar3 = vVar;
                            vVar = vVar3;
                        }
                        return coroutineSingletons;
                    }
                    return vVar.b();
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vVar3 = (v) chatNotificationBuilder$DslNotificationBuilder$build$1.L$0;
                    kotlin.b.b(obj);
                    vVar = vVar3;
                    return vVar.b();
                }
                yh60 yh60Var2 = (yh60) chatNotificationBuilder$DslNotificationBuilder$build$1.L$3;
                g6bVar = (g6b) chatNotificationBuilder$DslNotificationBuilder$build$1.L$2;
                vVar2 = (v) chatNotificationBuilder$DslNotificationBuilder$build$1.L$1;
                b bVar2 = (b) chatNotificationBuilder$DslNotificationBuilder$build$1.L$0;
                kotlin.b.b(obj);
                str = "Chat.CHAT_NAME";
                str2 = "Chat.CHAT_ID";
                coroutineSingletons = coroutineSingletons2;
                a = obj;
                yh60Var = yh60Var2;
                bVar = bVar2;
                qVar = (q) a;
                if (qVar != null) {
                    vVar2.b.add(qVar);
                }
                vVar = vVar2;
                com.yandex.messaging.internal.authorized.chat.notifications.d dVar22 = g6bVar.e;
                Context context42 = dVar22.a;
                f6b f6bVar2 = dVar22.e;
                p150 p150Var2 = dVar22.b;
                o1b0 o1b0Var22 = dVar22.c;
                if (yh60Var.d != null) {
                }
                putExtras.setFlags(SelfTester_JCP.IMITA);
                putExtras.setPackage(context42.getPackageName());
                vVar.h = PendingIntent.getActivity(context42, (int) o1b0Var22.a, putExtras, 201326592);
                com.yandex.messaging.internal.authorized.chat.notifications.d dVar32 = g6bVar.e;
                o1b0 o1b0Var32 = dVar32.c;
                Bundle a42 = fcb1.a(g620.d, p8b.a(o1b0Var32.b));
                Intent intent22 = new Intent("com.yandex.messenger.Chat.DISMISS");
                Context context52 = dVar32.a;
                vVar.K.deleteIntent = PendingIntent.getService(context52, (int) o1b0Var32.a, intent22.setPackage(context52.getPackageName()).putExtra("chat id", o1b0Var32.b).putExtras(a42).putExtras(yh60Var.a()), 201326592);
                og60Var = bVar.e;
                if (og60Var != null) {
                }
                return vVar.b();
            }
        }
        chatNotificationBuilder$DslNotificationBuilder$build$1 = new ChatNotificationBuilder$DslNotificationBuilder$build$1(bVar, continuationImpl);
        Object obj2 = chatNotificationBuilder$DslNotificationBuilder$build$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatNotificationBuilder$DslNotificationBuilder$build$1.label;
        if (i != 0) {
        }
        qVar = (q) a;
        if (qVar != null) {
        }
        vVar = vVar2;
        com.yandex.messaging.internal.authorized.chat.notifications.d dVar222 = g6bVar.e;
        Context context422 = dVar222.a;
        f6b f6bVar22 = dVar222.e;
        p150 p150Var22 = dVar222.b;
        o1b0 o1b0Var222 = dVar222.c;
        if (yh60Var.d != null) {
        }
        putExtras.setFlags(SelfTester_JCP.IMITA);
        putExtras.setPackage(context422.getPackageName());
        vVar.h = PendingIntent.getActivity(context422, (int) o1b0Var222.a, putExtras, 201326592);
        com.yandex.messaging.internal.authorized.chat.notifications.d dVar322 = g6bVar.e;
        o1b0 o1b0Var322 = dVar322.c;
        Bundle a422 = fcb1.a(g620.d, p8b.a(o1b0Var322.b));
        Intent intent222 = new Intent("com.yandex.messenger.Chat.DISMISS");
        Context context522 = dVar322.a;
        vVar.K.deleteIntent = PendingIntent.getService(context522, (int) o1b0Var322.a, intent222.setPackage(context522.getPackageName()).putExtra("chat id", o1b0Var322.b).putExtras(a422).putExtras(yh60Var.a()), 201326592);
        og60Var = bVar.e;
        if (og60Var != null) {
        }
        return vVar.b();
    }
}
