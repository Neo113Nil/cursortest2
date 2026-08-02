package ru.ok.android.webrtc.participant.movie;

import java.util.List;
import ru.ok.android.webrtc.participant.movie.MovieThumbnail;

/* loaded from: classes9.dex */
public final class MoviePresetMeta {
    public final String a;
    public final List b;

    public MoviePresetMeta(String str, List<MovieThumbnail.Quality> list) {
        this.a = str;
        this.b = list;
    }

    public final List<MovieThumbnail.Quality> getImages() {
        return this.b;
    }

    public final String getTitle() {
        return this.a;
    }
}
