package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class nyj extends kr {
    public static final myj Companion = new myj();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new acj(9)), null};
    public final String a;
    public final kr b;
    public final boolean c;

    public /* synthetic */ nyj(int i, String str, kr krVar, boolean z) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, lyj.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = krVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyj)) {
            return false;
        }
        nyj nyjVar = (nyj) obj;
        return jl40.l(this.a, nyjVar.a) && jl40.l(this.b, nyjVar.b) && this.c == nyjVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DispatchOnParentAction(sectionId=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", fallbackOnCurrentEngine=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
