package defpackage;

import java.util.Arrays;

/* loaded from: classes15.dex */
public final class ash extends xx4 {
    public final String w;
    public bdu0 x;

    public ash(String str) {
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
        int indexOf = Arrays.asList(b).indexOf(this.w);
        if (indexOf == -1) {
            h();
            return;
        }
        int length = b.length - 1;
        String[] strArr = new String[length];
        int i = 0;
        while (i < length) {
            strArr[i] = b[(i < indexOf ? 0 : 1) + i];
            i++;
        }
        this.x.a(a, strArr);
        h();
    }
}
