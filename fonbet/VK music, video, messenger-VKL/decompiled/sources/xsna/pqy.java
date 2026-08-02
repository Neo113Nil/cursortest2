package xsna;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes.dex */
public class pqy {
    public volatile la20 a;
    public volatile ByteString b;

    public final la20 a(la20 la20Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = la20Var;
                        this.b = ByteString.b;
                    } catch (InvalidProtocolBufferException unused) {
                        this.a = la20Var;
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
        if (!(obj instanceof pqy)) {
            return false;
        }
        pqy pqyVar = (pqy) obj;
        la20 la20Var = this.a;
        la20 la20Var2 = pqyVar.a;
        return (la20Var == null && la20Var2 == null) ? b().equals(pqyVar.b()) : (la20Var == null || la20Var2 == null) ? la20Var != null ? la20Var.equals(pqyVar.a(la20Var.a())) : a(la20Var2.a()).equals(la20Var2) : la20Var.equals(la20Var2);
    }

    public int hashCode() {
        return 1;
    }
}
