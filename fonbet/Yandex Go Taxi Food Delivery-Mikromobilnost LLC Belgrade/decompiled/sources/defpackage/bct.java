package defpackage;

import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class bct {
    public final ExistingChatRequest a;
    public final ServerMessageRef b;

    public bct(ExistingChatRequest existingChatRequest, ServerMessageRef serverMessageRef) {
        this.a = existingChatRequest;
        this.b = serverMessageRef;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bct)) {
            return false;
        }
        bct bctVar = (bct) obj;
        return this.a.equals(bctVar.a) && jl40.l(this.b, bctVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QuoteRequest(chatRequest=" + this.a + ", itemRef=" + this.b + Extension.C_BRAKE;
    }
}
