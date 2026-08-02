package xsna;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.ui.widget.MenuListView;
import java.util.WeakHashMap;

/* compiled from: MenuListView.java */
/* loaded from: classes7.dex */
public final class y720 extends RecyclerView.t {
    public final /* synthetic */ MenuListView b;

    public y720(MenuListView menuListView) {
        this.b = menuListView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        int i3;
        int v = ((LinearLayoutManager) recyclerView.getLayoutManager()).v();
        MenuListView menuListView = this.b;
        if (v == 0) {
            i3 = 0;
            if (menuListView.d.getChildAt(0).getTop() < 0) {
                WeakHashMap weakHashMap = j6r0.a;
                i3 = (int) (Math.min(1.0f, (-r1) / iah0.a(20.0f)) * 255.0f);
            }
        } else {
            i3 = 255;
        }
        menuListView.v.getBackground().setAlpha(i3);
    }
}
