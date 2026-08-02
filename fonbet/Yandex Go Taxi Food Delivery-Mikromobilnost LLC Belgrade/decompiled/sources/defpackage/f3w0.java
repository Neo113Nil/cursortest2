package defpackage;

import com.yandex.go.mainscreen.superapp.popup.data.state.FallbackAssistanceAppearReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class f3w0 implements g3w0 {
    public final String a;
    public final String b;
    public final e3w0 c;
    public final boolean d;
    public final e3w0 e;
    public final e3w0 f;
    public final FallbackAssistanceAppearReason g;

    public f3w0(String str, String str2, e3w0 e3w0Var, boolean z, e3w0 e3w0Var2, e3w0 e3w0Var3, FallbackAssistanceAppearReason fallbackAssistanceAppearReason) {
        this.a = str;
        this.b = str2;
        this.c = e3w0Var;
        this.d = z;
        this.e = e3w0Var2;
        this.f = e3w0Var3;
        this.g = fallbackAssistanceAppearReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3w0)) {
            return false;
        }
        f3w0 f3w0Var = (f3w0) obj;
        return jl40.l(this.a, f3w0Var.a) && jl40.l(this.b, f3w0Var.b) && jl40.l(this.c, f3w0Var.c) && this.d == f3w0Var.d && jl40.l(this.e, f3w0Var.e) && jl40.l(this.f, f3w0Var.f) && this.g == f3w0Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.e((this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Shown(title=", this.a, ", subtitle=", this.b, ", reloadButton=");
        v.append(this.c);
        v.append(", isReloadButtonShimmer=");
        v.append(this.d);
        v.append(", orderTaxiButton=");
        v.append(this.e);
        v.append(", orderTaxiByPhoneCallButton=");
        v.append(this.f);
        v.append(", appearReason=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
