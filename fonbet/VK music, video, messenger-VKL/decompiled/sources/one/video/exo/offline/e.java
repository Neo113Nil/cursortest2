package one.video.exo.offline;

import java.util.List;
import one.video.player.tracks.Track;
import xsna.kao;

/* compiled from: DownloadTracksResult.kt */
/* loaded from: classes8.dex */
public interface e<T extends Track> {

    /* compiled from: DownloadTracksResult.kt */
    public static final class a<T extends Track> implements e<T> {
    }

    /* compiled from: DownloadTracksResult.kt */
    public static final class b<T extends Track> implements e<T> {
    }

    /* compiled from: DownloadTracksResult.kt */
    public static final class c<T extends Track> implements e<T> {
        public final List<kao<T>> a;

        public c(List<kao<T>> list) {
            this.a = list;
        }
    }
}
