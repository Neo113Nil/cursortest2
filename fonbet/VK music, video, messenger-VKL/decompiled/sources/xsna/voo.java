package xsna;

import android.graphics.Shader;

/* compiled from: SearchPlaylistCard.kt */
/* loaded from: classes16.dex */
public final class voo extends n4j0 {
    public final long d;
    public final wp40 e;

    public voo() {
        throw null;
    }

    public voo(long j, wp40 wp40Var) {
        this.d = j;
        this.e = wp40Var;
    }

    @Override // xsna.n4j0
    public final Shader c(long j) {
        long c = l5g.c(14, this.d, ((Number) this.e.invoke()).floatValue());
        return jcr.a(0L, 0L, e43.l(new l5g(c), new l5g(c)), null, 0);
    }
}
