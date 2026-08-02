package defpackage;

import defpackage.rfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class h64 extends rfo.a {
    public String a;
    public Integer b;
    public qyn c;
    public Long d;
    public Long e;
    public HashMap f;
    public Integer g;
    public String h;
    public byte[] i;
    public byte[] j;

    @Override // rfo.a
    public final Map b() {
        HashMap hashMap = this.f;
        if (hashMap != null) {
            return hashMap;
        }
        ny61.r("Property \"autoMetadata\" has not been set");
        return null;
    }

    public final i64 c() {
        String str = this.a == null ? " transportName" : "";
        if (this.c == null) {
            str = str.concat(" encodedPayload");
        }
        if (this.d == null) {
            str = str.concat(" eventMillis");
        }
        if (this.e == null) {
            str = str.concat(" uptimeMillis");
        }
        if (this.f == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new i64(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, this.g, this.h, this.i, this.j);
        }
        ny61.r("Missing required properties:".concat(str));
        return null;
    }
}
