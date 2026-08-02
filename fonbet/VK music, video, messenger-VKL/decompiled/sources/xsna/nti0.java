package xsna;

import java.io.File;
import xsna.j5k;
import xsna.mti0;

/* compiled from: SessionFilesProvider.java */
/* loaded from: classes13.dex */
public final class nti0 implements fw50 {
    public final mti0 a;

    public nti0(mti0 mti0Var) {
        this.a = mti0Var;
    }

    @Override // xsna.fw50
    public final j5k.a a() {
        mti0.b bVar = this.a.a;
        if (bVar != null) {
            return bVar.b;
        }
        return null;
    }

    @Override // xsna.fw50
    public final File b() {
        return this.a.a.a;
    }

    @Override // xsna.fw50
    public final File c() {
        return this.a.c;
    }

    @Override // xsna.fw50
    public final File d() {
        return this.a.b;
    }

    @Override // xsna.fw50
    public final File e() {
        return this.a.e;
    }

    @Override // xsna.fw50
    public final File f() {
        return this.a.d;
    }

    @Override // xsna.fw50
    public final File g() {
        return this.a.f;
    }
}
