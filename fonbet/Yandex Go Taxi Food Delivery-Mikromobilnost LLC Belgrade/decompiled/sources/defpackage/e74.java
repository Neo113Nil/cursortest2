package defpackage;

/* loaded from: classes10.dex */
public final class e74 {
    public final int a;
    public final yq7 b;

    public e74(int i, yq7 yq7Var) {
        this.a = i;
        if (yq7Var != null) {
            this.b = yq7Var;
        } else {
            ny61.t("Null cameraIdentifier");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e74) {
            e74 e74Var = (e74) obj;
            if (this.a == e74Var.a && this.b.equals(e74Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.a + ", cameraIdentifier=" + this.b + "}";
    }
}
