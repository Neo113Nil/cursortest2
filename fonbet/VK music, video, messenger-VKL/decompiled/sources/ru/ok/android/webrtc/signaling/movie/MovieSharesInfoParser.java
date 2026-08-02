package ru.ok.android.webrtc.signaling.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.participant.movie.MovieDuration;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.participant.movie.MovieSourceType;
import ru.ok.android.webrtc.participant.movie.MovieThumbnail;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.util.JSONExtensionsKt;
import ru.ok.android.webrtc.watch_together.MovieStartInfo;
import ru.ok.android.webrtc.watch_together.MovieStopInfo;

/* loaded from: classes9.dex */
public final class MovieSharesInfoParser {
    public final RTCLog a;

    public MovieSharesInfoParser(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public static MovieStopInfo a(JSONObject jSONObject) {
        long j = jSONObject.getLong(SignalingProtocol.KEY_MOVIE_ID);
        CallParticipant.ParticipantId fromStringValue = CallParticipant.ParticipantId.fromStringValue(jSONObject.getString(SignalingProtocol.KEY_INITIATOR_ID));
        String string = jSONObject.getString("source");
        MovieSourceType movieSourceType = string.equals(SignalingProtocol.KEY_STREAM_TYPE_MOVIE) ? MovieSourceType.MOVIE : string.equals("STREAM") ? MovieSourceType.STREAM : null;
        if (movieSourceType == null) {
            return null;
        }
        Integer optIntOrNull = JSONExtensionsKt.optIntOrNull(jSONObject, SignalingProtocol.KEY_ROOM_ID);
        return new MovieStopInfo(fromStringValue, optIntOrNull != null ? new SessionRoomId.Room(optIntOrNull.intValue()) : SessionRoomId.MainCall.INSTANCE, new MovieId(j), movieSourceType);
    }

    public final MovieStartInfo parseMovieInfoFromNotification(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(SignalingProtocol.KEY_MOVIE_SHARE_INFO);
            Integer optIntOrNull = JSONExtensionsKt.optIntOrNull(jSONObject, SignalingProtocol.KEY_ROOM_ID);
            try {
                return a(jSONObject2, optIntOrNull != null ? new SessionRoomId.Room(optIntOrNull.intValue()) : SessionRoomId.MainCall.INSTANCE);
            } catch (Throwable th) {
                this.a.logException("VideoStreamsParser", "Can't parse movie", th);
                return null;
            }
        } catch (Throwable th2) {
            this.a.logException("VideoStreamsParser", "Can't parse movie", th2);
            return null;
        }
    }

    public final MovieStopInfo parseMovieStopInfoFromNotification(JSONObject jSONObject) {
        try {
            return a(jSONObject);
        } catch (Throwable th) {
            this.a.logException("VideoStreamsParser", "Can't parse stop movie notification", th);
            return null;
        }
    }

    public final List<Movie> parseMoviesFromParticipant(JSONObject jSONObject, SessionRoomId sessionRoomId) {
        MovieStartInfo movieStartInfo;
        Movie movie;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_MOVIE_SHARE_INFOS);
            if (optJSONArray == null) {
                return EmptyList.b;
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    movieStartInfo = a(optJSONArray.getJSONObject(i), sessionRoomId);
                } catch (Throwable th) {
                    this.a.logException("VideoStreamsParser", "Can't parse movie", th);
                    movieStartInfo = null;
                }
                if (movieStartInfo != null && (movie = movieStartInfo.getMovie()) != null) {
                    arrayList.add(movie);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            this.a.logException("VideoStreamsParser", "Can't parse movies", th2);
            return EmptyList.b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MovieStartInfo a(JSONObject jSONObject, SessionRoomId sessionRoomId) {
        MovieSourceType movieSourceType;
        MovieSourceType movieSourceType2;
        MovieDuration value;
        long j = jSONObject.getLong(SignalingProtocol.KEY_MOVIE_ID);
        CallParticipant.ParticipantId fromStringValue = CallParticipant.ParticipantId.fromStringValue(jSONObject.getString(SignalingProtocol.KEY_INITIATOR_ID));
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("source");
        if (string2.equals(SignalingProtocol.KEY_STREAM_TYPE_MOVIE)) {
            movieSourceType2 = MovieSourceType.MOVIE;
        } else {
            if (!string2.equals("STREAM")) {
                movieSourceType = null;
                if (movieSourceType != null) {
                    return null;
                }
                String string3 = jSONObject.getString(SignalingProtocol.KEY_EXTERNAL_MOVIE_ID);
                long optLong = jSONObject.optLong("duration");
                if (optLong <= 0) {
                    value = MovieDuration.Undefined.INSTANCE;
                } else {
                    value = new MovieDuration.Value(optLong, TimeUnit.SECONDS);
                }
                MovieId movieId = new MovieId(j);
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_THUMBNAILS);
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    int i = 0;
                    while (i < length) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        arrayList.add(new MovieThumbnail.Quality(jSONObject2.optString("url"), jSONObject2.optInt("width"), jSONObject2.optInt("height")));
                        i++;
                        optJSONArray = optJSONArray;
                    }
                }
                return new MovieStartInfo(fromStringValue, sessionRoomId, new Movie(movieId, string3, string, movieSourceType, value, new MovieThumbnail(arrayList)));
            }
            movieSourceType2 = MovieSourceType.STREAM;
        }
        movieSourceType = movieSourceType2;
        if (movieSourceType != null) {
        }
    }
}
