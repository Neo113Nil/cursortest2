package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes12.dex */
public final class our0 extends v0x {
    public final rz30 c;
    public final Object d;
    public final pdh e = new pdh();

    public our0(rz30 rz30Var, Object obj) {
        this.c = rz30Var;
        this.d = obj;
    }

    @Override // defpackage.v0x
    public final /* bridge */ /* synthetic */ void b(x0 x0Var, u0x u0xVar) {
    }

    @Override // defpackage.v0x
    public final x0 d(ViewGroup viewGroup) {
        this.c.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(uqh0.mt_main_shimmer_view, viewGroup, false);
        int i = reh0.first_bar;
        if (((PlaceholderView) cma1.O(i, inflate)) != null) {
            i = reh0.icon;
            if (((PlaceholderView) cma1.O(i, inflate)) != null) {
                i = reh0.where_to;
                if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                    return new qz30((GoConstraintLayout) inflate);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.v0x
    public final pdh e() {
        return this.e;
    }

    @Override // defpackage.v0x
    public final /* bridge */ /* synthetic */ void h(x0 x0Var) {
    }
}
