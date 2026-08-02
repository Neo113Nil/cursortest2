package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.music.offline.impl.mediastore.download.service.OfflineMusicDownloadBoundService;

/* compiled from: DownloadServiceConnection.kt */
/* loaded from: classes3.dex */
public final class t9o extends com.vk.core.service.a<OfflineMusicDownloadBoundService> {
    @Override // com.vk.core.service.a
    public final Intent b() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new Intent(context, (Class<?>) OfflineMusicDownloadBoundService.class);
    }

    @Override // com.vk.core.service.a
    public final Intent c() {
        return null;
    }

    @Override // com.vk.core.service.a
    public final Class<OfflineMusicDownloadBoundService> f() {
        return OfflineMusicDownloadBoundService.class;
    }

    @Override // com.vk.core.service.a
    public final void g() {
        com.vk.music.offline.impl.mediastore.download.service.a aVar;
        OfflineMusicDownloadBoundService e = e();
        if (e == null || (aVar = e.k) == null) {
            return;
        }
        aVar.g = this;
    }

    @Override // com.vk.core.service.a
    public final void i() {
        com.vk.music.offline.impl.mediastore.download.service.a aVar;
        OfflineMusicDownloadBoundService e = e();
        if (e == null || (aVar = e.k) == null) {
            return;
        }
        aVar.g = null;
    }
}
