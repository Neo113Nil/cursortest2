package xsna;

import xsna.b4p;
import xsna.p4p;

/* compiled from: MediaViewRenderer.kt */
/* loaded from: classes4.dex */
public final class p020 implements h5p<o020> {
    public final b4p b;

    public p020(b4p b4pVar) {
        this.b = b4pVar;
    }

    @Override // xsna.h5p
    public final Object f(i4p i4pVar, ota0 ota0Var, Integer num, g5p g5pVar, p4p.b bVar) {
        if (ota0Var != null) {
            return ota0Var;
        }
        o3p c = this.b.c(i4pVar.b, b4p.a.C2587a.e);
        if (c == null) {
            c = null;
        }
        if (c != null) {
            return c.c;
        }
        throw new IllegalStateException("Can't load original image!");
    }
}
