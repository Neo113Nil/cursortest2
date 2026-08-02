package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.themes.AccentColor;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: AccentColorAdapter.kt */
/* loaded from: classes2.dex */
public final class vi extends RecyclerView.Adapter<xi> {
    public final ArrayList c;
    public int d;

    public vi(ArrayList arrayList) {
        this.c = arrayList;
        AccentColor a = ba3.a();
        this.d = arrayList.indexOf(a == null ? AccentColor.NOT_SET : a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(xi xiVar, int i) {
        xi xiVar2 = xiVar;
        AccentColor accentColor = (AccentColor) this.c.get(i);
        boolean z = this.d == i;
        xiVar2.n = accentColor;
        View view = xiVar2.m;
        awt0.u(view, z);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.accent_color_item_selected_stroke, R.attr.vk_legacy_accent, view);
        View view2 = xiVar2.l;
        view2.setContentDescription(view2.getContext().getString(accentColor.i()));
        if (accentColor == AccentColor.NOT_SET) {
            view2.setBackgroundResource(R.drawable.accent_color_rainbow);
            view2.setBackgroundTintList(null);
        } else {
            view2.setBackgroundResource(R.drawable.accent_color_item);
            view2.setBackgroundTintList(ColorStateList.valueOf(dhr0.t.c(accentColor.h())));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final xi onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new xi(tf3.b(viewGroup, R.layout.accent_color_item, viewGroup, false), new ui(1, this, vi.class, "changeAccentColor", "changeAccentColor(Lcom/vk/im/ui/themes/AccentColor;)V", 0, 0));
    }
}
