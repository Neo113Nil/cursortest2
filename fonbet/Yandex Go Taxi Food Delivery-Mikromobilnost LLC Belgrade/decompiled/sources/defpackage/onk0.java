package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class onk0 implements zjk0 {
    public final String a;
    public final int b;
    public final akk0 c;

    public onk0(String str, int i) {
        this.a = str;
        this.b = i;
        wrs0.a.getClass();
        this.c = vrs0.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onk0)) {
            return false;
        }
        onk0 onk0Var = (onk0) obj;
        return this.a.equals(onk0Var.a) && this.b == onk0Var.b;
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.c;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "RideCardSpacerVerticalItemUiState(id=", this.a, ", height=", Extension.C_BRAKE);
    }
}
