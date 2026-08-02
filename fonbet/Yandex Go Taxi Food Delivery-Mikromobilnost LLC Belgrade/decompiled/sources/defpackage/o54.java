package defpackage;

import defpackage.c3f;

/* loaded from: classes11.dex */
public final class o54 extends c3f.e.d.AbstractC0026e.a {
    public c3f.e.d.AbstractC0026e.b a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final p54 a() {
        c3f.e.d.AbstractC0026e.b bVar;
        String str;
        String str2;
        if (this.e == 1 && (bVar = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new p54(bVar, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((this.e & 1) == 0) {
            sb.append(" templateVersion");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final o54 b(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        ny61.t("Null parameterKey");
        return null;
    }

    public final o54 c(String str) {
        if (str != null) {
            this.c = str;
            return this;
        }
        ny61.t("Null parameterValue");
        return null;
    }

    public final o54 d(long j) {
        this.d = j;
        this.e = (byte) (this.e | 1);
        return this;
    }
}
