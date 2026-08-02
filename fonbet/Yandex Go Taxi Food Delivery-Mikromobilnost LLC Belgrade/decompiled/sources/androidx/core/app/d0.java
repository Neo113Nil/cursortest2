package androidx.core.app;

import android.app.Notification;
import android.app.Person;

/* loaded from: classes10.dex */
public abstract class d0 {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }
}
