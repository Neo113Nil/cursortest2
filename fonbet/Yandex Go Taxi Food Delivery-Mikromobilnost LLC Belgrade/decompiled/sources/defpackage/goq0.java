package defpackage;

import com.yandex.messaging.ChatRequest;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class goq0 {
    public final ChatRequest a;
    public final JSONObject b;

    public goq0(ChatRequest chatRequest, JSONObject jSONObject) {
        this.a = chatRequest;
        this.b = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goq0)) {
            return false;
        }
        goq0 goq0Var = (goq0) obj;
        return jl40.l(this.a, goq0Var.a) && jl40.l(this.b, goq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(chatRequest=" + this.a + ", payload=" + this.b + Extension.C_BRAKE;
    }
}
