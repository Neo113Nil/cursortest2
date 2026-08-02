package defpackage;

/* loaded from: classes9.dex */
public final class kc5 implements v7p {
    public final /* synthetic */ int a;
    public final w8g b;

    public /* synthetic */ kc5(w8g w8gVar, int i) {
        this.a = i;
        this.b = w8gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        String str;
        int i = this.a;
        w8g w8gVar = this.b;
        switch (i) {
            case 0:
                eq50 eq50Var = ((fq50) w8gVar.get()).c;
                if (eq50Var instanceof dq50) {
                    str = ((dq50) eq50Var).a;
                } else if (eq50Var.equals(vvb1.G)) {
                    str = "https://tc.mobile.yandex.net";
                } else {
                    if (!eq50Var.equals(l76.H)) {
                        w511.b();
                        return null;
                    }
                    str = "https://tc.tst.mobile.yandex.net";
                }
                q5z.i(str);
                return str;
            case 1:
                w8gVar.get();
                return new dk7(2);
            default:
                w8gVar.get();
                return new uc();
        }
    }
}
