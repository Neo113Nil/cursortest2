package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositeCatalogUiViewTracker.kt */
/* loaded from: classes16.dex */
public final class rsi extends vha {
    public final List<vha> f;

    /* JADX WARN: Multi-variable type inference failed */
    public rsi(List<? extends vha> list) {
        super((s1v) null, (dha) null, 7);
        this.f = list;
    }

    @Override // xsna.vha
    public final void q() {
        Iterator<T> it = this.f.iterator();
        while (it.hasNext()) {
            ((vha) it.next()).q();
        }
    }

    @Override // xsna.vha
    public final void r(List<? extends UIBlock> list) {
        Iterator<T> it = this.f.iterator();
        while (it.hasNext()) {
            ((vha) it.next()).r(list);
        }
    }

    @Override // xsna.vha
    public final void s(RecyclerView recyclerView) {
        Iterator<T> it = this.f.iterator();
        while (it.hasNext()) {
            ((vha) it.next()).s(recyclerView);
        }
    }

    @Override // xsna.vha
    public final void t(boolean z) {
        Iterator<T> it = this.f.iterator();
        while (it.hasNext()) {
            ((vha) it.next()).t(z);
        }
    }

    public rsi(vha... vhaVarArr) {
        this((List<? extends vha>) Arrays.asList(vhaVarArr));
    }
}
