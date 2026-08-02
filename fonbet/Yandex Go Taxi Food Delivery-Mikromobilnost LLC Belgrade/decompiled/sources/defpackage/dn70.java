package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dn70 implements fn70 {
    public final p301 a;

    public /* synthetic */ dn70(p301 p301Var) {
        this.a = p301Var;
    }

    public static final /* synthetic */ dn70 a(p301 p301Var) {
        return new dn70(p301Var);
    }

    public final /* synthetic */ p301 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dn70) {
            return this.a.equals(((dn70) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Timeline(uiState=" + this.a + Extension.C_BRAKE;
    }
}
