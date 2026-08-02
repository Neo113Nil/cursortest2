package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;

/* compiled from: CollageFormatsAdapter.kt */
/* loaded from: classes4.dex */
public final class u0g extends androidx.recyclerview.widget.x<z2g, t0g> {
    public lwh c;

    public u0g() {
        super(s0g.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        t0g t0gVar = (t0g) e0Var;
        z2g item = getItem(i);
        ToolButton toolButton = t0gVar.l;
        jbo0 jbo0Var = item.a;
        toolButton.setTitle(jbo0Var.a(toolButton.getContext()));
        toolButton.setIcon(item.b);
        toolButton.setSelected(item.d);
        toolButton.setOnClick(new z2e(t0gVar, i, 1));
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(jbo0Var.a(toolButton.getContext()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new t0g((ToolButton) tf3.b(viewGroup, R.layout.item_collage, viewGroup, false), new gy(1, this, u0g.class, "onItemClick", "onItemClick(I)V", 0, 10));
    }
}
