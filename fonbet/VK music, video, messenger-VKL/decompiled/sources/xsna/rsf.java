package xsna;

import xsna.uuf;

/* compiled from: ClipsWrapperOnboardingMviState.kt */
/* loaded from: classes17.dex */
public final class rsf implements km50, uuf.h {
    public final psf b;

    public rsf() {
        this(null);
    }

    @Override // xsna.uuf.h
    public final psf a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsf) && epx.f(this.b, ((rsf) obj).b);
    }

    public final int hashCode() {
        psf psfVar = this.b;
        if (psfVar == null) {
            return 0;
        }
        return psfVar.hashCode();
    }

    public final String toString() {
        return "ClipsWrapperOnboardingMviState(onboarding=" + this.b + ')';
    }

    public rsf(psf psfVar) {
        this.b = psfVar;
    }
}
