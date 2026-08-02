package defpackage;

import com.yandex.delivery.attrbutedtext.api.TruncationMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class juy0 implements luy0 {
    public final CharSequence a;
    public final TruncationMode b;

    public juy0(CharSequence charSequence, TruncationMode truncationMode) {
        this.a = charSequence;
        this.b = truncationMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juy0)) {
            return false;
        }
        juy0 juy0Var = (juy0) obj;
        return jl40.l(this.a, juy0Var.a) && this.b == juy0Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        TruncationMode truncationMode = this.b;
        return hashCode + (truncationMode == null ? 0 : truncationMode.hashCode());
    }

    public final String toString() {
        return "Rich(content=" + ((Object) this.a) + ", truncationMode=" + this.b + Extension.C_BRAKE;
    }
}
