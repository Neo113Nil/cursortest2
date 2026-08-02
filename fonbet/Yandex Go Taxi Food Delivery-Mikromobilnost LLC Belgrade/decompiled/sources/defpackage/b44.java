package defpackage;

import defpackage.c3f;
import java.util.List;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;

/* loaded from: classes11.dex */
public final class b44 extends c3f.a.b {
    public int a;
    public String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public String h;
    public List i;
    public byte j;

    public final c44 a() {
        String str;
        if (this.j == 63 && (str = this.b) != null) {
            return new c44(this.a, str, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.b == null) {
            sb.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.j & PKIBody._CKUANN) == 0) {
            sb.append(" rss");
        }
        if ((this.j & BlobHeaderStructure.BLOB_VERSION) == 0) {
            sb.append(" timestamp");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final b44 b(List list) {
        this.i = list;
        return this;
    }

    public final b44 c(int i) {
        this.d = i;
        this.j = (byte) (this.j | 4);
        return this;
    }

    public final b44 d(int i) {
        this.a = i;
        this.j = (byte) (this.j | 1);
        return this;
    }

    public final b44 e(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        ny61.t("Null processName");
        return null;
    }

    public final b44 f(long j) {
        this.e = j;
        this.j = (byte) (this.j | 8);
        return this;
    }

    public final b44 g(int i) {
        this.c = i;
        this.j = (byte) (this.j | 2);
        return this;
    }

    public final b44 h(long j) {
        this.f = j;
        this.j = (byte) (this.j | PKIBody._CKUANN);
        return this;
    }

    public final b44 i(long j) {
        this.g = j;
        this.j = (byte) (this.j | BlobHeaderStructure.BLOB_VERSION);
        return this;
    }

    public final b44 j(String str) {
        this.h = str;
        return this;
    }
}
