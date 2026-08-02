package defpackage;

import android.os.Bundle;
import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.action.MessagingActionParser;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ndy0 extends s120 {
    public final g720 a;
    public final MessagingAction b;
    public final String c;

    public ndy0(Bundle bundle) {
        String string = bundle.getString("Messaging.Arguments.Source");
        if (string == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
            throw null;
        }
        int i = g720.c;
        g720 b = glb1.b(string);
        MessagingAction a = MessagingActionParser.a(bundle);
        a = a == null ? new MessagingAction.OpenCallList(true) : a;
        this.a = b;
        this.b = a;
        this.c = "Messaging.Arguments.Key.TelemessengerOnboarding";
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
        if (!(obj instanceof ndy0)) {
            return false;
        }
        ndy0 ndy0Var = (ndy0) obj;
        return jl40.l(this.a, ndy0Var.a) && jl40.l(this.b, ndy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TelemessengerOnboardingArguments(source=" + this.a + ", pendingAction=" + this.b + Extension.C_BRAKE;
    }
}
