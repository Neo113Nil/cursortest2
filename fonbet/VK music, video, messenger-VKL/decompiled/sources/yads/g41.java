package yads;

import android.graphics.Bitmap;

/* loaded from: classes10.dex */
public final class g41 implements vq2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ n41 b;

    public g41(n41 n41Var, String str) {
        this.b = n41Var;
        this.a = str;
    }

    @Override // yads.vq2
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        n41 n41Var = this.b;
        String str = this.a;
        ((v92) n41Var.b).a(str, bitmap);
        j41 j41Var = (j41) n41Var.c.remove(str);
        if (j41Var != null) {
            j41Var.b = bitmap;
            n41Var.d.put(str, j41Var);
            if (n41Var.f == null) {
                i41 i41Var = new i41(n41Var);
                n41Var.f = i41Var;
                n41Var.e.postDelayed(i41Var, 100);
            }
        }
    }
}
