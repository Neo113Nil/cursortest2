package xsna;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.vkontakte.android.R;

/* compiled from: DownloadNotificationHelper.java */
/* loaded from: classes12.dex */
public final class h9o {
    public final NotificationCompat.h a;

    public h9o(Context context, String str) {
        this.a = new NotificationCompat.h(context.getApplicationContext(), str);
    }

    public final Notification a(Context context, int i, @Nullable PendingIntent pendingIntent) {
        NotificationCompat.h hVar = this.a;
        hVar.I.icon = i;
        hVar.k(context.getResources().getString(R.string.exo_download_completed));
        hVar.g = pendingIntent;
        hVar.B(null);
        hVar.w(0, 0, false);
        hVar.n(2, false);
        hVar.l = true;
        if (Build.VERSION.SDK_INT >= 31) {
            hVar.G = 1;
        }
        return hVar.c();
    }
}
