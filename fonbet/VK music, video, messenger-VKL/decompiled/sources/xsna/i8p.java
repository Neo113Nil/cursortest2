package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: EducationParameterDialog.kt */
/* loaded from: classes5.dex */
public final class i8p implements nhl {
    public final /* synthetic */ Lifecycle b;
    public final /* synthetic */ b8p c;
    public final /* synthetic */ mnk d;

    public i8p(Lifecycle lifecycle, b8p b8pVar, mnk mnkVar) {
        this.b = lifecycle;
        this.c = b8pVar;
        this.d = mnkVar;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        this.b.removeObserver(this.c);
        this.d.b.removeObserver(this);
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
