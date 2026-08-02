package xsna;

import xsna.uyl0;
import xsna.vyl0;

/* compiled from: StoryBaseDialogPresenter.kt */
/* loaded from: classes16.dex */
public abstract class xyl0<P extends uyl0, V extends vyl0<P>> implements uyl0 {
    public final tyl0 b;
    public io.reactivex.rxjava3.disposables.b c;

    public xyl0(tyl0 tyl0Var) {
        this.b = tyl0Var;
    }

    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        if (this.c == null) {
            this.c = new io.reactivex.rxjava3.disposables.b();
        }
        this.c.b(cVar);
    }

    @Override // xsna.uyl0
    public void onStop() {
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // xsna.cc6
    public void onPause() {
    }

    @Override // xsna.cc6
    public void onResume() {
    }
}
