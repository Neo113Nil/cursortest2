package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bn70 implements fn70 {
    public final CharSequence a;

    public /* synthetic */ bn70(CharSequence charSequence) {
        this.a = charSequence;
    }

    public static final /* synthetic */ bn70 a(String str) {
        return new bn70(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bn70) {
            return jl40.l(this.a, ((bn70) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "Text(value=", Extension.C_BRAKE);
    }
}
