package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class j94 extends qo31 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final jzn e;
    public final lzn f;

    public j94(int i, int i2, List list, List list2, jzn jznVar, lzn lznVar) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            ny61.t("Null audioProfiles");
            throw null;
        }
        this.c = list;
        if (list2 == null) {
            ny61.t("Null videoProfiles");
            throw null;
        }
        this.d = list2;
        this.e = jznVar;
        if (lznVar != null) {
            this.f = lznVar;
        } else {
            ny61.t("Null defaultVideoProfile");
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

    @Override // defpackage.qo31
    public final jzn e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qo31)) {
            return false;
        }
        qo31 qo31Var = (qo31) obj;
        j94 j94Var = (j94) qo31Var;
        if (this.a != j94Var.a || this.b != j94Var.b || !this.c.equals(j94Var.c) || !this.d.equals(j94Var.d)) {
            return false;
        }
        jzn jznVar = this.e;
        if (jznVar == null) {
            if (qo31Var.e() != null) {
                return false;
            }
        } else if (!jznVar.equals(qo31Var.e())) {
            return false;
        }
        return this.f.equals(qo31Var.f());
    }

    @Override // defpackage.qo31
    public final lzn f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        jzn jznVar = this.e;
        return this.f.hashCode() ^ ((hashCode ^ (jznVar == null ? 0 : jznVar.hashCode())) * 1000003);
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + ", defaultAudioProfile=" + this.e + ", defaultVideoProfile=" + this.f + "}";
    }
}
