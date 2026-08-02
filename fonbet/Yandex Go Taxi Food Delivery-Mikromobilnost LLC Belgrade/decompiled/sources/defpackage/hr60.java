package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class hr60 implements ig5 {
    public static final gr60 Companion = new gr60();
    public static final i3y[] f;
    public final String a;
    public final String b;
    public final String c;
    public final vm50 d;
    public final vm50 e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new oi60(8)), a.b(lazyThreadSafetyMode, new oi60(9))};
    }

    public /* synthetic */ hr60(int i, String str, String str2, String str3, vm50 vm50Var, vm50 vm50Var2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, fr60.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = vm50Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = vm50Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr60)) {
            return false;
        }
        hr60 hr60Var = (hr60) obj;
        return jl40.l(this.a, hr60Var.a) && jl40.l(this.b, hr60Var.b) && jl40.l(this.c, hr60Var.c) && jl40.l(this.d, hr60Var.d) && jl40.l(this.e, hr60Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        vm50 vm50Var = this.d;
        int hashCode2 = (hashCode + (vm50Var == null ? 0 : vm50Var.hashCode())) * 31;
        vm50 vm50Var2 = this.e;
        return hashCode2 + (vm50Var2 != null ? vm50Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ObtainAuthAction(id=", this.a, ", token=", this.b, ", customVariableName=");
        v.append(this.c);
        v.append(", onError=");
        v.append(this.d);
        v.append(", onSuccess=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
