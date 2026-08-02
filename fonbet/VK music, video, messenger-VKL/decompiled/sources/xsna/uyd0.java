package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import java.util.ArrayList;

/* compiled from: ProfileOverviewInfoItem.kt */
/* loaded from: classes5.dex */
public final class uyd0 extends we6 {
    public final int g;
    public final CharSequence h;
    public final boolean i;
    public final String j;
    public final Runnable k;
    public Runnable l;
    public final int m;
    public int n;
    public final ArrayList<String> o;

    /* compiled from: ProfileOverviewInfoItem.kt */
    public static class a extends vif0<uyd0> {
        @Override // xsna.vif0
        public final void i6(uyd0 uyd0Var) {
            uyd0 uyd0Var2 = uyd0Var;
            View view = this.itemView;
            VkMiniInfoCell vkMiniInfoCell = (VkMiniInfoCell) view;
            view.getContext();
            vkMiniInfoCell.setMode(VkMiniInfoCell.Mode.Base);
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(u11.f(tlo0.Companion, uyd0Var2.h), false, false, false, uyd0Var2.i, null, 46));
            vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(uyd0Var2.g), null, 6));
            vkMiniInfoCell.setTag(uyd0Var2.j);
        }
    }

    public uyd0(int i, CharSequence charSequence, String str, Runnable runnable, int i2) {
        boolean z = (i2 & 4) == 0;
        str = (i2 & 8) != 0 ? null : str;
        runnable = (i2 & 32) != 0 ? null : runnable;
        this.g = i;
        this.h = charSequence;
        this.i = z;
        this.j = str;
        this.k = null;
        this.l = runnable;
        this.m = -26;
        this.n = 0;
        this.o = new ArrayList<>();
    }

    @Override // xsna.we6
    public final vif0<uyd0> a(ViewGroup viewGroup) {
        VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(viewGroup.getContext(), null, 6);
        vkMiniInfoCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a aVar = new a(vkMiniInfoCell, viewGroup);
        aVar.itemView.setOnClickListener(new xz5(aVar, 13));
        return aVar;
    }

    @Override // xsna.we6
    public final int g() {
        return this.n;
    }

    @Override // xsna.we6
    public final int h() {
        return this.m;
    }

    @Override // xsna.we6
    public final void j(int i) {
        this.n = i;
    }
}
