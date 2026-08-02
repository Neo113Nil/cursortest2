package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.photo.PhotoAlbum;
import com.vkontakte.android.R;

/* compiled from: AlbumSettingsAdapter.kt */
/* loaded from: classes4.dex */
public final class pk1 extends zoj0<PhotoAlbum, ql1> {
    public final kdg0 e;
    public final mq1 f;
    public final lb g;

    public pk1(kdg0 kdg0Var, mq1 mq1Var, lb lbVar) {
        this.e = kdg0Var;
        this.f = mq1Var;
        this.g = lbVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((ql1) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ql1(tf3.b(viewGroup, R.layout.albums_settings_page_album_item, viewGroup, false), this.e, this.f, this.g);
    }
}
