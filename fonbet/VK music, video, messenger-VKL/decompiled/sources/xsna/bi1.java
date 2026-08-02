package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: AlbumDetailsStubPhoto.kt */
/* loaded from: classes4.dex */
public final class bi1 extends androidx.recyclerview.widget.x<s3q0, jsm0> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((jsm0) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new jsm0(tf3.b(viewGroup, R.layout.album_details_photo_stub_item, viewGroup, false));
    }
}
