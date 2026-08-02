package defpackage;

import android.net.Uri;

/* loaded from: classes10.dex */
public final class hg90 implements pyy {
    public final long a = uwy.f.getAndIncrement();
    public final npg b;
    public final int c;
    public final x7u0 w;
    public final gg90 x;
    public volatile Object y;

    public hg90(kpg kpgVar, npg npgVar, int i, gg90 gg90Var) {
        this.w = new x7u0(kpgVar);
        this.b = npgVar;
        this.c = i;
        this.x = gg90Var;
    }

    @Override // defpackage.pyy
    public final void d() {
    }

    @Override // defpackage.pyy
    public final void load() {
        this.w.b = 0L;
        lpg lpgVar = new lpg(this.w, this.b);
        try {
            lpgVar.a();
            Uri inflatedUri = this.w.a.getInflatedUri();
            inflatedUri.getClass();
            this.y = this.x.parse(inflatedUri, lpgVar);
        } finally {
            tw21.g(lpgVar);
        }
    }
}
