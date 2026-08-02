package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dlq0 implements flq0 {
    public final CharSequence a;

    public dlq0(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlq0) && jl40.l(this.a, ((dlq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "DisabledFooterState(disabledButtonText=", Extension.C_BRAKE);
    }
}
