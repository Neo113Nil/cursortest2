package xsna;

import androidx.annotation.NonNull;

/* compiled from: SettableImageProxy.java */
/* loaded from: classes11.dex */
public final class mzi0 extends l9s {
    public final ojw d;
    public final int e;
    public final int f;

    public mzi0(alw alwVar, ojw ojwVar, int i) {
        super(alwVar);
        this.e = super.getWidth();
        this.f = super.getHeight();
        this.d = ojwVar;
    }

    @Override // xsna.l9s, xsna.alw
    @NonNull
    public final ojw B() {
        return this.d;
    }

    @Override // xsna.l9s, xsna.alw
    public final synchronized int getHeight() {
        return this.f;
    }

    @Override // xsna.l9s, xsna.alw
    public final synchronized int getWidth() {
        return this.e;
    }
}
