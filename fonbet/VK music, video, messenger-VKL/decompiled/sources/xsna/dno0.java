package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.g9m;

/* compiled from: TextTracksDialog.kt */
/* loaded from: classes8.dex */
public final class dno0 extends gk6<mk80, a> {
    public final int w;
    public final c x;
    public final b y;

    /* compiled from: TextTracksDialog.kt */
    public static final class a extends g9m.a {
        public final one.video.player.tracks.b c;
        public final boolean d;

        public a(one.video.player.tracks.b bVar, boolean z) {
            super(bVar != null ? bVar.hashCode() : -1, true);
            this.c = bVar;
            this.d = z;
        }
    }

    /* compiled from: TextTracksDialog.kt */
    public static final class b implements m37<mk80, a> {
        public final /* synthetic */ Context b;

        public b(Context context) {
            this.b = context;
        }

        @Override // xsna.m37
        public final void a(mk80 mk80Var, a aVar) {
            String string;
            mk80 mk80Var2 = mk80Var;
            a aVar2 = aVar;
            AppCompatTextView appCompatTextView = mk80Var2.c;
            one.video.player.tracks.b bVar = aVar2.c;
            if (bVar == null || (string = xx1.y(bVar)) == null) {
                string = this.b.getString(R.string.one_video_playback_subtitles_off);
            }
            appCompatTextView.setText(string);
            mk80Var2.a.setSelected(aVar2.d);
        }

        @Override // xsna.m37
        public final xtt0 b(int i, ViewGroup viewGroup) {
            return mk80.a(dno0.this.getLayoutInflater(), viewGroup);
        }
    }

    /* compiled from: TextTracksDialog.kt */
    public static final class c implements one.video.player.f {
        public c() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
            dno0.this.w();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
            if (state == OneVideoPlayer.State.BUFFERING) {
                if (state2 == OneVideoPlayer.State.PLAYING || state2 == OneVideoPlayer.State.PAUSED) {
                    dno0.this.w();
                }
            }
        }
    }

    public dno0(Context context, OneVideoPlayer oneVideoPlayer) {
        super(context, oneVideoPlayer);
        this.w = R.id.one_video_dialog_subtitles_tag;
        this.x = new c();
        this.y = new b(context);
    }

    @Override // xsna.tc6, com.google.android.material.bottomsheet.b, xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w();
    }

    @Override // xsna.tc6
    public final m37<mk80, a> r() {
        return this.y;
    }

    @Override // xsna.tc6
    public final int t() {
        return this.w;
    }

    @Override // xsna.tc6
    public final void u(g9m.a aVar) {
        one.video.player.tracks.b bVar = ((a) aVar).c;
        OneVideoPlayer oneVideoPlayer = this.v;
        if (bVar != null) {
            oneVideoPlayer.z(bVar);
        } else {
            oneVideoPlayer.t();
        }
        dismiss();
    }

    @Override // xsna.gk6
    public final OneVideoPlayer.c v() {
        return this.x;
    }

    public final void w() {
        androidx.recyclerview.widget.x xVar = this.t;
        if (xVar == null) {
            xVar = null;
        }
        ArrayList arrayList = new ArrayList();
        OneVideoPlayer oneVideoPlayer = this.v;
        one.video.player.tracks.b Q = oneVideoPlayer.Q();
        String str = Q != null ? Q.b : null;
        arrayList.add(new a(null, str == null));
        for (one.video.player.tracks.b bVar : oneVideoPlayer.Y()) {
            arrayList.add(new a(bVar, epx.f(bVar.b, str)));
        }
        xVar.submitList(arrayList);
    }
}
