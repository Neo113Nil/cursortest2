package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vkontakte.android.R;

/* compiled from: AlbumDetailsHeader.kt */
/* loaded from: classes4.dex */
public final class bh1 extends androidx.recyclerview.widget.x<k.b, ywu> implements vic {
    public final AlbumDetailsFragment c;

    public bh1(AlbumDetailsFragment albumDetailsFragment) {
        super(new nwu());
        this.c = albumDetailsFragment;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        submitList(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((ywu) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ywu(tf3.b(viewGroup, R.layout.album_details_header_holder, viewGroup, false), this.c);
    }
}
