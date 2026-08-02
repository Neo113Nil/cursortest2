package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class khy0 implements lhy0 {
    public final Throwable a;

    public khy0(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.lhy0
    public final ygy0 a() {
        return null;
    }

    @Override // defpackage.lhy0
    public final ygy0 b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khy0) && this.a.equals(((khy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.m("UndefinedError(error=", Extension.C_BRAKE, this.a);
    }
}
