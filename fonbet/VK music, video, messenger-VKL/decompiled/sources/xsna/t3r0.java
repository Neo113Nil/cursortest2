package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.participant.movie.MovieDuration;
import ru.ok.android.webrtc.participant.movie.MovieSourceType;
import ru.ok.android.webrtc.participant.movie.MovieThumbnail;

/* compiled from: Utils.kt */
/* loaded from: classes7.dex */
public final class t3r0 {
    public static final Object a;
    public static final Object b;

    static {
        eul0 eul0Var = new eul0(2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        a = msy.a(lazyThreadSafetyMode, eul0Var);
        b = msy.a(lazyThreadSafetyMode, new cy20(18));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean a(Image image) {
        int i = image.b;
        int i2 = image.c;
        return i > i2 ? i >= ((Number) a.getValue()).intValue() : i2 >= ((Number) b.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final p3x0 b(Movie movie) {
        UserId userId;
        int i;
        MovieDuration duration;
        MovieSourceType sourceType;
        MovieSourceType movieSourceType;
        long j;
        List<MovieThumbnail.Quality> qualities = movie.getThumbnail().getQualities();
        ArrayList arrayList = new ArrayList(c5g.u(qualities, 10));
        String str = null;
        for (MovieThumbnail.Quality quality : qualities) {
            Image image = new Image(quality.getWidth(), quality.getHeight(), quality.getLink(), false);
            if (str == null && a(image)) {
                str = image.d;
            }
            arrayList.add(image);
        }
        UserId userId2 = UserId.d;
        try {
            List b0 = drm0.b0(movie.getExternalMovieId(), new char[]{'_'}, 0, 6);
            long parseLong = Long.parseLong((String) j5g.Y(b0));
            gzs<s3q0> gzsVar = fkq0.a;
            UserId userId3 = new UserId(parseLong);
            try {
                userId = userId3;
                i = Integer.parseInt((String) j5g.i0(b0));
            } catch (RuntimeException unused) {
                userId2 = userId3;
                userId = userId2;
                i = -1;
                long id = movie.getMovieId().getId();
                String title = movie.getTitle();
                duration = movie.getDuration();
                sourceType = movie.getSourceType();
                movieSourceType = MovieSourceType.MOVIE;
                if (sourceType == movieSourceType) {
                }
                if (movie.getSourceType() == movieSourceType) {
                }
                return new p3x0(id, i, title, null, userId, null, j, arrayList, str);
            }
        } catch (RuntimeException unused2) {
        }
        long id2 = movie.getMovieId().getId();
        String title2 = movie.getTitle();
        duration = movie.getDuration();
        sourceType = movie.getSourceType();
        movieSourceType = MovieSourceType.MOVIE;
        if (sourceType == movieSourceType || !(duration instanceof MovieDuration.Value)) {
            j = (movie.getSourceType() == movieSourceType || !(duration instanceof MovieDuration.Undefined)) ? movie.getSourceType() != MovieSourceType.STREAM ? -1L : -2L : 1L;
        } else {
            MovieDuration.Value value = (MovieDuration.Value) duration;
            j = value.getTimeUnit().toSeconds(value.getValue());
        }
        return new p3x0(id2, i, title2, null, userId, null, j, arrayList, str);
    }
}
