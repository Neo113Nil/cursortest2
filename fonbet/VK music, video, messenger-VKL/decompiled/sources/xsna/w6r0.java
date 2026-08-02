package xsna;

import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;

/* compiled from: VKAndroidAutoCatalogMediaServiceDelegate.kt */
/* loaded from: classes16.dex */
public interface w6r0 {
    void a(androidx.media.d dVar);

    void b(MediaSessionCompat mediaSessionCompat);

    f22 c();

    void d(String str, androidx.media.c cVar);

    void e(String str, MediaBrowserServiceCompat.g<List<MediaBrowserCompat.MediaItem>> gVar);

    MediaBrowserServiceCompat.a f();

    void onDestroy();
}
