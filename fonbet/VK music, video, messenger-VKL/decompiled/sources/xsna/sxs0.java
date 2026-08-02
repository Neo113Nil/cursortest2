package xsna;

/* compiled from: VideoMuteSyncedSettings.kt */
/* loaded from: classes2.dex */
public final class sxs0 implements ri50 {
    public final pey a;
    public boolean b = true;

    public sxs0(pey peyVar) {
        this.a = peyVar;
    }

    @Override // xsna.ri50
    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            this.a.invoke(Boolean.valueOf(z));
        }
    }

    @Override // xsna.ri50
    public final boolean b() {
        return this.b;
    }

    @Override // xsna.ri50
    public final void c(boolean z) {
        if (this.b != z) {
            this.b = z;
            this.a.invoke(Boolean.valueOf(z));
        }
    }

    @Override // xsna.ri50
    public final boolean d() {
        return this.b;
    }
}
