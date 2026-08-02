package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class d9t {
    public final ChatRequest a;
    public final LocalMessageRef b;

    public d9t(ChatRequest chatRequest, LocalMessageRef localMessageRef) {
        this.a = chatRequest;
        this.b = localMessageRef;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9t)) {
            return false;
        }
        d9t d9tVar = (d9t) obj;
        return jl40.l(this.a, d9tVar.a) && jl40.l(this.b, d9tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(chatRequest=" + this.a + ", messageRef=" + this.b + Extension.C_BRAKE;
    }
}
