package xsna;

/* compiled from: SplashScreenConfig.kt */
/* loaded from: classes5.dex */
public final class wkk0 {
    public final boolean a;

    public wkk0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkk0)) {
            return false;
        }
        wkk0 wkk0Var = (wkk0) obj;
        wkk0Var.getClass();
        return this.a == wkk0Var.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + bh10.a(bh10.a(bh10.a(Boolean.hashCode(false) * 31, 31, 0L), 31, 0L), 31, 0L);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SplashScreenConfig(isFeatureEnabled=false, minDurationMillis=0, maxDurationMillis=0, maxSystemSplashScreenDurationMillis=0, isCatalogShimmersEnabled="), this.a, ')');
    }

    public wkk0(int i) {
        this.a = true;
    }
}
