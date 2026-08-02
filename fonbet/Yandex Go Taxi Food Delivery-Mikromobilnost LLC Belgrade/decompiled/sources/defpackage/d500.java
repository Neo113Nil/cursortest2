package defpackage;

import android.os.Bundle;
import com.yandex.messaging.ui.main.MainFragmentTabs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class d500 extends s120 {
    public final g720 a;
    public final boolean b;
    public final MainFragmentTabs c;

    public d500(Bundle bundle) {
        String string = bundle.getString("Messaging.Arguments.Source");
        if (string == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
            throw null;
        }
        int i = g720.c;
        g720 b = glb1.b(string);
        boolean z = bundle.getBoolean("invalidate_user", false);
        MainFragmentTabs mainFragmentTabs = (MainFragmentTabs) vng.u(bundle, MainFragmentTabs.class, "current_screen");
        mainFragmentTabs = mainFragmentTabs == null ? MainFragmentTabs.CHATS : mainFragmentTabs;
        this.a = b;
        this.b = z;
        this.c = mainFragmentTabs;
    }

    @Override // defpackage.s120
    public final String a() {
        return "Messaging.Arguments.Key.MainFragment";
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d500)) {
            return false;
        }
        d500 d500Var = (d500) obj;
        return jl40.l(this.a, d500Var.a) && this.b == d500Var.b && this.c == d500Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "MainFragmentArguments(source=" + this.a + ", invalidateUser=" + this.b + ", targetScreen=" + this.c + Extension.C_BRAKE;
    }
}
