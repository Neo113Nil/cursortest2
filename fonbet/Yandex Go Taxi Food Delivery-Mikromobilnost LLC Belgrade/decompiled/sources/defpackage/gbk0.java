package defpackage;

import com.adjust.sdk.Constants;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gbk0 implements ibk0 {
    public final hbk0 a;
    public final String b;

    public gbk0(hbk0 hbk0Var, String str) {
        this.a = hbk0Var;
        this.b = str;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return Constants.DEEPLINK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbk0)) {
            return false;
        }
        gbk0 gbk0Var = (gbk0) obj;
        return this.a.equals(gbk0Var.a) && jl40.l(this.b, gbk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeeplinkClicked(upsellActionInfo=" + this.a + ", deeplink=" + this.b + Extension.C_BRAKE;
    }
}
