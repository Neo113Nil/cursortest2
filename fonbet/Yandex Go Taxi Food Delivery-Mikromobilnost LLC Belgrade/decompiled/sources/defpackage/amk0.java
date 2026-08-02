package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class amk0 implements zjk0 {
    public final String a;
    public final String b;
    public final xss0 c;
    public final zlk0 d;
    public final akk0 e;

    public amk0(String str, String str2, xss0 xss0Var, zlk0 zlk0Var) {
        this.a = str;
        this.b = str2;
        this.c = xss0Var;
        this.d = zlk0Var;
        this.e = qpa1.c(xss0Var, str2, EmptyList.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amk0)) {
            return false;
        }
        amk0 amk0Var = (amk0) obj;
        return jl40.l(this.a, amk0Var.a) && jl40.l(this.b, amk0Var.b) && jl40.l(this.c, amk0Var.c) && jl40.l(this.d, amk0Var.d);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.e;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        zlk0 zlk0Var = this.d;
        return hashCode2 + (zlk0Var != null ? zlk0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardProgressBarItemUiState(id=", this.a, ", analyticsId=", this.b, ", slotItemState=");
        v.append(this.c);
        v.append(", progressBar=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
