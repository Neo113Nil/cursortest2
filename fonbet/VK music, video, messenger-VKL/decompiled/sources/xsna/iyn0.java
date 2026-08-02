package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;

/* compiled from: TabsRecycler.kt */
/* loaded from: classes.dex */
public final class iyn0 extends RecyclerView.r {
    public final /* synthetic */ TabsRecycler a;

    public iyn0(TabsRecycler tabsRecycler) {
        this.a = tabsRecycler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final boolean onFling(int i, int i2) {
        this.a.getTabSnapHelper$ui_release().h(i);
        return true;
    }
}
