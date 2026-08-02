package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class g9t {
    public final ChatRequest a;
    public final ServerMessageRef b;

    public g9t(ChatRequest chatRequest, ServerMessageRef serverMessageRef) {
        this.a = chatRequest;
        this.b = serverMessageRef;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9t)) {
            return false;
        }
        g9t g9tVar = (g9t) obj;
        return jl40.l(this.a, g9tVar.a) && jl40.l(this.b, g9tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TargetMessageParams(chatRequest=" + this.a + ", serverMessageRef=" + this.b + Extension.C_BRAKE;
    }
}
