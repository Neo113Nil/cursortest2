package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.g9m;
import xsna.qwm;

/* compiled from: VideoTracksDialog.kt */
/* loaded from: classes8.dex */
public final class tlt0 extends gk6<mk80, a> {
    public final rwm w;
    public final int x;
    public final c y;
    public final b z;

    /* compiled from: VideoTracksDialog.kt */
    public static final class a extends g9m.a {
        public final one.video.player.tracks.c c;
        public final boolean d;

        public a(one.video.player.tracks.c cVar, boolean z, boolean z2) {
            super(cVar != null ? cVar.hashCode() : -1, z2);
            this.c = cVar;
            this.d = z;
        }
    }

    /* compiled from: VideoTracksDialog.kt */
    public static final class b implements m37<mk80, a> {
        public final /* synthetic */ Context b;
        public final /* synthetic */ OneVideoPlayer c;

        public b(Context context, OneVideoPlayer oneVideoPlayer) {
            this.b = context;
            this.c = oneVideoPlayer;
        }

        @Override // xsna.m37
        public final void a(mk80 mk80Var, a aVar) {
            mk80 mk80Var2 = mk80Var;
            a aVar2 = aVar;
            AppCompatTextView appCompatTextView = mk80Var2.c;
            one.video.player.tracks.c cVar = aVar2.c;
            Context context = this.b;
            StringBuilder sb = new StringBuilder(nlt0.a(cVar, context));
            OneVideoPlayer oneVideoPlayer = this.c;
            one.video.player.tracks.c E = oneVideoPlayer.E();
            if (cVar == null && oneVideoPlayer.J() == null && E != null) {
                sb.append(" (");
                sb.append(nlt0.a(E, context));
                sb.append(")");
            }
            appCompatTextView.setText(sb.toString());
            mk80Var2.a.setSelected(aVar2.d);
        }

        @Override // xsna.m37
        public final xtt0 b(int i, ViewGroup viewGroup) {
            return mk80.a(tlt0.this.getLayoutInflater(), viewGroup);
        }
    }

    /* compiled from: VideoTracksDialog.kt */
    public static final class c implements one.video.player.f {
        public c() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
            tlt0.this.w();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
            tlt0.this.w();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
            if (state == OneVideoPlayer.State.BUFFERING) {
                if (state2 == OneVideoPlayer.State.PLAYING || state2 == OneVideoPlayer.State.PAUSED) {
                    tlt0.this.w();
                }
            }
        }
    }

    public tlt0(Context context, OneVideoPlayer oneVideoPlayer, rwm rwmVar) {
        super(context, oneVideoPlayer);
        this.w = rwmVar;
        this.x = R.id.one_video_dialog_specific_quality_tag;
        this.y = new c();
        this.z = new b(context, oneVideoPlayer);
    }

    @Override // xsna.tc6, com.google.android.material.bottomsheet.b, xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w();
    }

    @Override // xsna.tc6
    public final m37<mk80, a> r() {
        return this.z;
    }

    @Override // xsna.tc6
    public final int t() {
        return this.x;
    }

    @Override // xsna.tc6
    public final void u(g9m.a aVar) {
        one.video.player.tracks.c cVar = ((a) aVar).c;
        OneVideoPlayer oneVideoPlayer = this.v;
        if (cVar != null) {
            oneVideoPlayer.S(cVar);
        } else {
            oneVideoPlayer.o0();
        }
        rwm rwmVar = this.w;
        if (rwmVar != null) {
            rwmVar.a(new qwm.c(cVar));
        }
        dismiss();
    }

    @Override // xsna.gk6
    public final OneVideoPlayer.c v() {
        return this.y;
    }

    public final void w() {
        boolean z;
        cms0 cms0Var;
        androidx.recyclerview.widget.x xVar = this.t;
        if (xVar == null) {
            xVar = null;
        }
        ArrayList arrayList = new ArrayList();
        OneVideoPlayer oneVideoPlayer = this.v;
        one.video.player.tracks.c J = oneVideoPlayer.J();
        one.video.player.tracks.c E = oneVideoPlayer.E();
        List<one.video.player.tracks.c> k0 = oneVideoPlayer.k0();
        boolean z2 = oneVideoPlayer.y() && k0.size() > 1;
        boolean z3 = z2 && J == null;
        if (z2) {
            arrayList.add(new a(null, J == null, true));
        }
        for (one.video.player.tracks.c cVar : k0) {
            if (!z3) {
                if (((cms0) cVar.c).b() == ((E == null || (cms0Var = (cms0) E.c) == null) ? null : cms0Var.b())) {
                    z = true;
                    arrayList.add(new a(cVar, z, cVar.d));
                }
            }
            z = false;
            arrayList.add(new a(cVar, z, cVar.d));
        }
        xVar.submitList(arrayList);
    }
}
