package xsna;

import android.view.ViewTreeObserver;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes13.dex */
public final class yqr implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ com.google.android.material.floatingactionbutton.d b;

    public yqr(com.google.android.material.floatingactionbutton.d dVar) {
        this.b = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.google.android.material.floatingactionbutton.d dVar = this.b;
        float rotation = dVar.v.getRotation();
        if (dVar.o == rotation) {
            return true;
        }
        dVar.o = rotation;
        dVar.p();
        return true;
    }
}
