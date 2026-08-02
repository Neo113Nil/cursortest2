package defpackage;

import defpackage.c3f;

/* loaded from: classes11.dex */
public final class j44 extends c3f.d.b.a {
    public String a;
    public byte[] b;

    public final k44 a() {
        byte[] bArr;
        String str = this.a;
        if (str != null && (bArr = this.b) != null) {
            return new k44(str, bArr);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" filename");
        }
        if (this.b == null) {
            sb.append(" contents");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }
}
