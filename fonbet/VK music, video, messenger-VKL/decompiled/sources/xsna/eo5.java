package xsna;

import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;
import java.util.Arrays;
import xsna.sop0;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes.dex */
public final class eo5 extends sop0 {
    public final String a;
    public final byte[] b;
    public final Priority c;

    /* compiled from: AutoValue_TransportContext.java */
    public static final class a extends sop0.a {
        public String a;
        public byte[] b;
        public Priority c;

        public final eo5 a() {
            String str = this.a == null ? " backendName" : "";
            if (this.c == null) {
                str = str.concat(" priority");
            }
            if (str.isEmpty()) {
                return new eo5(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.a = str;
            return this;
        }
    }

    public eo5(String str, byte[] bArr, Priority priority) {
        this.a = str;
        this.b = bArr;
        this.c = priority;
    }

    @Override // xsna.sop0
    public final String b() {
        return this.a;
    }

    @Override // xsna.sop0
    @Nullable
    public final byte[] c() {
        return this.b;
    }

    @Override // xsna.sop0
    public final Priority d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sop0)) {
            return false;
        }
        sop0 sop0Var = (sop0) obj;
        if (this.a.equals(sop0Var.b())) {
            return Arrays.equals(this.b, sop0Var instanceof eo5 ? ((eo5) sop0Var).b : sop0Var.c()) && this.c.equals(sop0Var.d());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
