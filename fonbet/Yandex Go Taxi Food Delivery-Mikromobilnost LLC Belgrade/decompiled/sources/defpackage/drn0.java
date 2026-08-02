package defpackage;

/* loaded from: classes13.dex */
public final class drn0 {
    public final int a;
    public final int b;
    public final int c;

    public drn0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!drn0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            drn0 drn0Var = (drn0) obj;
            return this.a == drn0Var.a && this.b == drn0Var.b && this.c == drn0Var.c;
        }
        ny61.t("null cannot be cast to non-null type com.yandex.go.scooters.ignition.domain.model.ScootersIgnitionOptionsStateHolder");
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
