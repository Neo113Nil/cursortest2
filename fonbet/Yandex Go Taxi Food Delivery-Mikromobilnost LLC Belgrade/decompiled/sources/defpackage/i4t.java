package defpackage;

import com.yandex.messaging.ChatRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class i4t {
    public final ChatRequest a;
    public final int b;

    public i4t(ChatRequest chatRequest, int i) {
        this.a = chatRequest;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4t)) {
            return false;
        }
        i4t i4tVar = (i4t) obj;
        return jl40.l(this.a, i4tVar.a) && this.b == i4tVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(chatRequest=" + this.a + ", avatarSizeRes=" + this.b + Extension.C_BRAKE;
    }
}
