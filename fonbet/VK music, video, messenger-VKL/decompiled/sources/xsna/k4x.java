package xsna;

import xsna.q630;

/* compiled from: WindowInsetsPadding.kt */
/* loaded from: classes11.dex */
public abstract class k4x extends q630.c implements npp0 {
    public zpx0 p;
    public zpx0 q;

    public k4x() {
        anr anrVar = ao8.e;
        this.p = anrVar;
        this.q = anrVar;
    }

    @Override // xsna.q630.c
    public void a2() {
        hr80.H(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new j4x(this, 0));
        j2();
    }

    @Override // xsna.q630.c
    public void b2() {
        this.q = this.p;
        hr80.J(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new o3w(this, 1));
    }

    @Override // xsna.q630.c
    public final void c2() {
        this.p = ao8.e;
    }

    @Override // xsna.npp0
    public final Object g0() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    public abstract zpx0 i2(zpx0 zpx0Var);

    public void j2() {
        this.q = i2(this.p);
        hr80.J(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new o3w(this, 1));
    }
}
