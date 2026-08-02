package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnh40;", "", "Companion", "mh40", "lh40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class nh40 {
    public static final mh40 Companion = new mh40();
    public static final nh40 c = new nh40(0);
    public final kh40 a;
    public final kh40 b;

    public nh40(int i, kh40 kh40Var, kh40 kh40Var2) {
        int i2 = i & 1;
        kh40 kh40Var3 = kh40.d;
        if (i2 == 0) {
            kh40.Companion.getClass();
            this.a = kh40Var3;
        } else {
            this.a = kh40Var;
        }
        if ((i & 2) != 0) {
            this.b = kh40Var2;
        } else {
            kh40.Companion.getClass();
            this.b = kh40Var3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh40)) {
            return false;
        }
        nh40 nh40Var = (nh40) obj;
        return jl40.l(this.a, nh40Var.a) && jl40.l(this.b, nh40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtTrainStations(startingStation=" + this.a + ", destinationStation=" + this.b + Extension.C_BRAKE;
    }

    public nh40() {
        this(0);
    }

    public nh40(int i) {
        jh40 jh40Var = kh40.Companion;
        jh40Var.getClass();
        jh40Var.getClass();
        kh40 kh40Var = kh40.d;
        this.a = kh40Var;
        this.b = kh40Var;
    }
}
