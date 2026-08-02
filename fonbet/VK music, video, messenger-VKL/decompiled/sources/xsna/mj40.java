package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MusicDynamicGridAdapter.kt */
/* loaded from: classes16.dex */
public final class mj40 extends zoj0<UIBlock, pj40> {
    public final w69 e;

    public mj40(w69 w69Var) {
        this.e = w69Var;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        pj40 pj40Var = (pj40) e0Var;
        UIBlockLink uIBlockLink = (UIBlockLink) ((ArrayList) y0()).get(i);
        ComposeView composeView = pj40Var.l;
        CatalogLink catalogLink = uIBlockLink.y;
        String str = catalogLink.c;
        ArrayList arrayList = catalogLink.f.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((ImageSize) it.next());
        }
        tpo tpoVar = new tpo(str, arrayList2);
        composeView.setOnClickListener(pj40Var.m.invoke(composeView, uIBlockLink));
        composeView.setContent(new jai(-1773817326, new v9q(i, tpoVar), true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new pj40(new ComposeView(viewGroup.getContext(), null, 6), this.e);
    }
}
