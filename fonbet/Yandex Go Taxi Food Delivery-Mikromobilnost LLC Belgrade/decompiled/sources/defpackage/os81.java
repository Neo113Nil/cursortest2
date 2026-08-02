package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.yh0;

/* loaded from: classes7.dex */
public final class os81 {
    public final yh0 a;
    public final String b;

    public os81(yh0 yh0Var, String str) {
        this.a = yh0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os81)) {
            return false;
        }
        os81 os81Var = (os81) obj;
        return this.a == os81Var.a && this.b.equals(os81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DivKitAsset(type=" + this.a + ", assetName=" + this.b + Extension.C_BRAKE;
    }
}
