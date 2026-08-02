package xsna;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.NotificationCompat;

/* compiled from: NotificationCompat.java */
/* loaded from: classes12.dex */
public final class n970 extends NotificationCompat.m {
    public int[] e = null;
    public MediaSessionCompat.Token f;

    @Override // androidx.core.app.NotificationCompat.m
    public final void b(androidx.core.app.a aVar) {
        Notification.Builder builder = aVar.b;
        if (Build.VERSION.SDK_INT >= 34) {
            l970.d(builder, l970.b(m970.a(l970.a(), null, 0, null, Boolean.FALSE), this.e, this.f));
        } else {
            l970.d(builder, l970.b(l970.a(), this.e, this.f));
        }
    }
}
