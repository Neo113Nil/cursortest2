package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class kv10 {
    public final ServerMessageRef a;
    public final int b;
    public final int c;
    public final ssa0 d;

    public kv10(ServerMessageRef serverMessageRef, int i, int i2, ssa0 ssa0Var) {
        this.a = serverMessageRef;
        this.b = i;
        this.c = i2;
        this.d = ssa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv10)) {
            return false;
        }
        kv10 kv10Var = (kv10) obj;
        return this.a.equals(kv10Var.a) && this.b == kv10Var.b && this.c == kv10Var.c && jl40.l(this.d, kv10Var.d);
    }

    public final int hashCode() {
        int b = oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31);
        ssa0 ssa0Var = this.d;
        return b + (ssa0Var == null ? 0 : ssa0Var.hashCode());
    }

    public final String toString() {
        return "MessageReactionsOperation(ref=" + this.a + ", code=" + this.b + ", action=" + this.c + ", pending=" + this.d + Extension.C_BRAKE;
    }
}
