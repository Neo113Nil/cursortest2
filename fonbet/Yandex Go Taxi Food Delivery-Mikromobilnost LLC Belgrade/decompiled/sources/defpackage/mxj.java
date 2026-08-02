package defpackage;

import java.io.File;

/* loaded from: classes10.dex */
public final class mxj {
    public final pxj a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ eyj d;

    public mxj(eyj eyjVar, pxj pxjVar) {
        this.d = eyjVar;
        this.a = pxjVar;
        this.b = pxjVar.e ? null : new boolean[eyjVar.z];
    }

    public final void a() {
        eyj.a(this.d, this, false);
    }

    public final File d() {
        File file;
        synchronized (this.d) {
            try {
                pxj pxjVar = this.a;
                if (pxjVar.f != this) {
                    throw new IllegalStateException();
                }
                if (!pxjVar.e) {
                    this.b[0] = true;
                }
                file = pxjVar.d[0];
                this.d.a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }
}
