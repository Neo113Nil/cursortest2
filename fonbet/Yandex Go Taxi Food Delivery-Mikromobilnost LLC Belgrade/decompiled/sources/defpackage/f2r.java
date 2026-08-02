package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class f2r implements bfx {
    public final bfx a;
    public final LinkedHashMap b = new LinkedHashMap();

    public f2r(bfx bfxVar) {
        this.a = bfxVar;
    }

    @Override // defpackage.bfx
    public final bfx A1(String str) {
        this.a.A1(str);
        return this;
    }

    @Override // defpackage.bfx
    public final bfx X0(long j) {
        this.a.X0(j);
        return this;
    }

    @Override // defpackage.bfx
    public final bfx Y0(int i) {
        this.a.Y0(i);
        return this;
    }

    @Override // defpackage.bfx
    public final bfx Z0(double d) {
        this.a.Z0(d);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.bfx
    public final String getPath() {
        return this.a.getPath();
    }

    @Override // defpackage.bfx
    public final bfx j() {
        this.a.j();
        return this;
    }

    @Override // defpackage.bfx
    public final bfx k2() {
        this.a.k2();
        return this;
    }

    @Override // defpackage.bfx
    public final bfx l() {
        this.a.l();
        return this;
    }

    @Override // defpackage.bfx
    public final bfx n1(boolean z) {
        this.a.n1(z);
        return this;
    }

    @Override // defpackage.bfx
    public final bfx o0(hdx hdxVar) {
        this.a.o0(hdxVar);
        return this;
    }

    @Override // defpackage.bfx
    public final bfx r0(String str) {
        this.a.r0(str);
        return this;
    }

    @Override // defpackage.bfx
    public final bfx u() {
        this.a.u();
        return this;
    }

    @Override // defpackage.bfx
    public final bfx value() {
        bfx bfxVar = this.a;
        this.b.put(bfxVar.getPath(), null);
        bfxVar.k2();
        return this;
    }

    @Override // defpackage.bfx
    public final bfx y() {
        this.a.y();
        return this;
    }
}
