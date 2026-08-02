package defpackage;

/* loaded from: classes14.dex */
public final class glw extends jlw {
    public final String a;
    public final yew b;
    public final mp60 c;
    public final xaw d;
    public final vbw e;
    public final afw f;
    public final boolean g;

    public glw(String str, yew yewVar, mp60 mp60Var, xaw xawVar, vbw vbwVar, afw afwVar, boolean z) {
        this.a = str;
        this.b = yewVar;
        this.c = mp60Var;
        this.d = xawVar;
        this.e = vbwVar;
        this.f = afwVar;
        this.g = z;
    }

    public static glw a(glw glwVar, String str, mp60 mp60Var, boolean z, int i) {
        if ((i & 1) != 0) {
            str = glwVar.a;
        }
        String str2 = str;
        yew yewVar = glwVar.b;
        if ((i & 4) != 0) {
            mp60Var = glwVar.c;
        }
        mp60 mp60Var2 = mp60Var;
        xaw xawVar = glwVar.d;
        vbw vbwVar = glwVar.e;
        afw afwVar = glwVar.f;
        if ((i & 64) != 0) {
            z = glwVar.g;
        }
        glwVar.getClass();
        return new glw(str2, yewVar, mp60Var2, xawVar, vbwVar, afwVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof glw) {
                glw glwVar = (glw) obj;
                String str = glwVar.a;
                String str2 = this.a;
                if (str2 == null) {
                    if (str == null) {
                        equals = true;
                        if (equals && this.b.equals(glwVar.b) && jl40.l(this.c, glwVar.c) && this.d.equals(glwVar.d) && this.e.equals(glwVar.e) && this.f.equals(glwVar.f) && this.g == glwVar.g) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                } else {
                    if (str != null) {
                        equals = str2.equals(str);
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
