package xsna;

import com.vk.superapp.api.dto.qr.ModalAuthFlowType;

/* compiled from: QrInfoResponse.kt */
/* loaded from: classes6.dex */
public final class n55 {
    public final String a;
    public final h6m b;
    public final mlc c;
    public final ModalAuthFlowType d;
    public final String e;

    public n55(String str, h6m h6mVar, mlc mlcVar, ModalAuthFlowType modalAuthFlowType, String str2) {
        this.a = str;
        this.b = h6mVar;
        this.c = mlcVar;
        this.d = modalAuthFlowType;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n55)) {
            return false;
        }
        n55 n55Var = (n55) obj;
        return epx.f(this.a, n55Var.a) && epx.f(this.b, n55Var.b) && epx.f(this.c, n55Var.c) && this.d == n55Var.d && epx.f(this.e, n55Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        mlc mlcVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (mlcVar == null ? 0 : mlcVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthInfo(domain=");
        sb.append(this.a);
        sb.append(", device=");
        sb.append(this.b);
        sb.append(", clientInfo=");
        sb.append(this.c);
        sb.append(", flowType=");
        sb.append(this.d);
        sb.append(", authId=");
        return ho8.a(sb, this.e, ')');
    }
}
