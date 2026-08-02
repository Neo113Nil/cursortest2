package defpackage;

import com.yandex.messaging.ChatRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class o721 {
    public final ChatRequest a;
    public final long b;

    public o721(ChatRequest chatRequest, long j) {
        this.a = chatRequest;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o721)) {
            return false;
        }
        o721 o721Var = (o721) obj;
        return jl40.l(this.a, o721Var.a) && this.b == o721Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(chatRequest=" + this.a + ", orgId=" + this.b + Extension.C_BRAKE;
    }
}
