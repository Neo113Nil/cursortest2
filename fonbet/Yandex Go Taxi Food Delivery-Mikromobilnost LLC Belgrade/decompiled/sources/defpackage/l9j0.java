package defpackage;

import android.os.Bundle;
import com.yandex.messaging.ui.selectusers.RequestUserForActionBehaviour;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class l9j0 extends s120 {
    public final g720 a;
    public final String b;
    public final RequestUserForActionBehaviour c;
    public final String d;

    public l9j0(Bundle bundle) {
        String string = bundle.getString("Messaging.Arguments.Source");
        if (string == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
            throw null;
        }
        int i = g720.c;
        g720 b = glb1.b(string);
        String string2 = bundle.getString("Messaging.Arguments.ChatId");
        if (string2 == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.ChatId"));
            throw null;
        }
        String string3 = bundle.getString("Messaging.Arguments.RequestUserForAction.Behaviour");
        if (string3 == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.RequestUserForAction.Behaviour"));
            throw null;
        }
        for (RequestUserForActionBehaviour requestUserForActionBehaviour : RequestUserForActionBehaviour.values()) {
            if (jl40.l(requestUserForActionBehaviour.getKey(), string3)) {
                this.a = b;
                this.b = string2;
                this.c = requestUserForActionBehaviour;
                this.d = "Messaging.Arguments.Key.RequestUserForAction";
                return;
            }
        }
        w511.i("Array contains no element matching the predicate.");
        throw null;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.d;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9j0)) {
            return false;
        }
        l9j0 l9j0Var = (l9j0) obj;
        return jl40.l(this.a, l9j0Var.a) && jl40.l(this.b, l9j0Var.b) && this.c == l9j0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "RequestUserForActionArguments(source=" + this.a + ", chatId=" + this.b + ", behaviour=" + this.c + Extension.C_BRAKE;
    }
}
