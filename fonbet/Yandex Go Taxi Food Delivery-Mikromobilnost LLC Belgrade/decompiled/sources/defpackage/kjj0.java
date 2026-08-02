package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes6.dex */
public final class kjj0 extends RecyclerView.Adapter {
    public final ybf a;
    public List b = EmptyList.a;

    public kjj0(ybf ybfVar) {
        this.a = ybfVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((AppCompatImageView) ((sf70) x0Var).N.c).setImageBitmap(((u58) this.b.get(i)).b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(lrh0.option_item_view, viewGroup, false);
        if (inflate == null) {
            ny61.t("rootView");
            return null;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate;
        sf70 sf70Var = new sf70(new nzm(appCompatImageView, 6, appCompatImageView));
        ybf ybfVar = this.a;
        View view = sf70Var.a;
        c.z(ybfVar, view);
        view.setContentDescription(view.getContext().getString(kyh0.summary_accessibility_tariff_details));
        return sf70Var;
    }
}
