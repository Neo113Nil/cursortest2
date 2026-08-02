package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class e64 extends kzn {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public e64(int i, int i2, List list, List list2) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            ny61.t("Null audioProfiles");
            throw null;
        }
        this.c = list;
        if (list2 != null) {
            this.d = list2;
        } else {
            ny61.t("Null videoProfiles");
            throw null;
        }
    }

    @Override // defpackage.mzn
    public final int a() {
        return this.b;
    }

    @Override // defpackage.mzn
    public final List b() {
        return this.c;
    }

    @Override // defpackage.mzn
    public final int c() {
        return this.a;
    }

    @Override // defpackage.mzn
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kzn) {
            e64 e64Var = (e64) ((kzn) obj);
            if (this.a == e64Var.a && this.b == e64Var.b && this.c.equals(e64Var.c) && this.d.equals(e64Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.a);
        sb.append(", recommendedFileFormat=");
        sb.append(this.b);
        sb.append(", audioProfiles=");
        sb.append(this.c);
        sb.append(", videoProfiles=");
        return ly3.s(sb, this.d, "}");
    }
}
