package defpackage;

import defpackage.c3f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k44 extends c3f.d.b {
    public final String a;
    public final byte[] b;

    public k44(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // c3f.d.b
    public final byte[] a() {
        return this.b;
    }

    @Override // c3f.d.b
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.d.b)) {
            return false;
        }
        c3f.d.b bVar = (c3f.d.b) obj;
        if (this.a.equals(bVar.b())) {
            return Arrays.equals(this.b, bVar instanceof k44 ? ((k44) bVar).b : bVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
