package xsna;

import androidx.annotation.Nullable;
import java.util.Arrays;
import xsna.i9q;

/* compiled from: AutoValue_ExperimentIds.java */
/* loaded from: classes.dex */
public final class am5 extends i9q {
    public final byte[] a;
    public final byte[] b;

    /* compiled from: AutoValue_ExperimentIds.java */
    /* loaded from: classes12.dex */
    public static final class a extends i9q.a {
        public byte[] a;
        public byte[] b;

        public final am5 a() {
            return new am5(this.a, this.b);
        }

        public final a b(@Nullable byte[] bArr) {
            this.a = bArr;
            return this;
        }

        public final a c(@Nullable byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    public am5(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    @Override // xsna.i9q
    @Nullable
    public final byte[] a() {
        return this.a;
    }

    @Override // xsna.i9q
    @Nullable
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i9q)) {
            return false;
        }
        i9q i9qVar = (i9q) obj;
        boolean z = i9qVar instanceof am5;
        if (Arrays.equals(this.a, z ? ((am5) i9qVar).a : i9qVar.a())) {
            return Arrays.equals(this.b, z ? ((am5) i9qVar).b : i9qVar.b());
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
