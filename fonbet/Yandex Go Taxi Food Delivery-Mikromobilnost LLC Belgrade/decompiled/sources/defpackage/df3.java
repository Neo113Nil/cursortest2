package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class df3 extends hf3 {
    public final String a;

    public df3(String str) {
        this.a = str;
    }

    @Override // defpackage.hf3
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof df3) && jl40.l(this.a, ((df3) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return oyr.t(new StringBuilder("BluetoothHeadset(name="), this.a, Extension.C_BRAKE);
    }

    public df3() {
        this(0);
    }

    public /* synthetic */ df3(int i) {
        this("Bluetooth");
    }
}
