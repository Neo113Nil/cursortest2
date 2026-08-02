package xsna;

import com.vk.lists.c;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PostingAttachGalleryPresenter.kt */
/* loaded from: classes15.dex */
public final class ccc0 implements c.l<List<? extends MediaStoreEntry>> {
    public final /* synthetic */ dcc0 b;

    public ccc0(dcc0 dcc0Var) {
        this.b = dcc0Var;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<List<MediaStoreEntry>> hj(com.vk.lists.c cVar, boolean z) {
        AlbumEntry albumEntry = (AlbumEntry) j5g.b0(this.b.j, this.b.k);
        if (albumEntry == null) {
            return io.reactivex.rxjava3.core.q.T(EmptyList.b);
        }
        dcc0 dcc0Var = this.b;
        return dcc0Var.n.e(dcc0Var.l, albumEntry, 0, cVar.k()).w();
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<List<? extends MediaStoreEntry>> ui(int i, com.vk.lists.c cVar) {
        AlbumEntry albumEntry = (AlbumEntry) j5g.b0(this.b.j, this.b.k);
        if (albumEntry == null) {
            return io.reactivex.rxjava3.core.q.T(EmptyList.b);
        }
        dcc0 dcc0Var = this.b;
        return dcc0Var.n.e(dcc0Var.l, albumEntry, i, cVar.k()).w();
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<List<MediaStoreEntry>> qVar, boolean z, com.vk.lists.c cVar) {
        dcc0 dcc0Var = this.b;
        dcc0Var.b.eo(qVar.subscribe(new gl30(new ii3(dcc0Var, z, cVar), 14), new afs(new bqt(19), 18)));
    }
}
