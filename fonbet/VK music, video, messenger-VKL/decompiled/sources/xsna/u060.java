package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import xsna.lnt0;

/* compiled from: NestedListAutoPlayProvider.kt */
/* loaded from: classes2.dex */
public final class u060 implements lnt0 {
    public final ai5 b;
    public final db80 c;
    public boolean d;

    public u060(ai5 ai5Var, db80 db80Var) {
        this.b = ai5Var;
        this.c = db80Var;
    }

    @Override // xsna.lnt0
    public final RecyclerView getRecyclerView() {
        return this.b.getRecyclerView();
    }

    @Override // xsna.dnt0
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return this.b.getVideoAutoPlayDelayType();
    }

    @Override // xsna.dnt0
    public final boolean getVideoFocused() {
        return this.d;
    }

    @Override // xsna.lnt0
    public final xh5 i() {
        int v;
        ai5 ai5Var = this.b;
        RecyclerView recyclerView = ai5Var.getRecyclerView();
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (v = linearLayoutManager.v()) == -1) {
            return null;
        }
        return this.c.b(ai5Var, v, Math.abs(linearLayoutManager.x() - v) + 1);
    }

    @Override // xsna.dnt0
    public final void setVideoFocused(boolean z) {
        this.d = z;
    }

    @Override // xsna.lnt0
    public final lnt0.a y4() {
        lnt0.a aVar;
        RecyclerView.e0 d;
        xh5 i = i();
        boolean z = false;
        int adapterPosition = (i == null || (d = i.d()) == null) ? 0 : d.getAdapterPosition();
        ai5 ai5Var = this.b;
        int adapterOffset = adapterPosition - ai5Var.getAdapterOffset();
        dnt0 b = i != null ? i.b() : null;
        if (b != null && b.getVideoFocused()) {
            z = true;
        }
        int i2 = adapterOffset + 1;
        int i3 = adapterOffset + 6;
        if (i2 <= i3) {
            while (true) {
                y9t0 Eh = ai5Var.Eh(i2);
                yg5 yg5Var = Eh != null ? Eh.a : null;
                if (yg5Var == null) {
                    if (i2 == i3) {
                        break;
                    }
                    i2++;
                } else {
                    y9t0 Eh2 = ai5Var.Eh(i2);
                    if (Eh2 != null) {
                        ni5 ni5Var = Eh2.b;
                        yg5.o0(yg5Var, ni5Var.a, ni5Var.b, ni5Var.c, false, 8);
                    }
                    aVar = new lnt0.a(yg5Var, i2);
                }
            }
            if (!z || adapterOffset > 0) {
                return aVar;
            }
            return null;
        }
        aVar = null;
        if (z) {
        }
        return aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u060(ai5 ai5Var) {
        this(ai5Var, new ddh0(3));
        tev tevVar = tev.a;
    }
}
