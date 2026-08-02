package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: KeyboardRecyclerObserver.kt */
/* loaded from: classes16.dex */
public final class ygy extends RecyclerView.t {
    public boolean b;
    public com.vk.movika.sdk.base.model.e c;

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i != 0) {
            com.vk.movika.sdk.base.model.e eVar = this.c;
            if (eVar != null) {
                eVar.invoke();
            }
            recyclerView.removeOnScrollListener(this);
            this.c = null;
            this.b = false;
        }
    }
}
