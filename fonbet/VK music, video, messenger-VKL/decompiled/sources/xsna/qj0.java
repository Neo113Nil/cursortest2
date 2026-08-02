package xsna;

import androidx.recyclerview.widget.RecyclerView;
import xsna.qgh0;

/* compiled from: AdapterExt.kt */
/* loaded from: classes17.dex */
public final class qj0 {
    public static final void a(RecyclerView.Adapter adapter, RecyclerView recyclerView, qgh0.a aVar) {
        adapter.registerAdapterDataObserver(new tgh0(recyclerView, aVar));
    }
}
