package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.InterfaceC4319fe;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView;
import com.vkontakte.android.R;
import xsna.am;
import xsna.g2n;

/* compiled from: DiscoverMediaAdapter.kt */
/* loaded from: classes4.dex */
public final class o2n extends zoj0<u1c0, uc6<?>> {
    public final m2c0 e;
    public final h170 f;
    public final g2n g = new g2n();
    public p580 h;

    public o2n(m2c0 m2c0Var, h170 h170Var) {
        this.e = m2c0Var;
        this.f = h170Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        u1c0 u1c0Var = (u1c0) this.c.c(i);
        if (u1c0Var != null) {
            return u1c0Var.c;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        uc6 uc6Var = (uc6) e0Var;
        uc6Var.H = this.h;
        u1c0 u1c0Var = (u1c0) this.c.c(i);
        if (u1c0Var != null) {
            uc6Var.a6(u1c0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.g.getClass();
        m2c0 m2c0Var = this.e;
        h170 h170Var = this.f;
        switch (i) {
            case InterfaceC4319fe.a.c /* 1202 */:
                return new y5t0(viewGroup, m2c0Var);
            case InterfaceC4319fe.a.g /* 1203 */:
                return new xdo0(viewGroup, m2c0Var);
            case 1204:
                return new lh7(viewGroup);
            case 1205:
                qh7 qh7Var = new qh7(tf3.b(viewGroup, R.layout.blurred_discover_grid_item_v2, viewGroup, false), viewGroup);
                am.a aVar = am.a.e;
                String string = qh7Var.itemView.getContext().getString(R.string.accessibility_discover_media_go);
                RestrictedBlurredPhotoView restrictedBlurredPhotoView = qh7Var.I;
                iut0.o(restrictedBlurredPhotoView, aVar, string, null);
                iut0.o(restrictedBlurredPhotoView, am.a.f, qh7Var.itemView.getContext().getString(R.string.accessibility_discover_media_open_menu), null);
                return qh7Var;
            case InterfaceC4319fe.a.e /* 1206 */:
                return new fmp(viewGroup, m2c0Var, h170Var);
            case 1207:
                return new hmp(viewGroup, m2c0Var, h170Var);
            case 1208:
                return new aah(viewGroup);
            case 1209:
                return new bah(viewGroup);
            case InterfaceC4319fe.a.j /* 1210 */:
                return new cah(viewGroup);
            default:
                return new g2n.a(new View(viewGroup.getContext()), viewGroup);
        }
    }
}
