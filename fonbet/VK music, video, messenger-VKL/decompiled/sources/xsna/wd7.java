package xsna;

import androidx.media3.exoplayer.hls.playlist.c;
import java.util.Comparator;
import java.util.List;
import one.video.player.manifest.ManifestValidationErrorType;

/* compiled from: BitrateHlsValidator.kt */
/* loaded from: classes8.dex */
public final class wd7 implements w9v {

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((c.b) t2).b.j), Integer.valueOf(((c.b) t).b.j));
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((c.b) t2).b.v), Integer.valueOf(((c.b) t).b.v));
        }
    }

    @Override // xsna.w9v
    public final ManifestValidationErrorType a(androidx.media3.exoplayer.hls.playlist.c cVar) {
        List<c.b> list = cVar.e;
        List<c.b> list2 = list;
        List D0 = j5g.D0(new a(), list2);
        List D02 = j5g.D0(new b(), list2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (D0.get(i) != D02.get(i)) {
                return ManifestValidationErrorType.VIDEO_BITRATE_TO_MAPPING_PRIORITY_ERROR;
            }
        }
        return ManifestValidationErrorType.MANIFEST_OK;
    }
}
