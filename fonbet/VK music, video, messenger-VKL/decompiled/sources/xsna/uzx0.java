package xsna;

/* compiled from: WrapperTransferListener.kt */
/* loaded from: classes8.dex */
public final class uzx0 implements mjp0 {
    public final androidx.media3.datasource.a a;
    public final mjp0 b;

    public uzx0(androidx.media3.datasource.a aVar, mjp0 mjp0Var) {
        this.a = aVar;
        this.b = mjp0Var;
    }

    @Override // xsna.mjp0
    public final void e(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        this.b.e(this.a, evkVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzx0)) {
            return false;
        }
        uzx0 uzx0Var = (uzx0) obj;
        return epx.f(this.a, uzx0Var.a) && epx.f(this.b, uzx0Var.b);
    }

    @Override // xsna.mjp0
    public final void f(androidx.media3.datasource.a aVar, evk evkVar, boolean z, int i) {
        this.b.f(this.a, evkVar, z, i);
    }

    @Override // xsna.mjp0
    public final void g(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        this.b.g(this.a, evkVar, z);
    }

    @Override // xsna.mjp0
    public final void h(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
        this.b.h(this.a, evkVar, z);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WrapperTransferListener(dataSource=" + this.a + ", listener=" + this.b + ")";
    }
}
