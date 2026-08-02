package defpackage;

import android.os.Bundle;
import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.Map;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class i8b extends ChatRequest {
    public final String a;
    public final String b;

    public i8b(String str) {
        this.a = str;
        this.b = str;
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("inviteHash", this.a);
        return jSONObject;
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final String b() {
        return this.b;
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final void c(Bundle bundle) {
        bundle.putString(i8b.class.getSimpleName(), this.a);
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final Map d() {
        return g8e.z("inviteHash", this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8b) && this.a.equals(((i8b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Invite(inviteHash=", this.a, Extension.C_BRAKE);
    }
}
