package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: AlbumDetailsSkeleton.kt */
/* loaded from: classes4.dex */
public final class ai1 extends androidx.recyclerview.widget.x<yxj0, pyj0> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((pyj0) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new pyj0(tf3.b(viewGroup, R.layout.album_details_skeleton_holder, viewGroup, false));
    }
}
