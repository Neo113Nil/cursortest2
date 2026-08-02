package defpackage;

import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.taxi.order.chat.ui.chat.b;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class hs10 extends RecyclerView.Adapter {
    public final gs10 a;
    public final c3y0 b;
    public final x5s0 c;
    public final pav w;
    public final e3y0 x;
    public List y = EmptyList.a;
    public int z;

    public hs10(gs10 gs10Var, Resources resources, c3y0 c3y0Var, x5s0 x5s0Var, pav pavVar, rs2 rs2Var) {
        this.a = gs10Var;
        this.b = c3y0Var;
        this.c = x5s0Var;
        this.w = pavVar;
        this.x = new e3y0(resources.getDimensionPixelSize(vug0.map_image_message_height), rs2Var);
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((jv10) this.y.get(i)).a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((jv10) this.y.get(i)).b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((b) x0Var).W((jv10) this.y.get(i), this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == jv10.x || i == jv10.z || i == jv10.A) {
            return new g3y0(oo31.f(viewGroup, i, viewGroup, false), this.z);
        }
        if (i == jv10.B) {
            return new h3y0(oo31.f(viewGroup, i, viewGroup, false), this.z);
        }
        if (i == jv10.y || i == jv10.C) {
            return new f3y0(oo31.f(viewGroup, i, viewGroup, false), this.w);
        }
        ny61.r("Unknown message type");
        return null;
    }
}
