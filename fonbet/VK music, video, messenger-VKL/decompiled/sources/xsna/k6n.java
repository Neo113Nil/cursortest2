package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.tool.view.FlowLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DiscoverPreviewTagsProvider.kt */
/* loaded from: classes4.dex */
public final class k6n implements fan {
    public static final int b = cn70.b(6);
    public final r1o0 a;

    public k6n(List<ean> list) {
        r1o0 r1o0Var = new r1o0(0);
        ArrayList<ean> arrayList = r1o0Var.c;
        arrayList.clear();
        List<ean> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        this.a = r1o0Var;
    }

    @Override // xsna.fan
    public final View a(int i, FlowLayout flowLayout) {
        r1o0 r1o0Var = this.a;
        vif0<String> createViewHolder = r1o0Var.createViewHolder(flowLayout, r1o0Var.getItemViewType(i));
        ViewGroup.LayoutParams layoutParams = createViewHolder.itemView.getLayoutParams();
        FlowLayout.a aVar = layoutParams instanceof FlowLayout.a ? (FlowLayout.a) layoutParams : null;
        if (aVar == null) {
            int i2 = b;
            aVar = new FlowLayout.a(i2, i2);
        }
        createViewHolder.itemView.setLayoutParams(aVar);
        if (createViewHolder instanceof m0o0) {
            r1o0Var.bindViewHolder(createViewHolder, i);
        }
        return createViewHolder.itemView;
    }

    @Override // xsna.fan
    public final int getTagsCount() {
        return this.a.c.size();
    }
}
