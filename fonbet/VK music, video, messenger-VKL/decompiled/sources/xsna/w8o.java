package xsna;

import one.video.exo.offline.DownloadInfo;

/* compiled from: DownloadInfoExt.kt */
/* loaded from: classes3.dex */
public final class w8o {

    /* compiled from: DownloadInfoExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadInfo.State.values().length];
            try {
                iArr[DownloadInfo.State.STATE_QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadInfo.State.STATE_DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadInfo.State.STATE_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DownloadInfo.State.STATE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DownloadInfo.State.STATE_REMOVING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DownloadInfo.State.STATE_RESTARTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DownloadInfo.State.STATE_STOPPED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long a(DownloadInfo downloadInfo) {
        long j = downloadInfo.d;
        if (downloadInfo.c == DownloadInfo.State.STATE_COMPLETED) {
            return j;
        }
        long j2 = downloadInfo.e;
        if (j2 != -1) {
            return j2;
        }
        float f = j;
        float f2 = downloadInfo.g;
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        return (long) ((f / f2) * 100.0f);
    }

    public static final long b(DownloadInfo downloadInfo) {
        return Math.max(a(downloadInfo) - downloadInfo.d, 0L);
    }

    public static final boolean c(DownloadInfo.State state) {
        return state == DownloadInfo.State.STATE_DOWNLOADING;
    }

    public static final boolean d(DownloadInfo.State state) {
        return !(state == DownloadInfo.State.STATE_STOPPED);
    }
}
