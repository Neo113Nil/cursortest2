package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class oq51 extends hz91 {
    public final rbv c;

    public oq51() {
        this(new nbv(nyg0.ybsdk_ic_card_mir_disabled, null));
    }

    @Override // defpackage.hz91
    public final rbv a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq51) && jl40.l(this.c, ((oq51) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Loading(icon=" + this.c + Extension.C_BRAKE;
    }

    public oq51(rbv rbvVar) {
        this.c = rbvVar;
    }
}
