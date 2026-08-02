package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.EmptySet;
import kotlin.sequences.b;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

/* loaded from: classes15.dex */
public final class ch60 {
    public static final String[] h = {"yamessenger", "yamessenger_v1", "yamessenger_v2", "yamessenger_v3", "messenger_chats", "messenger_chats_v2", "messenger_botchats", "messenger_botchats_v2", "messenger_groupchats", "messenger_groupchats_v2"};
    public static final String[] i = {"messenger_chat_v1_"};
    public final x22 a;
    public final dh60 b;
    public final SharedPreferences c;
    public final SharedPreferences d;
    public final String e;
    public final String f;
    public final NotificationManager g;

    public ch60(Context context, x22 x22Var, dh60 dh60Var, Looper looper, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        this.a = x22Var;
        this.b = dh60Var;
        this.c = sharedPreferences;
        this.d = sharedPreferences2;
        this.e = context.getString(oyh0.private_notification_channel);
        this.f = context.getString(oyh0.threads_notification_channel);
        z83.g(null, looper, Looper.myLooper());
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.g = notificationManager;
        for (int i2 = 0; i2 < 10; i2++) {
            d(notificationManager, h[i2], "killObsoleteChannels");
        }
        SharedPreferences sharedPreferences3 = this.d;
        Set<String> set = EmptySet.a;
        Set<String> stringSet = sharedPreferences3.getStringSet("obsolete_channels_removed", set);
        set = stringSet != null ? stringSet : set;
        LinkedHashSet linkedHashSet = new LinkedHashSet(gw00.d(1));
        String[] strArr = i;
        j73.Z(strArr, linkedHashSet);
        linkedHashSet.removeAll(set);
        if (!linkedHashSet.isEmpty()) {
            List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
            ArrayList arrayList = new ArrayList();
            for (Object obj : notificationChannels) {
                NotificationChannel notificationChannel = (NotificationChannel) obj;
                if (!linkedHashSet.isEmpty()) {
                    Iterator it = linkedHashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (evu0.y(notificationChannel.getId(), (String) it.next(), false)) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                d(notificationManager, ((NotificationChannel) it2.next()).getId(), "killObsoleteChannelsByPrefix");
            }
            sharedPreferences3.edit().putStringSet("obsolete_channels_removed", j73.f0(strArr)).apply();
        }
        s5r s5rVar = new s5r(b.g(b.g(new yw01(new h73(1, notificationManager.getNotificationChannels()), new fd60(4)), new fd60(5)), new fd60(6)));
        while (s5rVar.hasNext()) {
            d(notificationManager, (String) s5rVar.next(), "killObsoleteChannelsOnVer2");
        }
    }

    public final void a(String str, String str2) {
        NotificationManager notificationManager = this.g;
        if (notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
            SharedPreferences sharedPreferences = this.c;
            if (!sharedPreferences.getBoolean("enable_all_notifications_sound", true)) {
                notificationChannel.setSound(null, null);
            }
            notificationChannel.setLightColor(DebugGraphView.DEFAULT_GRAPH_COLOR);
            notificationChannel.enableVibration(sharedPreferences.getBoolean("enable_all_notifications_vibrate", true));
            notificationChannel.enableLights(true);
            this.b.getClass();
            notificationChannel.setGroup("messenger_notifications_group");
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public final String b(long j) {
        String c = c();
        return oyr.t(x4e.k("messenger-chat-v2_", j, "_", c), "_", String.valueOf(this.d.getInt("notification_code_number", 0)));
    }

    public final String c() {
        String uuid = UUID.randomUUID().toString();
        SharedPreferences sharedPreferences = this.d;
        String string = sharedPreferences.getString("notification_shuffle", uuid);
        if (string != null && !string.equals(uuid)) {
            return string;
        }
        sharedPreferences.edit().putString("notification_shuffle", uuid).commit();
        return uuid;
    }

    public final void d(NotificationManager notificationManager, String str, String str2) {
        try {
            NotificationManager notificationManager2 = this.g;
            if ((notificationManager2 != null ? notificationManager2.getNotificationChannel(str) : null) != null) {
                notificationManager.deleteNotificationChannel(str);
            }
        } catch (Exception e) {
            this.a.reportError(str2 + " -> Error on kill obsolete channel with Id = " + str, e);
        }
    }
}
