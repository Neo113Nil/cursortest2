package xsna;

/* compiled from: ClipCtaWithDonutMviEvent.kt */
/* loaded from: classes16.dex */
public final class kpc implements mpc {
    public final String a;

    public kpc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpc) && epx.f(this.a, ((kpc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("OpenMiniApp(miniAppLink="), this.a, ')');
    }
}
