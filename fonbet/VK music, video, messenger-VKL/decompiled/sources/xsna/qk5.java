package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.uv5;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes12.dex */
public final class qk5 extends uv5 {
    public final Iterable<a0q> a;
    public final byte[] b;

    /* compiled from: AutoValue_BackendRequest.java */
    public static final class a extends uv5.a {
        public ArrayList a;
        public byte[] b;

        public final qk5 a() {
            String str = this.a == null ? " events" : "";
            if (str.isEmpty()) {
                return new qk5(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(ArrayList arrayList) {
            this.a = arrayList;
            return this;
        }

        public final a c(@Nullable byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    public qk5() {
        throw null;
    }

    public qk5(ArrayList arrayList, byte[] bArr) {
        this.a = arrayList;
        this.b = bArr;
    }

    @Override // xsna.uv5
    public final Iterable<a0q> b() {
        return this.a;
    }

    @Override // xsna.uv5
    @Nullable
    public final byte[] c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uv5)) {
            return false;
        }
        uv5 uv5Var = (uv5) obj;
        if (this.a.equals(uv5Var.b())) {
            return Arrays.equals(this.b, uv5Var instanceof qk5 ? ((qk5) uv5Var).b : uv5Var.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
