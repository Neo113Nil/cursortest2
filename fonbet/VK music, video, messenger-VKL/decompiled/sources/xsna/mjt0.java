package xsna;

import android.content.Context;
import android.media.MediaRouter;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;

/* compiled from: VideoTechBugreportReporterImpl.kt */
/* loaded from: classes5.dex */
public final class mjt0 implements ljt0 {
    @Override // xsna.ljt0
    public final void a(Context context, VideoTechBugreportData videoTechBugreportData, String str, Long l) {
        String str2 = "";
        try {
            MediaRouter.RouteInfo selectedRoute = ((MediaRouter) context.getSystemService("media_router")).getSelectedRoute(1);
            if (selectedRoute != null) {
                int volume = selectedRoute.getVolume();
                boolean isEnabled = selectedRoute.isEnabled();
                CharSequence name = selectedRoute.getName();
                int deviceType = selectedRoute.getDeviceType();
                CharSequence description = selectedRoute.getDescription();
                CharSequence status = selectedRoute.getStatus();
                int volumeHandling = selectedRoute.getVolumeHandling();
                StringBuilder sb = new StringBuilder(256);
                sb.append("vol:");
                sb.append(volume);
                sb.append(";enabled:");
                sb.append(isEnabled ? "Y;" : "N;");
                sb.append("name:");
                sb.append(name);
                sb.append(";devType:");
                sb.append(deviceType);
                sb.append(";descr:");
                sb.append(description);
                sb.append(";status:");
                sb.append(status);
                sb.append(";volH:");
                sb.append(volumeHandling);
                str2 = sb.toString();
            }
        } catch (Exception unused) {
        }
        new kjt0(videoTechBugreportData, str, str2, l).q();
    }
}
