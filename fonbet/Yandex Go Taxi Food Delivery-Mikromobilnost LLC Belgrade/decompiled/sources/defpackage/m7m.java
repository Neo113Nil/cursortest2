package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class m7m {
    public final MessageRef a;
    public final MessageRef b;

    public m7m(MessageRef messageRef, MessageRef messageRef2) {
        this.a = messageRef;
        this.b = messageRef2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7m)) {
            return false;
        }
        m7m m7mVar = (m7m) obj;
        return this.a.equals(m7mVar.a) && jl40.l(this.b, m7mVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MessageRef messageRef = this.b;
        return hashCode + (messageRef == null ? 0 : messageRef.hashCode());
    }

    public final String toString() {
        return "Params(messageRef=" + this.a + ", originalMessageRef=" + this.b + Extension.C_BRAKE;
    }
}
