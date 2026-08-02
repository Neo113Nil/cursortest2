package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import com.vkontakte.android.R;

/* compiled from: ProfileTabOptionAdapter.kt */
/* loaded from: classes5.dex */
public final class yzd0 extends zoj0<ProfileTabOptions, dvd0> {
    public final b140 e;

    public yzd0(b140 b140Var) {
        this.e = b140Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((dvd0) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new dvd0(tf3.b(viewGroup, R.layout.item_profile_tab_option, viewGroup, false), this.e);
    }
}
