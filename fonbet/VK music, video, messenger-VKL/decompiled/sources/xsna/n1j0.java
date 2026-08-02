package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import one.video.controls.dialogs.videotracks.ExtendedVideoTracksDialog;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.model.FrameSize;
import one.video.player.tracks.trackselection.AdaptiveTrackSelectionInterval;
import xsna.g9m;
import xsna.p2j0;

/* compiled from: SettingsDialog.kt */
/* loaded from: classes8.dex */
public final class n1j0 extends gk6<xtt0, a> {
    public static final FrameSize H = FrameSize._480p;
    public static final List<p2j0> I = e43.l(p2j0.h.a, p2j0.e.a, p2j0.a.a, p2j0.d.a);
    public final c A;
    public final b B;
    public tlt0 C;
    public ExtendedVideoTracksDialog D;
    public dno0 E;
    public rz4 F;
    public sya0 G;
    public final boolean w;
    public final rwm x;
    public final List<p2j0> y;
    public final int z;

    /* compiled from: SettingsDialog.kt */
    public static abstract class a extends g9m.a {
        public final p2j0 c;
        public final String d;
        public final Integer e;

        /* compiled from: SettingsDialog.kt */
        /* renamed from: xsna.n1j0$a$a, reason: collision with other inner class name */
        public static final class C3380a extends a {
        }

        /* compiled from: SettingsDialog.kt */
        public static final class b extends a {
            public final String f;

            public b(int i, boolean z, p2j0 p2j0Var, Integer num, String str, String str2) {
                super(i, p2j0Var, str, num, z);
                this.f = str2;
            }

            @Override // xsna.g9m.a
            public final boolean equals(Object obj) {
                if (super.equals(obj)) {
                    return epx.f(this.f, ((b) obj).f);
                }
                return false;
            }

            @Override // xsna.g9m.a
            public final int hashCode() {
                return this.f.hashCode() + (super.hashCode() * 31);
            }
        }

        public a(int i, p2j0 p2j0Var, String str, Integer num, boolean z) {
            super(i, z);
            this.c = p2j0Var;
            this.d = str;
            this.e = num;
        }
    }

    /* compiled from: SettingsDialog.kt */
    public static final class b implements m37<xtt0, a> {
        public b() {
        }

        @Override // xsna.m37
        public final void a(xtt0 xtt0Var, a aVar) {
            a aVar2 = aVar;
            String str = aVar2.d;
            Integer num = aVar2.e;
            if (aVar2 instanceof a.C3380a) {
                mk80 mk80Var = xtt0Var instanceof mk80 ? (mk80) xtt0Var : null;
                if (mk80Var != null) {
                    AppCompatImageView appCompatImageView = mk80Var.b;
                    mk80Var.c.setText(str);
                    if (num == null) {
                        appCompatImageView.setVisibility(8);
                        return;
                    } else {
                        appCompatImageView.setVisibility(0);
                        appCompatImageView.setImageResource(num.intValue());
                        return;
                    }
                }
                return;
            }
            if (!(aVar2 instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ok80 ok80Var = xtt0Var instanceof ok80 ? (ok80) xtt0Var : null;
            if (ok80Var != null) {
                AppCompatImageView appCompatImageView2 = ok80Var.c;
                ok80Var.d.setText(str);
                ok80Var.e.setText(((a.b) aVar2).f);
                if (num == null) {
                    appCompatImageView2.setVisibility(8);
                } else {
                    appCompatImageView2.setVisibility(0);
                    appCompatImageView2.setImageResource(num.intValue());
                }
            }
        }

        @Override // xsna.m37
        public final xtt0 b(int i, ViewGroup viewGroup) {
            n1j0 n1j0Var = n1j0.this;
            p2j0 p2j0Var = n1j0Var.y.get(i);
            if (p2j0Var instanceof p2j0.c) {
                return mk80.a(n1j0Var.getLayoutInflater(), viewGroup);
            }
            if ((p2j0Var instanceof p2j0.g) || epx.f(p2j0Var, p2j0.h.a) || (p2j0Var instanceof p2j0.b) || epx.f(p2j0Var, p2j0.e.a) || epx.f(p2j0Var, p2j0.a.a) || epx.f(p2j0Var, p2j0.d.a) || epx.f(p2j0Var, p2j0.f.a)) {
                return ok80.a(n1j0Var.getLayoutInflater(), viewGroup);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // xsna.m37
        public final int getItemViewType(int i) {
            androidx.recyclerview.widget.x xVar = n1j0.this.t;
            if (xVar == null) {
                xVar = null;
            }
            return ((a) xVar.getCurrentList().get(i)).a;
        }
    }

    /* compiled from: SettingsDialog.kt */
    public static final class c implements one.video.player.f {
        public c() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void c(BaseVideoPlayer baseVideoPlayer, hk0 hk0Var) {
            n1j0.this.x();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
            n1j0.this.x();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void i(OneVideoPlayer oneVideoPlayer, int i) {
            n1j0.this.x();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
            n1j0.this.x();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
            n1j0.this.x();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void o(BaseVideoPlayer baseVideoPlayer, float f) {
            n1j0.this.x();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar) {
            n1j0.this.x();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
            if (state == OneVideoPlayer.State.BUFFERING) {
                if (state2 == OneVideoPlayer.State.PLAYING || state2 == OneVideoPlayer.State.PAUSED) {
                    n1j0.this.x();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n1j0(Context context, OneVideoPlayer oneVideoPlayer, boolean z, rwm rwmVar, List<? extends p2j0> list) {
        super(context, oneVideoPlayer);
        this.w = z;
        this.x = rwmVar;
        this.y = list;
        this.z = R.id.one_video_dialog_settings_tag;
        this.A = new c();
        this.B = new b();
    }

    @Override // xsna.tc6, com.google.android.material.bottomsheet.b, xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x();
    }

    @Override // xsna.gk6, xsna.b33, xsna.y8i, android.app.Dialog
    public final void onStop() {
        super.onStop();
        tlt0 tlt0Var = this.C;
        if (tlt0Var != null) {
            tlt0Var.dismiss();
        }
        ExtendedVideoTracksDialog extendedVideoTracksDialog = this.D;
        if (extendedVideoTracksDialog != null) {
            extendedVideoTracksDialog.dismiss();
        }
        dno0 dno0Var = this.E;
        if (dno0Var != null) {
            dno0Var.dismiss();
        }
        rz4 rz4Var = this.F;
        if (rz4Var != null) {
            rz4Var.dismiss();
        }
        sya0 sya0Var = this.G;
        if (sya0Var != null) {
            sya0Var.dismiss();
        }
    }

    @Override // xsna.tc6
    public final m37<xtt0, a> r() {
        return this.B;
    }

    @Override // xsna.tc6
    public final int t() {
        return this.z;
    }

    @Override // xsna.tc6
    public final void u(g9m.a aVar) {
        p2j0 p2j0Var = ((a) aVar).c;
        boolean f = epx.f(p2j0Var, p2j0.h.a);
        rwm rwmVar = this.x;
        OneVideoPlayer oneVideoPlayer = this.v;
        if (f) {
            if (this.C != null) {
                return;
            }
            tlt0 tlt0Var = new tlt0(getContext(), oneVideoPlayer, rwmVar);
            tlt0Var.setOnDismissListener(new kn40(this, 2));
            tlt0Var.show();
            this.C = tlt0Var;
            return;
        }
        if (p2j0Var instanceof p2j0.b) {
            p2j0.b bVar = (p2j0.b) p2j0Var;
            if (this.D != null) {
                return;
            }
            ExtendedVideoTracksDialog extendedVideoTracksDialog = new ExtendedVideoTracksDialog(getContext(), oneVideoPlayer, bVar.a, rwmVar);
            extendedVideoTracksDialog.setOnDismissListener(new m950(this, 1));
            extendedVideoTracksDialog.show();
            this.D = extendedVideoTracksDialog;
            return;
        }
        if (epx.f(p2j0Var, p2j0.e.a)) {
            if (this.E != null) {
                return;
            }
            dno0 dno0Var = new dno0(getContext(), oneVideoPlayer);
            dno0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.m1j0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    n1j0 n1j0Var = n1j0.this;
                    n1j0Var.E = null;
                    if (n1j0Var.w) {
                        n1j0Var.dismiss();
                    }
                }
            });
            dno0Var.show();
            this.E = dno0Var;
            return;
        }
        if (epx.f(p2j0Var, p2j0.a.a)) {
            if (this.F != null) {
                return;
            }
            rz4 rz4Var = new rz4(getContext(), oneVideoPlayer);
            rz4Var.setOnDismissListener(new ubj(this, 1));
            rz4Var.show();
            this.F = rz4Var;
            return;
        }
        if (epx.f(p2j0Var, p2j0.d.a)) {
            if (this.G != null) {
                return;
            }
            sya0 sya0Var = new sya0(getContext(), oneVideoPlayer);
            sya0Var.x = rwmVar;
            sya0Var.setOnDismissListener(new gf3(this, 2));
            sya0Var.show();
            this.G = sya0Var;
            return;
        }
        if (epx.f(p2j0Var, p2j0.f.a)) {
            FrameSize frameSize = oneVideoPlayer.P().b;
            FrameSize frameSize2 = H;
            if (frameSize == frameSize2) {
                frameSize2 = hk0.e.b;
            }
            oneVideoPlayer.b0(hk0.a(oneVideoPlayer.P(), null, frameSize2, false, 13));
            x();
            return;
        }
        if (p2j0Var instanceof p2j0.c) {
            ((p2j0.c) p2j0Var).getClass();
            throw null;
        }
        if (!(p2j0Var instanceof p2j0.g)) {
            throw new NoWhenBranchMatchedException();
        }
        ((p2j0.g) p2j0Var).e.invoke();
    }

    @Override // xsna.gk6
    public final OneVideoPlayer.c v() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a.b w(int i, p2j0 p2j0Var) {
        String sb;
        ?? r8;
        ?? r3;
        Integer valueOf = Integer.valueOf(R.drawable.one_video_icon_settings_outline_28);
        OneVideoPlayer oneVideoPlayer = this.v;
        List<one.video.player.tracks.c> k0 = oneVideoPlayer.k0();
        if (k0.isEmpty() && !oneVideoPlayer.F().isEmpty()) {
            return new a.b(i, false, p2j0.h.a, valueOf, getContext().getString(R.string.one_video_playback_quality), getContext().getString(R.string.one_video_playback_quality_audio_only));
        }
        String string = getContext().getString(R.string.one_video_playback_quality);
        if (p2j0Var instanceof p2j0.b) {
            ?? r13 = oneVideoPlayer.J() != null;
            if (r13 == false) {
                hk0 P = oneVideoPlayer.P();
                AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval = AdaptiveTrackSelectionInterval.LOW;
                if (P.a == (adaptiveTrackSelectionInterval != null ? adaptiveTrackSelectionInterval.i() : null) && P.b == adaptiveTrackSelectionInterval.h()) {
                    r8 = true;
                    if (r13 == false) {
                        hk0 P2 = oneVideoPlayer.P();
                        AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval2 = AdaptiveTrackSelectionInterval.HIGH;
                        if (P2.a == (adaptiveTrackSelectionInterval2 != null ? adaptiveTrackSelectionInterval2.i() : null) && P2.b == adaptiveTrackSelectionInterval2.h()) {
                            r3 = true;
                            one.video.player.tracks.c E = oneVideoPlayer.E();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(getContext().getString(r13 != false ? R.string.one_video_quality_extend_other : r8 != false ? R.string.one_video_quality_extend_low : r3 != false ? R.string.one_video_quality_extend_high : R.string.one_video_quality_extend_auto));
                            sb2.append(" · ");
                            sb2.append(nlt0.a(E, getContext()));
                            sb = sb2.toString();
                        }
                    }
                    r3 = false;
                    one.video.player.tracks.c E2 = oneVideoPlayer.E();
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append(getContext().getString(r13 != false ? R.string.one_video_quality_extend_other : r8 != false ? R.string.one_video_quality_extend_low : r3 != false ? R.string.one_video_quality_extend_high : R.string.one_video_quality_extend_auto));
                    sb22.append(" · ");
                    sb22.append(nlt0.a(E2, getContext()));
                    sb = sb22.toString();
                }
            }
            r8 = false;
            if (r13 == false) {
            }
            r3 = false;
            one.video.player.tracks.c E22 = oneVideoPlayer.E();
            StringBuilder sb222 = new StringBuilder();
            sb222.append(getContext().getString(r13 != false ? R.string.one_video_quality_extend_other : r8 != false ? R.string.one_video_quality_extend_low : r3 != false ? R.string.one_video_quality_extend_high : R.string.one_video_quality_extend_auto));
            sb222.append(" · ");
            sb222.append(nlt0.a(E22, getContext()));
            sb = sb222.toString();
        } else {
            one.video.player.tracks.c J = oneVideoPlayer.J();
            one.video.player.tracks.c E3 = oneVideoPlayer.E();
            ?? r132 = oneVideoPlayer.y() && oneVideoPlayer.k0().size() > 1 && J == null;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(nlt0.a(r132 == true ? null : E3, getContext()));
            if (r132 != false && E3 != null) {
                sb3.append(" (");
                sb3.append(nlt0.a(E3, getContext()));
                sb3.append(")");
            }
            sb = sb3.toString();
        }
        return new a.b(i, k0.size() > 1, p2j0Var, valueOf, string, sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [xsna.n1j0$a$b] */
    public final void x() {
        Object bVar;
        String valueOf;
        boolean z;
        Object obj;
        String str;
        String string;
        ListBuilder e = e43.e();
        Iterator it = this.y.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                ListBuilder g = e.g();
                androidx.recyclerview.widget.x xVar = this.t;
                (xVar != null ? xVar : null).submitList(g);
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            p2j0 p2j0Var = (p2j0) next;
            if (epx.f(p2j0Var, p2j0.h.a)) {
                bVar = w(i, p2j0Var);
            } else if (p2j0Var instanceof p2j0.b) {
                bVar = w(i, p2j0Var);
            } else {
                p2j0.e eVar = p2j0.e.a;
                boolean f = epx.f(p2j0Var, eVar);
                OneVideoPlayer oneVideoPlayer = this.v;
                if (f) {
                    if (oneVideoPlayer.Y().isEmpty()) {
                        string = getContext().getString(R.string.one_video_playback_subtitles_none);
                    } else {
                        one.video.player.tracks.b Q = oneVideoPlayer.Q();
                        Context context = getContext();
                        if (Q == null || (string = xx1.y(Q)) == null) {
                            string = context.getString(R.string.one_video_playback_subtitles_off);
                        }
                    }
                    bVar = new a.b(i, !r3.isEmpty(), eVar, Integer.valueOf(R.drawable.one_video_icon_subtitles_outline_28), getContext().getString(R.string.one_video_playback_subtitles), string);
                } else if (epx.f(p2j0Var, p2j0.a.a)) {
                    one.video.player.tracks.a M = oneVideoPlayer.M();
                    if (M != null) {
                        List<one.video.player.tracks.a> F = oneVideoPlayer.F();
                        if (F.size() <= 1) {
                            F = null;
                        }
                        if (F != null) {
                            Iterator it2 = F.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                } else {
                                    obj = it2.next();
                                    if (epx.f(((one.video.player.tracks.a) obj).b, M.b)) {
                                        break;
                                    }
                                }
                            }
                            one.video.player.tracks.a aVar = (one.video.player.tracks.a) obj;
                            if (aVar != null && (str = (String) pz4.a(getContext(), F).get(aVar.b)) != null) {
                                r5 = new a.b(i, true, p2j0.a.a, Integer.valueOf(R.drawable.one_video_icon_playlist_outline_28), getContext().getString(R.string.one_video_playback_audio), str);
                            }
                        }
                    }
                    bVar = r5;
                } else {
                    p2j0.d dVar = p2j0.d.a;
                    if (epx.f(p2j0Var, dVar)) {
                        Context context2 = getContext();
                        float b2 = oneVideoPlayer.b();
                        if (b2 == 1.0f) {
                            valueOf = context2.getString(R.string.one_video_playback_speed_normal);
                        } else {
                            int i3 = (int) b2;
                            valueOf = b2 - ((float) i3) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? String.valueOf(i3) : String.valueOf(b2);
                        }
                        sht0 j = oneVideoPlayer.j();
                        if (j instanceof qsk) {
                            if (oneVideoPlayer.o()) {
                                int i4 = wn80.a;
                            }
                        } else if ((j == null || !j.c) && j != null && oneVideoPlayer.p0().length != 0) {
                            z = true;
                            bVar = new a.b(i, z, dVar, Integer.valueOf(R.drawable.one_video_icon_play_speed_outline_28), getContext().getString(R.string.one_video_playback_speed), valueOf);
                        }
                        z = false;
                        bVar = new a.b(i, z, dVar, Integer.valueOf(R.drawable.one_video_icon_play_speed_outline_28), getContext().getString(R.string.one_video_playback_speed), valueOf);
                    } else {
                        p2j0.f fVar = p2j0.f.a;
                        if (epx.f(p2j0Var, fVar)) {
                            bVar = new a.b(i, oneVideoPlayer.k0().size() > 1, fVar, Integer.valueOf(R.drawable.one_video_icon_smartphone_outline_28), getContext().getString(R.string.one_video_traffic_saving), getContext().getString(oneVideoPlayer.P().b == hk0.e.b ? R.string.one_video_traffic_saving_disabled : R.string.one_video_traffic_saving_enabled));
                        } else if (p2j0Var instanceof p2j0.c) {
                            p2j0.c cVar = (p2j0.c) p2j0Var;
                            cVar.getClass();
                            bVar = new a.C3380a(i, cVar, null, null, false);
                        } else {
                            if (!(p2j0Var instanceof p2j0.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            p2j0.g gVar = (p2j0.g) p2j0Var;
                            bVar = new a.b(i, gVar.d, gVar, gVar.c, gVar.a, gVar.b);
                        }
                    }
                }
            }
            if (bVar != null) {
                e.add(bVar);
            }
            i = i2;
        }
    }
}
