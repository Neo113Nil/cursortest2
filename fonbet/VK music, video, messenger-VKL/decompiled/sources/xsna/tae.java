package xsna;

import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.ClipsGridBlockAction;
import java.util.List;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;

/* compiled from: ClipsGridBlockAutoPlayListener.kt */
/* loaded from: classes17.dex */
public final class tae implements lih0 {
    public ace a;

    @Override // xsna.lih0
    public final void I(qi5 qi5Var, long j, long j2) {
        ace aceVar;
        if (qi5Var.a.isPaused()) {
            return;
        }
        if (((j2 <= 0 || 50 + j < j2) && j < 3000) || (aceVar = this.a) == null) {
            return;
        }
        aceVar.a.c.invoke(ClipsGridBlockAction.d.b);
    }

    @Override // xsna.lih0
    public final void J(qi5 qi5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        b(qi5Var);
    }

    @Override // xsna.lih0
    public final void L(qi5 qi5Var) {
        ace aceVar = this.a;
        if (aceVar != null) {
            yg5 yg5Var = qi5Var.a;
            aceVar.a(qi5Var, new k4b0(yg5Var.isPlaying(), yg5Var.J()));
        }
        ace aceVar2 = this.a;
        if (aceVar2 != null) {
            aceVar2.a.c.invoke(ClipsGridBlockAction.d.b);
        }
    }

    @Override // xsna.lih0
    public final void b(qi5 qi5Var) {
        ace aceVar = this.a;
        if (aceVar != null) {
            yg5 yg5Var = qi5Var.a;
            aceVar.a(qi5Var, new k4b0(yg5Var.isPlaying(), yg5Var.J()));
        }
    }

    @Override // xsna.lih0
    public final void d(qi5 qi5Var) {
        ace aceVar = this.a;
        if (aceVar != null) {
            yg5 yg5Var = qi5Var.a;
            aceVar.a(qi5Var, new k4b0(yg5Var.isPlaying(), yg5Var.J()));
        }
    }

    @Override // xsna.lih0
    public final void h(qi5 qi5Var) {
        ace aceVar = this.a;
        if (aceVar != null) {
            yg5 yg5Var = qi5Var.a;
            aceVar.a(qi5Var, new k4b0(yg5Var.isPlaying(), yg5Var.J()));
        }
    }

    @Override // xsna.lih0
    public final void c() {
    }

    @Override // xsna.lih0
    public final void u() {
    }

    @Override // xsna.lih0
    public final void x0() {
    }

    @Override // xsna.lih0
    public final void M(qi5 qi5Var) {
    }

    @Override // xsna.lih0
    public final void a(boolean z) {
    }

    @Override // xsna.lih0
    public final void e(qi5 qi5Var) {
    }

    @Override // xsna.lih0
    public final void f(qi5 qi5Var) {
    }

    @Override // xsna.lih0
    public final void g(qi5 qi5Var) {
    }

    @Override // xsna.lih0
    public final void onIsPlayingChanged(boolean z) {
    }

    @Override // xsna.lih0
    public final void q(List<? extends SubtitleRenderItem> list) {
    }

    @Override // xsna.lih0
    public final void H(long j, long j2) {
    }

    @Override // xsna.lih0
    public final void K(int i, int i2) {
    }
}
