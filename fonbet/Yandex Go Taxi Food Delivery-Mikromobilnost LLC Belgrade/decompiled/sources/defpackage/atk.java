package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.view.RatioImageView;

/* loaded from: classes11.dex */
public final class atk extends xok {
    public final Context a;
    public final ut31 b;
    public final h2b c;

    public atk(Context context, ut31 ut31Var, h2b h2bVar) {
        this.a = context;
        this.b = ut31Var;
        this.c = h2bVar;
        ut31Var.d("DivImageBlockViewBuilder.IMAGE", new v5x0(this, 2), 8);
    }

    @Override // defpackage.ggk
    public final View a(DivView divView, n15 n15Var) {
        ysk yskVar = (ysk) n15Var;
        RatioImageView ratioImageView = (RatioImageView) this.b.b("DivImageBlockViewBuilder.IMAGE");
        ratioImageView.setId(ogh0.div_image);
        ratioImageView.setRatio(Float.valueOf(mj91.c(yskVar.x)));
        ratioImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        divView.addLoadReference(this.c.loadImage(yskVar.x.a.toString(), new zsk(ratioImageView), 0), ratioImageView);
        return ratioImageView;
    }
}
