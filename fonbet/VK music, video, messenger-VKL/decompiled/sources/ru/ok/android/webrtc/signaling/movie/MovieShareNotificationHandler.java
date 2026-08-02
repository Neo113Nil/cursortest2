package ru.ok.android.webrtc.signaling.movie;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.CallEvents;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.participant.update.ParticipantAddOrUpdateParams;
import ru.ok.android.webrtc.watch_together.MovieStartInfo;
import ru.ok.android.webrtc.watch_together.MovieStopInfo;
import xsna.epx;
import xsna.j5g;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes9.dex */
public final class MovieShareNotificationHandler {
    public final CallParticipants a;
    public final MovieSharesInfoParser b;
    public final wzs c;

    public MovieShareNotificationHandler(CallParticipants callParticipants, MovieSharesInfoParser movieSharesInfoParser, wzs<? super CallEvents, Object, s3q0> wzsVar) {
        this.a = callParticipants;
        this.b = movieSharesInfoParser;
        this.c = wzsVar;
    }

    public final void handleMovieShareStarted(JSONObject jSONObject) {
        CallParticipant participant;
        MovieStartInfo parseMovieInfoFromNotification = this.b.parseMovieInfoFromNotification(jSONObject);
        if (parseMovieInfoFromNotification == null || (participant = this.a.getParticipant(parseMovieInfoFromNotification.getInitiatorId())) == null) {
            return;
        }
        CallParticipants.addOrUpdate$default(this.a, new ParticipantAddOrUpdateParams.Builder(parseMovieInfoFromNotification.getInitiatorId()).setMovies(j5g.v0(parseMovieInfoFromNotification.getMovie(), participant.getMovies())).build(), null, 2, null);
        this.c.invoke(CallEvents.WATCH_TOGETHER_START, parseMovieInfoFromNotification);
    }

    public final void handleMovieShareStopped(JSONObject jSONObject) {
        MovieStopInfo parseMovieStopInfoFromNotification = this.b.parseMovieStopInfoFromNotification(jSONObject);
        if (parseMovieStopInfoFromNotification == null) {
            return;
        }
        CallParticipant participant = this.a.getParticipant(parseMovieStopInfoFromNotification.getInitiatorId());
        if (participant != null) {
            List<Movie> movies = participant.getMovies();
            ArrayList arrayList = new ArrayList();
            for (Object obj : movies) {
                Movie movie = (Movie) obj;
                if (!epx.f(movie.getMovieId(), parseMovieStopInfoFromNotification.getMovieId()) || movie.getSourceType() != parseMovieStopInfoFromNotification.getSourceType()) {
                    arrayList.add(obj);
                }
            }
            CallParticipants.addOrUpdate$default(this.a, new ParticipantAddOrUpdateParams.Builder(parseMovieStopInfoFromNotification.getInitiatorId()).setMovies(arrayList).build(), null, 2, null);
        }
        this.c.invoke(CallEvents.WATCH_TOGETHER_STOP, parseMovieStopInfoFromNotification);
    }
}
