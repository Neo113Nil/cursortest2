package defpackage;

/* loaded from: classes2.dex */
public final class lvf implements hs31 {
    public final /* synthetic */ int a = 0;
    public final vv90 b;
    public final rwo c;

    public lvf(rwo rwoVar, vv90 vv90Var) {
        this.c = rwoVar;
        this.b = vv90Var;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        int i = this.a;
        rwo rwoVar = this.c;
        vv90 vv90Var = this.b;
        switch (i) {
            case 0:
                if (!cls.equals(kvf.class)) {
                    ny61.r("Unknown view model");
                    break;
                } else {
                    break;
                }
            default:
                if (!cls.equals(egm0.class)) {
                    ny61.r("Unknown view model");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    public lvf(vv90 vv90Var, rwo rwoVar) {
        this.b = vv90Var;
        this.c = rwoVar;
    }
}
