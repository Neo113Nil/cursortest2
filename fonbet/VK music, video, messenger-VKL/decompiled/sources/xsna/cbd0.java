package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.imageloader.view.VKImageView;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vk.voip.ui.watchmovie.player.VoipWatchMoviePlayerControlView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.participant.movie.MovieSourceTypeExtensionsKt;
import ru.ok.android.webrtc.participant.movie.MovieThumbnail;
import xsna.bbd0;
import xsna.wen;
import xsna.ycx0;

/* compiled from: PrimaryWatchTogetherViewHolder.kt */
/* loaded from: classes7.dex */
public final class cbd0 extends abd0<bbd0.d> implements ycx0.a {
    public final FrameLayout s;
    public final VoipWatchMoviePlayerControlView t;
    public final VKImageView u;
    public final View v;
    public final mcx0 w;
    public final ycx0 x;

    public cbd0(b630 b630Var, ha90 ha90Var, qfu qfuVar, mc0 mc0Var, ViewGroup viewGroup) {
        super(R.layout.voip_primary_watch_together_view_holder, viewGroup, qfuVar, b630Var, ha90Var);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.render_container);
        this.s = frameLayout;
        VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView = (VoipWatchMoviePlayerControlView) this.itemView.findViewById(R.id.voip_watch_move_player);
        this.t = voipWatchMoviePlayerControlView;
        this.u = (VKImageView) this.itemView.findViewById(R.id.voip_watch_movie_preview);
        this.v = this.itemView.findViewById(R.id.voip_fullscreen_loading_group);
        mcx0 mcx0Var = new mcx0((zzz) this.n.a, frameLayout, (rct0) qfuVar.d, (wly) qfuVar.e, (k490) qfuVar.f);
        this.w = mcx0Var;
        zzz zzzVar = (zzz) this.n.a;
        ListGroupCallView listGroupCallView = (ListGroupCallView) mc0Var.a;
        j6x0 j6x0Var = (j6x0) mc0Var.b;
        jcx0 jcx0Var = (jcx0) mc0Var.c;
        com.vk.voip.ui.c.b.getClass();
        this.x = new ycx0(zzzVar, listGroupCallView, j6x0Var, mcx0Var, this, com.vk.voip.ui.c.D0, jcx0Var);
        jcx0 jcx0Var2 = (jcx0) mc0Var.c;
        voipWatchMoviePlayerControlView.Q4(jcx0Var2.b(), jcx0Var2);
    }

    @Override // xsna.ycx0.a
    public final FrameLayout J2() {
        return this.s;
    }

    @Override // xsna.ycx0.a
    public final VKImageView O1() {
        return this.u;
    }

    @Override // xsna.abd0, xsna.vfz
    public final void V5() {
        super.V5();
        bbd0.d dVar = (bbd0.d) this.q;
        if (dVar != null) {
            Movie movie = dVar.c;
            this.w.b(new ConversationVideoTrackParticipantKey.Builder().setType(MovieSourceTypeExtensionsKt.toVideoTrackType(movie.getSourceType())).setParticipantId(mnh0.H(dVar.b)).setMovieId(movie.getMovieId()).build());
        }
        this.x.f();
        ((cfn) this.n.b).a();
    }

    @Override // xsna.abd0, xsna.vfz
    public final void a6() {
        super.a6();
        this.w.f();
        this.x.g();
    }

    @Override // xsna.wen
    public final wen.a getDisplayLayouts() {
        ConversationDisplayLayoutItem g = this.w.g();
        List singletonList = g != null ? Collections.singletonList(g) : null;
        if (singletonList == null) {
            singletonList = EmptyList.b;
        }
        return new wen.a.b(singletonList);
    }

    @Override // xsna.ycx0.a
    public final VoipWatchMoviePlayerControlView getPlayerView() {
        return this.t;
    }

    @Override // xsna.ycx0.a
    public final MovieThumbnail.Quality t5() {
        bbd0.d dVar = (bbd0.d) this.q;
        if (dVar != null) {
            List<MovieThumbnail.Quality> qualities = dVar.c.getThumbnail().getQualities();
            if (!qualities.isEmpty()) {
                return (MovieThumbnail.Quality) j5g.i0(qualities);
            }
        }
        return null;
    }

    @Override // xsna.ycx0.a
    public final View y1() {
        return this.v;
    }
}
