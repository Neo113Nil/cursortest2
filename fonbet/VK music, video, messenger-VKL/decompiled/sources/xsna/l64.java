package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.DownloadState;
import java.io.File;

/* compiled from: AttachesDownloadStorage.kt */
/* loaded from: classes2.dex */
public interface l64 {
    Attach b(int i);

    void c(AttachWithDownload attachWithDownload, DownloadState downloadState, File file);
}
