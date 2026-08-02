package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: AlbumDetailsPhoto.kt */
/* loaded from: classes4.dex */
public final class ph1 extends androidx.recyclerview.widget.x<k.c.C1491c, aaa0> {
    public final AlbumDetailsFragment c;
    public final kdg0 d;
    public final eha0 e;

    public ph1(AlbumDetailsFragment albumDetailsFragment, kdg0 kdg0Var, eha0 eha0Var) {
        super(new qh1());
        this.c = albumDetailsFragment;
        this.d = kdg0Var;
        this.e = eha0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((aaa0) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new aaa0(tf3.b(viewGroup, R.layout.album_details_photo_item, viewGroup, false), this.c, this.d, this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        ((aaa0) e0Var).W5(getItem(i), list);
    }
}
