package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.imageloader.view.VKImageView;
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
import xsna.sgu;
import xsna.wen;
import xsna.ycx0;

/* compiled from: GridWatchTogetherViewHolder.kt */
/* loaded from: classes7.dex */
public final class tgu extends rgu<sgu.c> implements ycx0.a {
    public static final int z = cn70.b(175);
    public final mfw0 s;
    public final FrameLayout t;
    public final VoipWatchMoviePlayerControlView u;
    public final VKImageView v;
    public final View w;
    public final mcx0 x;
    public final ycx0 y;

    public tgu(nit nitVar, ha90 ha90Var, qfu qfuVar, mc0 mc0Var, ViewGroup viewGroup, mfw0 mfw0Var) {
        super(R.layout.voip_grid_fullscreen_watch_together_view_holder, viewGroup, qfuVar, nitVar, ha90Var);
        this.s = mfw0Var;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.render_container);
        this.t = frameLayout;
        VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView = (VoipWatchMoviePlayerControlView) this.itemView.findViewById(R.id.voip_watch_move_player);
        this.u = voipWatchMoviePlayerControlView;
        this.v = (VKImageView) this.itemView.findViewById(R.id.voip_watch_movie_preview);
        this.w = this.itemView.findViewById(R.id.voip_fullscreen_loading_group);
        mcx0 mcx0Var = new mcx0((zzz) this.l.a, frameLayout, (rct0) qfuVar.d, (wly) qfuVar.e, (k490) qfuVar.f);
        this.x = mcx0Var;
        zzz zzzVar = (zzz) this.l.a;
        com.vk.voip.ui.groupcalls.grid.a aVar = (com.vk.voip.ui.groupcalls.grid.a) mc0Var.a;
        j6x0 j6x0Var = (j6x0) mc0Var.b;
        com.vk.voip.ui.c.b.getClass();
        this.y = new ycx0(zzzVar, aVar, j6x0Var, mcx0Var, this, com.vk.voip.ui.c.D0, (jcx0) mc0Var.c);
        jcx0 jcx0Var = (jcx0) mc0Var.c;
        voipWatchMoviePlayerControlView.Q4(jcx0Var.b(), jcx0Var);
        io.reactivex.rxjava3.disposables.c f = io.reactivex.rxjava3.kotlin.c.f(3, mfw0Var.c(), null, null, new l6u(this, 2));
        io.reactivex.rxjava3.disposables.b bVar = this.p;
        bVar.b(f);
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, mfw0Var.a(), null, null, new pwk(this, 18)));
        voipWatchMoviePlayerControlView.Q4(jcx0Var.b(), jcx0Var);
    }

    @Override // xsna.ycx0.a
    public final FrameLayout J2() {
        return this.t;
    }

    @Override // xsna.ycx0.a
    public final VKImageView O1() {
        return this.v;
    }

    @Override // xsna.rgu, xsna.vfz
    public final void V5() {
        super.V5();
        sgu.c cVar = (sgu.c) this.q;
        if (cVar != null) {
            Movie movie = cVar.c;
            this.x.b(new ConversationVideoTrackParticipantKey.Builder().setType(MovieSourceTypeExtensionsKt.toVideoTrackType(movie.getSourceType())).setParticipantId(mnh0.H(cVar.b)).setMovieId(movie.getMovieId()).build());
        }
        this.y.f();
        ((cfn) this.l.b).a();
    }

    @Override // xsna.rgu, xsna.vfz
    public final void a6() {
        super.a6();
        this.x.f();
        this.y.g();
    }

    @Override // xsna.wen
    public final wen.a getDisplayLayouts() {
        ConversationDisplayLayoutItem g = this.x.g();
        List singletonList = g != null ? Collections.singletonList(g) : null;
        if (singletonList == null) {
            singletonList = EmptyList.b;
        }
        return new wen.a.b(singletonList);
    }

    @Override // xsna.ycx0.a
    public final VoipWatchMoviePlayerControlView getPlayerView() {
        return this.u;
    }

    @Override // xsna.ycx0.a
    public final MovieThumbnail.Quality t5() {
        sgu.c cVar = (sgu.c) this.q;
        if (cVar != null) {
            List<MovieThumbnail.Quality> qualities = cVar.c.getThumbnail().getQualities();
            if (!qualities.isEmpty()) {
                return (MovieThumbnail.Quality) j5g.i0(qualities);
            }
        }
        return null;
    }

    @Override // xsna.ycx0.a
    public final View y1() {
        return this.w;
    }
}
