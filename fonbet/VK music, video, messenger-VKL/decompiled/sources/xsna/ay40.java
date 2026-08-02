package xsna;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.vk.dto.music.MusicTrack;

/* compiled from: MusicPlayerNotificationCreatorStrategy.kt */
/* loaded from: classes3.dex */
public interface ay40 {

    /* compiled from: MusicPlayerNotificationCreatorStrategy.kt */
    public static final class a implements izs<Bitmap, Notification> {
        public final NotificationCompat.h b;
        public final wzs<NotificationCompat.h, Bitmap, s3q0> c;
        public final izs<Notification, s3q0> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(NotificationCompat.h hVar, wzs<? super NotificationCompat.h, ? super Bitmap, s3q0> wzsVar, izs<? super Notification, s3q0> izsVar) {
            this.b = hVar;
            this.c = wzsVar;
            this.d = izsVar;
        }

        @Override // xsna.izs
        public final Notification invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            NotificationCompat.h hVar = this.b;
            if (bitmap2 != null) {
                this.c.invoke(hVar, bitmap2);
            }
            Notification c = hVar.c();
            this.d.invoke(c);
            return c;
        }
    }

    a k(Context context, boolean z, MusicTrack musicTrack, boolean z2);
}
