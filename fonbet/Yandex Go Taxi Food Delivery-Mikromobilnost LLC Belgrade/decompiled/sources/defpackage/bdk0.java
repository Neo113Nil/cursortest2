package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bdk0 implements zjk0, kjk0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final akk0 d;

    public bdk0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = qpa1.e(str2, arrayList, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdk0)) {
            return false;
        }
        bdk0 bdk0Var = (bdk0) obj;
        return jl40.l(this.a, bdk0Var.a) && jl40.l(this.b, bdk0Var.b) && this.c.equals(bdk0Var.c);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.d;
    }

    @Override // defpackage.kjk0
    public final List getChildren() {
        return this.c;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, b64.v("RideCardButtonsUiState(id=", this.a, ", analyticsId=", this.b, ", children="), this.c);
    }
}
