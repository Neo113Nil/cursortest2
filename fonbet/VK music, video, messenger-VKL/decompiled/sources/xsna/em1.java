package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.photo.PhotoAlbum;

/* compiled from: AlbumsAdapter.kt */
/* loaded from: classes4.dex */
public final class em1 extends zoj0<PhotoAlbum, pl1> implements nd90<PhotoAlbum> {
    public final el1 e;
    public final boolean f;
    public final izs<PhotoAlbum, s3q0> g;

    /* JADX WARN: Multi-variable type inference failed */
    public em1(el1 el1Var, boolean z, izs<? super PhotoAlbum, s3q0> izsVar) {
        this.e = el1Var;
        this.f = z;
        this.g = izsVar;
    }

    public final void R(int i) {
        C0(new bm1(i, 0));
    }

    public final void U(int i, String str) {
        H0(new xl1(i, 0), new zl1(str, 0));
    }

    public final void X(PhotoAlbum photoAlbum) {
        H0(new com.vk.movika.sdk.base.observable.g(photoAlbum, 3), new vl1(photoAlbum, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((pl1) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new pl1(viewGroup, this.f, this.e, this.g);
    }
}
