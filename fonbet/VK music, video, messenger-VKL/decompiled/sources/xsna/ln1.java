package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.jm1;
import xsna.kn1;

/* compiled from: AlbumsItemAdapter.kt */
/* loaded from: classes4.dex */
public final class ln1 extends androidx.recyclerview.widget.x<kn1, nn1> implements vic {
    public final ze1 c;
    public final kdg0 d;
    public final el1 e;
    public final jm1.a f;

    public ln1(ze1 ze1Var, kdg0 kdg0Var, el1 el1Var, ux0 ux0Var) {
        super(mn1.a);
        this.c = ze1Var;
        this.d = kdg0Var;
        this.e = el1Var;
        this.f = ux0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        kn1 item = getItem(i);
        if (item instanceof kn1.c) {
            return R.layout.albums_system_block_item;
        }
        if (item instanceof kn1.a) {
            return R.layout.album_page_album_item;
        }
        if (item instanceof kn1.b) {
            return R.layout.albums_empty_view_owner;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((nn1) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, i, viewGroup, false);
        if (i == R.layout.albums_system_block_item) {
            return new wpn0(b, this.c, this.d, this.e);
        }
        if (i == R.layout.album_page_album_item) {
            return new ji1(b, this.c, this.d, this.e, cn70.a() * 12.0f);
        }
        if (i != R.layout.albums_empty_view_owner) {
            throw new IllegalStateException("Unsupported view type");
        }
        jm1 jm1Var = new jm1(viewGroup.getContext());
        jm1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = jm1Var.getContext();
        HashSet hashSet = iah0.a;
        f4m.a(jm1Var, new yb3(jm1Var, fnj.d(context) ? null : new im0(jm1Var, 1), jm1Var, 8));
        jm1Var.setAddAlbumListener(this.f);
        return new qgp(jm1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        ((nn1) e0Var).W5(getItem(i), list);
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
    }
}
