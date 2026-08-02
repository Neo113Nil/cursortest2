package xsna;

import android.graphics.Bitmap;

/* compiled from: KeepLastFrameCache.kt */
/* loaded from: classes12.dex */
public final class ycy implements dc7 {
    public final /* synthetic */ int b;
    public int c;
    public Object d;

    public ycy(String str, int i) {
        this.b = 1;
        this.d = str;
        this.c = i;
    }

    @Override // xsna.dc7
    public synchronized void b(int i, uvf uvfVar) {
        try {
            if (((uvf) this.d) != null) {
                Object r = uvfVar.r();
                uvf uvfVar2 = (uvf) this.d;
                if (r.equals(uvfVar2 != null ? (Bitmap) uvfVar2.r() : null)) {
                    return;
                }
            }
            uvf.q((uvf) this.d);
            this.d = uvfVar.n();
            this.c = i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.dc7
    public synchronized uvf c() {
        return uvf.o((uvf) this.d);
    }

    @Override // xsna.dc7
    public synchronized void clear() {
        f();
    }

    @Override // xsna.dc7
    public synchronized uvf d() {
        try {
        } finally {
            f();
        }
        return uvf.o((uvf) this.d);
    }

    @Override // xsna.dc7
    public synchronized boolean e(int i) {
        boolean z;
        if (i == this.c) {
            z = uvf.t((uvf) this.d);
        }
        return z;
    }

    public synchronized void f() {
        uvf.q((uvf) this.d);
        this.d = null;
        this.c = -1;
    }

    @Override // xsna.dc7
    public synchronized uvf g(int i) {
        return this.c == i ? uvf.o((uvf) this.d) : null;
    }

    public String toString() {
        switch (this.b) {
            case 1:
                return (String) this.d;
            default:
                return super.toString();
        }
    }

    @Override // xsna.dc7
    public synchronized int u() {
        uvf uvfVar;
        uvfVar = (uvf) this.d;
        return uvfVar == null ? 0 : id7.d((Bitmap) uvfVar.r());
    }

    public ycy(int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = -1;
                this.d = "none";
                break;
            default:
                this.c = -1;
                break;
        }
    }

    @Override // xsna.dc7
    public void a(int i, uvf uvfVar) {
    }
}
