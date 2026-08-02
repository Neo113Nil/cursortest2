package defpackage;

import java.io.File;

/* loaded from: classes11.dex */
public final class a891 {
    public final File a;
    public final String b;

    public a891(File file, String str) {
        this.a = file;
        this.b = str;
    }

    public final File a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a891)) {
            return false;
        }
        a891 a891Var = (a891) obj;
        return this.a.equals(a891Var.a) && this.b.equals(a891Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return unr0.p("SplitFileInfo{splitFile=", this.a.toString(), ", splitId=", this.b, "}");
    }
}
