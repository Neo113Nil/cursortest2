package xsna;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class fhr extends wof0 {
    public final azz a;
    public final azz b;

    public fhr(azz azzVar, azz azzVar2) {
        this.a = azzVar;
        this.b = azzVar2;
    }

    public static fhr a(fhr fhrVar, azz azzVar, azz azzVar2, int i) {
        if ((i & 1) != 0) {
            azzVar = fhrVar.a;
        }
        if ((i & 2) != 0) {
            azzVar2 = fhrVar.b;
        }
        fhrVar.getClass();
        return new fhr(azzVar, azzVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhr)) {
            return false;
        }
        fhr fhrVar = (fhr) obj;
        return epx.f(this.a, fhrVar.a) && epx.f(this.b, fhrVar.b);
    }

    public final int hashCode() {
        azz azzVar = this.a;
        int hashCode = (azzVar == null ? 0 : azzVar.hashCode()) * 31;
        azz azzVar2 = this.b;
        return hashCode + (azzVar2 != null ? azzVar2.hashCode() : 0);
    }

    public final String toString() {
        return "FineLocationsState(networkLocationState=" + this.a + ", gpsLocationState=" + this.b + ")";
    }
}
