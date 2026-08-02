package xsna;

import com.google.android.gms.measurement.internal.zzah;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class w701 extends fa01 {
    public String f;
    public String g;
    public int h;
    public String i;
    public long j;
    public final long k;
    public List l;
    public String m;
    public int n;
    public String o;
    public String p;
    public String q;
    public long r;
    public String s;

    public w701(mb01 mb01Var, long j) {
        super(mb01Var);
        this.r = 0L;
        this.s = null;
        this.k = j;
    }

    @Override // xsna.fa01
    public final boolean n() {
        return true;
    }

    public final String o() {
        l();
        exc0.i(this.f);
        return this.f;
    }

    public final String p() {
        k();
        l();
        exc0.i(this.o);
        return this.o;
    }

    public final void q() {
        String format;
        k();
        mb01 mb01Var = (mb01) this.b;
        x901 x901Var = mb01Var.i;
        k901 k901Var = mb01Var.j;
        mb01.i(x901Var);
        if (x901Var.p().f(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            sk01 sk01Var = mb01Var.m;
            mb01.i(sk01Var);
            sk01Var.s().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            mb01.k(k901Var);
            k901Var.p.a("Analytics Storage consent is not granted");
            format = null;
        }
        mb01.k(k901Var);
        k901Var.p.a("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.q = format;
        mb01Var.o.getClass();
        this.r = System.currentTimeMillis();
    }
}
