package yads;

import android.net.Uri;
import java.io.Closeable;

/* loaded from: classes10.dex */
public final class my2 extends bt2 {
    public final /* synthetic */ p30 i;
    public final /* synthetic */ u30 j;
    public final /* synthetic */ qy2 k;

    public my2(qy2 qy2Var, rr rrVar, u30 u30Var) {
        this.k = qy2Var;
        this.i = rrVar;
        this.j = u30Var;
    }

    @Override // yads.bt2
    public final Object b() {
        qc2 qc2Var;
        p30 p30Var = this.i;
        qc2Var = this.k.b;
        u30 u30Var = this.j;
        v43 v43Var = new v43(p30Var);
        wg1.a.getAndIncrement();
        v43Var.b = 0L;
        r30 r30Var = new r30(v43Var, u30Var);
        try {
            r30Var.a.a(r30Var.b);
            r30Var.d = true;
            Uri uri = v43Var.a.getUri();
            uri.getClass();
            Object a = qc2Var.a(uri, r30Var);
            mc3.a((Closeable) r30Var);
            a.getClass();
            return (ev0) a;
        } catch (Throwable th) {
            mc3.a((Closeable) r30Var);
            throw th;
        }
    }
}
