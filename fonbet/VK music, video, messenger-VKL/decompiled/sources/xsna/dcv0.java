package xsna;

/* compiled from: VkPayWalletAuthMethod.kt */
/* loaded from: classes6.dex */
public final class dcv0 extends de {
    public final String b;

    public dcv0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dcv0) && epx.f(this.b, ((dcv0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VkPayWalletBiometricAuth(token="), this.b, ')');
    }
}
