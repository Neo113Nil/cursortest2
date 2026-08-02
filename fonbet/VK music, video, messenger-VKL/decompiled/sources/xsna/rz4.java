package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.g9m;

/* compiled from: AudioTracksDialog.kt */
/* loaded from: classes8.dex */
public final class rz4 extends gk6<mk80, a> {
    public final int w;
    public final c x;
    public final b y;

    /* compiled from: AudioTracksDialog.kt */
    public static final class a extends g9m.a {
        public final one.video.player.tracks.a c;
        public final String d;
        public final boolean e;

        public a(one.video.player.tracks.a aVar, String str, boolean z) {
            super(aVar.hashCode(), true);
            this.c = aVar;
            this.d = str;
            this.e = z;
        }
    }

    /* compiled from: AudioTracksDialog.kt */
    public static final class b implements m37<mk80, a> {
        public b() {
        }

        @Override // xsna.m37
        public final void a(mk80 mk80Var, a aVar) {
            mk80 mk80Var2 = mk80Var;
            a aVar2 = aVar;
            mk80Var2.c.setText(aVar2.d);
            mk80Var2.a.setSelected(aVar2.e);
        }

        @Override // xsna.m37
        public final xtt0 b(int i, ViewGroup viewGroup) {
            return mk80.a(rz4.this.getLayoutInflater(), viewGroup);
        }
    }

    /* compiled from: AudioTracksDialog.kt */
    public static final class c implements one.video.player.f {
        public c() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar) {
            rz4.this.w();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
            if (state == OneVideoPlayer.State.BUFFERING) {
                if (state2 == OneVideoPlayer.State.PLAYING || state2 == OneVideoPlayer.State.PAUSED) {
                    rz4.this.w();
                }
            }
        }
    }

    public rz4(Context context, OneVideoPlayer oneVideoPlayer) {
        super(context, oneVideoPlayer);
        this.w = R.id.one_video_dialog_sound_tag;
        this.x = new c();
        this.y = new b();
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
        this.v.q(((a) aVar).c);
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
        one.video.player.tracks.a M = oneVideoPlayer.M();
        if (M != null) {
            List<one.video.player.tracks.a> F = oneVideoPlayer.F();
            LinkedHashMap a2 = pz4.a(getContext(), F);
            for (one.video.player.tracks.a aVar : F) {
                String str = (String) a2.get(aVar.b);
                if (str != null) {
                    arrayList.add(new a(aVar, str, epx.f(M.b, aVar.b)));
                }
            }
        }
        xVar.submitList(arrayList);
    }
}
