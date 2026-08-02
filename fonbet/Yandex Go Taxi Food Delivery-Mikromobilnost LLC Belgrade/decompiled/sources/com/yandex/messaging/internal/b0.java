package com.yandex.messaging.internal;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.entities.TextMessageData;
import defpackage.abz0;
import defpackage.ax80;
import defpackage.b00;
import defpackage.c220;
import defpackage.el21;
import defpackage.f6b;
import defpackage.g620;
import defpackage.g8e;
import defpackage.lg60;
import defpackage.lz;
import defpackage.mtb1;
import defpackage.p8b;
import defpackage.rcz0;
import defpackage.tje;
import defpackage.tls;
import defpackage.ud30;
import defpackage.w3c;
import defpackage.x22;
import defpackage.xdf0;
import defpackage.yh60;

/* loaded from: classes15.dex */
public final class b0 {
    public final lg60 a;
    public final c220 b;
    public final b00 c;
    public final x22 d;
    public final el21 e;
    public final xdf0 f;
    public final com.yandex.messaging.analytics.b g;
    public final ax80 h;

    public b0(f6b f6bVar, lg60 lg60Var, c220 c220Var, b00 b00Var, x22 x22Var, el21 el21Var, xdf0 xdf0Var, com.yandex.messaging.analytics.b bVar, ax80 ax80Var, w3c w3cVar) {
        this.a = lg60Var;
        this.b = c220Var;
        this.c = b00Var;
        this.d = x22Var;
        this.e = el21Var;
        this.f = xdf0Var;
        this.g = bVar;
        this.h = ax80Var;
    }

    public final void a(Intent intent, tls tlsVar) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            tlsVar.invoke(extras);
        } else {
            this.d.reportError("broken_summary_intent", new RuntimeException(g8e.o("action: ", intent.getAction())));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(Intent intent) {
        CharSequence charSequence;
        Object obj;
        tje.e();
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        int hashCode = action.hashCode();
        b00 b00Var = this.c;
        lg60 lg60Var = this.a;
        switch (hashCode) {
            case -1992711275:
                if (action.equals("com.yandex.messenger.ChatSummary.OPEN")) {
                    a(intent, new NotificationActionHandler$onAction$2(1, lg60Var, lg60.class, "onSummaryNotificationClicked", "onSummaryNotificationClicked(Landroid/os/Bundle;)V", 0));
                    break;
                }
                break;
            case -1183665857:
                if (action.equals("com.yandex.messenger.ChatSummary.DISMISS")) {
                    a(intent, new NotificationActionHandler$onAction$1(1, lg60Var, lg60.class, "onSummaryNotificationDismissed", "onSummaryNotificationDismissed(Landroid/os/Bundle;)V", 0));
                    break;
                }
                break;
            case -1057606273:
                if (action.equals("com.yandex.messenger.Chat.REPLY")) {
                    Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
                    String obj2 = (resultsFromIntent == null || (charSequence = resultsFromIntent.getCharSequence("key_text_reply")) == null) ? null : charSequence.toString();
                    x22 x22Var = this.d;
                    if (obj2 != null && obj2.length() != 0) {
                        String stringExtra = intent.getStringExtra("Chat.CHAT_ID");
                        if (stringExtra != null) {
                            TextMessageData textMessageData = new TextMessageData(0, obj2);
                            g620 g620Var = g620.d;
                            this.h.getClass();
                            b00Var.c(p8b.a(stringExtra), ax80.f(textMessageData, g620Var, null));
                            x22Var.reportEvent("notification_reply_success");
                            break;
                        } else {
                            x22Var.reportError("notification_reply_no_chat_id", new IllegalArgumentException("No chat id for reply"));
                            break;
                        }
                    } else {
                        x22Var.reportEvent("notification_reply_empty");
                        break;
                    }
                }
                break;
            case -800310852:
                if (action.equals("com.yandex.messenger.Chat.MARK_AS_READ")) {
                    tje.N(this.f, null, null, new NotificationActionHandler$handleMarkAsRead$1(this, null), 3);
                    tje.e();
                    yh60 a = mtb1.a(intent.getExtras());
                    String stringExtra2 = intent.getStringExtra("Chat.CHAT_ID");
                    if (stringExtra2 != null) {
                        long j = a.e;
                        if (j != -1) {
                            ((Handler) b00Var.a.get()).post(new lz(7, b00Var, p8b.a(stringExtra2), new abz0(j)));
                            break;
                        }
                    }
                }
                break;
            case -683296641:
                if (action.equals("com.yandex.messenger.Chat.NOTIFICATION_CLICK")) {
                    tje.e();
                    yh60 a2 = mtb1.a(intent.getExtras());
                    String stringExtra3 = intent.getStringExtra("Chat.CHAT_ID");
                    if (stringExtra3 != null) {
                        intent.getStringExtra("Chat.CHAT_NAME");
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        com.yandex.messaging.analytics.b bVar = this.g;
                        bVar.getClass();
                        bVar.e = new rcz0(stringExtra3, elapsedRealtime);
                        String str = a2.d;
                        if (str != null) {
                            this.b.a(Uri.parse(str));
                            long j2 = a2.e;
                            if (j2 != -1) {
                                ((Handler) b00Var.a.get()).post(new lz(7, b00Var, p8b.a(stringExtra3), new abz0(j2)));
                                break;
                            }
                        }
                    }
                }
                break;
            case 2124775391:
                if (action.equals("com.yandex.messenger.Chat.DISMISS")) {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        obj = SavedMessages.INSTANCE;
                    } else {
                        Object obj3 = (ChatRequest) extras.getParcelable("Chat.REQUEST_ID");
                        if (obj3 == null) {
                            String string = extras.getString("Chat.CHAT_ID");
                            String string2 = extras.getString("Chat.BOT_ID");
                            if (string == null && string2 != null) {
                                obj = new PrivateChat(string2);
                            } else if (string != null) {
                                obj = new PrivateChat(string);
                            } else {
                                String string3 = extras.getString("Chat.INVITE_HASH");
                                if (string3 != null) {
                                    obj = new InviteChat(string3);
                                } else {
                                    String string4 = extras.getString("Chat.ALIAS");
                                    if (string4 != null) {
                                        obj3 = new ChatAlias(string4);
                                    } else {
                                        obj = SavedMessages.INSTANCE;
                                    }
                                }
                            }
                        }
                        obj = obj3;
                    }
                    lg60Var.a.post(new ud30(3, lg60Var, obj, intent.getExtras()));
                    break;
                }
                break;
        }
    }
}
