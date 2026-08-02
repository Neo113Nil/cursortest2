package xsna;

import androidx.recyclerview.widget.RecyclerView;
import xsna.dga0;

/* compiled from: AlbumDetailsMviView.kt */
/* loaded from: classes4.dex */
public final class jh1 implements dga0.a {
    public int a;
    public final /* synthetic */ com.vk.photos.root.albumdetails.presentation.c b;

    public jh1(com.vk.photos.root.albumdetails.presentation.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.dga0.a
    public final boolean a(int i, RecyclerView.a0 a0Var) {
        return i >= this.a;
    }

    @Override // xsna.dga0.a
    public final int b(int i) {
        return i - this.a;
    }

    @Override // xsna.dga0.a
    public final int c(RecyclerView.a0 a0Var) {
        return this.b.q.getItemCount();
    }
}
