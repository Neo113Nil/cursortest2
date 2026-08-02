package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class dtg extends kr {
    public static final ctg Companion = new ctg();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new cue(26))};
    public final String a;
    public final long b;
    public final kr c;

    public /* synthetic */ dtg(int i, long j, kr krVar, String str) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, btg.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
        this.c = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dtg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        dtg dtgVar = (dtg) obj;
        return jl40.l(this.a, dtgVar.a) && this.b == dtgVar.b && jl40.l(this.c, dtgVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + qv10.c((str != null ? str.hashCode() : 0) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = x4e.l("DebounceAction(debounceId=", this.a, ", debounceMillis=", this.b);
        l.append(", action=");
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
