package androidx.core.app;

import android.app.Notification;

/* loaded from: classes10.dex */
public abstract class c0 {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }
}
