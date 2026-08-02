package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbrt0;", "Ldrt0;", "Companion", "zqt0", "art0", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class brt0 extends drt0 {
    public static final art0 Companion = new art0();
    public final fdu0 a;

    public brt0(int i, fdu0 fdu0Var) {
        if ((i & 1) != 0) {
            this.a = fdu0Var;
        } else {
            fdu0.Companion.getClass();
            this.a = fdu0.c;
        }
    }

    /* renamed from: a, reason: from getter */
    public final fdu0 getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof brt0) && jl40.l(this.a, ((brt0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Stickers(context=" + this.a + Extension.C_BRAKE;
    }

    public brt0() {
        fdu0.Companion.getClass();
        this.a = fdu0.c;
    }
}
