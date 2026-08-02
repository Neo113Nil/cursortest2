package defpackage;

import defpackage.c3f;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes11.dex */
public final class k54 extends c3f.e.d.c.a {
    public Double a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public byte g;

    public final l54 a() {
        if (this.g == 31) {
            return new l54(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.g & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.g & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.g & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.g & PKIBody._CKUANN) == 0) {
            sb.append(" diskUsed");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final k54 b(Double d) {
        this.a = d;
        return this;
    }

    public final k54 c(int i) {
        this.b = i;
        this.g = (byte) (this.g | 1);
        return this;
    }

    public final k54 d(long j) {
        this.f = j;
        this.g = (byte) (this.g | PKIBody._CKUANN);
        return this;
    }

    public final k54 e(int i) {
        this.d = i;
        this.g = (byte) (this.g | 4);
        return this;
    }

    public final k54 f(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 2);
        return this;
    }

    public final k54 g(long j) {
        this.e = j;
        this.g = (byte) (this.g | 8);
        return this;
    }
}
