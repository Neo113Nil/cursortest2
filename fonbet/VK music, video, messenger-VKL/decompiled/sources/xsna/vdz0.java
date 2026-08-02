package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.my.target.core.ui.views.promo.style2.cards.CardsLayoutManagerS2;
import java.util.ArrayList;
import xsna.zgz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class vdz0 implements qcz0, zgz0.a {
    public final wfy0 a;
    public final miz0 b;
    public int c;

    public vdz0(wfy0 wfy0Var, miz0 miz0Var) {
        this.a = wfy0Var;
        this.b = miz0Var;
    }

    @Override // xsna.qcz0
    public final void a(eiz0 eiz0Var) {
        eiz0Var.setBanner(null);
        eiz0Var.setListener(null);
    }

    @Override // xsna.qcz0
    public final void b(zgz0 zgz0Var, int i) {
        this.c = i;
        ArrayList arrayList = this.b.d;
        wfy0 wfy0Var = this.a;
        if (!arrayList.contains(wfy0Var)) {
            h8z0.e(wfy0Var.a, "render", 1, null);
            arrayList.add(wfy0Var);
        }
        eiz0 eiz0Var = (eiz0) zgz0Var;
        eiz0Var.setBanner(wfy0Var);
        eiz0Var.setListener(this);
    }

    public final void c(boolean z, int i, dhz0 dhz0Var) {
        RecyclerView.z createScroller;
        int i2 = this.c;
        miz0 miz0Var = this.b;
        zey0 zey0Var = miz0Var.a;
        CardsLayoutManagerS2 cardsLayoutManagerS2 = zey0Var.c;
        if (i2 >= cardsLayoutManagerS2.s() && i2 <= cardsLayoutManagerS2.w()) {
            if (z) {
                miz0Var.b.a(this.a, i, dhz0Var);
                return;
            }
            return;
        }
        n2z0 n2z0Var = zey0Var.d;
        if (i2 == -1) {
            n2z0Var.getClass();
            return;
        }
        RecyclerView recyclerView = n2z0Var.g;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || (createScroller = n2z0Var.createScroller(n2z0Var.g.getLayoutManager())) == null) {
            return;
        }
        createScroller.setTargetPosition(i2);
        n2z0Var.g.getLayoutManager().startSmoothScroll(createScroller);
    }
}
