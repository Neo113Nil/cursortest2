package defpackage;

/* loaded from: classes14.dex */
public final class ekw {
    public final klw a;

    public ekw(klw klwVar) {
        this.a = klwVar;
    }

    public final fom0 a() {
        String str;
        Object obj;
        jlw a = this.a.a();
        glw glwVar = a instanceof glw ? (glw) a : null;
        if (glwVar != null && (str = glwVar.a) != null) {
            mp60 mp60Var = glwVar.c;
            Object[] objArr = mp60Var.a;
            int i = mp60Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (((hjw) obj) instanceof djw) {
                    break;
                }
                i2++;
            }
            djw djwVar = obj instanceof djw ? (djw) obj : null;
            if (djwVar != null) {
                return (fom0) djwVar.e.d(new ckw(str));
            }
        }
        return null;
    }
}
