package xsna;

import java.util.TimerTask;

/* compiled from: WriteBarCommentHolder.kt */
/* loaded from: classes7.dex */
public final class x0y0 extends TimerTask {
    public final /* synthetic */ y0y0 b;

    public x0y0(y0y0 y0y0Var) {
        this.b = y0y0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        pro0.f(new wcs0(this.b, 12));
    }
}
