package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.offline.VideoDownloadNotifierReceiver;
import com.vk.libvideo.offline.VideoDownloadNotifierReceiver$Companion$Actions;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;

/* compiled from: DownloadsManagementIntentsFactory.kt */
/* loaded from: classes3.dex */
public final class lco {
    public static PendingIntent a(VideoDownloadNotifierReceiver$Companion$Actions videoDownloadNotifierReceiver$Companion$Actions, int i, Context context, VideoFile videoFile) {
        if (videoDownloadNotifierReceiver$Companion$Actions == VideoDownloadNotifierReceiver$Companion$Actions.ACTION_CLICK) {
            VideoOfflineFragment.b bVar = new VideoOfflineFragment.b();
            bVar.j.putBoolean("open_from_widget", true);
            bVar.e = true;
            return t2i0.a(context, 0, bVar.n(context), 67108864);
        }
        int i2 = VideoDownloadNotifierReceiver.a;
        Intent intent = new Intent(context, (Class<?>) VideoDownloadNotifierReceiver.class);
        intent.setAction(videoDownloadNotifierReceiver$Companion$Actions.getTitle());
        if (videoFile != null) {
            intent.putExtra("videoFile", videoFile);
            intent.setData(Uri.parse(String.valueOf(i)));
        }
        return t2i0.b(context, i, intent, 167772160);
    }
}
