package xsna;

import android.view.View;
import com.vk.dto.common.VideoFile;
import one.video.exo.offline.DownloadInfo;

/* compiled from: DownloadButton.kt */
/* loaded from: classes16.dex */
public interface j8o {
    void a(VideoFile videoFile);

    void b(DownloadInfo downloadInfo, String str);

    String c(String str);

    View getView();

    void setTint(int i);
}
