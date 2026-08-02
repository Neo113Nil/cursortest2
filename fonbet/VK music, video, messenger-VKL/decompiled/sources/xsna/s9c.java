package xsna;

/* compiled from: JobSupport.kt */
/* loaded from: classes11.dex */
public final class s9c extends jyx implements r9c {
    public final pyx f;

    public s9c(pyx pyxVar) {
        this.f = pyxVar;
    }

    @Override // xsna.r9c
    public final boolean a(Throwable th) {
        pyx pyxVar = this.e;
        if (pyxVar == null) {
            pyxVar = null;
        }
        return pyxVar.S(th);
    }

    @Override // xsna.r9c
    public final eyx getParent() {
        pyx pyxVar = this.e;
        if (pyxVar != null) {
            return pyxVar;
        }
        return null;
    }

    @Override // xsna.jyx
    public final boolean h() {
        return true;
    }

    @Override // xsna.jyx
    public final void i(Throwable th) {
        pyx pyxVar = this.e;
        if (pyxVar == null) {
            pyxVar = null;
        }
        this.f.M(pyxVar);
    }
}
