package yads;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes10.dex */
public final class ny {
    public final y00 a;
    public final int b;
    public final hz1 c;

    public ny(y00 y00Var, int i, hz1 hz1Var) {
        this.a = y00Var;
        this.b = i;
        this.c = hz1Var;
    }

    public final ImageView a(View view, my myVar, a10 a10Var) {
        y00 y00Var = this.a;
        my myVar2 = y00Var.c != null ? my.c : y00Var.b != null ? my.b : my.d;
        if (a10Var == null || myVar2 != myVar) {
            return null;
        }
        int i = a10Var.c;
        int i2 = a10Var.d;
        int i3 = this.b;
        if (i3 > i || i3 > i2) {
            this.c.getClass();
            return (ImageView) view.findViewById(R$id.icon_small);
        }
        this.c.getClass();
        return (ImageView) view.findViewById(R$id.icon_large);
    }
}
