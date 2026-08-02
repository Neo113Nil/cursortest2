package ru.ok.android.webrtc.participant.movie;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class MovieSourceType {
    public static final MovieSourceType MOVIE;
    public static final MovieSourceType STREAM;
    public static final /* synthetic */ MovieSourceType[] a;
    public static final /* synthetic */ zrp b;

    static {
        MovieSourceType movieSourceType = new MovieSourceType(SignalingProtocol.KEY_STREAM_TYPE_MOVIE, 0);
        MOVIE = movieSourceType;
        MovieSourceType movieSourceType2 = new MovieSourceType("STREAM", 1);
        STREAM = movieSourceType2;
        MovieSourceType[] movieSourceTypeArr = {movieSourceType, movieSourceType2};
        a = movieSourceTypeArr;
        b = new asp(movieSourceTypeArr);
    }

    public MovieSourceType(String str, int i) {
    }

    public static zrp<MovieSourceType> getEntries() {
        return b;
    }

    public static MovieSourceType valueOf(String str) {
        return (MovieSourceType) Enum.valueOf(MovieSourceType.class, str);
    }

    public static MovieSourceType[] values() {
        return (MovieSourceType[]) a.clone();
    }
}
