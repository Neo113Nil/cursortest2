package one.video.exo.diskcache.core;

import androidx.media3.exoplayer.offline.DownloadRequest;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.o7o;
import xsna.zrp;

/* compiled from: CachedVideoInfo.kt */
/* loaded from: classes8.dex */
public final class CachedVideoInfo {
    public final long a;
    public final long b;
    public final long c;
    public final DownloadRequest d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CachedVideoInfo.kt */
    public static final class DownloadState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DownloadState[] $VALUES;
        public static final DownloadState COMPLETED;
        public static final DownloadState DOWNLOADING;
        public static final DownloadState FAILED;
        public static final DownloadState STOPPED;
        public static final DownloadState UNKNOWN;

        static {
            DownloadState downloadState = new DownloadState("DOWNLOADING", 0);
            DOWNLOADING = downloadState;
            DownloadState downloadState2 = new DownloadState("COMPLETED", 1);
            COMPLETED = downloadState2;
            DownloadState downloadState3 = new DownloadState("STOPPED", 2);
            STOPPED = downloadState3;
            DownloadState downloadState4 = new DownloadState(SignalingProtocol.HUNGUP_REASON_FAILED, 3);
            FAILED = downloadState4;
            DownloadState downloadState5 = new DownloadState(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
            UNKNOWN = downloadState5;
            DownloadState[] downloadStateArr = {downloadState, downloadState2, downloadState3, downloadState4, downloadState5};
            $VALUES = downloadStateArr;
            $ENTRIES = new asp(downloadStateArr);
        }

        public DownloadState() {
            throw null;
        }

        public static DownloadState valueOf(String str) {
            return (DownloadState) Enum.valueOf(DownloadState.class, str);
        }

        public static DownloadState[] values() {
            return (DownloadState[]) $VALUES.clone();
        }
    }

    public CachedVideoInfo(o7o o7oVar) {
        String str = o7oVar.a.b;
        this.a = o7oVar.h.a;
        this.b = o7oVar.e;
        this.c = o7oVar.c;
        int i = o7oVar.b;
        if (i == 1) {
            DownloadState downloadState = DownloadState.DOWNLOADING;
        } else if (i == 2) {
            DownloadState downloadState2 = DownloadState.DOWNLOADING;
        } else if (i == 3) {
            DownloadState downloadState3 = DownloadState.DOWNLOADING;
        } else if (i != 4) {
            DownloadState downloadState4 = DownloadState.DOWNLOADING;
        } else {
            DownloadState downloadState5 = DownloadState.DOWNLOADING;
        }
        this.d = o7oVar.a;
    }
}
