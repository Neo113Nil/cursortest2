package xsna;

import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoDownloadsRepository.kt */
/* loaded from: classes2.dex */
public interface eao {

    /* compiled from: VideoDownloadsRepository.kt */
    public static final class a implements eao {
        public final DownloadInfo a;

        public a(DownloadInfo downloadInfo) {
            this.a = downloadInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            DownloadInfo downloadInfo = this.a;
            DownloadInfo.State state = downloadInfo.c;
            DownloadInfo downloadInfo2 = ((a) obj).a;
            return state == downloadInfo2.c && downloadInfo.g == downloadInfo2.g;
        }

        public final int hashCode() {
            DownloadInfo downloadInfo = this.a;
            return Float.hashCode(downloadInfo.g) + (downloadInfo.c.hashCode() * 31);
        }
    }

    /* compiled from: VideoDownloadsRepository.kt */
    public static final class b implements eao {
        public static final b a = new b();
    }
}
