package xsna;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: NotificationChannelsLocal.kt */
/* loaded from: classes5.dex */
public final class z870 {
    public static final List<String> a = Collections.singletonList("messages_channel_group");
    public static final Set<String> b = izi0.i("private_messages_channel", "chat_messages_channel", "voice_assistant_reminders");

    public static void a() {
        x870 x870Var = x870.a;
        if (gz80.a(26)) {
            ca70 ca70Var = ca70.a;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            NotificationManager f = ca70.f(context);
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                f.deleteNotificationChannelGroup((String) it.next());
            }
            Iterator<T> it2 = b.iterator();
            while (it2.hasNext()) {
                f.deleteNotificationChannel((String) it2.next());
            }
        }
        Context context2 = e43.a;
        Context context3 = context2 != null ? context2 : null;
        ca70 ca70Var2 = ca70.a;
        NotificationManager f2 = ca70.f(context3);
        String string = context3.getString(R.string.notification_default);
        x870 x870Var2 = x870.a;
        f2.createNotificationChannel(new NotificationChannel("default_ver2", string, 4));
    }
}
