package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l64 extends pqo {
    public final byte[] a;
    public final byte[] b;

    public l64(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    @Override // defpackage.pqo
    public final byte[] a() {
        return this.a;
    }

    @Override // defpackage.pqo
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pqo)) {
            return false;
        }
        pqo pqoVar = (pqo) obj;
        boolean z = pqoVar instanceof l64;
        if (Arrays.equals(this.a, z ? ((l64) pqoVar).a : pqoVar.a())) {
            return Arrays.equals(this.b, z ? ((l64) pqoVar).b : pqoVar.b());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
