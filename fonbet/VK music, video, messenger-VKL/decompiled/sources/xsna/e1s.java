package xsna;

import xsna.stl;

/* compiled from: FoldersMediatorUpdateDelegate.kt */
/* loaded from: classes18.dex */
public final class e1s implements stl.a {
    public final cfl b;

    public e1s(cfl cflVar) {
        this.b = cflVar;
    }

    @Override // xsna.ggz
    public final void onChanged(int i, int i2, Object obj) {
        this.b.invoke();
    }

    @Override // xsna.ggz
    public final void onInserted(int i, int i2) {
        this.b.invoke();
    }

    @Override // xsna.ggz
    public final void onMoved(int i, int i2) {
        this.b.invoke();
    }

    @Override // xsna.ggz
    public final void onRemoved(int i, int i2) {
        this.b.invoke();
    }
}
