package xsna;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlaybackException;

/* compiled from: RendererHolder.java */
/* loaded from: classes12.dex */
public final class czf0 {
    public final androidx.media3.exoplayer.j a;
    public final int b;

    @Nullable
    public final androidx.media3.exoplayer.j c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public czf0(androidx.media3.exoplayer.j jVar, @Nullable androidx.media3.exoplayer.j jVar2, int i) {
        this.a = jVar;
        this.b = i;
        this.c = jVar2;
    }

    public static boolean g(androidx.media3.exoplayer.j jVar) {
        return jVar.getState() != 0;
    }

    public static void k(androidx.media3.exoplayer.j jVar, long j) {
        jVar.setCurrentStreamFinal();
        if (jVar instanceof uko0) {
            uko0 uko0Var = (uko0) jVar;
            fxc0.z(uko0Var.o);
            uko0Var.L = j;
        }
    }

    public final void a(androidx.media3.exoplayer.j jVar, gil gilVar) {
        fxc0.z(this.a == jVar || this.c == jVar);
        if (g(jVar)) {
            if (jVar == gilVar.d) {
                gilVar.e = null;
                gilVar.d = null;
                gilVar.f = true;
            }
            if (jVar.getState() == 2) {
                jVar.stop();
            }
            jVar.disable();
        }
    }

    public final int b() {
        boolean g = g(this.a);
        androidx.media3.exoplayer.j jVar = this.c;
        return (g ? 1 : 0) + ((jVar == null || !g(jVar)) ? 0 : 1);
    }

    @Nullable
    public final androidx.media3.exoplayer.j c(@Nullable et10 et10Var) {
        if (et10Var == null) {
            return null;
        }
        m0h0[] m0h0VarArr = et10Var.c;
        int i = this.b;
        if (m0h0VarArr[i] == null) {
            return null;
        }
        androidx.media3.exoplayer.j jVar = this.a;
        if (jVar.getStream() == m0h0VarArr[i]) {
            return jVar;
        }
        androidx.media3.exoplayer.j jVar2 = this.c;
        if (jVar2 == null || jVar2.getStream() != m0h0VarArr[i]) {
            return null;
        }
        return jVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r9.e() >= r1.e()) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(et10 et10Var, @Nullable androidx.media3.exoplayer.j jVar) {
        if (jVar != null) {
            m0h0[] m0h0VarArr = et10Var.c;
            int i = this.b;
            m0h0 m0h0Var = m0h0VarArr[i];
            if (jVar.getStream() != null) {
                if (jVar.getStream() == m0h0Var) {
                    if (m0h0Var != null && !jVar.hasReadStreamToEnd()) {
                        et10 et10Var2 = et10Var.m;
                        if (et10Var.g.g) {
                            if (et10Var2 != null) {
                                if (et10Var2.e) {
                                    if (!(jVar instanceof uko0)) {
                                        if (!(jVar instanceof wi20)) {
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
                et10 et10Var3 = et10Var.m;
                if (et10Var3 == null || et10Var3.c[i] != jVar.getStream()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean e() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public final boolean f() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return g(this.a);
        }
        androidx.media3.exoplayer.j jVar = this.c;
        jVar.getClass();
        return jVar.getState() != 0;
    }

    public final void h(boolean z) {
        if (z) {
            if (this.e) {
                this.a.reset();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            androidx.media3.exoplayer.j jVar = this.c;
            jVar.getClass();
            jVar.reset();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int i(@Nullable androidx.media3.exoplayer.j jVar, et10 et10Var, ehp0 ehp0Var, gil gilVar) throws ExoPlaybackException {
        androidx.media3.exoplayer.j jVar2;
        int i;
        if (jVar == null || jVar.getState() == 0 || (jVar == (jVar2 = this.a) && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (jVar == this.c && this.d == 3) {
            return 1;
        }
        m0h0 stream = jVar.getStream();
        m0h0[] m0h0VarArr = et10Var.c;
        int i2 = this.b;
        Object[] objArr = stream != m0h0VarArr[i2];
        boolean b = ehp0Var.b(i2);
        if (!b || objArr != false) {
            if (!jVar.isCurrentStreamFinal()) {
                d7q d7qVar = ehp0Var.c[i2];
                int length = d7qVar != null ? d7qVar.length() : 0;
                androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[length];
                for (int i3 = 0; i3 < length; i3++) {
                    d7qVar.getClass();
                    aVarArr[i3] = d7qVar.getFormat(i3);
                }
                m0h0 m0h0Var = et10Var.c[i2];
                m0h0Var.getClass();
                jVar.i(aVarArr, m0h0Var, et10Var.e(), et10Var.p, et10Var.g.a);
                return 3;
            }
            if (!jVar.isEnded()) {
                return 0;
            }
            a(jVar, gilVar);
            if (!b || e()) {
                h(jVar == jVar2);
                return 1;
            }
        }
        return 1;
    }

    public final void j() {
        if (!g(this.a)) {
            h(true);
        }
        androidx.media3.exoplayer.j jVar = this.c;
        if (jVar == null || jVar.getState() != 0) {
            return;
        }
        h(false);
    }

    public final void l() throws ExoPlaybackException {
        androidx.media3.exoplayer.j jVar = this.a;
        if (jVar.getState() == 1 && this.d != 4) {
            jVar.start();
            return;
        }
        androidx.media3.exoplayer.j jVar2 = this.c;
        if (jVar2 == null || jVar2.getState() != 1 || this.d == 3) {
            return;
        }
        jVar2.start();
    }
}
