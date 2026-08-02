package yads;

import android.widget.ImageView;
import com.ironsource.X3;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes10.dex */
public final class qi {
    public final v9 a;
    public final nj2 b;
    public final uo1 c;
    public final e52 d;
    public final i42 e;
    public final jp2 f;

    public qi(v9 v9Var, nj2 nj2Var, uo1 uo1Var, e52 e52Var, i42 i42Var, bu1 bu1Var, t20 t20Var) {
        this.a = v9Var;
        this.b = nj2Var;
        this.c = uo1Var;
        this.d = e52Var;
        this.e = i42Var;
        this.f = bu1Var;
    }

    public final sk1 a(ImageView imageView, CustomizableMediaView customizableMediaView) {
        to1 to1Var;
        f51 f51Var = imageView != null ? new f51(imageView, this.b, this.a) : null;
        if (customizableMediaView != null) {
            uo1 uo1Var = this.c;
            nj2 nj2Var = this.b;
            e52 e52Var = this.d;
            i42 i42Var = this.e;
            Object obj = uo1Var.a.a.get(X3.i.I0);
            po1 po1Var = obj instanceof po1 ? (po1) obj : null;
            vo1 vo1Var = uo1Var.d;
            if (vo1Var != null) {
                to1Var = vo1Var.a(customizableMediaView, uo1Var.b, nj2Var, uo1Var.g, uo1Var.c, e52Var, i42Var, uo1Var.e, uo1Var.f, uo1Var.h, po1Var);
                if (f51Var == null || to1Var != null) {
                    return new sk1(f51Var, to1Var);
                }
                return null;
            }
        }
        to1Var = null;
        if (f51Var == null) {
        }
        return new sk1(f51Var, to1Var);
    }
}
