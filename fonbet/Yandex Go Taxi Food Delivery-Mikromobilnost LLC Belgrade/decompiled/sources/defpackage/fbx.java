package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class fbx {
    public static final ebx Companion = new ebx();
    public final String a;
    public final String b;

    public /* synthetic */ fbx(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, dbx.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbx)) {
            return false;
        }
        fbx fbxVar = (fbx) obj;
        return jl40.l(this.a, fbxVar.a) && jl40.l(this.b, fbxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ErrorDetails(code=", this.a, ", screen=", this.b, Extension.C_BRAKE);
    }

    public fbx(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
