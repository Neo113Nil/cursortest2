package xsna;

/* compiled from: LauncherIconAvailabilityConfig.kt */
/* loaded from: classes.dex */
public final class vmy {
    public final v1v0 a;
    public final bb3 b;
    public final r63 c;
    public final hu2 d;
    public final db3 e;

    public vmy(v1v0 v1v0Var, bb3 bb3Var, r63 r63Var, hu2 hu2Var, db3 db3Var) {
        this.a = v1v0Var;
        this.b = bb3Var;
        this.c = r63Var;
        this.d = hu2Var;
        this.e = db3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmy)) {
            return false;
        }
        vmy vmyVar = (vmy) obj;
        return this.a.equals(vmyVar.a) && this.b.equals(vmyVar.b) && this.c.equals(vmyVar.c) && this.d.equals(vmyVar.d) && this.e.equals(vmyVar.e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LauncherIconAvailabilityConfig(iconList=" + this.a + ", minApiVersion=" + this.b + ", launchersWhiteList=" + this.c + ", enabledStoreMask=" + this.d + ", onAvailabilityUpdate=" + this.e + ", canChangeIconInBackground=true)";
    }
}
