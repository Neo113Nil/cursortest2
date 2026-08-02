package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bls implements dls {
    public final int a;

    public /* synthetic */ bls(int i) {
        this.a = i;
    }

    public static final /* synthetic */ bls a(int i) {
        return new bls(i);
    }

    public final /* synthetic */ int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bls) {
            return this.a == ((bls) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "Local(iconId=", Extension.C_BRAKE);
    }
}
