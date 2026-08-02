package defpackage;

import android.os.Bundle;
import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.Map;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class f8b extends ChatRequest {
    public final String a;
    public final String b;

    public f8b(String str) {
        this.a = str;
        this.b = str;
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("chatId", this.a);
        return jSONObject;
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final String b() {
        return this.b;
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final void c(Bundle bundle) {
        bundle.putString(f8b.class.getSimpleName(), this.a);
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final Map d() {
        return g8e.z("chatId", this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8b) && jl40.l(this.a, ((f8b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Chat(chatId=", this.a, Extension.C_BRAKE);
    }
}
