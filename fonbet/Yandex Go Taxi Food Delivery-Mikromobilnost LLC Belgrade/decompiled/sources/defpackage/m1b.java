package defpackage;

import android.os.Bundle;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.CreateChannelRequest;
import com.yandex.messaging.CreateFamilyChatRequest;
import com.yandex.messaging.CreateGroupChatRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class m1b extends s120 {
    public final g720 a;
    public final ChatRequest b;
    public final String c;

    public m1b(Bundle bundle) {
        String string = bundle.getString("Messaging.Arguments.Source");
        if (string == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
            throw null;
        }
        int i = g720.c;
        g720 b = glb1.b(string);
        ChatRequest chatRequest = (ChatRequest) vng.u(bundle, ChatRequest.class, "Messaging.Arguments.ChatRequest");
        if (chatRequest == null) {
            ny61.r("no required argument Messaging.Arguments.ChatRequest");
            throw null;
        }
        this.a = b;
        this.b = chatRequest;
        if (!(chatRequest instanceof CreateGroupChatRequest) && !(chatRequest instanceof CreateFamilyChatRequest)) {
            boolean z = chatRequest instanceof CreateChannelRequest;
        }
        z83.i();
        this.c = "Messaging.Arguments.Key.ChatCreateChooser";
    }

    @Override // defpackage.s120
    public final String a() {
        return this.c;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1b)) {
            return false;
        }
        m1b m1bVar = (m1b) obj;
        return jl40.l(this.a, m1bVar.a) && jl40.l(this.b, m1bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatCreateChooserArguments(source=" + this.a + ", chatRequest=" + this.b + Extension.C_BRAKE;
    }
}
