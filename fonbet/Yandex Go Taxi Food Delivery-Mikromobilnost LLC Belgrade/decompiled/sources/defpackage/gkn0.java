package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gkn0 implements ikn0 {
    public final CharSequence a;

    public /* synthetic */ gkn0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gkn0) {
            return jl40.l(this.a, ((gkn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "TextSourceCharSequence(text=", Extension.C_BRAKE);
    }
}
