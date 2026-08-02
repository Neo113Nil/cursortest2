package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.div.legacy.view.DivView;
import java.util.List;

/* loaded from: classes11.dex */
public final class h57 extends RecyclerView.Adapter {
    public final DivView a;
    public final List b;
    public final /* synthetic */ i57 c;

    public h57(i57 i57Var, DivView divView, List list) {
        this.c = i57Var;
        this.a = divView;
        this.b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        rhk rhkVar = (rhk) this.b.get(i);
        return (xdb1.e(rhkVar.w) || !xdb1.d(rhkVar.c)) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        g57 g57Var = (g57) x0Var;
        rhk rhkVar = (rhk) this.b.get(i);
        i57 i57Var = g57Var.O;
        DivView divView = g57Var.N;
        View view = g57Var.a;
        i57Var.h(divView, view, rhkVar);
        i57Var.g(divView, view, rhkVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        i57 i57Var = this.c;
        return new g57(i57Var, this.a, i57Var.b.b(i == 0 ? "ButtonsDivBlockViewBuilder.TEXT_BUTTON" : "ButtonsDivBlockViewBuilder.IMAGE_BUTTON"));
    }
}
