package xsna;

import androidx.health.platform.client.proto.ByteString;
import androidx.health.platform.client.proto.InvalidProtocolBufferException;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes12.dex */
public class nqy {
    public volatile ja20 a;
    public volatile ByteString b;

    public final ja20 a(ja20 ja20Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = ja20Var;
                        this.b = ByteString.b;
                    } catch (InvalidProtocolBufferException unused) {
                        this.a = ja20Var;
                        this.b = ByteString.b;
                    }
                }
            }
        }
        return this.a;
    }

    public final ByteString b() {
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
        if (!(obj instanceof nqy)) {
            return false;
        }
        nqy nqyVar = (nqy) obj;
        ja20 ja20Var = this.a;
        ja20 ja20Var2 = nqyVar.a;
        return (ja20Var == null && ja20Var2 == null) ? b().equals(nqyVar.b()) : (ja20Var == null || ja20Var2 == null) ? ja20Var != null ? ja20Var.equals(nqyVar.a(ja20Var.a())) : a(ja20Var2.a()).equals(ja20Var2) : ja20Var.equals(ja20Var2);
    }

    public int hashCode() {
        return 1;
    }
}
