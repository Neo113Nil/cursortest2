package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.libvideo.api.ExtendedDownloadState;
import com.vk.toggle.features.VideoFeatures;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import one.video.exo.offline.DownloadInfo;
import one.video.exo.offline.OfflineRequirement;
import xsna.w8o;

/* compiled from: VideoOfflineItemExt.kt */
/* loaded from: classes3.dex */
public final class dzs0 {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r2 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final wys0 a(czs0 czs0Var, mm80 mm80Var) {
        Set a;
        ExtendedDownloadState extendedDownloadState;
        VideoFileOld videoFileOld = czs0Var.a;
        DownloadInfo downloadInfo = czs0Var.b;
        switch (w8o.a.$EnumSwitchMapping$0[downloadInfo.c.ordinal()]) {
            case 1:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_OFFLINE_MANAGER;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    if (mm80Var != null) {
                        synchronized (mm80Var) {
                            one.video.exo.offline.c e = mm80Var.e();
                            OfflineRequirement.a aVar = OfflineRequirement.Companion;
                            int i = e.c.m;
                            aVar.getClass();
                            a = OfflineRequirement.a.a(i);
                            break;
                        }
                    }
                    a = EmptySet.b;
                } else {
                    synchronized (bu70.a) {
                        one.video.exo.offline.c e2 = bu70.e();
                        OfflineRequirement.a aVar2 = OfflineRequirement.Companion;
                        int i2 = e2.c.m;
                        aVar2.getClass();
                        a = OfflineRequirement.a.a(i2);
                    }
                }
                if (!a.contains(OfflineRequirement.NETWORK_UNMETERED)) {
                    if (!a.contains(OfflineRequirement.NETWORK)) {
                        extendedDownloadState = ExtendedDownloadState.QUEUED;
                        break;
                    } else {
                        extendedDownloadState = ExtendedDownloadState.WAITING_NETWORK;
                        break;
                    }
                } else {
                    extendedDownloadState = ExtendedDownloadState.WAITING_WIFI;
                    break;
                }
            case 2:
                extendedDownloadState = ExtendedDownloadState.DOWNLOADING;
                break;
            case 3:
                extendedDownloadState = ExtendedDownloadState.COMPLETED;
                break;
            case 4:
                extendedDownloadState = ExtendedDownloadState.FAILED;
                break;
            case 5:
                extendedDownloadState = ExtendedDownloadState.REMOVING;
                break;
            case 6:
                extendedDownloadState = ExtendedDownloadState.DOWNLOADING;
                break;
            case 7:
                extendedDownloadState = ExtendedDownloadState.PAUSED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new wys0(videoFileOld, downloadInfo, extendedDownloadState);
    }
}
