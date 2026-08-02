package xsna;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class zr01 extends sa3 {
    public final int a;

    @Override // xsna.sa3
    public final boolean a() {
        return false;
    }

    @Override // xsna.sa3
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa3)) {
            return false;
        }
        sa3 sa3Var = (sa3) obj;
        return this.a == sa3Var.b() && !sa3Var.a();
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return tgw.b(this.a, "AppUpdateOptions{appUpdateType=", ", allowAssetPackDeletion=false}");
    }
}
