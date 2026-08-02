package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.vk.catalog2.common.ui.mvp.holder.container.GridListVh;

/* compiled from: MusicCatalogItemTouchHelperCallback.kt */
/* loaded from: classes16.dex */
public final class ed40 extends y7a {
    @Override // xsna.y7a, androidx.recyclerview.widget.r.d
    public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        tca tcaVar = e0Var instanceof tca ? (tca) e0Var : null;
        return (tcaVar != null ? tcaVar.l : null) instanceof GridListVh ? r.d.l(0, 0) : super.f(recyclerView, e0Var);
    }
}
