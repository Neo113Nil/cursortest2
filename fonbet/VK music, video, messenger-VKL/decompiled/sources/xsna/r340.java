package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.znn0;

/* compiled from: MultiAccountSwitcherLoadingAdapter.kt */
/* loaded from: classes6.dex */
public final class r340 extends androidx.recyclerview.widget.x<znn0, RecyclerView.e0> {
    public static final a c = new a();

    /* compiled from: MultiAccountSwitcherLoadingAdapter.kt */
    public static final class a extends m.e<znn0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(znn0 znn0Var, znn0 znn0Var2) {
            znn0 znn0Var3 = znn0Var;
            znn0 znn0Var4 = znn0Var2;
            return ((znn0Var3 instanceof znn0.b) && (znn0Var4 instanceof znn0.b)) ? epx.f(((znn0.b) znn0Var3).a, ((znn0.b) znn0Var4).a) : qjg.a(znn0Var3).equals(qjg.a(znn0Var4));
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(znn0 znn0Var, znn0 znn0Var2) {
            return qjg.a(znn0Var).equals(qjg.a(znn0Var2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        znn0 item = getItem(i);
        if (item instanceof znn0.c) {
            return 1;
        }
        if (item instanceof znn0.a) {
            return 0;
        }
        if (item instanceof znn0.b) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        znn0 item = getItem(i);
        if (e0Var instanceof c240) {
            hpt0.i(((znn0.b) item).a, null, ((c240) e0Var).itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new t340(tf3.b(viewGroup, R.layout.vk_auth_ecosystem_switcher_loading_item, viewGroup, false));
        }
        if (i == 1) {
            return new s340(tf3.b(viewGroup, R.layout.vk_auth_ecosystem_switcher_header_loading_item, viewGroup, false));
        }
        if (i != 2) {
            throw new IllegalStateException(lhg.a(i, "Unknown viewType = "));
        }
        View b = tf3.b(viewGroup, R.layout.vk_auth_ecosystem_profile_loading_layout, viewGroup, false);
        f4m.y(iah0.a(16), b);
        return new c240(b);
    }
}
