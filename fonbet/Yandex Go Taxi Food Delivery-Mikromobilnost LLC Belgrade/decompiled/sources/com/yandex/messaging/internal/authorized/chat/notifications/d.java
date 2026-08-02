package com.yandex.messaging.internal.authorized.chat.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.z0;
import com.yandex.messaging.NotificationActionService;
import com.yandex.messaging.action.MessagingAction;
import defpackage.f6b;
import defpackage.fcb1;
import defpackage.g620;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.oyh0;
import defpackage.p150;
import defpackage.p8b;
import defpackage.s8b;
import defpackage.tpr;
import defpackage.uz10;
import defpackage.wwg0;
import defpackage.y4t;
import defpackage.yh60;
import defpackage.zf0;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class d {
    public final Context a;
    public final p150 b;
    public final o1b0 c;
    public final uz10 d;
    public final f6b e;
    public final y4t f;

    public d(Context context, p150 p150Var, o1b0 o1b0Var, uz10 uz10Var, f6b f6bVar, y4t y4tVar) {
        this.a = context;
        this.b = p150Var;
        this.c = o1b0Var;
        this.d = uz10Var;
        this.e = f6bVar;
        this.f = y4tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yh60 yh60Var, int i, String str, ContinuationImpl continuationImpl) {
        NotificationIntentsFactory$createReplyAction$1 notificationIntentsFactory$createReplyAction$1;
        Object obj;
        int i2;
        if (continuationImpl instanceof NotificationIntentsFactory$createReplyAction$1) {
            notificationIntentsFactory$createReplyAction$1 = (NotificationIntentsFactory$createReplyAction$1) continuationImpl;
            int i3 = notificationIntentsFactory$createReplyAction$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationIntentsFactory$createReplyAction$1.label = i3 - Integer.MIN_VALUE;
                obj = notificationIntentsFactory$createReplyAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = notificationIntentsFactory$createReplyAction$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    tpr a = this.f.a(p8b.a(this.c.b));
                    notificationIntentsFactory$createReplyAction$1.L$0 = this;
                    notificationIntentsFactory$createReplyAction$1.L$1 = yh60Var;
                    notificationIntentsFactory$createReplyAction$1.L$2 = str;
                    notificationIntentsFactory$createReplyAction$1.I$0 = i;
                    notificationIntentsFactory$createReplyAction$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(a, notificationIntentsFactory$createReplyAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = notificationIntentsFactory$createReplyAction$1.I$0;
                    str = (String) notificationIntentsFactory$createReplyAction$1.L$2;
                    yh60Var = (yh60) notificationIntentsFactory$createReplyAction$1.L$1;
                    this = (d) notificationIntentsFactory$createReplyAction$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((s8b) obj).l()) {
                    return null;
                }
                o1b0 o1b0Var = this.c;
                Context context = this.a;
                Bundle a2 = fcb1.a(g620.d, p8b.a(o1b0Var.b));
                int i4 = (int) o1b0Var.a;
                Intent intent = new Intent(context, (Class<?>) NotificationActionService.class);
                intent.setAction("com.yandex.messenger.Chat.REPLY");
                intent.putExtra("Chat.CHAT_ID", o1b0Var.b);
                intent.putExtra("Chat.CHAT_NAME", this.b.h());
                intent.putExtra("id", i);
                intent.putExtra("tag", str);
                intent.putExtras(yh60Var.a());
                intent.putExtras(a2);
                intent.setPackage(context.getPackageName());
                PendingIntent service = PendingIntent.getService(context, i4, intent, 167772160);
                HashSet hashSet = new HashSet();
                z0 z0Var = new z0(context.getString(oyh0.messenger_notification_reply_hint), new Bundle(), hashSet);
                zf0 zf0Var = new zf0(wwg0.msg_ic_send_outline, context.getString(oyh0.messenger_notification_reply_button), service);
                zf0Var.g = new ArrayList();
                ((ArrayList) zf0Var.g).add(z0Var);
                return zf0Var.a();
            }
        }
        notificationIntentsFactory$createReplyAction$1 = new NotificationIntentsFactory$createReplyAction$1(this, continuationImpl);
        obj = notificationIntentsFactory$createReplyAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = notificationIntentsFactory$createReplyAction$1.label;
        if (i2 != 0) {
        }
        if (((s8b) obj).l()) {
        }
    }

    public final MessagingAction.OpenChat b() {
        return new MessagingAction.OpenChat(p8b.a(this.c.b), null, null, null, false, false, null, false, null, true, null, false, false, null, 32254);
    }
}
