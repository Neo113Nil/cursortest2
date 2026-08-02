package androidx.core.app;

import android.app.Notification;
import android.net.Uri;

/* loaded from: classes10.dex */
public abstract class e0 {
    public static Notification.MessagingStyle.Message a(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
