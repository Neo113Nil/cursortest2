package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class lv10 {
    public final ServerMessageRef a;
    public final boolean b;
    public final boolean c;

    public lv10(ServerMessageRef serverMessageRef, boolean z, boolean z2) {
        this.a = serverMessageRef;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv10)) {
            return false;
        }
        lv10 lv10Var = (lv10) obj;
        return jl40.l(this.a, lv10Var.a) && this.b == lv10Var.b && this.c == lv10Var.c;
    }

    public final int hashCode() {
        ServerMessageRef serverMessageRef = this.a;
        return Boolean.hashCode(this.c) + unr0.e((serverMessageRef == null ? 0 : serverMessageRef.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageReadStatusCapability(serverMessageRef=");
        sb.append(this.a);
        sb.append(", canMarkUnread=");
        sb.append(this.b);
        sb.append(", canMarkRead=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ lv10(int i) {
        this(null, false, false);
    }

    public lv10() {
        this(0);
    }
}
