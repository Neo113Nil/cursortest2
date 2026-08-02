package xsna;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: JuliLogger.java */
/* loaded from: classes13.dex */
public final class rby extends q100 {
    public Logger a;

    @Override // xsna.q100
    public final void b(String str) {
        this.a.log(Level.FINE, str);
    }

    @Override // xsna.q100
    public final void c(String str) {
        this.a.log(Level.SEVERE, str);
    }

    @Override // xsna.q100
    public final void d(String str) {
        this.a.log(Level.WARNING, str);
    }
}
