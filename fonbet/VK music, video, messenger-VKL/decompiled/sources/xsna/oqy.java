package xsna;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes13.dex */
public class oqy {
    public volatile ka20 a;
    public volatile ByteString b;

    static {
        com.google.crypto.tink.shaded.protobuf.k.a();
    }

    public final int a() {
        if (this.b != null) {
            return this.b.size();
        }
        if (this.a != null) {
            return this.a.getSerializedSize();
        }
        return 0;
    }

    public final ka20 b(ka20 ka20Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = ka20Var;
                        this.b = ByteString.b;
                    } catch (InvalidProtocolBufferException unused) {
                        this.a = ka20Var;
                        this.b = ByteString.b;
                    }
                }
            }
        }
        return this.a;
    }

    public final ByteString c() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = ByteString.b;
                } else {
                    this.b = this.a.toByteString();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqy)) {
            return false;
        }
        oqy oqyVar = (oqy) obj;
        ka20 ka20Var = this.a;
        ka20 ka20Var2 = oqyVar.a;
        return (ka20Var == null && ka20Var2 == null) ? c().equals(oqyVar.c()) : (ka20Var == null || ka20Var2 == null) ? ka20Var != null ? ka20Var.equals(oqyVar.b(ka20Var.a())) : b(ka20Var2.a()).equals(ka20Var2) : ka20Var.equals(ka20Var2);
    }

    public int hashCode() {
        return 1;
    }
}
