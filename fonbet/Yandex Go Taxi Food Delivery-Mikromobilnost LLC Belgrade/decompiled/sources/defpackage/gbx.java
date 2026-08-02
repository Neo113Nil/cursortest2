package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class gbx implements kbx {
    public static final cbx Companion = new cbx();
    public final String a;
    public final fbx b;
    public final boolean c;

    public /* synthetic */ gbx(int i, String str, fbx fbxVar, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, bbx.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = fbxVar;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbx)) {
            return false;
        }
        gbx gbxVar = (gbx) obj;
        return jl40.l(this.a, gbxVar.a) && jl40.l(this.b, gbxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PhotoResultError(id=" + this.a + ", error=" + this.b + Extension.C_BRAKE;
    }

    public gbx(String str, fbx fbxVar) {
        this.a = str;
        this.b = fbxVar;
    }
}
