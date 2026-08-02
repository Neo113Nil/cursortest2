package defpackage;

import com.yandex.quark.dialog.DialogType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class gej {
    public static final fej Companion = new fej();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new xyi(6))};
    public final String a;
    public final DialogType b;

    public /* synthetic */ gej(int i, String str, DialogType dialogType) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, eej.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = dialogType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gej)) {
            return false;
        }
        gej gejVar = (gej) obj;
        return jl40.l(this.a, gejVar.a) && this.b == gejVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "DialogId(id=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }

    public gej(DialogType dialogType) {
        this.a = null;
        this.b = dialogType;
    }
}
