package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: AlbumDetailsFooter.kt */
/* loaded from: classes4.dex */
public final class mg1 extends androidx.recyclerview.widget.x<e6s, o6s> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((o6s) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new o6s(tf3.b(viewGroup, R.layout.album_details_footer_holder, viewGroup, false));
    }
}
