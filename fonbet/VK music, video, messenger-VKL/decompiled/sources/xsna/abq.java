package xsna;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import java.io.File;

/* compiled from: Ext.kt */
/* loaded from: classes5.dex */
public final class abq {
    public static final void a(NotificationCompat.l.d dVar, File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            Uri N = com.vk.core.files.a.N(file);
            if (N != null) {
                dVar.e = "image/*";
                dVar.f = N;
            }
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }
}
