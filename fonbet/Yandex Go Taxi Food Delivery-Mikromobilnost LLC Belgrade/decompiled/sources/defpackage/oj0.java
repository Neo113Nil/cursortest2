package defpackage;

/* loaded from: classes15.dex */
public final class oj0 extends xx4 {
    public final String w;
    public bdu0 x;

    public oj0(String str) {
        this.w = str;
    }

    @Override // defpackage.xx4, defpackage.hr
    public final void b() {
        xo3 xo3Var;
        i(null);
        bdu0 bdu0Var = this.x;
        if (bdu0Var == null || (xo3Var = bdu0Var.f) == null) {
            return;
        }
        xo3Var.cancel();
        bdu0Var.f = null;
    }

    @Override // defpackage.xx4
    public final void j(cl21 cl21Var) {
        bdu0 bdu0Var = (bdu0) ((d9g) cl21Var).K.get();
        this.x = bdu0Var;
        long a = bdu0Var.e.S().a("sticker_packs");
        String[] b = this.x.e.r().b();
        int length = b.length;
        String[] strArr = new String[length + 1];
        int i = 0;
        while (true) {
            int length2 = b.length;
            String str = this.w;
            if (i >= length2) {
                strArr[length] = str;
                this.x.a(a, strArr);
                h();
                return;
            } else if (str.equals(b[i])) {
                h();
                return;
            } else {
                strArr[i] = b[i];
                i++;
            }
        }
    }
}
