package xsna;

import one.video.controls.view.seekbar.OneVideoSeekBarView;
import one.video.controls.view.state.Mode;
import one.video.controls20.SimpleControlsView;
import one.video.player.OneVideoPlayer;
import xsna.bu;

/* compiled from: SimpleControlsView.kt */
/* loaded from: classes8.dex */
public final class zpj0 implements OneVideoSeekBarView.a {
    public long a = -1;
    public long b = -1;
    public final /* synthetic */ i10 c;
    public final /* synthetic */ SimpleControlsView d;

    public zpj0(i10 i10Var, SimpleControlsView simpleControlsView) {
        this.c = i10Var;
        this.d = simpleControlsView;
    }

    @Override // one.video.controls.view.seekbar.OneVideoSeekBarView.a
    public final void a() {
        SimpleControlsView simpleControlsView = this.d;
        Mode mode = simpleControlsView.getCurrentState().a;
        Mode mode2 = Mode.SHOW_SEEK_PREVIEW;
        boolean z = false;
        boolean z2 = mode == mode2 && simpleControlsView.getControlsStyle().b;
        Mode mode3 = simpleControlsView.getCurrentState().a;
        i10 i10Var = this.c;
        if (mode3 == mode2) {
            i10Var.f(Mode.SHOW, true);
        }
        i10Var.c(bu.e.d.a);
        i10Var.d(i10Var.z.b, true);
        if (z2) {
            OneVideoPlayer player = simpleControlsView.getPlayer();
            if (player != null) {
                player.resume();
                return;
            }
            return;
        }
        OneVideoPlayer player2 = simpleControlsView.getPlayer();
        if (player2 == null) {
            return;
        }
        sht0 j = player2.j();
        if (j != null && j.c) {
            z = true;
        }
        player2.seekTo(z ? player2.o() ? this.b : this.b + player2.getDuration() : this.b);
    }

    @Override // one.video.controls.view.seekbar.OneVideoSeekBarView.a
    public final void b(sox soxVar, int i) {
        this.c.c(new bu.e.a(soxVar, i));
    }

    @Override // one.video.controls.view.seekbar.OneVideoSeekBarView.a
    public final void c(long j, boolean z) {
        OneVideoPlayer player;
        OneVideoPlayer player2;
        i10 i10Var = this.c;
        if (z) {
            this.b = j;
            if (this.a == -1) {
                this.a = j;
            }
            long abs = Math.abs(this.a - j);
            SimpleControlsView simpleControlsView = this.d;
            if (abs > 2000 && i10Var.u != null) {
                i10Var.f(Mode.SHOW_SEEK_PREVIEW, simpleControlsView.getCurrentState().a == Mode.SHOW);
                if (simpleControlsView.getControlsStyle().b && (player2 = simpleControlsView.getPlayer()) != null) {
                    player2.pause();
                }
            }
            if (simpleControlsView.getCurrentState().a == Mode.SHOW_SEEK_PREVIEW && simpleControlsView.getControlsStyle().b && (player = simpleControlsView.getPlayer()) != null) {
                player.seekTo(j);
            }
        } else {
            this.a = -1L;
            this.b = -1L;
        }
        i10Var.c(new bu.e.b(j));
    }

    @Override // one.video.controls.view.seekbar.OneVideoSeekBarView.a
    public final void d() {
        bu.e.c cVar = bu.e.c.a;
        i10 i10Var = this.c;
        i10Var.c(cVar);
        i10Var.d(i10Var.z.b, false);
        this.a = -1L;
    }
}
