package xsna;

import java.util.LinkedHashSet;

/* compiled from: InformerControllerImpl.kt */
/* loaded from: classes.dex */
public final class sww implements qww {
    public final LinkedHashSet a = new LinkedHashSet();
    public volatile boolean b;

    @Override // xsna.qww
    public final void a(uww uwwVar) {
        this.a.add(uwwVar);
        uwwVar.a(this.b);
    }

    @Override // xsna.qww
    public final void b(uww uwwVar) {
        this.a.remove(uwwVar);
    }

    @Override // xsna.qww
    public final void setVisibility(boolean z) {
        if (this.b != z) {
            this.b = z;
            i0q0.f(new rww(this, z, 0));
        }
    }
}
