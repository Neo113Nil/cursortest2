package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vkontakte.android.R;

/* compiled from: AlbumDetailsControls.kt */
/* loaded from: classes4.dex */
public final class ef1 extends androidx.recyclerview.widget.x<k.c.a, af1> {
    public final AlbumDetailsFragment c;

    public ef1(AlbumDetailsFragment albumDetailsFragment) {
        super(new tqj());
        this.c = albumDetailsFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((af1) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new af1(tf3.b(viewGroup, R.layout.album_details_controls_holder, viewGroup, false), this.c);
    }
}
