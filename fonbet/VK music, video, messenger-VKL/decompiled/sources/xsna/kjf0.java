package xsna;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;
import java.util.List;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: RecyclerSectionAdapter.java */
/* loaded from: classes7.dex */
public abstract class kjf0 extends UsableRecyclerView.c<vif0> implements mf7 {
    public List<a> c;
    public final SettingsListFragment d;

    /* compiled from: RecyclerSectionAdapter.java */
    public static class a {
        public final int a;
        public final Object b;
        public int c;

        public a(int i, Object obj, int i2) {
            this.a = i;
            this.b = obj;
            this.c = i2;
        }

        public static a a(int i, Object obj) {
            return new a(i, obj, 1);
        }

        public static a b(int i, Object obj) {
            return new a(i, obj, 2);
        }

        public static a c(int i, Object obj) {
            return new a(i, obj, 6);
        }
    }

    public kjf0() {
        this.c = new ArrayList();
        this.d = null;
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        return x0().get(i).c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return x0().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return x0().get(i).a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull RecyclerView.e0 e0Var) {
        ((vif0) e0Var).l6();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@NonNull RecyclerView.e0 e0Var) {
        ((vif0) e0Var).m6();
    }

    public final List<a> x0() {
        SettingsListFragment settingsListFragment = this.d;
        return settingsListFragment == null ? this.c : settingsListFragment.v0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(int i, vif0 vif0Var) {
        vif0Var.V5(x0().get(i).b);
    }

    public kjf0(SettingsListFragment settingsListFragment) {
        this.c = new ArrayList();
        this.d = settingsListFragment;
    }
}
