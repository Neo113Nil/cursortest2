package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes10.dex */
public final class ge2 implements zf0 {
    public final y00 a;
    public final hz1 b;
    public final kz1 c;

    public /* synthetic */ ge2(y00 y00Var) {
        this(y00Var, new hz1(), new kz1());
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.b.getClass();
        ImageView imageView = (ImageView) viewGroup.findViewById(R$id.icon_placeholder);
        y00 y00Var = this.a;
        a10 a10Var = y00Var.c;
        a10 a10Var2 = y00Var.b;
        if (imageView != null && a10Var == null && a10Var2 == null) {
            this.c.getClass();
            cm3 cm3Var = new cm3((TextView) viewGroup.findViewById(R$id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(cm3Var);
        }
    }

    public ge2(y00 y00Var, hz1 hz1Var, kz1 kz1Var) {
        this.a = y00Var;
        this.b = hz1Var;
        this.c = kz1Var;
    }

    @Override // yads.zf0
    public final void c() {
    }
}
