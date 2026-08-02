package xsna;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: DownloadNotificationManager.kt */
/* loaded from: classes3.dex */
public final class i9o {
    public final Context a;
    public final h9o b;

    public i9o(Context context) {
        this.a = context;
        this.b = new h9o(context, "OfflineMusicDownloadService");
    }

    public final Notification a(int i, PendingIntent pendingIntent, List<o7o> list) {
        boolean isEmpty = list.isEmpty();
        Context context = this.a;
        if (!isEmpty) {
            int i2 = i == 5 ? R.string.vk_remove_progress : R.string.exo_download_downloading;
            NotificationCompat.h hVar = new NotificationCompat.h(context, "OfflineMusicDownloadService");
            hVar.I.icon = R.drawable.vk_icon_download_outline_24;
            hVar.e = NotificationCompat.h.d(context.getString(i2));
            hVar.w(100, 50, true);
            hVar.g = pendingIntent;
            return hVar.c();
        }
        if (i == -1) {
            NotificationCompat.h hVar2 = new NotificationCompat.h(context, "OfflineMusicDownloadService");
            hVar2.I.icon = R.drawable.vk_icon_download_cancel_outline_28;
            hVar2.e = null;
            hVar2.g = pendingIntent;
            return hVar2.c();
        }
        if (i == 4) {
            NotificationCompat.h hVar3 = new NotificationCompat.h(context, "OfflineMusicDownloadService");
            hVar3.I.icon = R.drawable.vk_icon_error_circle_outline_24;
            hVar3.e = NotificationCompat.h.d(context.getString(R.string.exo_download_failed));
            hVar3.g = pendingIntent;
            return hVar3.c();
        }
        if (i != 5) {
            return this.b.a(context, R.drawable.vk_icon_download_check_outline_24, pendingIntent);
        }
        NotificationCompat.h hVar4 = new NotificationCompat.h(context, "OfflineMusicDownloadService");
        hVar4.I.icon = R.drawable.vk_icon_download_cancel_outline_28;
        hVar4.e = NotificationCompat.h.d(context.getString(R.string.vk_dowload_removed));
        hVar4.g = pendingIntent;
        return hVar4.c();
    }
}
