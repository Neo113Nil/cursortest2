package xsna;

/* compiled from: LayerDownloadSetting.kt */
/* loaded from: classes3.dex */
public final class fny {
    public final gny a;
    public final gny b;

    public fny(gny gnyVar, gny gnyVar2) {
        this.a = gnyVar;
        this.b = gnyVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fny)) {
            return false;
        }
        fny fnyVar = (fny) obj;
        return epx.f(this.a, fnyVar.a) && epx.f(this.b, fnyVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gny gnyVar = this.b;
        return Boolean.hashCode(false) + ((hashCode + (gnyVar == null ? 0 : gnyVar.hashCode())) * 31);
    }

    public final String toString() {
        return "LayerDownloadSetting(currentUserInfo=" + this.a + ", duetUserInfo=" + this.b + ", useDeepFakeWatermark=false)";
    }
}
