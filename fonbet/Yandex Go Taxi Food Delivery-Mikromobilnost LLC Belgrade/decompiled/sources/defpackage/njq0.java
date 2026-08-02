package defpackage;

import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class njq0 implements wjq0 {
    public final mjq0 a;
    public final eh01 b;
    public final PhoneInputSource c;

    public njq0(mjq0 mjq0Var, eh01 eh01Var, PhoneInputSource phoneInputSource) {
        this.a = mjq0Var;
        this.b = eh01Var;
        this.c = phoneInputSource;
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njq0)) {
            return false;
        }
        njq0 njq0Var = (njq0) obj;
        return this.a.equals(njq0Var.a) && jl40.l(this.b, njq0Var.b) && this.c == njq0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PhoneTransfer(transferTarget=" + this.a + ", fromCircleButton=" + this.b + ", phoneInputSource=" + this.c + Extension.C_BRAKE;
    }
}
