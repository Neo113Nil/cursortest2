package yads;

import android.net.Uri;
import java.io.Closeable;

/* loaded from: classes10.dex */
public final class rc2 implements ch1 {
    public final long a;
    public final u30 b;
    public final int c;
    public final v43 d;
    public final qc2 e;
    public volatile Object f;

    public rc2(int i, p30 p30Var, u30 u30Var, qc2 qc2Var) {
        this.d = new v43(p30Var);
        this.b = u30Var;
        this.c = i;
        this.e = qc2Var;
        this.a = wg1.a();
    }

    @Override // yads.ch1
    public final void a() {
        this.d.b = 0L;
        r30 r30Var = new r30(this.d, this.b);
        try {
            r30Var.a.a(r30Var.b);
            r30Var.d = true;
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.a(uri, r30Var);
        } finally {
            mc3.a((Closeable) r30Var);
        }
    }

    public rc2(p30 p30Var, Uri uri, int i, qc2 qc2Var) {
        this(i, p30Var, new t30().a(uri).a(1).a(), qc2Var);
    }

    @Override // yads.ch1
    public final void b() {
    }
}
